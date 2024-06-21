package managers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.ATask;
import generator.Classroom;
import generator.Classrooms;
import generator.CompletionCriteria;
import generator.DynamicMultipleChoice;
import generator.EHistoryTarget;
import generator.ELegendTarget;
import generator.EModality;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.ETimeTarget;
import generator.EnterResponse;
import generator.GeneratorPackage;
import generator.GeographyMembership;
import generator.HGLevel;
import generator.HistoricalChronology;
import generator.HistoricalEventAssociation;
import generator.HistoryIdentification;
import generator.IdentificationTask;
import generator.Knowledge;
import generator.LearnerPlayer;
import generator.LearningDomain;
import generator.LearningPath;
import generator.LegendAMap;
import generator.Level;
import generator.LocateOnAMap;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTRecontruction;
import generator.MultipleChoice;
import generator.Objective;
import generator.Prerequisite;
import generator.ResponseModality;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.ATaskImpl;
import generator.impl.CompletionCriteriaImpl;
import generator.impl.DynamicMultipleChoiceImpl;
import generator.impl.EnterResponseImpl;
import generator.impl.GeographyMembershipImpl;
import generator.impl.HGLevelImpl;
import generator.impl.HistoricalChronologyImpl;
import generator.impl.HistoricalEventAssociationImpl;
import generator.impl.HistoryIdentificationImpl;
import generator.impl.IdentificationTaskImpl;
import generator.impl.LearningPathImpl;
import generator.impl.LegendAMapImpl;
import generator.impl.LocateOnAMapImpl;
import generator.impl.MTCompletion1Impl;
import generator.impl.MTCompletion2Impl;
import generator.impl.MTIdentificationImpl;
import generator.impl.MTLevelImpl;
import generator.impl.MTMembershipImpl;
import generator.impl.MTRecontructionImpl;
import generator.impl.MultipleChoiceImpl;
import generator.impl.ObjectiveImpl;
import generator.impl.PrerequisiteImpl;
import generator.impl.SetOfFactsImpl;
import generators.ALGAGenerator;
import structures.DidacticDomain;

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
		if (modelsManager == null)
			return path;
		return modelsManager.getLearnerPlayer().getLearningpath();
	}

	@SuppressWarnings("unchecked")
	public JSONObject buildJSONObjectiveLevel(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID()); // TODO: define a default paths for this version
		json.put("objective", path.getObjectives().get(0).getID()); // TODO: define default objective
		json.put("level", path.getObjectives().get(0).getLevels().get(0).getID()); // TODO: define default level

		JSONObject setupParameters = new JSONObject();
		setupParameters.put("buildingParameters", initialiseJSONBuildParameters(path.getObjectives().get(0),
				(MTLevel) path.getObjectives().get(0).getLevels().get(0)));
		setupParameters.put("tasksParameters",
				initialiseJSONTaskParameters((MTLevel) path.getObjectives().get(0).getLevels().get(0)));

		json.put("setupParameters", setupParameters);
		return json;
	}

	@SuppressWarnings("unchecked")
	public JSONObject buildJSONTrainingPath(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID());
		JSONArray objectives = new JSONArray();
		for (Objective objective : path.getObjectives()) {
			JSONObject jobjective = new JSONObject();
			jobjective.put("objective", objective.getID());
			jobjective.put("name", objective.getName());
			jobjective.put("prerequisites", initialiseJSONPrerequisites(path, objective));
			JSONArray levels = new JSONArray();
			for (Level level : objective.getLevels()) {
				JSONObject jlevel = new JSONObject();
				jlevel.put("level", level.getID());
				JSONObject setupParameters = new JSONObject();
				setupParameters.put("buildingParameters", initialiseJSONBuildParameters(objective, (MTLevel) level));
				setupParameters.put("tasksParameters", initialiseJSONTaskParameters((MTLevel) level));
				setupParameters.put("achievementParameters",
						initialiseJSONCompletionCriteria(level.getCompletionCriteria()));
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
		for (ATask task : level.getTasks()) {
			tasksParameters.add(initialiseJSONTask(task));
		}
		return tasksParameters;
	}

	@SuppressWarnings("unchecked")
	private JSONObject initialiseJSONTask(ATask task) {
		JSONObject obj = new JSONObject();
		if (task instanceof MTCompletion1Impl) {
			JSONArray targets = new JSONArray();
			for (ESingleTarget target : ((MTCompletion1Impl) task).getTargets()) {
				targets.add(target.getName());
			}
			obj.put("targets", targets);
			if (((MTCompletion1Impl) task).getResponseModality() instanceof DynamicMultipleChoice) {
				obj.put("answerModality", "CHOICE");
				obj.put("nbCorrectChoices", 1);
				obj.put("nbIncorrectChoices",
						((DynamicMultipleChoice) ((MTCompletion1Impl) task).getResponseModality()).getNbBadChoices());
				obj.put("taskType", "C1");
			} else {
				obj.put("answerModality", "INPUT");
				obj.put("taskType", "C1");
			}
		} else if (task instanceof MTCompletion2Impl) {
			JSONArray targets = new JSONArray();
			for (ESeveralTarget target : ((MTCompletion2Impl) task).getTargets()) {
				targets.add(target.getName());
			}
			obj.put("targets", targets);
			obj.put("answerModality", "CHOICE");
			obj.put("nbCorrectChoices", 2);
			obj.put("nbIncorrectChoices",
					((DynamicMultipleChoice) ((MTCompletion2Impl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "C2");
		} else if (task instanceof MTRecontructionImpl) {
			obj.put("nbCorrectChoices", 3);
			obj.put("nbIncorrectChoices",
					((DynamicMultipleChoice) ((MTRecontructionImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "REC");
		} else if (task instanceof MTIdentificationImpl) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("sourceVariation", ((MTIdentificationImpl) task).getTarget().getName());
			obj.put("taskType", "ID");
		} else if (task instanceof MTMembershipImpl) {
			obj.put("nbCorrectChoices",
					((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbChoices()
							- ((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("nbIncorrectChoices",
					((MultipleChoice) ((MTMembershipImpl) task).getResponseModality()).getNbBadChoices());
			obj.put("taskType", "MEMB");
			obj.put("target", ((MTMembershipImpl) task).isIdentifySharedProperty() ? "CORRECT" : "INCORRECT");
		} else if (task instanceof HistoryIdentification) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("taskType", "IDENT");

			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		} else if (task instanceof GeographyMembership) {
			obj.put("taskType", "IDENTSET");
			obj.put("nbChoices", ((GeographyMembership) task).getNbExpectedAnswers());
			obj.put("identifySharedProperty", ((GeographyMembership) task).isIdentifySharedProperty());

			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		} else if (task instanceof HistoricalChronology) {
			obj.put("taskType", "ORDO");
			obj.put("nbFacts", task.getNbFacts());
			obj.put("mixDatePeriod", ((HistoricalChronology) task).isMixDatePeriod());

			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		} else if (task instanceof LocateOnAMap) {
			LocateOnAMap realTask = (LocateOnAMap) task;
			obj.put("taskType", "LOCATE");
			// obj.put("ID", realTask.getID());
			obj.put("nbExpectedAnswers", realTask.getNbExpectedAnswers());
			obj.put("identifySharedProperty", realTask.isIdentifySharedProperty());

			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		}
		if (task instanceof LegendAMap) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("taskType", "LEGEND");
			obj.put("missing", ((LegendAMap) task).getMissing().getValue());

			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		} else if (task instanceof HistoricalEventAssociation) {
			obj.put("nbFacts", task.getNbFacts());
			obj.put("taskType", "ASSOC");
			obj.put("missing", ((HistoricalEventAssociation) task).getMissing().getValue());
			obj.put("source", ((HistoricalEventAssociation) task).getSource().getValue());
			obj.put("target", ((HistoricalEventAssociation) task).getTarget().getValue());
			// Answer modality
			ResponseModality modality = task.getResponseModality();
			if (modality instanceof EnterResponse) {
				obj.put("answerModality", "INPUT");
			} else {
				obj.put("answerModality", "CHOICE");
				if (modality instanceof DynamicMultipleChoice) {
					if(((DynamicMultipleChoice)modality).getType().equals(EModality.INPUT)) {
						obj.put("answerModality", "INPUT");
					}
					obj.put("nbBadChoices", ((DynamicMultipleChoice) modality).getNbBadChoices());
				}
				if (modality instanceof MultipleChoice) {
					obj.put("nbChoices", ((MultipleChoice) modality).getNbChoices());
				}
			}
		}
		obj.put("maxTime", task.getMaxTime());
		obj.put("successiveSuccessesToReach", task.getNbConsecutiveSuccess());
		obj.put("repartitionPercent", task.getPercentOfApparition());
		return obj;
	}

	@SuppressWarnings("unchecked")
	private JSONObject initialiseJSONBuildParameters(Objective objective, MTLevel level) {

		JSONObject buildingParameters = new JSONObject();
		JSONArray tables = new JSONArray();
		for (SetOfFacts set : objective.getSetoffacts()) {
			if (!tables.contains(set.getName())) {
				tables.add(set.getName());
			}
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

		for (Prerequisite prerequisite : objective.getPrerequisites()) {
			JSONObject jprerequisite = new JSONObject();
			Objective requiredObjective = getObjectiveOf(path, prerequisite.getRequiredLevel());
			if (requiredObjective == null) {
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
		for (Objective objective : path.getObjectives()) {
			for (Level olevel : objective.getLevels()) {
				if (olevel.getID().equals(level.getID())) {
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

	public void updateOrCreateTrainingPath(JSONObject json)
			throws NonExistantLearnerPlayerException, ContextNotFoundException { // TODO : works for this version might
																					// not work for future version
		if (path == null) {
			path = new LearningPathImpl();
		}
		Knowledge knowledge = loadKnowledge();
		if (path.getID() == null) {
			path.setID((String) json.get("learningPathID"));
			path.setKnowledge(knowledge);
			path.setName((String) json.get("learningPathID"));
		}
		Objective obj = getCorrespondingObjective(knowledge, json);
		Level level = createLevel(obj, (String) json.get("level"));
		buildLevelTasks(obj, level, json);
		if (!path.getObjectives().contains(obj)) {
			path.getObjectives().add(obj);
		}
		if (!domain.getLearningpaths().contains(path)) {
			domain.getLearningpaths().add(path);
		}
		// saveDomainModel();
		Constant.saveDomainModel(domain);

		// update progress for learner having this path
		resetEveryLearnerProgress(DidacticDomain.MATHEMATICS);
	}

	public void createTrainingPath(JSONObject json)
			throws NonExistantLearnerPlayerException, ContextNotFoundException, LearningPathIDisNull {
		if (((String) json.get("learningPathID")) == null) {
			throw new LearningPathIDisNull();
		}
		path = new LearningPathImpl();
		Knowledge knowledge = loadKnowledge();

		path.setID((String) json.get("learningPathID"));
		path.setName((String) json.get("learningPathID")); // TODO: improve ?
		path.setKnowledge(knowledge);

		HashMap<Objective, JSONArray> obj_prerequisite = new HashMap<>();
		JSONArray objectives = (JSONArray) json.get("objectives");
		for (Object oobjective : objectives) {
			JSONObject jobjective = (JSONObject) oobjective;
			Objective objective = new ObjectiveImpl();
			objective.setID((String) jobjective.get("objective"));
			objective.setName((String) jobjective.get("name"));
			JSONArray levels = (JSONArray) jobjective.get("levels");
			for (Object olevel : levels) {
				JSONObject jlevel = (JSONObject) olevel;
				Level level = new MTLevelImpl();
				level.setID((String) jlevel.get("level"));
				buildLevelTasks(objective, level, jlevel);
				objective.getLevels().add(level);
			}
			obj_prerequisite.put(objective, (JSONArray) jobjective.get("prerequisites"));
			// path.getObjectives().add(objective);
		}

		for (Objective objective : obj_prerequisite.keySet()) {
			for (Object prerequis : obj_prerequisite.get(objective)) {
				JSONObject jprerequis = (JSONObject) prerequis;
				Prerequisite requisite = new PrerequisiteImpl();
				Level requiredLevel = getLevelOfPath(new ArrayList<>(obj_prerequisite.keySet()),
						(String) jprerequis.get("requiredObjective"), (String) jprerequis.get("requiredLevel"));
				if (requiredLevel == null) {
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

		if (!domain.getLearningpaths().contains(path)) {
			domain.getLearningpaths().add(path);
		}

		LearnerPlayer learner = getLearnerPlayer((String) json.get("learnerID"));
		learner.setLearningpath(path);
		Constant.saveLearnerModel(learner);

		// saveDomainModel();
		Constant.saveDomainModel(domain);
		// update progress for learner having this path
		// resetEveryLearnerProgress();
	}

	private LearnerPlayer getLearnerPlayer(String learnerID) {
		Classrooms classrooms = Constant.loadClassrooms();
		for (Classroom classroom : classrooms.getClassrooms()) {
			for (LearnerPlayer learner : classroom.getLearnerPlayers()) {
				if (learner.getID() == null) {
					classroom.getLearnerPlayers().remove(learner);
					Constant.saveClassroomsModel(classrooms);
				}
				if (learner.getID().equals(learnerID)) {
					return learner;
				}
			}
		}
		return null;
	}

	private Level getLevelOfPath(List<Objective> objectives, String objectiveID, String levelID) {
		System.out.println("Pre-requisite to add : " + objectiveID + " " + levelID);
		for (Objective objective : objectives) {
			if (objective.getID().equals(objectiveID)) {
				for (Level level : objective.getLevels()) {
					if (level.getID().equals(levelID)) {
						return level;
					}
				}
			}
		}
		return null;
	}

private void resetEveryLearnerProgress(DidacticDomain domain) throws NonExistantLearnerPlayerException, ContextNotFoundException {
	System.out.println("RESET");
	Classrooms classrooms = Constant.loadClassrooms();
	LearnerPlayerManager manager;
	for (Classroom classroom : classrooms.getClassrooms()) {
		for (LearnerPlayer LP : classroom.getLearnerPlayers()) {
			if (LP.getLearningpath().getID().equals(path.getID())) {
				manager = new LearnerPlayerManager(new ModelsManager(domain,
						Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH,
						Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, LP.getID(), Constant.CLASSROOMS_FILE,
						classroom.getID(), true));
				manager.resetLearnerProgress(manager);
			}

		}
	}
}

	private List<JSONObject> getJSONTasks(JSONObject json) {
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

	@SuppressWarnings("unchecked")
	private void buildLevelTasks(Objective obj, Level level, JSONObject json) {
		JSONObject buildingParams = getJSONBuildSetup(json);

		String jsonElem = (String) buildingParams.get("leftOperand");
		TableBuild build = TableBuild.valueOf(jsonElem);
		// jsonElem.equals("TABLE")? TableBuild.TABLE_OPERAND:
		// jsonElem.equals("OPERAND")? TableBuild.OPERAND_TABLE: TableBuild.MIX;
		jsonElem = (String) buildingParams.get("resultLocation");
		ResultPosition resPosition = ResultPosition.valueOf(jsonElem);

		if (buildingParams.containsKey("tables")) {
			Knowledge knowledge = loadKnowledge();
			for (String table : (List<String>) buildingParams.get("tables")) {
				for (SetOfFacts sof : knowledge.getKnowledgefacts()) {
					if (Integer.parseInt(sof.getName()) == Integer.parseInt(table)) {
						obj.getSetoffacts().add(sof);
					}
				}
			}
		}

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

	private void createLevelTasks(MTLevel level, List<JSONObject> jsonTasks) {
		int idNbTask = 1;
		String idTask;
		for (JSONObject jtask : jsonTasks) {
			idTask = level.getID() + "-T" + idNbTask;
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

		task.setMaxTime((int) (long) jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));

		List<ESingleTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget;
			targets.add(ESingleTarget.valueOf(starget));
		}
		task.getTargets().addAll(targets);

		if (((String) jtask.get("answerModality")).equals("CHOICE")) {
			DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
			// modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long)
			// jtask.get("nbIncorrectChoices"));
			modality.setNbBadChoices((int) (long) jtask.get("nbIncorrectChoices"));
			task.setResponseModality(modality);
		} else {
			task.setResponseModality(new EnterResponseImpl());
		}

		return task;
	}

	private ATask createC2Task(JSONObject jtask, String taskID) {
		MTCompletion2 task = new MTCompletion2Impl();
		task.setID(taskID);

		task.setMaxTime((int) (long) jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));

		List<ESeveralTarget> targets = new ArrayList<>();
		for (Object jtarget : (JSONArray) jtask.get("targets")) {
			String starget = (String) jtarget;
			targets.add(ESeveralTarget.valueOf(starget));
		}
		task.getTargets().addAll(targets);

		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		// modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long)
		// jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int) (long) jtask.get("nbIncorrectChoices"));
		task.setResponseModality(modality);

		return task;
	}

	private ATask createRECTask(JSONObject jtask, String taskID) {
		MTRecontruction task = new MTRecontructionImpl();
		task.setID(taskID);

		task.setMaxTime((int) (long) jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));

		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		// modality.setNbChoices((int)(long) jtask.get("nbCorrectChoices") + (int)(long)
		// jtask.get("nbIncorrectChoices"));
		modality.setNbBadChoices((int) (long) jtask.get("nbIncorrectChoices"));
		task.setResponseModality(modality);

		return task;
	}

	private ATask createIDTask(JSONObject jtask, String taskID) {
		MTIdentification task = new MTIdentificationImpl();
		task.setID(taskID);

		task.setMaxTime((int) (long) jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));

		task.setNbFacts((int) (long) jtask.get("nbFacts"));
		task.setTarget(ESingleTarget.valueOf((String) jtask.get("sourceVariation")));

		DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
		// modality.setNbChoices(2);
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

		if (((String) jtask.get("target")).equals("CORRECT")) {
			task.setIdentifySharedProperty(true);
		} else {
			task.setIdentifySharedProperty(false);
		}

		MultipleChoice modality = new MultipleChoiceImpl();
		modality.setNbChoices(((Long) jtask.get("nbCorrectChoices")).intValue()
				+ ((Long) jtask.get("nbIncorrectChoices")).intValue());
		modality.setNbBadChoices(((Long) jtask.get("nbIncorrectChoices")).intValue());
		task.setResponseModality(modality);

		return task;
	}

	private Level createLevel(Objective obj, String levelID) {
		Level level = new MTLevelImpl();
		if (levelID.isEmpty()) {
			level.setID(levelID);
		} else {
			level.setID(obj.getID() + "-L" + (obj.getLevels().size() + 1));
		}
		return level;
	}

	@SuppressWarnings("unchecked")
	private Objective getCorrespondingObjective(Knowledge knowledge, JSONObject json) {
		Objective obj = new ObjectiveImpl();
		String objID = (String) json.get("objective");
		if (objID.isEmpty()) {
			int nbObjs = path.getObjectives().size() + 1;
			obj.setID(path.getID() + "-O" + nbObjs);
			obj.setName(obj.getID());
		} else {
			obj.setID(objID);
			obj.setName(objID);
			removeObjectiveFromPath(objID);
		}
		for (String table : (List<String>) getJSONBuildSetup(json).get("tables")) {
			for (SetOfFacts sof : knowledge.getKnowledgefacts()) {
				if (Integer.parseInt(sof.getName()) == Integer.parseInt(table)) {
					obj.getSetoffacts().add(sof);
				}
			}
		}
		return obj;
	}

	private void removeObjectiveFromPath(String objectiveID) {
		for (Objective obj : new ArrayList<>(path.getObjectives())) {
			if (obj.getID().equals(objectiveID)) {
				path.getObjectives().remove(obj);
			}
		}
	}

	public LearningPath getCorrespondingPath(LearningDomain paths, String pathID) {
		for (LearningPath path : paths.getLearningpaths()) {
			if (path.getID().equals(pathID)) {
				return path;
			}
		}
		return new LearningPathImpl();
	}

	private void getPath(String pathID) {
		loadPaths();
		for (LearningPath path : new ArrayList<>(domain.getLearningpaths())) {
			if (path.getID() == null) {
				ALGAGenerator.LOGGER.severe("A LearningPath had a null ID!");
				domain.getLearningpaths().remove(path);
				Constant.saveDomainModel(domain);
			}
			if (path.getID().equals(pathID)) {
				this.path = path;
				domain.getLearningpaths().remove(path);
				// saveDomainModel();

				Constant.saveDomainModel(domain);
			}
		}
	}

	/*
	 * private void saveDomainModel() { Resource.Factory.Registry registry =
	 * Resource.Factory.Registry.INSTANCE; Map<String, Object> map =
	 * registry.getExtensionToFactoryMap(); XMIResourceFactoryImpl toSave = new
	 * XMIResourceFactoryImpl(); map.put("xmi", toSave);
	 * map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
	 * 
	 * Resource resource =
	 * resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH +
	 * Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE));
	 * resource.getContents().add(domain); try { resource.save(map); }catch
	 * (IOException e) { ALGAGenerator.LOGGER.severe("Error while saving : "
	 * +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE);
	 * e.printStackTrace(); }
	 * 
	 * ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH +
	 * Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE + "' file : OK"); }
	 */

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
		} catch (IOException e) {
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet);
		return (Knowledge) resource.getContents().get(0);
	}

	// HG

	//GET LEARNING PATH
	@SuppressWarnings("unchecked")
	public JSONObject buildJSONHGObjectiveLevel(LearningPath path) {
		JSONObject json = new JSONObject();
		json.put("learningPathID", path.getID());
		JSONArray objectives = new JSONArray();
		for (Objective objective : path.getObjectives()) {
			JSONObject jobjective = new JSONObject();
			jobjective.put("id", objective.getID());
			jobjective.put("name", objective.getName());
			jobjective.put("domains", objective.getSetoffacts().
					stream().map((sof) -> sof.getName()).
					collect(Collectors.toList())); //Fetch objective set of facts
			JSONArray levels = new JSONArray();
			for (Level level : objective.getLevels()) {
				JSONObject jlevel = new JSONObject();
				jlevel.put("id", level.getID());
				jlevel.put("tasksParameters", initialiseJSONTaskParameters4HG((HGLevel) level));
				levels.add(jlevel);
			}
			jobjective.put("levels", levels);
			objectives.add(jobjective);
		}
		json.put("objectives", objectives);

		return json;

	}

	//GET LEARNING PATH - TASKS
	@SuppressWarnings("unchecked")
	private JSONArray initialiseJSONTaskParameters4HG(HGLevel level) {
		JSONArray tasksParameters = new JSONArray();
		for (ATask task : level.getTasks()) {
			tasksParameters.add(initialiseJSONTask(task));
		}
		return tasksParameters;
	}

	//SAVE LEARNING PATH
	public void updateHGTrainingPath(JSONObject json) throws NonExistantLearnerPlayerException, ContextNotFoundException, LearningPathIDisNull { 
		if (((String) json.get("learningPathID")) == null) {
			throw new LearningPathIDisNull();
		}
		path = new LearningPathImpl();
		Knowledge knowledge = loadKnowledge();
		List<SetOfFacts> HGFacts = knowledge.getKnowledgefacts();
		

		path.setID((String) json.get("learningPathID"));
		path.setName((String) json.get("learningPathID"));
		path.setKnowledge(knowledge);

		HashMap<Objective, JSONArray> obj_prerequisite = new HashMap<>();
		JSONArray objectives = (JSONArray) json.get("objectives");
		for (Object oobjective : objectives) {
			JSONObject jobjective = (JSONObject) oobjective;
			Objective objective = new ObjectiveImpl();
			List<SetOfFacts> sofList = objective.getSetoffacts();
			
			objective.setID((String) jobjective.get("id"));
			objective.setName((String) jobjective.get("name"));
			
			JSONArray levels = (JSONArray) jobjective.get("levels");
			List<String> domains = (List<String>) jobjective.get("domains");
			
			if(domains != null) {
				HGFacts.stream() //Save sets of facts if not null
				.filter((sof) -> domains.contains(sof.getName()))
				.forEach((sofToSave) -> sofList.add(sofToSave));
			}
			
			for (Object olevel : levels) {
				JSONObject jlevel = (JSONObject) olevel;
				Level level = new HGLevelImpl();
				level.setID((String) jlevel.get("id"));
				buildLevelTasksHG(objective, level, jlevel);
				objective.getLevels().add(level);
			}
			path.getObjectives().add(objective);
		}
		
		if (!domain.getLearningpaths().contains(path)) {
			domain.getLearningpaths().add(path);
		}

		LearnerPlayer learner = getLearnerPlayer((String) json.get("learnerID"));
		learner.setLearningpath(path);
		System.out.println(buildJSONHGObjectiveLevel(learner.getLearningpath()) + " FIN");
		Constant.saveLearnerModel(learner);
		// saveDomainModel();
		Constant.saveDomainModel(domain);
		// update progress for learner having this path
		resetEveryLearnerProgress(DidacticDomain.HISTORY_GEOGRAPHY);
	}
	
	//SAVE LEARNING PATH - TASKS BUILD
	@SuppressWarnings("unchecked")
	private void buildLevelTasksHG(Objective obj, Level level, JSONObject json) {
		//JSONObject buildingParams = getJSONBuildSetup(json);

		//JSONObject achievementParam = (JSONObject) json.get("achievementParameters");
		CompletionCriteria criteria = new CompletionCriteriaImpl();
		criteria.setEncountersPercent(50);
		criteria.setSuccessPercent(50);
		((HGLevel) level).setCompletionCriteria(criteria);

		createLevelTasksHG(((HGLevel) level), (List<JSONObject>)json.get("tasksParameters"));
		obj.getLevels().add(((HGLevel) level));
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - EACH TASK HANDLER
	private void createLevelTasksHG(HGLevel level, List<JSONObject> jsonTasks) {
		int idNbTask = 1;
		String idTask;
		for (JSONObject jtask : jsonTasks) {
			idTask = level.getID() + "-T" + idNbTask;
			switch ((String) jtask.get("taskType")) {
			case "ASSOC":
				level.getTasks().add(createASSOCTask(jtask, idTask));
				break;
			case "LOCATE":
				level.getTasks().add(createLOCATETask(jtask, idTask));
				break;
			case "ORDO":
				level.getTasks().add(createORDOTask(jtask, idTask));
				break;
			case "LEGEND":
				level.getTasks().add(createLEGENDTask(jtask, idTask));
				break;
			case "IDENT":
				level.getTasks().add(createIDENTTask(jtask, idTask));
				break;
			case "IDENTSET":
				level.getTasks().add(createIDENTSETTask(jtask, idTask));
				break;
			default:
				break;
			}
			idNbTask++;
		}
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - ASSOC TASK HANDLER
	private ATask createASSOCTask(JSONObject jtask, String taskID) {
		HistoricalEventAssociationImpl task = new HistoricalEventAssociationImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		task.setMissing(EHistoryTarget.get((int)(long)jtask.get("missing")));
		task.setSource(EHistoryTarget.get((int)(long)jtask.get("source")));
		task.setTarget(ETimeTarget.get((int)(long)jtask.get("target")));

		return task;
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - LOCATE TASK HANDLER
	private ATask createLOCATETask(JSONObject jtask, String taskID) {
		LocateOnAMap task = new LocateOnAMapImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		task.setNbExpectedAnswers((int)(long)jtask.get("nbExpectedAnswers"));

		return task;
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - ORDO TASK HANDLER
	private ATask createORDOTask(JSONObject jtask, String taskID) {
		HistoricalChronology task = new HistoricalChronologyImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		task.setMixDatePeriod((boolean)jtask.get("mixDatePeriod"));
		
		return task;
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - LEGEND TASK HANDLER
	private ATask createLEGENDTask(JSONObject jtask, String taskID) {
		LegendAMap task = new LegendAMapImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		task.setMissing(ELegendTarget.get((int)(long)jtask.get("missing")));
		
		return task;
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - IDENT TASK HANDLER
	private ATask createIDENTTask(JSONObject jtask, String taskID) {
		HistoryIdentification task = new HistoryIdentificationImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		

		return task;
	}
	
	//SAVE LEARNING PATH - TASKS BUILD - IDENTSET TASK HANDLER
	private ATask createIDENTSETTask(JSONObject jtask, String taskID) {
		GeographyMembership task = new GeographyMembershipImpl();
		setGeneralTaskValuesHG(task, jtask, taskID);
		
		return task;
	}
	
	
	//SAVE LEARNING PATH - TASKS BUILD - SET GLOBAL TASK VALUES
	private void setGeneralTaskValuesHG(ATask task, JSONObject jtask, String taskID) {
		task.setID(taskID);

		task.setMaxTime((int) (long) jtask.get("maxTime"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));
		
		System.out.println(jtask.toJSONString());
		long nbFacts = jtask.get("nbFacts") != null ? (long)jtask.get("nbFacts") : 1;
		task.setNbFacts((int)nbFacts);

		System.out.println(nbFacts + " ?? ALLEZZ " + task.getNbFacts());
		//ANSWER MODALITY V2
		EModality answerModalityType = EModality.get((int)(long)jtask.get("answerModality"));
		ResponseModality modality;
		if(answerModalityType == EModality.CHOICE) {
			if(task instanceof GeographyMembershipImpl) {
				modality = new MultipleChoiceImpl();
				
				int nbChoices = jtask.get("nbChoices") != null ? (int) (long) jtask.get("nbChoices") : 2;
				((MultipleChoice) modality).setNbChoices(nbChoices);
				
				int nbBadChoices = jtask.get("nbBadChoices") != null ? (int) (long) jtask.get("nbBadChoices") : 4;
				((MultipleChoice) modality).setNbBadChoices(nbBadChoices);
				
				((MultipleChoice) modality).setType(answerModalityType);
			}else {
				modality = new DynamicMultipleChoiceImpl();
				((DynamicMultipleChoice) modality).setType(EModality.get((int)(long)jtask.get("answerModality")));
				
				int nbBadChoices = jtask.get("nbBadChoices") != null ? (int) (long) jtask.get("nbBadChoices") : 0;
				((DynamicMultipleChoice) modality).setNbBadChoices(nbBadChoices);
				((DynamicMultipleChoice) modality).setType(answerModalityType);
			}
		}else {
			modality = new EnterResponseImpl();
		}
		
		//ANSWER MODALITY V1
		/*System.out.println(jtask.get("answerModality"));
		EModality answerModalityType = EModality.get((int)(long)jtask.get("answerModality"));
		ResponseModality modality;
		if(jtask.get("nbChoices") != null) {
			modality = new MultipleChoiceImpl();
			((MultipleChoice) modality).setNbChoices((int)(long)jtask.get("nbChoices"));
			((MultipleChoice) modality).setNbBadChoices((int) (long) jtask.get("nbBadChoices"));
			((MultipleChoice) modality).setType(answerModalityType);
		}else if(jtask.get("nbBadChoices") != null){
			modality = new DynamicMultipleChoiceImpl();
			((DynamicMultipleChoice) modality).setType(EModality.get((int)(long)jtask.get("answerModality")));
			((DynamicMultipleChoice) modality).setNbBadChoices((int) (long) jtask.get("nbBadChoices"));
			((DynamicMultipleChoice) modality).setType(answerModalityType);
		}else {
			modality = new EnterResponseImpl();
		}*/
		task.setResponseModality(modality);
	}
	
	
	/*SAMPLE CODE
	HistoricalEventAssociationImpl task = new HistoricalEventAssociationImpl();
		task.setID(taskID);

		task.setMaxTime((int) (long) jtask.get("timeMaxSecond"));
		task.setPercentOfApparition((int) (long) jtask.get("repartitionPercent"));
		task.setNbConsecutiveSuccess((int) (long) jtask.get("successiveSuccessesToReach"));

		if (((String) jtask.get("answerModality")).equals("CHOICE")) {
			DynamicMultipleChoice modality = new DynamicMultipleChoiceImpl();
			modality.setNbBadChoices((int) (long) jtask.get("nbIncorrectChoices"));
			task.setResponseModality(modality);
		} else {
			task.setResponseModality(new EnterResponseImpl());
		}
	*/
}
