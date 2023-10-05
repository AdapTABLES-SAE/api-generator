package exceptions;

import generator.AQuestionableFact;

public class BadSolutionGenerationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadSolutionGenerationException(AQuestionableFact fact) {
		super("The generation of bad solutions for fact with id="+fact.getID()+" was IMPOSSIBLE ! ");
	}

}
