package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.CurrentObjectiveLevel;
import generator.Level;
import generator.Objective;
import managers.EducationElementsManager;
import models.ModelAccess;

/**
 * Cette classe permet de générer / choisir, l'objectif d'entrainement visée ainsi que le niveau de difficulté. 
 * @author Bérénice LEMOINE
 */
public class EducationalElementsGenerator {
	
	private ModelAccess modelAccess;
	private Random random;
	
	private EducationElementsManager eeManager;


	public EducationalElementsGenerator(ModelAccess modelAccess) {
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
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> notAchieved = new ArrayList<>();
		for (CurrentObjectiveLevel currentObjectiveLevel : modelAccess.context.getLearnerplayer().getProgression().getCurrentobjectivelevels()) {
			if(!currentObjectiveLevel.isAchieved()) {
				notAchieved.add(currentObjectiveLevel);
			}
		}
		// TODO : choix en fonction des pourcentages !!! 
		eeManager.setChosenObjectiveLevel(notAchieved.get(random.nextInt(notAchieved.size())));
	}	

	
	public void printGeneration() {
		System.out.println(eeManager.toString());
	}
	
}
