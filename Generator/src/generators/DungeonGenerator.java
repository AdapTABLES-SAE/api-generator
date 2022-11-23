package generators;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.ETaskType;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.impl.DungeonImpl;
import generator.impl.QuestionImpl;
import generator.impl.RoomAccessImpl;
import generator.impl.RoomImpl;
import managers.EducationElementsManager;
import managers.GridManager;
import managers.ModelsManager;
import structures.Coordinate;

public class DungeonGenerator {
	private Dungeon generatedDungeon; 
	private ModelsManager modelAccess;
	
	
	/** Attribute to generate random elements */
	private Random random;
	
	private GridManager gridManager;
	private EducationElementsManager eeManager; 
	
	private DungeonGenerator(ModelsManager modelAccess) {
		this.modelAccess = modelAccess;
		generatedDungeon = new DungeonImpl();
		random = new Random();
		gridManager = new GridManager(modelAccess);	
	}
	
	public DungeonGenerator(ModelsManager modelAccess, EducationElementsManager eeManager) {
		this(modelAccess); 		
		this.eeManager = eeManager;
	}
	
	public Dungeon generateDungeon() {
		if(modelAccess.context.getGamecontext().getMode().equals(DungeonMode.LINEAR)) {
			generateLinearDungeon();
		}else {
		}
		return generatedDungeon;
	}

	private void generateLinearDungeon() {
		Deque<Map.Entry<Room, Directions>> dungeonRooms = new LinkedList<>();
		Deque<Map<Directions, Set<Directions>>> roomAllowedDirections = new LinkedList<>();
		int numberofrooms = modelAccess.context.getGamecontext().getNumberOfRooms();
		Room originRoom = createEntryRoom();
		dungeonRooms.add(Map.entry(originRoom, originRoom.getRoomaccess().get(0).getDirection()));
	
		boolean backtrack = false;
		Coordinate nextPosition = null;
		ETaskType tasktype = null;
		Directions entry = null, exit = null;
		RoomType roomType = null;
		
	
		while(dungeonRooms.size() < numberofrooms + 1) {
			//System.out.println(roomAllowedDirections);
			//System.out.println(roomAllowedDirections.getLast());
			nextPosition = gridManager.getNextCoord(dungeonRooms.getLast().getKey(), dungeonRooms.getLast().getValue());
			if(!backtrack) {
				tasktype = eeManager.getOrderedTaskTypes().get(dungeonRooms.size() - 1);
				roomAllowedDirections.add(gridManager.getAllowedDirections(nextPosition, dungeonRooms.getLast().getValue())); 
			}
			if(roomAllowedDirections.getLast().isEmpty()) {
				backtrack = true;
				roomAllowedDirections.removeLast();
				Entry<Room, Directions> r = dungeonRooms.removeLast();
				gridManager.removeAllOccupied(r.getKey());
				for (Directions dir : new ArrayList<>(roomAllowedDirections.getLast().keySet())) {
					roomAllowedDirections.getLast().get(dir).remove(r.getValue());
					if(roomAllowedDirections.getLast().get(dir).isEmpty()) {
						roomAllowedDirections.getLast().remove(dir);
					}
				}
			}else {
				backtrack = false;

				roomType = null;
				while(roomType == null) {
					entry = chooseEntryDirection(roomAllowedDirections);
					if(dungeonRooms.size() != numberofrooms) {
						exit = roomAllowedDirections.getLast().get(entry).stream().collect(Collectors.toList()).get(random.nextInt(roomAllowedDirections.getLast().get(entry).size())); 
					}else {
						exit = Directions.NONE;
					}
					roomType = getCompatibleRoomType(tasktype, entry, exit); 
				}
				Coordinate validCoord = gridManager.getValidCoordinates(entry, nextPosition);
				Room room = createRoom(validCoord.getX(), validCoord.getY(), roomType, tasktype, dungeonRooms.getLast().getKey().getRoomaccess().get(dungeonRooms.getLast().getKey().getRoomaccess().size()-1), entry, exit);
				dungeonRooms.add(Map.entry(room, exit));
			}
		}
		
		for (Map.Entry<Room, Directions> aEntry : dungeonRooms) {
			generatedDungeon.getRooms().add(aEntry.getKey());
		}
		generatedDungeon.setEntry(originRoom);
	}
	
	/**
	 * In case of complex and simple entry direction, it prioritize small room 
	 * 3/5 chance of getting a small room, 2/5 chance of getting a large room 
	 * @param roomAllowedDirections
	 * @return the chosen entry direction 
	 */
	private Directions chooseEntryDirection(Deque<Map<Directions, Set<Directions>>> roomAllowedDirections) {
		List<Directions> possibleEntries = roomAllowedDirections.getLast().keySet().stream().collect(Collectors.toList());
		// TODO : Heuristique de choix de petite salle ou grande
				
		/*if(possibleEntries.size() == 3) {
			Directions d = possibleEntries.stream().distinct().filter(simpleDirections::contains).collect(Collectors.toList()).get(0);
			possibleEntries.add(d);
			possibleEntries.add(d);
		}*/		
		return possibleEntries.get(random.nextInt(possibleEntries.size()));
	}
		
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(ETaskType taskType, Directions entry, Directions exit) {
		List<RoomType> roomTypes = new ArrayList<>(modelAccess.gameDescription.getRoomtypes().getRoomtypes());
		roomTypes = roomTypes.stream().filter(e -> e.getDirections().size() > 1).collect(Collectors.toList());
		
		for (RoomType roomType : new ArrayList<>(roomTypes)) {
			if(!roomType.getDirections().contains(entry) || (!exit.equals(Directions.NONE) && !roomType.getDirections().contains(exit))) {
				roomTypes.remove(roomType);
			}
		}
		if(roomTypes.isEmpty()) {return null;}
		
		return roomTypes.get(random.nextInt(roomTypes.size())); 
	}
	
	/**
	 * Creates an entry room by selecting a RoomType that only as 1 direction/access
	 * @return an entry Room
	 */
	private Room createEntryRoom() {
		List<RoomType> rts = roomsWithOneDirection();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		return createRoom(0, 0, rt, null, null, null, rt.getDirections().get(0));
	}
	

	/**
	 * Instanciate a Room with (X,Y) as coordinates, with the RoomType rt, with an entry direction as entryDirection and exit as exitDirection and set the access between previous and new room 
	 * @param X
	 * @param Y
	 * @param roomT
	 * @param previousRoomExitAccess
	 * @param entryDirection
	 * @param exitDirection
	 * @return a Room
	 */
	private Room createRoom(int X, int Y, RoomType roomT, ETaskType taskType, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection) {
		Room r = new RoomImpl();
		r.setRoomtype(roomT);
		r.setX(X);
		r.setY(Y);
		
		if(taskType != null) {
			r.setQuestion(new QuestionImpl());
			r.getQuestion().setPosition(roomT.getPositions().get(random.nextInt(roomT.getPositions().size())));
			r.getQuestion().setIncompleteFact(taskType.getLiteral());
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
