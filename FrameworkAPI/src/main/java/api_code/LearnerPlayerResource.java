package api_code;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
import managers.ModelsManager;

/**
 * Path : http://localhost:8080/FrameworkAPI/results 
 * Ressources that takes JSON input of learner results, save them in the correct model, and update the models percentages.
 * @author Bérénice LEMOINE
 */
@Path("/results")
public class LearnerPlayerResource {

	private LearnerManager manager;
	
	@POST
	@Path("/training")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingLearnerResults(String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + "default.xmi", true));
				
		return manager.saveLearnerResults(obj);
	}
	
	@POST
	@Path("/classroom/{classroomID}/training")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingLearnerResults(@PathParam("classroomID") String classID, String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true));
				
		return manager.saveLearnerResults(obj);
	}
	
	@POST
	@Path("/game")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingPlayerResults(String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + "default.xmi", true));
				
		return manager.savePlayerResults(obj);
	}
	
	@POST
	@Path("/classroom/{classroomID}/game")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingPlayerResults(@PathParam("classroomID") String classID, String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID +".xmi", true));
				
		return manager.savePlayerResults(obj);
	}
	
	@GET
	@Path("/learner/{learnerID}/objective/{objID}/level/{levelID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("learnerID") String learnerID,
			@PathParam("objID") String objectiveID, @PathParam("levelID") String levelID, 
			@Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + "default.xmi", true));
		return manager.getTaskProgresses(learnerID, objectiveID, levelID).toJSONString();
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{learnerID}/objective/{objID}/level/{levelID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID,
			@PathParam("objID") String objectiveID, @PathParam("levelID") String levelID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true));
		return manager.getTaskProgresses(learnerID, objectiveID, levelID).toJSONString();
	}

	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/

	
}
