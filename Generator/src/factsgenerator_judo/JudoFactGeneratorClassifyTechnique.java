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
import generator.ECorrectness;
import generator.EJudoTarget;
import generator.JudoQuestionableClassifyFact;
import generator.JudoTechniqueFact;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.impl.JudoQuestionableClassifyFactImpl;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.Shuffle;
import structures.Soluce;

public class JudoFactGeneratorClassifyTechnique extends FactGeneratorTemplate {

	public JudoFactGeneratorClassifyTechnique(ModelsManager modelsManager, DungeonElements dungeonElements) {
		super(modelsManager, dungeonElements);
	}

	@Override
	public Set<AQuestionableFact> generateQuestionableFacts(ATask task){
		Set<AQuestionableFact> AQuestionableFacts = new HashSet<>();
		taskID = task.getID();
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		int number = mc.getNbChoices() - mc.getNbBadChoices();
		
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			System.err.println(setoffact.getFacts().size());
			HashMap<String, List<JudoTechniqueFact>> facts = new HashMap<>();
				for (AbstractFact f : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
					List<JudoTechniqueFact> factlist = new ArrayList<>();
					if(f instanceof JudoTechniqueFact) {
						JudoTechniqueFact fact = (JudoTechniqueFact) f;
						factlist.add(fact);
						if(facts.containsKey(fact.getCategory())) {
							factlist.addAll(facts.get(fact.getCategory()));
							
						} 
						facts.put(fact.getCategory(), factlist);
					}
				}
				AQuestionableFacts.addAll(generateAQuestionableFactsOf(task, facts, number));
		}	
		return AQuestionableFacts; 
	}
	
	
	protected Set<AQuestionableFact> generateAQuestionableFactsOf(ATask task, HashMap<String, List<JudoTechniqueFact>> facts, int numberByFact) {
		Set<AQuestionableFact> qfs = new HashSet<>(); 
			
		System.out.println("HASH "+facts);
		for(String key: facts.keySet()) {
			int k = 0;
			int numberOfQuestionableFacts = (int) Math.floor(facts.get(key).size() / numberByFact);
			if(numberOfQuestionableFacts == 0) {
				numberOfQuestionableFacts = facts.get(key).size();
			}
			for (int i = 0; i < numberOfQuestionableFacts; i++) {
				List<JudoTechniqueFact> judoFacts = new ArrayList<>(); 
				while(judoFacts.size() < numberByFact && k < facts.get(key).size()) {
					judoFacts.add(facts.get(key).get(k));
					k++;
				}
				System.out.println("GROUPEd "+ judoFacts);
				if(!judoFacts.isEmpty()) {
					qfs.add(buildQF(judoFacts)); 
				}
			}
		}

		return qfs;
	}
	
	private JudoQuestionableClassifyFact buildQF(List<JudoTechniqueFact> facts) {
		JudoQuestionableClassifyFact qf = new JudoQuestionableClassifyFactImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setCategory(facts.get(0).getCategory());
		for (JudoTechniqueFact judofact : facts) {
			qf.getTechniques().add(judofact.getName());
		}
		return qf;
	}

	@Override	
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		return null;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		for (String prop : ((JudoQuestionableClassifyFact) qFact).getTechniques()) {
			solutions.add(new Soluce(prop));
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact)
			throws BadSolutionGenerationException {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();

		List<Soluce> goodPropositions = getListOfGoodSolutions(qFact);
		propositions.put(ECorrectness.CORRECT, goodPropositions);
		
		List<Soluce> badPropositions = new ArrayList<>();
		if(task.getResponseModality() != null) {
			MultipleChoice mc = (MultipleChoice) task.getResponseModality();
			badPropositions = getListOfPossibleBadPropositions(goodPropositions, EJudoTarget.NAME);
			while(badPropositions.size() > mc.getNbBadChoices()) {
				int i = new Random().nextInt(badPropositions.size());
				badPropositions.remove(i);
			}
		}
		propositions.put(ECorrectness.INCORRECT, badPropositions);
		
		return propositions;
	}
	
	private List<Soluce> getListOfPossibleBadPropositions(List<Soluce> goodSolutions, EJudoTarget target) {  // TODO check category
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
	protected boolean isQuestionInteractive() {
		return false;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return ((JudoQuestionableClassifyFact) fact).getTechniques().size();
	}
	

}
