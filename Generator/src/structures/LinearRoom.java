package structures;

import generator.Directions;
import generator.Room;
import generator.RoomAccess;

/**
 * Structure with necessary components to build a Linear Dungeon. 
 * A LinearRoom contains: a Room, the chosen room entry, and the chosen room exit. 
 * 
 * The dungeon entries are build using the room and its exits, for example: <code> new LinearRoom(new RoomImpl(), Directions.SOUTH) </code>
 * Other rooms are build, for example: <code> new LinearRoom(new RoomImpl(), Directions.NORTH, Directions.SOUTH) </code>
 * @author Bérénice LEMOINE
 *
 */
public class LinearRoom {

	private Room room;
	private Directions entry;
	private Directions exit;
	
	public LinearRoom(Room room, Directions chosenExit) {
		this(room, Directions.NONE, chosenExit);
	}
	
	public LinearRoom(Room room, Directions chosenEntry, Directions chosenExit) {	
		this.room = room;
		this.exit = chosenExit;
		this.entry = chosenEntry;
	}


	public Room getRoom() {
		return room;
	}

	public Directions getExit() {
		return exit;
	}
	
	public Directions getEntry() {
		return entry;
	}
	
	public RoomAccess getLastRoomAccess() {
		return room.getRoomaccess().get(room.getRoomaccess().size() - 1);
	}
}
