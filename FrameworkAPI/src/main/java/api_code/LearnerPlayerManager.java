package api_code;

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
import generator.Level;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.ResultsByTask;
import generator.impl.CompletionCriteriaImpl;
import generator.impl.CurrentObjectiveLevelImpl;
import generator.impl.ItemImpl;
import generator.impl.ItemsImpl;
import generator.impl.MTCompletion1Impl;
import generator.impl.MTLevelImpl;
import generator.impl.MTQFCompletion1Impl;
import generator.impl.QuestionableFactResultImpl;
import generator.impl.ResultsByTaskImpl;
import generator.impl.ResultsImpl;
import generator.impl.StatisticsImpl;
import managers.ModelsManager;

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
		case "MTRecontructionImpl": return "REB"; 
		case "MTIdentificationImpl": return "ID"; 
		case "MTMembershipImpl": return "MEMB"; 
		default: return "";
		}
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getItemsStatus(String playerID) {
		JSONObject store = new JSONObject();
		JSONArray items = new JSONArray();
		try {
			LearnerPlayer player = modelsManager.getLearnerPlayer(playerID);
			
			if(player.getProgression().getPlayerProgress().getItems() == null) {
				player.getProgression().getPlayerProgress().setItems(new ItemsImpl());
				modelsManager.saveContextModel();
			}
			
			for(Item anItem: player.getProgression().getPlayerProgress().getItems().getItems()) {
				JSONObject item = new JSONObject();
				item.put("id", anItem.getEquipment().getID());
				item.put("isBought", anItem.isBought());
				item.put("isActivated", anItem.isActivated());
				items.add(item);
			}
			store.put("items", items);
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		return store;
	}
	
	public String setItemsStatus(JSONObject obj) {
		try {
			LearnerPlayer player = modelsManager.getLearnerPlayer((String) obj.get("learnerID"));
			
			JSONArray items = (JSONArray) obj.get("items");
			for(Object oItem: items) {
				JSONObject jItem = (JSONObject) oItem;
				Item item = getPlayerItem(player, (String) jItem.get("id"));
				item.setActivated((boolean) jItem.get("isActivated"));
				item.setBought((boolean) jItem.get("isBought"));
			}
			
			modelsManager.saveContextModel();
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		return "Success"; 
	}
	
	private Item getPlayerItem(LearnerPlayer player, String itemID) {
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
	public JSONObject getTaskProgresses(String learnerID, String objectiveID, String levelID) {
		JSONObject progress = new JSONObject();
		JSONArray progresses = new JSONArray();
		try {
			
			CurrentObjectiveLevel currentOL = getCorrespondingCOL(objectiveID, levelID, learnerID);
			for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {
				JSONObject taskProgress = new JSONObject(); 
				taskProgress.put("idTask", rbt.getTask().getID());
				taskProgress.put("typeTask", getTaskType(rbt.getTask())); 
				taskProgress.put("currentSuccess", rbt.getSucessPercent());
				taskProgress.put("currentEncounters", rbt.getEncountersPercent());
				progresses.add(taskProgress);
			}
			
			progress.put("progresses", progresses);
			progress.put("globalSuccess", currentOL.getSucessPercent());
			progress.put("globalEncounters", currentOL.getEncountersPercent());
			
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		return progress;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getGeneralStats(String learnerID) {
		JSONObject stats = new JSONObject();
		try {
			LearnerPlayer learner = modelsManager.getLearnerPlayer(learnerID);
			
			if(learner.getStatistics() == null) {
				learner.setStatistics(new StatisticsImpl());
				modelsManager.saveContextModel();
			}
			
			stats.put("nbLevelsGenerated", learner.getStatistics().getNbLevelsGenerated());
			stats.put("nbLevelsPlayedUntilEnd", learner.getStatistics().getNbFinishedLevels());
			stats.put("nbDeaths", learner.getStatistics().getNbDeaths());
			stats.put("nbExits", learner.getStatistics().getNbUnfinishedLevels());
			stats.put("totalCoins", learner.getStatistics().getTotalCoins()); 
			stats.put("nbQuestionsMeet", learner.getStatistics().getNbQuestionsEncountered());
			stats.put("nbCorrectAnswers", learner.getStatistics().getNbCorrectGivenAnswers());
			stats.put("maxLevelReached", learner.getStatistics().getMaxGameLevelReached());
			stats.put("totalTime", learner.getStatistics().getTotalTime());
			
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		
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
		criteria.setSuccesPercent(5.0); // 10.
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
				currentOL.getSucessPercent() >= criteria.getSuccesPercent()) {
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
			rbt.setSucessPercent(this.computeTaskSuccessPercent(rbt));
			
			/*System.out.println("success "+rbt.getSucessPercent());
			System.out.println("encounter "+rbt.getEncountersPercent());*/
			
			sumTaskSuccess += rbt.getSucessPercent();
			sumTaskEncounters += rbt.getEncountersPercent(); 
		}
		/*System.out.println(sumTaskEncounters / numberOfTasks);
		System.out.println(sumTaskSuccess / numberOfTasks);
		System.out.println(numberOfTasks);*/
		currentOL.setEncountersPercent(sumTaskEncounters / numberOfTasks); 
		currentOL.setSucessPercent(sumTaskSuccess / numberOfTasks);
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
	
	public String savePlayerResults(JSONObject obj) {
		try {
			LearnerPlayer player = modelsManager.getLearnerPlayer((String) obj.get("learnerID"));
			player.getStatistics().setNbQuestionsEncountered(player.getStatistics().getNbQuestionsEncountered() + Long.valueOf((Long) obj.get("nbQuestionsMeet")).intValue());
			player.getStatistics().setNbCorrectGivenAnswers(player.getStatistics().getNbCorrectGivenAnswers() + Long.valueOf((Long) obj.get("nbCorrectAnswers")).intValue());
			player.getStatistics().setTotalTime(player.getStatistics().getTotalTime() + (double) obj.get("timeInSec"));
			
			switch((String) obj.get("finishStatus")) {
				case "DEAD": player.getStatistics().setNbDeaths(player.getStatistics().getNbDeaths() + 1);
				player.getProgression().getPlayerProgress().setCurrentLevel(1);
				break;
				case "EXIT": player.getStatistics().setNbFinishedLevels(player.getStatistics().getNbFinishedLevels() + 1); 
				player.getProgression().getPlayerProgress().setCurrentLevel(player.getProgression().getPlayerProgress().getCurrentLevel() + 1);
				break;
			default: player.getStatistics().setNbUnfinishedLevels(player.getStatistics().getNbUnfinishedLevels() + 1); // == HUB
					 player.getProgression().getPlayerProgress().setCurrentLevel(1);
			}
			
			if(player.getStatistics().getMaxGameLevelReached() < player.getProgression().getPlayerProgress().getCurrentLevel()) {
				player.getStatistics().setMaxGameLevelReached(player.getProgression().getPlayerProgress().getCurrentLevel());
			}
			
			player.getProgression().getPlayerProgress().setCoins(player.getProgression().getPlayerProgress().getCoins() + Long.valueOf((Long) obj.get("nbCoinsCollected")).intValue());
			player.getStatistics().setTotalCoins(player.getStatistics().getTotalCoins() + Long.valueOf((Long) obj.get("nbCoinsCollected")).intValue());
			
			modelsManager.saveContextModel();
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		} 	
		return "Success";
	}

	/**
	 * Add learners' results for each facts per task questioned in a dungeon
	 * @param obj (results in json) 
	 * @return
	 */
	public String saveLearnerResults(JSONObject obj) { // TODO: Values of percentages are not valid
		CurrentObjectiveLevel col;
		try {
			col = getCorrespondingCOL((String) obj.get("objectiveID"), (String) obj.get("levelID"), (String) obj.get("learnerID"));
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
				/*System.out.println(col.getSucessPercent());
				System.out.println(col.getEncountersPercent());*/
			} else {
				System.err.println("CurrentObjectiveLevel not found for O/L = (" + (String) obj.get("objectiveID") + " , " + (String) obj.get("levelID") + ")");
			}
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		
		modelsManager.saveContextModel();
		return "Success";
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
	
	private CurrentObjectiveLevel getCorrespondingCOL(String objectiveID, String levelID, String learnerID) throws NonExistantLearnerPlayerException {
		for (CurrentObjectiveLevel col : modelsManager.getLearnerPlayer(learnerID).getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
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
