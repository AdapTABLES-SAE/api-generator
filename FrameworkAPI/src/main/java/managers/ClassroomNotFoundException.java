package managers;

public class ClassroomNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassroomNotFoundException(String teacherName, String classroomID) {
		super("Teacher "+teacherName+" does not have a classroom with id="+classroomID+" !");
	}
	
	public ClassroomNotFoundException(String classroomID) {
		super("Classroom with id="+classroomID+" does not exist !");
	}
}
