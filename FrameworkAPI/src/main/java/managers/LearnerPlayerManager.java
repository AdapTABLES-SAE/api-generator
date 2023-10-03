package managers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import exceptions.NonExistantLearnerPlayerException;
import generator.ATask;
import generator.CompletionCriteria;
import generator.CurrentObjectiveLevel;
import generator.Equipment;
import generator.Item;
import generator.LearnerPlayer;
import generator.LearningPath;
import generator.Level;
import generator.Objective;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.ResultsByTask;
import generator.impl.CompletionCriteriaImpl;
import generator.impl.CurrentObjectiveLevelImpl;
import generator.impl.ItemImpl;
import generator.impl.ItemsImpl;
import generator.impl.LearnerProgressImpl;
import generator.impl.PlayerProgressImpl;
import generator.impl.MTCompletion1Impl;
import generator.impl.MTLevelImpl;
import generator.impl.MTQFCompletion1Impl;
import generator.impl.QuestionableFactResultImpl;
import generator.impl.ResultsByTaskImpl;
import generator.impl.ResultsImpl;
import generator.impl.StatisticsImpl;

public class LearnerPlayerManager {

	
	private ModelsManager modelsManager;
	
	public LearnerPlayerManager(ModelsManager modelsManager) {
		this.modelsManager = modelsManager;
	}
	
	/**
	 * Set achieved facts to achieve = true
	 */
	private void updateQuestionableFactStatus(ResultsByTask taskResults) {
		int numberOfExpectedConsecutiveSuccess = taskResults.getTask().getNbConsecutiveSuccess();
		
		for(QuestionableFact fact: taskResults.getQuestionableFacts()) {
			if(this.numberOfSuccessiveSuccess(fact) >= numberOfExpectedConsecutiveSuccess) {
				fact.setAchieved(true);
			}
		}
	}
	
	private String getTaskType(ATask task) {
		System.out.print(task.getClass().getSimpleName());
		switch(task.getClass().getSimpleName()) {
		case "MTCompletion1Impl": return "C1"; 
		case "MTCompletion2Impl": return "C2"; 
		case "MTRecontructionImpl": return "REC"; 
		case "MTIdentificationImpl": return "ID"; 
		case "MTMembershipImpl": return "MEMB"; 
		default: return "";
		}
	}
	
	/*public void resetEquipments(String learnerID) throws NonExistantLearnerPlayerException {
		LearnerPlayer player = modelsManager.getLearnerPlayer(learnerID);
		player.getProgression().getPlayerProgress().setItems(new ItemsImpl());
		modelsManager.saveContextModel();
	}*/
	
	public void resetPlayerProgress() throws NonExistantLearnerPlayerException {
		
		modelsManager.getLearnerPlayer().getProgression().setPlayerProgress(new PlayerProgressImpl());
		modelsManager.getLearnerPlayer().setStatistics(new StatisticsImpl());
		
		modelsManager.getLearnerPlayer().getProgression().setLearnerProgress(new LearnerProgressImpl());
		
		modelsManager.saveLearnerPlayerModel();
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getItemsStatus() {
		JSONObject store = new JSONObject();
		JSONArray items = new JSONArray();
		if(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress() == null) {
			modelsManager.getLearnerPlayer().getProgression().setPlayerProgress(new PlayerProgressImpl());
		}
		
		if(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getItems() == null) {
			modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setItems(new ItemsImpl());
			modelsManager.saveLearnerPlayerModel();
		}
		
		for(Item anItem: modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getItems().getItems()) {
			JSONObject item = new JSONObject();
			item.put("id", anItem.getEquipment().getID());
			item.put("isBought", anItem.isBought());
			item.put("isActivated", anItem.isActivated());
			items.add(item);
		}
		store.put("items", items);
		return store;
	}
	
	public void setItemsStatus(JSONObject obj) throws NonExistantLearnerPlayerException {
			
		JSONArray items = (JSONArray) obj.get("items");
		for(Object oItem: items) {
			JSONObject jItem = (JSONObject) oItem;
			Item item = getPlayerItem(modelsManager.getLearnerPlayer(), (String) jItem.get("id"));
			item.setActivated((boolean) jItem.get("isActivated"));
			item.setBought((boolean) jItem.get("isBought"));
		}
			
		modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setCoins(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCoins() - ((Long) obj.get("usedCoins")).intValue());
		
		if(modelsManager.getLearnerPlayer().getStatistics() == null) {
			modelsManager.getLearnerPlayer().setStatistics(new StatisticsImpl());
		}
		
		modelsManager.getLearnerPlayer().getStatistics().setTotalCoins(modelsManager.getLearnerPlayer().getStatistics().getTotalCoins() - ((Long) obj.get("usedCoins")).intValue());
		
		modelsManager.saveLearnerPlayerModel();
	}
	
	private Item getPlayerItem(LearnerPlayer player, String itemID) {
		if(player.getProgression().getPlayerProgress().getItems() == null) {
			player.getProgression().getPlayerProgress().setItems(new ItemsImpl());
		}
		for(Item item: player.getProgression().getPlayerProgress().getItems().getItems()) {
			if(item.getEquipment().getID().equals(itemID)) {
				return item;
			}
		}
		
		Item item = new ItemImpl();
		Equipment equipment = getEquipmentForID(itemID);
		if(equipment == null) {
			System.err.println("The equipment ID given "+itemID+" is not valid. (Does not exists in model). ");
		}
		item.setEquipment(getEquipmentForID(itemID));
		player.getProgression().getPlayerProgress().getItems().getItems().add(item);
		return item;
		
	}
	
	private Equipment getEquipmentForID(String identifier) {
		for(Equipment equipment: modelsManager.getGameDescriptionModel().getElements().getEquipments().getEquipments()) {
			if(equipment.getID().equals(identifier)) {
				return equipment;
			}
		}
		return null; 
	}

	@SuppressWarnings("unchecked")
	public JSONObject getTaskProgresses(String objectiveID, String levelID) {
		JSONObject progress = new JSONObject();
		JSONArray progresses = new JSONArray();
		try {
			
			CurrentObjectiveLevel currentOL = getCorrespondingCOL(objectiveID, levelID);
			if(currentOL == null) {
				currentOL = initialiseCurrentObjectiveLevel(objectiveID, levelID);
			}
			for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {
				JSONObject taskProgress = new JSONObject(); 
				taskProgress.put("idTask", rbt.getTask().getID());
				taskProgress.put("typeTask", getTaskType(rbt.getTask())); 
				taskProgress.put("currentSuccess", rbt.getSuccessPercent());
				taskProgress.put("currentEncounters", rbt.getEncountersPercent());
				progresses.add(taskProgress);
			}
			
			progress.put("progresses", progresses);
			progress.put("globalSuccess", currentOL.getSuccessPercent());
			progress.put("globalEncounters", currentOL.getEncountersPercent());
			
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		return progress;
	}
	
	private CurrentObjectiveLevel initialiseCurrentObjectiveLevel(String objectiveID, String levelID) {
		CurrentObjectiveLevel currentOL = new CurrentObjectiveLevelImpl();
		try {
			LearningPath path = modelsManager.getLearnerPlayer().getLearningpath(); 
			Objective objective = getObjective(path, objectiveID); 
			Level level = getLevel(path, objective, levelID); 
			
			currentOL.setAchieved(false);
			currentOL.setObjective(objective);
			currentOL.setLevel(level);
			
			currentOL.setResults(new ResultsImpl());
			
			for(ATask task: level.getTasks()) {
				ResultsByTask rbt = new ResultsByTaskImpl(); 
				rbt.setTask(task);
				currentOL.getResults().getResultsbytask().add(rbt);
			}
			
			modelsManager.getLearnerPlayer().getProgression().getLearnerProgress().getCurrentobjectivelevels().add(currentOL);
		} catch (NonExistantObjectiveOrLevelException e) {
			e.printStackTrace();
		}

		modelsManager.saveLearnerPlayerModel();
		return currentOL; 
	}
	
	private Objective getObjective(LearningPath path, String objectiveID) throws NonExistantObjectiveOrLevelException {
		for(Objective objective: path.getObjectives()) {
			if(objective.getID().equals(objectiveID)) {
				return objective;
			}
		}
		throw new NonExistantObjectiveOrLevelException(objectiveID, "", path.getID());
	}
	
	private Level getLevel(LearningPath path, Objective objective, String levelID) throws NonExistantObjectiveOrLevelException {
		for(Level level: objective.getLevels()) {
			if(level.getID().equals(levelID)) {
				return level;
			}
		}
		throw new NonExistantObjectiveOrLevelException(objective.getID(), levelID, path.getID());
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getGeneralStats() {
		JSONObject stats = new JSONObject();
		if(modelsManager.getLearnerPlayer().getStatistics() == null) {
			modelsManager.getLearnerPlayer().setStatistics(new StatisticsImpl());
			modelsManager.saveLearnerPlayerModel();
		}
		
		stats.put("nbLevelsGenerated", modelsManager.getLearnerPlayer().getStatistics().getNbLevelsGenerated());
		stats.put("nbLevelsPlayedUntilEnd", modelsManager.getLearnerPlayer().getStatistics().getNbFinishedLevels());
		stats.put("nbDeaths", modelsManager.getLearnerPlayer().getStatistics().getNbDeaths());
		stats.put("nbExits", modelsManager.getLearnerPlayer().getStatistics().getNbUnfinishedLevels());
		stats.put("totalCoins", modelsManager.getLearnerPlayer().getStatistics().getTotalCoins()); 
		stats.put("nbQuestionsMeet", modelsManager.getLearnerPlayer().getStatistics().getNbQuestionsEncountered());
		stats.put("nbCorrectAnswers", modelsManager.getLearnerPlayer().getStatistics().getNbCorrectGivenAnswers());
		stats.put("maxLevelReached", modelsManager.getLearnerPlayer().getStatistics().getMaxGameLevelReached());
		stats.put("totalTimeMin", modelsManager.getLearnerPlayer().getStatistics().getTotalTimeMin());
		
		// "totalDispensedCoins": 0
		return stats;
	}
	
	public static void main(String[] args){
		// Test methods 
		QuestionableFact fact = new MTQFCompletion1Impl();
		for(int i = 0; i < 10; i++) {
			QuestionableFactResult res = new QuestionableFactResultImpl();
			if(i < 1 || (i > 3 && i < 5) || i > 7) {
				res.setAnswerValid(true);
			} else {
				res.setAnswerValid(false);
			}
			fact.getResults().add(res);
		}
		
		QuestionableFact fact2 = new MTQFCompletion1Impl();
		for(int i = 0; i < 10; i++) {
			QuestionableFactResult res = new QuestionableFactResultImpl();
			res.setAnswerValid(false);
			fact2.getResults().add(res);
		}
		
		LearnerPlayerManager lm = new LearnerPlayerManager(null);
		//System.err.println("nb Successive "+lm.numberOfSuccessiveSuccess(fact));
		ResultsByTask rbt = new ResultsByTaskImpl();
		ATask task = new MTCompletion1Impl();
		task.setNbConsecutiveSuccess(2);
		rbt.setTask(task);
		rbt.getQuestionableFacts().add(fact);
		//rbt.getQuestionableFacts().add(fact2);
		rbt.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt.getQuestionableFacts().add(new MTQFCompletion1Impl());
		
		
		/*lm.updateQuestionableFactStatus(rbt);
		System.err.println("achieved ? "+rbt.getQuestionableFacts().get(0).isAchieved());
		System.err.println("achieved ? "+rbt.getQuestionableFacts().get(1).isAchieved());
		System.err.println("achieved ? "+rbt.getQuestionableFacts().get(2).isAchieved());
		System.err.println("achieved ? "+rbt.getQuestionableFacts().get(3).isAchieved());
		System.err.println("achieved ? "+rbt.getQuestionableFacts().get(4).isAchieved());
		
		System.out.println("Success before "+rbt.getSucessPercent());
		rbt.setSucessPercent(lm.computeTaskSuccessPercent(rbt));
		System.out.println("Success after "+rbt.getSucessPercent());
		
		System.out.println("Encounter before "+rbt.getEncountersPercent());
		rbt.setEncountersPercent(lm.computeTaskEncounteredPercent(rbt));
		System.out.println("Encounter after "+rbt.getEncountersPercent());*/ 
		
		CurrentObjectiveLevel col = new CurrentObjectiveLevelImpl();
		col.setResults(new ResultsImpl());
		col.getResults().getResultsbytask().add(rbt);
		col.setAchieved(false);
		
		Level level = new MTLevelImpl(); 
		CompletionCriteria criteria = new CompletionCriteriaImpl();
		criteria.setEncountersPercent(10.);
		criteria.setSuccessPercent(5.0); // 10.
		level.setCompletionCriteria(criteria);
		
		col.setLevel(level);

		ResultsByTask rbt2 = new ResultsByTaskImpl();
		ATask task2 = new MTCompletion1Impl();
		task2.setNbConsecutiveSuccess(2);
		rbt2.setTask(task);
		rbt2.getQuestionableFacts().add(fact2);
		rbt2.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt2.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt2.getQuestionableFacts().add(new MTQFCompletion1Impl());
		rbt2.getQuestionableFacts().add(new MTQFCompletion1Impl());
		col.getResults().getResultsbytask().add(rbt2);
		ResultsByTask rbt3 = new ResultsByTaskImpl();
		rbt3.setTask(task);rbt3.getQuestionableFacts().add(new MTQFCompletion1Impl());
		col.getResults().getResultsbytask().add(rbt3);
		
	//	System.err.println(col.getResults().getResultsbytask().size());
		
		lm.updateResultsPercentages(col);
	/*	System.out.println("success col "+col.getSucessPercent());
		System.out.println("encounter col "+col.getEncountersPercent());
		System.out.println("achieved "+col.isAchieved());*/
	
	}
	
	/**
	 * Computes is a pair objective/level is achieved 
	 * @param currentOL
	 */
	private void updateCurrentLevelStatus(CurrentObjectiveLevel currentOL) {
		CompletionCriteria criteria = currentOL.getLevel().getCompletionCriteria();
		if(currentOL.getEncountersPercent() >= criteria.getEncountersPercent() && 
				currentOL.getSuccessPercent() >= criteria.getSuccessPercent()) {
			currentOL.setAchieved(true);
		}
	}
	
	/**
	 * Computes the number of maximal successive correct answers reached, on a fact by a learner
	 * @return maximal number of successive success
	 */
	private int numberOfSuccessiveSuccess(QuestionableFact fact) {
		Map<Integer, Integer> listOfSuccessiveSuccess = new HashMap<>();
		int i = 0; 
		
		for(QuestionableFactResult result: fact.getResults()) {
			if(result.isAnswerValid()) {
				if(listOfSuccessiveSuccess.containsKey(i)) {
					listOfSuccessiveSuccess.put(i, listOfSuccessiveSuccess.get(i) + 1);
				} else {
					listOfSuccessiveSuccess.put(i, 1);
				}
			} else {
				i++;
			}
		}
		if(listOfSuccessiveSuccess.isEmpty()) {
			return 0;
		} else {
			int key = Collections.max(listOfSuccessiveSuccess.entrySet(), Map.Entry.comparingByValue()).getKey();
			return listOfSuccessiveSuccess.get(key);
		}
	}
	
	/**
	 * Computes computed values based on results 
	 */
	public void updateResultsPercentages(CurrentObjectiveLevel currentOL) {
	
		this.updateEveryQuestionableFactStatus(currentOL);
		
		double sumTaskSuccess = 0.0; 
		double sumTaskEncounters = 0.0; 
		double numberOfTasks = currentOL.getResults().getResultsbytask().size();
		
		for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {	
			rbt.setEncountersPercent(this.computeTaskEncounteredPercent(rbt));
			rbt.setSuccessPercent(this.computeTaskSuccessPercent(rbt));
			
			/*System.out.println("success "+rbt.getSucessPercent());
			System.out.println("encounter "+rbt.getEncountersPercent());*/
			
			sumTaskSuccess += rbt.getSuccessPercent();
			sumTaskEncounters += rbt.getEncountersPercent(); 
		}
		/*System.out.println(sumTaskEncounters / numberOfTasks);
		System.out.println(sumTaskSuccess / numberOfTasks);
		System.out.println(numberOfTasks);*/
		currentOL.setEncountersPercent(sumTaskEncounters / numberOfTasks); 
		currentOL.setSuccessPercent(sumTaskSuccess / numberOfTasks);
		this.updateCurrentLevelStatus(currentOL);
	}
	
	private void updateEveryQuestionableFactStatus(CurrentObjectiveLevel currentOL) {
		for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {
			this.updateQuestionableFactStatus(rbt);
		}
	}
	
	/**
	 * Computes the percentage of success of a learner on a task 
	 * @param taskResults
	 * @return percentage of success 
	 */
	private double computeTaskSuccessPercent(ResultsByTask taskResults) {
		double numberOfachievedFacts = numberTaskAchievedFacts(taskResults); 
		double numberOfFacts = taskResults.getQuestionableFacts().size();
		return (numberOfachievedFacts / numberOfFacts) * 100;
	}
	
	/**
	 * Computes the number of questionable facts encountered by the learner
	 * @param taskResults
	 * @return
	 */
	private double computeTaskEncounteredPercent(ResultsByTask taskResults) {
		double numberOfencounteredFacts = numberTaskEncounteredFacts(taskResults);
		double numberOfFacts = taskResults.getQuestionableFacts().size();
		return (numberOfencounteredFacts / numberOfFacts) * 100;
	}
	
	/**
	 * Computes the number of questionable facts that have been achieved
	 * @param taskResults 
	 * @return number of achieved facts
	 */
	private double numberTaskAchievedFacts(ResultsByTask taskResults) {
		double count = 0.; 
		
		for(QuestionableFact fact: taskResults.getQuestionableFacts()) {
			if(fact.isAchieved()) {
				count++;
			}
		}
		
		return count;
	}

	/**
	 * Compute the number of questionable facts that have been encountered by the learner at least once
	 * @param taskResults 
	 * @return number of encountered facts
	 */
	private double numberTaskEncounteredFacts(ResultsByTask taskResults) {
		double count = 0.; 
		
		for(QuestionableFact fact: taskResults.getQuestionableFacts()) {
			if(!fact.getResults().isEmpty()) {
				count++;
			}
		}
		
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getLearnerCoins() {
		JSONObject coins = new JSONObject();
		coins.put("balance", modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCoins());
		return coins;
	}
	
	public void setLearnerCoins(JSONObject obj) throws NonExistantLearnerPlayerException {
		/*
		 * The total number of coins is not impacted because this call will only be used by cheat code 
		 */
		
		modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setCoins(((Long) obj.get("newBalance")).intValue());		
		modelsManager.saveLearnerPlayerModel();
	}
	
	public void savePlayerResults(JSONObject obj) throws NonExistantLearnerPlayerException {
		
		if(modelsManager.getLearnerPlayer().getStatistics() == null) {
			modelsManager.getLearnerPlayer().setStatistics(new StatisticsImpl());
		}
		
		modelsManager.getLearnerPlayer().getStatistics().setNbQuestionsEncountered(modelsManager.getLearnerPlayer().getStatistics().getNbQuestionsEncountered() + Long.valueOf((Long) obj.get("nbQuestionsMeet")).intValue());
		modelsManager.getLearnerPlayer().getStatistics().setNbCorrectGivenAnswers(modelsManager.getLearnerPlayer().getStatistics().getNbCorrectGivenAnswers() + Long.valueOf((Long) obj.get("nbCorrectAnswers")).intValue());
		modelsManager.getLearnerPlayer().getStatistics().setTotalTimeMin(modelsManager.getLearnerPlayer().getStatistics().getTotalTimeMin() + ((Long) obj.get("timeInMin")).intValue());
			
		switch((String) obj.get("finishStatus")) {
			case "DEAD": modelsManager.getLearnerPlayer().getStatistics().setNbDeaths(modelsManager.getLearnerPlayer().getStatistics().getNbDeaths() + 1);
			modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setCurrentLevel(1);
			break;
			case "EXIT": modelsManager.getLearnerPlayer().getStatistics().setNbFinishedLevels(modelsManager.getLearnerPlayer().getStatistics().getNbFinishedLevels() + 1); 
			modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setCurrentLevel(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel() + 1);
			break;
			default: modelsManager.getLearnerPlayer().getStatistics().setNbUnfinishedLevels(modelsManager.getLearnerPlayer().getStatistics().getNbUnfinishedLevels() + 1); // == HUB
		}
			
		if(modelsManager.getLearnerPlayer().getStatistics().getMaxGameLevelReached() < modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel()) {
			modelsManager.getLearnerPlayer().getStatistics().setMaxGameLevelReached(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel());
		}
			
		modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().setCoins(modelsManager.getLearnerPlayer().getProgression().getPlayerProgress().getCoins() + Long.valueOf((Long) obj.get("nbCoinsCollected")).intValue());
		modelsManager.getLearnerPlayer().getStatistics().setTotalCoins(modelsManager.getLearnerPlayer().getStatistics().getTotalCoins() + Long.valueOf((Long) obj.get("nbCoinsCollected")).intValue());
			
		modelsManager.saveLearnerPlayerModel();
	}

	/**
	 * Add learners' results for each facts per task questioned in a dungeon
	 * @param obj (results in json) 
	 * @return
	 * @throws NonExistantLearnerPlayerException 
	 */
	public void saveLearnerResults(JSONObject obj) throws NonExistantLearnerPlayerException { 
		CurrentObjectiveLevel col;
		col = getCorrespondingCOL((String) obj.get("objectiveID"), (String) obj.get("levelID"));
		if(col != null) {
			JSONArray results = (JSONArray) obj.get("resultsByTasks");
			for (Object object : results) {
				JSONObject taskResult = (JSONObject) object;
				ResultsByTask rbt = getCorrespondingResultsByTask((String) taskResult.get("taskID"), col);
				if(rbt != null) {
					addResultsToTask(taskResult, rbt);
				} else {
					System.err.println("ResultsByTask not found with ID = " + (String) taskResult.get("taskID"));
				}
			}
			updateResultsPercentages(col);
		} else {
			System.err.println("CurrentObjectiveLevel not found for O/L = (" + (String) obj.get("objectiveID") + " , " + (String) obj.get("levelID") + ")");
		}
		
		modelsManager.saveLearnerPlayerModel();
	}
	
	public void resetLearnerProgress(LearnerPlayer learner, Objective objective, Level level) {
		CurrentObjectiveLevel currentOL = getCurrentObjectiveLevel(learner, objective, level); 
		if(currentOL != null) {
			learner.getProgression().getLearnerProgress().getCurrentobjectivelevels().remove(currentOL);
			learner.getProgression().getPlayerProgress().setCurrentLevel(1);
			learner.setStatistics(new StatisticsImpl());
		}	
		modelsManager.saveLearnerPlayerModel();
	}

	
	
	private CurrentObjectiveLevel getCurrentObjectiveLevel(LearnerPlayer learner, Objective objective, Level level) {
		for(CurrentObjectiveLevel currentOL: learner.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(currentOL.getObjective().getID().equals(objective.getID()) && currentOL.getLevel().getID().equals(level.getID())) {
				return currentOL;
			}
		}
		return null;
	}
	
	
	private void addResultsToTask(JSONObject jtask, ResultsByTask rbt) {
		JSONArray facts = (JSONArray) jtask.get("questionableFacts");
		for (Object object : facts) {
			JSONObject factResult = (JSONObject) object;
			QuestionableFact qf = getCorrespondingQuestionnableFact((String) factResult.get("questionableFactID"), rbt);
			if(qf != null) {
				QuestionableFactResult qfres = new QuestionableFactResultImpl();
				qfres.setAnswerValid((boolean) factResult.get("isCorrect"));
				qfres.setResponseTime((int) (long) factResult.get("responseTime"));
				qfres.setOnTime((boolean) factResult.get("onTime"));
				JSONArray answers = (JSONArray) factResult.get("answers");
				for (Object answer : answers) {
					qfres.getGivenAnswers().add(answer+"");
				}
				qf.getResults().add(qfres);
			} else {
				System.err.println("Questionnable fact not found with ID = " + (String) factResult.get("questionableFactID"));
			}
		}
	}
	
	private QuestionableFact getCorrespondingQuestionnableFact(String factID, ResultsByTask rbt) {
		for (QuestionableFact qf : rbt.getQuestionableFacts()) {
			if(qf.getID().equals(factID)) {
				return qf;
			}
		}
		return null; 
	}
	
	private ResultsByTask getCorrespondingResultsByTask(String taskID, CurrentObjectiveLevel col) {
		for (ResultsByTask rbt : col.getResults().getResultsbytask()) {
			if(rbt.getTask().getID().equals(taskID)) {
				return rbt;
			}
		}
		return null;
	}
	
	private CurrentObjectiveLevel getCorrespondingCOL(String objectiveID, String levelID) throws NonExistantLearnerPlayerException {
		for (CurrentObjectiveLevel col : modelsManager.getLearnerPlayer().getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			/*System.out.println(col.getObjective().getID()+" "+col.getLevel().getID());
			System.out.println(col.getObjective().getID().equals(objectiveID));
			System.out.println(col.getLevel().getID().equals(levelID));*/
			if(col.getObjective().getID().equals(objectiveID) && col.getLevel().getID().equals(levelID)) {
				return col;
			}
		}
		return null;
	}

}
