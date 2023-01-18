package factsgenerator_maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.ATask;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTIdentification;
import generator.MTMembership;
import generator.MTQFCompletion1;
import generator.MTQFCompletion2;
import generator.MTQFMembership;
import generator.MTQFRebuild;
import generator.MTQeFCompletion1;
import generator.MTQeFCompletion2;
import generator.MTQeFIdentication;
import generator.MTQeFMembership;
import generator.MTQeFRebuild;
import generator.MTRecontruction;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.impl.MTQeFCompletion1Impl;
import generator.impl.MTQeFCompletion2Impl;
import generator.impl.MTQeFIdenticationImpl;
import generator.impl.MTQeFMembershipImpl;
import generator.impl.MTQeFRebuildImpl;
import managers.EducationElementsManager;
import structures.EMTQFactClass;

public class MTFactGenerator {
		
	public static void generateQuestionableFacts(EducationElementsManager eeManager) {
		eeManager.instanciateQFbyTasks();
		boolean wasGenerated = false;
		for (ResultsByTask resBytask : eeManager.getLearnerResultsByTasks()) {
			if(resBytask.getQuestionableFacts().isEmpty()) {
				generateQuestionableFactsByTask(eeManager, resBytask);
				wasGenerated = true;
			}
		}
		if(wasGenerated) {
			eeManager.saveLearnerModel();
		}
		
	}
	
	private static void  generateQuestionableFactsByTask(EducationElementsManager eeManager, ResultsByTask resBytask) {
		switch(resBytask.getTask().getType()) {
		case COMPLETE1: 
			MTCompletion1Generator generatorC1 = new MTCompletion1Generator(eeManager);
			resBytask.getQuestionableFacts().addAll(generatorC1.generateQuestionableFacts((MTCompletion1) resBytask.getTask()));
			break;
		case COMPLETE2: 
			MTCompletion2Generator generatorC2 = new MTCompletion2Generator(eeManager);
			resBytask.getQuestionableFacts().addAll(generatorC2.generateQuestionableFacts((MTCompletion2) resBytask.getTask()));
			break;
		case REBUILD: 
			MTRebuildGenerator generatorR = new MTRebuildGenerator(eeManager);
			resBytask.getQuestionableFacts().addAll(generatorR.generateQuestionableFacts((MTRecontruction) resBytask.getTask()));
			break;
		case IDENTIFY: 
			MTIdentificationGenerator generatorID = new MTIdentificationGenerator(eeManager);
			resBytask.getQuestionableFacts().addAll(generatorID.generateQuestionableFacts((MTIdentification) resBytask.getTask()));
			break;
		case MEMBERSHIP: 
			MTMembershipGenerator generatorMem = new MTMembershipGenerator(eeManager);
			resBytask.getQuestionableFacts().addAll(generatorMem.generateQuestionableFacts((MTMembership) resBytask.getTask()));
			break;
		}
	}
	
	public static void generateQuestionedFact(EducationElementsManager eeManager, List<ResultsByTask> tasks) throws Exception {
		//System.out.println(tasks.isEmpty());
		for (ResultsByTask aTask : tasks) {
			//System.out.println("Task.facts "+aTask.getQuestionableFacts());
			QuestionableFact qf = getAvailableFact(aTask); 
			EMTQFactClass qf_class = EMTQFactClass.valueOf(qf.getClass().getSimpleName());
			switch(qf_class) {
				case MTQFCompletion1Impl: 
					createQuestionedFactForCompletion1(eeManager, aTask.getTask(), qf);
					break;
				case MTQFCompletion2Impl: 
					createQuestionedFactForCompletion2(eeManager, aTask.getTask(), qf);
					break;
				case MTQFRebuildImpl: // TODO : doublons possible + pb affichage 
					createQuestionedFactForRebuild(eeManager, aTask.getTask(), qf);
					break;
				case MTQFIdentificationImpl: 
					createQuestionedFactsForIdentify(eeManager, aTask, qf);
					break;
				case MTQFMembershipImpl: 
					createQuestionedFactForMembership(eeManager, aTask.getTask(), qf);
					break;
			}
						
		}
	}
	
	private static void createQuestionedFactForMembership(EducationElementsManager eeManager, ATask task, QuestionableFact qfact) throws Exception {
		MTQeFMembership qef = new MTQeFMembershipImpl();
		qef.setQuestionablefact(qfact);
		
		if(!(task.getResponseModality() instanceof MultipleChoice)) {throw new Exception("Membership task with Entry response modality");}

		List<Integer> notAllowed = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			notAllowed.add(((MTQFMembership) qfact).getTable()*i);
		}
		
		List<Integer> chosenPropositions = new ArrayList<>();
		while(chosenPropositions.size() < ((MultipleChoice) task.getResponseModality()).getNbBadChoices()) {
			////System.out.println("While Membership proposition");
			int number = new Random().nextInt(notAllowed.get(notAllowed.size()-1)) + 20;
			if(!notAllowed.contains(number) && !chosenPropositions.contains(number)) {
				chosenPropositions.add(number);
			}
		}
		
		qef.getBadPropositions().addAll(chosenPropositions);
		eeManager.addFactToQuestion(task, qef);
	}
	
	private static QuestionedFact createQuestionedFactForIdentify(EducationElementsManager eeManager, ATask task, QuestionableFact qfact) {
		MTQeFIdentication qef = new MTQeFIdenticationImpl(); 
		qef.setQuestionablefact(qfact);
		return qef;
	}
	
	private static void createQuestionedFactsForIdentify(EducationElementsManager eeManager, ResultsByTask aTask, QuestionableFact qfact) throws Exception {
		List<QuestionedFact> qefs = new ArrayList<>();
		for (int i = 0; i < ((MTIdentification) aTask.getTask()).getNbFacts(); i++) {
			if(i == 0 && qfact != null) {
				qefs.add(createQuestionedFactForIdentify(eeManager, aTask.getTask(), qfact));
			} else {
				qefs.add(createQuestionedFactForIdentify(eeManager, aTask.getTask(), getAvailableFact(aTask)));
			}
		}
		eeManager.addFactToQuestion(aTask.getTask(), qefs);
	}
	
	private static void createQuestionedFactForRebuild(EducationElementsManager eeManager, ATask task, QuestionableFact qfact) throws Exception {
		MTQeFRebuild qef = new MTQeFRebuildImpl();
		qef.setQuestionablefact(qfact); // TODO : vérifier qu'il n'y ait pas de seconde solution possible 
		
		if(!(task.getResponseModality() instanceof MultipleChoice)) {throw new Exception("Membership task with Entry response modality");}
		
		List<Integer> chosenPropositions = new ArrayList<>();
		chosenPropositions.add(((MTQFRebuild) qfact).getSoluceLeft());
		chosenPropositions.add(((MTQFRebuild) qfact).getSoluceRight());
		chosenPropositions.add(((MTQFRebuild) qfact).getSoluceRes());
		
		int min = ((MTQFRebuild) qfact).getSoluceRight() < ((MTQFRebuild) qfact).getSoluceLeft()? ((MTQFRebuild) qfact).getSoluceRight(): ((MTQFRebuild) qfact).getSoluceLeft();
	
		while(chosenPropositions.size() < ((MultipleChoice) task.getResponseModality()).getNbBadChoices()) {
			//System.out.println("While Rebuild proposition");
			int number = new Random().nextInt((((MTQFRebuild) qfact).getSoluceRes()+5) - (min+5)) + (min+5);
			if(!chosenPropositions.contains(number) && !createsOtherSolution(((MTQFRebuild) qfact), chosenPropositions, number)) {
				chosenPropositions.add(number);
			}
		}
		
		qef.getPropositions().addAll(chosenPropositions);
		eeManager.addFactToQuestion(task, qef);
	}
	
	private static boolean isFactSolution(MTQFRebuild fact, int i, int j, int z) {
		boolean s1 = i == fact.getSoluceLeft() || i == fact.getSoluceRight() || i == fact.getSoluceRes();
		boolean s2 = j == fact.getSoluceLeft() || j == fact.getSoluceRight() || j == fact.getSoluceRes();
		boolean s3 = z == fact.getSoluceLeft() || z == fact.getSoluceRight() || z == fact.getSoluceRes();
		return s1 && s2 && s3;
	}
	
	private static boolean createsOtherSolution(MTQFRebuild fact, List<Integer> previousResults, int number) { // TODO : to verify
		boolean c1, c2, c3;
		for (Integer i : previousResults) {
			for (Integer j : previousResults) {
				if(i != j && !isFactSolution(fact, i, j, number) ) {
					c1 = (i*j) == number;
					c2 = previousResults.contains((i*number));
					c3 = previousResults.contains((j*number));
					if(c1 || c2 || c3) {
						return true; 
					}
				}
			}
		}
		return false; 
	}
	
	private static void createQuestionedFactForCompletion2(EducationElementsManager eeManager, ATask task, QuestionableFact qfact) throws Exception {
		MTQeFCompletion2 qef = new MTQeFCompletion2Impl();
		qef.setQuestionablefact(qfact);
		
		if(!(task.getResponseModality() instanceof MultipleChoice)) {throw new Exception("Completion2 task with Entry response modality");}
		
		qef.getPropositions().addAll(generateCompletion2Proposition(((MTQFCompletion2) qfact), ((MultipleChoice) task.getResponseModality()).getNbBadChoices()));
		
		eeManager.addFactToQuestion(task, qef);
	}
	
	private static void createQuestionedFactForCompletion1(EducationElementsManager eeManager, ATask task, QuestionableFact qfact) {
		MTQeFCompletion1 qef = new MTQeFCompletion1Impl();
		qef.setQuestionablefact(qfact);
		
		if(task.getResponseModality() instanceof MultipleChoice) {			
			qef.getPropositions().addAll(generateCompletion1Proposition(((MTQFCompletion1) qfact), ((MultipleChoice) task.getResponseModality()).getNbBadChoices()));
		} 
				
		eeManager.addFactToQuestion(task, qef);
	}
	
	private static List<Integer> generateCompletion1Proposition(MTQFCompletion1 qfact, int numberOfBadChoices){
		List<Integer> propositions = new ArrayList<>();
		propositions.add(qfact.getSoluce());
		int min = qfact.getSoluce()-10 >= 0? qfact.getSoluce()-10: 0;
		int max = qfact.getSoluce()+10;
		
		while(propositions.size() < numberOfBadChoices+1) {
			//System.out.println("While Comp1 proposition");
			int number = new Random().nextInt(max - min) + min;
			if(!propositions.contains(number)) {
				propositions.add(number);
			}
		}
		
		return propositions; 
	}
	
	private static List<Integer> generateCompletion2Proposition(MTQFCompletion2 qfact, int numberOfBadChoices){
		List<Integer> propositions = new ArrayList<>();
		boolean left = qfact.getLeftOperand() == -1; 
		boolean right = qfact.getRightOperand() == -1;
		boolean res = qfact.getResult() == -1;
		if(left) {propositions.add(qfact.getSoluceLeft());}
		if(right) {propositions.add(qfact.getSoluceRight());}
		if(res) {propositions.add(qfact.getSoluceRes());}
		
		/*while(propositions.size() < numberOfBadChoices+2) {
			//System.out.println("While Comp2 proposition");
			new Random()
		}*/
		return propositions; 
	}

	private static QuestionableFact getAvailableFact(ResultsByTask resByTask) throws Exception { // TODO : corriger : Supprime je sais pas pourquoi le pool pour après
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
	
	private static List<QuestionableFact> getEligibleQuestionableFacts(ResultsByTask resByTask){
		List<QuestionableFact> eligibleFacts = new ArrayList<>();
		for (QuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved() && !qfact.isWasSelected()) {
				eligibleFacts.add(qfact);
			}
		}
		return eligibleFacts;
	}
	
	private static boolean isPoolEmpty(ResultsByTask resByTask) {
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
	
	private static void resetPoolOfFacts(ResultsByTask resByTask) {
		for (QuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved() && qfact.isWasSelected()) {
				qfact.setWasSelected(false);
			}
		}
	}
}
