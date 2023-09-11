package generators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import exceptions.NonExistantLearnerPlayerException;
import flattener.Main;
import generator.CurrentObjectiveLevel;
import generator.Dungeon;
import generator.LearnerPlayer;
import generator.LevelsDifficultyProgress;
import generator.PropositionParam;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.Room;
import generator.RoomAccess;
import generator.Value;
import generator.impl.LearnerProgressImpl;
import generator.impl.PlayerProgressImpl;
import generator.impl.ProgressionImpl;
import generator.impl.StatisticsImpl;
import managers.ModelsManager;
import structures.DungeonElements;

public class ALGAGenerator {
	
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;
	private DungeonElements dungeonElements;
	private LearnerPlayer learnerPlayer;

	public static void main(String[] args) {
		
		for(int i = 0; i < 1; i++) {
			ALGAGenerator generator;
			try {
				generator = new ALGAGenerator("learnerFic");
				generator.generate();
				generator.printDungeon();
				generator.saveDungeon("DungeonGen.xmi");
				Main.transformModel("C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\models\\", 
					"C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\flattener\\", "outputmodels/DungeonGen.xmi", "outputmodels/DungeonGen.xml");
			} catch (NonExistantLearnerPlayerException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public ALGAGenerator(String learnerID) throws NonExistantLearnerPlayerException {
		modelAccess = new ModelsManager();
		this.learnerPlayer = modelAccess.getLearnerPlayer(learnerID);
	}
	
	public ALGAGenerator(String learnerID, String fileContext) throws NonExistantLearnerPlayerException {
		modelAccess = new ModelsManager(fileContext);
		this.learnerPlayer = modelAccess.getLearnerPlayer(learnerID);
	}
	
	public ALGAGenerator(boolean forTest, String learnerID, String contextFileName) throws NonExistantLearnerPlayerException {
		modelAccess = new ModelsManager(forTest, contextFileName);
		this.learnerPlayer = modelAccess.getLearnerPlayer(learnerID);
	}
	
	public ALGAGenerator(String inputPath, String outputPath, String contextFileName, String learnerID, boolean lauchedFromAPI) throws NonExistantLearnerPlayerException {
		modelAccess = new ModelsManager(inputPath, outputPath, contextFileName, lauchedFromAPI);
		this.learnerPlayer = modelAccess.getLearnerPlayer(learnerID);
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
	}
	
	public void saveDungeon(String fileName, Dungeon dungeon) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	private void checkLearnerPlayerSetProgression() {
		if(learnerPlayer.getProgression() == null) {
			learnerPlayer.setProgression(new ProgressionImpl());
			learnerPlayer.getProgression().setLearnerProgress(new LearnerProgressImpl());
			learnerPlayer.getProgression().setPlayerProgress(new PlayerProgressImpl());
		}
	}
	
	public List<QuestionableFact> getDungeonFacts() {
		List<QuestionableFact> facts = new ArrayList<>();
	
		for(Room room:	this.generatedDungeon.getRooms()) {
			for(QuestionedFact fact: room.getQuestionedFacts()) {
				facts.add(fact.getQuestionablefact());
			}
		}
		
		return facts;
	}
	
	private void updateLearnerPlayerStatistics() {
		// update learner statistics 
		if(learnerPlayer.getStatistics() == null) {
			learnerPlayer.setStatistics(new StatisticsImpl());
		}
		learnerPlayer.getStatistics().setNbLevelsGenerated(learnerPlayer.getStatistics().getNbLevelsGenerated() + 1); 
		learnerPlayer.getStatistics().setMaxGameLevelReached(learnerPlayer.getProgression().getPlayerProgress().getCurrentLevel());
		modelAccess.saveContextModel();
	}
	
	public CurrentObjectiveLevel getCurrentObjectiveLevel() {
		System.out.println(this.generatedDungeon.getLearningobjective()+" ffgg");
		for(CurrentObjectiveLevel currentOL: this.learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(currentOL.getObjective().equals(this.generatedDungeon.getLearningobjective()) && currentOL.getLevel().equals(this.generatedDungeon.getLevel())) {
				return currentOL;
			}
		}
		return null;
	}
		
	public Dungeon generate() {
		LevelsDifficultyProgress gameDifficulty = modelAccess.getGameDescriptionModel().getLevelsDifficultyProgress();

		checkLearnerPlayerSetProgression();
		
		double nbQRooms = gameDifficulty.getInitNbQRoom() + gameDifficulty.getNbQRoomIncrease() * (learnerPlayer.getProgression().getPlayerProgress().getCurrentLevel() - 1);
		double nbNQRooms = gameDifficulty.getInitNbNQRoom() + gameDifficulty.getNbNQRoomIncrease() * (learnerPlayer.getProgression().getPlayerProgress().getCurrentLevel() - 1);

		System.out.println("Number of no question rooms "+nbNQRooms);
		System.out.println("Number of question rooms "+nbQRooms);
		
		dungeonElements = new DungeonElements(modelAccess.getGameDescriptionModel(), nbQRooms, nbNQRooms);
		
		EducationalElementsGenerator eduGeneration = new EducationalElementsGenerator(modelAccess, dungeonElements, learnerPlayer);
		GameElementsGenerator gameGeneration;
		DungeonGenerator dungeonGeneration;
		try {
			dungeonElements = eduGeneration.generateEE();
			gameGeneration = new GameElementsGenerator(modelAccess, dungeonElements, learnerPlayer);
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
				
		generatedDungeon.setLearningobjective(dungeonElements.getChosenObjective());
		generatedDungeon.setLevel(dungeonElements.getChosenLevel());
		generatedDungeon.setLearnerPlayer(learnerPlayer);
		
		if(generatedDungeon.getLevel() == null || generatedDungeon.getLearningobjective() == null) {
			System.err.println("Dungeon objective and/or level are not set properly, possible mistake may appear");
		} else {
			this.updateLearnerPlayerStatistics();
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
