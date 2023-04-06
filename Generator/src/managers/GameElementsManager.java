package managers;

import java.util.ArrayList;
import java.util.List;

import generator.Gameplay;
import structures.GameplayTaskFactPair;
import structures.TaskFactPair;

public class GameElementsManager {

	private List<GameplayTaskFactPair> gameplay2facts;
	
	public GameElementsManager() {
		super();
		this.gameplay2facts = new ArrayList<>();
	}
	
	public void add(Gameplay gameplay, TaskFactPair taskFactPair) {
		if(gameplay == null && taskFactPair == null) {
			gameplay2facts.add(null);
		} else {
			gameplay2facts.add(new GameplayTaskFactPair(gameplay, taskFactPair));
		}
	}
	
	public GameplayTaskFactPair get(int i) {
		return gameplay2facts.get(i);
	}

	public List<GameplayTaskFactPair> getGameplayToTasks(){
		return gameplay2facts;
	}
	
	public int size() {
		return gameplay2facts.size();
	}
	
	/*public void print() {
		System.err.println("Print gameplay task fact pairs");
		for (GameplayTaskFactPair taskFactPair : gameplay2facts) {
			System.out.println(taskFactPair.getTask2facts().getTask().getID()+" : ");
			for (QuestionedFact qF : taskFactPair.getTask2facts().getFacts()) {
				System.out.print("\t Entries: "+qF.getEntrys()+" correctness2reach: "+qF.getCorrectnessToReach().getValue()+" Propositions:");
				for (PropositionParam prop : qF.getPropositions()) {					
					System.out.print(prop.getValue()+ " " + prop.getState().getValue()+"|");
				}
				System.out.println();
			}
		}
		System.err.println("----------------");
	}*/
}
