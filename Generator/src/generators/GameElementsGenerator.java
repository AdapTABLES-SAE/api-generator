package generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import exceptions.MapGameplayElementException;
import exceptions.NoCompatibleGameplayException;
import generator.AComponent;
import generator.ATask;
import generator.Ability;
import generator.CorrectnessValue;
import generator.Curse;
import generator.CurseEligibility;
import generator.Dungeon;
import generator.EBoundary;
import generator.ECorrectness;
import generator.EModality;
import generator.EStatementType;
import generator.EnterResponse;
import generator.Equipment;
import generator.GPCategory;
import generator.Gameplay;
import generator.Item;
import generator.MultipleChoice;
import generator.NoQuestionGameplay;
import generator.PositionedElement;
import generator.QuestionGameplay;
import generator.Relation;
import generator.Room;
import generator.Structure;
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
	
	public void generateGPandCurses() throws NoCompatibleGameplayException {
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
		
		int playerLevel = modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getCurrentLevel();
		
		for(CurseEligibility curse: modelAccess.getGameDescriptionModel().getLevelsDifficultyProgress().getCursesAvailabilities()) {
			if(curse.getStartLevel() <= playerLevel) {
				curses.add(curse.getCurse()); 
			}
		}
		
		ALGAGenerator.LOGGER.severe("curses "+curses);
		return curses; 
	}
	
	private void unlockGameplays() {
		List<Ability> abilities = getCurrentlyLockedAbilities();
		System.out.println("Locked abilities "+abilities);
		for(Gameplay gameplay: this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			//System.out.println("***********************************");
			gameplay.setLocked(hasGameplayLockedAbilities(gameplay, abilities));
			System.out.println(gameplay.getName()+" locked? "+gameplay.isLocked());
			//System.out.println("***********************************");
		}
	}
	
	private boolean hasGameplayLockedAbilities(Gameplay gameplay, List<Ability> lockedAbilities) {
		List<Boolean> isLockedAbilities = new ArrayList<>(); 
		for(AComponent comp: gameplay.getComponents()) {
			hasElementLockedAbilities(comp, lockedAbilities, isLockedAbilities);
		}
		//System.out.println("islocked "+isLockedAbilities);

		return isLockedAbilities.contains(true);
	}
	
	private void hasElementLockedAbilities(AComponent component, List<Ability> lockedAbilities, List<Boolean> isLockedAbilities) {
		if(component instanceof Structure) {
			for (AComponent comp: ((Structure) component).getComponents()) {
				hasElementLockedAbilities(comp, lockedAbilities, isLockedAbilities);
			}
		}
		//System.out.println("comp "+component.getAllowedAbility()+""+ lockedAbilities.contains(component.getAllowedAbility()));
		isLockedAbilities.add(lockedAbilities.contains(component.getAllowedAbility()));
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
		if(modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getItems() != null) {
			for(Item item: modelAccess.getLearnerPlayer().getProgression().getPlayerProgress().getItems().getItems()) {
				if(item.isBought() && item.isActivated()) {
					abilities.addAll(item.getEquipment().getLockedAbilities());
				}
			}
		}
		System.out.println("Unlocked by player "+abilities);
		return abilities;
	}
	
	
	private List<Ability> getCurrentlyLockedAbilities() {
		List<Ability> abilities = new ArrayList<>(getInitallyLockedAbilities());
		abilities.removeAll(getUnlockedAbilityByPlayer());
		return abilities;
	}
	
	public Dungeon generateRoomContent(Dungeon generatedDungeon) throws MapGameplayElementException {
		ConcreteGameplayGenerator gameplayGenerator = new ConcreteGameplayGenerator(modelAccess);
		//System.out.println(generatedDungeon.getRooms().size()+ " " + dungeonElements.getRoomsElements().size());
		for (Room room: generatedDungeon.getRooms()) {
			if(room.getGameplay() != null) {
				//System.out.println(room.getX()+" "+room.getY()+" "+room.getGameplay());
				room.getPositionedElement().addAll(gameplayGenerator.buildPositionedElements(this.getCorrespondingRoomElements(room)));
				computeNumberOfExpectedAnswers(room);
			} 
		}
		
		return generatedDungeon;
	}
	
	
	private void computeNumberOfExpectedAnswers(Room room) {
		int number = 0;
		for(PositionedElement element: room.getPositionedElement()) {
			if(element.getCorrectness() != null) {
				ECorrectness correctness = ((CorrectnessValue) element.getCorrectness().getValue()).getValue();
				if(correctness.equals(ECorrectness.CORRECT)) {
					number++;
				}
			}
		}
		room.setNbExpectedAnswers(number);
	}
	
	private RoomElements getCorrespondingRoomElements(Room room) {
		for (RoomElements rElem: dungeonElements.getRoomsElements()) {
			if(room.getX() == rElem.getRoom().getX() && room.getY() == rElem.getRoom().getY()) {
				return rElem;
			}
		}
		return null;
	}
	
	
	private Map<GPCategory, Set<EStatementType>> getValidCategoriesFromRelations(ATask task){
		Map<GPCategory, Set<EStatementType>> allowedCategoriesWithStatements = new HashMap<>(); 
		
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
					expectedAnswerCompatible = task.getNbExpectedAnswers() == 1;
				} else if (relation.getCondition().getNbExpectedAnswers().equals(EBoundary.SUP_ONE)) {
					expectedAnswerCompatible = task.getNbExpectedAnswers() > 1;
				} else if(relation.getCondition().getNbExpectedAnswers().equals(EBoundary.EQ_NB_FACTS)) {
					expectedAnswerCompatible = task.getNbExpectedAnswers() == task.getNbFacts();
				} else if(relation.getCondition().getNbExpectedAnswers().equals(EBoundary.SUP_NB_FACTS)) {
					expectedAnswerCompatible = task.getNbExpectedAnswers() > task.getNbFacts();
				} else {
					expectedAnswerCompatible = task.getNbExpectedAnswers() >= 1;
				}

				boolean modalityCompatible;
				if(relation.getCondition().getAnswerModality().equals(EModality.CHOICE)) {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof MultipleChoice: true;
				} else {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof EnterResponse: false;
				}
				//System.out.println(task.getNbExpectedAnswers()+" "+task.getNbFacts());	
				
				

				//System.out.println("fact comp "+factCompatible+" expectedanswers "+expectedAnswerCompatible+" modality "+modalityCompatible);
				if(factCompatible && expectedAnswerCompatible && modalityCompatible) {
					//allowedCategories.addAll(relation.getGameplays());
					for(GPCategory category: relation.getGameplays()) {
						Set<EStatementType> types = new HashSet<>();
						if(task.isGraphicTask()) {
							if(relation.getCondition().getStatementTypes().contains(EStatementType.GRAPHIC)) {
								types.add(EStatementType.GRAPHIC);
							}
						} else {
							types.addAll(relation.getCondition().getStatementTypes());
							if(types.contains(EStatementType.GRAPHIC)) {
								types.remove(EStatementType.GRAPHIC);
							}
						}
						if(!types.isEmpty()) { allowedCategoriesWithStatements.put(category, types); }
					}
				}
			}
		}
		//System.out.println("Valid categories "+allowedCategories);
		return allowedCategoriesWithStatements; 
	}
	
	private void selectCompatibleGameplays() throws NoCompatibleGameplayException {
		ALGAGenerator.LOGGER.info("Selection of compatible gameplay");
		List<Gameplay> gameplays = new ArrayList<>();
		for (RoomElements room : dungeonElements.getRoomsElements()) {
			if(room.getTask() != null) {
				Map<GPCategory, Set<EStatementType>> validCategoriesFromRelations = getValidCategoriesFromRelations(room.getTask());
				List<GPCategory> validCategories = new ArrayList<>(validCategoriesFromRelations.keySet());
				//System.out.println("Categorie valid " + validCategories);
				do {
					GPCategory aCategorie = validCategories.get(random.nextInt(validCategories.size()));
					//System.out.println("Categorie "+aCategorie);
					gameplays = getQuestionGameplayForCategorieType(aCategorie, room.getTask(), validCategoriesFromRelations.get(aCategorie));
					validCategories.remove(aCategorie);
				} while(gameplays.isEmpty() && !validCategories.isEmpty());
				
				if(gameplays.isEmpty()) {
					ALGAGenerator.LOGGER.severe("No gameplay was found for task="+room.getTask().getID());
					throw new NoCompatibleGameplayException(room.getTask());
				} else {

					Gameplay gameplay = gameplays.get(random.nextInt(gameplays.size()));
					room.setGameplay(gameplay);
					ALGAGenerator.LOGGER.severe("Gameplays found for task="+room.getGameplay().getName());

				}
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
	
	private List<Gameplay> getQuestionGameplayForCategorieType(GPCategory category, ATask task, Set<EStatementType> allowedStatementTypes){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
			if(gp instanceof QuestionGameplay && !gp.isLocked()) {
				//System.out.println("\t"+gp.getName());
				//System.out.println("\t cat "+((QuestionGameplay) gp).getCategory().equals(category));
				//System.out.println("\t validation "+respectValidationMethod((QuestionGameplay) gp, task));
				//System.out.println("\t restriction "+respectGameplayTaskTypeRestriction((QuestionGameplay) gp, task, allowedStatementTypes));
				//System.out.println("\t undoable "+respectUndoable((QuestionGameplay) gp, task));

				if(((QuestionGameplay) gp).getCategory().equals(category) && 
						respectValidationMethod((QuestionGameplay) gp, task) && 
						respectGameplayTaskTypeRestriction((QuestionGameplay) gp, task, allowedStatementTypes) &&
						respectUndoable((QuestionGameplay) gp, task)) {
					compatibleGameplays.add(gp);
				}
			}
		}
		return compatibleGameplays;
	}
	
	private boolean respectUndoable(QuestionGameplay gameplay, ATask task) {
		return (task.isCheckOnLearnerAction() && gameplay.isUndoable()) || task.isCheckOnLearnerAction() == false;
	}
	
	private boolean respectValidationMethod(QuestionGameplay gameplay, ATask task) {
		return (task.isCheckOnLearnerAction() == gameplay.isManualValidation()) || (!task.isCheckOnLearnerAction() && gameplay.isManualValidation());
	}
	
	private boolean respectGameplayTaskTypeRestriction(QuestionGameplay gameplay, ATask task, Set<EStatementType> allowedStatementTypes) {
		return allowedStatementTypes.contains(gameplay.getStatementType()) && (gameplay.getRestrictedTo().isEmpty() 
				|| gameplay.getRestrictedTo().contains(task.getType()));
	}

	
}
