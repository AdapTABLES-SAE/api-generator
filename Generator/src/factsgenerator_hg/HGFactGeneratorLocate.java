package factsgenerator_hg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.EGeographyValue;
import generator.GeographyFact;
import generator.Map;
import generator.MapQuestionableFact;
import generator.MapSolution;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.impl.MapQuestionableFactImpl;
import generator.impl.MapSolutionImpl;
import structures.DungeonElements;
import structures.HistoryGeographyData;
import structures.Shuffle;
import structures.Soluce;

public class HGFactGeneratorLocate extends FactGeneratorTemplate {

	public HGFactGeneratorLocate(DungeonElements dungeonElements) {
		super(dungeonElements);
	}


	@Override
	public Set<AQuestionableFact> generateQuestionableFacts(ATask task){
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			if(setoffact.getMap() != null) {
				List<GeographyFact> facts = new ArrayList<>();
				for (AbstractFact f : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
					if(f instanceof GeographyFact) {
						GeographyFact fact = (GeographyFact) f;
						facts.add(fact);
					}
				}
				questionableFacts.add(buildQF(task, facts, setoffact.getMap()));
			}
		}	
		return questionableFacts; 
	}
	
	

	private MapQuestionableFact buildQF(ATask task, List<GeographyFact> facts, Map map) {
		MapQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setMap(map);
		qf.setType(facts.get(0).getType());
		for (GeographyFact fact : facts) {
			MapSolution soluce = new MapSolutionImpl();
			soluce.setValue(fact.getValue());
			soluce.setMapPosition(fact.getPosition());
			qf.getMapsolutions().add(soluce);
		}
		
		if(task.getNbExpectedAnswers() == facts.size()) {
			qf.setConsigne("Donner l'ensemble des réponses");
		} else {
			qf.setConsigne("Donner "+task.getNbExpectedAnswers()+" réponses");
		}
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (MapSolution prop : ((MapQuestionableFact) qFact).getMapsolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.getMapPosition()));
		}
		return solutions;
	}


	@Override
	protected java.util.Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException {
		java.util.Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MapQuestionableFact qfact = (MapQuestionableFact) qFact;
		
		List<Soluce> goodSoluces = getListOfGoodSolutions(qFact);
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
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
		while(choice.isEmpty() && !possibleBadChoices.isEmpty()) {
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
		return ((MapQuestionableFact) fact).getMapsolutions().size();
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
