package generators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import generator.AComponent;
import generator.ATask;
import generator.Ability;
import generator.Curse;
import generator.CurseEligibility;
import generator.Dungeon;
import generator.EBoundary;
import generator.EModality;
import generator.EnterResponse;
import generator.Equipment;
import generator.GPCategory;
import generator.Gameplay;
import generator.Item;
import generator.LearnerPlayer;
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
	private LearnerPlayer learnerPlayer;
	
	public GameElementsGenerator(ModelsManager modelAccess,  DungeonElements dungeonElements, LearnerPlayer learnerPlayer) {
		this.dungeonElements = dungeonElements;
		this.modelAccess = modelAccess;
		this.learnerPlayer = learnerPlayer;
		random = new Random();
	}
	
	public void generateGPandCurses() {
		selectCurses();
		unlockGameplays();
		selectCompatibleGameplays();
	}
	
	private void selectCurses() {
		for(Curse curse: getAvailableCurses()) {
			int headsOrtails = random.nextInt(2);
			if(headsOrtails == 1) {
				dungeonElements.addCurse(curse);
			}
		}		
	}
	
	private List<Curse> getAvailableCurses(){
		List<Curse> curses = new ArrayList<>(); 
		
		int playerLevel = learnerPlayer.getProgression().getPlayerProgress().getCurrentLevel();
		
		for(CurseEligibility curse: modelAccess.getGameDescriptionModel().getLevelsDifficultyProgress().getCursesAvailabilities()) {
			if(curse.getStartLevel() <= playerLevel) {
				curses.add(curse.getCurse()); 
			}
		}
		return curses; 
	}
	
	private void unlockGameplays() {
		List<Ability> abilities = getCurrentlyLockedAbilities();
		for(Gameplay gameplay: this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			gameplay.setLocked(hasGameplayLockedAbilities(gameplay, abilities));
		}
	}
	
	private boolean hasGameplayLockedAbilities(Gameplay gameplay, List<Ability> lockedAbilities) {
		for(AComponent comp: gameplay.getComponents()) {
			if(lockedAbilities.contains(comp.getAllowedAbility())) {
				return true;
			}
		}
		return false;
	}
	
	private List<Ability> getInitallyLockedAbilities() {
		List<Ability> abilities = new ArrayList<>();
		for(Equipment equipment: this.modelAccess.getGameDescriptionModel().getElements().getEquipments().getEquipments()) {
			if(equipment.getLockedAbilities() != null) {
				abilities.addAll(equipment.getLockedAbilities());
			}
		}
		return abilities;
	}
	
	private List<Ability> getUnlockedAbilityByPlayer() {
		List<Ability> abilities = new ArrayList<>();
		if(learnerPlayer.getProgression().getPlayerProgress().getItems() != null) {
			for(Item item: learnerPlayer.getProgression().getPlayerProgress().getItems().getItems()) {
				if(item.isBought() && item.isActivated()) {
					abilities.addAll(item.getEquipment().getLockedAbilities());
				}
			}
		}
		return abilities;
	}
	
	private List<Ability> getCurrentlyLockedAbilities() {
		List<Ability> abilities = new ArrayList<>(getInitallyLockedAbilities());
		abilities.removeAll(getUnlockedAbilityByPlayer());
		return abilities;
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
			if(gp instanceof NoQuestionGameplay && !gp.isLocked()) {
				compatibleGameplays.add(gp);
			}
		}
		return compatibleGameplays;
	}
	
	private List<Gameplay> getQuestionGameplayForCategorieType(GPCategory category, ATask task){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			if(gp instanceof QuestionGameplay && !gp.isLocked()) {
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
