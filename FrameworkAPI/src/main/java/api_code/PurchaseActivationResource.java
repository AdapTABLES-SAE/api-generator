package api_code;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.NonExistantLearnerPlayerException;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiResponse;
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

/**
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/store/learner/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/statistics/(learnerID) => default classroom is used in this case
 * 
 * Resource that deals with learner-player items purchase and activation. 
 * @author Bérénice LEMOINE
 */

@Path("/store")
@Produces(MediaType.APPLICATION_JSON)
public class PurchaseActivationResource {
	
	private LearnerPlayerManager manager;
	
	@GET
	@Path("/learner/{playerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActivatedItems(@PathParam("playerID") String playerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + Constant.DEFAULT_CONTEXT_FILE_NAME + ".xmi", true));
		return manager.getItemsStatus(playerID).toJSONString();
	}
	
	@GET
	@Path("/reset/learner/{playerID}")
	@Produces(MediaType.TEXT_PLAIN)
	public void resetItems(@PathParam("playerID") String playerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + Constant.DEFAULT_CONTEXT_FILE_NAME + ".xmi", true));
		manager.resetEquipments(playerID);
	}
	
	@GET
	@Path("/reset/classroom/{classroomID}/learner/{playerID}")
	@Produces(MediaType.TEXT_PLAIN)
	public void resetItems(@PathParam("classroomID") String classID, @PathParam("playerID") String playerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true));
		manager.resetEquipments(playerID);
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{playerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActivatedItems(@PathParam("classroomID") String classID, @PathParam("playerID") String playerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true));
		return manager.getItemsStatus(playerID).toJSONString();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void setActivatedItems(String jsonContent, @Context ServletContext app) throws NonExistantLearnerPlayerException {
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String classID = obj.containsKey("classroomID")? (String) obj.get("classroomID"): Constant.DEFAULT_CONTEXT_FILE_NAME;
		manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true));
		manager.setItemsStatus(obj);
	}
	
/*	@GET
	@Path("/{classID}/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(classID, learnerID, app);
	}*/
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
}
