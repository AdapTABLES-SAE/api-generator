package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.LearnerPlayer;
import generator.LearningPath;
import generator.Level;
import generator.Objective;
import generator.Prerequisite;
import generator.impl.CurrentObjectiveLevelImpl;
import managers.EducationElementsManager;
import managers.ModelsManager;

/**
 * Cette classe permet de générer / choisir, l'objectif d'entrainement visée ainsi que le niveau de difficulté. 
 * @author Bérénice LEMOINE
 */
public class EducationalElementsGenerator {
	
	private Random random;
	
	private EducationElementsManager eeManager;
	private LearnerPlayer learnerPlayer;


	public EducationalElementsGenerator(ModelsManager modelAccess) {
		this.learnerPlayer = modelAccess.context.getLearnerplayer();
		random = new Random();
		eeManager = new EducationElementsManager(modelAccess.context.getGamecontext().getNumberOfRooms());
	}
	
	public EducationElementsManager generateEE() {
		selectObjectiveLevel();
		defineDungeonRoom2Task();
		printGeneration();
		return eeManager;
	}
	
	public Level getChosenLevel() {
		return eeManager.getLevel();
	}
	
	public Objective getChosenObjective() {
		return eeManager.getObjective();
	}
	
	/**
	 * Défini le nombre de salle du donjon pour chaque tâche
	 */
	private void defineDungeonRoom2Task() {
		if(eeManager.getObjective() != null && eeManager.getLevel() != null) {
			List<ATask> tasksAchieved = new ArrayList<>();
			for (ATask task : eeManager.getTasks()) {
				if(eeManager.successPercentageByTask(task) == 100 && 
						eeManager.encounterPercentageByTask(task) == 100) {
					tasksAchieved.add(task);
				}
			}
			
			double somme = 0; 
			for (ATask task : eeManager.getTasks()) {
				if(!tasksAchieved.contains(task)) {
					somme += task.getPercentOfApparition();
				}
			}
			double coeff = 100 / somme;
			
			for (ATask task : eeManager.getTasks()) {
				if(!tasksAchieved.contains(task)) {
					eeManager.addRoom2Task(task, coeff);
				}
			}
		}
	}
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> allowed = eligibleObjectiveLevels(); 
		eeManager.setChosenObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
	}
	
	private List<CurrentObjectiveLevel> eligibleObjectiveLevels(){
		LearningPath learningPath = learnerPlayer.getLearningpath();
		List<CurrentObjectiveLevel> allowed = new ArrayList<>(); 

		for (Objective obj : learningPath.getObjectives()) {
			boolean eligible = true;
			if(!obj.getPrerequisites().isEmpty()) {
				for (Prerequisite prerequisite : obj.getPrerequisites()) {
				if(!achievedLevel(prerequisite.getRequiredLevel())) {
						eligible = false;
					}
				}
			}
			System.out.println("OBJ " + obj.getID() + " eligible? " + (eligible == true));
			if(eligible) {
				CurrentObjectiveLevel col = getEligibleCurrentLevelForObjective(obj);
				if(col != null) {allowed.add(col);}
			}
		}	
		return allowed;
	}
	
	private boolean achievedLevel(Level level) {
		if(learnerPlayer.getProgression() == null) { return false; }
		List<CurrentObjectiveLevel> achieved = learnerPlayer.getProgression().getCurrentobjectivelevels();
		int i = 0; 
		boolean trouver = false;
		while(i < achieved.size() && !trouver) {
			trouver = achieved.get(i).getLevel().equals(level) &&  achieved.get(i).isAchieved();
			i++;
		}
		return trouver;
	}
	
	private CurrentObjectiveLevel getEligibleCurrentLevelForObjective(Objective objective) {
		if(learnerPlayer.getProgression() != null) {
			for (CurrentObjectiveLevel currentObjectiveLevel : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
				if(currentObjectiveLevel.getObjective().equals(objective) && !currentObjectiveLevel.isAchieved()) {
					return currentObjectiveLevel; 
				}
			}
		}

		for (Level level : objective.getLevels()) {
			if(!achievedLevel(level)) {
				CurrentObjectiveLevel col = new CurrentObjectiveLevelImpl(); 
				col.setObjective(objective);
				col.setLevel(level);
				col.setAchieved(false);
				return col;
			}
		}
		return null;
	}

	
	public void printGeneration() {
		System.out.println(eeManager.toString());
	}
	
}
