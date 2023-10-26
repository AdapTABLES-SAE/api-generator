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
import generator.DateQuestionableFact;
import generator.ECorrectness;
import generator.EHistoryTarget;
import generator.ETimeTarget;
import generator.HAssociation;
import generator.HistoryFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.impl.DateQuestionableFactImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorAssociation extends FactGeneratorTemplate {

	public HGFactGeneratorAssociation(DungeonElements dungeonElements) {
		super(dungeonElements);
	}
	
	private boolean respectsTaskConditions(HistoryFact fact, HAssociation task) {
		if(task.getTarget().equals(ETimeTarget.NONE) || task.getTarget().equals(ETimeTarget.MIX)) { return true; }
		if(task.getTarget().equals(ETimeTarget.DATE) && fact.getTime() instanceof Date) { return true; }
		if(task.getTarget().equals(ETimeTarget.PERIOD) && fact.getTime() instanceof TimePeriod) { return true; }
		return false;
	}
	
	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof HistoryFact) {		
			HAssociation ctask = (HAssociation) task;
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
					} else if(ctask.getMissing().equals(EHistoryTarget.IMAGE)) {
						qfact.setSourceElement(hfact.getEvent());
						qfact.setSourceElementType(EHistoryTarget.EVENT);
						qfact.setMissingElementsType(EHistoryTarget.IMAGE);
						qfact.getMissingElements().add(hfact.getImage().getID());
					} else {
						throw null; 
					}
					break;
				case TIME: 
					if(ctask.getMissing().equals(EHistoryTarget.IMAGE) || ctask.getMissing().equals(EHistoryTarget.TIME)) {
						throw null;
					} else {
						qfact.setSourceElement(hfact.getTime().toString());
						qfact.setSourceElementType(EHistoryTarget.TIME);
						qfact.setMissingElementsType(EHistoryTarget.EVENT);
						qfact.getMissingElements().add(hfact.getEvent());
					}
					
					break;
				case IMAGE: 
					if(ctask.getMissing().equals(EHistoryTarget.IMAGE) || ctask.getMissing().equals(EHistoryTarget.TIME)) {
						throw null;
					} else {
						qfact.setSourceElement(hfact.getImage().getID());
						qfact.setSourceElementType(EHistoryTarget.IMAGE);
						qfact.setMissingElementsType(EHistoryTarget.EVENT);
						qfact.getMissingElements().add(hfact.getEvent());
						qfact.setQuestionWithImage(true);
					}
					break;
				}
				questionableFacts.add(qfact);
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

	@Override
	protected java.util.Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException { // TODO : implémenter mauvais choix
		java.util.Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return true;
	}
	
	@Override
	protected List<String> factSolutionsToString(AQuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		DateQuestionableFact qfact = (DateQuestionableFact) qFact;		
		solutions.add(qfact.getCompleteFact());
		return solutions;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((DateQuestionableFact) fact).getMissingElements().size();	
	}

}
