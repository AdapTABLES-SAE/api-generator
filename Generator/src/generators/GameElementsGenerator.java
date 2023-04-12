package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gameplaygenerator_maths.GameplayGenerator;
import generator.ATask;
import generator.CompletionTask;
import generator.Dungeon;
import generator.EnterResponse;
import generator.GPCategory;
import generator.GameDescription;
import generator.Gameplay;
import generator.IdentificationTask;
import generator.MembershipIDTask;
import generator.Room;
import managers.EducationElementsManager;
import managers.GameElementsManager;
import structures.TaskFactPair;

public class GameElementsGenerator {

	private Random random;
	private EducationElementsManager eeManager;
	private GameDescription gameDescription; 
	
	private GameElementsManager gameElementManager;
	private GameplayGenerator gameplayGenerator;
	
	public GameElementsGenerator(GameDescription gameDescription, EducationElementsManager eeManager) {
		this.eeManager = eeManager;
		this.gameDescription = gameDescription;
		this.gameElementManager = new GameElementsManager();
		this.gameplayGenerator = new GameplayGenerator();
		random = new Random();
	}
	
	public void generateGPandCurses() {
		selectCorrespondingGameplays(); 
	}
	
	public Dungeon generateRoomContent(Dungeon generatedDungeon) {
		for (Room r : generatedDungeon.getRooms()) {
			if(r.getTask() != null) {
				r.getPositionedElement().addAll(gameplayGenerator.buildPositionedElements(r.getGameplay(), r.getQuestionedFacts(), r.getRoomtype()));
			}
		}
		return generatedDungeon;
	}
	

	private void selectCorrespondingGameplays() {
		List<Gameplay> gameplays = new ArrayList<>();
		for (TaskFactPair tfp: eeManager.getFactsToQuestion()) {
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
			categories.add(GPCategory.ORIENT_UNIQUE);
		}
		
		
		return categories; //.get(random.nextInt(gpc.size()));
		
	}
	
	private List<Gameplay> getGameplayOfCategorieAndType(GPCategory category, ATask task){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.gameDescription.getGameplays().getGameplays()) {
		/*	if(gp.getCategory().equals(GPCategory.ORIENT_UNIQUE)) {
				System.out.println(task.getID()+" "+task.validationOnLearnerAction()+ " "+ task.getType());
				System.out.println("\t"+gp.getCategory()+" "+gp.isHasIntegratedPropositions() + " " +gp.getRestrictedTo());
				System.out.println("\t cat"+gp.getCategory().equals(category));
				System.out.println("\t"+respectValidationMethod(gp, task));
				System.out.println("\t"+respectGameplayTaskTypeRestriction(gp, task));
			}*/
			

			if(gp.getCategory().equals(category) && respectValidationMethod(gp, task) && respectGameplayTaskTypeRestriction(gp, task)) {
				compatibleGameplays.add(gp);
			}/* else {
				System.out.println("NOT ADDED");
			}*/
			//System.out.println("finished");
		}
		return compatibleGameplays;
	}
	
	private boolean respectValidationMethod(Gameplay gameplay, ATask task) {
		//System.err.println(task.validationOnLearnerAction()+" "+gameplay.isManualValidation());
		/*if(task.validationOnLearnerAction()) {
			return true;
		}*/
		return (task.validationOnLearnerAction() == gameplay.isManualValidation()) || (!task.validationOnLearnerAction() && gameplay.isManualValidation());
	}
	
	private boolean respectGameplayTaskTypeRestriction(Gameplay gameplay, ATask task) {
		if(gameplay.getRestrictedTo().isEmpty()) {
			return true;
		} else {
			return gameplay.getRestrictedTo().contains(task.getType());
		}
	}

	public GameElementsManager getGameElementManager() {
		return gameElementManager;
	}
	
	
}
