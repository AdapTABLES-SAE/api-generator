package api_code;

import exceptions.NonExistantLearnerPlayerException;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiResponse;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.ModelsManager;

/**
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/statistics/(classroomID)/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/statistics/(learnerID) => default classroom is used in this case
 * 
 * Resource that returns the statistics of a learner-player. 
 * @author Bérénice LEMOINE
 */

@Path("/statistics")
@Produces(MediaType.APPLICATION_JSON)
public class StatisticsResource {
	
	private LearnerManager manager;
	
	@GET
	@Path("/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String generalStatistics(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + "default.xmi", true));
		
		return manager.getGeneralStats(learnerID).toJSONString();
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		manager = new LearnerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID +".xmi", true));
		
		return manager.getGeneralStats(learnerID).toJSONString();
	}
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
}
