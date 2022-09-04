package generators;

import generator.Dungeon;
import generator.Room;
import generator.RoomAccess;
import models.ModelAccess;

public class ALGAGenerator {
	
	private ModelAccess modelAccess;
	private Dungeon generatedDungeon;

	public static void main(String[] args) {
		//for(int i = 1; i < 11; i ++) {
			/*ALGAGenerator generator = new ALGAGenerator();
			Dungeon generatedDungeon = generator.generate();
			generator.printDungeon(generatedDungeon);*/
			//EducationalElementsGenerator edg = new EducationalElementsGenerator(generator.modelAccess);
			//edg.generate();
			//generator.saveDungeon(generatedDungeon, "GeneratedDungeon"+i+".xmi");
		//}
		ALGAGenerator generator = new ALGAGenerator();
		generator.generate();
		generator.printDungeon();
		
	}
	
	public ALGAGenerator() {
		modelAccess = new ModelAccess();
	}
	
	public void saveDungeon(Dungeon dungeon, String fileName) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	public void generate() {
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess);
		DungeonGenerator dungeonGeneration = new DungeonGenerator(modelAccess);
		
		eduGeneration.generateObjectiveLevelRoomTasks();
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
