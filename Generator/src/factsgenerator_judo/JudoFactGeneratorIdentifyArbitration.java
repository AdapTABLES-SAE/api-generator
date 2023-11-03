package factsgenerator_judo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exceptions.BadSolutionGenerationException;
import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.IdentifyArbitrationGesture;
import generator.JudoArbitrationGestureFact;
import generator.JudoQuestionableArbitrationFact;
import generator.SetOfFacts;
import generator.impl.JudoQuestionableArbitrationFactImpl;
import structures.DungeonElements;
import structures.Soluce;

public class JudoFactGeneratorIdentifyArbitration extends FactGeneratorTemplate {

	public JudoFactGeneratorIdentifyArbitration(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		if(fact instanceof JudoArbitrationGestureFact) {		
			JudoQuestionableArbitrationFact qfact = new JudoQuestionableArbitrationFactImpl();
			JudoArbitrationGestureFact jfact = (JudoArbitrationGestureFact) fact;
			
			IdentifyArbitrationGesture jtask = (IdentifyArbitrationGesture) task;
			switch(jtask.getSource()) {
				case NAME: 
					qfact.setName(jfact.getName());
					qfact.setDescription("-1");
					qfact.setRepresentationID("-1");
					break;
				case DESCRIPTION: 
					qfact.setName("-1");
					qfact.setDescription(jfact.getDescription());
					qfact.setRepresentationID("-1");
					break;
				case TECHNIQUE: 
					qfact.setName("-1");					
					qfact.setDescription("-1");
					qfact.setRepresentationID(jfact.getRepresentation().getID());
					break;
			}
			
			qfact.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
			qfact.setNameSoluce(jfact.getName());
			qfact.setDescriptionSoluce(jfact.getDescription());
			qfact.setRepresentationIDSoluce(jfact.getRepresentation().getID());
			questionableFacts.add(qfact);
			
		}
		return questionableFacts;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		JudoQuestionableArbitrationFact jfact = (JudoQuestionableArbitrationFact) qFact;
		
		if(jfact.getName().equals("-1")) {
			solutions.add(new Soluce(jfact.getNameSoluce())); 
		}
		if(jfact.getDescription().equals("-1")) {
			solutions.add(new Soluce(jfact.getDescriptionSoluce()));
		}
		if(jfact.getRepresentationID().equals("-1")) {
			solutions.add(new Soluce(jfact.getRepresentationIDSoluce(), true));
		}
		
		return solutions;
	}
	
	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));		
		propositions.put(ECorrectness.INCORRECT, new ArrayList<>());
		
		
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
	
	private boolean startByName(JudoQuestionableArbitrationFact qfact) {
		return qfact.getName().isEmpty();
	}
	
	private boolean startByDescription(JudoQuestionableArbitrationFact qfact) {
		return qfact.getDescription().isEmpty();
	}
	
	private boolean startByTechnique(JudoQuestionableArbitrationFact qfact) {
		return qfact.getRepresentationID().isEmpty();
	}
	
	@Override
	protected List<String> factSolutionsToString(AQuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		JudoQuestionableArbitrationFact qfact = (JudoQuestionableArbitrationFactImpl) qFact;		
		if(startByName(qfact)) {
			solutions.add("("+qfact.getNameSoluce()+"-"+qfact.getRepresentationIDSoluce()+"-"+qfact.getDescriptionSoluce()+")");
			solutions.add("("+qfact.getNameSoluce()+"-"+qfact.getDescriptionSoluce()+"-"+qfact.getRepresentationIDSoluce()+")");
		}
		if(startByDescription(qfact)) {
			solutions.add("("+qfact.getDescriptionSoluce()+"-"+qfact.getNameSoluce()+"-"+qfact.getRepresentationIDSoluce()+")");
			solutions.add("("+qfact.getDescriptionSoluce()+"-"+qfact.getRepresentationIDSoluce()+"-"+qfact.getNameSoluce()+")");
		}		
		if(startByTechnique(qfact)) {
			solutions.add("("+qfact.getRepresentationIDSoluce()+"-"+qfact.getNameSoluce()+"-"+qfact.getDescriptionSoluce()+")");
			solutions.add("("+qfact.getRepresentationIDSoluce()+"-"+qfact.getDescriptionSoluce()+"-"+qfact.getNameSoluce()+")");
		}
		return solutions;
	}
	
	

	
}
