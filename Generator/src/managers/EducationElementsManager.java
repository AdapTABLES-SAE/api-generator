package managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.Level;
import generator.Objective;
import generator.ResultsByTask;

public class EducationElementsManager {

	private CurrentObjectiveLevel chosenObjectiveLevel;
	/**
	 * Structure donnant pour chaque type de tache, le nombre de piece necessaires
	 */
	private Map<ATask, Double> nbRoomsToTask; 
	
	private double nbRooms;
	
	public EducationElementsManager(int nbRooms) {
		this.nbRooms = nbRooms;
		this.nbRoomsToTask = new HashMap<>();
	}

	public void setChosenObjectiveLevel(CurrentObjectiveLevel chosenObjectiveLevel) {
		this.chosenObjectiveLevel = chosenObjectiveLevel;
	}

	public Level getLevel() {
		return this.chosenObjectiveLevel.getLevel();
	}

	public Objective getObjective() {
		return this.chosenObjectiveLevel.getObjective();
	}
	
	public Map<ATask, Double> getNbRoomsToTaskType() {
		return nbRoomsToTask;
	}

	public List<ATask> getTasks() {
		return chosenObjectiveLevel.getLevel().getTasks();
	}
	
	/**
	 * Fourni la liste des types de taches (avec doublons : une par salle du donjon) ordonée via une <heuristique>  
	 * @return
	 */
	public List<ATask> getOrderedTasks(){
		List<ATask> taskTypes = new ArrayList<>(); 
		for (ATask task : nbRoomsToTask.keySet()) {
			for (int i = 0; i < nbRoomsToTask.get(task); i++) {
				taskTypes.add(task);
			}
		}
		Collections.shuffle(taskTypes);
		return taskTypes;
	}
	
	public void addRoom2Task(ATask task, double coeffAdditional) {
		if(nbRoomsToTask.containsKey(task)) {
			nbRoomsToTask.put(task, nbRoomsToTask.get(task) +
					((task.getPercentOfApparition()*coeffAdditional)*nbRooms)/100);
		}else {
			nbRoomsToTask.put(task, ((task.getPercentOfApparition()*coeffAdditional)*nbRooms)/100);
		}
	}
	
	public double successPercentageByTask(ATask task) {
		if(this.chosenObjectiveLevel.getResults() != null) {
			for (ResultsByTask resBytask : this.chosenObjectiveLevel.getResults().getResultsbytask()) {
				if(resBytask.getTask().equals(task)) {
					return resBytask.getSucessPercent();
				}
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		String s = "Objectif : " + getObjective().getName() + 
				"\nNiveau : " + getLevel().getID() + "\nSalles/Taches : \n";
		for (ATask tt : nbRoomsToTask.keySet()) {
			s += "\t"+ nbRoomsToTask.get(tt) + " room of type : " + tt + "\n";
		}
		return s;
	}
}
