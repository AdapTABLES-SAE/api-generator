package structures;

import java.util.List;

import generator.ATask;
import generator.QuestionedFact;

public class TaskFactPair {

	private ATask key; 
	private List<QuestionedFact> values;
	
	public TaskFactPair(ATask task, List<QuestionedFact> facts) {
		this.key = task; 
		this.values = facts;
	}

	public ATask getTask() {
		return key;
	}

	public List<QuestionedFact> getFacts() {
		return values;
	}
	
	public int getNumberOfFacts() {
		return values.size();
	}
	
	@Override
	public String toString() {
		return key.getID();
	}
}
