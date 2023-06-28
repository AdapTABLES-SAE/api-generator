package api_code;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import generator.ATask;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.Knowledge;
import generator.LearningDomain;
import generator.LearningPath;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTRecontruction;
import generator.MultipleChoice;
import generator.Objective;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.EnterResponseImpl;
import generator.impl.LearningPathImpl;
import generator.impl.MTCompletion1Impl;
import generator.impl.MTCompletion2Impl;
import generator.impl.MTIdentificationImpl;
import generator.impl.MTLevelImpl;
import generator.impl.MTMembershipImpl;
import generator.impl.MTRecontructionImpl;
import generator.impl.MultipleChoiceImpl;
import generator.impl.ObjectiveImpl;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.ModelsManager;

@Path("/pathsManager")
public class LearningPathManagerResource {
	
	private ModelsManager modelsManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addObjectiveLevel(String jsonContent, @Context ServletContext app) { // https://waytolearnx.com/2020/03/lire-un-fichier-json-avec-java.html
		Paths.PROJECT_PATH = app.getRealPath("");		
		JSONObject obj = new JSONObject();
		modelsManager = new ModelsManager(Paths.PROJECT_PATH + Paths.INPUT_MODELS_PATH, Paths.PROJECT_PATH + Paths.OUTPUT_MODELS_PATH, true);
		try {
			obj = (JSONObject) new JSONParser().parse(jsonContent);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		updateOrCreateLP(obj);
		
		return obj.toString();
	}
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
	private void updateOrCreateLP(JSONObject json) {
		String pathName = (String) json.get("learningPathID");
		LearningDomain paths = modelsManager.loadDomainModel();
		LearningPath aPath = getCorrespondingPath(paths, pathName);
		Knowledge knowledge = modelsManager.loadKnowledgeModel();
		if(aPath.getID() == null) {
			aPath.setID(pathName);
			aPath.setKnowledge(knowledge);
			aPath.setName("Just another test");
		} 
		Objective obj = getCorrespondingObjective(aPath, knowledge, json);
		addLevelToObjective(obj, json);
		aPath.getObjectives().add(obj);
		paths.getLearningpaths().add(aPath);
		modelsManager.saveDomainModel(paths);
	}
	
	private List<JSONObject> getJSONTasks(JSONObject json){
		JSONArray tasksParameters;
		tasksParameters = (JSONArray) ((JSONObject) json.get("setupParameters")).get("tasksParameters");
		
		List<JSONObject> tasks = new ArrayList<>();
		for (int i = 0; i < tasksParameters.size(); i++) {
			tasks.add((JSONObject) tasksParameters.get(i));
		}
		
		return tasks;
	}
	
	private JSONObject getBuildSetupJSON(JSONObject json) {
		JSONObject buildingParams = new JSONObject();
		buildingParams = (JSONObject) ((JSONObject) json.get("setupParameters")).get("buildingParameters");
		return buildingParams;
	}
	
	private void addLevelToObjective(Objective obj,  JSONObject json) {
		JSONObject buildingParams = getBuildSetupJSON(json);
		String levelName = obj.getID()+"-L"+(obj.getLevels().size() + 1);
		
		MTLevel level = new MTLevelImpl();
		level.setID(levelName);
		
		String jsonElem = (String) buildingParams.get("leftOperand");
		TableBuild build = jsonElem.equals("TABLE")? TableBuild.TABLE_OPERAND: TableBuild.OPERAND_TABLE;
		jsonElem = (String) buildingParams.get("resultLocation");
		ResultPosition resPosition = ResultPosition.valueOf(jsonElem);
		
		level.setBuildSetup(build);
		level.setResultPositionSetup(resPosition);
		level.setMinInterval((int) ((long) buildingParams.get("intervalMin")));
		level.setMaxInterval((int) ((long) buildingParams.get("maxInterval")));
		
		createLevelTasks(level, getJSONTasks(json), levelName);
		
		obj.getLevels().add(level);
	}
	
	private void createLevelTasks(MTLevel level, List<JSONObject> jsonTasks, String levelID){
		int idNbTask = 1;
		String idTask;
		for (JSONObject jtask : jsonTasks) {
			idTask = levelID+"-T"+idNbTask;
			switch (jtask.get("typeTask").toString()) {
			case "C1":
				level.getTasks().add(createC1Task(jtask, idTask));
				break;
			case "C2":
				level.getTasks().add(createC2Task(jtask, idTask));
				break;
			case "REC":
				level.getTasks().add(createRECTask(jtask, idTask));
				break;
			case "ID":
				level.getTasks().add(createIDTask(jtask, idTask));
				break;
			case "MEMB":
				level.getTasks().add(createMEMBTask(jtask, idTask));
				break;
			default:
				break;
			}
			idNbTask++;
		}
	}
	
	private ATask createC1Task(JSONObject jtask, String taskID) {
		MTCompletion1 task = new MTCompletion1Impl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSeconds"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		List<ESingleTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget; 
			if(starget.equals("FACTOR"))targets.add(ESingleTarget.OPERAND);
			else targets.add(ESingleTarget.valueOf(starget));
		}
		task.getTargets().addAll(targets);
		
		if(((String) jtask.get("answerModality")).equals("CHOICE")) {
			MultipleChoice modality = new MultipleChoiceImpl();
			modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
			modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
			task.setResponseModality(modality);
		} else {
			task.setResponseModality(new EnterResponseImpl());
		}
		
		return task;
	}
	
	private ATask createC2Task(JSONObject jtask, String taskID) {
		MTCompletion2 task = new MTCompletion2Impl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSeconds"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		List<ESeveralTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget; 
			if(starget.equals("OP_RES"))targets.add(ESeveralTarget.OPERAND_RESULT);
			if(starget.equals("TAB_RES")) targets.add(ESeveralTarget.TABLE_RESULT);
			else targets.add(ESeveralTarget.OPERAND_TABLE);
		}
		task.getTargets().addAll(targets);
		
		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createRECTask(JSONObject jtask, String taskID) {
		MTRecontruction task = new MTRecontructionImpl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSeconds"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createIDTask(JSONObject jtask, String taskID) {
		MTIdentification task = new MTIdentificationImpl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSeconds"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		task.setNbFacts((int)(long) jtask.get("nbFacts"));
		task.setTarget(ESingleTarget.valueOf((String) jtask.get("sourceVariation")));
		
		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices(2);
		modality.setNbBadChoices(1);	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createMEMBTask(JSONObject jtask, String taskID) {
		MTMembership task = new MTMembershipImpl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSeconds"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		if(((String) jtask.get("target")).equals("CORRECT")) {
			task.setIdentifySharedProperty(true);
		} else {
			task.setIdentifySharedProperty(false);
		}
				
		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
		task.setResponseModality(modality);
		
		return task;
	}
	
	@SuppressWarnings("unchecked")
	private Objective getCorrespondingObjective(LearningPath learningPath, Knowledge knowledge, JSONObject json) {
		Objective obj = new ObjectiveImpl();
		String objID = (String) json.get("objective");
		System.out.println(objID);
		if(objID.isEmpty()) {
			int nbObjs = learningPath.getObjectives().size() + 1;
			obj.setID(learningPath.getID()+"-O"+nbObjs);
			obj.setName(obj.getID());
		} else {
			for (Objective objective : learningPath.getObjectives()) {
				if(objective.getID().equals(objID)) {
					obj = objective;
					break;
				}
			}
			obj.setID(objID);
			 
		}
		if(obj.getSetoffacts().isEmpty()) {
			for (Long table :  (List<Long>) getBuildSetupJSON(json).get("tables")) {
				for (SetOfFacts sof : knowledge.getKnowledgefacts()) {
					if(sof.getName().contains(table+"")) { // TODO : it's shit
						obj.getSetoffacts().add(sof); 
					}
				}
			}
		}	
		return obj;
	}
	
	private LearningPath getCorrespondingPath(LearningDomain paths, String pathID) {
		for (LearningPath path : paths.getLearningpaths()) {
			if(path.getID().equals(pathID)) {
				return path;
			}
		}
		return new LearningPathImpl();
	}
}
