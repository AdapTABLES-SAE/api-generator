/**
 */
package generator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import generator.AbstractFact;
import generator.ClassicRoom;
import generator.CoreGameRule;
import generator.Dungeon;
import generator.DungeonOLD;
import generator.ElementShape;
import generator.ElementState;
import generator.ElementType;
import generator.Fact;
import generator.Floor;
import generator.GameContent;
import generator.GameDescription;
import generator.GameObjective;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.IRoomElement;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearningObjective;
import generator.LearningPath;
import generator.LearningPaths;
import generator.Level;
import generator.Location;
import generator.Pathway;
import generator.PlacedObject;
import generator.Prerequisite;
import generator.ProblemResolution;
import generator.QFOneCompletion;
import generator.QFReconstruction;
import generator.QFTwoCompletion;
import generator.QFValidityDetermination;
import generator.QuestionRoom;
import generator.ResultValidityDetermination;
import generator.RogueliteContext;
import generator.Room;
import generator.RoomAccess;
import generator.RoomOLD;
import generator.RoomType;
import generator.RoomType2;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.State;
import generator.SubObjective;
import generators.*;

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
		case GeneratorPackage.QF_VALIDITY_DETERMINATION: {
			QFValidityDetermination qfValidityDetermination = (QFValidityDetermination) theEObject;
			T result = caseQFValidityDetermination(qfValidityDetermination);
			if (result == null)
				result = caseSubObjective(qfValidityDetermination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNING_PATHS: {
			LearningPaths learningPaths = (LearningPaths) theEObject;
			T result = caseLearningPaths(learningPaths);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RESULT_VALIDITY_DETERMINATION: {
			ResultValidityDetermination resultValidityDetermination = (ResultValidityDetermination) theEObject;
			T result = caseResultValidityDetermination(resultValidityDetermination);
			if (result == null)
				result = caseSubObjective(resultValidityDetermination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QF_ONE_COMPLETION: {
			QFOneCompletion qfOneCompletion = (QFOneCompletion) theEObject;
			T result = caseQFOneCompletion(qfOneCompletion);
			if (result == null)
				result = caseSubObjective(qfOneCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QF_RECONSTRUCTION: {
			QFReconstruction qfReconstruction = (QFReconstruction) theEObject;
			T result = caseQFReconstruction(qfReconstruction);
			if (result == null)
				result = caseSubObjective(qfReconstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SUB_OBJECTIVE: {
			SubObjective subObjective = (SubObjective) theEObject;
			T result = caseSubObjective(subObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QF_TWO_COMPLETION: {
			QFTwoCompletion qfTwoCompletion = (QFTwoCompletion) theEObject;
			T result = caseQFTwoCompletion(qfTwoCompletion);
			if (result == null)
				result = caseSubObjective(qfTwoCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PROBLEM_RESOLUTION: {
			ProblemResolution problemResolution = (ProblemResolution) theEObject;
			T result = caseProblemResolution(problemResolution);
			if (result == null)
				result = caseSubObjective(problemResolution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
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
		case GeneratorPackage.DUNGEON_OLD: {
			DungeonOLD dungeonOLD = (DungeonOLD) theEObject;
			T result = caseDungeonOLD(dungeonOLD);
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
		case GeneratorPackage.ROOM_OLD: {
			RoomOLD roomOLD = (RoomOLD) theEObject;
			T result = caseRoomOLD(roomOLD);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CLASSIC_ROOM: {
			ClassicRoom classicRoom = (ClassicRoom) theEObject;
			T result = caseClassicRoom(classicRoom);
			if (result == null)
				result = caseRoomOLD(classicRoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTION_ROOM: {
			QuestionRoom questionRoom = (QuestionRoom) theEObject;
			T result = caseQuestionRoom(questionRoom);
			if (result == null)
				result = caseRoomOLD(questionRoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PATHWAY: {
			Pathway pathway = (Pathway) theEObject;
			T result = casePathway(pathway);
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
		case GeneratorPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PLACED_OBJECT: {
			PlacedObject placedObject = (PlacedObject) theEObject;
			T result = casePlacedObject(placedObject);
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
		case GeneratorPackage.ROGUELITE_CONTEXT: {
			RogueliteContext rogueliteContext = (RogueliteContext) theEObject;
			T result = caseRogueliteContext(rogueliteContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>QF Validity Determination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QF Validity Determination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFValidityDetermination(QFValidityDetermination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningPaths(LearningPaths object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Validity Determination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Validity Determination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultValidityDetermination(ResultValidityDetermination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QF One Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QF One Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFOneCompletion(QFOneCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QF Reconstruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QF Reconstruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFReconstruction(QFReconstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubObjective(SubObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QF Two Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QF Two Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFTwoCompletion(QFTwoCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemResolution(ProblemResolution object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Dungeon OLD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dungeon OLD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDungeonOLD(DungeonOLD object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Room OLD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room OLD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomOLD(RoomOLD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classic Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classic Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassicRoom(ClassicRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionRoom(QuestionRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathway(Pathway object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacedObject(PlacedObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Roguelite Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roguelite Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRogueliteContext(RogueliteContext object) {
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
