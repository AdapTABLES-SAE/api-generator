package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.CurrentObjectiveLevel;
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
	
	private ModelsManager modelAccess;
	private Random random;
	
	private EducationElementsManager eeManager;


	public EducationalElementsGenerator(ModelsManager modelAccess) {
		this.modelAccess = modelAccess;
		random = new Random();
		eeManager = new EducationElementsManager(modelAccess.context.getGamecontext().getNumberOfRooms());
	}
	
	public EducationElementsManager generateEE() {
		selectObjectiveLevel();
		printGeneration();
		return eeManager;
	}
	
	public Level getChosenLevel() {
		return eeManager.getLevel();
	}
	
	public Objective getChosenObjective() {
		return eeManager.getObjective();
	}
	
	/*private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> notAchieved = new ArrayList<>();
		for (CurrentObjectiveLevel currentObjectiveLevel : modelAccess.context.getLearnerplayer().getProgression().getCurrentobjectivelevels()) {
			if(!currentObjectiveLevel.isAchieved()) {
				notAchieved.add(currentObjectiveLevel);
			}
		}
		// TODO : choix en fonction des pourcentages !!! 
		eeManager.setChosenObjectiveLevel(notAchieved.get(random.nextInt(notAchieved.size())));
	}	*/
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> allowed = eligibleObjectiveLevels(); 
		eeManager.setChosenObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
	}
	
	private List<CurrentObjectiveLevel> eligibleObjectiveLevels(){
		LearningPath learningPath = modelAccess.context.getLearnerplayer().getLearningpath();
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
				for (Level level : obj.getLevels()) {
					if(!achievedLevel(level)) {
						CurrentObjectiveLevel col = new CurrentObjectiveLevelImpl(); 
						col.setObjective(obj);
						col.setLevel(level);
						col.setAchieved(false);
						allowed.add(col);
						break;
					}
				}
			}
		}	
		return allowed;
	}
	
	private boolean achievedLevel(Level level) {
		List<CurrentObjectiveLevel> achieved = modelAccess.context.getLearnerplayer().getProgression().getCurrentobjectivelevels();
		int i = 0; 
		boolean trouver = false;
		while(i < achieved.size() && !trouver) {
			trouver = achieved.get(i).getLevel().equals(level) &&  achieved.get(i).isAchieved();
			i++;
		}
		return trouver;
	}
	
	

	
	public void printGeneration() {
		System.out.println(eeManager.toString());
	}
	
}
