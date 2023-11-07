package game_dimension;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import flattener.Main;
import generators.ALGAGenerator;

public class GenerationForTest {

	public static void main(String[] args) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		// TODO Auto-generated method stub
		for(int i=0; i < 4; i++) {
			ALGAGenerator generator = new ALGAGenerator(true, "LP05GP", "Contexts.xmi", "GAMEPLAY_TEST");
			generator.generate();
			generator.saveDungeon("DungeonGen"+i+".xmi");
			Main.transformModel("C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\models\\", 
				"C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\flattener\\", "tests/modelsForTests/output/DungeonGen"+i+".xmi", "tests/modelsForTests/output/DungeonGen"+i+".xml");
	
		}

	}

}
