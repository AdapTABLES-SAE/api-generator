/**
 */
package generator.util;

import generator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage
 * @generated
 */
public class GeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GeneratorPackage.ABSTRACT_FACT: {
			AbstractFact abstractFact = (AbstractFact) theEObject;
			T result = caseAbstractFact(abstractFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SET_OF_FACTS: {
			SetOfFacts setOfFacts = (SetOfFacts) theEObject;
			T result = caseSetOfFacts(setOfFacts);
			if (result == null)
				result = caseAbstractFact(setOfFacts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.FACT: {
			Fact fact = (Fact) theEObject;
			T result = caseFact(fact);
			if (result == null)
				result = caseAbstractFact(fact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.KNOWLEDGE: {
			Knowledge knowledge = (Knowledge) theEObject;
			T result = caseKnowledge(knowledge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAME_CONTENT: {
			GameContent gameContent = (GameContent) theEObject;
			T result = caseGameContent(gameContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAMEPLAY: {
			Gameplay gameplay = (Gameplay) theEObject;
			T result = caseGameplay(gameplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CORE_GAME_RULE: {
			CoreGameRule coreGameRule = (CoreGameRule) theEObject;
			T result = caseCoreGameRule(coreGameRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT_TYPE: {
			ElementType elementType = (ElementType) theEObject;
			T result = caseElementType(elementType);
			if (result == null)
				result = caseIRoomElement(elementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAME_OBJECTIVE: {
			GameObjective gameObjective = (GameObjective) theEObject;
			T result = caseGameObjective(gameObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ROOM_TYPE2: {
			RoomType2 roomType2 = (RoomType2) theEObject;
			T result = caseRoomType2(roomType2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.FLOOR: {
			Floor floor = (Floor) theEObject;
			T result = caseFloor(floor);
			if (result == null)
				result = caseElementType(floor);
			if (result == null)
				result = caseIRoomElement(floor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.IROOM_ELEMENT: {
			IRoomElement iRoomElement = (IRoomElement) theEObject;
			T result = caseIRoomElement(iRoomElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT_SHAPE: {
			ElementShape elementShape = (ElementShape) theEObject;
			T result = caseElementShape(elementShape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT_STATE: {
			ElementState elementState = (ElementState) theEObject;
			T result = caseElementState(elementState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DUNGEON: {
			Dungeon dungeon = (Dungeon) theEObject;
			T result = caseDungeon(dungeon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ROOM: {
			Room room = (Room) theEObject;
			T result = caseRoom(room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAME_DESCRIPTION: {
			GameDescription gameDescription = (GameDescription) theEObject;
			T result = caseGameDescription(gameDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ROOM_TYPE: {
			RoomType roomType = (RoomType) theEObject;
			T result = caseRoomType(roomType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SMALL_ROOM_TYPE: {
			SmallRoomType smallRoomType = (SmallRoomType) theEObject;
			T result = caseSmallRoomType(smallRoomType);
			if (result == null)
				result = caseRoomType(smallRoomType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LARGE_ROOM_TYPE: {
			LargeRoomType largeRoomType = (LargeRoomType) theEObject;
			T result = caseLargeRoomType(largeRoomType);
			if (result == null)
				result = caseRoomType(largeRoomType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ROOM_ACCESS: {
			RoomAccess roomAccess = (RoomAccess) theEObject;
			T result = caseRoomAccess(roomAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAME_CONTEXT: {
			GameContext gameContext = (GameContext) theEObject;
			T result = caseGameContext(gameContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNING_DOMAIN: {
			LearningDomain learningDomain = (LearningDomain) theEObject;
			T result = caseLearningDomain(learningDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNING_PATH: {
			LearningPath learningPath = (LearningPath) theEObject;
			T result = caseLearningPath(learningPath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNING_OBJECTIVE: {
			LearningObjective learningObjective = (LearningObjective) theEObject;
			T result = caseLearningObjective(learningObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PREREQUISITE: {
			Prerequisite prerequisite = (Prerequisite) theEObject;
			T result = casePrerequisite(prerequisite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEVEL: {
			Level level = (Level) theEObject;
			T result = caseLevel(level);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_LEVEL: {
			MTLevel mtLevel = (MTLevel) theEObject;
			T result = caseMTLevel(mtLevel);
			if (result == null)
				result = caseLevel(mtLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_COMPLETION_TYPE: {
			MTCompletionType mtCompletionType = (MTCompletionType) theEObject;
			T result = caseMTCompletionType(mtCompletionType);
			if (result == null)
				result = caseCompletionType(mtCompletionType);
			if (result == null)
				result = caseTaskType(mtCompletionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TASK_TYPES: {
			TaskTypes taskTypes = (TaskTypes) theEObject;
			T result = caseTaskTypes(taskTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPLETION_TYPE: {
			CompletionType completionType = (CompletionType) theEObject;
			T result = caseCompletionType(completionType);
			if (result == null)
				result = caseTaskType(completionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.VERIFICATION_TYPE: {
			VerificationType verificationType = (VerificationType) theEObject;
			T result = caseVerificationType(verificationType);
			if (result == null)
				result = caseTaskType(verificationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RECONSTRUCTION_TYPE: {
			ReconstructionType reconstructionType = (ReconstructionType) theEObject;
			T result = caseReconstructionType(reconstructionType);
			if (result == null)
				result = caseTaskType(reconstructionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TASK_TYPE: {
			TaskType taskType = (TaskType) theEObject;
			T result = caseTaskType(taskType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.FACT_VERIFICATION_TYPE: {
			FactVerificationType factVerificationType = (FactVerificationType) theEObject;
			T result = caseFactVerificationType(factVerificationType);
			if (result == null)
				result = caseVerificationType(factVerificationType);
			if (result == null)
				result = caseTaskType(factVerificationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RESULT_VERIFICATION_TYPE: {
			ResultVerificationType resultVerificationType = (ResultVerificationType) theEObject;
			T result = caseResultVerificationType(resultVerificationType);
			if (result == null)
				result = caseVerificationType(resultVerificationType);
			if (result == null)
				result = caseTaskType(resultVerificationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GENERATION_CONTEXT: {
			GenerationContext generationContext = (GenerationContext) theEObject;
			T result = caseGenerationContext(generationContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNER_PLAYER: {
			LearnerPlayer learnerPlayer = (LearnerPlayer) theEObject;
			T result = caseLearnerPlayer(learnerPlayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PROGRESSION: {
			Progression progression = (Progression) theEObject;
			T result = caseProgression(progression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL: {
			CurrentObjectiveLevel currentObjectiveLevel = (CurrentObjectiveLevel) theEObject;
			T result = caseCurrentObjectiveLevel(currentObjectiveLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.POSITION: {
			Position position = (Position) theEObject;
			T result = casePosition(position);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFact(AbstractFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Of Facts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Of Facts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOfFacts(SetOfFacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFact(Fact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledge(Knowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameContent(GameContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gameplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameplay(Gameplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Game Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Game Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreGameRule(CoreGameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameObjective(GameObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType2(RoomType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloor(Floor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomElement(IRoomElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementShape(ElementShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementState(ElementState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dungeon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dungeon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDungeon(Dungeon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameDescription(GameDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallRoomType(SmallRoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeRoomType(LargeRoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAccess(RoomAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameContext(GameContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningDomain(LearningDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningPath(LearningPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningObjective(LearningObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisite(Prerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLevel(MTLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Completion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Completion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTCompletionType(MTCompletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskTypes(TaskTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionType(CompletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationType(VerificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconstruction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconstruction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconstructionType(ReconstructionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Verification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Verification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactVerificationType(FactVerificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Verification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Verification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultVerificationType(ResultVerificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationContext(GenerationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learner Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learner Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearnerPlayer(LearnerPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgression(Progression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Objective Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Objective Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentObjectiveLevel(CurrentObjectiveLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GeneratorSwitch
