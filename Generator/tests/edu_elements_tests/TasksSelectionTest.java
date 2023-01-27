package edu_elements_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import generator.Dungeon;
import generator.Room;
import generators.ALGAGenerator;

class TasksSelectionTest {

	Map<String, Integer> numberOfRoomsByTasks;
	
	@BeforeEach
	void init() {
		numberOfRoomsByTasks = new HashMap<>();
	}
	
	@RepeatedTest(30)
	void initialConfigurationAllTasksLinear() {
		numberOfRoomsByTasks = new HashMap<>();
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Init.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				if(!numberOfRoomsByTasks.containsKey(room.getTask().getID())) {
					numberOfRoomsByTasks.put(room.getTask().getID(), 1);
				} else {
					numberOfRoomsByTasks.put(room.getTask().getID(), numberOfRoomsByTasks.get(room.getTask().getID()) + 1);
				}
			}
		}
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("C1-RES") == 2, "C1-RES");
        assertTrue(numberOfRoomsByTasks.get("C1-TABOP") == 1, "C1-TABOP");
        assertTrue(numberOfRoomsByTasks.get("C2-OPTABLE") == 1, "C2-OPTABLE");
        assertTrue(numberOfRoomsByTasks.get("REB") == 2, "REB");
        assertTrue(numberOfRoomsByTasks.get("ID-RES") == 2, "ID-RES");
        assertTrue(numberOfRoomsByTasks.get("MEMB") == 1, "MEMB");
	}
	
	@RepeatedTest(30)
	void initialConfigurationAllTasksLabyrinthine() {
		numberOfRoomsByTasks = new HashMap<>();
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Init_Labyrinthine.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				if(!numberOfRoomsByTasks.containsKey(room.getTask().getID())) {
					numberOfRoomsByTasks.put(room.getTask().getID(), 1);
				} else {
					numberOfRoomsByTasks.put(room.getTask().getID(), numberOfRoomsByTasks.get(room.getTask().getID()) + 1);
				}
			}
		}
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("C1-RES") == 2, "C1-RES");
        assertTrue(numberOfRoomsByTasks.get("C1-TABOP") == 1, "C1-TABOP");
        assertTrue(numberOfRoomsByTasks.get("C2-OPTABLE") == 1, "C2-OPTABLE");
        assertTrue(numberOfRoomsByTasks.get("REB") == 2, "REB");
        assertTrue(numberOfRoomsByTasks.get("ID-RES") == 2, "ID-RES");
        assertTrue(numberOfRoomsByTasks.get("MEMB") == 1, "MEMB");
	}
	
	@RepeatedTest(30)
	void configurationOneTaskAchievedLinear() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case1.xmi"); 
		Dungeon dungeon = generator.generate();
		List<String> tasksIDs = new ArrayList<>();
		for (Room room : dungeon.getRooms()) {
			if(room.getTask() != null) {
				tasksIDs.add(room.getTask().getID());
			}
		}
		assertFalse(tasksIDs.contains("C1-RES"), "C1-RES");
	}
	
	@RepeatedTest(30)
	void configurationOneTaskAchievedLabyrinthine() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case1_Labyrinthine.xmi"); 
		Dungeon dungeon = generator.generate();
		List<String> tasksIDs = new ArrayList<>();
		for (Room room : dungeon.getRooms()) {
			if(room.getTask() != null) {
				tasksIDs.add(room.getTask().getID());
			}
		}
		assertFalse(tasksIDs.contains("C1-RES"), "C1-RES");
	}
	
	@RepeatedTest(30)
	void configurationAllTaskSuccessSup0Linear() {
		numberOfRoomsByTasks = new HashMap<>();
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case2.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				if(!numberOfRoomsByTasks.containsKey(room.getTask().getID())) {
					numberOfRoomsByTasks.put(room.getTask().getID(), 1);
				} else {
					numberOfRoomsByTasks.put(room.getTask().getID(), numberOfRoomsByTasks.get(room.getTask().getID()) + 1);
				}
			}
		}
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("C1-RES") == 2, "C1-RES");
        assertTrue(numberOfRoomsByTasks.get("C1-TABOP") == 1, "C1-TABOP");
        assertTrue(numberOfRoomsByTasks.get("C2-OPTABLE") == 1, "C2-OPTABLE");
        assertTrue(numberOfRoomsByTasks.get("REB") == 2, "REB");
        assertTrue(numberOfRoomsByTasks.get("ID-RES") == 2, "ID-RES");
        assertTrue(numberOfRoomsByTasks.get("MEMB") == 1, "MEMB");
	}
	
	@RepeatedTest(30)
	void configurationAllTaskSuccessSup0Labyrinthine() {
		numberOfRoomsByTasks = new HashMap<>();
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case2_Labyrinthine.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				if(!numberOfRoomsByTasks.containsKey(room.getTask().getID())) {
					numberOfRoomsByTasks.put(room.getTask().getID(), 1);
				} else {
					numberOfRoomsByTasks.put(room.getTask().getID(), numberOfRoomsByTasks.get(room.getTask().getID()) + 1);
				}
			}
		}
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("C1-RES") == 2, "C1-RES");
        assertTrue(numberOfRoomsByTasks.get("C1-TABOP") == 1, "C1-TABOP");
        assertTrue(numberOfRoomsByTasks.get("C2-OPTABLE") == 1, "C2-OPTABLE");
        assertTrue(numberOfRoomsByTasks.get("REB") == 2, "REB");
        assertTrue(numberOfRoomsByTasks.get("ID-RES") == 2, "ID-RES");
        assertTrue(numberOfRoomsByTasks.get("MEMB") == 1, "MEMB");
	}
	
	@RepeatedTest(30)
	void configurationOnlyOneTaskIsLeftLinear() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case3.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				 assertTrue(room.getTask().getID().equals("MEMB"), "MEMB");	
			}
		}       
	}
	
	@RepeatedTest(30)
	void configurationOnlyOneTaskIsLeftLabyrinthine() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Case3_Labyrinthine.xmi"); 
		Dungeon dungeon = generator.generate();
		for (Room room : dungeon.getRooms()) {
			if(!room.equals(dungeon.getEntry()) && room.getTask() != null) {
				 assertTrue(room.getTask().getID().equals("MEMB"), "MEMB");	
			}
		}       
	}
}
