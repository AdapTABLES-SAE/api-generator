package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MTResultFact;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.impl.MTQFMembershipImpl;
import structures.DungeonElements;
import structures.Shuffle;
import structures.Soluce;

public class MTFactGeneratorMEMB extends FactGeneratorTemplate {

	public MTFactGeneratorMEMB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}


	@Override
	public Set<AQuestionableFact> generateQuestionableFacts(ATask task){
		Set<AQuestionableFact> AQuestionableFacts = new HashSet<>();
		taskID = task.getID();
		
		int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
		int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		int nbByFact = mc.getNbChoices() - mc.getNbBadChoices();
		
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			if(!setoffact.getName().equals("1")) {
				List<MTResultFact> facts = new ArrayList<>();
				for (AbstractFact f : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
					if(f instanceof MTResultFact) {
						MTResultFact fact = (MTResultFact) f;
						if(min <= (fact.getRes()/fact.getTable()) && (fact.getRes()/fact.getTable()) <= max){
							facts.add(fact);
						}
					}
				}
				AQuestionableFacts.addAll(generateAQuestionableFactsOf(task, facts, nbByFact));
			}
		}	
		return AQuestionableFacts; 
	}
	
	
	protected Set<AQuestionableFact> generateAQuestionableFactsOf(ATask task, List<MTResultFact> facts, int nbByFact) {
		Set<AQuestionableFact> qfs = new HashSet<>(); 
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
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (Integer prop : ((MTQFMembership) qFact).getGoodResults()) {
			solutions.add(new Soluce(prop+""));
		}
		return solutions;
	}


	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MTQFMembership qfact = (MTQFMembership) qFact;
		List<Integer> notallowed = new ArrayList<>();
		for (int i = 0; i < 13; i++) {
			notallowed.add(qfact.getTable() * i);
		}
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		List<Integer> propositions_temp = new ArrayList<>();
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			int number = qfact.getTable() == 1? new Random().nextInt(qfact.getTable() * 12) + 12
					: new Random().nextInt(qfact.getTable() * 12) + 1;
			if(!notallowed.contains(number) && !propositions_temp.contains(number)) {
				propositions_temp.add(number);
			}
		}
		
		List<Soluce> badpropositions = new ArrayList<>();
		for(Integer value: propositions_temp) {
			badpropositions.add(new Soluce(value+""));
		}
		
		
		if(((MTMembership)task).isIdentifySharedProperty()) {
			propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
			propositions.put(ECorrectness.INCORRECT, badpropositions);
		} else {
			propositions.put(ECorrectness.CORRECT, badpropositions);
			propositions.put(ECorrectness.INCORRECT, getListOfGoodSolutions(qFact));
		}
		
		
		return propositions;
	}


	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((MTQFMembership) fact).getGoodResults().size();
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		return null;
	}
}
