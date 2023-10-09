package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import generator.AComponent;
import generator.ATask;
import generator.Component;
import generator.CurrentObjectiveLevel;
import generator.ElementType;
import generator.GameDescription;
import generator.Gameplay;
import generator.PositionedElement;
import generator.PropositionParam;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.Room;
import generator.RoomType;
import generator.StatementElementType;
import generator.Structure;
import generator.Value;
import generator.impl.RoomImpl;

public class RoomElements {

	private Gameplay gameplay;
	private ATask task;
	private List<QuestionedFact> facts;
	private boolean exit;
	private boolean entry;
	
	private Room associatedRoom;
	
	private GameDescription gameDescriptionModel;
	
	private Map<ElementType, Integer> elementsToQuantity; // integer = -1 when element is inside structure
	
	public boolean isExit() {
		return this.exit;
	}
	
	public boolean isEntry() {
		return this.entry;
	}
	
	public void setEntry(boolean entry) {
		this.entry = entry;
	}
	public RoomElements(GameDescription gameDescriptionModel, ATask task) {
		this(gameDescriptionModel, task, false, false);
	}
	
	public RoomElements(GameDescription gameDescriptionModel, ATask task, boolean isEntry, boolean isExit) {
		this.gameDescriptionModel = gameDescriptionModel;
		this.elementsToQuantity = new HashMap<>();
		this.facts = new ArrayList<>();
		this.task = task;
		this.associatedRoom = null;
		this.exit = isExit;
		this.entry = isEntry;
	}
	
	public RoomType getRoomTypeOfRoom() {
		return this.associatedRoom.getRoomtype();
	}
	
	public void setRoomPositionedElements(List<PositionedElement> elements) {
		this.associatedRoom.getPositionedElement().addAll(elements);
	}
	
	public void setRoom(Room room) {
		this.associatedRoom = new RoomImpl();
		this.associatedRoom.setX(room.getX());
		this.associatedRoom.setY(room.getY());
		this.associatedRoom.setTask(room.getTask());
		this.associatedRoom.setGameplay(room.getGameplay());
		this.associatedRoom.setRoomtype(room.getRoomtype());
	}
	
	public Room getRoom() {
		return associatedRoom;
	}
	
	public ResultsByTask getCorrespondingResultByTask(CurrentObjectiveLevel currentObjectiveLevel) {
		for (ResultsByTask rbt : currentObjectiveLevel.getResults().getResultsbytask()) {
			if(rbt.getTask().equals(this.task)) {
				return rbt;
			}
		}
		return null;
	}
	
	public RoomElements(GameDescription gameDescriptionModel, boolean isEntry, boolean isExit) {
		this(gameDescriptionModel, null, isEntry, isExit);
	}
	
	public RoomElements(GameDescription gameDescriptionModel) {
		this(gameDescriptionModel, null);
	}
	
	public void addQuestionedFact(QuestionedFact fact) {
		this.facts.add(fact);
	}
	
	public Map<ElementType, Integer> getElementsToQuantity() {
		return elementsToQuantity;
	}
	
	public List<QuestionedFact> getFacts() {
		return facts;
	}
	
	public ATask getTask() {
		return task;
	}
	
	public boolean isQuestionGameplay() {
		return this.facts != null;
	}
	
	public void setGameplay(Gameplay gameplay) {
		this.gameplay = gameplay;
		//System.err.println("GAMEPLAY "+gameplay.getName()+" nb components "+gameplay.getComponents().size());
		selectElementType();
	}
	
	private void selectElementType() {
		//System.err.println("************ GP = "+gameplay.getName());
		selectElementType(gameplay.getComponents(), false);
		//System.err.println("************");
	}
	
	public Gameplay getGameplay() {
		return gameplay;
	}
	
	private boolean isStructureComponent(AComponent component) {
		return component instanceof Structure;
	}
	
	private void selectElementType(List<AComponent> components, boolean isStructureComponents) {
		for (AComponent aComponent : components) {
			ElementType elementType = getCompatibleElementType(aComponent, isStructureComponents); 
			System.err.println("COMPONENT "+aComponent.getAllowedAbility());
			System.err.println("ELEMENT "+elementType.getType());
			if(isStructureComponents) {
				if(!elementsToQuantity.containsKey(elementType)) {
					elementsToQuantity.put(elementType, -1);
				}
			} else {
				if(isStructureComponent(aComponent)) {
					Structure structure = (Structure) aComponent;
					if(structure.isForFact() || structure.isForStatement()) {
							elementsToQuantity.put(elementType, facts.size());
					} else if(structure.isForProposition() /*structure.isPerFactOrPropositions() && isStructureForProposition(structure)*/){
							elementsToQuantity.put(elementType, facts.get(0).getPropositions().size());
					} else {
						elementsToQuantity.put(elementType, 1);
					}
					
				} else {
					elementsToQuantity.put(elementType, (int) Math.ceil(computesNumberofElements((Component) aComponent, elementType)));
				}
			}
			if(isStructureComponent(aComponent)) {
				selectElementType(((Structure) aComponent).getComponents(), true);
			}
		}
	}
	
	private double computesNumberofElements(Component component, ElementType elementType) {  
		if(component.isForProposition()) {
			if(elementType.getNbDisplays() > 1) {
				int factCorrectnessToReach = Integer.valueOf(((Value) facts.get(0).getCorrectnessToReach().getValue()).getValue());
				double numberofToDisplayPerElement = (double) (facts.get(0).getPropositions().size() * facts.size()) / (double) elementType.getNbDisplays();
				return numberofToDisplayPerElement > factCorrectnessToReach? numberofToDisplayPerElement: factCorrectnessToReach; 
			} else {
				return facts.size() * facts.get(0).getPropositions().size();
			}
		}
		else if(component.isForStatement()) { return facts.size(); }
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
	
	private ElementType getCompatibleElementType(AComponent component, boolean isStructureComponent) { // TODO : Deal with statements 
		List<ElementType> compatibleTypes = new ArrayList<>();
		for (ElementType elementType : gameDescriptionModel.getElements().getElementTypes().getElements()) {
			if(elementType instanceof StatementElementType) {
				if(isComponentForStatement(component) && !isComponentForChoices(component) && hasValidStatementConditions((StatementElementType) elementType, isStructureComponent)) {
					compatibleTypes.add((StatementElementType) elementType);
				}
			} else if((!isComponentForStatement(component) || isComponentForBothStatementAndChoices(component)) && isEqualAbility(elementType, component) && isEqualSize(elementType, component)) {		
					compatibleTypes.add((ElementType) elementType);
			}
		}
		return compatibleTypes.get(new Random().nextInt(compatibleTypes.size()));
	}
	
	private boolean hasValidStatementConditions(StatementElementType statementType, boolean isStructureComponent) {
		return (statementType.isForStructure() && isStructureComponent) 
				|| !(statementType.isForStructure() && !isStructureComponent);
	}
	
	private boolean isEqualAbility(ElementType element, AComponent component) {
		return element.getAbility().equals(component.getAllowedAbility());
	}
	
	private boolean hasExpectedSize(AComponent component) {
		return component.getExpectedSize() != null;
	}
	
	private boolean isEqualSize(ElementType element, AComponent component) {
		return !hasExpectedSize(component) || element.getSize().getLiteral().equals(((Value) component.getExpectedSize().getValue()).getValue());
	}

	private boolean isComponentForStatement(AComponent component) {
		return component instanceof Component && component.isForStatement();
	}
	
	private boolean isComponentForChoices(AComponent component) {
		return component instanceof Component && component.isForProposition();
	}
	
	private boolean isComponentForBothStatementAndChoices(AComponent component) {
		return isComponentForStatement(component) && isComponentForChoices(component);
	}

	public ElementType getElementTypeFor(AComponent component) {

		for (ElementType elementType : elementsToQuantity.keySet()) {
			if((isComponentForStatement(component) && elementType instanceof StatementElementType) ||
					 (!(elementType instanceof StatementElementType) && isEqualAbility(elementType, component) && isEqualSize(elementType, component))) {
				return elementType;
			}
		}
		//System.out.println("SELECTED "+elementsToQuantity);
		//System.out.println("COMP "+component.getAllowedAbility());
		//System.err.println("not found");
		return null;
	}
	
	@Override
	public String toString() {
		String s = (this.gameplay != null? this.gameplay.getName(): "null")+' '+
				(this.getTask() == null? "null": this.getTask().getID())+" facts="+facts.size()+"\n";
		for (ElementType elem : elementsToQuantity.keySet()) {
			s += "\t"+elem.getType()+" -- "+elementsToQuantity.get(elem)+"\n";
		}
		return s;
	}
	
	public void printElementTypes() {
		System.out.println("--Room elements--");
		for (ElementType elem : elementsToQuantity.keySet()) {
			System.out.println("\t"+elem.getID());
		}
		if(gameplay != null) System.out.println("--Gameplay elements--"+gameplay.getName());
	}
}
