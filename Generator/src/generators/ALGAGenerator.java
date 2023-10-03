package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//import java.util.logging.Logger;
import org.eclipse.emf.common.util.EList;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import flattener.Main;
import generator.CurrentObjectiveLevel;
import generator.Dungeon;
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

	public static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   
	   
	private ModelsManager modelAccess;
	private Dungeon generatedDungeon;
	private DungeonElements dungeonElements;

	public static void main(String[] args) {
		
		/*MTQFCompletion1 qFact = new MTQFCompletion1Impl();
		qFact.setLeftOperand(2);
		qFact.setResultOnRight(true);
		qFact.setResult(4);
		qFact.setRightOperand(-1);
		qFact.setSoluce(2);
		
		QuestionedFact fact = new QuestionedFactImpl();
		fact.setCompleteFact(qFact.getCompleteFact());
		fact.setQuestionablefact(qFact);
		fact.setLearnerValidation(false);
		
		QuestionParam question = new QuestionParamImpl();
		question.setInteractive(false);
		Value value = new ValueImpl(); 
		value.setValue(qFact.getQuestionableFact());
		question.setValue(value);
		
		fact.setQuestion(question);
		WantedAnswersParam wanted = new WantedAnswersParamImpl();
		value = new ValueImpl(); 
		value.setValue("1");
		wanted.setValue(value);
		fact.setCorrectnessToReach(wanted);
		
		QuestionedFactSplitter splitter = new QuestionedFactSplitter(fact);*/
		
		for(int i = 0; i < 1; i++) {
			ALGAGenerator generator;
			try {
				generator = new ALGAGenerator("FICTIF01");
				generator.generate();
				generator.printDungeon();
				generator.saveDungeon("DungeonGen.xmi");
				Main.transformModel("C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\models\\", 
					"C:\\blemoine\\TheseGenerator\\gen1\\TransformationFlattener\\flattener\\", "outputmodels/DungeonGen.xmi", "outputmodels/DungeonGen.xml");
			} catch (ContextNotFoundException e) {
				e.printStackTrace();
			} catch (NonExistantLearnerPlayerException e) {
				e.printStackTrace();
			} 	
		}
	}
	
	public void resetLearnerProgress() {
		modelAccess.getLearnerPlayer().getProgression().setLearnerProgress(new LearnerProgressImpl());
		modelAccess.saveLearnerPlayerModel();
	}
	
	public ALGAGenerator(String learnerID) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		modelAccess = new ModelsManager(learnerID);
	}
	
	/*public ALGAGenerator(String learnerID, String fileContext) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		modelAccess = new ModelsManager(learnerID, fileContext);
	}
	
	public ALGAGenerator(boolean forTest, String learnerID, String contextFileName) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		modelAccess = new ModelsManager(forTest, learnerID, contextFileName);
	}*/
	
	public ALGAGenerator(boolean forTest, String learnerID, String contextsFileName, String contextID) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		modelAccess = new ModelsManager(forTest, learnerID, contextsFileName, contextID);
	}
	
	
	public ALGAGenerator(String inputPath, String outputPath, String learnerID, String contextsFILE, String contextID,  boolean lauchedFromAPI) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		modelAccess = new ModelsManager(inputPath, outputPath, learnerID, contextsFILE, contextID, lauchedFromAPI);
	}
	
	public void saveDungeon(String fileName) {
		modelAccess.saveGeneratedModel(generatedDungeon, fileName);
	}
	
	public void saveDungeon(String fileName, Dungeon dungeon) {
		modelAccess.saveGeneratedModel(dungeon, fileName);
	}
	
	private void checkLearnerPlayerSetProgression() {
		if(modelAccess.getLearnerPlayer().getProgression() == null) {
			modelAccess.getLearnerPlayer().setProgression(new ProgressionImpl());
		}
		if(modelAccess.getLearnerPlayer().getProgression().getPlayerProgress() == null) {
			modelAccess.getLearnerPlayer().getProgression().setPlayerProgress(new PlayerProgressImpl());
		}
		if(modelAccess.getLearnerPlayer().getProgression().getLearnerProgress() == null) {
			modelAccess.getLearnerPlayer().getProgression().setLearnerProgress(new LearnerProgressImpl());
		}
		
		modelAccess.saveLearnerPlayerModel();
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
		if(modelAccess.getLearnerPlayer().getStatistics() == null) {
			modelAccess.getLearnerPlayer().setStatistics(new StatisticsImpl());
		}
		modelAccess.getLearnerPlayer().getStatistics().setNbLevelsGenerated(modelAccess.getLearnerPlayer().getStatistics().getNbLevelsGenerated() + 1); 
		modelAccess.getLearnerPlayer().getStatistics().setMaxGameLevelReached(modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel());
		modelAccess.saveLearnerPlayerModel();
	}
	
	public CurrentObjectiveLevel getCurrentObjectiveLevel() {
		for(CurrentObjectiveLevel currentOL: modelAccess.getLearnerPlayer().getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(currentOL.getObjective().equals(this.generatedDungeon.getLearningobjective()) && currentOL.getLevel().equals(this.generatedDungeon.getLevel())) {
				return currentOL;
			}
		}
		return null;
	}
		
	public Dungeon generate() {
		LevelsDifficultyProgress gameDifficulty = modelAccess.getGameDescriptionModel().getLevelsDifficultyProgress();

		checkLearnerPlayerSetProgression();

		double nbQRooms = gameDifficulty.getInitNbQRoom() + gameDifficulty.getNbQRoomIncrease() * (modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel() - 1);
		double nbNQRooms = gameDifficulty.getInitNbNQRoom() + gameDifficulty.getNbNQRoomIncrease() * (modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel() - 1);

		LOGGER.info("Number of no question rooms " + nbNQRooms);
		LOGGER.info("Number of question rooms " + nbQRooms);
		
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
				
		generatedDungeon.setLearningobjective(dungeonElements.getChosenObjective());
		generatedDungeon.setLevel(dungeonElements.getChosenLevel());
		generatedDungeon.setLearnerPlayer(modelAccess.getLearnerPlayer());
		
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
