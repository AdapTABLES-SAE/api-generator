package factsgenerator_solarsystem;

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
import generator.PlanetOrder;
import generator.QFOrderPlanets;
import generator.SetOfFacts;
import generator.SolarSystemPlanet;
import generator.impl.PlanetOrderImpl;
import generator.impl.QFOrderPlanetsImpl;
import structures.DungeonElements;
import structures.Soluce;

public class SolarSystemFactGeneratorOrderPlanets extends FactGeneratorTemplate {

	public SolarSystemFactGeneratorOrderPlanets(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		return true;
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		return fact instanceof SolarSystemPlanet;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		QFOrderPlanets qf = new QFOrderPlanetsImpl();
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		int i = 1;
		for(SolarSystemPlanet fact: orderFactsAscendingly(facts)) {
			PlanetOrder solution = new PlanetOrderImpl();
			solution.setPlanet(fact.getName());
			solution.setOrder(i); i++;
			qf.getSolutions().add(solution);
			qf.getFacts().add(fact);
		}
		return qf;

	}

	private List<SolarSystemPlanet> orderFactsAscendingly(List<AbstractFact> facts) {
		List<SolarSystemPlanet> sfacts = new ArrayList<>(); 
		for(AbstractFact fact: facts) {
			sfacts.add((SolarSystemPlanet) fact);
		}
		Collections.sort(sfacts, (o1, o2) -> 
			(((Long) o1.getSunDistance()).compareTo((Long) o2.getSunDistance())));

		
		return sfacts;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (PlanetOrder prop : ((QFOrderPlanets) qFact).getSolutions()) {
			solutions.add(new Soluce(prop.getPlanet(), prop.getOrder()));
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		// TODO Auto-generated method stub
		return ((QFOrderPlanets) fact).getSolutions().size();
	}

}
