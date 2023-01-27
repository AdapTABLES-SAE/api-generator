package structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.Directions;
import generator.Room;
import generator.RoomAccess;
import generator.SmallRoomType;
import managers.GridManager;

/**
 * Structure that only contains a Room (RoomImpl) and methods necessary to build Labyrinthine Dungeons. 
 * @author Bérénice LEMOINE
 *
 */
public class LabyrinthineRoom {

	private Room room;
	
	public LabyrinthineRoom(Room room) {
		this.room = room;
	}

	public Directions getAvailableExit(GridManager gridManager) {
		List<Directions> allowed = new ArrayList<>(room.getRoomtype().getDirections());
		for (Directions direction : room.getRoomtype().getDirections()) {
			if(!gridManager.isAvailableDirection(getRoomCoordinates(), direction)) {
				allowed.remove(direction);
			}
		}
		if(allowed.isEmpty()) { return Directions.NONE; }
		else { return allowed.get(new Random().nextInt(allowed.size())); }
	}
	
	public RoomAccess getLastRoomAccess() {
		return room.getRoomaccess().get(room.getRoomaccess().size() - 1);
	}
	
	public Room getRoom() {
		return room;
	}

	public Coordinate getRoomCoordinates() {
		return new Coordinate(room.getX(), room.getY()); 
	}
	
	public boolean isRoomTypeSmall() {
		return room.getRoomtype() instanceof SmallRoomType;
	}
	
	public boolean hasRoomAccessWith(Room room) {
		for (RoomAccess ra : this.room.getRoomaccess()) {
			if(room.getRoomaccess().contains(ra.getOtherroomaccess())) {
				return true;
			}
		}
		return false;
	}
}
