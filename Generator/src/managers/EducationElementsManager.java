package managers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.LearnerPlayer;
import generator.LearningPath;
import generator.Level;
import generator.Objective;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.impl.ProgressionImpl;
import generator.impl.ResultsByTaskImpl;
import generator.impl.ResultsImpl;
import structures.Shuffle;
import structures.TaskFactPair;

public class EducationElementsManager {
	
	private LearnerPlayer learnerPlayer;
	public CurrentObjectiveLevel chosenObjectiveLevel;
	private ModelsManager modelAccess; 
	/**
	 * Structure donnant pour chaque type de tache, le nombre de piece necessaires
	 */
	private Map<ResultsByTask, Double> nbRoomsToTask; 
	private double nbQRooms;
	private double nbNQRooms;
	private List<TaskFactPair> factsToQuestionPerRoom;
	
	public EducationElementsManager(ModelsManager modelAccess, double nbQuestionRooms, double nbNonQuestionRooms) {
		this.modelAccess = modelAccess;
		this.learnerPlayer = this.modelAccess.context.getLearnerplayer();
		this.nbQRooms = nbQuestionRooms;
		this.nbNQRooms = nbNonQuestionRooms;
		this.nbRoomsToTask = new HashMap<>();
		this.factsToQuestionPerRoom = new ArrayList<>();
	}

	/**
	 * Enregistre le couple objectif/niveau et l'ajoute à la progression de l'apprenant s'il est nouveau
	 * @param chosenObjectiveLevel
	 */
	public void setChosenObjectiveLevel(CurrentObjectiveLevel chosenObjectiveLevel) {
		this.chosenObjectiveLevel = chosenObjectiveLevel;
		if(learnerPlayer.getProgression() != null && !learnerPlayer.getProgression().getCurrentobjectivelevels().contains(chosenObjectiveLevel)) {
			learnerPlayer.getProgression().getCurrentobjectivelevels().add(chosenObjectiveLevel);
		}
	}
	
	public void addLearnerNewCurrentObjectifLevel(CurrentObjectiveLevel currentObjectiveLevel) {
		if(!learnerPlayer.getProgression().getCurrentobjectivelevels().contains(currentObjectiveLevel)) {
			learnerPlayer.getProgression().getCurrentobjectivelevels().add(currentObjectiveLevel);
		}
	}
	
	public LearningPath getLearnerLearningPath() {
		return learnerPlayer.getLearningpath();
	}

	public Level getLevel() {
		return this.chosenObjectiveLevel.getLevel();
	}

	public Objective getObjective() {
		return this.chosenObjectiveLevel.getObjective();
	}
	
	public List<ATask> getTasks() {
		return chosenObjectiveLevel.getLevel().getTasks();
	}
	
	public double getNbRoomFor(ResultsByTask rbt) {
		if(nbRoomsToTask.containsKey(rbt)) {
			return nbRoomsToTask.get(rbt);
		}else {
			return -1.;
		}
	}
	
	public List<ResultsByTask> getResultsByTasksForRooms(){
		/*List<ResultsByTask> rbts = new ArrayList<>();
		for (Resu task : nbRoomsToTask.keySet()) {
			for (ResultsByTask resultsByTask : getLearnerResultsByTasks()) {
				if(resultsByTask.getTask().equals(task)) {
					rbts.add(resultsByTask);
				}
			}
		}*/
		return new ArrayList<>(nbRoomsToTask.keySet());
	}
	
	public List<TaskFactPair> getFactsToQuestion(){		
		return factsToQuestionPerRoom;
	}
	
	public void addRoom2Task(ResultsByTask rbt, double coeffAdditional) throws Exception {
		if(nbRoomsToTask.containsKey(rbt)) {
			nbRoomsToTask.put(rbt, (double) Math.round(nbRoomsToTask.get(rbt) +
					((rbt.getTask().getPercentOfApparition()*coeffAdditional)*nbQRooms)/100));
		}else {
			nbRoomsToTask.put(rbt, (double) Math.round(((rbt.getTask().getPercentOfApparition()*coeffAdditional)*nbQRooms)/100));
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
	
	public double encounterPercentageByTask(ATask task) {
		if(this.chosenObjectiveLevel.getResults() != null) {
			for (ResultsByTask resBytask : this.chosenObjectiveLevel.getResults().getResultsbytask()) {
				if(resBytask.getTask().equals(task)) {
					return resBytask.getEncountersPercent();
				}
			}
		}
		return 0;
	}
	
	public void instanciateQFbyTasks() {
		if(learnerPlayer.getProgression() == null) {
			learnerPlayer.setProgression(new ProgressionImpl());
		}
		if(!learnerPlayer.getProgression().getCurrentobjectivelevels().contains(chosenObjectiveLevel)) {
			learnerPlayer.getProgression().getCurrentobjectivelevels().add(this.chosenObjectiveLevel);
		}
		if(chosenObjectiveLevel.getResults() == null) {
			chosenObjectiveLevel.setResults(new ResultsImpl());
			for(ATask task: this.getLevel().getTasks()) {
				ResultsByTask rbt = new ResultsByTaskImpl();
				rbt.setTask(task);
				chosenObjectiveLevel.getResults().getResultsbytask().add(rbt);
			}
		}
		
		for (CurrentObjectiveLevel col : learnerPlayer.getProgression().getCurrentobjectivelevels()) {
			if(col.getResults() == null) {
				col.setResults(new ResultsImpl());
			}
			addResultByTasks(col);
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
	
	public List<ResultsByTask> getLearnerResultsByTasks(){		
		return chosenObjectiveLevel.getResults().getResultsbytask();
	}
	
	public void saveLearnerModel() {
		modelAccess.context.setLearnerplayer(learnerPlayer);
		modelAccess.saveContextModel();
	}
	
	public void addFactToQuestion(ATask task, List<QuestionedFact> qEfacts) {
		this.factsToQuestionPerRoom.add(new TaskFactPair(task, qEfacts));
	}
	
	
	/**
	 * Create the order of training task rooms and pure game rooms of the dungeon
	 */
	public void createDungeonQAndNQRoomOrder() {
		while(factsToQuestionPerRoom.size() < (nbNQRooms + nbQRooms)) {
			factsToQuestionPerRoom.add(null);
		}
		factsToQuestionPerRoom = Shuffle.shuffleRoomFacts(factsToQuestionPerRoom);
	}
	
	public void addFactToQuestion(ATask task, QuestionedFact qEfact) {
		this.factsToQuestionPerRoom.add(new TaskFactPair(task, Arrays.asList(qEfact)));
	}
	
	
	@Override
	public String toString() {
		String s = "Objectif : " + getObjective().getName() + 
				"\nNiveau : " + getLevel().getID() + "\nSalles/Taches : \n";
		for (ResultsByTask tt : nbRoomsToTask.keySet()) {
			s += "\t"+ nbRoomsToTask.get(tt) + " room of type : " + tt.getTask().getType() + "\n";
		}
		return s;
	}
}
