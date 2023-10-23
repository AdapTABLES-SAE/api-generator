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
import generator.AVizualisationQuestionableFact;
import generator.AbstractFact;
import generator.Date;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.MapQuestionableFact;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.Vizualisation;
import generator.VizualisationPosition;
import generator.VizualisationSolution;
import generator.impl.MapQuestionableFactImpl;
import generator.impl.VizualisationSolutionImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorChronology extends FactGeneratorTemplate {

	public HGFactGeneratorChronology(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof HistoryFact  && parent.getVizualisation() != null) {
			 questionableFacts.add(buildQF(task, (HistoryFact) fact, parent.getVizualisation()));
		}
		
		return questionableFacts;
	}
	
	private VizualisationSolution buildVizualisationSolution(String value, VizualisationPosition position) {
		VizualisationSolution soluce = new VizualisationSolutionImpl();
		soluce.setValue(value);
		soluce.setVizualisationPosition(position);
		return soluce;
	}
	
	private AVizualisationQuestionableFact buildQF(ATask task, HistoryFact fact, Vizualisation map) {
		AVizualisationQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVizualisation(map);
		if(fact.getTime() instanceof Date) {
			qf.getVizualisationSolutions().add(buildVizualisationSolution(fact.getEvent(), ((Date) fact.getTime()).getPosition()));
		} else {
			qf.getVizualisationSolutions().add(buildVizualisationSolution("(Debut) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getStartPosition()));
			qf.getVizualisationSolutions().add(buildVizualisationSolution("(Fin) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getEndPosition()));
		}			
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VizualisationSolution prop : ((MapQuestionableFact) qFact).getVizualisationSolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.getVizualisationPosition()));
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
		return ((MapQuestionableFact) fact).getVizualisationSolutions().size();
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
				AVizualisationQuestionableFact prevF = (AVizualisationQuestionableFact) fact.getQuestionablefact();
				AVizualisationQuestionableFact newF = (AVizualisationQuestionableFact) qfact;
				for(VizualisationSolution sol1 : prevF.getVizualisationSolutions()) {
					for(VizualisationSolution sol2 : newF.getVizualisationSolutions()) {
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
