package factsgenerator_hg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import generator.Date;
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.HistoryFact;
import generator.MapQuestionableFact;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.VisualizationPosition;
import generator.VisualizationSolution;
import generator.impl.MapQuestionableFactImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorChronology extends FactGeneratorTemplate {

	public HGFactGeneratorChronology(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof HistoryFact  && fact.getBelongsToVisualization() != null) {
			 questionableFacts.add(buildQF((HistoryFact) fact));
		}
		
		return questionableFacts;
	}
	
	
	private AVisualizationQuestionableFact buildQF(HistoryFact fact) {
		AVisualizationQuestionableFact qf = new MapQuestionableFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setVisualization(fact.getBelongsToVisualization());
		if(fact.getTime() instanceof Date) {
			qf.getVisualizationSolutions().add(buildVisualizationSolution(fact.getEvent(), ((Date) fact.getTime()).getPosition(), false));
		} else {
			qf.getVisualizationSolutions().add(buildVisualizationSolution("(Debut) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getStartPosition(), false));
			qf.getVisualizationSolutions().add(buildVisualizationSolution("(Fin) "+fact.getEvent(), ((TimePeriod) fact.getTime()).getEndPosition(), false));
		}			
		return qf;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (VisualizationSolution prop : ((MapQuestionableFact) qFact).getVisualizationSolutions()) {
			solutions.add(new Soluce(prop.getValue(), prop.isImage(), prop.getVisualizationPosition()));
		}
		return solutions;
	}
	
	private List<Soluce> getBadSoluces(AQuestionableFact qFact, List<Soluce> goodSolutions, int numberOfBadSoluce) {
		MapQuestionableFact fact = 	(MapQuestionableFact) qFact;
		
		List<VisualizationPosition> positions = new ArrayList<>(fact.getVisualization().getPositions());
		positions.removeAll(getSolutionsPositions(goodSolutions));
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
	
	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		List<Soluce> goodSoluce = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodSoluce);
		
		DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
 		List<Soluce> badSoluce = new ArrayList<>();

		badSoluce = getBadSoluces(qFact, goodSoluce, mc.getNbBadChoices());
		
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
