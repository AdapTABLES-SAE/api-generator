package factsgenerator_hg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AVisualizationQuestionableFact;
import generator.AbstractFact;
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.EGeographyValue;
import generator.GeographyFact;
import generator.MapQuestionableFact;
import generator.SetOfFacts;
import generator.VisualizationSolution;
import generator.impl.MapQuestionableFactImpl;
import generator.impl.VisualizationSolutionImpl;
import structures.DungeonElements;
import structures.HistoryGeographyData;
import structures.Soluce;

public class HGFactGeneratorLocate extends FactGeneratorTemplate {

	public HGFactGeneratorLocate(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VisualizationSolution prop : ((AVisualizationQuestionableFact) qFact).getVisualizationSolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.getVisualizationPosition()));
		}
		return solutions;
	}


	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MapQuestionableFact qfact = (MapQuestionableFact) qFact;
		
		List<Soluce> goodSoluces = getListOfGoodSolutions(qFact);
		DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
		List<Soluce> propositions_temp = new ArrayList<>();
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			String choice = badHistoryChoices(goodSoluces, propositions_temp, qfact.getType());
			if(!choice.isEmpty()) {
				propositions_temp.add(new Soluce(choice));
			} else {
				throw new BadSolutionGenerationException(qFact);
			}
		}
		
		propositions.put(ECorrectness.CORRECT, goodSoluces);
		propositions.put(ECorrectness.INCORRECT, propositions_temp);
		
		return propositions;
	}
	
	
	private String badHistoryChoices(List<Soluce> goodSoluce, List<Soluce> badSelectedSoluce, EGeographyValue dataType) {
		List<String> possibleBadChoices = HistoryGeographyData.data.get(dataType);
		String choice = "";
		while(choice.isEmpty() && (possibleBadChoices != null || !possibleBadChoices.isEmpty())) {
			choice = possibleBadChoices.get(new Random().nextInt(possibleBadChoices.size()));
			if(containsSoluce(goodSoluce, choice) || containsSoluce(badSelectedSoluce, choice)) {
				choice = "";
			}
		}
		return choice;
	}

	private boolean containsSoluce(List<Soluce> soluces, String value) {
		for(Soluce sol: soluces) {
			if(sol.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((MapQuestionableFact) fact).getVisualizationSolutions().size();
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		return null;
	}

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		return setoffacts.getVisualization() != null;
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		return fact instanceof GeographyFact;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		return fact.getBelongsToVisualization().getID();
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		MapQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVisualization(facts.get(0).getBelongsToVisualization());
		qf.setType(((GeographyFact) facts.get(0)).getType());
		for (AbstractFact fact : facts) {
			VisualizationSolution soluce = new VisualizationSolutionImpl();
			soluce.setValue(((GeographyFact) fact).getValue());
			soluce.setVisualizationPosition(((GeographyFact) fact).getPosition());
			qf.getVisualizationSolutions().add(soluce);
			qf.getFacts().add(fact);
		}
		
		if(task.getNbExpectedAnswers() == facts.size()) {
			qf.setConsigne("Donner l'ensemble des réponses");
		} else {
			qf.setConsigne("Donner "+task.getNbExpectedAnswers()+" réponses");
		}
		return (AQuestionableFact) qf;
	}

}
