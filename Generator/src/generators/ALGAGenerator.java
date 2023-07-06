package generators;

import org.eclipse.emf.common.util.EList;

import flattener.Main;
import generator.Dungeon;
import generator.LevelsDifficultyProgress;
import generator.PropositionParam;
import generator.QuestionedFact;
import generator.Room;
import generator.RoomAccess;
import generator.Value;
import generator.impl.CurrentGameLevelImpl;
import generator.impl.ProgressionImpl;
import managers.ModelsManager;
import structures.DungeonElements;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;
	private DungeonElements dungeonElements;

	public static void main(String[] args) {
		
		ALGAGenerator generator = new ALGAGenerator();
		generator.generate();
		generator.printDungeon();
		generator.saveDungeon("DungeonGen.xmi");
		Main.transformModel("C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\models\\", 
				"C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\flattener\\", "outputmodels/DungeonGen.xmi", "outputmodels/DungeonGen.xml");
	}
	
	public ALGAGenerator() {
		modelAccess = new ModelsManager();
	}
	
	public ALGAGenerator(String fileContext) {
		modelAccess = new ModelsManager(fileContext);
	}
	
	public ALGAGenerator(boolean forTest, String contextFileName) {
		modelAccess = new ModelsManager(forTest, contextFileName);
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
		if(modelAccess.getContextModel().getLearnerplayer().getProgression() == null) {
			modelAccess.getContextModel().getLearnerplayer().setProgression(new ProgressionImpl());
			modelAccess.getContextModel().getLearnerplayer().getProgression().setCurrentGameLevel(new CurrentGameLevelImpl());
		}
	}
	
	public Dungeon generate() {
		LevelsDifficultyProgress gameDifficulty = modelAccess.getGameDescriptionModel().getLevelsDifficultyProgress();

		checkLearnerPlayerSetProgression();
		
		double nbQRooms = gameDifficulty.getInitNbQRoom() + gameDifficulty.getNbQRoomIncrease() * (modelAccess.getContextModel().getLearnerplayer().getProgression().getCurrentGameLevel().getLevel() - 1);
		double nbNQRooms = gameDifficulty.getInitNbNQRoom() + gameDifficulty.getNbNQRoomIncrease() * (modelAccess.getContextModel().getLearnerplayer().getProgression().getCurrentGameLevel().getLevel() - 1);

		System.out.println("Number of no question rooms "+nbNQRooms);
		System.out.println("Number of question rooms "+nbQRooms);
		
		dungeonElements = new DungeonElements(modelAccess.getGameDescriptionModel(), nbQRooms, nbNQRooms);
		
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess, dungeonElements);
		GameElementsGenerator gameGeneration;
		DungeonGenerator dungeonGeneration;
		try {
			dungeonElements = eduGeneration.generateEE();
			gameGeneration = new GameElementsGenerator(modelAccess, dungeonElements);
			gameGeneration.generateGPandCurses();
			//dungeonElements.print();
			dungeonGeneration = new DungeonGenerator(modelAccess, dungeonElements, nbNQRooms+nbQRooms);
			generatedDungeon = dungeonGeneration.generateDungeon();
			/*System.out.println("TOUT LE BORDEL");
			for (int i = 0; i < dungeonElements.getRoomsElements().size(); i++) {
				System.out.println(dungeonElements.getRoomsElements().get(i).getRoom());
				dungeonElements.getRoomsElements().get(i).printElementTypes();
			}*/
			
			generatedDungeon = gameGeneration.generateRoomContent(generatedDungeon);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(dungeonElements .getChosenObjective());
		System.out.println(generatedDungeon == null);
				
		generatedDungeon.setLearningobjective(dungeonElements.getChosenObjective());
		generatedDungeon.setLevel(dungeonElements.getChosenLevel());
		
		if(generatedDungeon.getLevel() == null || generatedDungeon.getLearningobjective() == null) {
			System.err.println("Dungeon objective and/or level are not set properly, possible mistake may appear");
		}		
		
		return generatedDungeon;
	}
	
	private String propositionsToString(EList<PropositionParam> propositions) {
		String s = "";
		for (PropositionParam prop: propositions) {
			s+= ((Value) prop.getValue()).getValue() + ",";
		}
		return s;
	}
	
	private void printRoom(Room r) {
		System.out.println("****");
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		System.out.println("RoomType : "+r.getRoomtype().getName());
		if(r.getQuestionedFacts() != null && !r.getQuestionedFacts().isEmpty()) {
			String facts = "{";
			for (QuestionedFact qef : r.getQuestionedFacts()) {
				facts += ((Value) qef.getQuestion().getValue()).getValue() + "[" + propositionsToString(qef.getPropositions()) + "]" + 
						(r.getQuestionedFacts().get(r.getQuestionedFacts().size()-1).equals(qef)? "}":", ");
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
		System.out.println("Number of room without entry "+(generatedDungeon.getRooms().size()-1));
		
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
			
		}
	}

}
