package factsgenerator_solarsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AVisualizationQuestionableFact;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.IdentifyPlanets;
import generator.QFIdentifyPlanets;
import generator.SetOfFacts;
import generator.SolarSystemPlanet;
import generator.VisualizationSolution;
import generator.impl.QFIdentifyPlanetsImpl;
import structures.DungeonElements;
import structures.Soluce;

public class SolarSystemFactGeneratorIdentifyPlanets extends FactGeneratorTemplate {

	public SolarSystemFactGeneratorIdentifyPlanets(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof SolarSystemPlanet && fact.getBelongsToVisualization() != null) {
			questionableFacts.add(buildQF((IdentifyPlanets) task, (SolarSystemPlanet) fact));
		}		
		return questionableFacts;
	}

	private AQuestionableFact buildQF(IdentifyPlanets task, SolarSystemPlanet fact) {
		AVisualizationQuestionableFact qf = new QFIdentifyPlanetsImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVisualization(fact.getBelongsToVisualization());		
		qf.getVisualizationSolutions().add(buildVisualizationSolution(fact.getName(), fact.getOrbitPosition(), false));
		qf.getFacts().add(fact);
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VisualizationSolution prop : ((QFIdentifyPlanets) qFact).getVisualizationSolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.getVisualizationPosition()));
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
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
		return ((QFIdentifyPlanets) fact).getVisualizationSolutions().size();
	}

}
