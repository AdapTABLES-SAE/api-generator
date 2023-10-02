package exceptions;

import generator.ATask;

public class NoCompatibleGameplayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoCompatibleGameplayException(ATask task) {
		super("No gameplay was found for task of type="+task.getType()+" and id="+task.getID()+" !");
	}

}
