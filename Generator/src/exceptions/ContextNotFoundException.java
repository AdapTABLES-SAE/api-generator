package exceptions;

public class ContextNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ContextNotFoundException(String contextID, String contextsFile) {
		super("Context with id="+contextID+" does not exist in file :"+contextsFile);
	}

}
