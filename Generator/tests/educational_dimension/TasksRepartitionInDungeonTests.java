package educational_dimension;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import exceptions.NonExistantLearnerPlayerException;
import generator.Dungeon;
import generator.Room;
import generators.ALGAGenerator;

class TasksRepartitionInDungeonTests { 

	private Map<String, Integer> numberOfRoomsByTasks;
	private ALGAGenerator generator;
	private static final String LINEAR_CONTEXT = "Context_Linear.xmi";
	private static final String LABYRINTHINE_CONTEXT = "Context_Labyrinthine.xmi";
	
	private void generateAndComputes(String learnerID, String contextFile) throws NonExistantLearnerPlayerException {
		numberOfRoomsByTasks = new HashMap<>();
		generator = new ALGAGenerator(true, learnerID, contextFile);
		computeNumberOfRoomPerTask(generator.generate());
	}
	
	private int sumNumberOfRooms() {
		int sum = 0;
		for(String key : numberOfRoomsByTasks.keySet()) {
			sum += numberOfRoomsByTasks.get(key);
		}
		return sum;
	}
	
	@Test
	void everyTasksAt0Test() throws NonExistantLearnerPlayerException { 
        
		generateAndComputes("LP002", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST1 
		System.out.println(numberOfRoomsByTasks);
		assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C1_1")); 
        assertTrue(!numberOfRoomsByTasks.containsKey("T1_TASK-C1_2") || numberOfRoomsByTasks.get("T1_TASK-C1_2") == 1);
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 2, "TASK-ID");
        assertTrue(!numberOfRoomsByTasks.containsKey("T1_TASK-MEMB") || numberOfRoomsByTasks.get("T1_TASK-MEMB") == 1);
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP002B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "T1_TASK-C1_1"); 
        assertTrue( numberOfRoomsByTasks.get("T1_TASK-C1_2") == 1, "T1_TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 3, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 2, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 1, "T1_TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP003", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP003", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST1
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP010", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 1, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 1, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 1, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP010B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 2 || numberOfRoomsByTasks.get("T2_TASK-C1") == 3, "TASK-C1");  
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 2 || numberOfRoomsByTasks.get("T2_TASK-C2") == 3, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 2 || numberOfRoomsByTasks.get("T2_TASK-REB") == 3, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 2 || numberOfRoomsByTasks.get("T2_TASK-ID") == 3, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 2 || numberOfRoomsByTasks.get("T2_TASK-MEMB") == 3, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP011", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 4, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 4, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 4, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP011", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 4, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 4, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 4, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
	}
	
	@Test
	void everyTasksUnfinishedButSupTo0Test() throws NonExistantLearnerPlayerException {
		generateAndComputes("LP004", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST1 
		System.out.println("LP004 "+numberOfRoomsByTasks);
		assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C1_1")); 
        assertTrue(!numberOfRoomsByTasks.containsKey("T1_TASK-C1_2") || numberOfRoomsByTasks.get("T1_TASK-C1_2") == 1);
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 2, "TASK-ID");
        assertTrue(!numberOfRoomsByTasks.containsKey("T1_TASK-MEMB") || numberOfRoomsByTasks.get("T1_TASK-MEMB") == 1);
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP004B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "T1_TASK-C1_1"); 
        assertTrue( numberOfRoomsByTasks.get("T1_TASK-C1_2") == 1, "T1_TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 3, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 2, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 1, "T1_TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP005", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST1
		System.out.println("LP005 "+numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP005", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST1
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 2, "TASK-C1_2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C2") == 5, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 6, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP012", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST2
		System.out.println("LP012 "+numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 1, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 1, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 1, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 1, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP012B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST2
		System.out.println(this.numberOfRoomsByTasks+" LP012B");
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 2 || numberOfRoomsByTasks.get("T2_TASK-C1") == 3, "TASK-C1");  
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 2 || numberOfRoomsByTasks.get("T2_TASK-C2") == 3, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 2 || numberOfRoomsByTasks.get("T2_TASK-REB") == 3, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 2 || numberOfRoomsByTasks.get("T2_TASK-ID") == 3, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 2 || numberOfRoomsByTasks.get("T2_TASK-MEMB") == 3, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        System.out.println(sumNumberOfRooms());
        
		generateAndComputes("LP013", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 4, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 4, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 4, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP013", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 4, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 4, "TASK-C2");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-REB") == 4, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 4, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 4, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
	}
		
	@Test
	void oneTaskFinishedDoesNotAppearAnymoreTest() throws NonExistantLearnerPlayerException {
		generateAndComputes("LP006", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST1 
		System.out.println(numberOfRoomsByTasks);
		assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C1_1")); 
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 1, "TASK-C1_2");
        assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C2"));
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 1, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 2, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 1, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP006B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks+" LP006");
		assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C1_1"));
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 2, "TASK-C1_2");
        assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C2"));
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 3, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 5, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP007", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 3, "TASK-C1_2");
        assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C2"));
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 5, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 8, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 3, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP007", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 1, "TASK-C1_1"); 
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_2") == 3, "TASK-C1_2");
        assertFalse(numberOfRoomsByTasks.containsKey("T1_TASK-C2"));
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-REB") == 5, "TASK-REB");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-ID") == 8, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-MEMB") == 3, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP014", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 1 || numberOfRoomsByTasks.get("T2_TASK-C1") == 2, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 1 || numberOfRoomsByTasks.get("T2_TASK-C2") == 2, "TASK-C2");
        assertFalse(numberOfRoomsByTasks.containsKey("T2_TASK-REB"));
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 1 || numberOfRoomsByTasks.get("T2_TASK-ID") == 2, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 1 || numberOfRoomsByTasks.get("T2_TASK-MEMB") == 2, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP014B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 3, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 3, "TASK-C2");
        assertFalse(numberOfRoomsByTasks.containsKey("T2_TASK-REB"));
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 3, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 3, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP015", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 5, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 5, "TASK-C2");
        assertFalse(numberOfRoomsByTasks.containsKey("T2_TASK-REB"));
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 5, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 5, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP015", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 5, "TASK-C1"); 
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-C2") == 5, "TASK-C2");
        assertFalse(numberOfRoomsByTasks.containsKey("T2_TASK-REB"));
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-ID") == 5, "TASK-ID");
        assertTrue(numberOfRoomsByTasks.get("T2_TASK-MEMB") == 5, "TASK-MEMB");
        assertTrue(sumNumberOfRooms() == 20);
	}
	
	@Test
	void allTaskFinishedButOneTest() throws NonExistantLearnerPlayerException {
		generateAndComputes("LP008", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST1 
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 5, "TASK-C1_1");
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP008B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		System.out.println(numberOfRoomsByTasks);
        assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 12, "TASK-C1_1");
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP009", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 20, "TASK-C1_1"); 
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP009", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST1
		System.out.println(numberOfRoomsByTasks);
		assertTrue(numberOfRoomsByTasks.get("T1_TASK-C1_1") == 20, "TASK-C1_1"); 
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP016", LINEAR_CONTEXT); // Level 1 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 5, "TASK-C1"); 
        assertTrue(sumNumberOfRooms() == 5);
        
		generateAndComputes("LP016B", LABYRINTHINE_CONTEXT); // Level 8 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 12, "TASK-C1"); 
        assertTrue(sumNumberOfRooms() == 12);
        
		generateAndComputes("LP017", LINEAR_CONTEXT); // Level 16 -- Linear -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 20, "TASK-C1"); 
        assertTrue(sumNumberOfRooms() == 20);
        
		generateAndComputes("LP017", LABYRINTHINE_CONTEXT); // Level 16 -- Labyrinthine -- Path TAST2
		assertTrue(numberOfRoomsByTasks.get("T2_TASK-C1") == 20, "TASK-C1"); 
        assertTrue(sumNumberOfRooms() == 20);	
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
