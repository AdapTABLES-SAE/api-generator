package game_dimension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.ATask;
import generator.Dungeon;
import generator.MTCompletion2;
import generator.MTReconstruction;
import generator.Room;
import generators.ALGAGenerator;
import structures.DidacticDomain;

class MathTaskGameplaySwitchTest {

	private List<Dungeon> generatedLinearDungeons, generatedLabyrinthineDungeons;
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		String learnerID = new ArrayList<>(info.getTags()).get(0);
		generatedLinearDungeons = generateXDungeons(new ALGAGenerator(DidacticDomain.MATHEMATICS, true, learnerID,  "Contexts.xmi", "LINEAR_GENERATION_TEST"), 50);
		generatedLabyrinthineDungeons = generateXDungeons(new ALGAGenerator(DidacticDomain.MATHEMATICS, true, learnerID, "Contexts.xmi", "LABYRINTHINE_GENERATION_TEST"), 50);
	}

	@Test
	@Tag(value = "LP001")
	void comp2AndRebuildAreNotWithNotUndoableGameplay() {
		assertTrue(areCompletion2andRebuildTasksWithUndoableGameplay(generatedLinearDungeons));
	    
	    assertTrue(areCompletion2andRebuildTasksWithUndoableGameplay(generatedLabyrinthineDungeons));
	 
	    
	}
	
	private boolean areCompletion2andRebuildTasksWithUndoableGameplay(List<Dungeon> dungeons) {
		
		for(Dungeon dungeon: dungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getTask() != null && isInstanceOfComp2OrReb(room.getTask()) && !room.getGameplay().isUndoable()) {
					System.err.println("Error "+room.getGameplay().getName()+" ");
					
					return false;
				}
			}
		}
		return true; 
	}
	
	private boolean isInstanceOfComp2OrReb(ATask task) {
		return task instanceof MTCompletion2 || task instanceof MTReconstruction; 
	}
	
	
	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	  
}
