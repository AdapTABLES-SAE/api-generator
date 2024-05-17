package old;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.Ability;
import generator.Dungeon;
import generator.Room;
import generators.ALGAGenerator;
import structures.DidacticDomain;

class GameplaySelectionTest {
	
	private Map<String, List<String>> gameplaysByAbility;
	private List<Dungeon> generatedDungeons;	
	
	@BeforeEach
	void initDataSet(TestInfo info) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		gameplaysByAbility = new HashMap<>();
		instanciateGameplayByAbilities();
		String learnerID = new ArrayList<>(info.getTags()).get(0);
		generatedDungeons = generateXDungeons(new ALGAGenerator(DidacticDomain.MATHEMATICS, true, learnerID, "Classrooms.xmi", "GAMEPLAY_TEST"), 150);
	}
	
	private List<Dungeon> generateXDungeons(ALGAGenerator generator, int quantityX) {
		List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < quantityX; i++) {
			dungeons.add(generator.generate());
		}
		return dungeons;
	}
	
	private void instanciateGameplayByAbilities() {
		String[] movable_names = {"GP_UNIQUE_MOVABLE","GP_MULTIPLE_MOVABLE", "GP_MULTIPLE_MOVEABLE_STRUCT"};
		String[] rotable_names = {"GP_UNIQUE_ROTABLE","GP_MULTIPLE_ROTABLE"};
		String[] pushable_names = {"GP_UNIQUE_PUSHABLE","GP_MULTIPLE_PUSHABLE","GP_UNIQUE_PUSHABLE-LEFT","GP_MULTIPLE_PUSHABLE-LEFT"};
		String[] openable_names = {"GP_UNIQUE_OPENABLE","GP_MULTIPLE_OPENABLE"};
		String[] crossable_names = {"GP_UNIQUE_CROSSABLE"};
		String[] catchable_names = {"GP_UNIQUE_CATCHABLE","GP_MULTIPLE_	CATCHABLE"};
		
		gameplaysByAbility.put("MOVABLE", Arrays.asList(movable_names));
		gameplaysByAbility.put("ROTABLE", Arrays.asList(rotable_names));
		gameplaysByAbility.put("PUSHABLE", Arrays.asList(pushable_names));
		gameplaysByAbility.put("OPENABLE", Arrays.asList(openable_names));
		gameplaysByAbility.put("CROSSABLE", Arrays.asList(crossable_names));
		gameplaysByAbility.put("CATCHABLE", Arrays.asList(catchable_names));
	}
	
	private boolean isRestrictedAbility(Ability ability) {
		return gameplaysByAbility.containsKey(ability.getName());
	}
	
	private List<String> getAllInitialyRestrictedGameplayNames() {
		return new ArrayList<>(gameplaysByAbility.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
	}
	
	@Test
	@Tag(value = "LP01")
	void restrictedGameplayNeverAppear() {
		for (Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null) {
					assertFalse(getAllInitialyRestrictedGameplayNames().contains(room.getGameplay().getName()));
				}
			}
		}
	}
	
	private String getAbilityFromRestrictedGameplay(String gameplayName) {
		for (String key: gameplaysByAbility.keySet()) {
			if(gameplaysByAbility.get(key).contains(gameplayName)) {
				return key;
			}
		}
		return null;
	}

	@Test
	@Tag(value = "LP02") // TODO : Re-think how to do these tests !!!  
	void atLeastOneGameplayOfEachRestrictedAbilityAppearsOnce() {
		List<String> restrictedGameplayAbilityAppearence = new ArrayList<>();
		for (Dungeon dungeon: generatedDungeons) {
			for(Room room: dungeon.getRooms()) {
				if(room.getGameplay() != null && getAllInitialyRestrictedGameplayNames().contains(room.getGameplay().getName())) {
					String ability = this.getAbilityFromRestrictedGameplay(room.getGameplay().getName());
					if(ability != null) {
						restrictedGameplayAbilityAppearence.add(ability);
					} else {
						System.err.println("There is a problem");
					}
				}
			}
		}
		assertTrue(restrictedGameplayAbilityAppearence.contains("MOVABLE"));
		/*assertTrue(restrictedGameplayAbilityAppearence.contains("ROTABLE"));
		assertTrue(restrictedGameplayAbilityAppearence.contains("PUSHABLE"));
		assertTrue(restrictedGameplayAbilityAppearence.contains("OPENABLE"));
		assertTrue(restrictedGameplayAbilityAppearence.contains("CROSSABLE"));
		assertTrue(restrictedGameplayAbilityAppearence.contains("CATCHABLE"));*/
		
	}
}
