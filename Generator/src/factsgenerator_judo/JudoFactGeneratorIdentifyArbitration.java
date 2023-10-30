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
			qfact.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
			qfact.setName(jfact.getName());
			qfact.setDescription(jfact.getDescription());
			qfact.setRepresentationID(jfact.getRepresentation().getID());
			questionableFacts.add(qfact);
			
		}
		return questionableFacts;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		JudoQuestionableArbitrationFact jfact = (JudoQuestionableArbitrationFact) qFact;
		
		solutions.add(new Soluce(jfact.getName()));
		solutions.add(new Soluce(jfact.getDescription()));
		solutions.add(new Soluce(jfact.getRepresentationID(), true));
	
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

}
