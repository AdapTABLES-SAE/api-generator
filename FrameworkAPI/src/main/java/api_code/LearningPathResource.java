package api_code;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.Constant;
import managers.LearningPathIDisNull;
import managers.ModelsManager;
import managers.PathManager;
import structures.DidacticDomain;

@Path("/path")
public class LearningPathResource {
	
	private PathManager manager; 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void addObjectiveLevel(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.PROJECT_PATH = app.getRealPath("");		
		JSONObject obj = new JSONObject();

		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//String classID = obj.containsKey("classroomID")? (String) obj.get("classroomID") : Constant.DEFAULT_CLASSROOM_NAME;
		manager = new PathManager((String) obj.get("learningPathID"));
		manager.updateOrCreateTrainingPath(obj);
	}
	
	@POST
	@Path("/training")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void addTrainingPath(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException, LearningPathIDisNull { 
		Constant.PROJECT_PATH = app.getRealPath("");		
		JSONObject obj = new JSONObject();

		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//String classID = obj.containsKey("classroomID")? (String) obj.get("classroomID") : Constant.DEFAULT_CLASSROOM_NAME;
		manager = new PathManager((String) obj.get("learningPathID"));
		manager.createTrainingPath(obj);
	}
	
	@GET
	@Path("/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new PathManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME,  true));
		return manager.buildJSONObjectiveLevel(manager.getLearningPath()).toJSONString();
	}
	
	@GET
	@Path("/training/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildOTrainingPathJSON(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new PathManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME,  true));
		return manager.buildJSONTrainingPath(manager.getLearningPath()).toJSONString();
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new PathManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, Constant.CLASSROOMS_FILE, classID,  true));
		return manager.buildJSONObjectiveLevel(manager.getLearningPath()).toJSONString();
	}
	
}
