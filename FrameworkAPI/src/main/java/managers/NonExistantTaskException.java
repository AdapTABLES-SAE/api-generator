package managers;

public class NonExistantTaskException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistantTaskException(String objective, String level, String path, String task) {
		super("The task " + task + " does not exist within objective " + objective + " and level " + level + " in training path " + path);
	}
}