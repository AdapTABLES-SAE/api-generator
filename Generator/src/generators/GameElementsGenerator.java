package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gameplaygenerator_maths.MTGameplayGenerator;
import generator.Dungeon;
import generator.GPCategory;
import generator.GPType;
import generator.GameDescription;
import generator.Gameplay;
import generator.MultipleChoice;
import generator.Room;
import managers.EducationElementsManager;
import managers.GameElementsManager;
import structures.TaskFactPair;

public class GameElementsGenerator {

	private Random random;
	private EducationElementsManager eeManager;
	private GameDescription gameDescription; 
	
	private GameElementsManager gameElementManager;
	private MTGameplayGenerator mtGameplayGenerator;
	
	public GameElementsGenerator(GameDescription gameDescription, EducationElementsManager eeManager) {
		this.eeManager = eeManager;
		this.gameDescription = gameDescription;
		this.gameElementManager = new GameElementsManager();
		this.mtGameplayGenerator = new MTGameplayGenerator(gameDescription);
		random = new Random();
	}
	
	public void generateGPandCurses() {
		selectCorrespondingGameplays(); 
	}
	
	public Dungeon generateRoomContent(Dungeon generatedDungeon) {
		for (Room r : generatedDungeon.getRooms()) {
			if(r.getTask() != null) {
				r.getPositionedElement().addAll(mtGameplayGenerator.generateGameplayElements(r.getGameplay(), r.getTask(), r.getQuestionedFacts(), r.getRoomtype()));
				r.getStatements().addAll(mtGameplayGenerator.generateStatement(r.getQuestionedFacts(), r.getRoomtype()));
			}
		}
		return generatedDungeon;
	}

	private void selectCorrespondingGameplays() {
		List<Gameplay> gameplays;
		for (TaskFactPair tfp: eeManager.getFactsToQuestion()) {
			// normalement on devrait se baser sur le modèle de relations pour choisir
			GPCategory chosenCategory;
			if(tfp.getTask().getResponseModality() instanceof MultipleChoice || tfp.getTask().getResponseModality() == null) { // TODO : a changer ensuite
				chosenCategory = GPCategory.POSITION;
			} else {
				chosenCategory = GPCategory.DIRECT_RESPONSE;
			}
			if(tfp.getNumberOfFacts() == 1) {
				gameplays = getGameplayOfCategorieAndType(chosenCategory, GPType.UNIQUE);
			} else {
				gameplays = getGameplayOfCategorieAndType(chosenCategory, GPType.MULTIPLE);
			}
			
			Gameplay gp = gameplays.get(random.nextInt(gameplays.size()));
			gameElementManager.add(gp, tfp);
		}
	}
	
	private List<Gameplay> getGameplayOfCategorieAndType(GPCategory category, GPType type){
		List<Gameplay> compatibleGameplays = new ArrayList<>();
		for (Gameplay gp : this.gameDescription.getGameplays().getGameplays()) {
			if(gp.getCategory().equals(category) && gp.getType().equals(type)) {
				compatibleGameplays.add(gp);
			}
		}
		return compatibleGameplays;
	}

	public GameElementsManager getGameElementManager() {
		return gameElementManager;
	}
	
	
}
