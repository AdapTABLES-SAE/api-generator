package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import factgenerator_template.TaskFactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MTQeFMembership;
import generator.MTResultFact;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.impl.MTQFMembershipImpl;
import generator.impl.MTQeFMembershipImpl;
import managers.EducationElementsManager;
import structures.Shuffle;

public class MTFactGeneratorMEMB extends TaskFactGeneratorTemplate {

	public MTFactGeneratorMEMB(EducationElementsManager eeManager) {
		super(eeManager);
	}


	@Override
	public Set<QuestionableFact> generateQuestionableFacts(ATask task){
		Set<QuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		int nbByFact = mc.getNbChoices() - mc.getNbBadChoices();
		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			List<MTResultFact> facts = new ArrayList<>();
			for (AbstractFact f : Shuffle.shuffle(setoffact.getFacts())) { 
				if(f instanceof MTResultFact) {
					MTResultFact fact = (MTResultFact) f;
					if(min <= (fact.getRes()/fact.getTable()) && (fact.getRes()/fact.getTable()) <= max){
						facts.add(fact);
					}
				}
			}
			questionableFacts.addAll(generateQuestionableFactsOf(task, facts, nbByFact));
		}	
		return questionableFacts; 
	}
	
	
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, List<MTResultFact> facts, int nbByFact) {
		Set<QuestionableFact> qfs = new HashSet<>(); 
		
		int k = 0;
		for (int i = 0; i < (facts.size() / nbByFact); i++) {
			List<MTResultFact> factres = new ArrayList<>(); 
			for (int j = 0; j < nbByFact; j++) {
				factres.add(facts.get(k));
				k++;
			}
			qfs.add(buildQF(factres)); 
		}
		return qfs;
	}
	
	private MTQFMembership buildQF(List<MTResultFact> facts) {
		MTQFMembership qf = new MTQFMembershipImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		for (MTResultFact mtResultFact : facts) {
			qf.getGoodResults().add(mtResultFact.getRes());
		}
		qf.setTable(facts.get(0).getTable());
		return qf;
	}
	
	@Override
	protected QuestionedFact initializeQuestionedFact() {
		return new MTQeFMembershipImpl();
	}

	@Override
	protected void manageChoices(MultipleChoice mc, QuestionableFact qaf, QuestionedFact qef) {
		MTQFMembership qfact = (MTQFMembership) qaf;
		List<Integer> notAllowed = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			notAllowed.add(qfact.getTable() * i);
		}
		
		List<Integer> propositions = new ArrayList<>();
		while(propositions.size() < mc.getNbBadChoices()) {
			int number = new Random().nextInt(qfact.getTable() * 12) + 1;
			if(!notAllowed.contains(number) && !propositions.contains(number)) {
				propositions.add(number);
			}
		}
		((MTQeFMembership) qef).getBadPropositions().addAll(propositions);
	}


	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		return null;
	}

	@Override
	protected int correctnessToReach(ATask aTask) {
		return ((MultipleChoice)((MTMembership) aTask).getResponseModality()).getNbChoices() - 
				((MultipleChoice)((MTMembership) aTask).getResponseModality()).getNbBadChoices();
	}	
}
