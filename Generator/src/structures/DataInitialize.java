package structures;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import generator.Directions;

public class DataInitialize {

	/**
	 * Initialization of the Data Structures
	 */
	public static Set<Directions> setSimpleDirections() {
		Set<Directions> simpleDirections = new HashSet<>();
		simpleDirections.add(Directions.SOUTH);
		simpleDirections.add(Directions.NORTH);
		simpleDirections.add(Directions.EAST);
		simpleDirections.add(Directions.WEST);
		return simpleDirections;
	}
	
	public static Set<Directions> setComplexeDirections() {
		Set<Directions> complexDirections = new HashSet<>();
		complexDirections.add(Directions.SOUTH_EAST);
		complexDirections.add(Directions.SOUTH_WEST);
		complexDirections.add(Directions.EAST_NORTH);
		complexDirections.add(Directions.WEST_NORTH);
		complexDirections.add(Directions.NORTH_EAST);
		complexDirections.add(Directions.NORTH_WEST);
		complexDirections.add(Directions.EAST_SOUTH);
		complexDirections.add(Directions.WEST_SOUTH);
		return complexDirections;
	}

	public static EnumMap<Directions, Set<Directions>> setOppositeDirections(){
		EnumMap<Directions, Set<Directions>> oppositeDirections = new EnumMap<>(Directions.class);
		oppositeDirections.put(Directions.SOUTH, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST,Directions.NORTH)));
		oppositeDirections.put(Directions.SOUTH_EAST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST, Directions.NORTH)));
		oppositeDirections.put(Directions.SOUTH_WEST, new HashSet<>(Arrays.asList(Directions.NORTH_EAST, Directions.NORTH_WEST, Directions.NORTH)));
		oppositeDirections.put(Directions.NORTH, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
		oppositeDirections.put(Directions.NORTH_EAST, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
		oppositeDirections.put(Directions.NORTH_WEST, new HashSet<>(Arrays.asList(Directions.SOUTH, Directions.SOUTH_EAST, Directions.SOUTH_WEST)));
		oppositeDirections.put(Directions.EAST, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
		oppositeDirections.put(Directions.EAST_SOUTH, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
		oppositeDirections.put(Directions.EAST_NORTH, new HashSet<>(Arrays.asList(Directions.WEST, Directions.WEST_NORTH, Directions.WEST_SOUTH)));
		oppositeDirections.put(Directions.WEST, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
		oppositeDirections.put(Directions.WEST_SOUTH, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
		oppositeDirections.put(Directions.WEST_NORTH, new HashSet<>(Arrays.asList(Directions.EAST, Directions.EAST_NORTH, Directions.EAST_SOUTH)));
		return oppositeDirections;
	}
	
}
