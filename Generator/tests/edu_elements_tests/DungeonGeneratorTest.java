package edu_elements_tests;

import generators.ALGAGenerator;
import flattener.Main;

public class DungeonGeneratorTest {

	public static void main(String[] args) {
		
		String modelIN = "outputmodels/tests/unflatten/";
		String modelOUT = "outputmodels/tests/flatten/"; 
		
		/*ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init.xmi");//args != null? args[0]: "");
		ALGAGenerator generator2 = new ALGAGenerator("learnerProfils/LP_IM_Init.xmi");
		for (int i = 1; i < 6; i++) {
			generator.generate();
			generator.saveDungeon("tests/unflatten/RM_Dungeon"+i+".xmi");
			generator2.generate();
			generator2.saveDungeon("tests/unflatten/IM_Dungeon"+i+".xmi");
			Main.transformModel(modelIN+"RM_Dungeon"+i+".xmi", modelOUT+"RM_Dungeon"+i+".xmi");
			Main.transformModel(modelIN+"IM_Dungeon"+i+".xmi", modelOUT+"IM_Dungeon"+i+".xmi");
		}*/
		
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_FIC_Init.xmi");
		generator.generate();
		generator.saveDungeon("tests/unflatten/FIC_DungeonTEST.xmi");
		Main.transformModel(modelIN+"FIC_DungeonTEST.xmi", modelOUT+"FIC_DungeonTEST.xml");

	}

}
