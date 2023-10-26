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
import generator.AVisualizationQuestionableFact;
import generator.AbstractFact;
import generator.Date;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.MapQuestionableFact;
import generator.MultipleChoice;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.Visualization;
import generator.VisualizationPosition;
import generator.VisualizationSolution;
import generator.impl.MapQuestionableFactImpl;
import generator.impl.VisualizationSolutionImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorChronology extends FactGeneratorTemplate {

	public HGFactGeneratorChronology(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof HistoryFact  && parent.getVisualization() != null) {
			 questionableFacts.add(buildQF(task, (HistoryFact) fact, parent.getVisualization()));
		}
		
		return questionableFacts;
	}
	
	private VisualizationSolution buildVisualizationSolution(String value, VisualizationPosition position) {
		VisualizationSolution soluce = new VisualizationSolutionImpl();
		soluce.setValue(value);
		soluce.setVisualizationPosition(position);
		return soluce;
	}
	
	private AVisualizationQuestionableFact buildQF(ATask task, HistoryFact fact, Visualization map) {
		AVisualizationQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVisualization(map);
		if(fact.getTime() instanceof Date) {
			qf.getVisualizationSolutions().add(buildVisualizationSolution(fact.getEvent(), ((Date) fact.getTime()).getPosition()));
		} else {
			qf.getVisualizationSolutions().add(buildVisualizationSolution("(Debut) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getStartPosition()));
			qf.getVisualizationSolutions().add(buildVisualizationSolution("(Fin) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getEndPosition()));
		}			
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VisualizationSolution prop : ((MapQuestionableFact) qFact).getVisualizationSolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.getVisualizationPosition()));
		}
		return solutions;
	}
	
	private List<Soluce> getBadSoluces(AQuestionableFact qFact, List<Soluce> goodSolutions, int numberOfBadSoluce) {
		MapQuestionableFact fact = 	(MapQuestionableFact) qFact;
		
		List<VisualizationPosition> positions = new ArrayList<>(fact.getVisualization().getPositions());
		positions.removeAll(getSolutionsPositions(goodSolutions));
		System.out.println("IL y a des positions "+ positions);
		List<Soluce> badSoluces = new ArrayList<>();
		if(positions.size() >= numberOfBadSoluce) {
			for(int i = 0; i < numberOfBadSoluce; i++) {
				int j = new Random().nextInt(positions.size());
				badSoluces.add(new Soluce("", positions.get(j)));
				positions.remove(j);
			}
		} else {
			for(VisualizationPosition pos : positions) {
				badSoluces.add(new Soluce("", pos));
			}
		}
		
		return badSoluces;
	}
	
	private List<VisualizationPosition> getSolutionsPositions(List<Soluce> soluces) {
		List<VisualizationPosition> positions = new ArrayList<>();
		for(Soluce soluce: soluces) {
			positions.add(soluce.getPosition());
		}
		return positions;
	}
	
	/*private boolean containsSoluceWithPosition(List<Soluce> soluces, VisualizationPosition position) {
		for(Soluce sol: soluces) {
			System.out.println("SOL "+sol.getPosition().getID()+" bad "+position.getID());
			if(sol.getPosition().getID().equals(position.getID())) {
				return true;
			}
		}
		return false;
	}*/


	@Override
	protected java.util.Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException {
		java.util.Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		List<Soluce> goodSoluce = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodSoluce);
		
		MultipleChoice mc = task.getResponseModality() != null? (MultipleChoice) task.getResponseModality():null;
 		List<Soluce> badSoluce = new ArrayList<>();

		if(mc != null) {
			System.out.println("PAR ICI");
			badSoluce = getBadSoluces(qFact, goodSoluce, mc.getNbBadChoices());
		} 
		
		propositions.put(ECorrectness.INCORRECT, badSoluce);
		
		return propositions;
	}
	

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((MapQuestionableFact) fact).getVisualizationSolutions().size();
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}
	
	/*private int countNumberOfPeriod(List<QuestionedFact> previousFacts) {
		int periods = 0; 
		for(QuestionedFact fact: previousFacts) {	
			if(fact.getPropositions().size() == 2) {
				periods++;
			}
		}
		return periods;
	}*/
	
	@Override
	protected List<AQuestionableFact> removeUnEligibleFactsBasedOnPreviouslySelectedFact(List<QuestionedFact> previousFacts, List<AQuestionableFact> facts) {
		List<AQuestionableFact> eligible = new ArrayList<>();
		
		for(AQuestionableFact qfact: facts) {
			boolean conditionValide = true;
			for(QuestionedFact fact: previousFacts) {
				AVisualizationQuestionableFact prevF = (AVisualizationQuestionableFact) fact.getQuestionablefact();
				AVisualizationQuestionableFact newF = (AVisualizationQuestionableFact) qfact;
				for(VisualizationSolution sol1 : prevF.getVisualizationSolutions()) {
					for(VisualizationSolution sol2 : newF.getVisualizationSolutions()) {
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
