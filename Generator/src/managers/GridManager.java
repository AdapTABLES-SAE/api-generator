package managers;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import generator.Directions;
import generator.LargeRoomType;
import generator.Room;
import generator.SmallRoomType;
import structures.Coordinate;
import structures.GridPositions;
import structures.LinearRoomOrientations;
import structures.NeighborAccess;

public class GridManager {

	/** Structure to save occupied Coordinates on a fake grid */
	public Map<Coordinate, Room> occupiedCoordinates;
	private DirectionManager directionManager; 

	
	public GridManager(ModelsManager modelAccess) {
		directionManager = new DirectionManager(modelAccess.getGameDescriptionModel()); 
		occupiedCoordinates = new HashMap<>();
	}
	
	public void clearGrid() {
		occupiedCoordinates = new HashMap<>();
	}
	
	public Set<Coordinate> getOccupiedCoordinates(){
		return this.occupiedCoordinates.keySet();
	}
	
	public boolean isAvailableDirection(Coordinate origin, Directions aDirection) {
		Coordinate coord = null;
		switch (aDirection) {
		case SOUTH:
			coord = new Coordinate(origin.getX(), origin.getY()-1);
			break;
		case SOUTH_WEST:
			coord = new Coordinate(origin.getX(), origin.getY()-1);
			break;
		case SOUTH_EAST:
			coord = new Coordinate(origin.getX()+1, origin.getY()-1);
			break;
		case NORTH:
			coord = new Coordinate(origin.getX(), origin.getY()+1);
			break;
		case NORTH_WEST:
			coord = new Coordinate(origin.getX(), origin.getY()+2);
			break;
		case NORTH_EAST:
			coord = new Coordinate(origin.getX()+1, origin.getY()+2);
			break;		
		case WEST:
			coord = new Coordinate(origin.getX()-1, origin.getY());
			break;
		case WEST_NORTH:
			coord = new Coordinate(origin.getX()-1, origin.getY()+1);
			break;
		case WEST_SOUTH:
			coord = new Coordinate(origin.getX()-1, origin.getY());
			break;
		case EAST:
			coord = new Coordinate(origin.getX()+1, origin.getY());
			break;
		case EAST_SOUTH:
			coord = new Coordinate(origin.getX()+2, origin.getY());
			break;
		case EAST_NORTH:
			coord = new Coordinate(origin.getX()+2, origin.getY()+1);
			break;
		default:
			break;
		}		
		return !occupiedCoordinates.containsKey(coord);
	}
	
	private boolean roomTypeofRoomAsPossibleAccess(Coordinate roomCoord, Directions direction) {
		Set<Directions> oppositeDirections = directionManager.getOppositeDirections(direction);
		
		for (Directions directionOp : oppositeDirections) {
			if(occupiedCoordinates.get(roomCoord).getRoomtype().getDirections().contains(directionOp)) {
				return true;
			}
		}
		
		return false;
	}
	
	public List<NeighborAccess> getNeighbors(Coordinate roomCoord, boolean isSimpleRoom){
		List<NeighborAccess> neighbors = new ArrayList<>();
		
		Coordinate v2 = new Coordinate(roomCoord.getX(), roomCoord.getY() - 1);
		Coordinate v3 = new Coordinate(roomCoord.getX() - 1, roomCoord.getY());
		Directions dirV2, dirV3;
		
		if(isSimpleRoom) {
			Coordinate v1 = new Coordinate(roomCoord.getX(), roomCoord.getY() + 1);
			Coordinate v4 = new Coordinate(roomCoord.getX() + 1, roomCoord.getY());
			if(occupiedCoordinates.keySet().contains(v1) && roomTypeofRoomAsPossibleAccess(v1, Directions.NORTH)) {neighbors.add(createNeighborWithAccesses(true, roomCoord, occupiedCoordinates.get(v1), Directions.NORTH));}
			if(occupiedCoordinates.keySet().contains(v4)&& roomTypeofRoomAsPossibleAccess(v4, Directions.EAST)) {neighbors.add(createNeighborWithAccesses(true, roomCoord, occupiedCoordinates.get(v4), Directions.EAST));}
			dirV2 = Directions.SOUTH;
			dirV3 = Directions.WEST;
		}else {
			Coordinate v5 = new Coordinate(roomCoord.getX() - 1, roomCoord.getY() + 1);
			Coordinate v6 = new Coordinate(roomCoord.getX(), roomCoord.getY() + 2);
			Coordinate v7 = new Coordinate(roomCoord.getX() + 1, roomCoord.getY() + 2);
			Coordinate v8 = new Coordinate(roomCoord.getX() + 2, roomCoord.getY() + 1);
			Coordinate v9 = new Coordinate(roomCoord.getX() + 2, roomCoord.getY());
			Coordinate v10 = new Coordinate(roomCoord.getX() + 1, roomCoord.getY() - 1);
			
			if(occupiedCoordinates.keySet().contains(v5) && roomTypeofRoomAsPossibleAccess(v5, Directions.WEST_NORTH)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v5), Directions.WEST_NORTH));}
			if(occupiedCoordinates.keySet().contains(v6) && roomTypeofRoomAsPossibleAccess(v6, Directions.NORTH_WEST)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v6), Directions.NORTH_WEST));}
			if(occupiedCoordinates.keySet().contains(v7) && roomTypeofRoomAsPossibleAccess(v7, Directions.NORTH_EAST)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v7), Directions.NORTH_EAST));}
			if(occupiedCoordinates.keySet().contains(v8) && roomTypeofRoomAsPossibleAccess(v8, Directions.EAST_NORTH)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v8), Directions.EAST_NORTH));}
			if(occupiedCoordinates.keySet().contains(v9) && roomTypeofRoomAsPossibleAccess(v9, Directions.EAST_SOUTH)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v9), Directions.EAST_SOUTH));}
			if(occupiedCoordinates.keySet().contains(v10) && roomTypeofRoomAsPossibleAccess(v10, Directions.SOUTH_EAST)) {neighbors.add(createNeighborWithAccesses(false, roomCoord, occupiedCoordinates.get(v10), Directions.SOUTH_EAST));}
			dirV2 = Directions.SOUTH_WEST;
			dirV3 = Directions.WEST_SOUTH;
		}
		
		if(occupiedCoordinates.keySet().contains(v2) && roomTypeofRoomAsPossibleAccess(v2, dirV2)) {neighbors.add(createNeighborWithAccesses(isSimpleRoom, roomCoord, occupiedCoordinates.get(v2), dirV2));}
		if(occupiedCoordinates.keySet().contains(v3) && roomTypeofRoomAsPossibleAccess(v3, dirV3)) {neighbors.add(createNeighborWithAccesses(isSimpleRoom, roomCoord, occupiedCoordinates.get(v3), dirV3));}
		
		return neighbors;
	}
	
	private NeighborAccess createNeighborWithAccesses(boolean originIsSimpleRoom, Coordinate origin, Room neighbor, Directions originAccessToRoom) {
		if(neighbor.getRoomtype() instanceof SmallRoomType) {
			return new NeighborAccess(neighbor, originAccessToRoom, directionManager.getSimpleOppositeDirections(originAccessToRoom));
		}
		Directions neighborAccess = Directions.NONE; 
		Coordinate v1;
		if(originIsSimpleRoom) {
			switch (originAccessToRoom) {
			case WEST:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() + 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.EAST_SOUTH;
				} else {neighborAccess = Directions.EAST_NORTH;}
				break;
			case NORTH:
				v1 = new Coordinate(origin.getX() + 1, origin.getY() + 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.SOUTH_WEST;
				} else {neighborAccess = Directions.SOUTH_EAST;}
				break;
			case EAST:
				v1 = new Coordinate(origin.getX() + 1, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.WEST_NORTH;
				} else {neighborAccess = Directions.WEST_SOUTH;}
				break;
			case SOUTH:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.SOUTH_EAST;
				} else {neighborAccess = Directions.SOUTH_WEST;}
				break;
			default:
				break;
			}
		} else {
			switch (originAccessToRoom) {
			case WEST_SOUTH:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.EAST_NORTH;
				} else {neighborAccess = Directions.EAST_SOUTH;}
				break;
			case WEST_NORTH:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() + 2);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.EAST_SOUTH;
				} else {neighborAccess = Directions.EAST_NORTH;}
				break;	
			case NORTH_WEST:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() + 2);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.SOUTH_EAST;
				} else {neighborAccess = Directions.SOUTH_WEST;}
				break;
			case NORTH_EAST:
				v1 = new Coordinate(origin.getX() + 2, origin.getY() + 2);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.SOUTH_WEST;
				} else {neighborAccess = Directions.SOUTH_EAST;}
				break;
			case EAST_NORTH:
				v1 = new Coordinate(origin.getX() + 2, origin.getY() + 2);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.WEST_SOUTH;
				} else {neighborAccess = Directions.WEST_NORTH;}
				break;
			case EAST_SOUTH:
				v1 = new Coordinate(origin.getX() + 2, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.WEST_NORTH;
				} else {neighborAccess = Directions.WEST_SOUTH;}
				break;
			case SOUTH_EAST:
				v1 = new Coordinate(origin.getX() + 2, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.NORTH_WEST;
				} else {neighborAccess = Directions.NORTH_EAST;}
				break;
			case SOUTH_WEST:
				v1 = new Coordinate(origin.getX() - 1, origin.getY() - 1);
				if(occupiedCoordinates.keySet().contains(v1) && occupiedCoordinates.get(v1).equals(neighbor)) {
					neighborAccess = Directions.SOUTH_EAST;
				} else {neighborAccess = Directions.SOUTH_WEST;}
				break;
			default:
				break;
			}
		}
		if(neighborAccess.equals(Directions.NONE)) {return null;}
		return new NeighborAccess(neighbor, originAccessToRoom, neighborAccess);
	}
	
	/**
	 * Computes the availability of each coordinates in <GridPositions> based on the starting coordinates (X,Y) <actualPosition>  
	 * @param actualPosition
	 * @return An association GridPositions to Boolean (true if occupied, else false)
	 */
	public Map<GridPositions, Boolean> computesGridPositionsOccupied(Coordinate actualPosition){
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
 	public LinearRoomOrientations getAllowedDirections(Coordinate actualCoordinates, Directions theOriginDirection){
 		Set<Directions> entryDirections = directionManager.getOppositeDirectionsOf(theOriginDirection);
 		LinearRoomOrientations roomOrientations = new LinearRoomOrientations(); // Possible entry to possible exits 
		Map<GridPositions, Boolean> gridPosOccupations = computesGridPositionsOccupied(actualCoordinates);
		
		Set<Directions> directions;
		for (Directions direction : entryDirections) {
			if(directionManager.getSimpleDirections().contains(direction)) {
				directions = simpleAllowedDirections(gridPosOccupations);
			} else {
				directions = complexeAllowedDirections(gridPosOccupations, direction);
			}
			if(!directions.isEmpty()) roomOrientations.addAnOrientation(direction, directions);
		}
		return roomOrientations;
	}
 	
 	public Set<Directions> getAllowedNewRoomEntries(Coordinate actualCoordinates, Directions theOriginDirection){
 		Set<Directions> entryDirections = directionManager.getOppositeDirectionsOf(theOriginDirection);
		Map<GridPositions, Boolean> gridPosOccupations = computesGridPositionsOccupied(actualCoordinates);
		for (Directions direction : new ArrayList<>(entryDirections)) {
			if(directionManager.getSimpleDirections().contains(direction)) {
				if(simpleAllowedDirections(gridPosOccupations).isEmpty()) {
					entryDirections.remove(direction);
				}
			} else {
				if(complexeAllowedDirections(gridPosOccupations, direction).isEmpty()) {
					entryDirections.remove(direction);
				}
			}
		}
		return entryDirections;
 	}
 	
 	public Set<Directions> simpleAllowedDirections(Map<GridPositions, Boolean> gridPosOccupations){
 		Set<Directions> directions = new HashSet<>(directionManager.getSimpleDirections());
		if(gridPosOccupations.get(GridPositions.YPLUS1)) {directions.remove(Directions.NORTH);}
		if(gridPosOccupations.get(GridPositions.YMOINS1)) {directions.remove(Directions.SOUTH);}
		if(gridPosOccupations.get(GridPositions.XMOINS1)) {directions.remove(Directions.WEST);}
		if(gridPosOccupations.get(GridPositions.XPLUS1)) {directions.remove(Directions.EAST);}
		return directions;
 	}
 	
 	public Set<Directions> complexeAllowedDirections(Map<GridPositions, Boolean> gridPosOccupations, Directions direction){
 		if(direction.equals(Directions.SOUTH_EAST) || direction.equals(Directions.EAST_SOUTH)) {
			return allowedDirectionForSouthEast(gridPosOccupations, direction);
		} else if(direction.equals(Directions.SOUTH_WEST) || direction.equals(Directions.WEST_SOUTH)) {
			return allowedDirectionForSouthWest(gridPosOccupations, direction);
		} else if(direction.equals(Directions.WEST_NORTH) || direction.equals(Directions.NORTH_WEST) ) {
			return allowedDirectionForNorthWest(gridPosOccupations, direction);
		} else {
			return allowedDirectionForNorthEast(gridPosOccupations, direction);
		}
 	}
 	
	/**
 	 * Computes the possible exits for LargeRoomType  with SOUTH_EAST or EAST_SOUTH as entry
 	 * @param gridPosOccupations (Association between Coordinates and their occupation : true is occupied)
 	 * @return A set of authorized exit directions for LargeRoomType with SOUTH_EAST or EAST_SOUTH as entry
 	 */
 	private Set<Directions> allowedDirectionForSouthEast(Map<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XMOINS1_YPLUS1)) {
 			directions.addAll(directionManager.getComplexDirections());
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
 	private Set<Directions> allowedDirectionForSouthWest(Map<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.YPLUS1) && !gridPosOccupations.get(GridPositions.XY_PLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1)) {
 			directions.addAll(directionManager.getComplexDirections());
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
 	private Set<Directions> allowedDirectionForNorthWest(Map<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>(); 
 		if(!gridPosOccupations.get(GridPositions.XPLUS1) && !gridPosOccupations.get(GridPositions.XPLUS1_YMOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
 			directions.addAll(directionManager.getComplexDirections());
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
 	private Set<Directions> allowedDirectionForNorthEast(Map<GridPositions, Boolean> gridPosOccupations, Directions possibleEntry){
 		Set<Directions> directions = new HashSet<>();
 		if(!gridPosOccupations.get(GridPositions.XMOINS1) && !gridPosOccupations.get(GridPositions.XY_MOINS1) && !gridPosOccupations.get(GridPositions.YMOINS1)) {
 			directions.addAll(directionManager.getComplexDirections());
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

	public Coordinate getNextCoordForPortalRoom() {
		Coordinate coord = new Coordinate(100, 100);
		while(occupiedCoordinates.containsKey(coord)) {
			coord.setX(coord.getX() + 100);
			coord.setY(coord.getY() + 100);
		}
		return coord;
	}
	
}
