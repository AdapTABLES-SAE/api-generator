package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import generator.AbstractFact;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MTResultFact;
import generator.MultipleChoice;
import generator.SetOfFacts;
import generator.impl.MTQFMembershipImpl;
import managers.EducationElementsManager;
import structures.Shuffle;

public class MTMembershipGenerator {
	
	private EducationElementsManager eeManager;
	
	public MTMembershipGenerator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}
	
	public Set<MTQFMembership> generateQuestionableFacts(MTMembership task) {
		HashSet<MTQFMembership> questionedFacts = new HashSet<>();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		
		//System.out.println("min = "+min+" / max = "+max);
		
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
		int nbByFact = mc.getNbChoices() - mc.getNbBadChoices();
		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			List<MTResultFact> facts = new ArrayList<>();
			for (AbstractFact f : Shuffle.shuffle(setoffact.getFacts())) { 
				if(f instanceof MTResultFact) {
					MTResultFact fact = (MTResultFact) f;
					if(min <= (fact.getRes()/fact.getTable()) && (fact.getRes()/fact.getTable()) <= max){
						facts.add(fact);
					}
				}
			}
			//System.out.println("facts "+facts);
			questionedFacts.addAll(generateQuestionableFactsOf(task, facts, nbByFact));
		}
		
		return questionedFacts; 
	}
	
	private Set<MTQFMembership> generateQuestionableFactsOf(MTMembership task, List<MTResultFact> facts, int nbByFact){
		HashSet<MTQFMembership> qfs = new HashSet<>(); 
		
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
		for (MTResultFact mtResultFact : facts) {
			qf.getGoodResults().add(mtResultFact.getRes());
		}
		qf.setTable(facts.get(0).getTable());		
		return qf;
	}
}
