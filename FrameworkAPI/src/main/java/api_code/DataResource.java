package api_code;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.NonExistantLearnerPlayerException;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiResponse;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.ClassroomAlreadyExistsException;
import managers.ClassroomNotFoundException;
import managers.Constant;
import managers.DataManager;
import managers.TeacherAlreadyExistsException;

/**
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/coins/classroom/(classroomID)/learner/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/coins/learner/(learnerID) => default classroom is used in this case
 * 
 * Resource that allows to set and get the current number of coins for a given learner
 * @author Bérénice LEMOINE
 */

@Path("/data/")
@Produces(MediaType.TEXT_XML)
public class DataResource {
	
	private DataManager manager;
	
	@GET
	@Path("/teacher/{teacherID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTeacher(@PathParam("teacherID") String teacherID, @Context ServletContext app) {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new DataManager(Constant.getTeacher(teacherID));
		return manager.getTeacherDataJSON().toJSONString();
	}
	
	@POST
	@Path("/teacher")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addTeacher(String jsonContent, @Context ServletContext app) throws TeacherAlreadyExistsException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new DataManager();
		manager.addTeacher(obj);		
	}
	
	@GET
	@Path("/students/teacher/{teacherID}/classroom/{classroomID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTeacher(@PathParam("teacherID") String teacherID, @PathParam("classroomID") String classroomID, @Context ServletContext app) throws ClassroomNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new DataManager(Constant.getTeacher(teacherID));
		return manager.getLearnersJSON(classroomID).toJSONString();
	}
	
	@POST
	@Path("/classroom")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addClassroom(String jsonContent, @Context ServletContext app) throws ClassroomAlreadyExistsException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new DataManager(Constant.getTeacher((String) obj.get("idProf")));
		manager.addClassroom(obj);		
	}
	
	@DELETE
	@Path("/teacher/{teacherID}/classroom/{classroomID}")
	public void deleteClassroom(@PathParam("teacherID") String teacherID, @PathParam("classroomID") String classroomID, @Context ServletContext app) throws ClassroomAlreadyExistsException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		
		manager = new DataManager(Constant.getTeacher(teacherID));
		manager.deleteClassroom(classroomID);		
	}
	
	
	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(String jsonContent, @Context ServletContext app) throws ClassroomNotFoundException, ClassroomAlreadyExistsException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new DataManager();
		manager.addStudent(obj);		
	}
	
	@DELETE
	@Path("/teacher/{teacherID}/classroom/{classroomID}/learner/{studentID}")
	public void deleteClassroom(@PathParam("teacherID") String teacherID, @PathParam("classroomID") String classroomID, @PathParam("studentID") String studentID, @Context ServletContext app) throws ClassroomAlreadyExistsException, NonExistantLearnerPlayerException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		
		manager = new DataManager(Constant.getTeacher(teacherID));
		manager.deleteStudent(classroomID, studentID);		
	}
}
