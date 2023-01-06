package generators;

import generator.Dungeon;
import generator.Room;
import generator.RoomAccess;
import managers.EducationElementsManager;
import managers.ModelsManager;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;

	public static void main(String[] args) {
		
		ALGAGenerator generator = new ALGAGenerator(args != null? args[0]: "");
		generator.generate();
		//generator.saveDungeon("DungeonT.xmi");
		//generator.printDungeon();
	}
	
	public ALGAGenerator(String fileContext) {
		modelAccess = new ModelsManager(fileContext);
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
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
