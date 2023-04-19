package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import generator.APosition;
import generator.Component;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.ElementSize;
import generator.GPElementType;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.Structure;
import generator.impl.DungeonImpl;
import generator.impl.RoomAccessImpl;
import generator.impl.RoomImpl;
import managers.GridManager;
import managers.ModelsManager;
import structures.Coordinate;
import structures.DungeonElements;
import structures.LabyrinthineRoom;
import structures.LinearRoom;
import structures.LinearRoomOrientations;
import structures.NeighborAccess;
import structures.RoomElements;

public class DungeonGenerator {
	private Dungeon generatedDungeon; 
	private ModelsManager modelAccess;
	
	
	/** Attribute to generate random elements */
	private Random random;
	
	private GridManager gridManager;
	private DungeonElements dungeonElements;
	//private GameElementsManager geManager;
	
	private double nbRooms;
	
	private DungeonGenerator(ModelsManager modelAccess) {
		this.modelAccess = modelAccess;
		generatedDungeon = new DungeonImpl();
		random = new Random();
		gridManager = new GridManager(modelAccess);	
	}
	
	public DungeonGenerator(ModelsManager modelAccess, DungeonElements dungeonElements, double nbRooms) {
		this(modelAccess); 		
		generatedDungeon.setLearningobjective(dungeonElements.getChosenObjective());
		generatedDungeon.setLevel(dungeonElements.getChosenLevel());
		//this.geManager = geManager;
		this.dungeonElements = dungeonElements;
		this.nbRooms = nbRooms;
	}
	
	public Dungeon generateDungeon() {
		if(modelAccess.getContextModel().getGamecontext().getMode().equals(DungeonMode.LINEAR)) {
			generateLinearDungeon();
		}else {
			generateLabyrinthineDungeon();
		}
		return generatedDungeon;
	}
	
	/* ******************************************* */
	/*   LABYRINTHINE DUNGEON GENERATION METHODS   */
	/* ******************************************* */
	
	private void generateLabyrinthineDungeon() {
		System.out.println("Labyrinthe");
		List<LabyrinthineRoom> dungeonRooms = new ArrayList<>();
		
		Room originRoom = createEntryRoomLabyrinthine();
		dungeonRooms.add(new LabyrinthineRoom(originRoom));
		
		//List<TaskFactPair> factsToQuestion = eeManager.getFactsToQuestion();
		//System.err.println("Nb rooms "+nbRooms+" | NbGPTaskPair "+geManager.size());
		
		while(dungeonRooms.size() < nbRooms + 1) {
			LabyrinthineRoom randomStartingRoom = chooseEntryRoomForNewPathIn(dungeonRooms);
			LabyrinthineRoom aRoom = createNewRoomFrom(randomStartingRoom, dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1));
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
	
	private LabyrinthineRoom createNewRoomFrom(LabyrinthineRoom originRoom, RoomElements roomElements) {
		Directions originRoomAvailableDirection = originRoom.getAvailableExit(gridManager);
		if(originRoomAvailableDirection.equals(Directions.NONE)) { return null; }
		Coordinate nextPosition = gridManager.getNextCoord(originRoom.getRoom(), originRoomAvailableDirection);
		Set<Directions> allowedDirections = gridManager.getAllowedNewRoomEntries(nextPosition, originRoomAvailableDirection);
		RoomType roomType = null;
		Directions entry = null;
		while(roomType == null && !allowedDirections.isEmpty()) {
			entry = chooseEntryDirection(allowedDirections);
			/*if(factsToQuestionByRoom != null && factsToQuestionByRoom.getTask2facts() != null) {
				roomType = getCompatibleRoomType(entry, factsToQuestionByRoom.getGameplay()); 
			} else {
				roomType = getCompatibleRoomType(entry, 0);
			}*/
			roomType = getCompatibleRoomType(entry, roomElements); 
			if(roomType == null) {
				allowedDirections.remove(entry);
			}
		}
		
		if(allowedDirections.isEmpty()) {
			return null; 
		}else {
			Coordinate validCoord = gridManager.getValidCoordinates(entry, nextPosition);
			createOriginRoomExitAccess(originRoom, originRoomAvailableDirection);
			Room aRoom = createRoom(validCoord.getX(), validCoord.getY(), roomType, roomElements, originRoom.getLastRoomAccess(), entry);
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
	private RoomType getCompatibleRoomType(Directions entry, RoomElements roomElements) {
		return getCompatibleRoomType(entry, Directions.NONE, roomElements);
	}
	
	private Room createEntryRoomLabyrinthine() {
		List<RoomType> rts = roomsWithOneDirection();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		return createRoom(0, 0, rt, null, null, null, Directions.NONE);
	}
	
	private Room createRoom(int x, int y, RoomType roomT, RoomElements roomElements, RoomAccess previousRoomExitAccess,  Directions entryDirection) {
		return createRoom(x, y, roomT, roomElements, previousRoomExitAccess, entryDirection, Directions.NONE);
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
		//List<TaskFactPair> factsToQuestion = eeManager.getFactsToQuestion();
	
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
			}else {
				backtrack = false;
				LinearRoom aRoom = createNewRoomFrom(eligibleRoomsOrientations.lastElement(), nextPosition, dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), 
						dungeonRooms.lastElement().getLastRoomAccess(), dungeonRooms.size() == nbRooms);
				dungeonRooms.add(aRoom);
			}
		}
		
		for (LinearRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	private LinearRoom createNewRoomFrom(LinearRoomOrientations eligibleRoomOrientations, Coordinate nextPosition, RoomElements roomElements, RoomAccess originRoomAccess, boolean isLastRoom) {
		Directions entry = null; 
		Directions exit = null;
		RoomType roomType = null;
		while(roomType == null) { // TODO : RoomSizeChoice
			entry = chooseEntryDirection(eligibleRoomOrientations);
			if(!isLastRoom) {
				exit = chooseExitDirection(eligibleRoomOrientations, entry);
			}else {
				exit = Directions.NONE;
			}
			
			roomType = getCompatibleRoomType(entry, exit, roomElements); 
		}
		Coordinate validCoord = gridManager.getValidCoordinates(entry, nextPosition);
		Room room = createRoom(validCoord.getX(), validCoord.getY(), roomType, roomElements, originRoomAccess, entry, exit);
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
	/*private boolean gameplayHasStructure(Gameplay gameplay) {
		for (AComponent comp : gameplay.getComponents()) {
			if(comp instanceof Structure) {
				return true;
			}
		}
		return false;
	}*/
	
	
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(Directions entry, Directions exit, RoomElements roomElements) { // TODO à corriger probleme avec les statues mauvais roomType choisi 
		List<RoomType> roomTypes = new ArrayList<>(modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes());
		roomTypes = roomTypes.stream().filter(e -> e.getDirections().size() > 1).collect(Collectors.toList());
		
		for (RoomType roomType : new ArrayList<>(roomTypes)) { // TODO
			if(!roomType.getDirections().contains(entry) || (!exit.equals(Directions.NONE) && !roomType.getDirections().contains(exit))) { // || (roomType.getStatementPositions ().size() < numberOfFact)
				for (GPElementType elem : roomElements.getElementsToQuantity().keySet()) {
					if(roomElements.getElementsToQuantity().get(elem) != -1) {
						for (GPElementType elementType : roomElements.getElementsToQuantity().keySet()) {
							if(elementType instanceof Structure && roomType.getStructurePositions().size() < roomElements.getElementsToQuantity().get(elementType)) {
								roomTypes.remove(roomType);
							}
							if(elementType instanceof Component && getRoomTypePositionsOfSize(roomType, elementType.getSize()).size() < roomElements.getElementsToQuantity().get(elementType)) {
								roomTypes.remove(roomType);
							}
						}
					}
				}
				
			}
		}
		if(roomTypes.isEmpty()) { System.err.println("NO room type"); ;return null;}
		
		return roomTypes.get(random.nextInt(roomTypes.size())); 
	}
	
	private List<APosition> getRoomTypePositionsOfSize(RoomType roomtype, ElementSize size){
		List<APosition> positions = new ArrayList<>(); 
		for (APosition pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size)) {
				positions.add(pos);
			}
		}
		return positions;
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
	private Room createRoom(int x, int y, RoomType roomT, RoomElements roomElements, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection) {
		Room r = new RoomImpl();
		r.setRoomtype(roomT);
		r.setX(x);
		r.setY(y);
		
		if(roomElements != null) {
			/*for (QuestionedFact questionedFact : factsToQuestion.getFacts()) {
				Position p = null;
				questionedFact.setPosition(p);
			}*/
			r.getQuestionedFacts().addAll(roomElements.getFacts());
			r.setTask(roomElements.getTask());
			r.setGameplay(roomElements.getGameplay());
			roomElements.setRoom(r);
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
		for (RoomType rt : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(rt.getDirections().size() == 1) {
				rts.add(rt);
			}
		}
		return rts;
	}
	
	/* ****************************************** */
	/*       DEBUG DUNGEON PRINTING METHODS       */
	/* ****************************************** */
	
	private void printRoom(Room r, int i) {
		System.out.println("****");
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("Gameplay : "+r.getGameplay().getName());
		System.out.println("****");
	}
	
	public void printDungeon() {
		System.out.println("---- Dungeon -----");
		int i = 0;
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r, i); i++;
		}
	}
}
