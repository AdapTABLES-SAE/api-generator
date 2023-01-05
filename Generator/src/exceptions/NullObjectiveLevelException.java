package exceptions;

public class NullObjectiveLevelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullObjectiveLevelException() {
		super("Chosen Objective/Level can not be null");
	}

}
