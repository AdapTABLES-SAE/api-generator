package structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import generator.Directions;
import generator.EnterResponse;
import generator.GameDescription;
import generator.LargeRoomType;
import generator.MultipleChoice;
import generator.ResponseModality;
import generator.RoomType;
import generator.SmallRoomType;
import generator.TaskType;

public class DataAccess {
	

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
	
	public static List<RoomType> getCompatibleRoomType(TaskType taskType, GameDescription gD){
		List<RoomType> roomTs = new ArrayList<>(gD.getRoomtypes().getRoomtypes());
		roomTs = roomTs.stream().filter(e -> e.getDirections().size() > 1).collect(Collectors.toList());
		
		for (RoomType roomType : gD.getRoomtypes().getRoomtypes()) {		
			switch (taskType.getClass().getName()) {
				case "CompletionType":
					boolean hasChoices = false; boolean hasEntry = false;
					for (ResponseModality rm : taskType.getResponsemodalities()) {
						if(rm instanceof MultipleChoice) {
							hasChoices = true;
						}else if(rm instanceof EnterResponse) {
							hasEntry = true;
						}
						
					}
					if((!hasEntry && roomType instanceof LargeRoomType) || (!hasChoices && roomType instanceof SmallRoomType)) {
						roomTs.remove(roomType);
					}
					break;
				case "ResultVerificationType":
					if(roomType instanceof SmallRoomType) {
						roomTs.remove(roomType);
					}
					break;	
				case "ReconstructionType":
					if(roomType instanceof LargeRoomType) {
						roomTs.remove(roomType);
					}
					break;	
				default:
					break;
			}
		}
		return roomTs;		
	}
	
	public static List<String> getCompatibleRoomTypeSize(TaskType taskType){
		List<String> roomTsize = new ArrayList<>();
		roomTsize.add("SMALL");
		roomTsize.add("LARGE");
		switch (taskType.getClass().getName()) {
		case "CompletionType":
			boolean hasChoices = false; boolean hasEntry = false;
			for (ResponseModality rm : taskType.getResponsemodalities()) {
				if(rm instanceof MultipleChoice) {
					hasChoices = true;
				}else if(rm instanceof EnterResponse) {
					hasEntry = true;
				}
				
			}
			if(!hasChoices) {
				roomTsize.remove("SMALL");
			}
			if(!hasEntry) {
				roomTsize.remove("LARGE");
			}
			break;
		case "ResultVerificationType":
			roomTsize.remove("SMALL");
			break;	
		case "ReconstructionType":
			roomTsize.remove("LARGE");
			break;	
		default:
			break;
	}
		return roomTsize;	
	}
}
