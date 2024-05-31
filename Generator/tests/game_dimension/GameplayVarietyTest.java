package game_dimension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.Dungeon;
import generator.Room;
import generators.ALGAGenerator;
import structures.DidacticDomain;

class GameplayVarietyTest {
	
	private List<Dungeon> generatedDungeons; 
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		if(!info.getTags().isEmpty()) {
			String learnerID = new ArrayList<>(info.getTags()).get(0);
			generatedDungeons = generateXDungeons(new ALGAGenerator(DidacticDomain.MATHEMATICS, true, learnerID, "Contexts.xmi", "GAMEPLAY_TEST"), 100);
		}
	}
	
	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	
	

	@Test
	@Tag(value = "LP02GP") // everything is bought and activated 
	void gameplayVarietyWithEverythingTest() {
		Map<String, Set<String>> map = task2Gameplay();
		System.err.println("MAP "+map);
		for(String taskID: map.keySet()) {
			assertTrue(map.get(taskID).size() > 1); 
		}
	}
	
	private Map<String, Set<String>> task2Gameplay() {
		Map<String, Set<String>> map = new HashMap<>();
		for(Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null && room.getTask() != null) {
					Set<String> unSet = new HashSet<>();
					if(map.containsKey(room.getTask().getID())) {
						unSet = map.get(room.getTask().getID()); 
					}
					unSet.add(room.getGameplay().getName());
					map.put(room.getTask().getID(), unSet);
				}
			}
		}
		return map;
	}
	
	@Test
	@Tag(value = "LP01GP") // nothing is bought nor activated 
	void gameplayVarietyWithNothingTest() {
		Map<String, Set<String>> map = task2Gameplay();
		System.err.println("MAP "+map);
		for(String taskID: map.keySet()) {
			assertTrue(map.get(taskID).size() > 1); 
		}
	}

}
