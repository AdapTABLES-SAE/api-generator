package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factgenerator_template.FactGenerator;
import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.LearnerPlayer;
import generator.Level;
import generator.Objective;
import generator.Prerequisite;
import generator.ResultsByTask;
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


	public EducationalElementsGenerator(ModelsManager modelAccess, double nbQuestionRooms, double nbNonQuestionRooms) {
		this.learnerPlayer = modelAccess.context.getLearnerplayer();
		random = new Random();
		eeManager = new EducationElementsManager(modelAccess, nbQuestionRooms, nbNonQuestionRooms);
	}
	
	public EducationElementsManager generateEE() throws Exception {
		selectObjectiveLevel();	
		System.out.println("Selected Objective/Level "+eeManager.getObjective().getName()+" "+eeManager.getLevel().getID());
		generateQuestionnableFacts();
		
		/*int i = 0;
		for (int j = 0; j < learnerPlayer.getProgression().getCurrentobjectivelevels().size(); j++) {
			if(learnerPlayer.getProgression().getCurrentobjectivelevels().get(j).equals(eeManager.chosenObjectiveLevel)) {
				i = j;
			}
		}*/
		
		//System.out.println(learnerPlayer.getProgression().getCurrentobjectivelevels().get(i).getResults().getResultsbytask().size());
		
		/*for (ResultsByTask r : eeManager.chosenObjectiveLevel.getResults().getResultsbytask()) {
			System.out.println("Are null "+r.getTask().getType()+" "+r.getQuestionableFacts().get(0));
		}*/
		defineDungeonRooms2Tasks();
		generateFactsToQuestion();
		eeManager.createDungeonQAndNQRoomOrder();
		return eeManager;
	}
	
	public Level getChosenLevel() {
		return eeManager.getLevel();
	}
	
	public Objective getChosenObjective() {
		return eeManager.getObjective();
	}
	
	/**
	 * Génère les faits questionnable
	 */
	private void generateQuestionnableFacts() {
		FactGenerator.generateQuestionableFacts(eeManager);
	}
	
	/**
	 * Défini le nombre de salle du donjon pour chaque tâche
	 * @throws Exception 
	 */
	private void defineDungeonRooms2Tasks() throws Exception {
		if(eeManager.getObjective() != null && eeManager.getLevel() != null) {
			double coeff = computesCoeffApparition();	
			for (ResultsByTask rbt : eeManager.getLearnerResultsByTasks()) {
				if(!isTaskAchieved(rbt.getTask())) {
					eeManager.addRoom2Task(rbt, coeff);
				}
			}
		}
	}
	
	private double computesCoeffApparition() {
		double somme = 0; 
		for (ATask task : eeManager.getTasks()) {
			if(!isTaskAchieved(task)) {
				somme += task.getPercentOfApparition();
			}
		}
		return 100 / somme;
	}
	
	private boolean isTaskAchieved(ATask task) {
		return eeManager.successPercentageByTask(task) == 100 && 
				eeManager.encounterPercentageByTask(task) == 100;
	}
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> allowed = eligibleObjectiveLevels(); 
		eeManager.setChosenObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
	}
	
	private List<CurrentObjectiveLevel> eligibleObjectiveLevels(){
		addNewCurrentObjectiveLevelToLearnerPlayer(getEligibleObjectives());
		
		List<CurrentObjectiveLevel> cols = new ArrayList<>();
		for (CurrentObjectiveLevel currentObjectiveLevel : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(!currentObjectiveLevel.isAchieved()) {
				cols.add(currentObjectiveLevel);
			}
		}
		return cols;
	}
	
	private void addNewCurrentObjectiveLevelToLearnerPlayer(List<Objective> eligible_objective) {
		for (Objective objective : eligible_objective) {
			System.out.println("Eligible "+objective.getID());
			if(!hasLearnerBeginObjective(objective)) {
				CurrentObjectiveLevel col = new CurrentObjectiveLevelImpl();
				col.setAchieved(false);
				col.setObjective(objective);
				col.setLevel(getAvailableLevelForObjective(objective));
				eeManager.addLearnerNewCurrentObjectifLevel(col);
			}
		}
	}
	
	private Level getAvailableLevelForObjective(Objective o) {
		for (Level level : o.getLevels()) {
			if(!hasLearnerFinishedLevel(o, level)) {
				return level;
			}
		}
		return null; 
	}
	
	/**
	 * Non achever 
	 * @param o
	 * @return
	 */
	private boolean hasLearnerBeginObjective(Objective o) {
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(o) && !col.isAchieved()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Non achever 
	 * @param o
	 * @return
	 */
	private boolean hasLearnerFinishedLevel(Objective o, Level l) {
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(o) && col.getLevel().equals(l) && col.isAchieved()) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isObjectiveFinished(Objective o) {
		Level lastLevel = o.getLevels().get(o.getLevels().size() - 1);
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(o) && col.getLevel().equals(lastLevel) && col.isAchieved()) {
				return true;
			}
		}
		return false;
	}
	
	private List<Objective> getEligibleObjectives(){
		List<Objective> eligibleObjective = new ArrayList<>();
		for (Objective obj : learnerPlayer.getLearningpath().getObjectives()) {
			boolean eligible = true;
			if(isObjectiveFinished(obj)) {eligible = false;}
			else {
				if(!obj.getPrerequisites().isEmpty()) {
					for (Prerequisite prerequisite : obj.getPrerequisites()) {
						if(!achievedLevel(prerequisite.getRequiredLevel())) {
							eligible = false;
						}
					}
				}
			}
						
			if(eligible) {
				eligibleObjective.add(obj);
			}
		}
		return eligibleObjective;
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
	
	private void generateFactsToQuestion() throws Exception {
		List<ResultsByTask> orderedTasks = getOrderedTasks();
		FactGenerator.generateQuestionedFact(eeManager, orderedTasks);
	}
	
	private List<ResultsByTask> getOrderedTasks(){ 
		List<ResultsByTask> tasks = new ArrayList<>(); 
		for (ResultsByTask rbt : eeManager.getResultsByTasksForRooms()) {
			for (int i = 0; i <  eeManager.getNbRoomFor(rbt); i++) {
				tasks.add(rbt);
			}
		}
		return tasks; 
	}

	
	
	public void printGeneration() {
		System.out.println(eeManager.toString());
	}
	
}
