package api_code;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import generator.ATask;
import generator.CompletionCriteria;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.Knowledge;
import generator.LearningDomain;
import generator.LearningPath;
import generator.Level;
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
import generator.impl.CompletionCriteriaImpl;
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
import managers.ModelsManager;

public class PathManager {

	private ModelsManager modelsManager;
	
	public PathManager(ModelsManager modelsManager) {
		this.modelsManager = modelsManager;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject buildJSONTrainingPath(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID()); // TODO: define a default paths for this version 
		json.put("objective", path.getObjectives().get(0).getID()); // TODO: define default objective 
	
		JSONObject setupParameters = new JSONObject();
		setupParameters.put("buildingParameters", initialiseJSONBuildParameters(path.getObjectives().get(0), (MTLevel) path.getObjectives().get(0).getLevels().get(0)));
		setupParameters.put("tasksParameters", initialiseJSONTaskParameters((MTLevel) path.getObjectives().get(0).getLevels().get(0)));
		
		json.put("setupParameters", setupParameters);
		return json;
	}
	
	@SuppressWarnings("unchecked")
	private JSONArray initialiseJSONTaskParameters(MTLevel level) {
		JSONArray tasksParameters = new JSONArray();
		for(ATask task: level.getTasks()) {
			tasksParameters.add(initialiseJSONTask(task));
		}
		return tasksParameters; 
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject initialiseJSONTask(ATask task) {
		JSONObject obj = new JSONObject();
		if(task instanceof MTCompletion1Impl) {
			JSONArray targets = new JSONArray();
			for(ESingleTarget target: ((MTCompletion1Impl) task).getTargets()) {
				targets.add(target.getName());
			}
			obj.put("targets", targets);
			if(((MTCompletion1Impl) task).getResponseModality() instanceof MultipleChoice) {
				obj.put("answerModality", "CHOICE");
				obj.put("nbCorrectChoices", ((MultipleChoice) ((MTCompletion1Impl) task).getResponseModality()).getNbChoices() -
						 ((MultipleChoice) ((MTCompletion1Impl) task).getResponseModality()).getNbBadChoices());
				obj.put("nbIncorrectChoices",  ((MultipleChoice) ((MTCompletion1Impl) task).getResponseModality()).getNbBadChoices());
				obj.put("taskType", "C1"); 
			} else {
				obj.put("answerModality", "INPUT");

			}
		}
		if(task instanceof MTCompletion2Impl) {
			JSONArray targets = new JSONArray();
			for(ESeveralTarget target: ((MTCompletion2Impl) task).getTargets()) {
				targets.add(target.getName());
			}
			obj.put("targets", targets);
			obj.put("answerModality", "CHOICE");
			obj.put("nbCorrectChoices", ((MultipleChoice) ((MTCompletion2Impl) task).getResponseModality()).getNbChoices() -
					 ((MultipleChoice) ((MTCompletion2Impl) task).getResponseModality()).getNbBadChoices());
			obj.put("nbIncorrectChoices",  ((MultipleChoice) ((MTCompletion2Impl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "C2"); 
		}
		if(task instanceof MTRecontructionImpl) {
			obj.put("nbCorrectChoices", ((MultipleChoice) ((MTRecontructionImpl) task).getResponseModality()).getNbChoices() -
					 ((MultipleChoice) ((MTRecontructionImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("nbIncorrectChoices",  ((MultipleChoice) ((MTRecontructionImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "REC"); 
		}
		if(task instanceof MTIdentificationImpl) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("sourceVariation", ((MTIdentificationImpl) task).getTarget());
			obj.put("taskType", "ID");
		}
		if(task instanceof MTMembershipImpl) {
			obj.put("nbCorrectChoices", ((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbChoices() -
					 ((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("nbIncorrectChoices",  ((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "MEMB"); 
			obj.put("target", ((MTMembershipImpl) task).isIdentifySharedProperty()? "CORRECT": "INCORRECT");
		}
		obj.put("timeMaxSecond", task.getMaxTime());
		obj.put("successiveSuccessesToReach", task.getNbConsecutiveSuccess());
		obj.put("repartitionPercent", task.getPercentOfApparition());
	
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject initialiseJSONBuildParameters(Objective objective, MTLevel level) {
		
		JSONObject buildingParameters = new JSONObject(); 
		JSONArray tables = new JSONArray();
		for(SetOfFacts set: objective.getSetoffacts()) {
			tables.add(set.getName());
		}
		buildingParameters.put("tables", tables);
		buildingParameters.put("leftOperand", level.getBuildSetup().getName());
		buildingParameters.put("resultLocation", level.getResultPositionSetup().getName());
		buildingParameters.put("intervalMin", level.getMaxInterval());
		buildingParameters.put("intervalMax", level.getMinInterval()); 
		
		return buildingParameters;
	}
	
	public void updateOrCreateTrainingPath(JSONObject json) {
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
		MTLevel level = (MTLevel) getCorrespondingLevel(obj, (String) json.get("level"));
		addLevelToObjective(obj, level, json);
		if(!aPath.getObjectives().contains(obj)) {
			aPath.getObjectives().add(obj);
		}
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
	
	private JSONObject getJSONBuildSetup(JSONObject json) {
		JSONObject buildingParams = new JSONObject();
		buildingParams = (JSONObject) ((JSONObject) json.get("setupParameters")).get("buildingParameters");
		return buildingParams;
	}
	
	private JSONObject getJSONAchievementParameters(JSONObject json) {
		JSONObject buildingParams = new JSONObject();
		buildingParams = (JSONObject) ((JSONObject) json.get("setupParameters")).get("achievementParameters");
		return buildingParams;
	}
	
	private void addLevelToObjective(Objective obj, MTLevel level,  JSONObject json) {
		JSONObject buildingParams = getJSONBuildSetup(json);
		String levelName = obj.getID()+"-L"+(obj.getLevels().size() + 1);
		
		if(level != null) {
			obj.getLevels().remove(level);
		}
		level = new MTLevelImpl();
		level.setID(levelName);
		
		String jsonElem = (String) buildingParams.get("leftOperand");
		TableBuild build = jsonElem.equals("TABLE")? TableBuild.TABLE_OPERAND: jsonElem.equals("OPERAND")? TableBuild.OPERAND_TABLE: TableBuild.MIX;
		jsonElem = (String) buildingParams.get("resultLocation");
		ResultPosition resPosition = ResultPosition.valueOf(jsonElem);
		
		level.setBuildSetup(build);
		level.setResultPositionSetup(resPosition);
		level.setMinInterval((int) ((long) buildingParams.get("intervalMin")));
		level.setMaxInterval((int) ((long) buildingParams.get("maxInterval")));
		
		JSONObject achievementParam = getJSONAchievementParameters(json);
		CompletionCriteria criteria = new CompletionCriteriaImpl(); 
		criteria.setEncountersPercent((double) achievementParam.get("encounterCompletionCriteria"));
		criteria.setSuccesPercent((double) achievementParam.get("successCompletionCriteria"));
		level.setCompletionCriteria(criteria);
		System.out.println(level.getCompletionCriteria());
		
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
			/*if(starget.equals("FACTOR"))targets.add(ESingleTarget.OPERAND);
			else*/ 
				targets.add(ESingleTarget.valueOf(starget));
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
			/*if(starget.equals("OP_RES"))targets.add(ESeveralTarget.OPERAND_RESULT);
			if(starget.equals("TAB_RES")) targets.add(ESeveralTarget.TABLE_RESULT);
			else*/
			targets.add(ESeveralTarget.valueOf(starget));
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
	
	private Level getCorrespondingLevel(Objective obj, String levelID) {
		for(Level level: obj.getLevels()) {
			if(level.getID().equals(levelID)) {
				return level;
			}
		}
		return null;
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
			for (Long table :  (List<Long>) getJSONBuildSetup(json).get("tables")) {
				for (SetOfFacts sof : knowledge.getKnowledgefacts()) {
					if(Integer.parseInt(sof.getName()) == table) { // TODO : it's shit
						obj.getSetoffacts().add(sof); 
					}
				}
			}
		}	
		return obj;
	}
	
	public LearningPath getCorrespondingPath(LearningDomain paths, String pathID) {
		for (LearningPath path : paths.getLearningpaths()) {
			if(path.getID().equals(pathID)) {
				return path;
			}
		}
		return new LearningPathImpl();
	}
}
