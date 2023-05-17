package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import generator.Position;
import generator.Ability;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.ElementSize;
import generator.ElementType;
import generator.GPElementType;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.Structure;
import generator.StructureType;
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
import structures.Pair;
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
		generatedDungeon.setMode(dungeonElements.getDungeonMode());
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
			LabyrinthineRoom aRoom = createNewRoomFrom(randomStartingRoom, dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), false);
			if(aRoom != null) {
				dungeonRooms.add(aRoom);
			} else {
				createNewPath(randomStartingRoom, originRoom);
			}
		}	
		
		dungeonRooms.add(createAnExit(dungeonRooms));
		
		for (LabyrinthineRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	private LabyrinthineRoom createAnExit(List<LabyrinthineRoom> dungeonRooms) {
		List<LabyrinthineRoom> dungeonRoomTemps = new ArrayList<>(dungeonRooms);
		LabyrinthineRoom exit = null;
		while (exit == null) {
			LabyrinthineRoom furthest = findFurthestFromEntryRoomEuclidianDistanceWith(dungeonRoomTemps);
			exit = createNewRoomFrom(furthest, dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), true);
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
			if(!originRoom.hasRoomAccessWith(neighbor.getRoom()) && !neighbor.getRoom().equals(dungeonEntry)) {
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
	
	private LabyrinthineRoom createNewRoomFrom(LabyrinthineRoom originRoom, RoomElements roomElements, boolean isExitRoom) {
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
			roomType = getCompatibleRoomType(entry, roomElements, isExitRoom); 
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
	private RoomType getCompatibleRoomType(Directions entry, RoomElements roomElements, boolean isExitRoom) {
		return getCompatibleRoomType(entry, Directions.NONE, roomElements, isExitRoom);
	}
	
	private Room createEntryRoomLabyrinthine() {
		List<RoomType> rts = getRoomTypesForEntry();
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
		StructureChosenRT structureRT = new StructureChosenRT(null, null, null);
				
		//boolean isExitRoomCreation = false;
	
		while(dungeonRooms.size() < nbRooms + 2) {
			//System.out.println("Loop "+dungeonRooms.size());
			nextPosition = gridManager.getNextCoord(dungeonRooms.lastElement().getRoom(), dungeonRooms.lastElement().getExit());
			if(!backtrack) {
				eligibleRoomsOrientations.add(gridManager.getAllowedDirections(nextPosition, dungeonRooms.lastElement().getExit())); 
			}
			if(!eligibleRoomsOrientations.lastElement().hasEligibleOrientation() /*|| structureRT.isNull()*/) {
				backtrack = true;
				eligibleRoomsOrientations.pop();
				LinearRoom r = dungeonRooms.pop();
				eligibleRoomsOrientations.lastElement().removeExitForEntry(r.getEntry(), r.getExit());
			} else {
				backtrack = false;
				if(dungeonRooms.size() == (nbRooms + 1)) { 
					structureRT = chooseRoomType(eligibleRoomsOrientations.lastElement(), dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), true);
				} else {
					structureRT = chooseRoomType(eligibleRoomsOrientations.lastElement(), dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), false);
				}
				
				


				LinearRoom aRoom = createNewRoomFrom(nextPosition, dungeonElements.getElementsOfRoom(dungeonRooms.size() - 1), 
						dungeonRooms.lastElement().getExitRoomAccess(), structureRT);
				dungeonRooms.add(aRoom);
			}
		}
		
		
		//Room exitRoom = createExitRoomLinear(dungeonRooms.lastElement());
		//dungeonRooms.add(new LinearRoom(exitRoom, Directions.NONE));
		
		for (LinearRoom aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getRoom());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	/*private Room createExitRoomLinear(LinearRoom exitOrigin) {
		Coordinate roomPosition = gridManager.getNextCoord(exitOrigin.getRoom(), exitOrigin.getExit());
		Directions entryOfExit = gridManager
		List<RoomType> rts = getRoomTypesForExit();
		RoomType rt = rts.get(random.nextInt(rts.size()));	
		int x, int y, RoomType roomT, RoomElements roomElements, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection
		return createRoom(roomPosition.getX(), roomPosition.getY(), rt, null, exitOrigin.getExitRoomAccess(), null, rt.getDirections().get(0));		
	}*/

	private class StructureChosenRT {
		public Directions entry; 
		public Directions exit;
		public RoomType roomType;
		
		public StructureChosenRT(Directions entry, Directions exit, RoomType roomType) {
			this.entry = entry;
			this.exit = exit;
			this.roomType = roomType;
		}
		
		/*public boolean isNull() {
			return roomType == null;
		}*/
	}
	
	private StructureChosenRT chooseRoomType(LinearRoomOrientations eligibleRoomOrientations, RoomElements roomElements, boolean isExitRoom) {
		List<Directions> chosenEntries = new ArrayList<>(); // There is a problem here 
		Directions entry = null; 
		Directions exit = null;
		RoomType roomType = null;
		//int i = 0;
		while(roomType == null /*&& i <= eligibleRoomOrientations.eligibleEntries().size()*/) { 
			//System.out.println(eligibleRoomOrientations.eligibleEntries());
			entry = chooseEntryDirection(eligibleRoomOrientations, chosenEntries);
			//System.out.println("Entry "+entry);
			if(entry != null) { 
				chosenEntries.add(entry);
				if(!isExitRoom) {
					exit = chooseExitDirection(eligibleRoomOrientations, entry);
				}else {
					exit = Directions.NONE;
				}
				//System.out.println(entry+" "+exit+" "+roomElements.getGameplay());
				roomType = getCompatibleRoomType(entry, exit, roomElements, isExitRoom); 
			}
			//i++;
		}
		
		//System.err.println("Room type empty?"+roomType);
		
		return new StructureChosenRT(entry, exit, roomType);
	}
	
	private LinearRoom createNewRoomFrom(Coordinate nextPosition, RoomElements roomElements, RoomAccess originRoomAccess, StructureChosenRT structure) {
		//System.err.println("Create new room");
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
		List<RoomType> rts = getRoomTypesForEntry();
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
	
	private List<RoomType> getRoomTypesForNormalRooms(){
		List<RoomType> roomtypes = new ArrayList<>();
		
		for (RoomType roomType : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(!roomType.isForEntry() && !roomType.isForExit()) {
				roomtypes.add(roomType);
			}
		}
		return roomtypes;
	}
	
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(Directions entry, Directions exit, RoomElements roomElements, boolean isExitRoom) {
		List<RoomType> roomTypes; 
		if(!isExitRoom) {
			roomTypes = getRoomTypesForNormalRooms();
		} else {
			roomTypes = getRoomTypesForExit();
		}
		
		//roomTypes = roomTypes.stream().filter(e -> e.getDirections().size() > 1).collect(Collectors.toList());
		for (RoomType roomType : new ArrayList<>(roomTypes)) { 
			if(!roomTypeHasCompatibleAccesses(entry, exit, roomType) || !roomTypeHasCompatiblePositions(roomType, roomElements)) {				
				roomTypes.remove(roomType);
			}
			
		}
		//System.out.println(roomTypes);
		if(roomTypes.isEmpty()) { System.err.println("NO room type"); return null;}
		RoomType rt = roomTypes.get(random.nextInt(roomTypes.size()));
		
		//System.err.println();
		return rt; 
	}
	
	private boolean roomTypeHasCompatibleAccesses(Directions entry, Directions exit, RoomType roomType) {
		/*if(roomType.getName().equals("RegularRoom3")) {
			System.out.println("RT3 has entry : "+roomType.getDirections().contains(entry)+" (entry "+entry+")");
		}*/
		return roomType.getDirections().contains(entry) && (exit.equals(Directions.NONE) || roomType.getDirections().contains(exit));
	}
	
	@Deprecated
	private List<Position> getCompatiblesRoomTypePositions(RoomType roomtype, ElementSize size, Ability ability) {
		List<Position> positions = new ArrayList<>();
		for (Position position : roomtype.getElementPositions()) {
			if(position.getSize().equals(size)) {
				if(position.getRestrictedTo().isEmpty() || (position.getRestrictedTo().contains(ability))) {
					positions.add(position);
				}
			}
		}
		return positions;
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
		
		//System.err.println(roomtype.getName()+" "+roomElements.getGameplay().getName());
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
		//System.err.println("COMPATIBLE POSITIONS ?"+compatible);
		/*for (GPElementType gpElem : roomElements.getElementsToQuantity().keySet()) {
			int quantity = roomElements.getElementsToQuantity().get(gpElem);
			//System.err.println("DANS LA BBOUCLE" + gpElem.getClass().getSimpleName()+" "+quantity);
			if(quantity != -1 && gpElem instanceof StructureType) {
				if(roomtype.getStructurePositions().size() < quantity) {
					//System.err.println("ON EST LA");
					compatible = false;
				}
			}
		}*/
		return compatible;
	}
	
	private Map<ElementSize,  Map<Ability, Integer>> computesNumberOfElementsPerSize(RoomElements roomElements){
		Map<ElementSize, Map<Ability, Integer>> numberOfElementsPerSize = new HashMap<>();
		for (GPElementType gpElem : roomElements.getElementsToQuantity().keySet()) {
			int quantity = roomElements.getElementsToQuantity().get(gpElem);
			if(quantity != -1 && !(gpElem instanceof StructureType)) {
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
				//numberOfElementsPerSize.put(gpElem.getSize(), new Pair<Integer, List<Ability>>(quantity, abilities));
				
			} else if(gpElem instanceof StructureType) {
				if(numberOfElementsPerSize.containsKey(gpElem.getSize())) {
					if(numberOfElementsPerSize.get(gpElem.getSize()).containsKey(null)) {
						quantity += numberOfElementsPerSize.get(gpElem.getSize()).get(null);
					} else {
						numberOfElementsPerSize.get(gpElem.getSize()).put(null, quantity);
					}
					
				} else {
					numberOfElementsPerSize.put(gpElem.getSize(), new HashMap<>()); 
					numberOfElementsPerSize.get(gpElem.getSize()).put(null, quantity);
				}
			}
		}
		return numberOfElementsPerSize;
	}
	
	private List<Position> getRoomTypePositionsOfSizeForAbility(RoomType roomtype, ElementSize size, Ability ability){
		//System.out.println(roomtype+" "+size);
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size) && (pos.getRestrictedTo().isEmpty() || pos.getRestrictedTo().contains(ability))) {
				positions.add(pos);
			}
		}
		//System.out.println("number of pos = "+positions.size());
		return positions;
	}
	
	private List<Position> getRoomTypePositionsOfSize(RoomType roomtype, ElementSize size){
		//System.out.println(roomtype+" "+size);
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size)) {
				positions.add(pos);
			}
		}
		//System.out.println("number of pos = "+positions.size());
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
	private List<RoomType> getRoomTypesForEntry() {
		List<RoomType> rts = new ArrayList<>();
		for (RoomType rt : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(rt.isForEntry()) {
				rts.add(rt);
			}
		}
		return rts;
	}
	
	private List<RoomType> getRoomTypesForExit() {
		List<RoomType> rts = new ArrayList<>();
		for (RoomType rt : modelAccess.getGameDescriptionModel().getRoomtypes().getRoomtypes()) {
			if(rt.isForExit()) {
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
