package factgenerator_template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import generator.ATask;
import generator.AbstractFact;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.SetOfFacts;
import managers.EducationElementsManager;

public abstract class TaskFactGeneratorTemplate {

	protected EducationElementsManager eeManager;
	protected String taskID;
	protected int factsCounter; 
	
	public TaskFactGeneratorTemplate(EducationElementsManager eeManager) {
		this.eeManager = eeManager;
		this.factsCounter = 0;
	}
	
	public Set<QuestionableFact> generateQuestionableFacts(ATask task){
		Set<QuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				questionableFacts.addAll(generateQuestionableFactsOf(task, f));
			}
		}	
		return questionableFacts; 
	}
	
	protected abstract Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact);
		
	protected void createAQuestionedFactFrom(ATask task, QuestionableFact qFact, int correctnessToReach) {
		QuestionedFact qef = initializeQuestionedFact(); 
		qef.setQuestionablefact(qFact);
		
		if(task.getResponseModality() instanceof MultipleChoice) {
			manageChoices((MultipleChoice)task.getResponseModality(), qFact, qef);
		}
		
		qef.setCompleteFact();
		qef.setCorrectnessToReach(correctnessToReach);
		eeManager.addFactToQuestion(task, qef); 
	}

	protected abstract QuestionedFact initializeQuestionedFact();
	
	protected abstract void manageChoices(MultipleChoice mc, QuestionableFact qaf, QuestionedFact qef);
	
	
	public void generateQuestionedFact(EducationElementsManager eeManager, ResultsByTask aTask) {
		for (int i = 0; i < aTask.getTask().getNbFacts(); i++) {
			QuestionableFact qf;
			try {
				qf = getAvailableFact(aTask);
				createAQuestionedFactFrom(aTask.getTask(), qf, correctnessToReach(aTask.getTask()));
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}	
	}
	
	protected abstract int correctnessToReach(ATask aTask);
	
	private QuestionableFact getAvailableFact(ResultsByTask resByTask) throws Exception { 
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
