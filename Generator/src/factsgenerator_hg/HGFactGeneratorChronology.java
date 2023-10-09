package factsgenerator_hg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.Date;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.Map;
import generator.MapElementPosition;
import generator.MapQuestionableFact;
import generator.MapSolution;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.impl.MapQuestionableFactImpl;
import generator.impl.MapSolutionImpl;
import structures.DungeonElements;
import structures.Shuffle;
import structures.Soluce;

public class HGFactGeneratorChronology extends FactGeneratorTemplate {

	public HGFactGeneratorChronology(DungeonElements dungeonElements) {
		super(dungeonElements);
	}


	@Override
	public Set<AQuestionableFact> generateQuestionableFacts(ATask task){
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
			
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			if(setoffact.getMap() != null) {
				for (AbstractFact f : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
					if(f instanceof HistoryFact) {
						HistoryFact fact = (HistoryFact) f;
						 questionableFacts.add(buildQF(task, fact, setoffact.getMap()));
					}
				}
			}
		}	
		return questionableFacts; 
	}
	
	private MapSolution buildMapSolution(String value, MapElementPosition position) {
		MapSolution soluce = new MapSolutionImpl();
		soluce.setValue(value);
		soluce.setMapPosition(position);
		return soluce;
	}
	
	private MapQuestionableFact buildQF(ATask task, HistoryFact fact, Map map) {
		MapQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setMap(map);
		if(fact.getTime() instanceof Date) {
			qf.getMapsolutions().add(buildMapSolution(fact.getEvent(), ((Date) fact.getTime()).getPosition()));
		} else {
			qf.getMapsolutions().add(buildMapSolution("(Debut) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getStartPosition()));
			qf.getMapsolutions().add(buildMapSolution("(Fin) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getEndPosition()));
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

		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
		return propositions;
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
	protected List<AQuestionableFact> removeUnEligibleFactsBasedOnPreviouslySelectedFact(List<QuestionedFact> previousFacts, List<AQuestionableFact> facts) {
		List<AQuestionableFact> eligible = new ArrayList<>();
		
		for(AQuestionableFact qfact: facts) {
			boolean conditionValide = true;
			for(QuestionedFact fact: previousFacts) {
				MapQuestionableFact prevF = (MapQuestionableFact) fact.getQuestionablefact();
				MapQuestionableFact newF = (MapQuestionableFact) qfact;
				for(MapSolution sol1 : prevF.getMapsolutions()) {
					for(MapSolution sol2 : newF.getMapsolutions()) {
						if(sol1.getValue().equals(sol2.getValue())) {
							conditionValide = false;
						}
					}
				}
			}
			if(conditionValide) {
				eligible.add(qfact);
			}
		}
		return eligible;
	}

}
