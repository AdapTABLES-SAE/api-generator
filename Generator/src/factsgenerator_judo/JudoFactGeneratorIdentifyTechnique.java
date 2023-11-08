package factsgenerator_judo;

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
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.EJudoTarget;
import generator.IdentifyTechnique;
import generator.JudoQuestionableTechniqueFact;
import generator.JudoTechniqueFact;
import generator.SetOfFacts;
import generator.impl.JudoQuestionableTechniqueFactImpl;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.Soluce;

public class JudoFactGeneratorIdentifyTechnique extends FactGeneratorTemplate {

	public JudoFactGeneratorIdentifyTechnique(ModelsManager modelsManager, DungeonElements dungeonElements) {
		super(modelsManager, dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof JudoTechniqueFact) {		
			IdentifyTechnique ctask = (IdentifyTechnique) task;
			JudoQuestionableTechniqueFact qfact = new JudoQuestionableTechniqueFactImpl();
			JudoTechniqueFact jfact = (JudoTechniqueFact) fact;
			qfact.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
			switch(ctask.getSource()) {
				case NAME: 
					if(ctask.getMissing().equals(EJudoTarget.DESCRIPTION)) {
						qfact.setSourceElement(jfact.getName());
						qfact.setSourceElementType(EJudoTarget.NAME);
						qfact.setMissingElement(jfact.getDescription());
						qfact.setMissingElementType(EJudoTarget.DESCRIPTION);
					} else if(ctask.getMissing().equals(EJudoTarget.TECHNIQUE)) {
						qfact.setSourceElement(jfact.getName());
						qfact.setSourceElementType(EJudoTarget.NAME);
						qfact.setMissingElement(jfact.getRepresentation().getID());
						qfact.setMissingElementType(EJudoTarget.TECHNIQUE);
					} else {
						throw null; 
					}
					break;
				case DESCRIPTION: 
					if(ctask.getMissing().equals(EJudoTarget.TECHNIQUE)) {
						qfact.setSourceElement(jfact.getDescription());
						qfact.setSourceElementType(EJudoTarget.DESCRIPTION);
						qfact.setMissingElement(jfact.getRepresentation().getID());
						qfact.setMissingElementType(EJudoTarget.TECHNIQUE);
					} else if(ctask.getMissing().equals(EJudoTarget.NAME)) {
						qfact.setSourceElement(jfact.getDescription());
						qfact.setSourceElementType(EJudoTarget.DESCRIPTION);
						qfact.setMissingElement(jfact.getName());
						qfact.setMissingElementType(EJudoTarget.NAME);
					} else {
						throw null; 
					}
					break;
				case TECHNIQUE: 
					if(ctask.getMissing().equals(EJudoTarget.DESCRIPTION)) {
						qfact.setSourceElement(jfact.getRepresentation().getID());
						qfact.setSourceElementType(EJudoTarget.TECHNIQUE);
						qfact.setMissingElement(jfact.getDescription());
						qfact.setMissingElementType(EJudoTarget.DESCRIPTION);
					} else if(ctask.getMissing().equals(EJudoTarget.NAME)) {
						qfact.setSourceElement(jfact.getRepresentation().getID());
						qfact.setSourceElementType(EJudoTarget.TECHNIQUE);
						qfact.setMissingElement(jfact.getName());
						qfact.setMissingElementType(EJudoTarget.NAME);
					} else {
						throw null; 
					}
					break;
				}
				questionableFacts.add(qfact);
			
		}
		return questionableFacts;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		JudoQuestionableTechniqueFact jfact = (JudoQuestionableTechniqueFact) qFact;
		if(jfact.getMissingElementType().equals(EJudoTarget.TECHNIQUE)) {
			solutions.add(new Soluce(jfact.getMissingElement(), true));
		} else {
			solutions.add(new Soluce(jfact.getMissingElement()));
		}
		return solutions;
	}
	
	private List<Soluce> getListOfPossibleBadPropositions(List<Soluce> goodSolutions, EJudoTarget target) {
		List<Soluce> badPossibleSoluce = new ArrayList<>();
		for(SetOfFacts setoffact: modelsManager.getKnowledgeModel().getKnowledgefacts()) {
			for(AbstractFact afact: setoffact.getFacts()) {
				if(afact instanceof JudoTechniqueFact) {
					switch(target) {
						case NAME:
							if(!isGoodSoluce(goodSolutions, ((JudoTechniqueFact) afact).getName())) {
								badPossibleSoluce.add(new Soluce(((JudoTechniqueFact) afact).getName()));
							}
							break;
						case DESCRIPTION:
							if(!isGoodSoluce(goodSolutions, ((JudoTechniqueFact) afact).getDescription())) {
								badPossibleSoluce.add(new Soluce(((JudoTechniqueFact) afact).getDescription()));
							}
							break;
						default: 
							if(!isGoodSoluce(goodSolutions, ((JudoTechniqueFact) afact).getRepresentation().getID())) {
								badPossibleSoluce.add(new Soluce(((JudoTechniqueFact) afact).getRepresentation().getID(), true));
							}
							break;
					}
				}
			}
		}
		return badPossibleSoluce;
	}
	
	private boolean isGoodSoluce(List<Soluce> goodSolutions, String value) {
		for(Soluce sol: goodSolutions) {
			if(sol.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		
		List<Soluce> goodPropositions = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodPropositions);
		
		List<Soluce> badPropositions = new ArrayList<>();
		if(task.getResponseModality() != null) {
			DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
			badPropositions = getListOfPossibleBadPropositions(goodPropositions, ((JudoQuestionableTechniqueFact) qFact).getMissingElementType());
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
		return 1;
	}
	
	/*@Override
	protected List<String> factSolutionsToString(AQuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		JudoQuestionableTechniqueFact qfact = (JudoQuestionableTechniqueFact) qFact;		
		solutions.add(qfact.getCompleteFact());
		return solutions;
	}*/

}
