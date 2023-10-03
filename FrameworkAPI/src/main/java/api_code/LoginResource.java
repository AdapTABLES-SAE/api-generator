package api_code;

import java.io.File;

import exceptions.NonExistantLearnerPlayerException;
import generator.LearnerPlayer;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.Constant;
import managers.ModelsManager;

/**
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/login/(classroomID)/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/login/(learnerID) => default classroom is used in this case
 * 
 * Resource that checks if a learner-player exists based on his/her id. 
 * @author Bérénice LEMOINE
 */

@Path("/login")
public class LoginResource {
	
	/*
	 * Deployed File Path : C:\blemoine\TheseGenerator\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FrameworkAPI
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/learner/{learnerID}")
	public String generate(@PathParam("learnerID") String learnerID, @Context ServletContext app) {  
		Constant.PROJECT_PATH = app.getRealPath("");
		return isLearnerPlayerExistant(learnerID)? "OK" : "KO";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/classroom/{classID}/learner/{learnerID}")
	public String generate(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) {  
		Constant.PROJECT_PATH = app.getRealPath("");
		return isLearnerPlayerExistant(classID, learnerID)? "OK" : "KO";
	}

	
	/***********************************/
	/**          JOB METHODS          **/
	/**
	 * @throws NonExistantLearnerPlayerException *********************************/
	private boolean isLearnerPlayerExistant(String learnerID) {
		return isLearnerPlayerExistant("", learnerID);
	}
	
	private boolean isLearnerPlayerExistant(String classID, String learnerID) {
		classID = classID.isEmpty() ? "default": classID;
		if(isClassExistant(classID)) {
			ModelsManager modelsManager = new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
					Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH,
					Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi", true);
			LearnerPlayer learner = null;
			try {
				learner = modelsManager.getLearnerPlayerFromID(learnerID);
			} catch (NonExistantLearnerPlayerException e) {
				e.printStackTrace();
			}
			return learner != null; 
		}
		return false;
	}
	
	private boolean isClassExistant(String classID) {
		String contextsRepertory = Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CONTEXTS_FILES_PATH; 
		File[] files = new File(contextsRepertory).listFiles();
		
		int i = 0;
		boolean exists = false;
		while(i < files.length && !exists) {
			if (files[i].isFile() && files[i].getName().equals(Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi")) {
				exists = true;
			}
			i++;
		}
		
		return exists;
	}
	
}
