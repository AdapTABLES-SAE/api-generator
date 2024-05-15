package game_dimension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.Ability;
import generator.Dungeon;
import generator.ElementType;
import generator.PositionedElement;
import generator.Room;
import generator.StatementElementType;
import generator.Structure;
import generators.ALGAGenerator;

class GameElementsVarietyTest {
	
	private ALGAGenerator generator;// = new ALGAGenerator(true, "TOTO", "Contexts.xmi", "GAMEPLAY_TEST");
	
	@BeforeEach
	void initDataSet() throws NonExistantLearnerPlayerException, ContextNotFoundException {
		generator = new ALGAGenerator(true, "LPGPELEM", "Contexts.xmi", "GAMEPLAY_TEST");
	}
	
	@Test
	void verifyGameElementByAbilitiesAreAllSelectedOnce() {
		Map<String, List<ElementType>> map = abilities2ElementTypes(abilities());
		for(String s: map.keySet()) {
			System.out.println(s+" : "+map.get(s));
		}
		while(!map.isEmpty()) {
			Dungeon dungeon = generator.generate();
			for(Room room: dungeon.getRooms()) {
				map = removeElements(map, room);
			}
		}
	}
	
	private Map<String, List<ElementType>> removeElements(Map<String, List<ElementType>> map, Room room) {
		for(PositionedElement elem: room.getPositionedElement()) {
			if(!elem.getDisplays().isEmpty() && !(elem.getElementType() instanceof Structure)) {
				if(map.containsKey(elem.getElementType().getAbility().getName())) {
					System.err.println("RM "+elem.getElementType().getID());
					map.get(elem.getElementType().getAbility().getName()).remove(elem.getElementType());
					if(map.get(elem.getElementType().getAbility().getName()).isEmpty()) {
						map.remove(elem.getElementType().getAbility().getName());
						System.err.println("RM AB "+elem.getElementType().getAbility().getName());
					}
				}
			}
		}
		for (String key: map.keySet()) {
			if(map.get(key).isEmpty()) {
				map.remove(key);
				System.err.println("RM AB "+key);
			}
		}
		return map;
	}
	
	private List<String> abilities() {
		List<String> abilities = new ArrayList<>();
		for(Ability ability: generator.getModelsManager().getGameDescriptionModel().getAbilities().getAbilities()) {
			abilities.add(ability.getName());
		}
		return abilities;
	}
	
	private Map<String, List<ElementType>> abilities2ElementTypes(List<String> abilities) {
		Map<String, List<ElementType>> map = new HashMap<>();
		for(ElementType elem: generator.getModelsManager().getGameDescriptionModel().getElements().getElementTypes().getElements()) {
			if(elem.getNbDisplays() > 0 && !(elem instanceof StatementElementType)) {
				List<ElementType> types = new ArrayList<>();
				types.add(elem);
				if(map.containsKey(elem.getAbility().getName())) {
					types.addAll(map.get(elem.getAbility().getName()));
				}
				map.put(elem.getAbility().getName(), types);
			}
		}
		return map;
	}
}
