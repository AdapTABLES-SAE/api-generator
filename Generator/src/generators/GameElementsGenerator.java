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
		List<Gameplay> gameplays;
		for (TaskFactPair tfp: eeManager.getFactsToQuestion()) {
			if(tfp != null) {
				// normalement on devrait se baser sur le modèle de relations pour choisir
				GPCategory chosenCategory = chooseValidCategory(tfp.getTask());
				//System.out.println(chosenCategory);
				gameplays = getGameplayOfCategorieAndType(chosenCategory, tfp.getTask());
				//System.out.println(gameplays);
				Gameplay gp = gameplays.get(random.nextInt(gameplays.size()));
				gameElementManager.add(gp, tfp);	
			} else {
				gameElementManager.add(null, tfp);
			}
		}
	}
	
	private GPCategory chooseValidCategory(ATask task) {
		// TODO : based on relation MM 
		
		if(task.getResponseModality() instanceof EnterResponse) {
			return GPCategory.DIRECT_RESPONSE;
		}
		if(task.getNbFacts() > 1 || (task instanceof CompletionTask && ((CompletionTask) task).getNbMissingElements() > 1) || task instanceof MembershipIDTask) {
			List<GPCategory> gpc = new ArrayList<>();
			gpc.add(GPCategory.SELECT_MULTIPLE);
			if(!(task instanceof IdentificationTask)) { gpc.add(GPCategory.MOVE_MULTIPLE);}
			
			return gpc.get(random.nextInt(gpc.size()));
		}
		
		List<GPCategory> gpc = new ArrayList<>();
		gpc.add(GPCategory.SELECT_UNIQUE);
		gpc.add(GPCategory.MOVE_UNIQUE);
		return gpc.get(random.nextInt(gpc.size()));
		
	}
	
	private List<Gameplay> getGameplayOfCategorieAndType(GPCategory category, ATask task){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		//System.out.println(task.getID()+" "+task.validationOnLearnerAction()+ " "+ task.getType());
		for (Gameplay gp : this.gameDescription.getGameplays().getGameplays()) {
			/*System.out.println("\t"+gp.getCategory()+" "+gp.isHasIntegratedPropositions() + " " +gp.getRestrictedTo());
			System.out.println("\t cat"+gp.getCategory().equals(category));
			System.out.println("\t"+gp.isManualValidation());
			System.out.println("\t"+respectGameplayTaskTypeRestriction(gp, task));*/

			if(gp.getCategory().equals(category) && respectValidationMethod(gp, task) && respectGameplayTaskTypeRestriction(gp, task)) {
				compatibleGameplays.add(gp);
			}/* else {
				System.out.println("NOT ADDED");
			}*/
		}
		return compatibleGameplays;
	}
	
	private boolean respectValidationMethod(Gameplay gameplay, ATask task) {
//		System.err.println(task.validationOnLearnerAction()+" "+gameplay.isManualValidation());
		return task.validationOnLearnerAction() == gameplay.isManualValidation();
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
