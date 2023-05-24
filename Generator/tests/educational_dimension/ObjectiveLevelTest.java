package educational_dimension;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import generator.Dungeon;
import generators.ALGAGenerator;

@TestInstance(Lifecycle.PER_CLASS)
class ObjectiveLevelTest {

	//private String INPUT_MODEL_PATHS = "tests/modelsForTests/";
	//private String[] INPUT_MODEL_NAMES = {"Context.xmi", "GameDescription.xmi", "MultiplicationTables.xmi", "LearningDomain.xmi", "Relations.xmi"};
	
	private List<Dungeon> generatedDungeons;
	private ALGAGenerator generator;
	
	@BeforeEach
	void initDataSet() {
		generator = new ALGAGenerator(true); 
		generateXDungeons(150);
	}
	

	@Test
	void chosenSelectedObjLevelPairIsEligibleTest() {
		List<String> eligibleObjectives = new ArrayList<>(Arrays.asList(new String[] {"OBJ-LVL_O1", "OBJ-LVL_O2", "OBJ-LVL_O3"}));
		List<String> eligibleLevels = new ArrayList<>(Arrays.asList(new String[] {"OBJ-LVL-O1_L1", "OBJ-LVL-O2_L2", "OBJ-LVL-O3_L1"}));
		for (Dungeon dungeon : generatedDungeons) {
			System.out.println(dungeon.getLevel().getID());
			assertTrue(eligibleObjectives.contains(dungeon.getLearningobjective().getID()));
			assertTrue(eligibleLevels.contains(dungeon.getLevel().getID()));
		}	
	}


	@Test
	void allEligibleObjLevelAreChosenAtLeastOnceTest() {
		assertTrue(isObjectiveLevelIsSelected("OBJ-LVL_O1", "OBJ-LVL-O1_L1"));
		assertTrue(isObjectiveLevelIsSelected("OBJ-LVL_O2", "OBJ-LVL-O2_L2"));
		//assertTrue(isObjectiveLevelIsSelected("OBJ-LVL_O3", "OBJ-LVL-O3_L1"));
	}
	
	private void generateXDungeons(int quantityX) {
		generatedDungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			generatedDungeons.add(generator.generate());
			generator.printDungeon();
		}
	}
	
	private boolean isObjectiveLevelIsSelected(String objID, String levelID) {
		for (Dungeon dungeon : generatedDungeons) {
			if(dungeon.getLearningobjective().getID().equals(objID) && dungeon.getLevel().getID().equals(levelID)) {
				return true;
			}
		}	
		return false;
	}
}
