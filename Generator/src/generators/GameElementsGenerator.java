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
import generator.QuestionGameplay;
import generator.Relation;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.RoomElements;

public class GameElementsGenerator {

	private Random random;
	private DungeonElements dungeonElements;
	private ModelsManager modelAccess; 
	
	//private GameElementsManager gameElementManager;
	//private ConcreteGameplayGenerator gameplayGenerator;
	
	public GameElementsGenerator(ModelsManager modelAccess,  DungeonElements dungeonElements) {
		this.dungeonElements = dungeonElements;
		this.modelAccess = modelAccess;
		//this.gameElementManager = new GameElementsManager();
		//this.gameplayGenerator = new ConcreteGameplayGenerator(modelAccess);
		random = new Random();
	}
	
	public void generateGPandCurses() {
		//selectCorrespondingGameplays();
		setDungeonMode();
		selectCompatibleGameplays();
	}
	
	private void setDungeonMode(){
		dungeonElements.setDungeonMode(modelAccess.getContextModel().getGamecontext().getMode());
	}
	
	public Dungeon generateRoomContent(Dungeon generatedDungeon) {
		ConcreteGameplayGenerator gameplayGenerator = new ConcreteGameplayGenerator(modelAccess);
		/*for (Room r : generatedDungeon.getRooms()) {
			if(r.getTask() != null) {
				r.getPositionedElement().addAll(gameplayGenerator.buildPositionedElements((QuestionGameplay) r.getGameplay(), r.getQuestionedFacts(), r.getRoomtype()));
			}
		}*/
		
		for (RoomElements roomElements : dungeonElements.getRoomsElements()) {
			if(roomElements.getGameplay() != null) {
				roomElements.setRoomPositionedElements(gameplayGenerator.buildPositionedElements(roomElements));
			} 
		}
		
		return generatedDungeon;
	}
	
	private Set<GPCategory> getValidCategoriesFromRelations(ATask task){
		Set<GPCategory> allowedCategories = new HashSet<>(); 
		//System.out.println("TASK "+task.getType());
		
		for (Relation relation : modelAccess.getRelationsModel().getRelations()) {
			if(relation.getTask().equals(task.getType())) {
				//System.out.println("REL task "+ relation.getTask());
				//System.out.println(relation.getCondition().getAnswerModality()+" "+task.getResponseModality());
				//System.out.println(relation.getCondition().getNbFacts()+" "+task.getNbFacts());
				//System.out.println(relation.getCondition().getNbExpectedAnswers()+" "+task.nbExpectedAnswers());
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
				} else {
					expectedAnswerCompatible = task.nbExpectedAnswers() >= 1;
				}

				boolean modalityCompatible;
				if(relation.getCondition().getAnswerModality().equals(EModality.CHOICE)) {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof MultipleChoice: true;
				} else {
					modalityCompatible = (task.getResponseModality() != null)? task.getResponseModality() instanceof EnterResponse: false;
				}
				//System.out.println("\t factC "+factCompatible);
				//System.out.println("\t expectedC "+expectedAnswerCompatible);
				//System.out.println("\t modality "+modalityCompatible);
				if(factCompatible && expectedAnswerCompatible && modalityCompatible) {
					//System.out.println("On ajoute");
					allowedCategories.add(relation.getGameplay());
				}
			}
		}
		
		return allowedCategories; 
	}
	
	/*private void selectCompatibleGameplays() {
		List<Gameplay> gameplays = new ArrayList<>();
		for (TaskFactPair tfp: dungeonElements.getFactsToQuestion()) {
			if(tfp != null) {
				List<GPCategory> validCategories = new ArrayList<>(getValidCategoriesFromRelations(tfp.getTask()));
			
				do {
					GPCategory aCategorie = validCategories.get(random.nextInt(validCategories.size()));
					gameplays = getGameplayOfCategorieAndType(aCategorie, tfp.getTask());
					validCategories.remove(aCategorie);
				} while(gameplays.isEmpty());
				Gameplay gp = gameplays.get(random.nextInt(gameplays.size()));
				//	System.out.println("Chosen gp "+gp.getName()+" "+gp.getCategory());
				gameElementManager.add(gp, tfp);	
			} else {
				gameElementManager.add(null, tfp);
			}
		}
	}*/
	
	private void selectCompatibleGameplays() {
		List<Gameplay> gameplays = new ArrayList<>();
		for (RoomElements room : dungeonElements.getRoomsElements()) {
			if(room.getTask() != null) {
				List<GPCategory> validCategories = new ArrayList<>(getValidCategoriesFromRelations(room.getTask()));
				
				do {
					GPCategory aCategorie = validCategories.get(random.nextInt(validCategories.size()));
					gameplays = getGameplayOfCategorieAndType(aCategorie, room.getTask());
					validCategories.remove(aCategorie);
				} while(gameplays.isEmpty());
				
				Gameplay gameplay = gameplays.get(random.nextInt(gameplays.size()));
				room.setGameplay(gameplay);
				//System.err.println(room.getGameplay());
			}
		}
	}

	
/*	private void selectCorrespondingGameplays() {
		List<Gameplay> gameplays = new ArrayList<>();
		for (TaskFactPair tfp: dungeonElements.getFactsToQuestion()) {
			if(tfp != null) {
				// normalement on devrait se baser sur le modèle de relations pour choisir
				List<GPCategory> chosenCategories = getValidCategories(tfp.getTask());
				//System.err.println(chosenCategories);
				do {
				GPCategory aCategorie = chosenCategories.get(random.nextInt(chosenCategories.size()));
				gameplays = getGameplayOfCategorieAndType(aCategorie, tfp.getTask());
				//System.err.println("Random : "+aCategorie);
				//System.err.println("GPs : "+gameplays);
				chosenCategories.remove(aCategorie);
				} while(gameplays.isEmpty());

				//System.out.println(gameplays);
				Gameplay gp = gameplays.get(random.nextInt(gameplays.size()));
			//	System.out.println("Chosen gp "+gp.getName()+" "+gp.getCategory());
				gameElementManager.add(gp, tfp);	
			} else {
				gameElementManager.add(null, tfp);
			}
		}
	}
	
	private List<GPCategory> getValidCategories(ATask task) {
		// TODO : based on relation MM
		//System.err.println(task.getID());
		List<GPCategory> categories = new ArrayList<>();
		if(task.getResponseModality() instanceof EnterResponse) {
			categories.add(GPCategory.DIRECT_RESPONSE);
			//return new ArrayList<GPCategory>(GPCategory.DIRECT_RESPONSE);
		} else 
		if(task.getNbFacts() > 1 || (task instanceof CompletionTask && ((CompletionTask) task).getNbMissingElements() > 1) || task instanceof MembershipIDTask) {
			categories.add(GPCategory.SELECT_MULTIPLE);
			if(!(task instanceof IdentificationTask)) { categories.add(GPCategory.MOVE_MULTIPLE);}
			
		} else {
			//if((task instanceof CompletionTask && ((CompletionTask) task).getNbMissingElements() < 2)) categories.add(GPCategory.SELECT_UNIQUE);
			//categories.add(GPCategory.MOVE_UNIQUE);
			categories.add(GPCategory.ORIENT);
		}
		
		
		return categories; //.get(random.nextInt(gpc.size()));
		
	}*/
	
	private List<Gameplay> getGameplayOfCategorieAndType(GPCategory category, ATask task){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.modelAccess.getGameDescriptionModel().getGameplays().getGameplays()) {
		/*	if(gp.getCategory().equals(GPCategory.ORIENT_UNIQUE)) {
				System.out.println(task.getID()+" "+task.validationOnLearnerAction()+ " "+ task.getType());
				System.out.println("\t"+gp.getCategory()+" "+gp.isHasIntegratedPropositions() + " " +gp.getRestrictedTo());
				System.out.println("\t cat"+gp.getCategory().equals(category));
				System.out.println("\t"+respectValidationMethod(gp, task));
				System.out.println("\t"+respectGameplayTaskTypeRestriction(gp, task));
			}*/
			if(gp instanceof QuestionGameplay) {
				if(((QuestionGameplay) gp).getCategory().equals(category) && respectValidationMethod((QuestionGameplay) gp, task) && respectGameplayTaskTypeRestriction((QuestionGameplay) gp, task)) {
					compatibleGameplays.add(gp);
				}
			}

			/* else {
				System.out.println("NOT ADDED");
			}*/
			//System.out.println("finished");
		}
		return compatibleGameplays;
	}
	
	private boolean respectValidationMethod(QuestionGameplay gameplay, ATask task) {
		//System.err.println(task.validationOnLearnerAction()+" "+gameplay.isManualValidation());
		/*if(task.validationOnLearnerAction()) {
			return true;
		}*/
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
