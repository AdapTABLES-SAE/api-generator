package generators;

import generator.Dungeon;
import generator.Room;
import generator.RoomAccess;
import models.ModelAccess;

public class ALGAGenerator {
	
	private ModelAccess modelAccess;

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
		ModelAccess ma = new ModelAccess();
		for (int i = 0; i < 10; i++) {
			System.out.println("Dungeon "+i+" OK ");
			DungeonGenerator dg = new DungeonGenerator(ma);
			
			//dg.printDungeon();	
			generator.saveDungeon(dg.generateDungeon(), "GeneratedDungeon"+i+i+".xmi");
		}
	}
	
	public ALGAGenerator() {
		modelAccess = new ModelAccess();
	}
	
	public void saveDungeon(Dungeon dungeon, String fileName) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	public Dungeon generate() {
		return DungeonStructureGenerator.generateDungeonStructure(modelAccess);
	}
	
	private void printRoom(Room r) {
		System.out.println("****");
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("****");
	}
	
	public void printDungeon(Dungeon generatedDungeon) {
		System.out.println("---- Dungeon -----");
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
		}
	}

}
