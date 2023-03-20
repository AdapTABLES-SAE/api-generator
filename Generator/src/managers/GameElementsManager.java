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
		gameplay2facts.add(new GameplayTaskFactPair(gameplay, taskFactPair));
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
}
