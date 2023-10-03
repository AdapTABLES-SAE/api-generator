package educational_dimension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.Dungeon;
import generators.ALGAGenerator;

class ObjectiveLevelTest {

	private List<Dungeon> generatedLinearDungeons, generatedLabyrinthineDungeons;
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		String learnerID = new ArrayList<>(info.getTags()).get(0);
		System.out.println("ID "+learnerID);
		if(!learnerID.equals("-1")) {
			generatedLinearDungeons = generateXDungeons(new ALGAGenerator(true, learnerID, "Contexts.xmi", "LINEAR_GENERATION_TEST"), 150);
			generatedLabyrinthineDungeons = generateXDungeons(new ALGAGenerator(true, learnerID, "Contexts.xmi", "LABYRINTHINE_GENERATION_TEST"), 150);
		}
	}
	
	@Test
	@Tag(value = "LP001")
	void allEligibleObjLevelAreChosenAtLeastOnceTest() throws NonExistantLearnerPlayerException {
		assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	}
	  
	@Test
	@Tag(value = "LP001")
	void noneUneligibleObjLevelAreChosenTest() throws NonExistantLearnerPlayerException {
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	    
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	  
	@Test
	@Tag(value = "LP001")
	void objectiveLevelWithBothThreesholdReachIsNotEligibleAnymoreTest() {
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	    
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	  
	@Test
	@Tag(value = "LP001")
	void objectivePrerequisiteIsReachedMakesObjectiveEligibleTest() {
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	}
	
	@Test
	@Tag(value = "LP019")
	void allObjectivesAreFinishedOnlyUnder100PercentAreSelectectedTest() {
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	    
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	
	@Test
	@Tag(value = "LP018")
	void everyObjectiveIsFinishedAt100PercentAllAreAvailableTest() throws NonExistantLearnerPlayerException {
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLinearDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	    
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertTrue(isObjectiveLevelSelected(generatedLabyrinthineDungeons, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}

	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	
	private boolean isObjectiveLevelSelected(List<Dungeon> dungeons, String objID, String levelID) {
		for (Dungeon dungeon : dungeons) {
			if(dungeon.getLearningobjective().getID().equals(objID) && dungeon.getLevel().getID().equals(levelID)) {
				return true;
			}
		}	
		return false;
	}
}
