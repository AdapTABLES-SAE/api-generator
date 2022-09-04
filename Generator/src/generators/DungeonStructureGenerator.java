package generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import exceptions.MissingModelException;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.LargeRoomType;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.impl.DungeonImpl;
import generator.impl.RoomAccessImpl;
import generator.impl.RoomImpl;
import models.ModelAccess;
import structures.Coordinate;
import structures.DataAccess;
import structures.GridPositions;

/**
 * Permet la generation de la structure d'un donjon. 
 * Génération classique : <br/>
 * <code>DungeonStructureGenerator dg = new DungeonStructureGenerator();<br/>
 * dg.generate();
 * </code><br/>
 * 
 * ATTENTION ! Cette méthode de génération génération peut renvoyer une exception (cas où l'algorithme se retrouve bloqué).  
 * Celle-ci est causé par le fait que l'algorithme n'est pas fondé sur un principe de BackTrack. 
 * 
 * Version de génération sans renvoie  d'Exception (regénération jusqu'à avoir une génération correcte) : 
 * <br/><code> 
 * ModelAccess modelAccess = new ModelAccess(); 
 * <br/>DungeonStructureGenerator.generateDungeonStructure(modelAccess);</code>
 * 
 * @see models.ModelAccess
 * @author Bérénice LEMOINE
 *
 */
public class DungeonStructureGenerator {
	
	private Dungeon generatedDungeon; 
	private ModelAccess modelAccess;
	
	/** Structure to save occupied Coordinates on a fake grid */
	private Map<Coordinate, Room> occupiedCoordinates;
	/** Attribute to generate random elements */
	private Random random;
	
	/** Data structure saving for each direction, its opposite directions (e.g., SOUTH => NORTH, NORTH_EAST, NORTH_WEST) */
	private EnumMap<Directions, Set<Directions>> oppositeDirections;
	/** Data structure enumerating simple directions (SOUTH, NORTH, EAST, WEST) */
	private Set<Directions> simpleDirections;
	/** Data structure enumerating complex directions (SOUTH_EAST, SOUTH_WEST, NORTH_EAST, NORTH_WEST, EAST_SOUTH, etc.) */
	private Set<Directions> complexDirections;
	
	public DungeonStructureGenerator(ModelAccess modelAccess) {
		this.modelAccess = modelAccess;
		generatedDungeon = new DungeonImpl();
		random = new Random();
		occupiedCoordinates = new HashMap<>();
		oppositeDirections = DataAccess.setOppositeDirections();
		complexDirections = DataAccess.setComplexeDirections();
		simpleDirections = DataAccess.setSimpleDirections();
	}
	
	public static Dungeon generateDungeonStructure(ModelAccess modelAccess) {
		DungeonStructureGenerator dg = new DungeonStructureGenerator(modelAccess);
		while(dg.generatedDungeon.getRooms().isEmpty()) {
			try {
				dg.generate();
			} catch (MissingModelException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				dg = new DungeonStructureGenerator(modelAccess);
			} 
		}
		return dg.generatedDungeon;
	}

	
	
	/**
	 * Dungeon structure generation algorithm 
	 */
	public void generate() throws IllegalArgumentException, MissingModelException {
		if(modelAccess.context.getGamecontext() == null) {
			throw new MissingModelException("Missing game context model");
		}
		System.out.println("Mode du donjon : " + modelAccess.context.getGamecontext().getMode());
		if(modelAccess.context.getGamecontext().getMode().equals(DungeonMode.LINEAR)) {
			generateLinearDungeon();
		}else {
			// TODO
		}
	}
	

	
	/**
	 * For each possible entry entryDirections (in theory), it verifies if the entry is really an option then select its possible exits
	 * @param actualCoordinates
	 * @param entryDirections (i.e., opposition directions of the previous room exit direction; e.g., if previous room exit is SOUTH, then it contains  NORTH, NORTH_EAST, NORTH_WEST)  
	 * @return An association between each verified entryDirection and their possible exits
	 */
 	private EnumMap<Directions, Set<Directions>> getAllowedDirections(Coordinate actualCoordinates, Set<Directions> entryDirections){
		EnumMap<Directions, Set<Directions>> originDtoPossibleD = new EnumMap<>(Directions.class); // Possible entry to possible exits 
		EnumMap<GridPositions, Boolean> gridPosOccupations = computesGridPositionsOccupied(actualCoordinates);
		
		Set<Directions> directions;
		for (Directions direction : entryDirections) {
			if(simpleDirections.contains(direction)) {
				directions = new HashSet<>(simpleDirections);
				if(gridPosOccupations.get(GridPositions.YPLUS1)) {directions.remove(Directions.NORTH);}
				if(gridPosOccupations.get(GridPositions.YMOINS1)) {directions.remove(Directions.SOUTH);}
				if(gridPosOccupations.get(GridPositions.XMOINS1)) {directions.remove(Directions.WEST);}
				if(gridPosOccupations.get(GridPositions.XPLUS1)) {directions.remove(Directions.EAST);}
			} else {
				if(direction.equals(Directions.SOUTH_EAST) || direction.equals(Directions.EAST_SOUTH)) {
					directions = allowedDirectionForSouthEast(gridPosOccupations, direction);
				} else if(direction.equals(Directions.SOUTH_WEST) || direction.equals(Directions.WEST_SOUTH)) {
					directions = allowedDirectionForSouthWest(gridPosOccupations, direction);
				} else if(direction.equals(Directions.WEST_NORTH) || direction.equals(Directions.NORTH_WEST) ) {
					directions = allowedDirectionForNorthWest(gridPosOccupations, direction);
				} else {
					directions = allowedDirectionForNorthEast(gridPosOccupations, direction);
				}
			}
			if(!directions.isEmpty()) originDtoPossibleD.put(direction, directions);
		}
		return originDtoPossibleD;
	}
 	
 	/**
 	 * Computes the possible exits for LargeRoomType  with SOUTH_EAST or EAST_SOUTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @return A set of authorized exit directions for LargeRoomType with SOUTH_EAST or EAST_SOUTH as entry
 	 */
 	private Set<Directions> allowedDirectionForSouthEast(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XMOINS1_YPLUS1)) {
 			directions.addAll(complexDirections);
			if(gridPosOccupations.get(GridPositions.YMOINS1)) directions.remove(Directions.SOUTH_EAST);
			if(gridPosOccupations.get(GridPositions.XPLUS1)) directions.remove(Directions.EAST_SOUTH);
			if(gridPosOccupations.get(GridPositions.XY_PLUS1)) directions.remove(Directions.EAST_NORTH);
			if(gridPosOccupations.get(GridPositions.XY_MOINS1)) directions.remove(Directions.SOUTH_WEST);
			if(gridPosOccupations.get(GridPositions.YPLUS2)) directions.remove(Directions.NORTH_EAST);
			if(gridPosOccupations.get(GridPositions.XMOINS1_YPLUS2)) directions.remove(Directions.NORTH_WEST);
			if(gridPosOccupations.get(GridPositions.XMOINS2_YPLUS1)) directions.remove(Directions.WEST_NORTH);
			if(gridPosOccupations.get(GridPositions.XMOINS2)) directions.remove(Directions.WEST_SOUTH);
			if(possibleEntry.equals(Directions.SOUTH_EAST)) {directions.remove(Directions.SOUTH_WEST);}
			if(possibleEntry.equals(Directions.EAST_SOUTH)) {directions.remove(Directions.EAST_NORTH);}
		}
 		return directions;
 	}
 	
 	/**
 	 * Computes the possible exits for LargeRoomType  with SOUTH_WEST or WEST_SOUTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @return A set of authorized exit directions for LargeRoomType with SOUTH_WEST or WEST_SOUTH as entry
 	 */
 	private Set<Directions> allowedDirectionForSouthWest(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XY_PLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1)) {
 			directions.addAll(complexDirections);
 			if(gridPosOccupations.get(GridPositions.XMOINS1)) directions.remove(Directions.WEST_SOUTH);
			if(gridPosOccupations.get(GridPositions.YMOINS1)) directions.remove(Directions.SOUTH_WEST);
			if(gridPosOccupations.get(GridPositions.XMOINS1_YPLUS1)) directions.remove(Directions.WEST_NORTH);
			if(gridPosOccupations.get(GridPositions.XPLUS1_YMOINS1)) directions.remove(Directions.SOUTH_EAST);
			if(gridPosOccupations.get(GridPositions.XPLUS2)) directions.remove(Directions.EAST_SOUTH);
			if(gridPosOccupations.get(GridPositions.XPLUS2_YPLUS1)) directions.remove(Directions.EAST_NORTH);
			if(gridPosOccupations.get(GridPositions.XPLUS1_YPLUS2)) directions.remove(Directions.NORTH_EAST);
			if(gridPosOccupations.get(GridPositions.YPLUS2)) directions.remove(Directions.NORTH_WEST);
			if(possibleEntry.equals(Directions.SOUTH_WEST)) {directions.remove(Directions.SOUTH_EAST);}
			if(possibleEntry.equals(Directions.WEST_SOUTH)) {directions.remove(Directions.WEST_NORTH);}
		}
 		return directions;
 	}
 	
 	/**
 	 * Computes the possible exits for LargeRoomType  with NORTH_WEST or WEST_NORTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @return A set of authorized exit directions for LargeRoomType with NORTH_WEST or WEST_NORTH as entry
 	 */
 	private Set<Directions> allowedDirectionForNorthWest(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>(); 
 		if(!gridPosOccupations.get(GridPositions.XPLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1_YMOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
 			directions.addAll(complexDirections);
			if(gridPosOccupations.get(GridPositions.YPLUS1)) directions.remove(Directions.NORTH_WEST);
			if(gridPosOccupations.get(GridPositions.XY_PLUS1)) directions.remove(Directions.NORTH_EAST);
			if(gridPosOccupations.get(GridPositions.XMOINS1)) directions.remove(Directions.WEST_NORTH);
			if(gridPosOccupations.get(GridPositions.XY_MOINS1)) directions.remove(Directions.WEST_SOUTH);
			if(gridPosOccupations.get(GridPositions.YMOINS2)) directions.remove(Directions.SOUTH_WEST);
			if(gridPosOccupations.get(GridPositions.XPLUS1_YMOINS2)) directions.remove(Directions.SOUTH_EAST);
			if(gridPosOccupations.get(GridPositions.XPLUS2_YMOINS1)) directions.remove(Directions.EAST_SOUTH);
			if(gridPosOccupations.get(GridPositions.XPLUS2)) directions.remove(Directions.EAST_NORTH);
			if(possibleEntry.equals(Directions.NORTH_WEST)) {directions.remove(Directions.NORTH_EAST);}
			if(possibleEntry.equals(Directions.WEST_NORTH)) {directions.remove(Directions.WEST_SOUTH);}
		}
 		return directions;
 	}

	/**
	 * Computes the availability of each coordinates in <GridPositions> based on the starting coordinates (X,Y) <actualPosition>  
	 * @param actualPosition
	 * @return An association GridPositions to Boolean (true if occupied, else false)
	 */
	private EnumMap<GridPositions, Boolean> computesGridPositionsOccupied(Coordinate actualPosition){
		EnumMap<GridPositions, Boolean> posOccupied = new EnumMap<>(GridPositions.class);
		posOccupied.put(GridPositions.YPLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX(), actualPosition.getY() + 1)));
		posOccupied.put(GridPositions.YMOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX(), actualPosition.getY() - 1)));
		posOccupied.put(GridPositions.XMOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 1, actualPosition.getY())));
		posOccupied.put(GridPositions.XPLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 1, actualPosition.getY())));
		posOccupied.put(GridPositions.XY_MOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 1, actualPosition.getY() - 1)));
		posOccupied.put(GridPositions.XY_PLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 1, actualPosition.getY() + 1)));
		posOccupied.put(GridPositions.XPLUS1_YMOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 1, actualPosition.getY() - 1)));
		posOccupied.put(GridPositions.XMOINS1_YPLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 1, actualPosition.getY() + 1)));
		posOccupied.put(GridPositions.YPLUS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX(), actualPosition.getY() + 2)));
		posOccupied.put(GridPositions.YMOINS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX(), actualPosition.getY() - 2)));
		posOccupied.put(GridPositions.XMOINS1_YPLUS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 1, actualPosition.getY() + 2)));
		posOccupied.put(GridPositions.XPLUS1_YPLUS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 1, actualPosition.getY() + 2)));
		posOccupied.put(GridPositions.XPLUS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 2, actualPosition.getY())));
		posOccupied.put(GridPositions.XPLUS2_YMOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 2, actualPosition.getY() - 1)));
		posOccupied.put(GridPositions.XPLUS2_YPLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 2, actualPosition.getY() + 1)));
		posOccupied.put(GridPositions.XMOINS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 2, actualPosition.getY())));
		posOccupied.put(GridPositions.XMOINS2_YPLUS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 2, actualPosition.getY() + 1)));
		posOccupied.put(GridPositions.XMOINS2_YMOINS1, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 2, actualPosition.getY() - 1)));
		posOccupied.put(GridPositions.XMOINS1_YMOINS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() - 1, actualPosition.getY() - 2)));
		posOccupied.put(GridPositions.XPLUS1_YMOINS2, occupiedCoordinates.keySet().contains(new Coordinate(actualPosition.getX() + 1, actualPosition.getY() - 2)));
		return posOccupied; 
	}
 	
 	/**
 	 * Computes the possible exits for LargeRoomType  with NORTH_EAST or EAST_NORTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @param possibleEntry 
 	 * @return A set of authorized exit directions for LargeRoomType with NORTH_EAST or EAST_NORTH as entry
 	 */
 	private Set<Directions> allowedDirectionForNorthEast(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XY_MOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
 			directions.addAll(complexDirections);
			if(gridPosOccupations.get(GridPositions.YPLUS1)) directions.remove(Directions.NORTH_EAST);
			if(gridPosOccupations.get(GridPositions.XMOINS1_YPLUS1)) directions.remove(Directions.NORTH_WEST);
			if(gridPosOccupations.get(GridPositions.XMOINS2)) directions.remove(Directions.WEST_NORTH);
			if(gridPosOccupations.get(GridPositions.XMOINS2_YMOINS1)) directions.remove(Directions.WEST_SOUTH);
			if(gridPosOccupations.get(GridPositions.XMOINS1_YMOINS2)) directions.remove(Directions.SOUTH_WEST);
			if(gridPosOccupations.get(GridPositions.YMOINS2)) directions.remove(Directions.SOUTH_EAST);
			if(gridPosOccupations.get(GridPositions.XPLUS1_YMOINS1)) directions.remove(Directions.EAST_SOUTH);
			if(gridPosOccupations.get(GridPositions.XPLUS1)) directions.remove(Directions.EAST_NORTH);
			if(possibleEntry.equals(Directions.NORTH_EAST)) {directions.remove(Directions.NORTH_WEST);}
			if(possibleEntry.equals(Directions.EAST_NORTH)) {directions.remove(Directions.EAST_SOUTH);}
		}
 		return directions;
 	}
	
	/**
	 * Algorithm of Linear Dungeon Structure Generation
	 */
	private void generateLinearDungeon() throws IllegalArgumentException {  
		int numberofrooms = modelAccess.context.getGamecontext().getNumberOfRooms();
		Room originRoom = createEntryRoom();
		generatedDungeon.setEntry(originRoom);
		generatedDungeon.getRooms().add(originRoom);
		RoomAccess originExitAccess = originRoom.getRoomaccess().get(0);
		
		for (int i = 0; i < numberofrooms + 1; i++) {
			Coordinate nextPosition = getNextCoord(originRoom, originExitAccess.getDirection());
			Map<Directions, Set<Directions>> allowedDirections = getAllowedDirections(nextPosition, oppositeDirections.get(originExitAccess.getDirection()));
			if(allowedDirections.keySet().isEmpty()) {}
			Directions entry = allowedDirections.keySet().stream().collect(Collectors.toList()).get(random.nextInt(allowedDirections.keySet().size()));
			Directions exit;
			if(i != numberofrooms) {
				exit = allowedDirections.get(entry).stream().collect(Collectors.toList()).get(random.nextInt(allowedDirections.get(entry).size())); 
			}else {
				exit = null;
			}
			RoomType roomType = getCompatibleRoomType(entry, exit);
			Coordinate validCoord = getValidCoordinates(entry, nextPosition);
			Room room = createRoom(validCoord.getX(), validCoord.getY(), roomType, originExitAccess, entry, exit);
			if(i != numberofrooms) {originExitAccess = room.getRoomaccess().get(1);} 
			originRoom = room;	
			generatedDungeon.getRooms().add(originRoom);
		}
	}
	
	/*private void printMap(Map<Directions, Set<Directions>> map) {
		System.out.println("***allowed pos***");
		for (Directions d : map.keySet()) {
			System.out.println(d + " : "+map.get(d));
		}
		System.out.println("***");
	}
	
	private void printMap2(Map<Coordinate, Room> map) {
		System.out.println("***allowed pos***");
		for (Coordinate d : map.keySet()) {
			System.out.println(d + " : "+map.get(d));
		}
		System.out.println("***");
	}*/
	
	/**
	 * Function changing the coordinates of the room in order for the coordinates of LargeRoom to always be the one on the bottom-left.
	 * @param entry (The entry direction of the room)
	 * @param position (The position used to select the room)
	 * @return Coordinates of the room (position if simple room or special case, else other coordinates)
	 */
	private Coordinate getValidCoordinates(Directions entry, Coordinate position) { 
		if(entry.equals(Directions.EAST_NORTH) || entry.equals(Directions.NORTH_EAST)) { return new Coordinate(position.getX() - 1, position.getY() - 1); }
		if(entry.equals(Directions.EAST_SOUTH) || entry.equals(Directions.SOUTH_EAST)) { return new Coordinate(position.getX() - 1, position.getY()); }
		if(entry.equals(Directions.WEST_NORTH) || entry.equals(Directions.NORTH_WEST)) { return new Coordinate(position.getX(), position.getY() - 1); }
		return position;
	}
	
	/**
	 * Selection of a RoomType that at least possess the entry and exit directions/access.
	 * @param entry
	 * @param exit
	 * @return Valid RoomType
	 */
	private RoomType getCompatibleRoomType(Directions entry, Directions exit) {
		List<RoomType> roomtypes = new ArrayList<>(modelAccess.gameDescription.getRoomtypes());
		for (int i = 0; i < roomtypes.size(); i++) {
			if(!roomtypes.get(i).getDirections().contains(entry)) {
				roomtypes.remove(i);
				i--;
			}else {
				if(exit != null && !roomtypes.get(i).getDirections().contains(exit)) {
					roomtypes.remove(i);
					i--;
				}
			}
		}
		return roomtypes.get(random.nextInt(roomtypes.size())); 
	}
	
	/*private List<RoomType> getRoomTypesWith(Set<Directions> directions) {
		List<RoomType> roomtypes = new ArrayList<>(gameDescription.getRoomtypes());
		for (int i = 0; i < roomtypes.size(); i++) {
			Set<Directions> intersection = roomtypes.get(i).getDirections().stream().distinct().filter(directions::contains).collect(Collectors.toSet());
			if(intersection.isEmpty()) {
				roomtypes.remove(i);
				i--;
			}
		}
		return roomtypes; 
	}*/
	
	/**
	 * Computes the position coordinates corresponding to the exit direction <origineD> of the starting room <origineR>
	 * @param origineR
	 * @param origineD
	 * @return Temporary coordinates of the next room 
	 */
	private Coordinate getNextCoord(Room origineR, Directions origineD) {
		Coordinate coord = new Coordinate();
		switch (origineD) {
		case SOUTH: coord.setX(origineR.getX()); coord.setY(origineR.getY() - 1); break;
		case SOUTH_EAST: coord.setX(origineR.getX() + 1); coord.setY(origineR.getY() - 1); break;
		case SOUTH_WEST: coord.setX(origineR.getX()); coord.setY(origineR.getY() - 1);  break;
		case NORTH: coord.setX(origineR.getX()); coord.setY(origineR.getY() + 1); break;
		case NORTH_EAST: coord.setX(origineR.getX() + 1); coord.setY(origineR.getY() + 2); break;
		case NORTH_WEST: coord.setX(origineR.getX()); coord.setY(origineR.getY() + 2); break;
		case EAST: coord.setX(origineR.getX() + 1); coord.setY(origineR.getY());break;
		case EAST_SOUTH: coord.setX(origineR.getX() + 2); coord.setY(origineR.getY()); break;
		case EAST_NORTH: coord.setX(origineR.getX() + 2); coord.setY(origineR.getY() + 1); break;
		case WEST: coord.setX(origineR.getX() - 1); coord.setY(origineR.getY()); break;
		case WEST_NORTH: coord.setX(origineR.getX() - 1); coord.setY(origineR.getY() + 1); break;
		case WEST_SOUTH: coord.setX(origineR.getX() - 1); coord.setY(origineR.getY()); break;
		default: break;
		}
		return coord;
	}
	
	/**
	 * Creates an entry room by selecting a RoomType that only as 1 direction/access
	 * @return an entry Room
	 */
	private Room createEntryRoom() {
		List<RoomType> rts = roomsWithOneDirection();
		RoomType rt = rts.get(random.nextInt(rts.size()));		
		return createRoom(0, 0, rt, null, null, rt.getDirections().get(0));
	}
	
	/*private Room createExitRoom(RoomAccess previousRoomExitAccess) {
		List<RoomType> rts = getRoomTypesWith(oppositeDirections.get(previousRoomExitAccess.getDirection()));
		RoomType rt = rts.get(random.nextInt(rts.size()));
		Directions entry = rt.getDirections().stream().distinct().filter(oppositeDirections.get(previousRoomExitAccess.getDirection())::contains).collect(Collectors.toList()).get(0);
		return createRoom(0, 0, rt, previousRoomExitAccess, entry,  null);
	}*/
	
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
	private Room createRoom(int X, int Y, RoomType roomT, RoomAccess previousRoomExitAccess,  Directions entryDirection, Directions exitDirection) {
		Room r = new RoomImpl();
		r.setRoomtype(roomT);
		r.setX(X);
		r.setY(Y);
		
		RoomAccess ra = new RoomAccessImpl();
		if(entryDirection != null) {
			ra.setOtherroomaccess(previousRoomExitAccess);
			ra.setDirection(entryDirection);
			previousRoomExitAccess.setOtherroomaccess(ra);
			r.getRoomaccess().add(ra);
		}
		if(exitDirection != null) {
			ra = new RoomAccessImpl();
			ra.setDirection(exitDirection);
			r.getRoomaccess().add(ra);
		}
		
		addOccupiedCoordinates(r);
		return r;
	}

	/**
	 * Get the RoomTypes with one access/direction only
	 * @return valid RoomTypes
	 */
	private List<RoomType> roomsWithOneDirection() {
		List<RoomType> rts = new ArrayList<>();
		for (RoomType rt : modelAccess.gameDescription.getRoomtypes()) {
			if(rt.getDirections().size() == 1) {
				rts.add(rt);
			}
		}
		return rts;
	}
	
	/**
	 * Add the coordinates of room in the occupiedCoordinates data structures 
	 * @param room
	 */
	private void addOccupiedCoordinates(Room room) {
		Coordinate c = new Coordinate(room.getX(), room.getY());
		occupiedCoordinates.put(new Coordinate(c), room); // X,Y
		if(room.getRoomtype() instanceof LargeRoomType) {
			c.setX(room.getX() + 1); 
			occupiedCoordinates.put(new Coordinate(c), room); // X+1,Y
			c.setY(room.getY() + 1);
			occupiedCoordinates.put(new Coordinate(c), room); // X+1,Y+1
			c.setX(room.getX());
			occupiedCoordinates.put(new Coordinate(c), room); // X,Y+1
		}
	}
		
}
