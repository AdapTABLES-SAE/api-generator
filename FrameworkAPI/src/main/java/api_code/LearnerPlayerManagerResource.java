package api_code;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import generator.CurrentObjectiveLevel;
import generator.LearnerPlayer;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.ResultsByTask;
import generator.impl.QuestionableFactResultImpl;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import managers.ModelsManager;

@Path("/learnerPlayerManager")
public class LearnerPlayerManagerResource {

	private static final String WORKSPACE_PATH = "C:/blemoine/TheseGenerator/gen1/FrameworkAPI/";
	private static final String INPUT_MODELS_PATH = WORKSPACE_PATH + "models/inputmodels/";
	private static final String OUTPUT_MODELS_PATH = WORKSPACE_PATH + "models/";
	private static final String CONTEXTS_FILES_PATHS = "contextsByLP/Context_";
	private ModelsManager modelsManager;
	private LearnerPlayer learnerPlayer;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingLearnerPlayerResults(String jsonContent) { 
		JSONObject obj = new JSONObject();
		modelsManager = new ModelsManager(INPUT_MODELS_PATH, OUTPUT_MODELS_PATH, CONTEXTS_FILES_PATHS + obj.get("learnerID") + ".xmi");
		learnerPlayer = modelsManager.context.getLearnerplayer();
		
		CurrentObjectiveLevel col = getCorrespondingCOL((String) obj.get("objectiveID"), (String) obj.get("levelID"));
		if(col != null) {
			JSONArray results = (JSONArray) obj.get("resultsbyTasks");
			for (Object object : results) {
				JSONObject taskResult = (JSONObject) object;
				ResultsByTask rbt = getCorrespondingResultsByTask((String) taskResult.get("taskID"), col);
				if(rbt != null) {
					addResultsToTask(taskResult, rbt);
				} else {
					System.err.println("ResultsByTask not found with ID = " + (String) taskResult.get("taskID"));
				}
			}
		} else {
			System.err.println("CurrentObjectiveLevel not found for O/L = (" + (String) obj.get("objectiveID") + " , " + (String) obj.get("levelID") + ")");
		}
		
		modelsManager.context.setLearnerplayer(learnerPlayer);
		modelsManager.saveContextModel();
		return "TOTO";
	}
	
	private void addResultsToTask(JSONObject jtask, ResultsByTask rbt) {
		JSONArray facts = (JSONArray) jtask.get("questionableFacts");
		for (Object object : facts) {
			JSONObject factResult = (JSONObject) object;
			QuestionableFact qf = getCorrespondingQuestionnableFact((String) factResult.get("questionableFactID"), rbt);
			if(qf != null) {
				QuestionableFactResult qfres = new QuestionableFactResultImpl();
				qfres.setAnswerValid((boolean) factResult.get("isCorrect"));
				qfres.setResponseTime((int) (long) factResult.get("responseTime"));
				
				JSONArray answers = (JSONArray) factResult.get("answers");
				for (Object answer : answers) {
					qfres.getGivenAnswers().add((String) answer);
				}
			} else {
				System.err.println("Questionnable fact not found with ID = " + (String) factResult.get("questionableFactID"));
			}
		}
	}
	
	private QuestionableFact getCorrespondingQuestionnableFact(String factID, ResultsByTask rbt) {
		for (QuestionableFact qf : rbt.getQuestionableFacts()) {
			if(qf.getID().equals(factID)) {
				return qf;
			}
		}
		return null; 
	}
	
	private ResultsByTask getCorrespondingResultsByTask(String taskID, CurrentObjectiveLevel col) {
		for (ResultsByTask rbt : col.getResults().getResultsbytask()) {
			if(rbt.getTask().getID().equals(taskID)) {
				return rbt;
			}
		}
		return null;
	}
	
	private CurrentObjectiveLevel getCorrespondingCOL(String objectiveID, String levelID) {
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().getID().equals(objectiveID) && col.getLevel().getID().equals(levelID)) {
				return col;
			}
		}
		return null;
	}
}
