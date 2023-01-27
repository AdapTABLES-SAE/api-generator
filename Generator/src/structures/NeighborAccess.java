package structures;

import generator.Directions;
import generator.Room;
import generator.RoomAccess;

/**
 * This class instanciate Labyrinthine dungeons rooms neighbors. 
 * A neighbor is a Room (RoomImpl) with the direction to access that room, and the direction in which you enter in the neighbor. 
 * 
 * Example : R is a small room. R2 is a large room and a neighbor to the south of R by its North-East access.
 * A NeigborAccess is instanciated has such: new NeighborAccess(R2, Directions.SOUTH, Directions.NORTH_EAST);
 * @author Bérénice LEMOINE
 *
 */
public class NeighborAccess {
	private Room room; 
	private Directions accessDirectionToNeighbor;
	private Directions neighborAccessToYou; 
	
	public NeighborAccess(Room room, Directions accessDirection2Room, Directions neighborAccessToyou) {
		this.room = room;
		this.accessDirectionToNeighbor = accessDirection2Room;
		this.neighborAccessToYou = neighborAccessToyou; 
	}
	
	public Room getRoom() {
		return room;
	}

	public Directions getAccessDirectionToNeighbor() {
		return accessDirectionToNeighbor;
	}

	public Directions getNeighborAccessToYou() {
		return neighborAccessToYou;
	}
	
	public void addNeighborAccessRoomAccess(RoomAccess roomAccess) {
		room.getRoomaccess().add(roomAccess);
	}
}
