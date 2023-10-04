package managers;

public class TeacherAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeacherAlreadyExistsException(String teacherID) {
		super("Teacher "+teacherID+" already exists ! To modify an existant teacher please use the PUT method.");
	}
}
