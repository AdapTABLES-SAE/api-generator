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
public class LearningPathManagerResource {
	
	private PathManager manager; 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addObjectiveLevel(String jsonContent, @Context ServletContext app) { // https://waytolearnx.com/2020/03/lire-un-fichier-json-avec-java.html
		Constant.PROJECT_PATH = app.getRealPath("");		
		JSONObject obj = new JSONObject();
		manager = new PathManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, true));
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		manager.updateOrCreateTrainingPath(obj);
		
		return obj.toString();
	}
	
	@GET
	@Path("/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String generate(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		Constant.PROJECT_PATH = app.getRealPath("");
		//
		String contextFileName = Constant.CONTEXTS_FILES_PREFIX + Constant.DEFAULT_CONTEXT_FILE_NAME + ".xmi";
		LearningPath path = this.getLearnerTrainingPath(contextFileName, learnerID); 
		System.err.println("IS null "+path);
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
