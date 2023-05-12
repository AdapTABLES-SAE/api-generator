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
import generator.GPElementType;
import generator.GameDescription;
import generator.Gameplay;
import generator.PositionedElement;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.Room;
import generator.RoomType;
import generator.StatementElementType;
import generator.Structure;
import generator.Value;

public class RoomElements {

	private Gameplay gameplay;
	private ATask task;
	private List<QuestionedFact> facts;
	
	
	private Room associatedRoom;
	
	private GameDescription gameDescriptionModel;
	
	private Map<GPElementType, Integer> elementsToQuantity; // integer = -1 when element is inside structure
	
	public RoomElements(GameDescription gameDescriptionModel, ATask task) {
		this.gameDescriptionModel = gameDescriptionModel;
		this.elementsToQuantity = new HashMap<>();
		this.facts = new ArrayList<>();
		this.task = task;
		this.associatedRoom = null;
	}
	
	public RoomType getRoomTypeOfRoom() {
		return this.associatedRoom.getRoomtype();
	}
	
	public void setRoomPositionedElements(List<PositionedElement> elements) {
		this.associatedRoom.getPositionedElement().addAll(elements);
	}
	
	public void setRoom(Room room) {
		this.associatedRoom = room;
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
	
	public RoomElements(GameDescription gameDescriptionModel) {
		this(gameDescriptionModel, null);
	}
	
	public void addQuestionedFact(QuestionedFact fact) {
		this.facts.add(fact);
	}
	
	public Map<GPElementType, Integer> getElementsToQuantity() {
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
		selectElementType();
	}
	
	private void selectElementType() {
		selectElementType(gameplay.getComponents(), false);
	}
	
	public Gameplay getGameplay() {
		return gameplay;
	}
	
	private void selectElementType(List<AComponent> components, boolean isStructureComponents) {
		for (AComponent aComponent : components) {
			if(aComponent instanceof Structure) {
				if(!isStructureComponents) {
					if(((Structure) aComponent).isIsPerFact()) {
						/*if(elementsToQuantity.containsKey(((Structure) aComponent).getStructureType())) {
							elementsToQuantity.put(((Structure) aComponent).getStructureType(), facts.size() + elementsToQuantity.get(((Structure) aComponent).getStructureType()));
						} else {
							elementsToQuantity.put(((Structure) aComponent).getStructureType(), facts.size());
						}*/
						// il y en aura autant que de faits 
						elementsToQuantity.put(((Structure) aComponent).getStructureType(), facts.size());
					} else {
						elementsToQuantity.put(((Structure) aComponent).getStructureType(), 1);
					}
				} else {
					if(!elementsToQuantity.containsKey(((Structure) aComponent).getStructureType())) {
						elementsToQuantity.put(((Structure) aComponent).getStructureType(), -1);
					}
				}
				selectElementType(((Structure) aComponent).getComponents(), true);
			} else {
				ElementType elementType = getCompatibleElementType((Component) aComponent, isStructureComponents); 
				if(isStructureComponents) {
					elementsToQuantity.put(elementType, -1);
				} else {
					elementsToQuantity.put(elementType, (int) Math.ceil(computesNumberofElements((Component) aComponent, elementType)));
				}
				
			}
		}
	}
	
	private double computesNumberofElements(Component component, ElementType elementType) {  
		if(component.isWearChoices()) {
			if(elementType.getNumberOfDisplays() > 1) {
				return (double) (facts.get(0).getPropositions().size() * facts.size()) / (double) elementType.getNumberOfDisplays(); 
			} else {
				return facts.size() * facts.get(0).getPropositions().size();
			}
		}
		else if(component.isWearChoices()) { return facts.size(); }
		else if(component.getQuantity() != null) {
			if(component.getQuantity().isFactNbAnswers()) {
				return facts.size() * task.nbExpectedAnswers();
			} else {
				return Integer.valueOf(((Value) component.getQuantity().getValue()).getValue());
			}
		} else {
			return 1;
		}
	}
	
	private ElementType getCompatibleElementType(Component component, boolean isStructureComponent) { // TODO : Deal with statements 
		List<ElementType> compatibleTypes = new ArrayList<>();
		for (GPElementType elementType : gameDescriptionModel.getElements().getGpElements().getElements()) {
			if(component.isWearStatement()) {
				/*System.out.println("au bon endroid");
				System.out.println("Statement element "+(elementType instanceof StatementElementType));
				System.out.println("For struct"+isStructureComponent);*/
				
				if(elementType instanceof StatementElementType && hasValidStatementConditions(elementType, isStructureComponent)) {
					compatibleTypes.add((StatementElementType) elementType);
				}  
			} else {
				if(elementType instanceof ElementType && !(elementType instanceof StatementElementType) && ((ElementType) elementType).getAbility().equals(component.getAllowedAbility())
						&& hasExpectedSizeRequierements((ElementType) elementType, component)) {
					compatibleTypes.add((ElementType) elementType);
				}
			}
		}
		return compatibleTypes.get(new Random().nextInt(compatibleTypes.size()));
	}
	
	private boolean hasValidStatementConditions(GPElementType elementType, boolean isStructureComponent) {
		return (((StatementElementType) elementType).isForStructure() && isStructureComponent) 
				|| (!((StatementElementType) elementType).isForStructure() && !isStructureComponent);
	}
	
	private boolean hasExpectedSizeRequierements(ElementType elementType, Component component) {
		return component.getExpectedSize() == null || 
				(((Value) component.getExpectedSize().getValue()).getValue().equals(((ElementType) elementType).getSize().getName()));
	}

	public GPElementType getElementTypeFor(AComponent component) {
		for (GPElementType elementType : elementsToQuantity.keySet()) {
			if(elementType instanceof ElementType) {
				if(component instanceof Component) {
					if(((Component) component).isWearStatement()){
						if(elementType instanceof StatementElementType){ return elementType; }
					} else if(!(elementType instanceof StatementElementType) && ((ElementType) elementType).getAbility().equals(((Component) component).getAllowedAbility())) {
						return elementType;
					}
				}
			} else {
				if(component instanceof Structure) {
					if(((Structure) component).getStructureType() == elementType) {
						return elementType;
					}
				}
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		String s = (this.gameplay != null? this.gameplay.getName(): "null")+' '+
				(this.getTask() == null? "null": this.getTask().getID())+" facts="+facts.size()+"\n";
		for (GPElementType elem : elementsToQuantity.keySet()) {
			s += "\t"+elem.getType()+" -- "+elementsToQuantity.get(elem)+"\n";
		}
		return s;
	}
	
	public void printElementTypes() {
		System.out.println("--Room elements--");
		for (GPElementType elem : elementsToQuantity.keySet()) {
			System.out.println("\t"+elem.getID());
		}
		System.out.println("--Gameplay elements--"+gameplay.getName());
	}
}
