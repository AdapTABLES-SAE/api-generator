package educational_dimension;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import generator.Dungeon;
import generators.ALGAGenerator;

@TestInstance(Lifecycle.PER_CLASS)
class ObjectiveLevelTest {

	private List<Dungeon> generatedDungeons1, generatedDungeons2, generatedDungeons3;
	
	@BeforeEach
	void initDataSet() {
		generatedDungeons1 = generateXDungeons(new ALGAGenerator(true, "ContextForObjectiveLevelTest.xmi"), 150);
		generatedDungeons2 = generateXDungeons(new ALGAGenerator(true, "ContextForObjectiveLevelTest_2.xmi"), 150);
		generatedDungeons3 = generateXDungeons(new ALGAGenerator(true, "ContextForObjectiveLevelTest_3.xmi"), 150);
	}

	@Test
	void allEligibleObjLevelAreChosenAtLeastOnceTest() {
		assertTrue(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	}
	  
	@Test
	void notEligibleObjLevelAreNeverChosenTest() {
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	  
	@Test
	void objectiveLevelWithBothThreesholdReachIsNotEligibleAnymoreTest() {
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	  
	@Test
	void objectivePrerequisiteIsReachedMakesObjectiveEligibleTest() {
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons1, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	}
	
	@Test
	void whenNoEligibleObjectiveOnlyObjectiveUnder100PercentThresholdAreSelected() {
		assertTrue(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	    
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertFalse(isObjectiveLevelIsSelected(generatedDungeons2, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));
	}
	
	@Test
	void whenObjectiveAreAllOver100PercentThresholdAllAreSelected() {
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O3", "OBJ-LVL-O3_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O2", "OBJ-LVL-O2_L3"));
	      
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O1", "OBJ-LVL-O1_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O2", "OBJ-LVL-O2_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O4", "OBJ-LVL-O4_L1"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O4", "OBJ-LVL-O4_L2"));
	    assertTrue(isObjectiveLevelIsSelected(generatedDungeons3, "OBJ-LVL_O4", "OBJ-LVL-O4_L3"));	
	}
	
	
	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	
	private boolean isObjectiveLevelIsSelected(List<Dungeon> dungeons, String objID, String levelID) {
		for (Dungeon dungeon : dungeons) {
			if(dungeon.getLearningobjective().getID().equals(objID) && dungeon.getLevel().getID().equals(levelID)) {
				return true;
			}
		}	
		return false;
	}
}
