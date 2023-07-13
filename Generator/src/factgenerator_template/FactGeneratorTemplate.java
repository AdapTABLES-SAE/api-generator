package factgenerator_template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import generator.ATask;
import generator.AbstractFact;
import generator.Correctness;
import generator.CorrectnessValue;
import generator.ECorrectness;
import generator.EnterResponse;
import generator.EntrySoluceParam;
import generator.FactCorrectnessParam;
import generator.FactSolutionParam;
import generator.MultipleChoice;
import generator.PropositionParam;
import generator.QuestionParam;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.SetOfFacts;
import generator.Value;
import generator.WantedAnswersParam;
import generator.impl.CorrectnessImpl;
import generator.impl.CorrectnessValueImpl;
import generator.impl.EntrySoluceParamImpl;
import generator.impl.FactCorrectnessParamImpl;
import generator.impl.FactSolutionParamImpl;
import generator.impl.PropositionParamImpl;
import generator.impl.QuestionParamImpl;
import generator.impl.QuestionedFactImpl;
import generator.impl.ValueImpl;
import generator.impl.WantedAnswersParamImpl;
import structures.DungeonElements;
import structures.RoomElements;

public abstract class FactGeneratorTemplate {
	
	/**
	 * Template for fact (questionable and questioned fact) generation
	 * This template changes a little for membership facts. 
	 */

	protected DungeonElements dungeonElements;
	protected String taskID;
	protected int factsCounter; 
	
	public FactGeneratorTemplate(DungeonElements dungeonElements) {
		this.dungeonElements = dungeonElements;
		this.factsCounter = 0;
	}
	
	public Set<QuestionableFact> generateQuestionableFacts(ATask task){
		Set<QuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		for (SetOfFacts setoffact : dungeonElements.getChosenObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				questionableFacts.addAll(generateQuestionableFactsOf(task, f));
			}
		}	
		return questionableFacts; 
	}
	
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact){ return null; }
		
	protected void createAQuestionedFactFrom(RoomElements roomElement, QuestionableFact qFact, int correctnessToReach) {
		QuestionedFact qef = new QuestionedFactImpl(); 
		qef.setQuestionablefact(qFact);
		
		if(roomElement.getTask().getResponseModality() instanceof EnterResponse) {
			List<String> solutions = getListOfGoodSolutions(qFact);
			for (String sol : solutions) {
				EntrySoluceParam soluceParam = new EntrySoluceParamImpl(); 
				Value value = new ValueImpl();
				value.setValue(sol);
				soluceParam.setValue(value);
				qef.getEntrys().add(soluceParam);
			}
		} else {
			Map<ECorrectness, List<String>> propositions = getListOfPropositions((MultipleChoice) roomElement.getTask().getResponseModality(), qFact);
			for (Entry<ECorrectness, List<String>> propState : propositions.entrySet()) {
				for (String prop : propState.getValue()) {
					PropositionParam propositionParam = new PropositionParamImpl();
					
					Correctness correctness = new CorrectnessImpl();
					CorrectnessValue correctnessValue = new CorrectnessValueImpl();
					correctnessValue.setValue(propState.getKey());
					correctness.setValue(correctnessValue);
					propositionParam.setState(correctness);
					
					Value value = new ValueImpl();
					value.setValue(prop);
					propositionParam.setValue(value);
					
					qef.getPropositions().add(propositionParam);
				}
			}
		}
		QuestionParam question = new QuestionParamImpl();
		Value value = new ValueImpl();
		value.setValue(qFact.getQuestionableFact());
		question.setValue(value);
		question.setInteractive(isQuestionInteractive());
		question.getSolutions().addAll(fullFactsSolution(qFact));
		qef.setQuestion(question);
		WantedAnswersParam correctness = new WantedAnswersParamImpl();
		Value correctnessValue = new ValueImpl();
		correctnessValue.setValue(roomElement.getTask().nbExpectedAnswers()+"");//correctnessToReach(task)+"");
		correctness.setValue(correctnessValue);
		qef.setCorrectnessToReach(correctness);
		
		qef.setLearnerValidation(roomElement.getTask().isCheckOnLearnerAction());
		qef.setCompleteFact(qFact.getCompleteFact());
		
		ECorrectness factCorrectness = getFactCorrectness(qFact);
		if(factCorrectness != null) {
			FactCorrectnessParam param = new FactCorrectnessParamImpl();
			CorrectnessValue cValue = new CorrectnessValueImpl();
			cValue.setValue(factCorrectness);
			param.setValue(cValue);
			qef.setFactCorrectness(param);
		}
		
		roomElement.addQuestionedFact(qef);
	}
	
	protected ECorrectness getFactCorrectness(QuestionableFact qFact) {
		return null;
	}
	
	private List<FactSolutionParam> fullFactsSolution(QuestionableFact qFact){
		List<String> stringSolutions = factSolutionsToString(qFact);
		List<FactSolutionParam> solutions = new ArrayList<>();
		if(!stringSolutions.isEmpty()) {
			for (String sol : stringSolutions) {
				FactSolutionParam factSol = new FactSolutionParamImpl();
				Value solValue = new ValueImpl();
				solValue.setValue(sol);
				factSol.setValue(solValue);
				solutions.add(factSol);
			}
		}		
		return solutions;
	}
	
	protected List<String> factSolutionsToString(QuestionableFact qFact){
		return new ArrayList<>();
	}
	
	protected abstract List<String> getListOfGoodSolutions(QuestionableFact qFact);
	protected abstract Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact);
	protected abstract boolean isQuestionInteractive();
	
	public void generateQuestionedFact(RoomElements roomElements) {
		System.out.println("gen facts");
		for (int i = 0; i < roomElements.getTask().getNbFacts(); i++) {
			QuestionableFact qf = null;
			try {
				qf = getAvailableFact(roomElements.getCorrespondingResultByTask(dungeonElements.getCurrentObjectiveLevel()));
				createAQuestionedFactFrom(roomElements, qf, correctnessToReach(roomElements.getTask()));
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		System.out.println("gen facts end");
	}
	
	protected abstract int correctnessToReach(ATask task);
	
	private QuestionableFact getAvailableFact(ResultsByTask resByTask) throws Exception { 
		System.out.println("get facts");
		if(isPoolEmpty(resByTask)) {
			resetPoolOfFacts(resByTask);
		}	
		
		List<QuestionableFact> eligibleFacts = getEligibleQuestionableFacts(resByTask);
		if(eligibleFacts.isEmpty()) {
			throw new Exception("Pool of facts should not be empty for task "+resByTask.getTask().getType());
		} else {
			int number = new Random().nextInt(eligibleFacts.size());
			return eligibleFacts.get(number);
		}
	}
	
	private List<QuestionableFact> getEligibleQuestionableFacts(ResultsByTask resByTask){
		List<QuestionableFact> eligibleFacts = new ArrayList<>();
		for (QuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved() && !qfact.isWasSelected()) {
				eligibleFacts.add(qfact);
			}
		}
		return eligibleFacts;
	}
	
	private boolean isPoolEmpty(ResultsByTask resByTask) {
		int i = 0; 
		boolean hasAvailable = false;
		while(i < resByTask.getQuestionableFacts().size() && !hasAvailable) {
			if(!resByTask.getQuestionableFacts().get(i).isAchieved() && !resByTask.getQuestionableFacts().get(i).isWasSelected()) {
				hasAvailable = true;
			}
			i++;
		}
		return hasAvailable; 
	}
	
	private void resetPoolOfFacts(ResultsByTask resByTask) {
		for (QuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved() && qfact.isWasSelected()) {
				qfact.setWasSelected(false);
			}
		}
	}
}
