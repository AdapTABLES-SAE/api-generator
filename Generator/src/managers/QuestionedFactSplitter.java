package managers;

import java.util.ArrayList;
import java.util.List;

import generator.EStatementType;
import generator.PropositionParam;
import generator.QuestionedFact;
import generator.Value;

public class QuestionedFactSplitter {

	private boolean beginByText; 
	private List<String> texts;
	private List<Boolean> textsAreImages;
	
	private int numberOfHoles;
	
	private QuestionedFact fact;
	
	
	public QuestionedFactSplitter(QuestionedFact fact, EStatementType gameplayStatementType) {
		texts = new ArrayList<>();
		textsAreImages = new ArrayList<>();
		this.fact = fact;
		if(gameplayStatementType.equals(EStatementType.CLASSIC)) {
			classicStatementType();
		} else {
			fillInStatementType();
		}
	}
	
	private void classicStatementType() {
		// CLASSIC 
		for(PropositionParam prop: fact.getPropositions()) {
			texts.add(prop.getOrder()+"");
			textsAreImages.add(false);
		}
		numberOfHoles = fact.getPropositions().size();
	}
	
	private void fillInStatementType() {
		String question = ((Value) fact.getQuestion().getValue()).getValue();
		if(!question.contains("?")) {
			question += " : ";
			for(int i = 0; i < fact.getPropositions().size(); i++) {
				question += "?";
				if(i < fact.getPropositions().size() - 1) { question += " - "; }
			}
		} 
		
		splitter(question);
	}

	
	private boolean beginByQuestionMark(String question) {
		return question.charAt(0) == '?'; //question.substring(0, 1).equals("\\?");
	}
	
	private void splitter(String question) {
		beginByText = !beginByQuestionMark(question);
		numberOfHoles = (int) question.chars().filter(ch -> ch == '?').count();
		String[] parts = question.split("\\?"); 
		for(String text : parts) {
			//System.out.println(text);
			if(!text.isEmpty()) {
				text = text.replace("\\?", "");
				if(text.contains("]")) {
					String[] subParts = question.split("]"); 
					texts.add(subParts[0].replace("[", ""));
					textsAreImages.add(true);
					texts.add(subParts[1].replace("?", ""));
					textsAreImages.add(false);
				} else {
					texts.add(text);
					textsAreImages.add(false);
				}
			}
		}		
	}
	
	public boolean isTextImage(int textIndex) {
		return textsAreImages.get(textIndex);
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
		return numberOfHoles; //Integer.valueOf(((Value) fact.getCorrectnessToReach().getValue()).getValue());
	}
	
	public int numberOfTexts() {
		return texts.size();
	}
}
