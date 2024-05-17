package game_dimension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.AComponent;
import generator.Dungeon;
import generator.Gameplay;
import generator.Room;
import generator.Structure;
import generators.ALGAGenerator;
import structures.DidacticDomain;

class PreferencesSelectionTest {
	
	private List<String> defaultLockedAbilities;
	private List<Dungeon> generatedDungeons; 
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		initializeDefaultAbilities();
		if(!info.getTags().isEmpty()) {
			String learnerID = new ArrayList<>(info.getTags()).get(0);
			generatedDungeons = generateXDungeons(new ALGAGenerator(DidacticDomain.MATHEMATICS, true, learnerID, "Contexts.xmi", "GAMEPLAY_TEST"), 75);
		}
	}
	
	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	
	private void initializeDefaultAbilities() {
		defaultLockedAbilities = new ArrayList<>();
		defaultLockedAbilities.add("PUSHABLE");
		defaultLockedAbilities.add("BREAKABLE");
		defaultLockedAbilities.add("ROTABLE");
		defaultLockedAbilities.add("OPENABLE");
		defaultLockedAbilities.add("FOLLOWABLE");
		defaultLockedAbilities.add("CROSSABLE");
		defaultLockedAbilities.add("CATCHABLE");
	}
	
	private boolean gameplayContainsRestrictedAbilities(String restrictedAbility, Gameplay gameplay) {
		List<String> abilities = new ArrayList<>();
		abilities.add(restrictedAbility);
		return gameplayContainsRestrictedAbilities(abilities, gameplay);
	}
	
	private boolean gameplayContainsRestrictedAbilities(List<String> restrictedAbilities, Gameplay gameplay) {
		for (String ability: getGameplayAbilities(gameplay)) {
			if(restrictedAbilities.contains(ability)) {
				return true;
			}
		}
		return false;
	}
	
	
	private List<String> getGameplayAbilities(Gameplay gameplay){
		List<String> abilities = new ArrayList<>();
		for(AComponent component: gameplay.getComponents()) {
			buildListAbilities(component, abilities);
		}
		return abilities;
	}

	
	private void buildListAbilities(AComponent component, List<String> abilities) {
		if(component instanceof Structure) {
			for(AComponent aComponent: ((Structure) component).getComponents()) {
				buildListAbilities(aComponent, abilities);
			}
		} else {
			abilities.add(component.getAllowedAbility().getName());
		}
	}
	
	
	
	@Test
	@Tag(value = "LP01GP")
	void nothingIsBoughtTest() {
		for (Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null) {
					assertFalse(gameplayContainsRestrictedAbilities(defaultLockedAbilities, room.getGameplay()));
				}
			}
		}
	}
	
	private boolean abilityAppearedAtLeastOnce(Dungeon dungeon, String ability) {
		for(Room room: dungeon.getRooms()) {
			if(room.getGameplay() != null && gameplayContainsRestrictedAbilities(ability, room.getGameplay())) {
				return true;
			}
		}
		return false;
	}
	
	@Test
	@Tag(value = "LP03GP")
	void everythingIsBoughtButNotActivatedTest() {
		for (Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null) {
					assertFalse(gameplayContainsRestrictedAbilities(defaultLockedAbilities, room.getGameplay()));
				}
			}
		}
	}
	
	private Map<String, Boolean> initialiseItemMap(List<String> unlockedAbilities){
		Map<String, Boolean> items = new HashMap<>();
		for(String ability: unlockedAbilities) {
			items.put(ability, false);
		}
		return items;
	}
	
	private boolean isAllAppeared(Map<String, Boolean> items) {
		for(String ability: items.keySet()) {
			if(!items.get(ability)) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	void everythingIsBoughtAndActivatedTest() throws NonExistantLearnerPlayerException, ContextNotFoundException {
		Map<String, Boolean> items = initialiseItemMap(defaultLockedAbilities);
		ALGAGenerator generator = new ALGAGenerator(DidacticDomain.MATHEMATICS, true, "LP02GP", "Contexts.xmi", "GAMEPLAY_TEST");
		while(!isAllAppeared(items)) {
			Dungeon dungeon = generator.generate();
			for(String ability: defaultLockedAbilities) {
				if(!items.get(ability)) {
					items.put(ability, abilityAppearedAtLeastOnce(dungeon, ability));
				}
			}
		}
		
		assertTrue(true);
	}
	
	
	@Test
	@Tag(value = "LP04GP")
	void someAreBoughtAndActivatedSomeAreBoughtAndNotActivatedTest() throws NonExistantLearnerPlayerException, ContextNotFoundException {
		List<String> unlockedAbilities = new ArrayList<>();
		unlockedAbilities.add("CATCHABLE");
		Map<String, Boolean> items = initialiseItemMap(unlockedAbilities);
		ALGAGenerator generator = new ALGAGenerator(DidacticDomain.MATHEMATICS, true, "LP04GP", "Contexts.xmi", "GAMEPLAY_TEST");
		while(!isAllAppeared(items)) {
			Dungeon dungeon = generator.generate();
			for(String ability: unlockedAbilities) {  
				if(!items.get(ability)) {
					items.put(ability, abilityAppearedAtLeastOnce(dungeon, ability));
				}
			}
		}
		
		assertTrue(true);
		
		List<String> unactivatedAbilities = new ArrayList<>();
		unlockedAbilities.add("FOLLOWABLE");
		unlockedAbilities.add("OPENABLE");
		
		for (Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null) {
					assertFalse(gameplayContainsRestrictedAbilities(unactivatedAbilities, room.getGameplay()));
				}
			}
		}
	}
	
}
