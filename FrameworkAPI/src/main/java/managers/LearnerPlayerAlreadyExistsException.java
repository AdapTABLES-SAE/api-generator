package managers;

public class LearnerPlayerAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LearnerPlayerAlreadyExistsException(String learnerID) {
		super("Learner-Player "+learnerID+" already exists ! To modify an existant learner-player please use the PUT method.");
	}
}
