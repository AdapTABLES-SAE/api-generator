package generators;

import flattener.Main;
import generator.Dungeon;
import generator.LevelsDifficultyProgress;
import generator.QuestionedFact;
import generator.Room;
import generator.RoomAccess;
import generator.impl.CurrentGameLevelImpl;
import generator.impl.ProgressionImpl;
import managers.EducationElementsManager;
import managers.GameElementsManager;
import managers.ModelsManager;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;
	private GameElementsManager geManager;

	public static void main(String[] args) {
		
		ALGAGenerator generator = new ALGAGenerator();
		generator.generate();
		generator.printDungeon();
		generator.saveDungeon("DungeonGen.xmi");
		Main.transformModel("outputmodels/DungeonGen.xmi", "outputmodels/DungeonGen.xml");
	}
	
	public ALGAGenerator() {
		this("");
	}
	
	public ALGAGenerator(String fileContext) {
		modelAccess = new ModelsManager(fileContext);
	}
	
	public ALGAGenerator(String inputPath, String outputPath, String contextFileName, boolean lauchedFromAPI) {
		modelAccess = new ModelsManager(inputPath, outputPath, contextFileName, lauchedFromAPI);
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
	}
	
	public void saveDungeon(String fileName, Dungeon dungeon) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	private void checkLearnerPlayerSetProgression() {
		if(modelAccess.context.getLearnerplayer().getProgression() == null) {
			modelAccess.context.getLearnerplayer().setProgression(new ProgressionImpl());
			modelAccess.context.getLearnerplayer().getProgression().setCurrentGameLevel(new CurrentGameLevelImpl());
		}
	}
	
	public Dungeon generate() {
		LevelsDifficultyProgress gameDifficulty = modelAccess.gameDescription.getLevelsDifficultyProgress();

		checkLearnerPlayerSetProgression();
		
		double nbQRooms = gameDifficulty.getInitNbQRoom() + gameDifficulty.getNbQRoomIncrease() * (modelAccess.context.getLearnerplayer().getProgression().getCurrentGameLevel().getLevel() - 1);
		double nbNQRooms = gameDifficulty.getInitNbNQRoom() + gameDifficulty.getNbNQRoomIncrease() * (modelAccess.context.getLearnerplayer().getProgression().getCurrentGameLevel().getLevel() - 1);
		
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess, nbQRooms, nbNQRooms);
		EducationElementsManager eeManager;
		GameElementsGenerator gameGeneration;
		DungeonGenerator dungeonGeneration;
		try {
			eeManager = eduGeneration.generateEE();
			gameGeneration = new GameElementsGenerator(modelAccess.gameDescription, eeManager);
			gameGeneration.generateGPandCurses();
			this.geManager = gameGeneration.getGameElementManager(); // TODO : debug à remove
			dungeonGeneration = new DungeonGenerator(modelAccess, eeManager, gameGeneration.getGameElementManager(), nbNQRooms+nbQRooms);
			generatedDungeon = dungeonGeneration.generateDungeon();
			generatedDungeon = gameGeneration.generateRoomContent(generatedDungeon);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//generatedDungeon.setLearningobjective(eduGeneration.getChosenObjective());
		//generatedDungeon.setLevel(eduGeneration.getChosenLevel());
		
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
				facts += qef.getCompleteFact() + (r.getQuestionedFacts().get(r.getQuestionedFacts().size()-1).equals(qef)? "}":", ");
			}
			System.out.println("\t Facts : "+facts);
		}
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		if(r.getGameplay() != null) System.out.println("Gameplay : "+r.getGameplay().getName());
		System.out.println("****");
	}

	public ModelsManager getModelsManager() {
		return modelAccess;
	}
	
	public void printDungeon() {
		System.out.println("---- Dungeon -----");
		System.out.println("Objective : "+generatedDungeon.getLearningobjective());
		System.out.println("Level : "+generatedDungeon.getLevel());
		int i = 0; 
		System.out.println("Number of room without entry "+(generatedDungeon.getRooms().size()-1));
		System.out.println("Number of gameplay selected "+ (geManager.size()));
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
			
		}
	}

}
