package generators;

import flattener.Main;
import generator.Dungeon;
import generator.Room;
import generator.RoomAccess;
import managers.EducationElementsManager;
import managers.ModelsManager;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;

	public static void main(String[] args) {
		
		// eiah23TestGeneration();
		
		/*ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init.xmi");
		generator.generate();
		generator.saveDungeon("RM_Dungeon_xmi");*/
	}
	
	/*public static void eiah23EduVarietyTest() {
		String modelIN = "outputmodels/tests/unflatten/";
		String modelOUT = "outputmodels/tests/flatten/"; 
		
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init.xmi");//args != null? args[0]: "");
		ALGAGenerator generator2 = new ALGAGenerator("learnerProfils/LP_IM_Init.xmi");
		for (int i = 1; i < 6; i++) {
			generator.generate();
			generator.saveDungeon("tests/unflatten/RM_Dungeon"+i+".xmi");
			generator2.generate();
			generator2.saveDungeon("tests/unflatten/IM_Dungeon"+i+".xmi");
			Main.transformModel(modelIN+"RM_Dungeon"+i+".xmi", modelOUT+"RM_Dungeon"+i+".xmi");
			Main.transformModel(modelIN+"IM_Dungeon"+i+".xmi", modelOUT+"IM_Dungeon"+i+".xmi");
		}
	}*/
	
	public ALGAGenerator(String fileContext) {
		modelAccess = new ModelsManager(fileContext);
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
	}
	
	public void saveDungeon(String fileName, Dungeon dungeon) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	public Dungeon generate() {
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess);
		EducationElementsManager eeManager =  eduGeneration.generateEE();
		
		DungeonGenerator dungeonGeneration = new DungeonGenerator(modelAccess, eeManager);
		generatedDungeon = dungeonGeneration.generateDungeon();

		generatedDungeon.setLearningobjective(eduGeneration.getChosenObjective());
		generatedDungeon.setLevel(eduGeneration.getChosenLevel());
		
		if(generatedDungeon.getLevel() == null || generatedDungeon.getLearningobjective() == null) {
			System.err.println("Dungeon objective and/or level are not set properly, possible mistake may appear");
		}
		
		/*MTFactGenerator mtf = new MTFactGenerator(eeManager);
		mtf.generateQFacts();*/
		return generatedDungeon;
	}
	
	private void printRoom(Room r) {
		System.out.println("****");//
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		if(r.getQuestion() != null) {
			System.out.println("\t IncompleteFact : "+r.getQuestion().getIncompleteFact()+" Position : "+r.getQuestion().getPosition().getName());
		}
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("****");
	}
	
	public void printDungeon() {
		System.out.println("---- Dungeon -----");
		System.out.println("Objective : "+generatedDungeon.getLearningobjective());
		System.out.println("Level : "+generatedDungeon.getLevel());
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
		}
	}

}
