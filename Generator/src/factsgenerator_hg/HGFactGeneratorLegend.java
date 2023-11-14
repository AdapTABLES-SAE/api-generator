package factsgenerator_hg;

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
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.ELegendTarget;
import generator.GeographyLegendFact;
import generator.LegendAMap;
import generator.LegendQuestionableFact;
import generator.SetOfFacts;
import generator.VisualizationSolution;
import generator.impl.LegendQuestionableFactImpl;
import generators.ALGAGenerator;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorLegend extends FactGeneratorTemplate {

	public HGFactGeneratorLegend(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof GeographyLegendFact && fact.getBelongsToVisualization() != null) {
			questionableFacts.add(buildQF((LegendAMap) task, (GeographyLegendFact) fact));
		}		
		return questionableFacts;
	}

	private AQuestionableFact buildQF(LegendAMap task, GeographyLegendFact fact) {
		AVisualizationQuestionableFact qf = new LegendQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVisualization(fact.getBelongsToVisualization());		
		if(task.getMissing().equals(ELegendTarget.SYMBOL)) {
			qf.getVisualizationSolutions().add(buildVisualizationSolution(fact.getRepresentation().getID(), fact.getSymbolPosition(), true));
		} else {
			qf.getVisualizationSolutions().add(buildVisualizationSolution(fact.getLegend().getText(), fact.getLegend().getPosition(), false));
		}
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VisualizationSolution prop : ((LegendQuestionableFact) qFact).getVisualizationSolutions()) {
			solutions.add(new Soluce(prop.getValue(),  prop.isImage(), prop.getVisualizationPosition()));
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		List<Soluce> goodSoluce = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodSoluce);
		
		DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
 		if(mc.getNbBadChoices() > 0) {
 			ALGAGenerator.LOGGER.severe("Legend Task should not have bad proposition (this case scenario is not implemented, if you want bad propositions"
 					+ " you need to change the implemention of getListOfPropositions in class HGFactGeneratorLegend).");
 		}
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((LegendQuestionableFact) fact).getVisualizationSolutions().size();
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
	protected Set<AQuestionableFact> generateMembershipOrOrderQuestionableFacts(ATask task, HashMap<String, List<AbstractFact>> facts,
			int numberByFact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		// TODO Auto-generated method stub
		return null;
	}

}
