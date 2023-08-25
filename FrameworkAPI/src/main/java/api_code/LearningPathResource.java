package api_code;

import java.io.File;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.NonExistantLearnerPlayerException;
import generator.LearnerPlayer;
import generator.LearningPath;
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

@Path("/path")
public class LearningPathResource {
	
	private PathManager manager; 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addObjectiveLevel(String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");		
		JSONObject obj = new JSONObject();
		manager = new PathManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, true));
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		manager.updateOrCreateTrainingPath(obj);
		
		return "Success";
	}
	
	@GET
	@Path("/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		String contextFileName = Constant.CONTEXTS_FILES_PREFIX + Constant.DEFAULT_CONTEXT_FILE_NAME + ".xmi";
		manager = new PathManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, true));
		LearningPath path = this.getLearnerTrainingPath(contextFileName, learnerID); 
		return manager.buildJSONTrainingPath(path).toJSONString();
	}
	
	@GET
	@Path("/classroom/{classroomID}/learner/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buildObjectiveLevelParams2JSON(@PathParam("classroomID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		String contextFileName = Constant.CONTEXTS_FILES_PREFIX + classID + ".xmi";
		manager = new PathManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, true));
		LearningPath path = this.getLearnerTrainingPath(contextFileName, learnerID); 
		return manager.buildJSONTrainingPath(path).toJSONString();
	}
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/

	public LearningPath getLearnerTrainingPath(String contextFileName, String learnerID) {
		String contextsRepertory = Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CONTEXTS_FILES_PATH; 
		File[] files = new File(contextsRepertory).listFiles();

		
		int i = 0;
		String pathID = "";
		ModelsManager modelsManager = null;
		while(i < files.length && pathID.isEmpty()) {
			System.out.println(files[i].getName()+ " -- "+contextFileName);
			if (files[i].isFile() && files[i].getName().equals(contextFileName)) {
				modelsManager = new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
						Constant.CONTEXTS_FILES_PATH + contextFileName, true);
				try {
					LearnerPlayer learner = modelsManager.getLearnerPlayer(learnerID);
					if(learner != null) {
						pathID = learner.getLearningpath().getID();
					}
				} catch (NonExistantLearnerPlayerException e) {
					e.printStackTrace();
				}
			}
			i++;
		}
		
		return manager.getCorrespondingPath(modelsManager.getLearningPathModel(), pathID);
	}
}
