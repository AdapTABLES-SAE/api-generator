package generators;

import generator.Dungeon;
import generator.Room;
import generator.RoomAccess;
import managers.ModelsManager;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;

	public static void main(String[] args) {
		ALGAGenerator generator = new ALGAGenerator();
		generator.generate();
		generator.saveDungeon("DungeonTESTSL.xmi");
		generator.printDungeon();
	}
	
	public ALGAGenerator() {
		modelAccess = new ModelsManager();
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
	}
	
	public void generate() {
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess);
		
		DungeonGenerator dungeonGeneration = new DungeonGenerator(modelAccess, eduGeneration.generateEE());
		generatedDungeon = dungeonGeneration.generateDungeon();
		
		generatedDungeon.setLearningobjective(eduGeneration.getChosenObjective());
		generatedDungeon.setLevel(eduGeneration.getChosenLevel());
		
		if(generatedDungeon.getLevel() == null || generatedDungeon.getLearningobjective() == null) {
			System.err.println("Dungeon objective and/or level are not set properly, possible mistake may appear");
		}
		
	}
	
	private void printRoom(Room r) {
		System.out.println("****");
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
