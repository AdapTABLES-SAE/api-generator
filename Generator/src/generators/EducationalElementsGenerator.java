package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import generator.impl.ResultsByTaskImpl;
import generator.impl.ResultsImpl;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.RoomElements;

/**
 * Cette classe permet de générer / choisir, l'objectif d'entrainement visée ainsi que le niveau de difficulté. 
 * @author Bérénice LEMOINE
 */
public class EducationalElementsGenerator {
	
	private Random random;
	
	//private EducationElementsManager eeManager;
	private DungeonElements dungeonElements;
	private Map<ResultsByTask, Double> nbRoomsToTask; 
	private ModelsManager modelAccess;
	
	private LearnerPlayer learnerPlayer;


	public EducationalElementsGenerator(ModelsManager modelAccess, DungeonElements dungeonElements) {
		this.learnerPlayer = modelAccess.getContextModel().getLearnerplayer();
		random = new Random();
		this.dungeonElements = dungeonElements;
		this.modelAccess = modelAccess;
		this.nbRoomsToTask = new HashMap<>();
		//eeManager = new EducationElementsManager(modelAccess, nbQuestionRooms, nbNonQuestionRooms);
	}
	
	public DungeonElements generateEE() throws Exception {
		selectObjectiveLevel();	
		System.out.println("Selected Objective/Level "+dungeonElements.getChosenObjective().getName()+" "+dungeonElements.getChosenLevel().getID());
		generateQuestionnableFacts();
		System.out.println("Faits questionnables générés ");
		defineNumberOfRoomPerTaskNecessary();
		System.out.println("Room per task defini");
		generateFactsToQuestion();
		System.out.println("Faits questionnés générés ");
		//System.out.println(" DEBUG FACT QUESTIONED *********************");
		//eeManager.printFactsToQuestion();
		//createDungeonQAndNQRoomOrder();
		dungeonElements.buildNumberOfNonQuestionRooms();
		return dungeonElements;
	}
	
	/*public Level getChosenLevel() {
		return eeManager.getLevel();
	}
	
	public Objective getChosenObjective() {
		return eeManager.getObjective();
	}*/
	
	/**
	 * Génère les faits questionnable
	 */
	private void generateQuestionnableFacts() {
		instanciateQFbyTasks();
		//boolean wasGenerated = false;
		for (ResultsByTask resBytask : dungeonElements.getLearnerResultsByTasks()) {
			if(resBytask.getQuestionableFacts().isEmpty()) {
				FactGenerator.generateQuestionableFactsByTask(dungeonElements, resBytask);
			//wasGenerated = true;
			}
		}
		//if(wasGenerated) {
			saveLearnerModel();
		//}
	}

	
	public void saveLearnerModel() {
		modelAccess.getContextModel().setLearnerplayer(learnerPlayer);
		modelAccess.saveContextModel();
	}
	
	
	public void instanciateQFbyTasks() {
		System.err.println("chosen OBJLVL "+ dungeonElements.getChosenLevel().getID()+" "+dungeonElements.getChosenObjective().getID());
		
		if(dungeonElements.getCurrentObjectiveLevel().getResults() == null) {
			dungeonElements.getCurrentObjectiveLevel().setResults(new ResultsImpl());
			for(ATask task: dungeonElements.getChosenLevel().getTasks()) {
				ResultsByTask rbt = new ResultsByTaskImpl();
				rbt.setTask(task);
				dungeonElements.getCurrentObjectiveLevel().getResults().getResultsbytask().add(rbt);
			}
		}
		
		if(!learnerPlayer.getProgression().getCurrentobjectivelevels().contains(dungeonElements.getCurrentObjectiveLevel())) {
			learnerPlayer.getProgression().getCurrentobjectivelevels().add(dungeonElements.getCurrentObjectiveLevel());
		}
		
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getResults() == null) {
				col.setResults(new ResultsImpl());
			}
			addResultByTasks(col);
		}
		//modelAccess.saveContextModel();
	}
	
	private void addResultByTasks(CurrentObjectiveLevel currentObjectiveLevel) {
		for(ATask task: currentObjectiveLevel.getLevel().getTasks()) {
			if(!containsResultBytask(currentObjectiveLevel, task)) {
				ResultsByTask rbt = new ResultsByTaskImpl();
				rbt.setTask(task);
				currentObjectiveLevel.getResults().getResultsbytask().add(rbt);
			}
		}
	}
	
	private boolean containsResultBytask(CurrentObjectiveLevel currentObjectiveLevel, ATask task) {
		for (ResultsByTask rbt : currentObjectiveLevel.getResults().getResultsbytask()) {
			if(rbt.getTask().equals(task)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Défini le nombre de salle du donjon pour chaque tâche
	 * @throws Exception 
	 */
	private void defineNumberOfRoomPerTaskNecessary() throws Exception {
		if(dungeonElements.getChosenObjective() != null && dungeonElements.getChosenLevel() != null) {
			double coeff = computesCoeffApparition();	
			for (ResultsByTask rbt : dungeonElements.getLearnerResultsByTasks()) {
				if(!isTaskAchieved(rbt.getTask())) {
					addRoom2Task(rbt, coeff);
				}
			}
		}
	}
	
	private void addRoom2Task(ResultsByTask rbt, double coeffAdditional) throws Exception {
		if(nbRoomsToTask.containsKey(rbt)) {
			nbRoomsToTask.put(rbt, (double) Math.round(nbRoomsToTask.get(rbt) +
					((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100));
		}else {
			nbRoomsToTask.put(rbt, (double) Math.round(((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100));
		}
	}
	
	private double computesCoeffApparition() {
		double somme = 0; 
		for (ATask task : dungeonElements.getChosenLevel().getTasks()) {
			if(!isTaskAchieved(task)) {
				somme += task.getPercentOfApparition();
			}
		}
		return 100 / somme;
	}
	
	private boolean isTaskAchieved(ATask task) {
		return successPercentageByTask(task) == 100 && 
				encounterPercentageByTask(task) == 100;
	}
	
	public double successPercentageByTask(ATask task) {
		if(dungeonElements.getCurrentObjectiveLevel().getResults() != null) {
			for (ResultsByTask resBytask : dungeonElements.getCurrentObjectiveLevel().getResults().getResultsbytask()) {
				if(resBytask.getTask().equals(task)) {
					return resBytask.getSucessPercent();
				}
			}
		}
		return 0;
	}
	
	public double encounterPercentageByTask(ATask task) {
		if(dungeonElements.getCurrentObjectiveLevel().getResults() != null) {
			for (ResultsByTask resBytask : dungeonElements.getCurrentObjectiveLevel().getResults().getResultsbytask()) {
				if(resBytask.getTask().equals(task)) {
					return resBytask.getEncountersPercent();
				}
			}
		}
		return 0;
	}
	
	private void selectObjectiveLevel() {
		List<CurrentObjectiveLevel> allowed = eligibleObjectiveLevels(); 
		// eeManager.setChosenObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
		dungeonElements.setCurrentObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
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
				Level level = getAvailableLevelForObjective(objective);
				
				if(!currentObjectiveLevelExist(objective, level)) {
					System.err.println("AJOUT");
					CurrentObjectiveLevel col = new CurrentObjectiveLevelImpl();
					col.setAchieved(false);
					col.setObjective(objective);
					col.setLevel(level);
					addLearnerNewCurrentObjectifLevel(col);
				}
			}
		}
	}
	
	public void addLearnerNewCurrentObjectifLevel(CurrentObjectiveLevel currentObjectiveLevel) {
		if(!learnerPlayer.getProgression().getCurrentobjectivelevels().contains(currentObjectiveLevel)) {
			learnerPlayer.getProgression().getCurrentobjectivelevels().add(currentObjectiveLevel);
		}
		//modelAccess.saveContextModel();
	}
	
	private boolean currentObjectiveLevelExist(Objective o, Level l) {
		for (CurrentObjectiveLevel col : this.learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().getID().equals(o.getID()) && col.getLevel().getID().equals(l.getID())) {
				return true;
			}
		}
		return false;
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
	
	private boolean isObjectiveAchieved(Objective objective) {
		int numberOfLevelsCompleted = 0;
		for (Level level : objective.getLevels()) {
			for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
				if(col.getObjective().equals(objective) && col.getLevel().equals(level) && col.isAchieved()) {
					numberOfLevelsCompleted++;
				}
			}
		}
		return objective.getLevels().size() == numberOfLevelsCompleted;
	}
	
	private boolean isPreRequisiteReached(Prerequisite prerequisite) {
		 //Objective prerequisiteObjective = getCorrespondingObjectiveOfLevel(prerequisite.getRequiredLevel());
		 CurrentObjectiveLevel currentOL = getCorrespondingCurrentObjectiveLevel(prerequisite.getRequiredLevel());
		 return currentOL != null && (currentOL.isAchieved() || isPreRequisitePercentageAchieved(currentOL, prerequisite));
	}
	
	private boolean isPreRequisitePercentageAchieved(CurrentObjectiveLevel currentOL, Prerequisite prerequisite) {
		return currentOL.getSucessPercent() >= prerequisite.getSuccesPercent() && currentOL.getEncountersPercent() >= prerequisite.getEncountersPercent();
	}
	
	private CurrentObjectiveLevel getCorrespondingCurrentObjectiveLevel(Level level) {
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getLevel().equals(level)) {
				return col;
			}
		}
		return null;
	}
	
	/*private Objective getCorrespondingObjectiveOfLevel(Level level) {
		for (Objective objective : learnerPlayer.getLearningpath().getObjectives()) {
			for (Level aLevel : objective.getLevels()) {
				if(aLevel.equals(level)) {
					return objective;
				}
			}
		}
		return null;
	}
	
	private int computePercentageOfSuccess(Objective objective) {
		int numberOfLevelsDoneOrStarted = 0;
		int sumOfSuccessPercent = 0;
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(objective)) {
				numberOfLevelsDoneOrStarted++;
				sumOfSuccessPercent += col.getSucessPercent();
			}
		}
		return sumOfSuccessPercent / numberOfLevelsDoneOrStarted;
	}
	
	private int computePercentageOfEncounteredFacts(Objective objective) {
		int numberOfLevelsDoneOrStarted = 0;
		int sumOfEncounteredPercent = 0;
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(objective)) {
				numberOfLevelsDoneOrStarted++;
				sumOfEncounteredPercent += col.getEncountersPercent();
			}
		}
		return sumOfEncounteredPercent / numberOfLevelsDoneOrStarted;
	}*/
	
	@Deprecated
	private boolean isObjectiveFinished(Objective o) {
		Level lastLevel = o.getLevels().get(o.getLevels().size() - 1);
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(o) && col.getLevel().equals(lastLevel) && col.isAchieved()) {
				return true;
			}
		}
		return false;
	}
	
	/*private List<Objective> getEligibleObjectives() {
		List<Objective> eligibleObjective = new ArrayList<>();
		boolean allPrerequisiteAchied;
		for (Objective obj : learnerPlayer.getLearningpath().getObjectives()) {
			if(!isObjectiveAchieved(obj)) {
				allPrerequisiteAchied = true;
				for (Prerequisite prerequisite : obj.getPrerequisites()) {
					allPrerequisiteAchied = isPreRequisiteReached(prerequisite);
				}
				if(allPrerequisiteAchied) { eligibleObjective.add(obj); }
			}
		}
		return eligibleObjective;
	}*/
	
	private List<Objective> getEligibleObjectives() { // TODO : prendre en compte le calcul de pourcentage du prérequis 
		/*
		 * Un objectif est eligible lorsque tous ces niveaux ne sont pas acquis 
		 * Lorsque tous ses pre-requis sont atteint (niveau visés sont deverouilles) + 
		 * La somme des pourcentages des niveaux entamés de l'objectif divisé par le nombre de niveau est > ou égale au pourcentage de pre-requis
		 * */
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
			trouver = achieved.get(i).getLevel().equals(level) && achieved.get(i).isAchieved();
			i++;
		}
		return trouver;
	}
	
	private void generateFactsToQuestion() throws Exception {
		buildTaskRoomElements();
		FactGenerator.generateQuestionedFact(dungeonElements);
	}
	
	private void buildTaskRoomElements() {
		for (ResultsByTask resultsByTask : nbRoomsToTask.keySet()) {
			for (int i = 0; i < nbRoomsToTask.get(resultsByTask); i++) {
				this.dungeonElements.addRoomsElements(new RoomElements(this.modelAccess.getGameDescriptionModel(), resultsByTask.getTask()));
			}
		}
	}
	
	public double getNbRoomFor(ResultsByTask rbt) {
		if(nbRoomsToTask.containsKey(rbt)) {
			return nbRoomsToTask.get(rbt);
		}else {
			return -1.;
		}
	}

}
