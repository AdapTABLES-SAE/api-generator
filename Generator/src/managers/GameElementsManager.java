package managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import generator.AComponent;
import generator.ATask;
import generator.Ability;
import generator.Component;
import generator.Directions;
import generator.ElementSize;
import generator.ElementType;
import generator.GameDescription;
import generator.Gameplay;
import generator.LargeRoomType;
import generator.NoQuestionGameplay;
import generator.Position;
import generator.QuestionGameplay;
import generator.QuestionedFact;
import generator.RoomType;
import generator.SmallRoomType;
import generator.StatementElementType;
import generator.Structure;
import generator.Value;
import generators.ALGAGenerator;

public class GameElementsManager {
	
	private GameDescription gameDescriptionModel;
	
	public GameElementsManager(GameDescription gameDescriptionModel) {
		this.gameDescriptionModel = gameDescriptionModel;
	}
	
	public Map<ElementType, Integer> selectElementType(List<AComponent> components, ATask task, List<QuestionedFact> facts) {
		Map<ElementType, Integer> elementsToQuantity = new HashMap<>();
		System.out.println(facts);
		selectElementType(elementsToQuantity, components, task, facts, false);
		return elementsToQuantity;
	}
	
	private void selectElementType(Map<ElementType, Integer> elementsToQuantity, List<AComponent> components, ATask task, List<QuestionedFact> facts, boolean isStructureComponents) {
		for (AComponent aComponent : components) {
			ElementType elementType = getCompatibleElementType(aComponent, isStructureComponents); 
			if(elementType == null) { break;}
			if(isStructureComponents) {
				if(!elementsToQuantity.containsKey(elementType)) {
					elementsToQuantity.put(elementType, -1);
				}
			} else {
				if(aComponent instanceof Structure) {
					Structure structure = (Structure) aComponent;
					if(structure.isForFact() || structure.isForStatement()) {
							elementsToQuantity.put(elementType, facts.size());
					} else if(structure.isForProposition() /*structure.isPerFactOrPropositions() && isStructureForProposition(structure)*/){
							elementsToQuantity.put(elementType, facts.get(0).getPropositions().size());
					} else {
						elementsToQuantity.put(elementType, 1);
					}
				} else {
					elementsToQuantity.put(elementType, (int) Math.ceil(computesNumberofElements((Component) aComponent, task, facts, elementType)));
				}
			}
			if(aComponent instanceof Structure) {
				selectElementType(elementsToQuantity, ((Structure) aComponent).getComponents(), task, facts, true);
			}
		}
	}
	
	private double computesNumberofElements(Component component, ATask task, List<QuestionedFact> facts, ElementType elementType) {  
		if(component.isForProposition()) {
			if(elementType.getNbDisplays() > 1) {
				int factCorrectnessToReach = Integer.valueOf(((Value) facts.get(0).getCorrectnessToReach().getValue()).getValue());
				double numberofToDisplayPerElement = (double) (facts.get(0).getPropositions().size() * facts.size()) / (double) elementType.getNbDisplays();
				return numberofToDisplayPerElement > factCorrectnessToReach? numberofToDisplayPerElement: factCorrectnessToReach; 
			} else {
				if(facts.size() == 0) {
					ALGAGenerator.LOGGER.severe("No facts for task "+task.getID()+"!");
					return 0;
				}
				return facts.size() * facts.get(0).getPropositions().size();
			}
		}
		else if(component.isForStatement()) { if(task.isGraphicTask()) { return 0; } else {return facts.size(); } }
		else if(component.getQuantity() != null) {
			if(component.getQuantity().isFactNbAnswers()) {
				return facts.size() * task.getNbExpectedAnswers();
			} else {
				return Integer.valueOf(((Value) component.getQuantity().getValue()).getValue());
			}
		} else {
			return 1;
		}
	}

	private ElementType getCompatibleElementType(AComponent component, boolean isStructureComponent) { 
		List<ElementType> compatibleTypes = new ArrayList<>();
		for (ElementType elementType : this.gameDescriptionModel.getElements().getElementTypes().getElements()) {	
			if(elementType instanceof StatementElementType) {
				if(isComponentForStatement(component) && !isComponentForPropositions(component) && respectStatementConditions((StatementElementType) elementType, isStructureComponent)) {
					compatibleTypes.add((StatementElementType) elementType);
				}
			} else if((!isComponentForStatement(component) || isComponentForStatementAndChoices(component)) && abilitiesAreEqual(elementType, component) && sizeAreEqual(elementType, component)) {		
					compatibleTypes.add((ElementType) elementType);
			}
		}
		if(compatibleTypes.isEmpty()) { return null; }
		return compatibleTypes.get(new Random().nextInt(compatibleTypes.size()));
	}
	
	private boolean isComponentForStatement(AComponent component) {
		return component instanceof Component && component.isForStatement();
	}
	
	private boolean isComponentForPropositions(AComponent component) {
		return component instanceof Component && component.isForProposition();
	}
	
	private boolean isComponentForStatementAndChoices(AComponent component) {
		return isComponentForStatement(component) && isComponentForPropositions(component);
	}
	
	
	private boolean respectStatementConditions(StatementElementType statementType, boolean isStructureComponent) {
		return (statementType.isForStructure() && isStructureComponent) || (!statementType.isForStructure() && !isStructureComponent);
	}
	
	private boolean abilitiesAreEqual(ElementType element, AComponent component) {
		return element.getAbility().equals(component.getAllowedAbility());
	}
	
	private boolean hasExpectedSize(AComponent component) {
		return component.getExpectedSize() != null;
	}
	
	private boolean sizeAreEqual(ElementType element, AComponent component) {
		return !hasExpectedSize(component) || element.getSize().getLiteral().equals(((Value) component.getExpectedSize().getValue()).getValue());
	}
	
	
	private boolean isStructureComponent(AComponent component, Gameplay gameplay) {
		return !gameplay.getComponents().contains(component);
	}
	
	
	
	public ElementType getElementTypeFor(AComponent component, Map<ElementType, Integer> elementsToQuantity, Gameplay gameplay) {
		//System.out.println("-------------Gameplay "+gameplay);
		for (ElementType elementType : elementsToQuantity.keySet()) {
			/*if((isComponentForStatement(component) && elementType instanceof StatementElementType) ||
					 (!(elementType instanceof StatementElementType) && abilitiesAreEqual(elementType, component) && sizeAreEqual(elementType, component))) {
				return elementType;
			}*/
			
			if(elementType instanceof StatementElementType) {
				if(isComponentForStatement(component) && !isComponentForPropositions(component) && respectStatementConditions((StatementElementType) elementType, isStructureComponent(component, gameplay))) {
					return elementType;
				}
			} else if((!isComponentForStatement(component) || isComponentForStatementAndChoices(component)) && abilitiesAreEqual(elementType, component) && sizeAreEqual(elementType, component)) {		
				return elementType;
			}
		}
		//System.out.println("-------------");
		/*System.out.println("SELECTED "+elementsToQuantity);
		System.out.println("COMP "+component.getAllowedAbility());
		System.err.println("not found");*/
		return null;
	}
	
	public List<RoomType> getQuestionRoomTypes(){
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : this.gameDescriptionModel.getRoomtypes().getRoomtypes()) {
			if(roomtype.isQuestionRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	/**
	 * Get the RoomTypes with one access/direction only
	 * @return valid RoomTypes
	 */
	public List<RoomType> getEntryRoomTypes() {
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : this.gameDescriptionModel.getRoomtypes().getRoomtypes()) {
			if(roomtype.isEntryRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	public List<RoomType> getTrapRoomTypes(){
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : this.gameDescriptionModel.getRoomtypes().getRoomtypes()) {
			if(roomtype.isTrapRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	public List<RoomType> getExitRoomTypes() {
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : this.gameDescriptionModel.getRoomtypes().getRoomtypes()) {
			if(roomtype.isExitRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes;
	}
	
	private boolean roomTypeHasEveryAccess(DirectionManager manager, RoomType roomtype) {
		if(roomtype instanceof SmallRoomType) {
			return roomtype.getDirections().containsAll(manager.getSimpleDirections());
		} else {
			return roomtype.getDirections().containsAll(manager.getComplexDirections());
		}
	}
	
	public boolean roomTypeHasCompatiblePositions(RoomType roomtype, Map<ElementType, Integer> elementsToQuantity) { 
		boolean compatible = true;
		
		Map<ElementSize, Map<Ability, Integer>> numberOfElementsPerSize = computesNumberOfElementsPerSize(elementsToQuantity);
		for (ElementSize size : numberOfElementsPerSize.keySet()) {
			List<Position> roomPositionOfSize = getRoomTypePositionsOfSize(roomtype, size);
			if(roomPositionOfSize.size() < sumOfElementOfSize(numberOfElementsPerSize.get(size))) {
				compatible = false; break;
			} else {
				for (Ability ability : numberOfElementsPerSize.get(size).keySet()) {
					if(ability != null) {
						List<Position> roomPositionOfSize_Ability = getRoomTypePositionsOfSizeForAbility(roomtype, size, ability);
						if(numberOfElementsPerSize.get(size).get(ability) > roomPositionOfSize_Ability.size()) {
							compatible = false;
						}
					}
				}
			}
		}
		return compatible;
	}
	
	private List<Position> getRoomTypePositionsOfSize(RoomType roomtype, ElementSize size){
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size)) {
				positions.add(pos);
			}
		}
		return positions;
	}
	
	private int sumOfElementOfSize(Map<Ability, Integer> numberOfElementPerAbility) {
		int quantity = 0;
		for (Ability ability : numberOfElementPerAbility.keySet()) {
			quantity += numberOfElementPerAbility.get(ability);
		}
		return quantity;
	}
	
	private List<Position> getRoomTypePositionsOfSizeForAbility(RoomType roomtype, ElementSize size, Ability ability){
		List<Position> positions = new ArrayList<>(); 
		for (Position pos : roomtype.getElementPositions()) {
			if(pos.getSize().equals(size) && (pos.getRestrictedTo().isEmpty() || pos.getRestrictedTo().contains(ability))) {
				positions.add(pos);
			}
		}
		return positions;
	}
	
	private Map<ElementSize,  Map<Ability, Integer>> computesNumberOfElementsPerSize(Map<ElementType, Integer> elementsToQuantity){
		Map<ElementSize, Map<Ability, Integer>> numberOfElementsPerSize = new HashMap<>();
		for (ElementType gpElem : elementsToQuantity.keySet()) {
			int quantity = elementsToQuantity.get(gpElem);
			Ability ability = ((ElementType) gpElem).getAbility();
				
			if(numberOfElementsPerSize.containsKey(gpElem.getSize())) {
				if(numberOfElementsPerSize.get(gpElem.getSize()).containsKey(ability)) {
					quantity += numberOfElementsPerSize.get(gpElem.getSize()).get(ability);
				} else {
					numberOfElementsPerSize.get(gpElem.getSize()).put(ability, quantity);
				}
			} else {
				numberOfElementsPerSize.put(gpElem.getSize(), new HashMap<>()); 
				numberOfElementsPerSize.get(gpElem.getSize()).put(ability, quantity);
			}				
		}
		return numberOfElementsPerSize;
	}
	
	public boolean hasCompatibleRoomTypeWithEveryAccessAndPositions(Gameplay gameplay, Map<ElementType, Integer> elementsToQuantity) {
		DirectionManager manager = new DirectionManager(this.gameDescriptionModel);
		List<RoomType> roomtypes = gameplay instanceof QuestionGameplay? getQuestionRoomTypes(): getTrapRoomTypes();
		for(RoomType roomType: roomtypes) {
			/*System.out.println("\t "+roomType.getName());
			System.out.println("\t every access : "+roomTypeHasEveryAccess(manager, roomType));
			System.out.println("\t positions : "+roomTypeHasCompatiblePositions(roomType, elementsToQuantity));*/
			if(roomTypeHasEveryAccess(manager, roomType) && roomTypeHasCompatiblePositions(roomType, elementsToQuantity)) {
				return true;
			}
		}
		return false;
	}
	
	
	public RoomType getCompatibleRoomType(Directions entry, Directions exit, Gameplay gameplay, Map<ElementType, Integer> elementsToQuantity, boolean isExitRoom, boolean isEntryRoom) {
		List<RoomType> roomTypes; 
		
		if(gameplay instanceof NoQuestionGameplay){ roomTypes = getTrapRoomTypes(); }
		else if(isExitRoom) { roomTypes = getExitRoomTypes(); }
		else if(isEntryRoom) { roomTypes = getEntryRoomTypes(); }
		else { roomTypes = getQuestionRoomTypes(); }
		
		//System.out.println("Every roomtypes "+roomTypes);
		//System.out.println("Room "+roomElements.getGameplay()+" "+roomElements.isEntry());
		//System.out.println("entry: "+entry+" exit: "+exit+" ");

		for (RoomType roomType : new ArrayList<>(roomTypes)) { 
			/*System.out.println(" \troomtype: "+roomType.getName());
			  if(gameplay != null) System.err.println(gameplay.getName());
			System.out.println(" \t\t compatible access : "+roomTypeHasCompatibleAccesses(entry, exit, roomType));
			System.out.println(" \t\t compatible positions : "+roomTypeHasCompatiblePositions(roomType, elementsToQuantity));
			System.out.println("\tentry "+entry+" "+"exit "+exit);*/
			
			if(!roomTypeHasCompatibleAccesses(entry, exit, roomType) || !roomTypeHasCompatiblePositions(roomType, elementsToQuantity)) {	
				//System.out.println("\tentry "+entry+" "+"exit "+exit);
				roomTypes.remove(roomType);
			}
			
		}
		
		//		System.err.println(" ALLOWED "+roomTypes);
		if(roomTypes.isEmpty()) { return null; }
		RoomType rt = removeLargeRoomTypes(roomTypes).get(new Random().nextInt(roomTypes.size()));
		/*if(ALGAGenerator.MAXIMIZE_ROOMTYPE_ACCESS) {
			rt = getRoomTypeWithMaximumAccess(roomTypes);
		} else {
			rt = removeLargeRoomTypes(roomTypes).get(new Random().nextInt(roomTypes.size()));
		}*/
		
		
		//System.err.println("SELECTED RT "+rt.getName());
		return rt; 
	}
	
	private List<RoomType> removeLargeRoomTypes(List<RoomType> roomtypes) {
		//System.out.println("ON SUPPRIME LES ROOM LARGE");
		if(containsSmallAndLargeRoomTypes(roomtypes)) {
			List<RoomType> roomtypes_ = new ArrayList<>();
			for(RoomType rt: roomtypes) {
				//System.out.println("ON SUPPRIME LES ROOM LARGE "+rt.getName());

				if(rt instanceof SmallRoomType) {
					roomtypes_.add(rt);
				} 
			}
			return roomtypes_;
		} else {
			return roomtypes;
		}
	}
	
	private boolean containsSmallAndLargeRoomTypes(List<RoomType> roomtypes) {
		boolean smallRT = false, largeRT = false;
		for(RoomType rt: roomtypes) {
			//System.out.println("ON SUPPRIME LES ROOM LARGE "+rt.getName());

			if(rt instanceof LargeRoomType) {
				largeRT = true;
			} else {
				smallRT = true;
			}
		}
		return largeRT && smallRT;
	}
	
	/*private RoomType getRoomTypeWithMaximumAccess(List<RoomType> roomtypes) {
		Map<Integer, List<RoomType>> accessRoomtypes = new HashMap<>();
		for(int i = 0; i < roomtypes.size(); i++) {
			List<RoomType> roomtypes_ = new ArrayList<>();
			if(accessRoomtypes.containsKey(roomtypes.get(i).getDirections().size())) {
				roomtypes_.addAll(accessRoomtypes.get(roomtypes.get(i).getDirections().size()));
			}
			accessRoomtypes.put(roomtypes.get(i).getDirections().size(), roomtypes);
		}
		Integer max = Collections.max(accessRoomtypes.keySet());
		
		return accessRoomtypes.get(max).get(new Random().nextInt(accessRoomtypes.get(max).size()));
		
	}*/
	
	private boolean roomTypeHasCompatibleAccesses(Directions entry, Directions exit, RoomType roomType) {
		return roomType.getDirections().contains(entry) && (exit.equals(Directions.NONE) || roomType.getDirections().contains(exit));
	}

	public RoomType getPortalRoomType() {
		List<RoomType> roomtypes = new ArrayList<>();
		for (RoomType roomtype : this.gameDescriptionModel.getRoomtypes().getRoomtypes()) {
			if(roomtype.isPortalRoomType()) {
				roomtypes.add(roomtype);
			}
		}
		return roomtypes.get(new Random().nextInt(roomtypes.size()));
	}
	
}
