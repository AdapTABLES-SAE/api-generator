package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import generator.CurrentObjectiveLevel;
import generator.LearningObjective;
import generator.Level;
import generator.Task;
import generator.TaskType;
import models.ModelAccess;
import structures.DataAccess;

/**
 * Cette classe permet de générer / choisir, l'objectif d'entrainement visée ainsi que le niveau de difficulté. 
 * @author Bérénice LEMOINE
 */
public class EducationalElementsGenerator {
	
	private ModelAccess modelAccess;
	private Random random;
	
	private CurrentObjectiveLevel chosenObjectiveLevel;
	private Map<TaskType, Integer> nbRoomsToTaskType;
	

	public EducationalElementsGenerator(ModelAccess modelAccess) {
		this.modelAccess = modelAccess;
		random = new Random();
		nbRoomsToTaskType = new HashMap<>();
	}
	
	public void generateObjectiveLevelRoomTasks() {
		selectObjectiveLevel();
		defineNbRoomsToTask();
		//printGeneration();
	}
	
	public Level getChosenLevel() {
		return chosenObjectiveLevel.getLevel();
	}
	
	public LearningObjective getChosenObjective() {
		return chosenObjectiveLevel.getLearningobjective();
	}
	
	private String taskTypeToString(TaskType tt) {
		return tt.getClass().getSimpleName() + tt.getResponsemodalities();
	}
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> notAchieved = new ArrayList<>();
		for (CurrentObjectiveLevel currentObjectiveLevel : modelAccess.context.getLearnerplayer().getProgression().getCurrentobjectivelevels()) {
			if(!currentObjectiveLevel.isAchieved()) {
				notAchieved.add(currentObjectiveLevel);
			}
		}
		chosenObjectiveLevel = notAchieved.get(random.nextInt(notAchieved.size()));
	}
	
	public List<TaskType> getListOfRoomTask() {
		List<TaskType> taskTypes = new ArrayList<>();
		for (TaskType taskType : nbRoomsToTaskType.keySet()) {
			if(!DataAccess.getCompatibleRoomTypeSize(taskType).contains("SMALL")) {
				for (int i = 0; i < nbRoomsToTaskType.get(taskType); i++) {
					taskTypes.add(taskType);
				}
			}
		}
		for (TaskType taskType : nbRoomsToTaskType.keySet()) {
			if(DataAccess.getCompatibleRoomTypeSize(taskType).contains("SMALL")) {
				for (int i = 0; i < nbRoomsToTaskType.get(taskType); i++) {
					taskTypes.add(taskType);
				}
			}
		}
		return taskTypes;
	} 
	
	
	private void defineNbRoomsToTask() {
		if(chosenObjectiveLevel != null) {
			int nbRooms = modelAccess.context.getGamecontext().getNumberOfRooms();
			for (Task task : chosenObjectiveLevel.getLevel().getTasks()) {
				nbRoomsToTaskType.put(task.getTasktype(), (task.getPercentageOfApparition()*nbRooms)/100);
			}
		}
	}
	
	public void printGeneration() {
		System.out.println("Objectif : "+chosenObjectiveLevel.getLearningobjective().getName()+" niveau : "+chosenObjectiveLevel.getLevel().getID());
		System.out.println("Salle / Taches : ");
		for (TaskType tt : nbRoomsToTaskType.keySet()) {
			System.out.println("\t"+ nbRoomsToTaskType.get(tt) + " room of type : " + taskTypeToString(tt));
		}
	}
	
}
