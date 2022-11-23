package managers;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import generator.Directions;
import generator.LargeRoomType;
import generator.Room;
import models.ModelAccess;
import structures.Coordinate;
import structures.GridPositions;

public class GridManager {

	/** Structure to save occupied Coordinates on a fake grid */
	private Map<Coordinate, Room> occupiedCoordinates;
	private DirectionManager directionManager; 

	
	public GridManager(ModelAccess modelAccess) {
		directionManager = new DirectionManager(modelAccess); 
		occupiedCoordinates = new HashMap<>();
	}
	
	/**
	 * Computes the availability of each coordinates in <GridPositions> based on the starting coordinates (X,Y) <actualPosition>  
	 * @param actualPosition
	 * @return An association GridPositions to Boolean (true if occupied, else false)
	 */
	public EnumMap<GridPositions, Boolean> computesGridPositionsOccupied(Coordinate actualPosition){
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
	
	public void removeAllOccupied(Room room) {
		for (Coordinate entry :  new ArrayList<>(occupiedCoordinates.keySet())) {
			if(occupiedCoordinates.get(entry).equals(room)) {
				occupiedCoordinates.remove(entry);
			}
		}
	}
	
	/**
	 * Function changing the coordinates of the room in order for the coordinates of LargeRoom to always be the one on the bottom-left.
	 * @param entry (The entry direction of the room)
	 * @param position (The position used to select the room)
	 * @return Coordinates of the room (position if simple room or special case, else other coordinates)
	 */
	public Coordinate getValidCoordinates(Directions entry, Coordinate position) { 
		if(entry.equals(Directions.EAST_NORTH) || entry.equals(Directions.NORTH_EAST)) {return new Coordinate(position.getX() - 1, position.getY() - 1);}
		if(entry.equals(Directions.EAST_SOUTH) || entry.equals(Directions.SOUTH_EAST)) {return new Coordinate(position.getX() - 1, position.getY()); }
		if(entry.equals(Directions.WEST_NORTH) || entry.equals(Directions.NORTH_WEST)) {return new Coordinate(position.getX(), position.getY() - 1); }
		return position;
	}
	
	
	/**
	 * For each possible entry entryDirections (in theory), it verifies if the entry is really an option then select its possible exits
	 * @param actualCoordinates
	 * @param entryDirections (i.e., opposition directions of the previous room exit direction; e.g., if previous room exit is SOUTH, then it contains  NORTH, NORTH_EAST, NORTH_WEST)  
	 * @return An association between each verified entryDirection and their possible exits
	 */
 	public EnumMap<Directions, Set<Directions>> getAllowedDirections(Coordinate actualCoordinates, Directions theOriginDirection){
 		Set<Directions> entryDirections = directionManager.getOppositeDirections().get(theOriginDirection);
		EnumMap<Directions, Set<Directions>> originDtoPossibleD = new EnumMap<>(Directions.class); // Possible entry to possible exits 
		EnumMap<GridPositions, Boolean> gridPosOccupations = computesGridPositionsOccupied(actualCoordinates);
		
		// TODO : Corriger bug WEST -> EAST_NORTH allowed but should'nt have been 
		
		Set<Directions> directions;
		for (Directions direction : entryDirections) {
			if(directionManager.isSimpleDirection(direction)) {
				directions = simpleAllowedDirections(gridPosOccupations);
			} else {
				directions = complexAllowedDirections(gridPosOccupations, direction);
			}
			if(!directions.isEmpty()) originDtoPossibleD.put(direction, directions);
		}
		return originDtoPossibleD;
	}
 	
 	private Set<Directions> complexAllowedDirections(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions aDirection){
 		Set<Directions> directions;
 		if(aDirection.equals(Directions.SOUTH_EAST) || aDirection.equals(Directions.EAST_SOUTH)) {
 			directions = allowedDirectionForSouthEast(gridPosOccupations, aDirection);
		} else if(aDirection.equals(Directions.SOUTH_WEST) || aDirection.equals(Directions.WEST_SOUTH)) {
			directions = allowedDirectionForSouthWest(gridPosOccupations, aDirection);
		} else if(aDirection.equals(Directions.WEST_NORTH) || aDirection.equals(Directions.NORTH_WEST)) {
			directions = allowedDirectionForNorthWest(gridPosOccupations, aDirection);
		} else {
			directions = allowedDirectionForNorthEast(gridPosOccupations, aDirection);
		}
 		return directions;
 	}
 	
 	
	/**
 	 * Computes the possible exits for LargeRoomType  with SOUTH_EAST or EAST_SOUTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @return A set of authorized exit directions for LargeRoomType with SOUTH_EAST or EAST_SOUTH as entry
 	 */
 	private Set<Directions> allowedDirectionForSouthEast(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>(directionManager.getComplexDirections());
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XMOINS1_YPLUS1)) {
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
 		Set<Directions> directions = new HashSet<>(directionManager.getComplexDirections());
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XY_PLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1)) {
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
 		Set<Directions> directions = new HashSet<>(directionManager.getComplexDirections());
 		if(!gridPosOccupations.get(GridPositions.XPLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1_YMOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
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
 	 * Computes the possible exits for LargeRoomType  with NORTH_EAST or EAST_NORTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @param possibleEntry 
 	 * @return A set of authorized exit directions for LargeRoomType with NORTH_EAST or EAST_NORTH as entry
 	 */
 	private Set<Directions> allowedDirectionForNorthEast(EnumMap<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>(directionManager.getComplexDirections());
 		if(!gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XY_MOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
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
 	
 	private Set<Directions> simpleAllowedDirections(EnumMap<GridPositions, Boolean> gridPosOccupations) {
 		Set<Directions> directions = new HashSet<>(directionManager.getSimpleDirections());
		if(gridPosOccupations.get(GridPositions.YPLUS1)) {directions.remove(Directions.NORTH);}
		if(gridPosOccupations.get(GridPositions.YMOINS1)) {directions.remove(Directions.SOUTH);}
		if(gridPosOccupations.get(GridPositions.XMOINS1)) {directions.remove(Directions.WEST);}
		if(gridPosOccupations.get(GridPositions.XPLUS1)) {directions.remove(Directions.EAST);}
		return directions;
 	}
 	
	/**
	 * Computes the position coordinates corresponding to the exit direction <origineD> of the starting room <origineR>
	 * @param origineR
	 * @param origineD
	 * @return Temporary coordinates of the next room 
	 */
	public Coordinate getNextCoord(Room origineR, Directions origineD) {
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
		//System.out.println(occupiedCoordinates.containsKey(coord));
		return coord;
	}
 	
	/**
	 * Add the coordinates of room in the occupiedCoordinates data structures 
	 * @param room
	 */
	public void addOccupiedCoordinates(Room room) {
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
