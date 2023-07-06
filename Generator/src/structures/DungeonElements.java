package structures;

import java.util.ArrayList;
import java.util.List;

import generator.CurrentObjectiveLevel;
import generator.DungeonMode;
import generator.GameDescription;
import generator.Level;
import generator.Objective;
import generator.ResultsByTask;

public class DungeonElements {

	private CurrentObjectiveLevel currentObjectiveLevel; 
	private List<RoomElements> roomsElements;
	private DungeonMode mode;
	
	private GameDescription gameDescriptionModel;
	
	private double nbQRooms;
	private double nbNQRooms;
	
	public DungeonElements(GameDescription gameDescriptionModel, double nbQuestionRoom, double nbNonQuestionRoom) {
		this.nbNQRooms = nbNonQuestionRoom;
		this.nbQRooms = nbQuestionRoom;
		this.gameDescriptionModel = gameDescriptionModel;
		this.roomsElements = new ArrayList<>();
	}
	
	public List<RoomElements> getRoomsElements() {
		return roomsElements;
	}
	
	public void setDungeonMode(DungeonMode mode) {
		this.mode = mode;
	}
	
	public DungeonMode getDungeonMode() {
		return mode;
	}
	
	public void setCurrentObjectiveLevel(CurrentObjectiveLevel currentObjectiveLevel) {
		this.currentObjectiveLevel = currentObjectiveLevel;
	}
	
	public Objective getChosenObjective() {
		return currentObjectiveLevel.getObjective();
	}
	
	public Level getChosenLevel() {
		return currentObjectiveLevel.getLevel();
	}
	
	public CurrentObjectiveLevel getCurrentObjectiveLevel() {
		return currentObjectiveLevel;
	}
	
	public void addRoomsElements(RoomElements roomElements) {
		this.roomsElements.add(roomElements);
	}
	
	public RoomElements getElementsOfRoom(int i) {
		return this.roomsElements.get(i);
	}
	
	public double getNbQRooms() {
		return nbQRooms;
	}
	
	public double getNbNQRooms() {
		return nbNQRooms;
	}
	
	public List<ResultsByTask> getLearnerResultsByTasks(){		
		return currentObjectiveLevel.getResults().getResultsbytask();
	}
	
	public void buildNumberOfNonQuestionRooms() {
		while(roomsElements.size() < (nbNQRooms + nbQRooms)) { // + 1 = la sortie
			roomsElements.add(new RoomElements(gameDescriptionModel));
		}
		List<RoomElements> temporary = Shuffle.shuffleRoomElements(roomsElements);
		roomsElements = new ArrayList<>();
		roomsElements.add(new RoomElements(gameDescriptionModel, true, false)); //entry
		roomsElements.addAll(temporary);
		roomsElements.add(new RoomElements(gameDescriptionModel, false, true)); //exit
	}
	
	public void print() {
		String s = "DUNGEON ELEMENTS";
		for (RoomElements roomElements : roomsElements) {
			s += "\t" + roomElements + " \n";
		}
		System.out.println(s);
	}
	
	public void shuffleRoomsOrder() {
		this.roomsElements = Shuffle.shuffleRoomElements(roomsElements);
	}
	
	public void shuffleOneElement(int i) {
		RoomElements roomE = this.roomsElements.get(i);
		this.roomsElements.remove(i);
		this.roomsElements.add(roomE);
	}
}
