package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.impl.DungeonImpl;
import generator.impl.RoomAccessImpl;
import generator.impl.RoomImpl;
import managers.EducationElementsManager;
import managers.GridManager;
import managers.ModelsManager;
import structures.Coordinate;
import structures.NeighborAccess;
import structures.LabyrinthineRoom;
import structures.LinearRoom;
import structures.LinearRoomOrientations;
import structures.TaskFactPair;

public class DungeonGenerator {
	private Dungeon generatedDungeon; 
	private ModelsManager modelAccess;
	
	
	/** Attribute to generate random elements */
	private Random random;
	
	private GridManager gridManager;
	private EducationElementsManager eeManager; 
	
	private double nbRooms;
	
	private DungeonGenerator(ModelsManager modelAccess) {
		this.modelAccess = modelAccess;
		generatedDungeon = new DungeonImpl();
		random = new Random();
		gridManager = new GridManager(modelAccess);	
	}
	
	public DungeonGenerator(ModelsManager modelAccess, EducationElementsManager eeManager, double nbRooms) {
		this(modelAccess); 		
		this.eeManager = eeManager;
		this.nbRooms = nbRooms;
	}
	
	public Dungeon generateDungeon() {
		if(modelAccess.context.getGamecontext().getMode().equals(DungeonMode.LINEAR)) {
			generateLinearDungeon();
		}else {
			generateLabyrinthineDungeon();
		}
		generatedDungeon.setLearningobjective(eeManager.getObjective());
		generatedDungeon.setLevel(eeManager.getLevel());
		return generatedDungeon;
	}
	
	/* ****************************************** */
	/*  LABYRINTHINE DUNGEON GENERATIION METHODS  */
	/* ****************************************** */
	
	private void generateLabyrinthineDungeon() {
		System.out.println("Labyrinthe");
		List<LabyrinthineRoom> dungeonRooms = new ArrayList<>();
		
		Room originRoom = createEntryRoomLabyrinthine();
		dungeonRooms.add(new LabyrinthineRoom(originRoom));
		
		List<TaskFactPair> factsToQuestion = eeManager.getFactsToQuestion();
				
		while(dungeonRooms.size() < nbRooms + 1) {
			LabyrinthineRoom randomStartingRoom = chooseEntryRoomForNewPathIn(dungeonRooms);
			LabyrinthineRoom aRoom = createNewRoomFrom(randomStartingRoom, factsToQuestion.get(dungeonRooms.size() - 1));
			if(aRoom != null) {
				dungeonRooms.add(aRoom);
				createNewPath(randomStartingRoom);
			}
		}	
		
		for (LabyrinthineRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	private void createNewPath(LabyrinthineRoom originRoom) {
		List<NeighborAccess> neighbors = gridManager.getNeighbors(originRoom.getRoomCoordinates(), originRoom.isRoomTypeSmall());
		for (NeighborAccess neighbor : neighbors) {
			if(!originRoom.hasRoomAccessWith(neighbor.getRoom())) {
				RoomAccess raOrigin = new RoomAccessImpl();
				raOrigin.setDirection(neighbor.getAccessDirectionToNeighbor());
				RoomAccess raOther = new RoomAccessImpl();
				raOther.setDirection(neighbor.getNeighborAccessToYou());
				raOrigin.setOtherroomaccess(raOther);
				raOther.setOtherroomaccess(raOrigin);
				originRoom.getRoom().getRoomaccess().add(raOrigin);
				neighbor.addNeighborAccessRoomAccess(raOther);
				return;
			}
		}
	}
	
	private LabyrinthineRoom createNewRoomFrom(LabyrinthineRoom originRoom, TaskFactPair factsToQuestionByRoom) {
		Directions originRoomAvailableDirection = originRoom.getAvailableExit(gridManager);
		if(originRoomAvailableDirection.equals(Directions.NONE)) { return null; }
		Coordinate nextPosition = gridManager.getNextCoord(originRoom.getRoom(), originRoomAvailableDirection);
		Set<Directions> allowedDirections = gridManager.getAllowedNewRoomEntries(nextPosition, originRoomAvailableDirection);
		RoomType roomType = null;
		Directions entry = null;
		while(roomType == null && !allowedDirections.isEmpty()) {
			entry = chooseEntryDirection(allowedDirections);
			roomType = getCompatibleRoomType(entry, factsToQuestionByRoom == null? 0 : factsToQuestionByRoom.getNumberOfFacts()); 
			if(roomType == null) {
				allowedDirections.remove(entry);
			}
		}
		
		if(allowedDirections.isEmpty()) {
			return null; 
		}else {
			Coordinate validCoord = gridManager.getValidCoordinates(entry, nextPosition);
			createOriginRoomExitAccess(originRoom, originRoomAvailableDirection);
			Room aRoom = createRoom(validCoord.getX(), validCoord.getY(), roomType, factsToQuestionByRoom, originRoom.getLastRoomAccess(), entry);
			return new LabyrinthineRoom(aRoom);
		}
	}
	
	private void createOriginRoomExitAccess(LabyrinthineRoom originRoom, Directions exitDirection) {
		RoomAccess ra = new RoomAccessImpl();
		ra.setDirection(exitDirection);
		originRoom.getRoom().getRoomaccess().add(ra);
	}
	
	private Directions chooseEntryDirection(Set<Directions> allowedDirections) {
		List<Directions> possibilities = allowedDirections.stream().collect(Collectors.toList());
		return possibilities.get(random.nextInt(possibilities.size()));
	}
	
	private LabyrinthineRoom chooseEntryRoomForNewPathIn(List<LabyrinthineRoom> rooms){
		if(rooms.size() == 1) {
			return rooms.get(0);
		} else {
			int rand = random.nextInt(rooms.size() - 1) + 1;
			return rooms.get(rand);
		}
	}

	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(Directions entry, int numberOfFact) {
		return getCompatibleRoomType(entry, Directions.NONE, numberOfFact);
	}
	
	private Room createEntryRoomLabyrinthine() {
		List<RoomType> rts = roomsWithOneDirection();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		return createRoom(0, 0, rt, null, null, null, Directions.NONE);
	}
	
	private Room createRoom(int x, int y, RoomType roomT, TaskFactPair factsToQuestion, RoomAccess previousRoomExitAccess,  Directions entryDirection) {
		return createRoom(x, y, roomT, factsToQuestion, previousRoomExitAccess, entryDirection, Directions.NONE);
	}
		
	/* ****************************************** */
	/*     LINEAR DUNGEON GENERATIION METHODS     */
	/* ****************************************** */
	
	private void generateLinearDungeon() {
		System.out.println("Linear");
		Stack<LinearRoom> dungeonRooms = new Stack<>();
		Stack<LinearRoomOrientations> eligibleRoomsOrientations = new Stack<>();
		
		Room originRoom = createEntryRoomLinear();
		dungeonRooms.add(new LinearRoom(originRoom, originRoom.getRoomaccess().get(0).getDirection()));
	
		boolean backtrack = false;
		Coordinate nextPosition = null;	
		List<TaskFactPair> factsToQuestion = eeManager.getFactsToQuestion();
	
		while(dungeonRooms.size() < nbRooms + 1) {
			nextPosition = gridManager.getNextCoord(dungeonRooms.lastElement().getRoom(), dungeonRooms.lastElement().getExit());
			if(!backtrack) {
				eligibleRoomsOrientations.add(gridManager.getAllowedDirections(nextPosition, dungeonRooms.lastElement().getExit())); 
			}
			if(!eligibleRoomsOrientations.lastElement().hasEligibleOrientation()) {
				System.out.println("\t Backtrack");
				backtrack = true;
				eligibleRoomsOrientations.pop();
				LinearRoom r = dungeonRooms.pop();
				eligibleRoomsOrientations.lastElement().removeExitForEntry(r.getEntry(), r.getExit());
				/*for (Directions dir : new ArrayList<>(eligibleRoomOrientations.lastElement().keySet())) {
					eligibleRoomOrientations.lastElement().get(dir).remove(r.getExit());
					if(eligibleRoomOrientations.lastElement().get(dir).isEmpty()) {
						eligibleRoomOrientations.lastElement().remove(dir);
					}
				}*/
			}else {
				backtrack = false;
				LinearRoom aRoom = createNewRoomFrom(eligibleRoomsOrientations.lastElement(), nextPosition, factsToQuestion.get(dungeonRooms.size() - 1), 
						dungeonRooms.lastElement().getLastRoomAccess(), dungeonRooms.size() == nbRooms);
				dungeonRooms.add(aRoom);
			}
		}
		
		for (LinearRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	private LinearRoom createNewRoomFrom(LinearRoomOrientations eligibleRoomOrientations, Coordinate nextPosition, TaskFactPair factsToQuestionByRoom, RoomAccess originRoomAccess, boolean isLastRoom) {
		Directions entry = null; 
		Directions exit = null;
		RoomType roomType = null;
		while(roomType == null) {
			entry = chooseEntryDirection(eligibleRoomOrientations);
			if(!isLastRoom) {
				exit = chooseExitDirection(eligibleRoomOrientations, entry);
			}else {
				exit = Directions.NONE;
			}
			roomType = getCompatibleRoomType(entry, exit, factsToQuestionByRoom == null? 0 : factsToQuestionByRoom.getNumberOfFacts()); 
		}
		Coordinate validCoord = gridManager.getValidCoordinates(entry, nextPosition);
		Room room = createRoom(validCoord.getX(), validCoord.getY(), roomType, factsToQuestionByRoom, originRoomAccess, entry, exit);
		return new LinearRoom(room, entry, exit);
	}
	
	private Directions chooseExitDirection(LinearRoomOrientations roomAllowedOrientations, Directions entry) {
		List<Directions> exits = roomAllowedOrientations.getAllowedExits(entry).stream().collect(Collectors.toList());
		if(exits.isEmpty()) { return Directions.NONE; }
		return exits.get(random.nextInt(exits.size())); 

	}
	
	/**
	 * In case of complex and simple entry direction, it prioritize small room 
	 * 3/5 chance of getting a small room, 2/5 chance of getting a large room 
	 * @param roomAllowedOrientations
	 * @return the chosen entry direction 
	 */
	private Directions chooseEntryDirection(LinearRoomOrientations roomAllowedOrientations) {
		List<Directions> possibleEntries = roomAllowedOrientations.eligibleEntries();
		// TODO : Heuristique de choix de petite salle ou grande
				
		/*if(possibleEntries.size() == 3) {
			Directions d = possibleEntries.stream().distinct().filter(simpleDirections::contains).collect(Collectors.toList()).get(0);
			possibleEntries.add(d);
			possibleEntries.add(d);
		}*/		
		return possibleEntries.get(random.nextInt(possibleEntries.size()));
	}
		
	/**
	 * Creates an entry room by selecting a RoomType that only as 1 direction/access
	 * @return an entry Room
	 */
	private Room createEntryRoomLinear() {
		List<RoomType> rts = roomsWithOneDirection();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		return createRoom(0, 0, rt, null, null, null, rt.getDirections().get(0));
	}
	
	/* ****************************************** */
	/*     COMMON DUNGEON GENERATIION METHODS     */
	/* ****************************************** */
	
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(Directions entry, Directions exit, int numberOfFact) {
		List<RoomType> roomTypes = new ArrayList<>(modelAccess.gameDescription.getRoomtypes().getRoomtypes());
		roomTypes = roomTypes.stream().filter(e -> e.getDirections().size() > 1).collect(Collectors.toList());
		
		for (RoomType roomType : new ArrayList<>(roomTypes)) {
			if(!roomType.getDirections().contains(entry) || (!exit.equals(Directions.NONE) && !roomType.getDirections().contains(exit) || (roomType.getPositions().size() < numberOfFact))) {
				roomTypes.remove(roomType);
			}
		}
		if(roomTypes.isEmpty()) {return null;}
		
		return roomTypes.get(random.nextInt(roomTypes.size())); 
	}

	/**
	 * Instanciate a Room with (X,Y) as coordinates, with the RoomType rt, with an entry direction as entryDirection and exit as exitDirection and set the access between previous and new room 
	 * @param x
	 * @param y
	 * @param roomT
	 * @param previousRoomExitAccess
	 * @param entryDirection
	 * @param exitDirection
	 * @return a Room
	 */ // TODO : S'occuper des positions des QUESTIONS 
	private Room createRoom(int x, int y, RoomType roomT, TaskFactPair factsToQuestion, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection) {
		Room r = new RoomImpl();
		r.setRoomtype(roomT);
		r.setX(x);
		r.setY(y);
		
		if(factsToQuestion != null) {
			/*for (QuestionedFact questionedFact : factsToQuestion.getFacts()) {
				Position p = null;
				questionedFact.setPosition(p);
			}*/
			r.getQuestionedFacts().addAll(factsToQuestion.getFacts());
			r.setTask(factsToQuestion.getTask());
		}
				
		RoomAccess ra = new RoomAccessImpl();
		if(entryDirection != null) {
			ra.setOtherroomaccess(previousRoomExitAccess);
			ra.setDirection(entryDirection);
			previousRoomExitAccess.setOtherroomaccess(ra);
			r.getRoomaccess().add(ra);
		}
		if(!exitDirection.equals(Directions.NONE)) {
			ra = new RoomAccessImpl();
			ra.setDirection(exitDirection);
			r.getRoomaccess().add(ra);
		}
		
		gridManager.addOccupiedCoordinates(r);
		return r;
	}
	
	/**
	 * Get the RoomTypes with one access/direction only
	 * @return valid RoomTypes
	 */
	private List<RoomType> roomsWithOneDirection() {
		List<RoomType> rts = new ArrayList<>();
		for (RoomType rt : modelAccess.gameDescription.getRoomtypes().getRoomtypes()) {
			if(rt.getDirections().size() == 1) {
				rts.add(rt);
			}
		}
		return rts;
	}
	
	/* ****************************************** */
	/*       DEBUG DUNGEON PRINTING METHODS       */
	/* ****************************************** */
	
	private void printRoom(Room r) {
		System.out.println("****");
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("****");
	}
	
	public void printDungeon() {
		System.out.println("---- Dungeon -----");
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
		}
	}
}
