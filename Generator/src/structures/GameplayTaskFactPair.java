package structures;

import generator.Gameplay;

public class GameplayTaskFactPair {
	
	private Gameplay gameplay;
	private TaskFactPair task2facts; 
	
	public GameplayTaskFactPair(Gameplay gameplay, TaskFactPair taskFactPair) {
		this.gameplay = gameplay;
		this.task2facts = taskFactPair;
	}

	public Gameplay getGameplay() {
		return gameplay;
	}

	public TaskFactPair getTask2facts() {
		return task2facts;
	}
	
}
