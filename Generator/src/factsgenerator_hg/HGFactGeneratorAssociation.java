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
import generator.AbstractFact;
import generator.Date;
import generator.DateQuestionableFact;
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.EHistoryTarget;
import generator.ETimeTarget;
import generator.HistoricalEventAssociation;
import generator.HistoryFact;
import generator.SetOfFacts;
import generator.Time;
import generator.TimePeriod;
import generator.impl.DateQuestionableFactImpl;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorAssociation extends FactGeneratorTemplate {

	public HGFactGeneratorAssociation(ModelsManager modelsManager, DungeonElements dungeonElements) {
		super(modelsManager, dungeonElements);
	}
	
	private boolean respectsTaskConditions(HistoryFact fact, HistoricalEventAssociation task) {
		if(task.getTarget().equals(ETimeTarget.NONE) || task.getTarget().equals(ETimeTarget.MIX)) { return true; }
		if(task.getTarget().equals(ETimeTarget.DATE) && fact.getTime() instanceof Date) { return true; }
		if(task.getTarget().equals(ETimeTarget.PERIOD) && fact.getTime() instanceof TimePeriod) { return true; }
		return false;
	}
	
	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		boolean isCreated = false;
		if(fact instanceof HistoryFact) {		
			HistoricalEventAssociation ctask = (HistoricalEventAssociation) task;
			DateQuestionableFact qfact = new DateQuestionableFactImpl();
			HistoryFact hfact = (HistoryFact) fact;
			qfact.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
			if(respectsTaskConditions(hfact, ctask)) {
				switch(ctask.getSource()) {
				case EVENT: 
					if(ctask.getMissing().equals(EHistoryTarget.TIME)) {
						qfact.setSourceElement(hfact.getEvent());
						qfact.setSourceElementType(EHistoryTarget.EVENT);
						qfact.setMissingElementsType(EHistoryTarget.TIME);
						if(hfact.getTime() instanceof TimePeriod && !ctask.getTarget().equals(ETimeTarget.MIX)) {
							qfact.getMissingElements().add(((TimePeriod) hfact.getTime()).getStartYear());
							qfact.getMissingElements().add(((TimePeriod) hfact.getTime()).getEndYear());
						} else {
							qfact.getMissingElements().add(hfact.getTime().toString());
						}
						isCreated = true;
					} else if(ctask.getMissing().equals(EHistoryTarget.IMAGE)) {
						if(hfact.getRepresentation() != null) {
							qfact.setSourceElement(hfact.getEvent());
							qfact.setSourceElementType(EHistoryTarget.EVENT);
							qfact.setMissingElementsType(EHistoryTarget.IMAGE);
							qfact.getMissingElements().add(hfact.getRepresentation().getID());
							isCreated = true;
						}
						
					} else {
						throw null; 
					}
					break;
				case TIME: 
					if(ctask.getMissing().equals(EHistoryTarget.IMAGE)) {
						if(hfact.getRepresentation() != null) {
							qfact.setSourceElement(hfact.getTime().toString());
							qfact.setSourceElementType(EHistoryTarget.TIME);
							qfact.setMissingElementsType(EHistoryTarget.IMAGE);
							qfact.getMissingElements().add(hfact.getRepresentation().getID());	
							isCreated = true;
						}
					} else if(ctask.getMissing().equals(EHistoryTarget.EVENT)){
						qfact.setSourceElement(hfact.getTime().toString());
						qfact.setSourceElementType(EHistoryTarget.TIME);
						qfact.setMissingElementsType(EHistoryTarget.EVENT);
						qfact.getMissingElements().add(hfact.getEvent());
						isCreated = true;
					} else {
						throw null;
					}
					break;
				case IMAGE: 
					if(hfact.getRepresentation() != null) {
						isCreated = true;
						if(ctask.getMissing().equals(EHistoryTarget.TIME)) {
							qfact.setSourceElement(hfact.getRepresentation().getID());
							qfact.setSourceElementType(EHistoryTarget.IMAGE);
							qfact.setMissingElementsType(EHistoryTarget.TIME);
							if(hfact.getTime() instanceof TimePeriod && !ctask.getTarget().equals(ETimeTarget.MIX)) {
								qfact.getMissingElements().add(((TimePeriod) hfact.getTime()).getStartYear());
								qfact.getMissingElements().add(((TimePeriod) hfact.getTime()).getEndYear());
							} else {
								qfact.getMissingElements().add(hfact.getTime().toString());
							}
						} else if(ctask.getMissing().equals(EHistoryTarget.EVENT)){
							qfact.setSourceElement(hfact.getRepresentation().getID());
							qfact.setSourceElementType(EHistoryTarget.IMAGE);
							qfact.setMissingElementsType(EHistoryTarget.EVENT);
							qfact.getMissingElements().add(hfact.getEvent());
							qfact.setQuestionWithImage(true);
						} else {
							throw null;
						}
					}
					break;
				}
				if(isCreated) {
					questionableFacts.add(qfact);
				}
			}
		}
		return questionableFacts;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (String prop : ((DateQuestionableFact) qFact).getMissingElements()) {
			if(((DateQuestionableFact) qFact).getMissingElementsType().equals(EHistoryTarget.IMAGE)){
				solutions.add(new Soluce(prop, true));
			} else {
				solutions.add(new Soluce(prop));
			}
		}
		return solutions;
	}
	
	private boolean isGoodSoluce(List<Soluce> goodSolutions, String value) {
		for(Soluce sol: goodSolutions) {
			if(sol.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	
	private List<Soluce> getListOfPossibleBadPropositions(List<Soluce> goodSolutions, EHistoryTarget target) {
		List<Soluce> badPossibleSoluce = new ArrayList<>();
		for(SetOfFacts setoffact: modelsManager.getKnowledgeModel().getKnowledgefacts()) {
			for(AbstractFact afact: setoffact.getFacts()) {
				if(afact instanceof HistoryFact) {
					switch(target) {
						case TIME:
							Time time = ((HistoryFact) afact).getTime();
							if(time instanceof Date) {
								if(!isGoodSoluce(goodSolutions, ((Date) time).toString())) {
									badPossibleSoluce.add(new Soluce(((Date) time).toString()));
								}
							} else {
								if(!isGoodSoluce(goodSolutions, ((TimePeriod) time).getStartYear())) {
									badPossibleSoluce.add(new Soluce(((TimePeriod) time).getStartYear()));
								}
								if(!isGoodSoluce(goodSolutions, ((TimePeriod) time).getEndYear())) {
									badPossibleSoluce.add(new Soluce(((TimePeriod) time).getEndYear()));
								}
							}
							break;
						case EVENT:
							if(!isGoodSoluce(goodSolutions, ((HistoryFact) afact).getEvent())) {
								badPossibleSoluce.add(new Soluce(((HistoryFact) afact).getEvent()));
							}
							break;
						case IMAGE: 
							if(!isGoodSoluce(goodSolutions, ((HistoryFact) afact).getRepresentation().getID())) {
								badPossibleSoluce.add(new Soluce(((HistoryFact) afact).getRepresentation().getID(), true));
							}
							break;
					}
				}
			}
		}
		return badPossibleSoluce;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException { // TODO : implémenter mauvais choix
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		List<Soluce> goodPropositions = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodPropositions);
		
		List<Soluce> badPropositions = new ArrayList<>();
		if(task.getResponseModality() != null) {
			DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
			badPropositions = getListOfPossibleBadPropositions(goodPropositions, ((DateQuestionableFact) qFact).getMissingElementsType());
			while(badPropositions.size() > mc.getNbBadChoices()) {
				int i = new Random().nextInt(badPropositions.size());
				badPropositions.remove(i);
			}
		}
		propositions.put(ECorrectness.INCORRECT, badPropositions);
		
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return true;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((DateQuestionableFact) fact).getMissingElements().size();	
	}

}
