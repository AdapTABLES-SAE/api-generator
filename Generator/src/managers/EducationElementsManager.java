package managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.ETaskType;
import generator.Level;
import generator.Objective;

public class EducationElementsManager {

	private CurrentObjectiveLevel chosenObjectiveLevel;
	/**
	 * Structure donnant pour chaque type de tache, le nombre de piece necessaires
	 */
	private EnumMap<ETaskType, Integer> nbRoomsToTaskType; 
	/*
	 * Attention un type de taches peut faire reference à plusieurs taches
	 * Donc il faudra faire attention pour l'association des faits
	 */
	
	private int nbRooms;
	private List<ETaskType> taskTypes;
	
	public EducationElementsManager(int nbRooms) {
		this.nbRooms = nbRooms;
	}

	public void setChosenObjectiveLevel(CurrentObjectiveLevel chosenObjectiveLevel) {
		this.chosenObjectiveLevel = chosenObjectiveLevel;
		defineNbRoomsToTask();
	}

	public Level getLevel() {
		return this.chosenObjectiveLevel.getLevel();
	}

	public Objective getObjective() {
		return this.chosenObjectiveLevel.getObjective();
	}
	
	public Map<ETaskType, Integer> getNbRoomsToTaskType() {
		return nbRoomsToTaskType;
	}

	public List<ATask> getTasks() {
		return chosenObjectiveLevel.getLevel().getTasks();
	}
	
	/**
	 * Fourni la liste des types de taches (avec doublons : une par salle du donjon) ordonée via une <heuristique>  
	 * @return
	 */
	public List<ETaskType> getOrderedTaskTypes(){
		List<ETaskType> taskTypes = new ArrayList<>(); 
		for (ETaskType eTaskType : nbRoomsToTaskType.keySet()) {
			for (int i = 0; i < nbRoomsToTaskType.get(eTaskType); i++) {
				taskTypes.add(eTaskType);
			}
		}
		Collections.shuffle(taskTypes);
		return taskTypes;
	}
	
	public List<ETaskType> getTaskTypes() {
		return taskTypes; 
	}

	private void defineNbRoomsToTask() {
		nbRoomsToTaskType = new EnumMap<>(ETaskType.class);
		if(chosenObjectiveLevel != null) {
			for (ATask task : getTasks()) {
				if(nbRoomsToTaskType.containsKey(task.getType())) {
					nbRoomsToTaskType.put(task.getType(), nbRoomsToTaskType.get(task.getType()) +
							(task.getPercentOfApparition()*nbRooms)/100);
				}else {
					nbRoomsToTaskType.put(task.getType(), (task.getPercentOfApparition()*nbRooms)/100);
				}
			}
		}
		this.taskTypes = new ArrayList<>(nbRoomsToTaskType.keySet());
	}
	
	@Override
	public String toString() {
		String s = "Objectif : " + getObjective().getName() + 
				"\nNiveau : " + getLevel().getID() + "\nSalles/Taches : \n";
		for (ETaskType tt : nbRoomsToTaskType.keySet()) {
			s += "\t"+ nbRoomsToTaskType.get(tt) + " room of type : " + tt + "\n";
		}
		return s;
	}
}
