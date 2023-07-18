package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

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
 * Cette classe permet de g�n�rer / choisir, l'objectif d'entrainement vis�e ainsi que le niveau de difficult�. 
 * @author B�r�nice LEMOINE
 */
public class EducationalElementsGenerator {
	
	private Random random;
	
	private DungeonElements dungeonElements;
	private Map<ResultsByTask, Double> nbRoomsToTask; 
	private ModelsManager modelAccess;
	
	private LearnerPlayer learnerPlayer;

	public EducationalElementsGenerator(ModelsManager modelAccess, DungeonElements dungeonElements, LearnerPlayer learner) {
		random = new Random();
		this.dungeonElements = dungeonElements;
		this.modelAccess = modelAccess;
		this.nbRoomsToTask = new HashMap<>();
		this.learnerPlayer = learner;
	}
	
	public DungeonElements generateEE() throws Exception {
		selectObjectiveLevel();	
		System.out.println("Selected Objective/Level "+dungeonElements.getChosenObjective().getID()+" "+dungeonElements.getChosenLevel().getID());
		generateQuestionnableFacts();
		System.out.println("Faits questionnables générés");
		defineNumberOfRoomPerTaskNecessary();
		System.out.println("Room per task defini");
		generateFactsToQuestion();
		System.out.println("Faits questionnés générés ");
		//System.out.println(" DEBUG FACT QUESTIONED *********************");
		//eeManager.printFactsToQuestion();
		dungeonElements.buildNumberOfNonQuestionRooms();
		return dungeonElements;
	}
	
	/**
	 * G�n�re les faits questionnable
	 */
	private void generateQuestionnableFacts() {
		instanciateQFbyTasks();
		for (ResultsByTask resBytask : dungeonElements.getLearnerResultsByTasks()) {
			if(resBytask.getQuestionableFacts().isEmpty()) {
				FactGenerator.generateQuestionableFactsByTask(dungeonElements, resBytask);
			}
		}
		saveLearnerModel();
	}

	
	public void saveLearnerModel() {
		this.deleteLearnerPlayer();
		modelAccess.getContextModel().getLearnerPlayers().getLearnerPlayers().add(this.learnerPlayer);
		modelAccess.saveContextModel();
	}
	
	private void deleteLearnerPlayer() {
		int i = 0;
		while(i < modelAccess.getContextModel().getLearnerPlayers().getLearnerPlayers().size()) {
			if(modelAccess.getContextModel().getLearnerPlayers().getLearnerPlayers().get(i).getID().equals(this.learnerPlayer.getID())) {
				modelAccess.getContextModel().getLearnerPlayers().getLearnerPlayers().remove(i);
			}
			i++;
		}
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
		
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(col.getResults() == null) {
				col.setResults(new ResultsImpl());
			}
			addResultByTasks(col);
		}
		
		if(!learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels().contains(dungeonElements.getCurrentObjectiveLevel())) {
			learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels().add(dungeonElements.getCurrentObjectiveLevel());
		}
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
	 * D�fini le nombre de salle du donjon pour chaque t�che
	 * @throws Exception 
	 */
	private void defineNumberOfRoomPerTaskNecessary() throws Exception {
		//System.err.println(dungeonElements.getNbQRooms());
		if(dungeonElements.getChosenObjective() != null && dungeonElements.getChosenLevel() != null) {
			double coeff = computesCoeffApparition();	
			for (ResultsByTask rbt : dungeonElements.getLearnerResultsByTasks()) {
				//System.out.println(rbt.getTask().getID());
				if(!isTaskAchieved(rbt.getTask())) {
					addRoom2Task(rbt, coeff);
				}
			}
		}
		//System.err.println("Before clean "+nbRoomsToTask);
		this.cleanNumberOfComputedRooms();
		//System.err.println("After clean "+nbRoomsToTask);
	}
	
	private void addRoom2Task(ResultsByTask rbt, double coeffAdditional) throws Exception {
		if(nbRoomsToTask.containsKey(rbt)) {
			//System.out.println("nbroom "+((double) Math.round(nbRoomsToTask.get(rbt) +
					//((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100)));
			nbRoomsToTask.put(rbt, (double) Math.round(nbRoomsToTask.get(rbt) +
					((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100));
		}else {
			//System.out.println("nbroom "+((double) Math.round(((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100)));
			nbRoomsToTask.put(rbt, (double) Math.round(((rbt.getTask().getPercentOfApparition()*coeffAdditional)*dungeonElements.getNbQRooms())/100));
		}
	}
	
	private void cleanNumberOfComputedRooms() {
		int computedNumberOfRoom = this.getNumberOfRoomsComputed();
		if(computedNumberOfRoom != dungeonElements.getNbQRooms()) {
			List<ResultsByTask> possibleRemoveTasks = new ArrayList<>(getTaskWithLowerApparitionPercentage());
			for(int i = 0; i < computedNumberOfRoom - dungeonElements.getNbQRooms(); i++) {
				int randomIndexChoice = random.nextInt(possibleRemoveTasks.size());
				nbRoomsToTask.remove(possibleRemoveTasks.get(randomIndexChoice));
			}
		}
	}
	
	private double getLowerPercentagePresentInDungeon() {
		double percentage = 100.;
		for(ResultsByTask rbt: nbRoomsToTask.keySet()) {
			if(rbt.getTask().getPercentOfApparition() < percentage && nbRoomsToTask.get(rbt) > 0.0) {
				percentage = rbt.getTask().getPercentOfApparition();
			}
		}
		return percentage;
	}
	
	private Set<ResultsByTask> getTaskWithLowerApparitionPercentage(){
		double percentage = getLowerPercentagePresentInDungeon();
		Set<ResultsByTask> tasks = new HashSet<>();
		for(ResultsByTask rbt: nbRoomsToTask.keySet()) {
			if(rbt.getTask().getPercentOfApparition() == percentage) {
				tasks.add(rbt);
			}
		}
		return tasks;
	}
	
	private int getNumberOfRoomsComputed() {
		int somme = 0;
		for (ResultsByTask rbt: nbRoomsToTask.keySet()) {
			somme += nbRoomsToTask.get(rbt);
		}
		
		return somme;
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
		return successPercentageByTask(task) == 100. && 
				encounterPercentageByTask(task) == 100.;
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
		dungeonElements.setCurrentObjectiveLevel(allowed.get(random.nextInt(allowed.size())));
	}
	
	private List<CurrentObjectiveLevel> eligibleObjectiveLevels(){
		List<Objective> eligibleObjectives = getEligibleObjectives();
		boolean allObjectiveAreReached = eligibleObjectives.isEmpty();
		boolean allIObjectiveLevelAreAt100Percent = allObjectiveAreReached && everyObjectiveLevelReached100Percent();
		if(!allObjectiveAreReached) {
			addNewCurrentObjectiveLevelToLearnerPlayer(eligibleObjectives);
		}
		
		List<CurrentObjectiveLevel> cols = new ArrayList<>();
		for (CurrentObjectiveLevel currentObjectiveLevel : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(!currentObjectiveLevel.isAchieved() || (allObjectiveAreReached && !levelThresholdsAreAt100Percent(currentObjectiveLevel)) || allIObjectiveLevelAreAt100Percent) {
				cols.add(currentObjectiveLevel);
			}
		}
		return cols;
	}
	
	private boolean everyObjectiveLevelReached100Percent() {
		for (CurrentObjectiveLevel currentObjectiveLevel : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(!(currentObjectiveLevel.getEncountersPercent() >= 100.0 && currentObjectiveLevel.getSucessPercent() >= 100.0)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean levelThresholdsAreAt100Percent(CurrentObjectiveLevel currentOL) {
		return currentOL.getEncountersPercent() == 100.0 && currentOL.getSucessPercent() == 100.0;
	}
	
	private void addNewCurrentObjectiveLevelToLearnerPlayer(List<Objective> eligible_objective) {
		for (Objective objective : eligible_objective) {
			if(!hasLearnerBeginObjective(objective)) {
				Level level = getAvailableLevelForObjective(objective);
				
				if(!currentObjectiveLevelExist(objective, level)) {
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
		if(!learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels().contains(currentObjectiveLevel)) {
			learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels().add(currentObjectiveLevel);
		}
	}
	
	private boolean currentObjectiveLevelExist(Objective o, Level l) {
		for (CurrentObjectiveLevel col : this.learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
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
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
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
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(col.getObjective().equals(o) && col.getLevel().equals(l) && col.isAchieved()) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isObjectiveAchieved(Objective objective) {
		int numberOfLevelsCompleted = 0;
		for (Level level : objective.getLevels()) {
			for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
				if(col.getObjective().equals(objective) && col.getLevel().equals(level) && col.isAchieved()) {
					numberOfLevelsCompleted++;
				}
			}
		}
		return objective.getLevels().size() == numberOfLevelsCompleted;
	}
	
	private boolean isPreRequisiteReached(Prerequisite prerequisite) {
		 CurrentObjectiveLevel currentOL = getCorrespondingCurrentObjectiveLevel(prerequisite.getRequiredLevel());
		 return currentOL != null && (currentOL.isAchieved() || isPreRequisitePercentageAchieved(currentOL, prerequisite));
	}
	
	private boolean isPreRequisitePercentageAchieved(CurrentObjectiveLevel currentOL, Prerequisite prerequisite) {
		return currentOL.getSucessPercent() >= prerequisite.getSuccesPercent() && currentOL.getEncountersPercent() >= prerequisite.getEncountersPercent();
	}
	
	private CurrentObjectiveLevel getCorrespondingCurrentObjectiveLevel(Level level) {
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getLearnerProgress().getCurrentobjectivelevels()) {
			if(col.getLevel().equals(level)) {
				return col;
			}
		}
		return null;
	}
	
	private List<Objective> getEligibleObjectives() {
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
