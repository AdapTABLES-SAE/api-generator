package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gameplaygenerator_maths.GameplayGenerator;
import generator.Dungeon;
import generator.EnterResponse;
import generator.GPCategory;
import generator.GameDescription;
import generator.Gameplay;
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
			// normalement on devrait se baser sur le modèle de relations pour choisir
			GPCategory chosenCategory;
			if(tfp.getTask().getResponseModality() instanceof EnterResponse) { // TODO : a changer ensuite
				chosenCategory = GPCategory.DIRECT_RESPONSE;
			} else {
				System.err.println("Number of facts "+tfp.getNumberOfFacts()+" -- task : "+tfp.getTask().getID());
				chosenCategory = tfp.getNumberOfFacts() == 1? GPCategory.SELECT_UNIQUE: GPCategory.SELECT_MULTIPLE;
			}
			gameplays = getGameplayOfCategorieAndType(chosenCategory);
			
			Gameplay gp = gameplays.get(random.nextInt(gameplays.size()));
			gameElementManager.add(gp, tfp);
		}
	}
	
	private List<Gameplay> getGameplayOfCategorieAndType(GPCategory category){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.gameDescription.getGameplays().getGameplays()) {
			if(gp.getCategory().equals(category)) {
				compatibleGameplays.add(gp);
			}
		}
		return compatibleGameplays;
	}

	public GameElementsManager getGameElementManager() {
		return gameElementManager;
	}
	
	
}
