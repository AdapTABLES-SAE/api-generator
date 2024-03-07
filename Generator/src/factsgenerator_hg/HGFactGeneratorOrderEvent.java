package factsgenerator_hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.HGOrderQuestionableFact;
import generator.HGOrderSolution;
import generator.HistoryFact;
import generator.SetOfFacts;
import generator.impl.HGOrderQuestionableFactImpl;
import generator.impl.HGOrderSolutionImpl;
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
		HGOrderQuestionableFact qf = new HGOrderQuestionableFactImpl();
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		int i = 1;
		for(HistoryFact fact: chronologicallyOrderFacts(facts)) {
			HGOrderSolution solution = new HGOrderSolutionImpl();
			solution.setEvent(fact.getEvent());
			solution.setOrder(i); i++;
			qf.getSolutions().add(solution);
			qf.getFacts().add(fact);
		}
		return qf;
	}
	
	private List<HistoryFact> chronologicallyOrderFacts(List<AbstractFact> facts) {
		List<HistoryFact> hfacts = new ArrayList<>(); 
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
		for (HGOrderSolution prop : ((HGOrderQuestionableFact) qFact).getSolutions()) {
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
		return ((HGOrderQuestionableFact) fact).getSolutions().size();
	}

}
