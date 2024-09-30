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
import generator.AbstractFact;
import generator.ECorrectness;
import generator.GeographyFact;
import generator.HGQFMembership;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.WrongData;
import generator.impl.HGQFMembershipImpl;
import generators.ALGAGenerator;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorMembership extends FactGeneratorTemplate {


	public HGFactGeneratorMembership(ModelsManager modelsManager, DungeonElements dungeonElements) {
		super(modelsManager, dungeonElements);
	}

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		return !setoffacts.getWrongData().isEmpty();
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		return fact instanceof GeographyFact;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		return ((GeographyFact) fact).getType().getName();
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		HGQFMembership qf = new HGQFMembershipImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		for (AbstractFact mtResultFact : facts) {
			qf.getGoodChoices().add(((GeographyFact) mtResultFact).getValue());
			qf.getFacts().add(mtResultFact);
		}
		qf.setType(((GeographyFact) facts.get(0)).getType());
		qf.setMembershipTo(((GeographyFact) facts.get(0)).getCategory());
		return (AQuestionableFact) qf;
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (String prop : ((HGQFMembership) qFact).getGoodChoices()) {
			solutions.add(new Soluce(prop));
		}
		return solutions;
	}
	
	private List<String> generateBadPropositions(int number, HGQFMembership qfact){
		List<String> badPropositions = new ArrayList<>();
		
		List<WrongData> possibleWrongData = new ArrayList<>(getPossibleWrongData(qfact));
		if(possibleWrongData.isEmpty()) {
			ALGAGenerator.LOGGER.severe("No possible wrong data in model! You need to check or implement it differently!");
		} else {
			while(badPropositions.size() != number && !possibleWrongData.isEmpty()) {
				int rand = new Random().nextInt(possibleWrongData.size());
				String value = possibleWrongData.get(rand).getValue();
				if(!badPropositions.contains(value)) {
					badPropositions.add(value);
				}
				possibleWrongData.remove(rand);
			}
		}
		return badPropositions; 
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		HGQFMembership qfact = (HGQFMembership) qFact;
				
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		List<String> propositions_temp = generateBadPropositions(mc.getNbBadChoices(), qfact);
		List<Soluce> badpropositions = new ArrayList<>();
		for(String value: propositions_temp) {
			badpropositions.add(new Soluce(value));
		}

		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, badpropositions);
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((HGQFMembershipImpl) fact).getGoodChoices().size();
	}

}
