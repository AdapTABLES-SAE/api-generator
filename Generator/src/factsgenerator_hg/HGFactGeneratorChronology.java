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
import generator.AVisualizationQuestionableFact;
import generator.AbstractFact;
import generator.Date;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.MapQuestionableFact;
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


	@Override
	protected java.util.Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException {
		java.util.Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
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
