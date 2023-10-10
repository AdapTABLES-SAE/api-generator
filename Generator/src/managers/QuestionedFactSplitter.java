package managers;

import java.util.ArrayList;
import java.util.List;

import generator.QuestionedFact;
import generator.Value;

public class QuestionedFactSplitter {

	private boolean beginByText; 
	private List<String> texts;
	private List<Boolean> textsAreImages;
	
	private QuestionedFact fact;
	
	public QuestionedFactSplitter(QuestionedFact fact) {
		this.texts = new ArrayList<>();
		this.textsAreImages = new ArrayList<>();
		this.fact = fact;
		splitter();
	}
	
	private boolean beginByQuestionMark(String question) {
		return question.charAt(0) == '?'; //question.substring(0, 1).equals("\\?");
	}
	
	private void splitter() {
		String question = ((Value) fact.getQuestion().getValue()).getValue();
		this.beginByText = !beginByQuestionMark(question);
		System.out.println(question);
		String[] parts = question.split("\\?"); 
		for(String text : parts) {
			//System.out.println(text);
			if(!text.isEmpty()) {
				text = text.replace("\\?", "");
				if(text.contains("]")) {
					String[] subParts = question.split("]"); 
					this.texts.add(subParts[0] + "]");
					this.textsAreImages.add(true);
					this.texts.add(subParts[1].replace("?", ""));
					this.textsAreImages.add(false);
				} else {
					this.texts.add(text);
					this.textsAreImages.add(false);
				}
			}
		}
		
		System.out.println(this.texts);
	}
	
	public boolean isTextImage(int textIndex) {
		return this.textsAreImages.get(textIndex);
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
