package managers;

import java.util.ArrayList;
import java.util.List;

import generator.QuestionedFact;
import generator.Value;

public class QuestionedFactSplitter {

	private boolean beginByText; 
	private List<String> texts; 
	private List<String> detectorSolutions; 
	
	private QuestionedFact fact;
	
	public QuestionedFactSplitter(QuestionedFact fact) {
		this.texts = new ArrayList<>();
		this.detectorSolutions = new ArrayList<>();
		this.fact = fact;
		splitter();
	}
	
	private boolean beginByQuestionMark(String question) {
		return question.substring(0, 1).equals("\\?");
	}
	
	private void splitter() {
		String question = ((Value) fact.getQuestion().getValue()).getValue();
		this.beginByText = !beginByQuestionMark(question);
		
		
		System.out.println(question);
		String[] texts = question.split("\\?"); 
		for(String text : texts) {
			System.out.println(text);
			
		}
	}
	
	
}
