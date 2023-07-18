package api_code;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exceptions.NonExistantLearnerPlayerException;
import generator.CurrentObjectiveLevel;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.ResultsByTask;
import generator.impl.QuestionableFactResultImpl;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.ModelsManager;

@Path("/learnerPlayerManager")
public class LearnerPlayerManagerResource {

	private ModelsManager modelsManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingLearnerPlayerResults(String jsonContent, @Context ServletContext app) { 
		Constant.PROJECT_PATH = app.getRealPath("");
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		modelsManager = new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + obj.get("learnerID") + ".xmi", true);
				
		CurrentObjectiveLevel col;
		try {
			col = getCorrespondingCOL((String) obj.get("objectiveID"), (String) obj.get("levelID"), (String) obj.get("learnerID"));
			if(col != null) {
				JSONArray results = (JSONArray) obj.get("resultsByTasks");
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
		} catch (NonExistantLearnerPlayerException e) {
			e.printStackTrace();
		}
		
		modelsManager.saveContextModel();
		return "Success";
	}

	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
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
					qfres.getGivenAnswers().add(answer+"");
				}
				qf.getResults().add(qfres);
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
	
	private CurrentObjectiveLevel getCorrespondingCOL(String objectiveID, String levelID, String learnerID) throws NonExistantLearnerPlayerException {
		for (CurrentObjectiveLevel col : modelsManager.getLearnerPlayer(learnerID).getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			System.out.println(col.getObjective().getID()+" "+col.getLevel().getID());
			System.out.println(col.getObjective().getID().equals(objectiveID));
			System.out.println(col.getLevel().getID().equals(levelID));
			if(col.getObjective().getID().equals(objectiveID) && col.getLevel().getID().equals(levelID)) {
				return col;
			}
		}
		return null;
	}

}
