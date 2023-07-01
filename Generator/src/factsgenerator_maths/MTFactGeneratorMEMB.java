package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import factgenerator_template.FactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MTResultFact;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.SetOfFacts;
import generator.impl.MTQFMembershipImpl;
import structures.DungeonElements;
import structures.Shuffle;

public class MTFactGeneratorMEMB extends FactGeneratorTemplate {

	public MTFactGeneratorMEMB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}


	@Override
	public Set<QuestionableFact> generateQuestionableFacts(ATask task){
		Set<QuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		
		int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
		int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		int nbByFact = mc.getNbChoices() - mc.getNbBadChoices();
		
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			List<MTResultFact> facts = new ArrayList<>();
			System.err.println("setoffact "+setoffact.getFacts());
			for (AbstractFact f : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
				System.err.println("after shuffle");
				if(f instanceof MTResultFact) {
					MTResultFact fact = (MTResultFact) f;
					if(min <= (fact.getRes()/fact.getTable()) && (fact.getRes()/fact.getTable()) <= max){
						facts.add(fact);
					}
				}
			}
			questionableFacts.addAll(generateQuestionableFactsOf(task, facts, nbByFact));
		}	
		return questionableFacts; 
	}
	
	
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, List<MTResultFact> facts, int nbByFact) {
		Set<QuestionableFact> qfs = new HashSet<>(); 
		System.err.println("fact size in gen "+facts.size());
		int k = 0;
		for (int i = 0; i < (facts.size() / nbByFact); i++) {
			List<MTResultFact> factres = new ArrayList<>(); 
			for (int j = 0; j < nbByFact; j++) {
				factres.add(facts.get(k));
				k++;
			}
			qfs.add(buildQF(factres)); 
		}
		return qfs;
	}
	
	private MTQFMembership buildQF(List<MTResultFact> facts) {
		MTQFMembership qf = new MTQFMembershipImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		for (MTResultFact mtResultFact : facts) {
			qf.getGoodResults().add(mtResultFact.getRes());
		}
		qf.setTable(facts.get(0).getTable());
		return qf;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		for (Integer prop : ((MTQFMembership) qFact).getGoodResults()) {
			solutions.add(prop+"");
		}
		return solutions;
	}


	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		MTQFMembership qfact = (MTQFMembership) qFact;
		List<Integer> notallowed = new ArrayList<>();
		for (int i = 0; i < 13; i++) {
			notallowed.add(qfact.getTable() * i);
		}
		
		List<Integer> propositions_temp = new ArrayList<>();
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			int number = qfact.getTable() == 1? new Random().nextInt(qfact.getTable() * 12) + 12
					: new Random().nextInt(qfact.getTable() * 12) + 1;
			if(!notallowed.contains(number) && !propositions_temp.contains(number)) {
				propositions_temp.add(number);
			}
		}
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return propositions;
	}


	@Override
	protected int correctnessToReach(ATask task) {
		MultipleChoice mc =  (MultipleChoice)((MTMembership) task).getResponseModality();
		return mc.getNbChoices() - mc.getNbBadChoices();
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}
}
