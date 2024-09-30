package api_code;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.ContextNotFoundException;
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
import structures.DidacticDomain;

/**
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/coins/classroom/(classroomID)/learner/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/coins/learner/(learnerID) => default classroom is used in this case
 * 
 * Resource that allows to set and get the current number of coins for a given learner
 * @author Bérénice LEMOINE
 */

@Path("/coins")
@Produces(MediaType.TEXT_XML)
public class CoinsResource {
	
	private LearnerPlayerManager manager; 
	
	@GET
	@Path("/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCoins(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, 
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
		return manager.getLearnerCoins().toJSONString();
	}
	
	@GET
	@Path("/classroom/{classID}/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCoins(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, 
				Constant.CLASSROOMS_FILE, classID, true));
		return manager.getLearnerCoins().toJSONString();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void setCoins(String jsonContent, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String classID = obj.containsKey("classroomID")? (String) obj.get("classroomID"): Constant.DEFAULT_CLASSROOM_NAME;
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.MATHEMATICS, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, 
				Constant.CLASSROOMS_FILE, classID, true));
		manager.setLearnerCoins(obj);
	}
	
	// hg
	
	@GET
	@Path("/learnerhg/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCoinsHG(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException, ContextNotFoundException {  
		Constant.changeDomains(DidacticDomain.HISTORY_GEOGRAPHY);
		Constant.PROJECT_PATH = app.getRealPath("");
		manager = new LearnerPlayerManager(new ModelsManager(DidacticDomain.HISTORY_GEOGRAPHY, Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, learnerID, 
				Constant.CLASSROOMS_FILE, Constant.DEFAULT_CLASSROOM_NAME, true));
		return manager.getLearnerCoins().toJSONString();
	}
}
