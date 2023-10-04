package managers;

public class ClassroomAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassroomAlreadyExistsException(String classroomID) {
		super("Classroom "+classroomID+" already exists ! To modify an existant classroom please use the PUT method.");
	}
}
