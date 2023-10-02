package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import exceptions.NonRoomTypeException;
import generator.Ability;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.ElementSize;
import generator.ElementType;
import generator.NoQuestionGameplay;
import generator.Position;
import generator.QuestionGameplay;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
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
		//generatedDungeon.setMode(dungeonElements.getDungeonMode());
		generatedDungeon.getCurses().addAll(dungeonElements.getCurses());
		this.dungeonElements = dungeonElements;
		this.nbRooms = nbRooms;
	}
	
	public Dungeon generateDungeon() throws NonRoomTypeException {
		DungeonMode mode = modelAccess.lauchedFromTEST? modelAccess.getContextModel().getGamecontext().getMode(): dungeonElements.getDungeonMode();
		
		if(mode.equals(DungeonMode.LINEAR)) {
			generateLinearDungeon();
		}else {
			generateLabyrinthineDungeon();
		}
		
		//generateLabyrinthineDungeon();
		return generatedDungeon;
	}
	
	public void setDungeonElements(DungeonElements dungeonElements) {
		this.dungeonElements = dungeonElements;
	}
	
	/* ******************************************* */
	/*   LABYRINTHINE DUNGEON GENERATION METHODS   */
	/* ******************************************* */

	private void generateLabyrinthineDungeon() throws NonRoomTypeException {
		ALGAGenerator.LOGGER.info("Generation of Labyrinthe dungeon");
		List<LabyrinthineRoom> dungeonRooms = new ArrayList<>();
		List<LabyrinthineRoom> selectableRooms = new ArrayList<>();
		
		Room originRoom = createEntryRoomLabyrinthine();
		dungeonRooms.add(new LabyrinthineRoom(originRoom));
		selectableRooms.add(new LabyrinthineRoom(originRoom));		
		while(dungeonRooms.size() < (nbRooms + 1) && !selectableRooms.isEmpty()) {
			LabyrinthineRoom randomStartingRoom = chooseEntryRoomForNewPathIn(selectableRooms);
			LabyrinthineRoom aRoom = createNewRoomFrom(randomStartingRoom, dungeonElements.getElementsOfRoom(dungeonRooms.size()));
			if(aRoom != null) {
				dungeonRooms.add(aRoom);
				selectableRooms.add(aRoom);
			} else {
				createNewPath(randomStartingRoom, originRoom);
				selectableRooms.remove(randomStartingRoom);
			}
		}	
		dungeonRooms.add(createAnExit(dungeonRooms));		
		for (LabyrinthineRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}	
		generatedDungeon.setEntry(originRoom);
	}
	
	private LabyrinthineRoom createAnExit(List<LabyrinthineRoom> dungeonRooms) throws NonRoomTypeException {
		List<LabyrinthineRoom> dungeonRoomTemps = new ArrayList<>(dungeonRooms);
		LabyrinthineRoom exit = null;
		while (exit == null) {
			LabyrinthineRoom furthest = findFurthestFromEntryRoomEuclidianDistanceWith(dungeonRoomTemps);
			exit = createNewRoomFrom(furthest, dungeonElements.getElementsOfRoom(dungeonRooms.size()));
			dungeonRoomTemps.remove(furthest);
		}
		return exit;
	}
	
	private LabyrinthineRoom findFurthestFromEntryRoomEuclidianDistanceWith(List<LabyrinthineRoom> eligibleRooms) {
		Map<LabyrinthineRoom, Double> distances = new HashMap<>(); 
		
		double value = 0.0;
		
		for (LabyrinthineRoom labyrinthineRoom : eligibleRooms) {
			
			value = Math.sqrt(labyrinthineRoom.getRoom().getX()*labyrinthineRoom.getRoom().getX() + labyrinthineRoom.getRoom().getY()*labyrinthineRoom.getRoom().getY());
			distances.put(labyrinthineRoom, value);
			
		}
		LabyrinthineRoom furthest = eligibleRooms.get(0);
		for (LabyrinthineRoom labyrinthineRoom : distances.keySet()) {
			if(distances.get(labyrinthineRoom) > distances.get(furthest)) {
				furthest = labyrinthineRoom;
			}
		}
		return furthest;
	}
	
	private void createNewPath(LabyrinthineRoom originRoom, Room dungeonEntry) {
		List<NeighborAccess> neighbors = gridManager.getNeighbors(originRoom.getRoomCoordinates(), originRoom.isRoomTypeSmall());
		for (NeighborAccess neighbor : neighbors) {
			if(!originRoom.hasRoomAccessWith(neighbor.getRoom()) && !neighbor.getRoom().equals(dungeonEntry)
					&& neighborAccessRespectOriginRoomType(neighbor, originRoom)) {
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
	
	private boolean neighborAccessRespectOriginRoomType(NeighborAccess neighbor, LabyrinthineRoom originRoom) {
		return originRoom.getRoom().getRoomtype().getDirections().contains(neighbor.getAccessDirectionToNeighbor()) ;
	}
	
	private LabyrinthineRoom createNewRoomFrom(LabyrinthineRoom originRoom, RoomElements roomElements/*, boolean isExitRoom*/) throws NonRoomTypeException {
		Directions originRoomAvailableDirection = originRoom.getAvailableExit(gridManager);

		if(originRoomAvailableDirection.equals(Directions.NONE)) { return null; }
		Coordinate nextPosition = gridManager.getNextCoord(originRoom.getRoom(), originRoomAvailableDirection);
		Set<Directions> allowedDirections = gridManager.getAllowedNewRoomEntries(nextPosition, originRoomAvailableDirection);
		RoomType roomType = null;
		Directions entry = null;
		while(roomType == null && !allowedDirections.isEmpty()) {
			entry = chooseEntryDirection(allowedDirections);
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
	
	private LabyrinthineRoom chooseEntryRoomForNewPathIn(List<LabyrinthineRoom> rooms) {
		if(rooms.size() == 1) {
			return rooms.get(0);
		} else if(!rooms.isEmpty()){
			int rand = random.nextInt(rooms.size() - 1) + 1;
			return rooms.get(rand);
		} else {
			return null;
		}
	}

	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @return Valid RoomType
	 * @throws NonRoomTypeException 
	 */
	private RoomType getCompatibleRoomType(Directions entry, RoomElements roomElements) throws NonRoomTypeException {
		return getCompatibleRoomType(entry, Directions.NONE, roomElements);
	}
	
	private Room createEntryRoomLabyrinthine() {
		List<RoomType> rts = getEntryRoomTypes();
		RoomType rt = rts.get(random.nextInt(rts.size()));	
		dungeonElements.getElementsOfRoom(0).setEntry(true);
		return createRoom(0, 0, rt, dungeonElements.getElementsOfRoom(0), null, null, Directions.NONE);
	}
	
	private Room createRoom(int x, int y, RoomType roomT, RoomElements roomElements, RoomAccess previousRoomExitAccess,  Directions entryDirection) {
		return createRoom(x, y, roomT, roomElements, previousRoomExitAccess, entryDirection, Directions.NONE);
	}
		
	/* ****************************************** */
	/*     LINEAR DUNGEON GENERATIION METHODS     */
	/* ****************************************** */
	
	private void generateLinearDungeon() throws NonRoomTypeException {
		ALGAGenerator.LOGGER.info("Generation of Linear dungeon");
		Stack<LinearRoom> dungeonRooms = new Stack<>();
		Stack<LinearRoomOrientations> eligibleRoomsOrientations = new Stack<>();
		
		Room originRoom = createEntryRoomLinear();
		dungeonRooms.add(new LinearRoom(originRoom, originRoom.getRoomaccess().get(0).getDirection()));
	
		boolean backtrack = false;
		Coordinate nextPosition = null;	
		StructureChosenRT structureRT = new StructureChosenRT(null, null, null);
				
		while(dungeonRooms.size() < nbRooms + 2) {
			nextPosition = gridManager.getNextCoord(dungeonRooms.lastElement().getRoom(), dungeonRooms.lastElement().getExit());
			if(!backtrack) {
				eligibleRoomsOrientations.add(gridManager.getAllowedDirections(nextPosition, dungeonRooms.lastElement().getExit())); 
			}
			if(!eligibleRoomsOrientations.lastElement().hasEligibleOrientation() ) {
				backtrack = true;
				eligibleRoomsOrientations.pop();
				LinearRoom r = dungeonRooms.pop();
				eligibleRoomsOrientations.lastElement().removeExitForEntry(r.getEntry(), r.getExit());
			} else {
				backtrack = false;
				structureRT = chooseRoomType(eligibleRoomsOrientations.lastElement(), dungeonElements.getElementsOfRoom(dungeonRooms.size()));
				LinearRoom aRoom = createNewRoomFrom(nextPosition, dungeonElements.getElementsOfRoom(dungeonRooms.size()), dungeonRooms.lastElement().getExitRoomAccess(), structureRT);
				dungeonRooms.add(aRoom);
			}
		}

		
		for (LinearRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	

	private class StructureChosenRT {
		public Directions entry; 
		public Directions exit;
		public RoomType roomType;
		
		public StructureChosenRT(Directions entry, Directions exit, RoomType roomType) {
			this.entry = entry;
			this.exit = exit;
			this.roomType = roomType;
		}
	}
	
	private StructureChosenRT chooseRoomType(LinearRoomOrientations eligibleRoomOrientations, RoomElements roomElements) throws NonRoomTypeException {
		List<Directions> chosenEntries = new ArrayList<>(); 
		Directions entry = null; 
		Directions exit = null;
		RoomType roomType = null;
		while(roomType == null ) { 
			entry = chooseEntryDirection(eligibleRoomOrientations, chosenEntries);
			if(entry != null) { 
				chosenEntries.add(entry);
				if(!roomElements.isExit()) {
					exit = chooseExitDirection(eligibleRoomOrientations, entry);
				}else {
					exit = Directions.NONE;
				}
				roomType = getCompatibleRoomType(entry, exit, roomElements); 
			}
		}
				
		return new StructureChosenRT(entry, exit, roomType);
	}
	
	private LinearRoom createNewRoomFrom(Coordinate nextPosition, RoomElements roomElements, RoomAccess originRoomAccess, StructureChosenRT structure) {
		Coordinate validCoord = gridManager.getValidCoordinates(structure.entry, nextPosition);
		Room room = createRoom(validCoord.getX(), validCoord.getY(), structure.roomType, roomElements, originRoomAccess, structure.entry, structure.exit);
		return new LinearRoom(room, structure.entry, structure.exit);
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
	private Directions chooseEntryDirection(LinearRoomOrientations roomAllowedOrientations, List<Directions> chosenEntries) {
		List<Directions> possibleEntries = new ArrayList<>(roomAllowedOrientations.eligibleEntries());
		possibleEntries.removeAll(chosenEntries);
		if(possibleEntries.isEmpty()) { return null; }
		return possibleEntries.get(random.nextInt(possibleEntries.size()));
	}
		
	/**
	 * Creates an entry room by selecting a RoomType that only as 1 direction/access
	 * @return an entry Room
	 */
	private Room createEntryRoomLinear() {
		List<RoomType> rts = getEntryRoomTypes();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		dungeonElements.getElementsOfRoom(0).setEntry(true);
		return createRoom(0, 0, rt, dungeonElements.getElementsOfRoom(0), null, null, rt.getDirections().get(0));
	}
	
	/* ****************************************** */
	/*     COMMON DUNGEON GENERATIION METHODS     */
	/* ****************************************** */
	
	private List<RoomType> getQuestionRoomTypes(){
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(roomtype.isQuestionRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 * @throws NonRoomTypeException 
	 */
	private RoomType getCompatibleRoomType(Directions entry, Directions exit, RoomElements roomElements) throws NonRoomTypeException {
		List<RoomType> roomTypes; 
		
		if(roomElements.getGameplay() instanceof QuestionGameplay) { roomTypes = getQuestionRoomTypes(); }
		else if(roomElements.getGameplay() instanceof NoQuestionGameplay){ roomTypes = getTrapRoomTypes(); }
		else if(roomElements.isExit()) { roomTypes = getExitRoomTypes(); }
		else { roomTypes = getEntryRoomTypes(); }
		
		//System.out.println("Every roomtypes "+roomTypes);
		//System.out.println("Room "+roomElements.getGameplay()+" "+roomElements.isEntry());
		//System.out.println("entry: "+entry+" exit: "+exit+" ");

		for (RoomType roomType : new ArrayList<>(roomTypes)) { 
			//System.out.println(" roomtype: "+roomType.getName());

			if(!roomTypeHasCompatibleAccesses(entry, exit, roomType) || !roomTypeHasCompatiblePositions(roomType, roomElements)) {				
				roomTypes.remove(roomType);
			}
			
		}
		
		//System.err.println("ALLOWED "+roomTypes);
		if(roomTypes.isEmpty()) { throw new NonRoomTypeException(roomElements.getGameplay(), roomElements.getTask());}
		RoomType rt = roomTypes.get(random.nextInt(roomTypes.size()));
		//System.err.println("SELECTED RT "+rt.getName());
		return rt; 
	}
	
	private boolean roomTypeHasCompatibleAccesses(Directions entry, Directions exit, RoomType roomType) {
		return roomType.getDirections().contains(entry) && (exit.equals(Directions.NONE) || roomType.getDirections().contains(exit));
	}
	
	private int sumOfElementOfSize(Map<Ability, Integer> numberOfElementPerAbility) {
		int quantity = 0;
		for (Ability ability : numberOfElementPerAbility.keySet()) {
			quantity += numberOfElementPerAbility.get(ability);
		}
		return quantity;
	}
	
	private boolean roomTypeHasCompatiblePositions(RoomType roomtype, RoomElements roomElements) { 
		boolean compatible = true;
		
		Map<ElementSize, Map<Ability, Integer>> numberOfElementsPerSize = computesNumberOfElementsPerSize(roomElements);
		
		for (ElementSize size : numberOfElementsPerSize.keySet()) {
			List<Position> roomPositionOfSize = getRoomTypePositionsOfSize(roomtype, size);
			if(roomPositionOfSize.size() < sumOfElementOfSize(numberOfElementsPerSize.get(size))) {
				compatible = false; break;
			} else {
				for (Ability ability : numberOfElementsPerSize.get(size).keySet()) {
					if(ability != null) {
						List<Position> roomPositionOfSize_Ability = getRoomTypePositionsOfSizeForAbility(roomtype, size, ability);
						if(numberOfElementsPerSize.get(size).get(ability) > roomPositionOfSize_Ability.size()) {
							compatible = false;
						}
					}
					
				}
			}
		}
		return compatible;
	}
	
	private Map<ElementSize,  Map<Ability, Integer>> computesNumberOfElementsPerSize(RoomElements roomElements){
		Map<ElementSize, Map<Ability, Integer>> numberOfElementsPerSize = new HashMap<>();
		for (ElementType gpElem : roomElements.getElementsToQuantity().keySet()) {
			int quantity = roomElements.getElementsToQuantity().get(gpElem);
			Ability ability = ((ElementType) gpElem).getAbility();
				
			if(numberOfElementsPerSize.containsKey(gpElem.getSize())) {
				if(numberOfElementsPerSize.get(gpElem.getSize()).containsKey(ability)) {
					quantity += numberOfElementsPerSize.get(gpElem.getSize()).get(ability);
				} else {
					numberOfElementsPerSize.get(gpElem.getSize()).put(ability, quantity);
				}
			} else {
				numberOfElementsPerSize.put(gpElem.getSize(), new HashMap<>()); 
				numberOfElementsPerSize.get(gpElem.getSize()).put(ability, quantity);
			}				
		}
		return numberOfElementsPerSize;
	}
	
	private List<Position> getRoomTypePositionsOfSizeForAbility(RoomType roomtype, ElementSize size, Ability ability){
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size) && (pos.getRestrictedTo().isEmpty() || pos.getRestrictedTo().contains(ability))) {
				positions.add(pos);
			}
		}
		return positions;
	}
	
	private List<Position> getRoomTypePositionsOfSize(RoomType roomtype, ElementSize size){
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
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
	 */
	private Room createRoom(int x, int y, RoomType roomT, RoomElements roomElements, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection) {
		Room r = new RoomImpl();
		r.setRoomtype(roomT);
		r.setX(x);
		r.setY(y);
		

		if(roomElements != null) {
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
	private List<RoomType> getEntryRoomTypes() {
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(roomtype.isEntryRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	private List<RoomType> getTrapRoomTypes(){
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(roomtype.isTrapRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	private List<RoomType> getExitRoomTypes() {
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(roomtype.isExitRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
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
