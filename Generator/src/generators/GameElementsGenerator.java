package generators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import generator.ATask;
import generator.Dungeon;
import generator.EBoundary;
import generator.EModality;
import generator.EnterResponse;
import generator.GPCategory;
import generator.Gameplay;
import generator.MultipleChoice;
import generator.NoQuestionGameplay;
import generator.QuestionGameplay;
import generator.Relation;
import generator.Room;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.RoomElements;

public class GameElementsGenerator {

	private Random random;
	private DungeonElements dungeonElements;
	private ModelsManager modelAccess; 
	
	public GameElementsGenerator(ModelsManager modelAccess,  DungeonElements dungeonElements) {
		this.dungeonElements = dungeonElements;
		this.modelAccess = modelAccess;
		random = new Random();
	}
	
	public void generateGPandCurses() {
		setDungeonMode();
		selectCompatibleGameplays();
	}
	
	private void setDungeonMode(){
		dungeonElements.setDungeonMode(modelAccess.getContextModel().getGamecontext().getMode());
	}
	
	public Dungeon generateRoomContent(Dungeon generatedDungeon) {
		ConcreteGameplayGenerator gameplayGenerator = new ConcreteGameplayGenerator(modelAccess);
		//System.out.println(generatedDungeon.getRooms().size()+ " " + dungeonElements.getRoomsElements().size());
		for (Room room: generatedDungeon.getRooms()) {
			if(room.getGameplay() != null) {
				room.getPositionedElement().addAll(gameplayGenerator.buildPositionedElements(this.getCorrespondingRoomElements(room)));
			} 
		}
		
		return generatedDungeon;
	}
	
	private RoomElements getCorrespondingRoomElements(Room room) {
		for (RoomElements rElem: dungeonElements.getRoomsElements()) {
			if(room.getX() == rElem.getRoom().getX() && room.getY() == rElem.getRoom().getY()) {
				return rElem;
			}
		}
		return null;
	}
	
	private Set<GPCategory> getValidCategoriesFromRelations(ATask task){
		Set<GPCategory> allowedCategories = new HashSet<>(); 
		
		for (Relation relation : new ArrayList<>(modelAccess.getRelationsModel().getRelations())) {
			if(relation.getTask().equals(task.getType())) {
				boolean factCompatible;
				if(relation.getCondition().getNbFacts().equals(EBoundary.ONE)) {
					factCompatible = task.getNbFacts() == 1;
				} else if (relation.getCondition().getNbFacts().equals(EBoundary.SUP_ONE)) {
					factCompatible = task.getNbFacts() > 1;
				} else {
					factCompatible = task.getNbFacts() >= 1;
				}

				boolean expectedAnswerCompatible;
				if(relation.getCondition().getNbExpectedAnswers().equals(EBoundary.ONE)) {
					expectedAnswerCompatible = task.nbExpectedAnswers() == 1;
				} else if (relation.getCondition().getNbExpectedAnswers().equals(EBoundary.SUP_ONE)) {
					expectedAnswerCompatible = task.nbExpectedAnswers() > 1;
				} else if(relation.getCondition().getNbExpectedAnswers().equals(EBoundary.EQ_NB_FACTS)) {
					expectedAnswerCompatible = task.nbExpectedAnswers() == task.getNbFacts();
				} else if(relation.getCondition().getNbExpectedAnswers().equals(EBoundary.SUP_NB_FACTS)) {
					expectedAnswerCompatible = task.nbExpectedAnswers() > task.getNbFacts();
				} else {
					expectedAnswerCompatible = task.nbExpectedAnswers() >= 1;
				}

				boolean modalityCompatible;
				if(relation.getCondition().getAnswerModality().equals(EModality.CHOICE)) {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof MultipleChoice: true;
				} else {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof EnterResponse: false;
				}

				if(factCompatible && expectedAnswerCompatible && modalityCompatible) {
					allowedCategories.addAll(relation.getGameplays());
				}
			}
		}
		
		return allowedCategories; 
	}
	
	private void selectCompatibleGameplays() {
		System.out.println("Gameplays selection");
		List<Gameplay> gameplays = new ArrayList<>();
		for (RoomElements room : dungeonElements.getRoomsElements()) {
			if(room.getTask() != null) {
				List<GPCategory> validCategories = new ArrayList<>(getValidCategoriesFromRelations(room.getTask()));
				do {
					GPCategory aCategorie = validCategories.get(random.nextInt(validCategories.size()));
					gameplays = getQuestionGameplayForCategorieType(aCategorie, room.getTask());
					validCategories.remove(aCategorie);
				} while(gameplays.isEmpty());
				
				Gameplay gameplay = gameplays.get(random.nextInt(gameplays.size()));
				room.setGameplay(gameplay);
			} else if(!room.isExit() && !room.isEntry()) {
				gameplays = getNoQuestionRoomGameplay();
				Gameplay gameplay = gameplays.get(random.nextInt(gameplays.size()));
				room.setGameplay(gameplay);
			}
			
			
		}
	}

	private List<Gameplay> getNoQuestionRoomGameplay(){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			if(gp instanceof NoQuestionGameplay) {
				compatibleGameplays.add(gp);
			}
		}
		return compatibleGameplays;
	}
	
	private List<Gameplay> getQuestionGameplayForCategorieType(GPCategory category, ATask task){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			if(gp instanceof QuestionGameplay) {
				if(((QuestionGameplay) gp).getCategory().equals(category) && respectValidationMethod((QuestionGameplay) gp, task) && respectGameplayTaskTypeRestriction((QuestionGameplay) gp, task)) {
					compatibleGameplays.add(gp);
				}
			}
		}
		return compatibleGameplays;
	}
	
	private boolean respectValidationMethod(QuestionGameplay gameplay, ATask task) {
		return (task.isCheckOnLearnerAction() == gameplay.isManualValidation()) || (!task.isCheckOnLearnerAction() && gameplay.isManualValidation());
	}
	
	private boolean respectGameplayTaskTypeRestriction(QuestionGameplay gameplay, ATask task) {
		if(gameplay.getRestrictedTo().isEmpty()) {
			return true;
		} else {
			return gameplay.getRestrictedTo().contains(task.getType());
		}
	}

	
}
