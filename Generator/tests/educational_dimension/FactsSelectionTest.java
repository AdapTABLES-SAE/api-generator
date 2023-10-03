package educational_dimension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.CompletionCriteria;
import generator.CurrentObjectiveLevel;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.ResultsByTask;
import generator.impl.QuestionableFactResultImpl;
import generators.ALGAGenerator;

class FactsSelectionTest { //TODO : refaire proprement
	
	private ALGAGenerator generator;
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		String learnerID = new ArrayList<>(info.getTags()).get(0);
		generator = new ALGAGenerator(true, learnerID, "Contexts.xmi", "FACT_TEST");
	}

	@Test
	@Tag(value = "LP01F")
	void oneConsecutiveSuccessTest() {
		do {
			generator.generate(); 
			generator.saveDungeon("DungeonGen.xmi");
			addResultsToFacts();
			updateResultsPercentages(generator.getCurrentObjectiveLevel());
		} while(!isEachFactAchieved() && !areEachFactisCorrectlyAchieved());
		
		assertTrue(true);
		
		generator.resetLearnerProgress();
	}
	
	@Test
	@Tag(value = "LP02F")
	void multipleConsecutiveSuccessOnFullParamsTest() {
		do {
			generator.generate(); 
			generator.saveDungeon("DungeonGen.xmi");
			addResultsToFacts();
			updateResultsPercentages(generator.getCurrentObjectiveLevel());
		} while(!isEachFactAchieved() && !areEachFactisCorrectlyAchieved());
		
		assertTrue(true);
		generator.resetLearnerProgress();
	}
	
	private void addResultsToFacts() {
		for(QuestionableFact fact: this.generator.getDungeonFacts()) {
			QuestionableFactResult result = new QuestionableFactResultImpl();
			result.setAnswerValid(true);
			fact.getResults().add(result);
		}
	}

	public boolean isEachFactAchieved() {
		CurrentObjectiveLevel currentOL = generator.getCurrentObjectiveLevel();
		for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {
			for(QuestionableFact fact: rbt.getQuestionableFacts()) {
				if(!fact.isAchieved() ) return false;
			}
		}
		return true;
	}
	
	private boolean areEachFactisCorrectlyAchieved() {
		CurrentObjectiveLevel currentOL = generator.getCurrentObjectiveLevel();
		for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {
			int nbOfExpectedConsecutiveSuccess = rbt.getTask().getNbConsecutiveSuccess();
			for(QuestionableFact fact: rbt.getQuestionableFacts()) {
				if(!isNumberOfConsecutiveSuccessValid(fact, nbOfExpectedConsecutiveSuccess)) return false;
			}
		}
		return true; 
	}
	
	private boolean isNumberOfConsecutiveSuccessValid(QuestionableFact fact, int expectedNumber) {
		int consecutive = 0; 
		for(QuestionableFactResult res: fact.getResults()) {
			if(res.isAnswerValid()) { consecutive++; } 
			if(consecutive == expectedNumber) { return true; }
			else { consecutive = 0; }
		}
		return false;
	}
	
	public void updateResultsPercentages(CurrentObjectiveLevel currentOL) {
		
		this.updateEveryQuestionableFactStatus(currentOL);
		
		double sumTaskSuccess = 0.0; 
		double sumTaskEncounters = 0.0; 
		double numberOfTasks = currentOL.getResults().getResultsbytask().size();
		
		for(ResultsByTask rbt: currentOL.getResults().getResultsbytask()) {	
			rbt.setEncountersPercent(this.computeTaskEncounteredPercent(rbt));
			rbt.setSuccessPercent(this.computeTaskSuccessPercent(rbt));			
			sumTaskSuccess += rbt.getSuccessPercent();
			sumTaskEncounters += rbt.getEncountersPercent(); 
		}
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
}
