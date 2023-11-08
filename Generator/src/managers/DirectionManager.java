package managers;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import generator.Directions;
import generator.GameDescription;
import generator.LargeRoomType;
import generator.RoomType;
import generator.SmallRoomType;

public class DirectionManager {

	//private ModelsManager modelAccess; 
	private GameDescription gameDescriptionModel;
	/** Data structure saving for each direction, its opposite directions (e.g., SOUTH => NORTH, NORTH_EAST, NORTH_WEST) */
	private EnumMap<Directions, Set<Directions>> oppositeDirections;
	/** Data structure enumerating simple directions (SOUTH, NORTH, EAST, WEST) */
	private Set<Directions> simpleDirections;
	/** Data structure enumerating complex directions (SOUTH_EAST, SOUTH_WEST, NORTH_EAST, NORTH_WEST, EAST_SOUTH, etc.) */
	private Set<Directions> complexDirections;
		
	public boolean isSmallRoomTypes() {
		List<RoomType> roomtypes = this.gameDescriptionModel.getRoomtypes().getRoomtypes();
		boolean smallRT = false;
		int i = 0;
		while(i < roomtypes.size() && !smallRT ) {
			if(roomtypes.get(i) instanceof SmallRoomType) {smallRT = true;}
			i++;
		}
		return smallRT;
	}
	
	public boolean isLargeRoomTypes() {
		List<RoomType> roomtypes = this.gameDescriptionModel.getRoomtypes().getRoomtypes();
		boolean largeRT = false;
		int i = 0;
		while(i < roomtypes.size() && !largeRT) {
			if(roomtypes.get(i) instanceof LargeRoomType) {largeRT = true;}
			i++;
		}
		return largeRT;
	}
	
	public DirectionManager(GameDescription gameDescriptionModel) {
		this.gameDescriptionModel = gameDescriptionModel;
		if (isLargeRoomTypes()) {setComplexeDirections();}
		if(isSmallRoomTypes()) {setSimpleDirections();}
		oppositeDirections = setOppositeDirections();
	}
	
	private EnumMap<Directions, Set<Directions>> setOppositeDirections(){
		EnumMap<Directions, Set<Directions>> oppositeDirections = new EnumMap<>(Directions.class);
		if(simpleDirections != null && complexDirections != null) {
			oppositeDirections.put(Directions.SOUTH, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST, Directions.NORTH)));
			oppositeDirections.put(Directions.NORTH, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
			oppositeDirections.put(Directions.EAST, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
			oppositeDirections.put(Directions.WEST, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
			oppositeDirections.put(Directions.SOUTH_EAST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST, Directions.NORTH)));
			oppositeDirections.put(Directions.SOUTH_WEST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST, Directions.NORTH)));
			oppositeDirections.put(Directions.NORTH_EAST, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
			oppositeDirections.put(Directions.NORTH_WEST, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
			oppositeDirections.put(Directions.EAST_SOUTH, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
			oppositeDirections.put(Directions.EAST_NORTH, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
			oppositeDirections.put(Directions.WEST_SOUTH, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
			oppositeDirections.put(Directions.WEST_NORTH, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
		}
		else {
			if(simpleDirections != null) {
				oppositeDirections.put(Directions.SOUTH, new HashSet<>(Arrays.asList(Directions.NORTH)));
				oppositeDirections.put(Directions.NORTH, new HashSet<>(Arrays.asList(Directions.SOUTH)));
				oppositeDirections.put(Directions.EAST, new HashSet<>(Arrays.asList(Directions.WEST)));
				oppositeDirections.put(Directions.WEST, new HashSet<>(Arrays.asList(Directions.EAST)));	
			}else {
				oppositeDirections.put(Directions.SOUTH_EAST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST)));
				oppositeDirections.put(Directions.SOUTH_WEST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST)));
				oppositeDirections.put(Directions.NORTH_EAST, new HashSet<>(Arrays.asList(Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
				oppositeDirections.put(Directions.NORTH_WEST, new HashSet<>(Arrays.asList(Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
				oppositeDirections.put(Directions.EAST_SOUTH, new HashSet<>(Arrays.asList(Directions.WEST_NORTH, Directions.WEST_SOUTH)));
				oppositeDirections.put(Directions.EAST_NORTH, new HashSet<>(Arrays.asList(Directions.WEST_NORTH, Directions.WEST_SOUTH)));
				oppositeDirections.put(Directions.WEST_SOUTH, new HashSet<>(Arrays.asList(Directions.EAST_NORTH, Directions.EAST_SOUTH)));
				oppositeDirections.put(Directions.WEST_NORTH, new HashSet<>(Arrays.asList(Directions.EAST_NORTH, Directions.EAST_SOUTH)));
			}
		}
		return oppositeDirections;
	}
	
	public final void setSimpleDirections() {
		simpleDirections = new HashSet<>();
		simpleDirections.add(Directions.SOUTH);
		simpleDirections.add(Directions.NORTH);
		simpleDirections.add(Directions.EAST);
		simpleDirections.add(Directions.WEST);
	}
	
	public final void setComplexeDirections() {
		complexDirections = new HashSet<>();
		complexDirections.add(Directions.SOUTH_EAST);
		complexDirections.add(Directions.SOUTH_WEST);
		complexDirections.add(Directions.EAST_NORTH);
		complexDirections.add(Directions.WEST_NORTH);
		complexDirections.add(Directions.NORTH_EAST);
		complexDirections.add(Directions.NORTH_WEST);
		complexDirections.add(Directions.EAST_SOUTH);
		complexDirections.add(Directions.WEST_SOUTH);
	}
	
	public Set<Directions> getSimpleDirections() {
		return simpleDirections;
	}

	public Set<Directions> getComplexDirections() {
		return complexDirections;
	}

	private EnumMap<Directions, Set<Directions>> getOppositeDirections() {
		return oppositeDirections;
	}	
	
	public Set<Directions> getOppositeDirectionsOf(Directions origin) {
		return new HashSet<>(oppositeDirections.get(origin));
	}
	
	public Set<Directions> getOppositeDirections(Directions direction){
		return oppositeDirections.get(direction);
	}
	
	public boolean isSimpleDirection(Directions direction) {
		return simpleDirections.contains(direction);
	}
	
	public boolean isComplexDirection(Directions direction) {
		return complexDirections.contains(direction);
	}
	
	public Directions getSimpleOppositeDirections(Directions direction) {
		switch (direction) {
		case SOUTH:
			return Directions.NORTH;
		case EAST:
			return Directions.WEST;
		case WEST:
			return Directions.EAST;
		case NORTH:
			return Directions.SOUTH;
		case SOUTH_EAST:
			return Directions.NORTH;
		case SOUTH_WEST:
			return Directions.NORTH;
		case WEST_SOUTH:
			return Directions.EAST;
		case WEST_NORTH:
			return Directions.EAST;
		case EAST_SOUTH:
			return Directions.WEST;
		case EAST_NORTH:
			return Directions.WEST;
		case NORTH_EAST:
			return Directions.SOUTH;
		case NORTH_WEST:
			return Directions.SOUTH;
		default:
			return Directions.NONE;
		}
	}
}
