package factsgenerator_hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import factsgenerator_maths.HistoryFactComparator;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.OrderQuestionableFact;
import generator.OrderSolution;
import generator.SetOfFacts;
import generator.impl.OrderQuestionableFactImpl;
import generator.impl.OrderSolutionImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorOrderEvent extends FactGeneratorTemplate {

	public HGFactGeneratorOrderEvent(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		return true;
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		return fact instanceof HistoryFact;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		OrderQuestionableFact qf = new OrderQuestionableFactImpl();
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		int i = 1;
		for(HistoryFact fact: chronologicallyOrderFacts(facts)) {
			OrderSolution solution = new OrderSolutionImpl();
			solution.setEvent(fact.getEvent());
			solution.setOrder(i); i++;
			qf.getSolutions().add(solution);
		}
		return qf;
	}
	
	private List<HistoryFact> chronologicallyOrderFacts(List<AbstractFact> facts) {
		List<HistoryFact> hfacts = new ArrayList<>(); // TODO
		for(AbstractFact fact: facts) {
			hfacts.add((HistoryFact) fact);
		}
		Collections.sort(hfacts, new HistoryFactComparator());
		return hfacts;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (OrderSolution prop : ((OrderQuestionableFact) qFact).getSolutions()) {
			solutions.add(new Soluce(prop.getEvent(), prop.getOrder()));
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
	
		propositions.put(ECorrectness.CORRECT,  getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((OrderQuestionableFact) fact).getSolutions().size();
	}

}
