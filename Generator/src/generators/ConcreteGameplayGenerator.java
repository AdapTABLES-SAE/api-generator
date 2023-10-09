package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exceptions.MapGameplayElementException;
import generator.AComponent;
import generator.Component;
import generator.Correctness;
import generator.CorrectnessValue;
import generator.Display;
import generator.ECorrectness;
import generator.ElementType;
import generator.EntrySoluceParam;
import generator.ExpectedAnswer;
import generator.FactSolutionParam;
import generator.Position;
import generator.PositionedElement;
import generator.PositionedMapElement;
import generator.PositionedStructureElement;
import generator.PropositionParam;
import generator.QuestionGameplay;
import generator.QuestionParam;
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
import generator.impl.PositionedMapElementImpl;
import generator.impl.PositionedStructureElementImpl;
import generator.impl.PropositionParamImpl;
import generator.impl.ValueImpl;
import managers.ModelsManager;
import managers.QuestionedFactSplitter;
import structures.RoomElements;
import structures.Shuffle;

public class ConcreteGameplayGenerator {
	
	/**
	 * Generate the positioned game elements of the rooms and associate the fact values accordingly. 
	 */

	private int nbPositionedElement;
	List<Position> occupiedPositions;
	
	
	public ConcreteGameplayGenerator(ModelsManager modelAccess) {
		this.nbPositionedElement = 1;
		this.occupiedPositions = new ArrayList<>();
	}
	
	/**
	 * Build every elements of a room based on gameplay components
	 * @param roomElements
	 * @return list of PositionedElements of the room
	 * @throws MapGameplayElementException 
	 */
	public List<PositionedElement> buildPositionedElements(RoomElements roomElements) throws MapGameplayElementException{
		List<PositionedElement> elements = new ArrayList<>();
		for (AComponent aComp : roomElements.getGameplay().getComponents()) {
			if(aComp instanceof Structure) {
				elements.addAll(buildStructuredGameplay(aComp, roomElements));
			} else {
				if(roomElements.getGameplay() instanceof QuestionGameplay) {
					for (int i = 0; i < roomElements.getFacts().size(); i++) {
						elements.addAll(buildNonStructuredGameplay((Component) aComp, roomElements, i)); 
					}
				} else {
					elements.addAll(buildNoQuestionGameplay((Component) aComp, roomElements));
				}				
			}
		}
		occupiedPositions = new ArrayList<>();
		return elements;
	}	
	
	private boolean isSingleChoiceComponent(Component component, ElementType elementType) {
		return component.isForProposition() && elementType.getNbDisplays() == 1;
	}
	
	private List<PositionedElement> buildNoQuestionGameplay(Component component, RoomElements roomElements){
		List<PositionedElement> elements = new ArrayList<>();
		if(component.getQuantity() != null) {
			int quantity =  Integer.valueOf(((Value) component.getQuantity().getValue()).getValue());
			ElementType elementType = roomElements.getElementTypeFor(component);
			for (int i = 0; i < quantity; i++) {
				elements.add(buildClassicElement(component, elementType, getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType)));
			}
		}
		return elements;
	}
	
	private List<PositionedElement> buildNonStructuredGameplay(Component component, RoomElements roomElements, int factIndex){
		List<PositionedElement> elements = new ArrayList<>();

		ElementType elementType = roomElements.getElementTypeFor(component); //getCompatibleElementType(component, roomtype, false, fact.getQuestion().isInteractive());
		QuestionedFact fact = roomElements.getFacts().get(factIndex);
		RoomType roomtype = roomElements.getRoomTypeOfRoom();
		
		boolean hasIntegratedChoice = ((QuestionGameplay) roomElements.getGameplay()).isHasIntegratedPropositions();
		
		if(component.isForProposition() && component.isForStatement()) {
			//for (int i = 0; i < fact.getPropositions().size(); i++) {
				elements.add(buildStatementAsChoicesElement(component, elementType, fact, getAvailablePosition(roomtype, elementType)));
			//}
		} else if(component.isForStatement()) {
			elements.add(buildStatementElement(component, elementType, fact, getAvailablePosition(roomtype, elementType)));
		} 
		else if(component.isInputEntry()) { elements.add(buildInputEntryElement(component, elementType, fact, getAvailablePosition(roomtype, elementType))); }
		else if(component.isForProposition()) {
			if(isSingleChoiceComponent(component, (ElementType) elementType)) {
				for (int i = 0; i < fact.getPropositions().size(); i++) {
					elements.add(buildSingleChoiceElement(component, elementType, fact, i, getAvailablePosition(roomtype, elementType), hasIntegratedChoice));
				}
			} else {
				elements.addAll(buildMultipleChoicesElement(component, elementType, fact, roomtype));
			}
		} else {
			if(component.getQuantity() != null) {
				for (int i = 0; i < getElementQuantity(component, fact); i++) {
					elements.add(buildClassicElement(component, elementType, fact, getAvailablePosition(roomtype, elementType)));
				}
			} else {
				elements.add(buildClassicElement(component, elementType, getAvailablePosition(roomtype, elementType)));
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
		
	private List<PositionedElement> buildStructuredGameplay(AComponent component, RoomElements roomElements) throws MapGameplayElementException{
		return buildStructuredGameplay(component, null, null, new ArrayList<>(), roomElements, 0, -1);
	}
	
	private PositionedElement buildStatementAsChoicesElement(Component component, ElementType elementType, QuestionedFact fact, Position position) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		Correctness correctness = new CorrectnessImpl();
		CorrectnessValue value = new CorrectnessValueImpl();
		value.setValue(((CorrectnessValue) fact.getFactCorrectness().getValue()).getValue());
		correctness.setValue(value);
		comp.setCorrectness(correctness);
	
		Display proposition = new DisplayImpl();
		Value propValue = new ValueImpl();
		propValue.setValue(((Value) fact.getQuestion().getValue()).getValue());
		proposition.setValue(propValue);
		comp.getDisplays().add(proposition);
		return comp;
	}

	private PositionedElement buildStatementElement(Component component, ElementType elementType, QuestionedFact fact, Position position) { //QuestionedFact fact, Position position) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		
		Display statement = new DisplayImpl();
		Value display = new ValueImpl();
		display.setValue(((Value) fact.getQuestion().getValue()).getValue());
		statement.setValue(display);
		if(fact.getQuestion() instanceof QuestionParam) {
			statement.setInteractive(((QuestionParam) fact.getQuestion()).isInteractive());
		}
		comp.getDisplays().add(statement);
				
		buildAcceptedSolutions(comp, fact);
		return comp;
	}
	
	private PositionedElement buildInputEntryElement(Component component, ElementType elementType, QuestionedFact fact, Position position) {
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
	
	private PositionedElement buildClassicElement(Component component, ElementType elementType, QuestionedFact fact, Position position) {
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
	
	private PositionedElement buildClassicElement(Component component, ElementType elementType, Position position) {
		return buildClassicElement(component, elementType, null, position);
	}
	
	private PositionedElement buildSingleDetectorElement(Component component, ElementType elementType, QuestionedFact fact, int index, Position position, boolean hasIntegratedChoices) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		
		ExpectedAnswer answer = new ExpectedAnswerImpl(); 
		Value value = new ValueImpl();
		
		if(fact.getPropositions().size() > 0) {
			value.setValue(((Value) fact.getPropositions().get(index).getValue()).getValue());
		} else {
			value.setValue(((Value) fact.getEntrys().get(index).getValue()).getValue());
		}
		
		answer.setValue(value);
	
		comp.getExpectedAnswer().add(answer);		
		return comp;
	}
	
	private PositionedElement buildSingleChoiceElement(Component component, ElementType elementType, QuestionedFact fact, int propositionIndex, Position position, boolean hasIntegratedChoices) {
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
	private List<PositionedElement> buildMultipleChoicesElements(Component component, ElementType elementType, QuestionedFact fact, Position position, RoomType roomtype){
		List<PositionedElement> elements = new ArrayList<>();
		int correctnessToReach = Integer.valueOf(((Value) fact.getCorrectnessToReach().getValue()).getValue());
		int numberOfObjectsToInstanciate = correctnessToReach;
		boolean computesPositionEachTime = position == null;
		int numberOfDisplayByType = getNumberOfChoicesWornBy((ElementType) elementType);
		
		int numberOfChoicePerElement = (int) Math.ceil((double) fact.getPropositions().size() / (double) numberOfObjectsToInstanciate);
		while(numberOfChoicePerElement > numberOfDisplayByType) {
			numberOfObjectsToInstanciate++;
			 numberOfChoicePerElement = (int) Math.ceil((double) fact.getPropositions().size() / (double) numberOfObjectsToInstanciate);
		}
		
		int randomPos;
		PropositionParam proposition;
		List<PropositionParam> goodSoluces = this.getGoodSolutions(fact);
		List<PropositionParam> badSoluces = this.getBadSolutions(fact);
		for (int i = 0; i < numberOfObjectsToInstanciate; i++) {
			position = computesPositionEachTime? getAvailablePosition(roomtype, elementType): position;
			PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
			List<PropositionParam> selectedForElement = new ArrayList<>();
			for (int choix = 0; choix < numberOfChoicePerElement; choix++) {
				proposition = null;
				if(choix == 0 && !goodSoluces.isEmpty()) {
					randomPos = new Random().nextInt(goodSoluces.size());
					proposition = goodSoluces.get(randomPos);
					goodSoluces.remove(randomPos);
				} else if(!badSoluces.isEmpty()) {
					randomPos = new Random().nextInt(badSoluces.size());
					proposition = badSoluces.get(randomPos);
					badSoluces.remove(randomPos);
				}
				if(proposition != null) {
					selectedForElement.add(proposition);
				}
			}
			selectedForElement = Shuffle.shufflePropositions(selectedForElement);
			// Collections.shuffle(selectedForElement);
			comp.getDisplays().addAll(this.buildDisplay(selectedForElement));
			elements.add(comp);
		}
		return elements;
	}
	
	private List<Display> buildDisplay(List<PropositionParam> params){
		List<Display> displays = new ArrayList<>();
		
		for(PropositionParam param: params) {
			Display proposition = new DisplayImpl();
			Value propValue = new ValueImpl();
			propValue.setValue(((Value) param.getValue()).getValue());
			proposition.setValue(propValue);
			
			Correctness propCorrectness = new CorrectnessImpl();
			CorrectnessValue propCorrectnessValue = new CorrectnessValueImpl();
			propCorrectnessValue.setValue(((CorrectnessValue) param.getState()).getValue());
			propCorrectness.setValue(propCorrectnessValue);
			proposition.setCorrectness(propCorrectness);
			displays.add(proposition);
		}
		
		return displays;
	}
	
	private List<PropositionParam> getGoodSolutions(QuestionedFact fact){
		List<PropositionParam> propositions = new ArrayList<>();
		for(PropositionParam prop: fact.getPropositions()) {
			if(((CorrectnessValue) prop.getState()).getValue().equals(ECorrectness.CORRECT)) {
				PropositionParam propositionParam = new PropositionParamImpl();
				
				CorrectnessValue correctnessValue = new CorrectnessValueImpl();
				correctnessValue.setValue(ECorrectness.CORRECT);
				propositionParam.setState(correctnessValue);
				
				Value value = new ValueImpl();
				value.setValue(((Value) prop.getValue()).getValue());
				propositionParam.setValue(value);
				propositions.add(propositionParam);
			}
		}
		return propositions;
	}
	
	private List<PropositionParam> getBadSolutions(QuestionedFact fact){
		List<PropositionParam> propositions = new ArrayList<>();
		for(PropositionParam prop: fact.getPropositions()) {
			if(((CorrectnessValue) prop.getState()).getValue().equals(ECorrectness.INCORRECT)) {
				PropositionParam propositionParam = new PropositionParamImpl();
				
				CorrectnessValue correctnessValue = new CorrectnessValueImpl();
				correctnessValue.setValue(ECorrectness.INCORRECT);
				propositionParam.setState(correctnessValue);
				
				Value value = new ValueImpl();
				value.setValue(((Value) prop.getValue()).getValue());
				propositionParam.setValue(value);
				propositions.add(propositionParam);
			}
		}
		return propositions;
	}
	
	private List<PositionedElement> buildMultipleChoicesElement(Component component, ElementType elementType, QuestionedFact fact, RoomType roomtype){
		return buildMultipleChoicesElements(component, elementType, fact, null, roomtype);
	}
	
	private PositionedElement initializePositionedElement(Component component, ElementType elementType, QuestionedFact fact, Position position) {
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
			value.setValue(((CorrectnessValue) proposition.getState()).getValue());
			correctness.setValue(value);
		}
		
		return correctness;
	}
		
	private PositionedStructureElement buildStructure(Structure structure, ElementType elementType, Position position) {
		PositionedStructureElement structP = new PositionedStructureElementImpl();
		structP.setElementType(elementType);
		structP.setID("STRUCT" + nbPositionedElement++); 
		structP.setPosition(position);
		Position pos = new PositionImpl();
		pos.setID("id/" + structP.getID());
		structP.setCreatedPosition(pos);
		return structP;
	}
	
	private PositionedMapElement buildMapStructure(Structure structure, ElementType elementType, Position position) {
		PositionedMapElement structP = new PositionedMapElementImpl();
		structP.setElementType(elementType);
		structP.setID("STRUCT" + nbPositionedElement++); 
		structP.setPosition(position);
		Position pos = new PositionImpl();
		pos.setID("id/" + structP.getID());
		structP.getCreatedPositions().add(pos);
		return structP;
	}
	
	/**
	 * Predicate: does a component must wear at least a choice?
	 * @param component
	 * @return True if it wears choices, else false
	 */
	private boolean isComponentWearChoice(AComponent component) {
		return component instanceof Component && component.isForProposition();
	}
	
	/**
	 * Predicate: does a component must wear more than one choice? 
	 * @param component
	 * @return True if it wears more than one choice, else false
	 */
	private boolean isComponentWearChoices(AComponent component, ElementType elementType) {
		return isComponentWearChoice(component) && elementType.getNbDisplays() > 1;
	}
	
	private int getNumberOfChoicesWornBy(ElementType elementType) {
		return elementType.getNbDisplays();
	}
	
	public boolean hasForParentAStructure(Position position) {
		return position.getID().contains("id");
	}
	
	private List<PositionedElement> buildStructureForFacts(RoomElements roomElements, Structure component, Position positionFromParent, ElementType elementType) throws MapGameplayElementException{
		List<PositionedElement> elements = new ArrayList<>();
		Structure comp = (Structure) component;
		PositionedStructureElement struct;
		ElementType elementTypeForStructures = elementType;
		for (int i = 0; i < roomElements.getFacts().size(); i++) {
			int propIndex = -1;
			if(positionFromParent == null || !hasForParentAStructure(positionFromParent)) {
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementTypeForStructures);
			}
			struct = buildStructure(comp, elementTypeForStructures, positionFromParent);
			elements.add(struct);
			for (AComponent aComp : comp.getComponents()) {
				elementType = roomElements.getElementTypeFor(aComp);		
				if(isComponentWearChoice(aComp)) { propIndex++; } 
				elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, i, propIndex));
				if(elementType instanceof ElementType && isComponentWearChoices(aComp, (ElementType) elementType)) { 
					propIndex += getNumberOfChoicesWornBy((ElementType) elementType); 
				}
			} 
		}
		return elements;
	}
	
	private List<PositionedElement> buildStructureForPropositions(RoomElements roomElements, Structure component, Position positionFromParent, ElementType elementType) throws MapGameplayElementException {
		List<PositionedElement> elements = new ArrayList<>();
		Structure comp = (Structure) component;
		PositionedStructureElement struct;
		ElementType elementTypeForStructures = elementType;
		for (int i = 0; i < roomElements.getFacts().get(0).getPropositions().size(); i++) {
			if(positionFromParent == null || !hasForParentAStructure(positionFromParent)) {
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementTypeForStructures);
			}
			struct = buildStructure(comp, elementTypeForStructures, positionFromParent);
			elements.add(struct);
			for (AComponent aComp : comp.getComponents()) {
				elementType = roomElements.getElementTypeFor(aComp);
				if(isComponentWearChoice(aComp)) {
					elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, 0, i));
				} else {
					elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, 0, -1));
				}
			} 
		}
		return elements;
	}
	
	private List<PositionedElement> buildStructureForMap(RoomElements roomElements, Structure component, Position positionFromParent, ElementType elementType) throws MapGameplayElementException{
		
	
		List<PositionedElement> elements = new ArrayList<>();
		Structure comp = (Structure) component;
		PositionedMapElement struct;
		if(positionFromParent == null || !hasForParentAStructure(positionFromParent)) {
			positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType);
		}
		struct = buildMapStructure(comp, elementType, positionFromParent);
		elements.add(struct);
		
		for (AComponent aComp : comp.getComponents()) {
			elementType = roomElements.getElementTypeFor(aComp);
			if(aComp instanceof Component) {
				if(!((Component) aComp).getQuantity().isFactNbAnswers()) {
					throw new MapGameplayElementException("Expected quantity is supposed to have the number of facts answers elements ! (boolean is false should be true)");
				} else {
					if(roomElements.getFacts().size() > 1) {
						throw new MapGameplayElementException("Map gameplay cannot deal with multiple facts ! ");
					}				
					if(roomElements.getFacts().get(0).getPropositions().size() > 0) { // CHOIX
						for(int i = 0; i < roomElements.getFacts().get(0).getPropositions().size(); i++) {
							//TODO
							PropositionParam proposition = roomElements.getFacts().get(0).getPropositions().get(i); 
							
							String mapPos = proposition.getPosition().getID();
							Position position = new PositionImpl();
							position.setID(struct.getCreatedPositions().get(0).getID()+"/"+mapPos);
							
							struct.getCreatedPositions().add(position);
							
							elements.add(buildSingleDetectorElement((Component) aComp, elementType, roomElements.getFacts().get(0), i, 
									struct.getCreatedPositions().get(i + 1), false));
						}
					} else { // SAISIE
						for(int i = 0; i < roomElements.getFacts().get(0).getEntrys().size(); i++) {
							//TODO
							EntrySoluceParam entrys = roomElements.getFacts().get(0).getEntrys().get(i); 
							
							String mapPos = entrys.getPosition().getID();
							Position position = new PositionImpl();
							position.setID(struct.getCreatedPositions().get(0).getID()+"/"+mapPos);
							
							struct.getCreatedPositions().add(position);
							
							elements.add(buildSingleDetectorElement((Component) aComp, elementType, roomElements.getFacts().get(0), i, 
									struct.getCreatedPositions().get(i + 1), false));
						}						
					}
				}
			} else {
				throw new MapGameplayElementException("MapStructure should not have integrated structures ! ");
			}
		} 
		return elements;
	}
	
	private List<PositionedElement> buildStructureForFactStatement(RoomElements roomElements, Structure component, Position positionFromParent, ElementType elementType) throws MapGameplayElementException{
		List<PositionedElement> elements = new ArrayList<>();
		
		
		Component componentForText = null, componentForDetectors = null;
		ElementType elementForTexts = null, elementForDetectors = null;
		if(component.isAlternateComponents()) {
			componentForText = getComponentForText(component);
			componentForDetectors = getComponentForDetectors(component);
			elementForTexts = roomElements.getElementTypeFor(componentForText);
			elementForDetectors = roomElements.getElementTypeFor(componentForDetectors);
		}
		
		for (int i = 0; i < roomElements.getFacts().size(); i++) {
			Structure comp = (Structure) component;
			if(positionFromParent == null || !hasForParentAStructure(positionFromParent)) {
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType);
			}
			PositionedStructureElement struct = buildStructure(comp, elementType, positionFromParent);
			struct.setFact(roomElements.getFacts().get(i));
			buildAcceptedSolutions(struct, roomElements.getFacts().get(i));
			elements.add(struct);	
			
			if(component.isAlternateComponents()) {
				elements.addAll(buildFillInStructureContent(roomElements.getFacts().get(i), roomElements, component, struct, elementForTexts, componentForText, elementForDetectors, componentForDetectors));
			} else {
				for (AComponent aComp : comp.getComponents()) {
					elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, 0, -1));
				}
			}
		}		
		return elements;
	}
	
	private void buildAcceptedSolutions(PositionedElement element, QuestionedFact fact) {
		if(fact.getQuestion() instanceof QuestionParam && !((QuestionParam) fact.getQuestion()).getSolutions().isEmpty()) {
			for (FactSolutionParam factSol: ((QuestionParam) fact.getQuestion()).getSolutions()) {
				FactSolutionParam sol = new FactSolutionParamImpl();
				Value solValue = new ValueImpl();
				solValue.setValue(((Value) factSol.getValue()).getValue());
				sol.setValue(solValue);
				element.getAcceptedFacts().add(sol);
			}
		}
	}
	
	private Component getComponentForText(Structure component) {
		for(AComponent comp: component.getComponents()) {
			//System.out.println("COMPPP "+comp.getAllowedAbility());
			//System.out.println("COMPPP statemeent "+comp.isForStatement());
			if(comp instanceof Structure) {
				ALGAGenerator.LOGGER.warning("Structure for FILL-IN question does not deal with inside strucutres.");
			} else {
				if(comp.isForStatement()) {
					return (Component) comp;
				}
			}
		}
		return null;
	}
	
	private Component getComponentForDetectors(Structure component) {
		for(AComponent comp: component.getComponents()) {
			if(comp instanceof Structure) {
				ALGAGenerator.LOGGER.warning("Structure for FILL-IN question does not deal with inside strucutres.");
			} else {
				if(!comp.isForStatement()) {
					return (Component) comp;
				}
			}
		}
		return null;
	}
	
	private List<PositionedElement> buildFillInStructureContent(QuestionedFact fact, RoomElements roomElements, Structure component, PositionedStructureElement structure, ElementType elementForTexts, Component componentForText, ElementType elementForDetectors, Component componentForDetectors) {
		List<PositionedElement> elements = new ArrayList<>();
		
		QuestionedFactSplitter splitter = new QuestionedFactSplitter(fact);
		
		int conditionForTextAppearance; 
		if(splitter.isBeginByText()) {
			conditionForTextAppearance = 0;
		} else {
			conditionForTextAppearance = 1;
		}
		
		int textIndex = 0;
		//System.out.println("Number OF "+splitter.numberOfHoles()+splitter.numberOfTexts());
		for(int i = 0; i < splitter.numberOfHoles()+splitter.numberOfTexts(); i++) {
			
			if(i%2 == conditionForTextAppearance) {
				//System.out.println("text");
				elements.add(buildFillInElement(componentForText, elementForTexts, fact, structure.getCreatedPosition(),  splitter.getTexts().get(textIndex)));
				textIndex++;
			} else {
				//System.out.println("detector");
				elements.add(buildFillInElement(componentForDetectors, elementForDetectors, fact, structure.getCreatedPosition(), ""));
			}
		}

		return elements;
	}
	
	private PositionedElement buildFillInElement(Component component, ElementType elementType, QuestionedFact fact, Position position, String value) {
		PositionedElement comp = initializePositionedElement(component, elementType, fact, position);
		if(!value.isEmpty()) {
			Display defaultDisplay = new DisplayImpl();
			Value displayValue = new ValueImpl();
			displayValue.setValue(value);
			defaultDisplay.setValue(displayValue);
			comp.getDisplays().add(defaultDisplay);
		}
		return comp;
	}
	
	private List<PositionedElement> buildSimpleStructure(RoomElements roomElements, Structure component, Position positionFromParent, ElementType elementType, int propositionIndex, int factIndex) throws MapGameplayElementException{
		List<PositionedElement> elements = new ArrayList<>();
		Structure comp = (Structure) component;
		if(positionFromParent == null || !hasForParentAStructure(positionFromParent)) {
			positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType);
		}
		PositionedStructureElement struct = buildStructure(comp, elementType, positionFromParent);
		elements.add(struct);
		
		for (AComponent aComp : comp.getComponents()) {
			elementType = roomElements.getElementTypeFor(aComp);				
			if(aComp instanceof Component && aComp.isForStatement()) {
				elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, factIndex, propositionIndex));	
			} else {
				elements.addAll(buildStructuredGameplay(aComp, elementType, struct.getCreatedPosition(), elements, roomElements, -1, propositionIndex));
			}
		}
		return elements;
	}
	
	private List<PositionedElement> buildStructureClassicElements(RoomElements roomElements, Component comp, Position positionFromParent, ElementType elementType, int propositionIndex, int factIndex){
		List<PositionedElement> elements = new ArrayList<>();
		boolean hasIntegratedChoices = ((QuestionGameplay) roomElements.getGameplay()).isHasIntegratedPropositions();
		// Les objets avec des quantites n'ont pas de sens dans le cas des structures et ne sont donc pas geres 
		if(factIndex != -1) {
			if(comp.isForStatement()) { 
				elements.add(buildStatementElement(comp, elementType, roomElements.getFacts().get(factIndex), positionFromParent)); 
			}
			else if(comp.isInputEntry()) { elements.add(buildInputEntryElement(comp, elementType,  roomElements.getFacts().get(factIndex), positionFromParent)); }
			else if(comp.isForProposition()) {
				if(getNumberOfChoicesWornBy((ElementType) elementType) == 1) { elements.add(buildSingleChoiceElement(comp, elementType,  roomElements.getFacts().get(factIndex), propositionIndex, positionFromParent, hasIntegratedChoices)); }
				else { elements.addAll(buildMultipleChoicesElements(comp, elementType,  roomElements.getFacts().get(factIndex), positionFromParent, roomElements.getRoomTypeOfRoom())); }
			} else {
				elements.add(buildClassicElement(comp, elementType, positionFromParent));
			}
		} else {
			elements.add(buildClassicElement(comp, elementType, positionFromParent));
		}
		return elements;
	}
	
	/**
	 * Build, using a recursive algorithm, the elements of gameplays with structures by respecting the hierarchy between elements. 
	 * It deals with different cases such as structures for facts (one structure for one fact), structures for propositions (one structure for one proposition 
	 * of a fact), structures for statement and answer zones (one structure for statements and response areas of one facts), structures inside structures
	 * and it build the elements of each structure.
	 * @param component, the root component (a structure) 
	 * @param elementType, the concrete element type chosen to represent the component in the room 
	 * @param positionFromParent, the position of the element (position of the parent or new one)
	 * @param elements, the list of elements build (empty array at the begining)
	 * @param roomElements, the pre-selected elements (previous generation steps)
	 * @param factIndex, the index of the fact targeted (-1 if the recursion do not concern a fact) 
	 * @param propositionIndex, the index of the proposition, of the fact at *factIndex*, targeted (-1 if the recursion do not concern a proposition) 
	 * @return
	 * @throws MapGameplayElementException 
	 */
	private List<PositionedElement> buildStructuredGameplay(AComponent component, ElementType elementType, Position positionFromParent, List<PositionedElement> elements, RoomElements roomElements, int factIndex, int propositionIndex) throws MapGameplayElementException{
		elementType = roomElements.getElementTypeFor(component);
		if(component instanceof Structure) {
			Structure comp = (Structure) component;
			if(comp.isForFact()) {
				elements.addAll(buildStructureForFacts(roomElements, comp, positionFromParent, elementType));
			} else if(comp.isForProposition()) {
				elements.addAll(buildStructureForPropositions(roomElements, comp, positionFromParent, elementType));
			} else if(comp.isForStatement()) {
				elements.addAll(buildStructureForFactStatement(roomElements, comp, positionFromParent, elementType));
			} else if(comp.isForMap()){
				elements.addAll(buildStructureForMap(roomElements, comp, positionFromParent, elementType));
			} else {
				elements.addAll(buildSimpleStructure(roomElements, comp, positionFromParent, elementType, propositionIndex, factIndex));
			}
		} else { 
			Component comp = (Component) component;
			if(positionFromParent == null) {
				positionFromParent = getAvailablePosition(roomElements.getRoomTypeOfRoom(), elementType);
			}	
			elements.addAll(buildStructureClassicElements(roomElements, comp, positionFromParent, elementType, propositionIndex, factIndex));
		}
		
		return elements;
	}
	
	private boolean elementSizeIsAccepted(Position Position, ElementType elementType) {
		return elementType.getSize() == Position.getSize();
	}
	
	private Position getAvailablePosition(RoomType roomType, ElementType elementType) { 
		List<Position> allowed = new ArrayList<>();

		for (Position position : roomType.getElementPositions()) {
			if(!occupiedPositions.contains(position) && elementSizeIsAccepted(position, elementType)) {
				if(position.getRestrictedTo().isEmpty() || position.getRestrictedTo().contains(((ElementType) elementType).getAbility())) {
					allowed.add(position);
				}
			}
		}
		
		if(allowed.isEmpty()) { return null; }
		int number = new Random().nextInt(allowed.size());
		occupiedPositions.add(allowed.get(number));
		return allowed.get(number);
	}

}

