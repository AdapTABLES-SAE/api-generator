package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.MTFact;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.impl.MTQFMembershipImpl;
import structures.DungeonElements;
import structures.Soluce;

public class MTFactGeneratorMEMB extends FactGeneratorTemplate {

	public MTFactGeneratorMEMB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		MTQFMembership qf = new MTQFMembershipImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		for (AbstractFact mtResultFact : facts) {
			qf.getGoodResults().add(((MTFact) mtResultFact).getRes());
		}
		qf.setTable(((MTFact) facts.get(0)).getTable());
		return (AQuestionableFact) qf;
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
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffact) {
		return !setoffact.getName().equals("1");
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
		int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
		return fact instanceof MTFact && min <= (((MTFact) fact).getRes()/((MTFact) fact).getTable()) && (((MTFact) fact).getRes()/((MTFact) fact).getTable()) <= max;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		return ((MTFact) fact).getTable()+"";
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}
}
