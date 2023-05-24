package educational_dimension;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import generator.Dungeon;
import generator.Room;
import generators.ALGAGenerator;

class TasksRepartitionInDungeonTests {

	Map<String, Integer> numberOfRoomsByTasks;
	
	@BeforeEach
	void init() {
		numberOfRoomsByTasks = new HashMap<>();
	}
		
	@Test
	void checkTaskRepartitionInInitialConfigGameLevel1Linear() { // 6 salles avec questions
        ALGAGenerator generator = new ALGAGenerator(true, "ContextForTaskTest_1a.xmi");
		computeNumberOfRoomPerTask(generator.generate());
		assertFalse(numberOfRoomsByTasks.containsKey("TASK-C1_1")); // doit valoir zéro
        assertTrue(numberOfRoomsByTasks.get("TASK-C1_2") == 1, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("TASK-ID") == 2, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("TASK-MEMB") == 1, "TASK-MEMB");
	}
	
	@Test
	void checkTaskRepartitionInInitialConfigGameLevel1Labyrinthine() { // 6 salles avec questions       
        ALGAGenerator generator = new ALGAGenerator(true, "ContextForTaskTest_1b.xmi");
		computeNumberOfRoomPerTask(generator.generate());
		assertFalse(numberOfRoomsByTasks.containsKey("TASK-C1_1")); // doit valoir zéro
        assertTrue(numberOfRoomsByTasks.get("TASK-C1_2") == 1, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("TASK-ID") == 2, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("TASK-MEMB") == 1, "TASK-MEMB");
	}
	
	/*@Test
	void checkTaskRepartitionInInitialConfigAtGameLevel15() { // 20 salles avec questions
		testMethodInitialConfigAtLevel15("ContextForTaskTest_2a.xmi"); // LINEAR
		testMethodInitialConfigAtLevel15("ContextForTaskTest_2b.xmi"); // LABYRITHINE
	}*/
	
	@Test
	void checkTaskRepartitionInInitialConfigAtGameLevel15Linear() { // 20 salles avec questions
		ALGAGenerator generator = new ALGAGenerator(true, "ContextForTaskTest_2a.xmi");
		computeNumberOfRoomPerTask(generator.generate());
		assertTrue(numberOfRoomsByTasks.get("TASK-C1_1") == 1, "TASK-C1_1");
        assertTrue(numberOfRoomsByTasks.get("TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("TASK-MEMB") == 2, "TASK-MEMB");
	}
	
	@Test
	void checkTaskRepartitionInInitialConfigAtGameLevel15Labyrinthine() { // 20 salles avec questions
		ALGAGenerator generator = new ALGAGenerator(true, "ContextForTaskTest_2b.xmi");
		computeNumberOfRoomPerTask(generator.generate());
		assertTrue(numberOfRoomsByTasks.get("TASK-C1_1") == 1, "TASK-C1_1");
        assertTrue(numberOfRoomsByTasks.get("TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("TASK-MEMB") == 2, "TASK-MEMB");
	}
	
	private void computeNumberOfRoomPerTask(Dungeon dungeon) {
		for (Room room : dungeon.getRooms()) {
			if(room.getTask() != null) {
				if(!numberOfRoomsByTasks.containsKey(room.getTask().getID())) {
					numberOfRoomsByTasks.put(room.getTask().getID(), 1);
				} else {
					numberOfRoomsByTasks.put(room.getTask().getID(), numberOfRoomsByTasks.get(room.getTask().getID()) + 1);
				}
			}
		}
	}

}
