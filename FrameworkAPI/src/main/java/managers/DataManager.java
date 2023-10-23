package managers;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import exceptions.NonExistantLearnerPlayerException;
import generator.Classroom;
import generator.Classrooms;
import generator.LearnerPlayer;
import generator.Teacher;
import generator.Teachers;
import generator.impl.ClassroomImpl;
import generator.impl.LearnerPlayerImpl;
import generator.impl.LearnerProgressImpl;
import generator.impl.PlayerProgressImpl;
import generator.impl.ProgressionImpl;
import generator.impl.StatisticsImpl;
import generator.impl.TeacherImpl;
import generators.ALGAGenerator;

public class DataManager {

	private Teacher teacher;
	
	public DataManager(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public DataManager() {
		this.teacher = null;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject getTeacherDataJSON() {
		JSONObject teacherJSON = new JSONObject();
		
		teacherJSON.put("idProf", teacher.getID());
		teacherJSON.put("name", teacher.getName());
		
		JSONArray classes = new JSONArray();
		for(Classroom classroom: teacher.getClassrooms()){
			JSONObject classe = new JSONObject();
			classe.put("id", classroom.getID());
			classe.put("name", classroom.getName());
			classe.put("nbStudents", classroom.getLearnerPlayers().size());
			classes.add(classe);
		}
		teacherJSON.put("classes", classes);
		return teacherJSON;
	}
	
	@SuppressWarnings("unchecked")
	public JSONArray getLearnersJSON(String classroomID) throws ClassroomNotFoundException {
		Classroom classroom = getClassroom(classroomID);
		JSONArray learnersJSON = new JSONArray();
		
		for(LearnerPlayer learner: classroom.getLearnerPlayers()) {
			JSONObject learnerJSON = new JSONObject();
			learnerJSON.put("id", learner.getID());
			learnerJSON.put("nom", learner.getLastName());
			learnerJSON.put("prenom", learner.getName());
			learnerJSON.put("idClasse", classroom.getID());
			learnersJSON.add(learnerJSON);
		}
		return learnersJSON;
	}
	
	private Classroom getClassroom(String classroomID) throws ClassroomNotFoundException {
		for(Classroom classe : teacher.getClassrooms()) {
			if(classe.getID().equals(classroomID)) {
				return classe;
			}
		}
		throw new ClassroomNotFoundException(teacher.getName(), classroomID);
	}
	
	public void addClassroom(JSONObject data) throws ClassroomAlreadyExistsException {
		Classrooms classrooms = Constant.loadClassrooms();
		JSONObject classe = (JSONObject) data.get("classe");
		String classID = (String) classe.get("id");
		
		if(containsClassroom(classrooms, classID)) {
			throw new ClassroomAlreadyExistsException(classID);
		}
		
		Classroom classroom = new ClassroomImpl();
		classroom.setID(classID);
		classroom.setName((String) classe.get("name"));
		classrooms.getClassrooms().add(classroom);
		teacher.getClassrooms().add(classroom);
		Constant.saveClassroomsModel(classrooms);
		Constant.saveTeachersModel(teacher);
	}
	
	public void updateClassroom(JSONObject data) throws ClassroomNotFoundException {
		Classrooms classrooms = Constant.loadClassrooms();
		JSONObject classe = (JSONObject) data.get("classe");
		String classID = (String) classe.get("id");
		
		if(!containsClassroom(classrooms, classID)) {
			throw new ClassroomNotFoundException(classID);
		} else {
			Classroom classroom = getClassroom(classrooms, classID);
			classroom.setName((String) classe.get("name"));
			Constant.saveClassroomsModel(classrooms);
			Constant.saveTeachersModel(teacher);
		}
	}
	
	public void addTeacher(JSONObject data) throws TeacherAlreadyExistsException {
		Teachers teachers = Constant.loadTeachers();
		String teacherID = (String) data.get("idProf");
		
		if(containsTeacher(teachers, teacherID)) {
			throw new TeacherAlreadyExistsException(teacherID);
		}
		Teacher teacher = new TeacherImpl();
		teacher.setID(teacherID);
		teacher.setName((String) data.get("name"));
		
		teachers.getTeachers().add(teacher);
		Constant.saveTeachersModel(teacher);
	}
	
	
	public void addStudent(JSONObject data) throws ClassroomNotFoundException, LearnerPlayerAlreadyExistsException {
		Classrooms classrooms = Constant.loadClassrooms();
		String classID = (String) data.get("idClasse");
		
		Classroom classroom = getClassroomWithID(classrooms, classID);
		if(classroom == null) {
			throw new ClassroomNotFoundException(classID);
		}
		
		if(containsLearnerPlayer(classroom, (String) data.get("idStudent"))) {
			throw new LearnerPlayerAlreadyExistsException((String) data.get("idStudent"));
		} else {
			LearnerPlayer learner = new LearnerPlayerImpl();
			learner.setID((String) data.get("idStudent"));
			learner.setLastName((String) data.get("nomEleve"));
			learner.setName((String) data.get("prenomEleve"));
			learner.setProgression(new ProgressionImpl());
			learner.getProgression().setLearnerProgress(new LearnerProgressImpl());
			learner.getProgression().setPlayerProgress(new PlayerProgressImpl());
			learner.setStatistics(new StatisticsImpl());
			Constant.saveLearnerModel(learner);
			classroom.getLearnerPlayers().add(learner);
			Constant.saveClassroomsModel(classrooms);
		}

	}
	
	public void updateStudent(JSONObject data) throws  ClassroomNotFoundException, NonExistantLearnerPlayerException {
		Classrooms classrooms = Constant.loadClassrooms();
		String classID = (String) data.get("idClasse");
		
		Classroom classroom = getClassroomWithID(classrooms, classID);
		if(classroom == null) {
			throw new ClassroomNotFoundException(classID);
		}
		if(!containsLearnerPlayer(classroom, (String) data.get("idStudent"))) {
			throw new  NonExistantLearnerPlayerException((String) data.get("idStudent"));
		} else {
			LearnerPlayer learner = getLearnerPlayer(classroom, (String) data.get("idStudent"));
			learner.setLastName((String) data.get("nomEleve"));
			learner.setName((String) data.get("prenomEleve"));
			learner.setProgression(new ProgressionImpl());
			learner.getProgression().setLearnerProgress(new LearnerProgressImpl());
			learner.getProgression().setPlayerProgress(new PlayerProgressImpl());
			learner.setStatistics(new StatisticsImpl());
			Constant.saveLearnerModel(learner);
			Constant.saveClassroomsModel(classrooms);
		}
		
	}
	
	private LearnerPlayer getLearnerPlayer(Classroom classroom, String playerID) {
		for(LearnerPlayer learner : classroom.getLearnerPlayers()) {
			if(learner.getID().equals(playerID)) {
				return learner;
			} 
		}
		return null;
	}
	
	private boolean containsLearnerPlayer(Classroom classroom, String playerID) {
		for(LearnerPlayer learner : classroom.getLearnerPlayers()) {
			if(learner.getID().equals(playerID)) {
				return true;
			} 
		}
		return false;
	}
	
	public void deleteClassroom(String classroomID) throws ClassroomAlreadyExistsException {
		Classrooms classrooms = Constant.loadClassrooms();
		teacher.getClassrooms().remove(getTeacherClassroomWithID(classroomID));
		classrooms.getClassrooms().remove(getClassroomWithID(classrooms, classroomID));
		Constant.saveTeachersModel(teacher);
		Constant.saveClassroomsModel(classrooms);
	}
	
	public void deleteStudent(String classroomID, String studentID) throws NonExistantLearnerPlayerException {
		Classrooms classrooms = Constant.loadClassrooms();
		Classroom classe = getClassroomWithID(classrooms, classroomID);
		LearnerPlayer learner = getLearnerWithID(classe, studentID);
		
		if(learner == null) {
			throw new NonExistantLearnerPlayerException(studentID);
		}
		String studentFile = Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.LEARNERS_FILES_PATH + Constant.LEARNER_FILE_NAME_PREFIX + learner.getID() + ".xmi";
		File f = new File(studentFile);
		
		if(f.delete()) {
			ALGAGenerator.LOGGER.info("Deletion of "+f.getName() + "!");
		} else {
			ALGAGenerator.LOGGER.info("FAILED deletion of "+f.getName() + "!");
		}
		classe.getLearnerPlayers().remove(learner);
		Constant.saveClassroomsModel(classrooms);
	}
	
	private LearnerPlayer getLearnerWithID(Classroom classroom, String studentID) {
		for(LearnerPlayer learner: classroom.getLearnerPlayers()) {
			if(learner.getID().equals(studentID)) {
				return learner;
			}
		}
		return null; 
	}
	
	private Classroom getTeacherClassroomWithID(String classID) {
		for(Classroom classroom: teacher.getClassrooms()) {
			if(classroom.getID().equals(classID)) {
				return classroom; 
			}
		}
		return null;
	}
	
	private Classroom getClassroomWithID(Classrooms classrooms, String classID) {
		for(Classroom classroom: classrooms.getClassrooms()) {
			if(classroom.getID().equals(classID)) {
				return classroom; 
			}
		}
		return null;
	}
	
	private Classroom getClassroom(Classrooms classrooms, String classID) {
		for(Classroom classroom : classrooms.getClassrooms()) {
			if(classroom.getID().equals(classID)) {
				return classroom;
			}
		}
		return null;
	}
	
	private boolean containsClassroom(Classrooms classrooms, String classID) {
		for(Classroom classroom : classrooms.getClassrooms()) {
			if(classroom.getID().equals(classID)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean containsTeacher(Teachers teachers, String teacherID) {
		for(Teacher teacher : teachers.getTeachers()) {
			if(teacher .getID().equals(teacherID)) {
				return true;
			}
		}
		return false;
	}
	
}
