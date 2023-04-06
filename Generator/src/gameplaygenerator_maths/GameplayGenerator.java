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
		boolean hasStructure = gameplayHasStructures(gameplay);
		for (AComponent aComp : gameplay.getComponents()) {
			if(aComp instanceof Structure) {
				elements.addAll(buildStructureHierarchy(aComp, facts, roomtype, gameplay.isHasIntegratedPropositions()));
			} else {
				QuestionedFact qef = null; 
				if(!hasStructure) {
					if (facts.size() > 1) {
						System.err.println("Multiple facts can not be questioned through a gameplay without structure");
					} 
					qef = facts.get(0);
				}	
				elements.addAll(buildSimpleGameplayHierarchy((Component) aComp, qef, roomtype, gameplay.isHasIntegratedPropositions())); 
			}
		}
		occupiedPositions = new ArrayList<>();
		return elements;
	}
	
	private boolean gameplayHasStructures(Gameplay gameplay) {
		for (AComponent aComp : gameplay.getComponents()) {
			if(aComp instanceof Structure) {
				return true;
			}
		}
		return false;
	}
	
	
	private List<PositionedElement> buildSimpleGameplayHierarchy(Component component, QuestionedFact fact, RoomType roomtype, boolean hasIntegratedChoices){
		List<PositionedElement> elements = new ArrayList<>();

		if(component.isWearStatement()) {
			elements.add(buildComponent(component, fact, getAvailablePosition(roomtype, component.getElementType(), false)));			
		} else if (component.isWearChoices()) {
			for (int i = 0; i < fact.getPropositions().size(); i++) {
				elements.add(buildComponent(component, fact, i, getAvailablePosition(roomtype, component.getElementType(), false), hasIntegratedChoices));
			}
		} else if (component.isInputEntry()) {
			for (int i = 0; i < fact.getEntrys().size(); i++) {
				elements.add(buildComponent(component, fact, i, getAvailablePosition(roomtype, component.getElementType(), false)));
			}
		} else {
			/*if(component.getElementType().getAbility().getName().equals("VERIFICATOR") && fact != null && fact.isLearnerValidation()) {
				elements.add(buildComponent(component, getAvailablePosition(roomtype, component.getElementType())));
			} else if(!component.getElementType().getAbility().getName().equals("VERIFICATOR")) {
				elements.add(buildComponent(component, getAvailablePosition(roomtype, component.getElementType())));
			}*/
			
			elements.add(buildComponent(component, getAvailablePosition(roomtype, component.getElementType(), false)));
		}
		return elements;
	}
	
	private List<PositionedElement> buildStructureHierarchy(AComponent component, List<QuestionedFact> facts, RoomType roomtype, boolean hasIntegratedChoices){
		return buildStructureHierarchy(component, null, new ArrayList<>(), facts, roomtype, hasIntegratedChoices, 0, -1);
	}
	
	private PositionedElement buildComponent(Component component, QuestionedFact questionedFact, APosition position) {
		return buildComponent(component, questionedFact, 0, position, false);
	}
	
	private PositionedElement buildComponent(Component component, APosition position) {
		return buildComponent(component, null, 0, position, false);
	}
	
	private PositionedElement buildComponent(Component component, QuestionedFact questionedFact, int propositionIndex, APosition position) {
		return buildComponent(component, questionedFact, propositionIndex, position, false);
	}


	
	private PositionedElement buildComponent(Component component, QuestionedFact fact, int propositionIndex, APosition position, boolean hasIntegratedChoices){ 
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
			display.setValue(((Value) fact.getQuestion().getValue()).getValue());
			statement.setValue(display);
			statement.setInteractive(fact.getQuestion().isInteractive());
			comp.setDisplay(statement);			
			
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
			comp.setCorrectness(computeCorrectness(component, fact.getPropositions().get(propositionIndex)));
			
			if(!hasIntegratedChoices) {
				//System.out.println("\t++++ display");
				Display proposition = new DisplayImpl(); //
				Value propValue = new ValueImpl();
				propValue.setValue(((Value) fact.getPropositions().get(propositionIndex).getValue()).getValue());
				proposition.setValue(propValue);
				comp.setDisplay(proposition);
			}
		}
		
		if(component.getDisplayValue() != null) {
			//System.out.println("\tComponent has defaults display value");
			Display defaultDisplay = new DisplayImpl();
			Value displayValue = new ValueImpl();
			displayValue.setValue(((Value) component.getDisplayValue().getValue()).getValue());
			defaultDisplay.setValue(displayValue);
			comp.setDisplay(defaultDisplay);
		}
		
		return comp;
	}
	
	private boolean isFactCorrect(String propositionValue, ECorrectness propositionCorrectness) {
		if(!propositionValue.equals(false+"")) {
			return propositionCorrectness.equals(ECorrectness.CORRECT)? true: false;
		} else {
			return propositionCorrectness.equals(ECorrectness.CORRECT)? false: true;
		}	
	}
	
	private Correctness computeCorrectness(Component component, PropositionParam proposition) {
		Correctness correctness = new CorrectnessImpl();
		if(component.getDefaultCorrectness() != null) {
			ECorrectness gameplayComponentToComputeCorrectness = ((CorrectnessValue) component.getDefaultCorrectness().getValue()).getValue();
			ECorrectness propositionCorrectness = ((CorrectnessValue) proposition.getState().getValue()).getValue(); 
			String propositionValue = ((Value) proposition.getValue()).getValue();
			CorrectnessValue value = new CorrectnessValueImpl();
			//System.err.println(proposition.getValue()+" "+proposition.getState().getValue());
			//System.err.println(gameplayComponentToComputeCorrectness+" - "+propositionCorrectness);
			
			if((gameplayComponentToComputeCorrectness.equals(ECorrectness.FACT_CORRECTNESS) && isFactCorrect(propositionValue, propositionCorrectness)) 
					|| (gameplayComponentToComputeCorrectness.equals(ECorrectness.NOT_FACT_CORRECTNESS) && !isFactCorrect(propositionValue, propositionCorrectness))) {
				value.setValue(ECorrectness.INCORRECT);
			} else if((gameplayComponentToComputeCorrectness.equals(ECorrectness.FACT_CORRECTNESS) && !isFactCorrect(propositionValue, propositionCorrectness)) 
					|| (gameplayComponentToComputeCorrectness.equals(ECorrectness.NOT_FACT_CORRECTNESS) && isFactCorrect(propositionValue, propositionCorrectness))) {
				value.setValue(ECorrectness.CORRECT);
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
						if(aComp instanceof Component && ((Component) aComp).isWearChoices()) {
							propIndex++;
						}
						elements.addAll(buildStructureHierarchy(aComp, struct.getCreatedPosition(), elements, facts, roomtype, hasIntegratedChoices, i, propIndex));
					} 
				}
				//System.out.println("--");
			} else {
				//System.out.println("\t\tStructure is NOT per fact");
				struct = buildStructure(comp, positionFromParent);
				elements.add(struct);
				for (AComponent aComp : comp.getComponents()) {
					elements.addAll(buildStructureHierarchy(aComp, struct.getCreatedPosition(), elements, facts, roomtype, hasIntegratedChoices, /*factIndex*/ -1, propositionIndex));
				}
			}			
		} else {
			//System.out.println("\tComp is component with pos to parent "+positionFromParent);
			Component comp = (Component) component;
			if(factIndex != -1) {
				if(comp.isWearChoices()) {
					elements.add(buildComponent(comp, facts.get(factIndex), propositionIndex, positionFromParent, hasIntegratedChoices));
				} else {
					elements.add(buildComponent(comp, facts.get(factIndex), positionFromParent));
				}
			} else {
				elements.add(buildComponent(comp, positionFromParent));
			}

		}
		
		return elements;
	}
	
	private APosition getAvailablePosition(RoomType roomType, GPElementType elementType, boolean isStructure) {
		List<APosition> allowed = new ArrayList<>();
		if(!isStructure) {
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
		
		
		if(allowed.isEmpty()) return null;
		int number = new Random().nextInt(allowed.size());
		occupiedPositions.add(allowed.get(number));
		return allowed.get(number);
	}
}
