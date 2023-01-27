package structures;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import generator.Directions;

/**
 * Structure that contains all possibles entries to exits for a new position (future room) in a grid. 
 * 
 * For example: E is a small room in (0,0), has one exit direction (SOUTH), and is the entry.  
 * Next room initial position is (0,-1), this structure contains all possible entries of the future room (NORTH, NORTH_EAST, NORTH_WEST)
 * and for each entries which exits are possible (depending on the occupied coordinates on the grid).
 * 
 * @author Bérénice LEMOINE
 *
 */
public class LinearRoomOrientations {

	private Map<Directions, Set<Directions>> entriesToExists; 
	
	public LinearRoomOrientations() {
		entriesToExists = new EnumMap<>(Directions.class);
	}
	
	public Set<Directions> getAllowedExits(Directions entry){
		if(entriesToExists.containsKey(entry)) {
			return entriesToExists.get(entry);
		}
		return null; 
	}
	
	/*public void addAnOrientation(Directions entry, Directions exit) {
		Set<Directions> orientations = new HashSet<>();
		orientations.add(exit);
		if(entriesToExists.containsKey(entry)) {
			orientations.addAll(entriesToExists.get(entry));
		} 
		entriesToExists.put(entry, orientations);
	}*/
	
	public void addAnOrientation(Directions entry, Set<Directions> exits) {
		Set<Directions> orientations = new HashSet<>();
		orientations.addAll(exits);
		if(entriesToExists.containsKey(entry)) {
			orientations.addAll(entriesToExists.get(entry));
		} 
		entriesToExists.put(entry, orientations);
	}
	
	public boolean hasEligibleOrientation() {
		return !entriesToExists.keySet().isEmpty();
	}
	
	/**
	 * Each entry has multiple possible exits. 
	 * This method removes exits of entry's possible exits list. 
	 * @param entry
	 * @param exit
	 */
	public void removeExitForEntry(Directions entry, Directions exit) {
		if(entriesToExists.containsKey(entry)) {
			entriesToExists.get(entry).remove(exit);
		}
		if(entriesToExists.get(entry).isEmpty()) {
			entriesToExists.remove(entry);
		}
	}
	
	public List<Directions> eligibleEntries(){
		return entriesToExists.keySet().stream().collect(Collectors.toList());
	}
}
