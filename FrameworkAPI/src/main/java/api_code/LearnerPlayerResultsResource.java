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
import managers.LearnerPlayerManager;
import managers.ModelsManager;
import managers.NonExistantObjectiveOrLevelException;
import structures.DidacticDomain;

/**
 * Path : http://localhost:8080/FrameworkAPI/results 
 * Ressources that takes JSON input of learner results, save them in the correct model, and update the models percentages.
 * @author Bérénice LEMOINE
 */
@Path("/results")
public class LearnerPlayerResultsResource {

	private LearnerPlayerManager manager;
	
	@POST
	@Path("/training")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingLearnerResults(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
				
		manager.saveLearnerResults(obj);
	}
	
	@POST
	@Path("/classroom/{classroomID}/training")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingLearnerResults(@PathParam("classroomID") String classID, String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, classID, true));
				
		manager.saveLearnerResults(obj);
	}
	
	@POST
	@Path("/game")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingPlayerResults(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
				
		manager.savePlayerResults(obj);
	}
	
	@POST
	@Path("/classroom/{classroomID}/game")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingPlayerResults(@PathParam("classroomID") String classID, String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, classID, true));
				
		manager.savePlayerResults(obj);
	}
	
	@GET
	@Path("/learner/{learnerID}/objective/{objID}/level/{levelID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("learnerID") String learnerID,
			@PathParam("objID") String objectiveID, @PathParam("levelID") String levelID, 
			@Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException, NonExistantObjectiveOrLevelException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) learnerID,
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
		return manager.getTaskProgresses(objectiveID, levelID).toJSONString();
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{learnerID}/objective/{objID}/level/{levelID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID,
			@PathParam("objID") String objectiveID, @PathParam("levelID") String levelID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException, NonExistantObjectiveOrLevelException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID,
				Constant.CLASSROOMS_FILE, classID, true));
		return manager.getTaskProgresses(objectiveID, levelID).toJSONString();
	}

	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/

	//HG
	@POST
	@Path("/traininghg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingLearnerResultsHG(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.changeDomains(DidacticDomain.HISTORY_GEOGRAPHY);
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.HISTORY_GEOGRAPHY, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
				
		manager.saveLearnerResults(obj);
	}
	
	@POST
	@Path("/gamehg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addingPlayerResultsHg(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException { 
		Constant.changeDomains(DidacticDomain.HISTORY_GEOGRAPHY);
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.HISTORY_GEOGRAPHY, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) obj.get( "learnerID"),
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
				
		manager.savePlayerResults(obj);
	}
	
	@GET
	@Path("/learnerhg/{learnerID}/objective/{objID}/level/{levelID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSONHG(@PathParam("learnerID") String learnerID,
			@PathParam("objID") String objectiveID, @PathParam("levelID") String levelID, 
			@Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException, NonExistantObjectiveOrLevelException {
		Constant.changeDomains(DidacticDomain.HISTORY_GEOGRAPHY);
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.HISTORY_GEOGRAPHY, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, (String) learnerID,
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
		return manager.getTaskProgresses(objectiveID, levelID).toJSONString();
	}
}
