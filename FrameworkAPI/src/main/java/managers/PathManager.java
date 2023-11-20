package managers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.ATask;
import generator.Classroom;
import generator.Classrooms;
import generator.CompletionCriteria;
import generator.DynamicMultipleChoice;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.GeneratorPackage;
import generator.Knowledge;
import generator.LearnerPlayer;
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
import generator.Prerequisite;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.CompletionCriteriaImpl;
import generator.impl.DynamicMultipleChoiceImpl;
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
import generator.impl.PrerequisiteImpl;
import generators.ALGAGenerator;

public class PathManager {

	private ModelsManager modelsManager;
	
	private LearningPath path;
	private LearningDomain domain;
	ResourceSet resourceSet;

	
	public PathManager(ModelsManager modelsManager) {
		this.modelsManager = modelsManager;
	}
	
	public PathManager(String pathID) {
		resourceSet = new ResourceSetImpl();
		getPath(pathID);
	}
	
	public LearningPath getLearningPath() {
		if(modelsManager == null) return path;
		return modelsManager.getLearnerPlayer().getLearningpath();
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject buildJSONObjectiveLevel(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID()); // TODO: define a default paths for this version 
		json.put("objective", path.getObjectives().get(0).getID()); // TODO: define default objective 
		json.put("level",  path.getObjectives().get(0).getLevels().get(0).getID()); // TODO: define default level 
	
		JSONObject setupParameters = new JSONObject();
		setupParameters.put("buildingParameters", initialiseJSONBuildParameters(path.getObjectives().get(0), (MTLevel) path.getObjectives().get(0).getLevels().get(0)));
		setupParameters.put("tasksParameters", initialiseJSONTaskParameters((MTLevel) path.getObjectives().get(0).getLevels().get(0)));
		
		json.put("setupParameters", setupParameters);
		return json;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject buildJSONTrainingPath(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID());
		JSONArray objectives = new JSONArray();
		for(Objective objective: path.getObjectives()) {
			JSONObject jobjective = new JSONObject();
			jobjective.put("objective", objective.getID()); // TODO : pre-requisite
			jobjective.put("prerequisites", initialiseJSONPrerequisites(path, objective));
			JSONArray levels = new JSONArray();
			for(Level level: objective.getLevels()) {
				JSONObject jlevel = new JSONObject();
				jlevel.put("level", level.getID());
				JSONObject setupParameters = new JSONObject();  
				setupParameters.put("buildingParameters", initialiseJSONBuildParameters(objective, (MTLevel) level));
				setupParameters.put("tasksParameters", initialiseJSONTaskParameters((MTLevel) level));
				setupParameters.put("achievementParameters", initialiseJSONCompletionCriteria(level.getCompletionCriteria()));
				jlevel.put("setupParameters", setupParameters);
				levels.add(jlevel);
			}
			jobjective.put("levels", levels);
			objectives.add(jobjective);
		}
		json.put("objectives", objectives);
		
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
			if(((MTCompletion1Impl) task).getResponseModality() instanceof DynamicMultipleChoice) {
				obj.put("answerModality", "CHOICE");
				obj.put("nbCorrectChoices", 1);
				obj.put("nbIncorrectChoices",  ((DynamicMultipleChoice) ((MTCompletion1Impl) task).getResponseModality()).getNbBadChoices());
				obj.put("taskType", "C1"); 
			} else {
				obj.put("answerModality", "INPUT");
				obj.put("taskType", "C1"); 
			}
		}
		if(task instanceof MTCompletion2Impl) {
			JSONArray targets = new JSONArray();
			for(ESeveralTarget target: ((MTCompletion2Impl) task).getTargets()) {
				targets.add(target.getName());
			}
			obj.put("targets", targets);
			obj.put("answerModality", "CHOICE");
			obj.put("nbCorrectChoices", 2);
			obj.put("nbIncorrectChoices",  ((DynamicMultipleChoice) ((MTCompletion2Impl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "C2"); 
		}
		if(task instanceof MTRecontructionImpl) {
			obj.put("nbCorrectChoices", 3);
			obj.put("nbIncorrectChoices",  ((DynamicMultipleChoice) ((MTRecontructionImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "REC"); 
		}
		if(task instanceof MTIdentificationImpl) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("sourceVariation", ((MTIdentificationImpl) task).getTarget().getName());
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
		buildingParameters.put("intervalMin", level.getMinInterval());
		buildingParameters.put("intervalMax", level.getMaxInterval()); 
		
		return buildingParameters;
	}
	
	@SuppressWarnings("unchecked")
	private JSONArray initialiseJSONPrerequisites(LearningPath path, Objective objective) {
		JSONArray prerequisites = new JSONArray();
		
		for(Prerequisite prerequisite: objective.getPrerequisites()) {
			JSONObject jprerequisite = new JSONObject();
			Objective requiredObjective = getObjectiveOf(path, prerequisite.getRequiredLevel());
			if(requiredObjective == null) {
				ALGAGenerator.LOGGER.severe("requiredObjective should not be null");
			} else {
				jprerequisite.put("requiredObjective", requiredObjective.getID());
				jprerequisite.put("requiredLevel", prerequisite.getRequiredLevel().getID());
				jprerequisite.put("successPercent", prerequisite.getSuccessPercent());
				jprerequisite.put("encountersPercent", prerequisite.getEncountersPercent());
				prerequisites.add(jprerequisite);
			}
		}
		return prerequisites;
	}
	
	private Objective getObjectiveOf(LearningPath path, Level level) {
		for(Objective objective: path.getObjectives()) {
			for(Level olevel: objective.getLevels()) {
				if(olevel.getID().equals(level.getID())) {
					return objective;
				}
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject initialiseJSONCompletionCriteria(CompletionCriteria criteria) {
		JSONObject completionCriteria = new JSONObject(); 
		completionCriteria.put("successCompletionCriteria", criteria.getSuccessPercent());
		completionCriteria.put("encounterCompletionCriteria", criteria.getEncountersPercent());
		return completionCriteria; 
	}
	
	public void updateOrCreateTrainingPath(JSONObject json) throws NonExistantLearnerPlayerException, ContextNotFoundException { // TODO : works for this version might not work for future version 
		if(path == null) { path = new LearningPathImpl(); } 
		Knowledge knowledge = loadKnowledge();
		if(path.getID() == null) {
			path.setID((String) json.get("learningPathID"));
			path.setKnowledge(knowledge);
			path.setName((String) json.get("learningPathID"));
		}
		Objective obj = getCorrespondingObjective(knowledge, json);
		Level level = createLevel(obj, (String) json.get("level")); 
		buildLevelTasks(obj, level, json);
		if(!path.getObjectives().contains(obj)) {
			path.getObjectives().add(obj);
		}
		if(!domain.getLearningpaths().contains(path)) {
			domain.getLearningpaths().add(path);
		}
		saveDomainModel();
		
		// update progress for learner having this path 
		resetEveryLearnerProgress();
	}
	
	
	public void createTrainingPath(JSONObject json) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		path = new LearningPathImpl();
		Knowledge knowledge = loadKnowledge();
		path.setID((String) json.get("learningPathID"));
		path.setName((String) json.get("learningPathID")); // TODO: improve ?
		path.setKnowledge(knowledge);
		
		HashMap<Objective, JSONArray> obj_prerequisite = new HashMap<>();
		
		JSONArray objectives = (JSONArray) json.get("objectives");
		for(Object oobjective: objectives) {
			JSONObject jobjective = (JSONObject) oobjective;
			Objective objective = new ObjectiveImpl();
			objective.setID((String) jobjective.get("objective"));
			JSONArray levels = (JSONArray) jobjective.get("levels");
			for(Object olevel: levels) {
				JSONObject jlevel = (JSONObject) olevel;
				Level level = new MTLevelImpl();
				level.setID((String) jlevel.get("level"));
				buildLevelTasks(objective, level, jlevel);
				objective.getLevels().add(level);
			}
			obj_prerequisite.put(objective, (JSONArray) jobjective.get("prerequisites"));
			//path.getObjectives().add(objective);
		}
		
		for(Objective objective: obj_prerequisite.keySet()) {
			for(Object prerequis: obj_prerequisite.get(objective)) {
				JSONObject jprerequis = (JSONObject) prerequis;
				Prerequisite requisite = new PrerequisiteImpl();
				Level requiredLevel = getLevelOfPath(new ArrayList<>(obj_prerequisite.keySet()), (String) jprerequis.get("requiredObjective"), (String) jprerequis.get("requiredLevel"));
				if(requiredLevel == null) {
					ALGAGenerator.LOGGER.severe("RequiredLevel should not be null!!!!!!!!");
				} else {
					requisite.setRequiredLevel(requiredLevel);
					requisite.setSuccessPercent((double) jprerequis.get("successPercent")); // successPercent
					requisite.setEncountersPercent((double) jprerequis.get("encountersPercent"));
					objective.getPrerequisites().add(requisite);
				}
			}
			
			path.getObjectives().add(objective);
		}
		
		if(!domain.getLearningpaths().contains(path)) {
			domain.getLearningpaths().add(path);
		}
		
		saveDomainModel();
		// update progress for learner having this path 
		resetEveryLearnerProgress();
	}
	
	private Level getLevelOfPath(List<Objective> objectives, String objectiveID, String levelID) {
		System.out.println("Pre-requisite to add : "+objectiveID+" "+levelID);
		for(Objective objective: objectives) {
			if(objective.getID().equals(objectiveID)) {
				for(Level level: objective.getLevels()) {
					if(level.getID().equals(levelID)) {
						return level;
					}
				}
			}
		}
		return null;
	}
	
	private void resetEveryLearnerProgress() throws NonExistantLearnerPlayerException, ContextNotFoundException {
		Classrooms classrooms = Constant.loadClassrooms(); 
		LearnerPlayerManager manager; 
		for(Classroom classroom : classrooms.getClassrooms()) {
			for(LearnerPlayer LP : classroom.getLearnerPlayers()) {
				if(LP.getLearningpath().getID().equals(path.getID())) {
					manager = new LearnerPlayerManager(new ModelsManager(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
							Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, LP.getID(),
							Constant.CLASSROOMS_FILE, classroom.getID(), true));
					manager.resetLearnerProgress(manager);
				}
				
			}
		}
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
	
	private void buildLevelTasks(Objective obj, Level level, JSONObject json) {
		JSONObject buildingParams = getJSONBuildSetup(json);
	
		String jsonElem = (String) buildingParams.get("leftOperand");
		TableBuild build = TableBuild.valueOf(jsonElem); 
		// jsonElem.equals("TABLE")? TableBuild.TABLE_OPERAND: jsonElem.equals("OPERAND")? TableBuild.OPERAND_TABLE: TableBuild.MIX;
		jsonElem = (String) buildingParams.get("resultLocation");
		ResultPosition resPosition = ResultPosition.valueOf(jsonElem);
		
		((MTLevel) level).setBuildSetup(build);
		((MTLevel) level).setResultPositionSetup(resPosition);
		((MTLevel) level).setMinInterval(((Long) buildingParams.get("intervalMin")).intValue());
		((MTLevel) level).setMaxInterval(((Long) buildingParams.get("intervalMax")).intValue());
		
		JSONObject achievementParam = getJSONAchievementParameters(json);
		CompletionCriteria criteria = new CompletionCriteriaImpl(); 
		criteria.setEncountersPercent((double) achievementParam.get("encounterCompletionCriteria"));
		criteria.setSuccessPercent((double) achievementParam.get("successCompletionCriteria"));
		((MTLevel) level).setCompletionCriteria(criteria);
		
		createLevelTasks(((MTLevel) level), getJSONTasks(json));
		
		obj.getLevels().add(((MTLevel) level));
	}
	
	private void createLevelTasks(MTLevel level, List<JSONObject> jsonTasks){
		int idNbTask = 1;
		String idTask;
		for (JSONObject jtask : jsonTasks) {
			idTask = level.getID()+"-T"+idNbTask;
			switch ((String) jtask.get("taskType")) {
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
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		List<ESingleTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget; 
			targets.add(ESingleTarget.valueOf(starget));
		}
		task.getTargets().addAll(targets);
		
		if(((String) jtask.get("answerModality")).equals("CHOICE")) {
			DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
			//modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
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
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		List<ESeveralTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget; 
			targets.add(ESeveralTarget.valueOf(starget));
		}
		task.getTargets().addAll(targets);
		
		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		//modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createRECTask(JSONObject jtask, String taskID) {
		MTRecontruction task = new MTRecontructionImpl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		//modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long) jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int)(long) jtask.get("nbIncorrectChoices"));	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createIDTask(JSONObject jtask, String taskID) {
		MTIdentification task = new MTIdentificationImpl();
		task.setID(taskID);
		
		task.setMaxTime((int)(long)jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int)(long)jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int)(long)jtask.get("successiveSuccessesToReach"));
		
		task.setNbFacts((int)(long) jtask.get("nbFacts"));
		task.setTarget(ESingleTarget.valueOf((String) jtask.get("sourceVariation")));
		
		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		//modality.setNbChoices(2);
		modality.setNbBadChoices(1);	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private ATask createMEMBTask(JSONObject jtask, String taskID) {
		MTMembership task = new MTMembershipImpl();
		task.setID(taskID);
		
		task.setMaxTime(((Long) jtask.get("timeMaxSecond")).intValue());
		task.setPercentOfApparition(((Long) jtask.get("repartitionPercent")).intValue());
		task.setNbConsecutiveSuccess(((Long) jtask.get("successiveSuccessesToReach")).intValue());
		
		if(((String) jtask.get("target")).equals("CORRECT")) {
			task.setIdentifySharedProperty(true);
		} else {
			task.setIdentifySharedProperty(false);
		}
				
		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices(((Long) jtask.get("nbCorrectChoices")).intValue() + ((Long) jtask.get("nbIncorrectChoices")).intValue());
		modality.setNbBadChoices(((Long) jtask.get("nbIncorrectChoices")).intValue());	
		task.setResponseModality(modality);
		
		return task;
	}
	
	private Level createLevel(Objective obj, String levelID) {
		Level level = new MTLevelImpl();
		if(levelID.isEmpty()) {
			level.setID(levelID);
		} else {
			level.setID(obj.getID()+"-L"+(obj.getLevels().size() + 1));
		}
		return level;
	}

	@SuppressWarnings("unchecked")
	private Objective getCorrespondingObjective(Knowledge knowledge, JSONObject json) {
		Objective obj = new ObjectiveImpl();
		String objID = (String) json.get("objective");
		if(objID.isEmpty()) {
			int nbObjs = path.getObjectives().size() + 1;
			obj.setID(path.getID()+"-O"+nbObjs);
			obj.setName(obj.getID());
		} else {
			obj.setID(objID);
			obj.setName(objID);
			removeObjectiveFromPath(objID);
		}
		for (String table :  (List<String>) getJSONBuildSetup(json).get("tables")) {
			for (SetOfFacts sof : knowledge.getKnowledgefacts()) {
				if(Integer.parseInt(sof.getName()) == Integer.parseInt(table)) {
					obj.getSetoffacts().add(sof); 
				}
			}
		}
		return obj;
	}
	
	private void removeObjectiveFromPath(String objectiveID) {
		for(Objective obj : new ArrayList<>(path.getObjectives())) {
			if(obj.getID().equals(objectiveID)) {
				path.getObjectives().remove(obj);
			}
		}
	}
	
	public LearningPath getCorrespondingPath(LearningDomain paths, String pathID) {
		for (LearningPath path : paths.getLearningpaths()) {
			if(path.getID().equals(pathID)) {
				return path;
			}
		}
		return new LearningPathImpl();
	}
	
	private void getPath(String pathID) {
		loadPaths();
		for(LearningPath path : new ArrayList<>(domain.getLearningpaths())) {
			if(path.getID().equals(pathID)) {
				this.path = path;
				domain.getLearningpaths().remove(path);
				saveDomainModel();
			}
		}
	}
	
	private void saveDomainModel() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE));
		resource.getContents().add(domain);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE + "' file : OK");
	}
	
	private void loadPaths() {
		GeneratorPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File learningPaths = new File(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE);
		Resource resource = resourceSet.createResource(URI.createFileURI(learningPaths.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		this.domain = (LearningDomain) resource.getContents().get(0);
	}
	
	private Knowledge loadKnowledge() {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File knowledge = new File(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.KNOWLEDGE_FILE);
		Resource resource = resourceSet.createResource(URI.createFileURI(knowledge.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		return (Knowledge) resource.getContents().get(0);
	}
}
