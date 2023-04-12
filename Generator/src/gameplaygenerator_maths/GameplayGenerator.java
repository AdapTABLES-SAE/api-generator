package gameplaygenerator_maths;

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
import generator.ElementType;
import generator.ExpectedAnswer;
import generator.FactSolutionParam;
import generator.GPElementType;
import generator.Gameplay;
import generator.PositionedElement;
import generator.PositionedStructureElement;
import generator.PropositionParam;
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

public class GameplayGenerator {
	
	/**
	 * Generate the positioned game elements of the rooms and associate the fact values accordingly. 
	 */

	private int nbPositionedElement;
	List<APosition> occupiedPositions;
	
	public GameplayGenerator() {
		this.nbPositionedElement = 1;
		this.occupiedPositions = new ArrayList<>();
	}
	
	public List<PositionedElement> buildPositionedElements(Gameplay gameplay, List<QuestionedFact> facts, RoomType roomtype){
		List<PositionedElement> elements = new ArrayList<>();
		for (AComponent aComp : gameplay.getComponents()) {
			if(aComp instanceof Structure) {
				elements.addAll(buildStructureHierarchy(aComp, facts, roomtype, gameplay.isHasIntegratedPropositions()));
			} else {
				for (QuestionedFact qef : facts) {
					elements.addAll(buildSimpleGameplayHierarchy((Component) aComp, qef, roomtype, gameplay.isHasIntegratedPropositions())); 
				}
			}
		}
		occupiedPositions = new ArrayList<>();
		return elements;
	}	
	
	private boolean isSingleChoiceComponent(Component component) {
		return component.isWearChoices() && component.getElementType().getAbility().getNumberOfDisplays() == 1;
	}
	
	private List<PositionedElement> buildSimpleGameplayHierarchy(Component component, QuestionedFact fact, RoomType roomtype, boolean hasIntegratedChoices){
		List<PositionedElement> elements = new ArrayList<>();

		if(component.isWearStatement()) {
			elements.add(buildStatementComponent(component, fact, getAvailablePosition(roomtype, component.getElementType(), false)));
			//elements.add(buildComponent(component, fact, getAvailablePosition(roomtype, component.getElementType(), false)));			
		} 
		else if(component.isInputEntry()) { elements.add(buildInputEntryElement(component, fact, getAvailablePosition(roomtype, component.getElementType(), false))); }
		else if(component.isWearChoices()) {
			if(isSingleChoiceComponent(component)) {
				for (int i = 0; i < fact.getPropositions().size(); i++) {
					elements.add(buildSimpleWearChoiceElement(component, fact, i, getAvailablePosition(roomtype, component.getElementType(), false), hasIntegratedChoices));
				}
			} else {
				elements.addAll(buildComplexWearChoicesElement(component, fact, roomtype));
			}
		} else {
			if(component.getQuantity() != null) {
				for (int i = 0; i < getElementQuantity(component, fact); i++) {
					elements.add(buildNonSpecificElement(component, fact, getAvailablePosition(roomtype, component.getElementType(), false)));
				}
			} else {
				elements.add(buildNonSpecificElement(component, getAvailablePosition(roomtype, component.getElementType(), false)));
			}
		}
		
		
		/*else if (component.isWearChoices()) {
			for (int i = 0; i < fact.getPropositions().size(); i++) {
				elements.add(buildComponent(component, fact, i, getAvailablePosition(roomtype, component.getElementType(), false), hasIntegratedChoices));
			}
		} else if (component.isInputEntry()) {
			for (int i = 0; i < fact.getEntrys().size(); i++) {
				elements.add(buildComponent(component, fact, i, getAvailablePosition(roomtype, component.getElementType(), false)));
			}
		} else {
			if(component.getQuantity() != null) {
				for (int i = 0; i < getElementQuantity(component, fact); i++) {
					elements.add(buildNonSpecificElement(component, fact, getAvailablePosition(roomtype, component.getElementType(), false)));
				}
			} else {
				elements.add(buildNonSpecificElement(component, getAvailablePosition(roomtype, component.getElementType(), false)));
			}
		}*/
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
	
	
	
	private List<PositionedElement> buildStructureHierarchy(AComponent component, List<QuestionedFact> facts, RoomType roomtype, boolean hasIntegratedChoices){
		return buildStructureHierarchy(component, null, new ArrayList<>(), facts, roomtype, hasIntegratedChoices, 0, -1);
	}
	
/*	private PositionedElement buildComponent(Component component, QuestionedFact questionedFact, APosition position) {
		return buildComponent(component, questionedFact, 0, position, false);
	}
	
	private PositionedElement buildComponent(Component component, APosition position) {
		return buildComponent(component, null, 0, position, false);
	}
	
	private PositionedElement buildComponent(Component component, QuestionedFact questionedFact, int propositionIndex, APosition position) {
		return buildComponent(component, questionedFact, propositionIndex, position, false);
	}*/


	private PositionedElement buildStatementComponent(Component component, QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, fact, position);
		
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
	
	private PositionedElement buildInputEntryElement(Component component, QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, fact, position);
		for (int i = 0; i < fact.getEntrys().size(); i++) {
			ExpectedAnswer answer = new ExpectedAnswerImpl();
			Value expectedAnswer = new ValueImpl();
			expectedAnswer.setValue(((Value) fact.getEntrys().get(i).getValue()).getValue());
			answer.setValue(expectedAnswer);
			comp.getExpectedAnswer().add(answer);
			//comp.setExpectedAnswer(answer);
		}		
		return comp;
	}
	
	private PositionedElement buildNonSpecificElement(Component component, QuestionedFact fact, APosition position) {
		PositionedElement comp = initializePositionedElement(component, fact, position);
		if(component.getDisplayValue() != null) {
			Display defaultDisplay = new DisplayImpl();
			Value displayValue = new ValueImpl();
			displayValue.setValue(((Value) component.getDisplayValue().getValue()).getValue());
			defaultDisplay.setValue(displayValue);
			comp.getDisplays().add(defaultDisplay);
		}
		return comp;
	}
	
	private PositionedElement buildNonSpecificElement(Component component, APosition position) {
		return buildNonSpecificElement(component, null, position);
	}
	
	private PositionedElement buildSimpleWearChoiceElement(Component component, QuestionedFact fact, int propositionIndex, APosition position, boolean hasIntegratedChoices) {
		PositionedElement comp = initializePositionedElement(component, fact, position);
		comp.setCorrectness(computeCorrectness(component, fact, fact.getPropositions().get(propositionIndex)));
		
		if(!hasIntegratedChoices) {
			Display proposition = new DisplayImpl();
			Value propValue = new ValueImpl();
			propValue.setValue(((Value) fact.getPropositions().get(propositionIndex).getValue()).getValue());
			proposition.setValue(propValue);
			comp.getDisplays().add(proposition);
		}
		
		return comp;
	}
	
	private List<PositionedElement> buildComplexWearChoicesElement(Component component, QuestionedFact fact, APosition position, RoomType roomtype){
		int numberOfObjectsToInstanciate = fact.getPropositions().size() / getNumberOfChoicesWornBy(component);
		boolean computesPositionEachTime = position == null;
		
		List<PositionedElement> elements = new ArrayList<>();
		for (int i = 0; i < numberOfObjectsToInstanciate; i++) {
			position = computesPositionEachTime? getAvailablePosition(roomtype, component.getElementType(), false): position;
			PositionedElement comp = initializePositionedElement(component, fact, position);
			int randomPositionOfCorrect = new Random().nextInt(getNumberOfChoicesWornBy(component));
			int propIndex, nbIndexFaux = 1;
			for (int choix = 0; choix < getNumberOfChoicesWornBy(component); choix++) {
				if(randomPositionOfCorrect == choix) {
					System.out.println("CHOIX CORRECT");
					propIndex = getIndexOfCorrectAnswerNumber(fact, 1);
				} else {
					System.out.println("CHOIX INCORRECT");
					propIndex = getIndexOfIncorrectAnswerNumber(fact, nbIndexFaux);
					nbIndexFaux++;
				}				
				//int propIndex = (choix == randomPositionOfCorrect)? : getIndexOfIncorrectAnswerNumber(fact, choix);
				System.out.println("index : " + propIndex);
								
				if(propIndex < fact.getPropositions().size()) {
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
	
	private List<PositionedElement> buildComplexWearChoicesElement(Component component, QuestionedFact fact, RoomType roomtype){
		return buildComplexWearChoicesElement(component, fact, null, roomtype);
	}
	
	private PositionedElement initializePositionedElement(Component component, QuestionedFact fact, APosition position) {
		PositionedElement comp = new PositionedElementImpl();
		comp.setElementType(component.getElementType());
		comp.setPosition(position);
		comp.setID("ELEM" + nbPositionedElement++);
		if(fact != null) comp.setFact(fact);
		return comp;
	}

	
	/*private PositionedElement buildComponent(Component component, QuestionedFact fact, int propositionIndex, APosition position, boolean hasIntegratedChoices){ 
		//System.out.println("Build A Component");
		PositionedElement comp = new PositionedElementImpl();
		comp.setElementType(component.getElementType());
		comp.setPosition(position);
		comp.setID("ELEM" + nbPositionedElement++);
		comp.setFact(fact);
		
		if(component.isInputEntry()) {
			//System.out.println("\tComponent to build is input");
			ExpectedAnswer answer = new ExpectedAnswerImpl();
			Value expectedAnswer = new ValueImpl();
			expectedAnswer.setValue(((Value) fact.getEntrys().get(propositionIndex).getValue()).getValue());
			answer.setValue(expectedAnswer);
			comp.setExpectedAnswer(answer);
		}
				
		if(component.isWearStatement()) {	
			//System.out.println("\tComponent to build is wear statement");
			Display statement = new DisplayImpl();
			Value display = new ValueImpl();
			//System.out.println("TOTO "+( fact.getQuestion().getValue()));
			display.setValue(((Value) fact.getQuestion().getValue()).getValue());
			statement.setValue(display);
			statement.setInteractive(fact.getQuestion().isInteractive());
			comp.getDisplay().add(statement);
			//comp.setDisplay(statement);			
					
			if(!fact.getQuestion().getSolutions().isEmpty()) {
				for (FactSolutionParam factSol: fact.getQuestion().getSolutions()) {
					FactSolutionParam sol = new FactSolutionParamImpl();
					Value solValue = new ValueImpl();
					solValue.setValue(((Value) factSol.getValue()).getValue());
					sol.setValue(solValue);
					comp.getAcceptedFacts().add(sol);
				}
			}
		}
			
		if(component.isWearChoices()) {
			//System.out.println("\tComponent to build is wear choices");
			//for (int i = 0; i < getNumberOfChoicesWornBy(component); i++) {
				comp.setCorrectness(computeCorrectness(component, fact, fact.getPropositions().get(propositionIndex)));
				
				if(!hasIntegratedChoices) {
					//System.out.println("\t++++ display");
					Display proposition = new DisplayImpl(); //
					Value propValue = new ValueImpl();
					propValue.setValue(((Value) fact.getPropositions().get(propositionIndex).getValue()).getValue());
					proposition.setValue(propValue);
					comp.getDisplay().add(proposition);
					//propositionIndex++;
					//comp.setDisplay(proposition);
				}
			//}
		}
				
		if(component.getDisplayValue() != null) {
			//System.out.println("\tComponent has defaults display value");
			Display defaultDisplay = new DisplayImpl();
			Value displayValue = new ValueImpl();
			displayValue.setValue(((Value) component.getDisplayValue().getValue()).getValue());
			defaultDisplay.setValue(displayValue);
			comp.getDisplay().add(defaultDisplay);
			// comp.setDisplay(defaultDisplay);
		}
				
		return comp;
	}*/
	
	/*private boolean isFactCorrect(String propositionValue, ECorrectness propositionCorrectness) {
		if(!propositionValue.equals(false+"")) {
			return propositionCorrectness.equals(ECorrectness.CORRECT)? true: false;
		} else {
			return propositionCorrectness.equals(ECorrectness.CORRECT)? false: true;
		}	
	}*/
	
	/*private Correctness computeCorrectness(Component component, PropositionParam proposition) {
		return computeCorrectness(component, null, proposition);
	}*/
	
	private Correctness computeCorrectness(Component component, QuestionedFact qeFact, PropositionParam proposition) {
		Correctness correctness = new CorrectnessImpl();
		if(component.getDefaultCorrectness() != null) {
			ECorrectness gameplayComponentToComputeCorrectness = ((CorrectnessValue) component.getDefaultCorrectness().getValue()).getValue();
			/*ECorrectness propositionCorrectness = ((CorrectnessValue) proposition.getState().getValue()).getValue(); 
			String propositionValue = ((Value) proposition.getValue()).getValue();*/
			CorrectnessValue value = new CorrectnessValueImpl();
			//System.err.println(proposition.getValue()+" "+proposition.getState().getValue());
			//System.err.println(gameplayComponentToComputeCorrectness+" - "+propositionCorrectness);
			
			/*if((gameplayComponentToComputeCorrectness.equals(ECorrectness.NOT_FACT_CORRECTNESS) && isFactCorrect(propositionValue, propositionCorrectness)) 
					|| (gameplayComponentToComputeCorrectness.equals(ECorrectness.FACT_CORRECTNESS) && !isFactCorrect(propositionValue, propositionCorrectness))) {
				value.setValue(ECorrectness.INCORRECT);
			} else if((gameplayComponentToComputeCorrectness.equals(ECorrectness.NOT_FACT_CORRECTNESS) && !isFactCorrect(propositionValue, propositionCorrectness)) 
					|| (gameplayComponentToComputeCorrectness.equals(ECorrectness.FACT_CORRECTNESS) && isFactCorrect(propositionValue, propositionCorrectness))) {
				value.setValue(ECorrectness.CORRECT);
			}*/
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
		//System.out.println("\tBuild a Structure");
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
	private boolean isComponentWearChoices(AComponent component) {
		return component instanceof Component && ((Component) component).isWearChoices() && ((Component) component).getElementType().getAbility().getNumberOfDisplays() > 1;
	}
	
	private int getNumberOfChoicesWornBy(AComponent component) {
		return ((Component) component).getElementType().getAbility().getNumberOfDisplays();
	}
	
	private List<PositionedElement> buildStructureHierarchy(AComponent component, APosition positionFromParent, List<PositionedElement> elements, List<QuestionedFact> facts, RoomType roomtype, boolean hasIntegratedChoices, int factIndex, int propositionIndex){
		//System.out.println("BuildStructureHierarchy");
		if(positionFromParent == null) {
			if(component instanceof Component) {
				positionFromParent = getAvailablePosition(roomtype, ((Component) component).getElementType(), false);
			} else {
				positionFromParent = getAvailablePosition(roomtype, ((Structure) component).getStructureType(), true);
			}
		}
		
		if(component instanceof Structure) {
			//System.out.println("\tComp is structure with pos to parent "+positionFromParent);
			Structure comp = (Structure) component;
			PositionedStructureElement struct;
			if(comp.isIsPerFact()) {
				//System.out.println("\t\tStructure is per fact");
				for (int i = 0; i < facts.size(); i++) {
					int propIndex = -1;
					struct = buildStructure(comp, positionFromParent);
					elements.add(struct);
					for (AComponent aComp : comp.getComponents()) {
						if(isComponentWearChoice(aComp)) { propIndex++; }
						elements.addAll(buildStructureHierarchy(aComp, struct.getCreatedPosition(), elements, facts, roomtype, hasIntegratedChoices, i, propIndex));
						if(isComponentWearChoices(aComp)) { propIndex += getNumberOfChoicesWornBy(aComp); }
					} 
				}
				//System.out.println("--");
			} else {
				//System.out.println("\t\tStructure is NOT per fact");
				struct = buildStructure(comp, positionFromParent);
				elements.add(struct);
				for (AComponent aComp : comp.getComponents()) {
					if(aComp instanceof Component && ((Component) aComp).isWearStatement()) {
						elements.addAll(buildStructureHierarchy(aComp, struct.getCreatedPosition(), elements, facts, roomtype, hasIntegratedChoices, factIndex, propositionIndex));
					} else {
						elements.addAll(buildStructureHierarchy(aComp, struct.getCreatedPosition(), elements, facts, roomtype, hasIntegratedChoices, -1, propositionIndex));
					}
				}
			}			
		} else {
			//System.out.println("\tComp is component with pos to parent "+positionFromParent);
			Component comp = (Component) component;
			// Les objets avec des quantites n'ont pas de sens dans le cas des structures et ne sont donc pas geres 
			if(factIndex != -1) {
				if(comp.isWearStatement()) { elements.add(buildStatementComponent(comp, facts.get(factIndex), positionFromParent)); }
				if(comp.isInputEntry()) { elements.add(buildInputEntryElement(comp, facts.get(factIndex), positionFromParent)); }
				if(comp.isWearChoices()) {
					if(getNumberOfChoicesWornBy((Component) comp) == 1) { elements.add(buildSimpleWearChoiceElement(comp, facts.get(factIndex), propositionIndex, positionFromParent, hasIntegratedChoices)); }
					else { elements.addAll(buildComplexWearChoicesElement(comp, facts.get(factIndex), positionFromParent, roomtype)); }
				}
				/*if(comp.isWearChoices()) {
					if(getNumberOfChoicesWornBy(comp) == 1) {
						elements.add(buildComponent(comp, facts.get(factIndex), propositionIndex, positionFromParent, hasIntegratedChoices));
					} else {
						elements.addAll(buildWearChoicesComp())
					}
				} else {
					elements.add(buildComponent(comp, facts.get(factIndex), positionFromParent));
				}*/
			} else {
				elements.add(buildNonSpecificElement(comp, positionFromParent));
			}

		}
		
		return elements;
	}
	
	private APosition getAvailablePosition(RoomType roomType, GPElementType elementType, boolean isStructure) {
		List<APosition> allowed = new ArrayList<>();
		System.err.println(elementType.getType()+" "+isStructure);
		if(!isStructure) {
			System.out.println(occupiedPositions);
			for (APosition aPosition : roomType.getElementPositions()) {
				if(!occupiedPositions.contains(aPosition) && aPosition.getSize().equals(elementType.getSize()) 
						&& (aPosition.getRestrictedTo().isEmpty() || aPosition.getRestrictedTo().contains(((ElementType) elementType).getAbility()))) {
					allowed.add(aPosition);
				}
			}
			
		} else {
			for (APosition aPosition : roomType.getStructurePositions()) {
				if(!occupiedPositions.contains(aPosition) && aPosition.getSize().equals(elementType.getSize())) {
					allowed.add(aPosition);
				}
			}
		}
		
		if(allowed.isEmpty()) { System.err.println("Position null"); return null; }
		int number = new Random().nextInt(allowed.size());
		occupiedPositions.add(allowed.get(number));
		return allowed.get(number);
	}
}
