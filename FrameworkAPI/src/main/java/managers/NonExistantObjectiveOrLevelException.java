package managers;

public class NonExistantObjectiveOrLevelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistantObjectiveOrLevelException(String objective, String level, String path) {
		super("The objective "+objective+" or level "+level+" does not exist in training path "+path);
	}
}
