package exceptions;

public class NonExistantLearnerPlayerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonExistantLearnerPlayerException(String idLearner) {
		super("Learner-Player with id="+idLearner+" does not exist !");
	}

}
