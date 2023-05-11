package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.AComponent;
import generator.APosition;
import generator.Component;
import generator.Correctness;
import generator.CorrectnessValue;
import generator.Display;
import generator.ECorrectness;
import generator.ElementSize;
import generator.ElementType;
import generator.ExpectedAnswer;
import generator.FactSolutionParam;
import generator.GPElementType;
import generator.PositionedElement;
import generator.PositionedStructureElement;
import generator.PropositionParam;
import generator.QuestionGameplay;
import generator.QuestionedFact;
import generator.RoomType;
import generator.Structure;
import generator.Value;
import generator.impl.CorrectnessImpl;
import generator.impl.CorrectnessValueImpl;
import generator.impl.DisplayImpl;
import generator.impl.ExpectedAnswerImpl;
import generator.impl.FactSolutionParamImpl;
import generator.impl.PositionImpl;
import generator.impl.PositionedElementImpl;
import generator.impl.PositionedStructureElementImpl;
import generator.impl.ValueImpl;
import managers.ModelsManager;
import structures.RoomElements;

public class ConcreteGameplayGenerator {
	
	/**
	 * Generate the positioned game elements of the rooms and associate the fact values accordingly. 
	 */

	//private ModelsManager modelAccess;
	private int nbPositionedElement;
	List<APosition> occupiedPositions;
	
	public ConcreteGameplayGenerator(ModelsManager modelAccess) {
		this.nbPositionedElement = 1;
		this.occupiedPositions = new ArrayList<>();
		//this.modelAccess = modelAccess;
	}
	
	public List<PositionedElement> buildPositionedElements(RoomElements roomElements){
		List<PositionedElement> elements = new ArrayList<>();
		//if(roomElements.getGameplay() != null)		
			//System.out.println(roomElements.getGameplay().getName()+" "+roomElements.getRoomTypeOfRoom());
		for (AComponent aComp : roomElements.getGameplay().getComponents()) {
			if(aComp instanceof Structure) {
				elements.addAll(buildStructureHierarchy(aComp, roomElements));
			} else {
				for (int i = 0; i < roomElements.getFacts().size(); i++) {
					elements.addAll(buildSimpleGameplayHierarchy((Component) aComp, roomElements, i)); 
				}
			}
		}
		occupiedPositions = new ArrayList<>();
		return elements;
	}	
	
	private boolean isSingleChoiceComponent(Component component, ElementType elementType) {
		return component.isWearChoices() && elementType.getNumberOfDisplays() == 1;
	}
	
	private List<PositionedElement> buildSimpleGameplayHierarchy(Component component, RoomElements roomElements, int factIndex){
		List<PositionedElement> elements = new ArrayList<>();

		GPElementType elementType = roomElements.getElementTypeFor(component); //getCompatibleElementType(component, roomtype, false, fact.getQuestion().isInteractive());
		QuestionedFact fact = roomElements.getFacts().get(factIndex);
		RoomType roomtype = roomElements.getRoomTypeOfRoom();
		
		boolean hasIntegratedChoice = ((QuestionGameplay) roomElements.getGameplay()).isHasIntegratedPropositions();
		
		if(component.isWearStatement()) {
			elements.add(buildStatementComponent(component, elementType, fact, getAvailablePosition(roomtype, elementType, false)));
		} 
		else if(component.isInputEntry()) { elements.add(buildInputEntryElement(component, elementType, fact, getAvailablePosition(roomtype, elementType, false))); }
		else if(component.isWearChoices()) {
			if(isSingleChoiceComponent(component, (ElementType) elementType)) {
				for (int i = 0; i < fact.getPropositions().size(); i++) {
					elements.add(buildSimpleWearChoiceElement(component, elementType, fact, i, getAvailablePosition(roomtype, elementType, false), hasIntegratedChoice));
				}
			} else {
				elements.addAll(buildComplexWearChoicesElement(component, elementType, fact, roomtype));
			}
		} else {
			if(component.getQuantity() != null) {
				for (int i = 0; i < getElementQuantity(component, fact); i++) {
					elements.add(buildNonSpecificElement(component, elementType, fact, getAvailablePosition(roomtype, elementType, false)));
				}
			} else {
				elements.add(buildNonSpecificElement(component, elementType, getAvailablePosition(roomtype, elementType, false)));
			}
		}
		return elements;
	}
	
	private int getElementQuantity(Component component, QuestionedFact fact){
		int nbOfElements;
		if(component.getQuantity().isFactNbAnswers()) {
			nbOfElements = Integer.valueOf(((Value) fact.getCorrectnessToReach().getValue()).getValue());
		} else {
			nbOfElements = Integer.valueOf(((Value) component.getQuantity().getValue()).getValue());
		}
		return nbOfElements;
	}
		
	private List<PositionedElement> buildStructureHierarchy(AComponent component, RoomElements roomElements){
		return buildStructureHierarchy(component, null, null, new ArrayList<>(), roomElements, 0, -1);
	}

	private PositionedElement buildStatementComponent(Component component, GPElementType elementType, QuestionedFact fact, APosition position) { //QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		
		Display statement = new DisplayImpl();
		Value display = new ValueImpl();
		display.setValue(((Value) fact.getQuestion().getValue()).getValue());
		statement.setValue(display);
		statement.setInteractive(fact.getQuestion().isInteractive());
		comp.getDisplays().add(statement);
				
		if(!fact.getQuestion().getSolutions().isEmpty()) {
			for (FactSolutionParam factSol: fact.getQuestion().getSolutions()) {
				FactSolutionParam sol = new FactSolutionParamImpl();
				Value solValue = new ValueImpl();
				solValue.setValue(((Value) factSol.getValue()).getValue());
				sol.setValue(solValue);
				comp.getAcceptedFacts().add(sol);
			}
		}
		return comp;
	}
	
	private PositionedElement buildInputEntryElement(Component component, GPElementType elementType, QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		for (int i = 0; i < fact.getEntrys().size(); i++) {
			ExpectedAnswer answer = new ExpectedAnswerImpl();
			Value expectedAnswer = new ValueImpl();
			expectedAnswer.setValue(((Value) fact.getEntrys().get(i).getValue()).getValue());
			answer.setValue(expectedAnswer);
			comp.getExpectedAnswer().add(answer);
		}		
		return comp;
	}
	
	private PositionedElement buildNonSpecificElement(Component component, GPElementType elementType, QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		if(component.getDisplayValue() != null) {
			Display defaultDisplay = new DisplayImpl();
			Value displayValue = new ValueImpl();
			displayValue.setValue(((Value) component.getDisplayValue().getValue()).getValue());
			defaultDisplay.setValue(displayValue);
			comp.getDisplays().add(defaultDisplay);
		}
		return comp;
	}
	
	private PositionedElement buildNonSpecificElement(Component component, GPElementType elementType, APosition position) {
		return buildNonSpecificElement(component, elementType, null, position);
	}
	
	private PositionedElement buildSimpleWearChoiceElement(Component component, GPElementType elementType, QuestionedFact fact, int propositionIndex, APosition position, boolean hasIntegratedChoices) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		comp.setCorrectness(computeCorrectness(component, fact, fact.getPropositions().get(propositionIndex)));
		
	
		Display proposition = new DisplayImpl();
		Value propValue = new ValueImpl();
		if(!hasIntegratedChoices) {
			propValue.setValue(((Value) fact.getPropositions().get(propositionIndex).getValue()).getValue());
		} else {
			if(component.getDisplayValue() != null) {
				propValue.setValue(((Value) component.getDisplayValue().getValue()).getValue());	
			}
		}
		proposition.setValue(propValue);
		comp.getDisplays().add(proposition);
		
		return comp;
	}
	
	private List<PositionedElement> buildComplexWearChoicesElement(Component component, GPElementType elementType, QuestionedFact fact, APosition position, RoomType roomtype){
		int correctnessToReach = Integer.valueOf(((Value) fact.getCorrectnessToReach().getValue()).getValue());
		int numberOfObjectsToInstanciate = correctnessToReach;
		boolean computesPositionEachTime = position == null;
		
		int numberOfChoicePerElement = (int) Math.ceil((double) fact.getPropositions().size() / (double) numberOfObjectsToInstanciate);
		/*if(numberOfChoicePerElement > getNumberOfChoicesWornBy((ElementType) elementType)) {
			System.err.println("The number of choice is to high for this component");
		}*/
		while(numberOfChoicePerElement > getNumberOfChoicesWornBy((ElementType) elementType)) {
			numberOfObjectsToInstanciate++;
			 numberOfChoicePerElement = (int) Math.ceil((double) fact.getPropositions().size() / (double) numberOfObjectsToInstanciate);
		}
				
		int propIndex, nbIndexFaux = 1;
		int instanciatedSolution = 0;
		List<PositionedElement> elements = new ArrayList<>();
		for (int i = 0; i < numberOfObjectsToInstanciate; i++) {
			position = computesPositionEachTime? getAvailablePosition(roomtype, elementType, false): position;
			PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
			int randomPositionOfCorrect = new Random().nextInt(numberOfChoicePerElement);
			for (int choix = 0; choix < numberOfChoicePerElement; choix++) {
				if(instanciatedSolution == fact.getPropositions().size()) { break; }
				if(i < correctnessToReach && randomPositionOfCorrect == choix) {
					//System.out.println("dans le if");
					propIndex = getIndexOfCorrectAnswerNumber(fact, i+1);
				} else {
					//System.out.println("dans le else");
					propIndex = getIndexOfIncorrectAnswerNumber(fact, nbIndexFaux);
					nbIndexFaux++;
				}				
				//System.out.println(propIndex);				
				if(propIndex != -1 && propIndex < fact.getPropositions().size()) {
					Display proposition = new DisplayImpl();
					Value propValue = new ValueImpl();
					propValue.setValue(((Value) fact.getPropositions().get(propIndex).getValue()).getValue());
					proposition.setValue(propValue);
					comp.getDisplays().add(proposition);
					
					Correctness propCorrectness = new CorrectnessImpl();
					CorrectnessValue propCorrectnessValue = new CorrectnessValueImpl();
					propCorrectnessValue.setValue(((CorrectnessValue)fact.getPropositions().get(propIndex).getState().getValue()).getValue());
					propCorrectness.setValue(propCorrectnessValue);
					proposition.setCorrectness(propCorrectness);
					
					propIndex++;
				}
				instanciatedSolution++;
			}
			
			elements.add(comp);
		}
		return elements;
	}
	
	private int getIndexOfCorrectAnswerNumber(QuestionedFact fact, int correctAnswerNumber) {
		return getIndexOfCorrectAnswerNumber(fact, correctAnswerNumber, 0);
	}
	
	private int getIndexOfCorrectAnswerNumber(QuestionedFact fact, int correctAnswerNumber, int startIndex) {
		int cpt = 0;
		for (int i = startIndex; i < fact.getPropositions().size(); i++) {
			if(((CorrectnessValue) fact.getPropositions().get(i).getState().getValue()).getValue().equals(ECorrectness.CORRECT)) {
				cpt++;
			}
			if(cpt == correctAnswerNumber) {
				return i;
			}
		}
		return -1;
	}
	
	private int getIndexOfIncorrectAnswerNumber(QuestionedFact fact, int correctAnswerNumber) {
		int cpt = 0;
		for (int i = 0; i < fact.getPropositions().size(); i++) {
			if(((CorrectnessValue) fact.getPropositions().get(i).getState().getValue()).getValue().equals(ECorrectness.INCORRECT)) {
				cpt++;
			}
			if(cpt == correctAnswerNumber) {
				return i;
			}
		}
		return -1;
	}
	
	private List<PositionedElement> buildComplexWearChoicesElement(Component component, GPElementType elementType, QuestionedFact fact, RoomType roomtype){
		return buildComplexWearChoicesElement(component, elementType, fact, null, roomtype);
	}
	
	private PositionedElement initializePositionedElement(Component component, GPElementType elementType, QuestionedFact fact, APosition position) {
		PositionedElement comp = new PositionedElementImpl();
		comp.setElementType(elementType);
		comp.setPosition(position);
		comp.setID("ELEM" + nbPositionedElement++);
		if(fact != null) comp.setFact(fact);
		return comp;
	}
	
	private Correctness computeCorrectness(Component component, QuestionedFact qeFact, PropositionParam proposition) {
		Correctness correctness = new CorrectnessImpl();
		if(component.getDefaultCorrectness() != null) {
			ECorrectness gameplayComponentToComputeCorrectness = ((CorrectnessValue) component.getDefaultCorrectness().getValue()).getValue();

			CorrectnessValue value = new CorrectnessValueImpl();
			ECorrectness factCorrectness = ((CorrectnessValue) qeFact.getFactCorrectness().getValue()).getValue();
			
			if(gameplayComponentToComputeCorrectness.equals(ECorrectness.NOT_FACT_CORRECTNESS)) {
				value.setValue(factCorrectness.equals(ECorrectness.CORRECT)? ECorrectness.INCORRECT: ECorrectness.CORRECT);
			} else {
				value.setValue(factCorrectness);
			}

			correctness.setValue(value);
		} else { // On est pas dans une structure on prends la valeur de correctness de la proposition du fait 
			CorrectnessValue value = new CorrectnessValueImpl();
			value.setValue(((CorrectnessValue) proposition.getState().getValue()).getValue());
			correctness.setValue(value);
		}
		
		return correctness;
	}
		
	private PositionedStructureElement buildStructure(Structure structure, APosition position) {
		PositionedStructureElement structP = new PositionedStructureElementImpl();
		structP.setElementType(structure.getStructureType());
		structP.setID("STRUCT" + nbPositionedElement++); 
		structP.setPosition(position);
		APosition pos = new PositionImpl();
		pos.setID("id/" + structP.getID());
		structP.setCreatedPosition(pos);
		return structP;
	}
	
	/**
	 * Predicate: does a component must wear at least a choice?
	 * @param component
	 * @return True if it wears choices, else false
	 */
	private boolean isComponentWearChoice(AComponent component) {
		return component instanceof Component && ((Component) component).isWearChoices();
	}
	
	/**
	 * Predicate: does a component must wear more than one choice? 
	 * @param component
	 * @return True if it wears more than one choice, else false
	 */
	private boolean isComponentWearChoices(AComponent component, ElementType elementType) {
		return component instanceof Component && ((Component) component).isWearChoices() && elementType.getNumberOfDisplays() > 1;
	}
	
	private int getNumberOfChoicesWornBy(ElementType elementType) {
		return elementType.getNumberOfDisplays();
	}
	
	private List<PositionedElement> buildStructureHierarchy(AComponent component, GPElementType elementType, APosition positionFromParent, List<PositionedElement> elements, RoomElements roomElements, int factIndex, int propositionIndex){
		if(positionFromParent == null) {
			if(component instanceof Component) {
				//elementType = getCompatibleElementType((Component) component);
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType, false);
			} else {
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), ((Structure) component).getStructureType(), true);
			}
		}
			
		if(component instanceof Structure) {
			Structure comp = (Structure) component;
			PositionedStructureElement struct;
			if(comp.isIsPerFact()) {
				for (int i = 0; i < roomElements.getFacts().size(); i++) {
					int propIndex = -1;
					struct = buildStructure(comp, positionFromParent);
					elements.add(struct);
					for (AComponent aComp : comp.getComponents()) {
						elementType = roomElements.getElementTypeFor(aComp);		
						if(isComponentWearChoice(aComp)) { propIndex++; } 
						elements.addAll(buildStructureHierarchy(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, i, propIndex));
						if(elementType instanceof ElementType && isComponentWearChoices(aComp, (ElementType) elementType)) { 
							propIndex += getNumberOfChoicesWornBy((ElementType) elementType); 
						}
					} 
				}
			} else {
				struct = buildStructure(comp, positionFromParent);
				elements.add(struct);
				
				for (AComponent aComp : comp.getComponents()) {
					elementType = roomElements.getElementTypeFor(aComp);				
					if(aComp instanceof Component && ((Component) aComp).isWearStatement()) {
						elements.addAll(buildStructureHierarchy(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, factIndex, propositionIndex));	
					} else {
						elements.addAll(buildStructureHierarchy(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, -1, propositionIndex));
					}
				}
			}			
		} else {
			Component comp = (Component) component;
			elementType = roomElements.getElementTypeFor(component);
			
			boolean hasIntegratedChoices = ((QuestionGameplay) roomElements.getGameplay()).isHasIntegratedPropositions();
			// Les objets avec des quantites n'ont pas de sens dans le cas des structures et ne sont donc pas geres 
			if(factIndex != -1) {
				if(comp.isWearStatement()) { 
					elements.add(buildStatementComponent(comp, elementType, roomElements.getFacts().get(factIndex), positionFromParent)); 
				}
				else if(comp.isInputEntry()) { elements.add(buildInputEntryElement(comp, elementType,  roomElements.getFacts().get(factIndex), positionFromParent)); }
				else if(comp.isWearChoices()) {
					if(getNumberOfChoicesWornBy((ElementType) elementType) == 1) { elements.add(buildSimpleWearChoiceElement(comp, elementType,  roomElements.getFacts().get(factIndex), propositionIndex, positionFromParent, hasIntegratedChoices)); }
					else { elements.addAll(buildComplexWearChoicesElement(comp, elementType,  roomElements.getFacts().get(factIndex), positionFromParent, roomElements.getRoomTypeOfRoom())); }
				} else {
					elements.add(buildNonSpecificElement(comp, elementType, positionFromParent));
				}
			} else {
				elements.add(buildNonSpecificElement(comp, elementType, positionFromParent));
			}
		}
		
		return elements;
	}
	
	private boolean elementSizeIsAccepted(APosition aPosition, GPElementType elementType) {
		return elementType.getSize() == aPosition.getSize();
	}
	
	private APosition getAvailablePosition(RoomType roomType, GPElementType elementType, boolean isStructure) {
		List<APosition> allowed = new ArrayList<>();
		
		if(!isStructure) {
			for (APosition aPosition : roomType.getElementPositions()) {
				/*System.out.println("Occupied "+occupiedPositions.contains(aPosition));
				System.out.println(aPosition.getSize());
				System.out.println(elementType.getSize());*/
				if(!occupiedPositions.contains(aPosition) && elementSizeIsAccepted(aPosition, elementType) 
						&& (aPosition.getRestrictedTo().isEmpty() || aPosition.getRestrictedTo().contains(((ElementType) elementType).getAbility()))) {
					//System.out.println("aqui");
					allowed.add(aPosition);
				}
			}
			
		} else {
			//System.out.println("Strucutre pos in roomtype " + roomType.getStructurePositions().isEmpty());
			
			for (APosition aPosition : roomType.getStructurePositions()) {
				//System.out.println("occupied struct pos : "+occupiedPositions.contains(aPosition));
				if(!occupiedPositions.contains(aPosition) && aPosition.getSize().equals(elementType.getSize())) {
					allowed.add(aPosition);
				}
			}
		}
		
		if(allowed.isEmpty()) { /*System.out.println("EMPTY pos");*/ return null; }
		int number = new Random().nextInt(allowed.size());
		occupiedPositions.add(allowed.get(number));
		return allowed.get(number);
	}
}
