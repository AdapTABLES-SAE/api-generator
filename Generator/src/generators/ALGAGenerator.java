package generators;

import generator.Dungeon;
import generator.QuestionedFact;
import generator.Room;
import generator.RoomAccess;
import managers.EducationElementsManager;
import managers.ModelsManager;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;

	public static void main(String[] args) {
		
		ALGAGenerator generator = new ALGAGenerator();
		generator.generate();
		generator.printDungeon();
		//generator.saveDungeon("Dungeon.xmi");
	}
	
	public ALGAGenerator() {
		this("");
	}
	
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
		EducationElementsManager eeManager;
		DungeonGenerator dungeonGeneration;
		try {
			eeManager = eduGeneration.generateEE();
			dungeonGeneration = new DungeonGenerator(modelAccess, eeManager);
			generatedDungeon = dungeonGeneration.generateDungeon();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		generatedDungeon.setLearningobjective(eduGeneration.getChosenObjective());
		generatedDungeon.setLevel(eduGeneration.getChosenLevel());
		
		if(generatedDungeon.getLevel() == null || generatedDungeon.getLearningobjective() == null) {
			System.err.println("Dungeon objective and/or level are not set properly, possible mistake may appear");
		}		
		
		return generatedDungeon;
	}
	
	private void printRoom(Room r) {
		System.out.println("****");//
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		if(r.getQuestionedFacts() != null && !r.getQuestionedFacts().isEmpty()) {
			String facts = "{";
			for (QuestionedFact qef : r.getQuestionedFacts()) {
				facts += qef.getQuestionedFactQuestion() + (r.getQuestionedFacts().get(r.getQuestionedFacts().size()-1).equals(qef)? "}":", ");
			}
			System.out.println("\t Facts : "+facts);
		}
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("****");
	}
	
	public ModelsManager getModelsManager() {
		return modelAccess;
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
