package managers;

import java.util.ArrayList;
import java.util.List;

import generator.QuestionedFact;
import generator.Value;

public class QuestionedFactSplitter {

	private boolean beginByText; 
	private List<String> texts; 
	
	private QuestionedFact fact;
	
	public QuestionedFactSplitter(QuestionedFact fact) {
		this.texts = new ArrayList<>();
		this.fact = fact;
		splitter();
	}
	
	private boolean beginByQuestionMark(String question) {
		
		System.err.print("BEGIN WITH "+(question.charAt(0) == '?'));
		return question.charAt(0) == '?'; //question.substring(0, 1).equals("\\?");
	}
	
	private void splitter() {
		String question = ((Value) fact.getQuestion().getValue()).getValue();
		this.beginByText = !beginByQuestionMark(question);
		//System.out.println(question);
		String[] parts = question.split("\\?"); 
		for(String text : parts) {
			//System.out.println(text);
			if(!text.isEmpty()) {
				this.texts.add(text);
			}
		}
	}

	public boolean isBeginByText() {
		return beginByText;
	}

	public List<String> getTexts() {
		return texts;
	}

	public QuestionedFact getFact() {
		return fact;
	}
	
	public int numberOfHoles() {
		return Integer.valueOf(((Value) fact.getCorrectnessToReach().getValue()).getValue());
	}
	
	public int numberOfTexts() {
		return this.texts.size();
	}
}
