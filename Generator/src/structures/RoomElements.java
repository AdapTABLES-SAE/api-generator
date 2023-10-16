package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generator.AComponent;
import generator.ATask;
import generator.CurrentObjectiveLevel;
import generator.ElementType;
import generator.GameDescription;
import generator.Gameplay;
import generator.PositionedElement;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.Room;
import generator.RoomType;
import generator.impl.RoomImpl;
import managers.GameElementsManager;

public class RoomElements {

	private Gameplay gameplay;
	private ATask task;
	private List<QuestionedFact> facts;
	private boolean exit;
	private boolean entry;
	
	private Room associatedRoom;
	
	private GameElementsManager gameplayManager;
	
	private Map<ElementType, Integer> elementsToQuantity; // integer = -1 when element is inside structure
	
	public boolean isExit() {
		return this.exit;
	}
	
	public boolean isEntry() {
		return this.entry;
	}
	
	public void setEntry(boolean entry) {
		this.entry = entry;
	}
	public RoomElements(GameDescription gameDescriptionModel, GameElementsManager elementManager, ATask task) {
		this(gameDescriptionModel, elementManager, task, false, false);
	}
	
	public RoomElements(GameDescription gameDescriptionModel, GameElementsManager elementManager, ATask task, boolean isEntry, boolean isExit) {
		//this.gameDescriptionModel = gameDescriptionModel;
		this.elementsToQuantity = new HashMap<>();
		this.facts = new ArrayList<>();
		this.task = task;
		this.associatedRoom = null;
		this.exit = isExit;
		this.entry = isEntry;
		this.gameplayManager = elementManager;
	}
	
	public RoomType getRoomTypeOfRoom() {
		return this.associatedRoom.getRoomtype();
	}
	
	public void setRoomPositionedElements(List<PositionedElement> elements) {
		this.associatedRoom.getPositionedElement().addAll(elements);
	}
	
	public void setRoom(Room room) {
		this.associatedRoom = new RoomImpl();
		this.associatedRoom.setX(room.getX());
		this.associatedRoom.setY(room.getY());
		this.associatedRoom.setTask(room.getTask());
		this.associatedRoom.setGameplay(room.getGameplay());
		this.associatedRoom.setRoomtype(room.getRoomtype());
	}
	
	public Room getRoom() {
		return associatedRoom;
	}
	
	public ResultsByTask getCorrespondingResultByTask(CurrentObjectiveLevel currentObjectiveLevel) {
		for (ResultsByTask rbt : currentObjectiveLevel.getResults().getResultsbytask()) {
			if(rbt.getTask().equals(this.task)) {
				return rbt;
			}
		}
		return null;
	}
	
	public RoomElements(GameDescription gameDescriptionModel, GameElementsManager elementManager, boolean isEntry, boolean isExit) {
		this(gameDescriptionModel, elementManager, null,isEntry, isExit);
	}
	
	public RoomElements(GameDescription gameDescriptionModel, GameElementsManager elementManager) {
		this(gameDescriptionModel, elementManager, null);
	}
	
	public void addQuestionedFact(QuestionedFact fact) {
		this.facts.add(fact);
	}
	
	public Map<ElementType, Integer> getElementsToQuantity() {
		return elementsToQuantity;
	}
	
	public List<QuestionedFact> getFacts() {
		return facts;
	}
	
	public ATask getTask() {
		return task;
	}
	
	public boolean isQuestionGameplay() {
		return this.facts != null;
	}
	
	public void setGameplay(Gameplay gameplay) {
		this.gameplay = gameplay;
		//System.err.println("GAMEPLAY "+gameplay.getName()+" nb components "+gameplay.getComponents().size());
		selectElementType();
	}
	
	private void selectElementType() {
		//System.err.println("************ GP = "+gameplay.getName());
		selectElementType(gameplay.getComponents());
		//System.out.println("************Elements to quantity "+this.elementsToQuantity);
	}
	
	public Gameplay getGameplay() {
		return gameplay;
	}

	private void selectElementType(List<AComponent> components) {
		this.elementsToQuantity = gameplayManager.selectElementType(components, task, facts);
	}

	public ElementType getElementTypeFor(AComponent component) {
		return this.gameplayManager.getElementTypeFor(component, elementsToQuantity, gameplay);
	}
	
	@Override
	public String toString() {
		String s = (this.gameplay != null? this.gameplay.getName(): "null")+' '+
				(this.getTask() == null? "null": this.getTask().getID())+" facts="+facts.size()+"\n";
		for (ElementType elem : elementsToQuantity.keySet()) {
			s += "\t"+elem.getType()+" -- "+elementsToQuantity.get(elem)+"\n";
		}
		return s;
	}
	
	public void printElementTypes() {
		System.out.println("--Room elements--");
		for (ElementType elem : elementsToQuantity.keySet()) {
			System.out.println("\t"+elem.getID());
		}
		if(gameplay != null) System.out.println("--Gameplay elements--"+gameplay.getName());
	}
}
