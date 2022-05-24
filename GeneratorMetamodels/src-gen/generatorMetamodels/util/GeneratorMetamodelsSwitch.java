/**
 */
package generatorMetamodels.util;

import generatorMetamodels.*;

import java.util.Map;

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
 * @see generatorMetamodels.GeneratorMetamodelsPackage
 * @generated
 */
public class GeneratorMetamodelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorMetamodelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorMetamodelsSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratorMetamodelsPackage.eINSTANCE;
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
		case GeneratorMetamodelsPackage.MULTIPLE_CHOICE: {
			MultipleChoice multipleChoice = (MultipleChoice) theEObject;
			T result = caseMultipleChoice(multipleChoice);
			if (result == null)
				result = caseResponseModality(multipleChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.RESULT_VALIDITY_DETERMINATION: {
			ResultValidityDetermination resultValidityDetermination = (ResultValidityDetermination) theEObject;
			T result = caseResultValidityDetermination(resultValidityDetermination);
			if (result == null)
				result = caseSubObjective(resultValidityDetermination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.SET_OF_FACTS: {
			SetOfFacts setOfFacts = (SetOfFacts) theEObject;
			T result = caseSetOfFacts(setOfFacts);
			if (result == null)
				result = caseAbstractFact(setOfFacts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.PROBLEM_RESOLUTION: {
			ProblemResolution problemResolution = (ProblemResolution) theEObject;
			T result = caseProblemResolution(problemResolution);
			if (result == null)
				result = caseSubObjective(problemResolution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.EXIT_ROOM: {
			ExitRoom exitRoom = (ExitRoom) theEObject;
			T result = caseExitRoom(exitRoom);
			if (result == null)
				result = caseRoom(exitRoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.QF_TWO_COMPLETION: {
			QFTwoCompletion qfTwoCompletion = (QFTwoCompletion) theEObject;
			T result = caseQFTwoCompletion(qfTwoCompletion);
			if (result == null)
				result = caseSubObjective(qfTwoCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION: {
			CurrentProgression currentProgression = (CurrentProgression) theEObject;
			T result = caseCurrentProgression(currentProgression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.DUNGEON: {
			Dungeon dungeon = (Dungeon) theEObject;
			T result = caseDungeon(dungeon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseResponseModality(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.QUESTION_ROOM: {
			QuestionRoom questionRoom = (QuestionRoom) theEObject;
			T result = caseQuestionRoom(questionRoom);
			if (result == null)
				result = caseRoom(questionRoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEARNING_PATH: {
			LearningPath learningPath = (LearningPath) theEObject;
			T result = caseLearningPath(learningPath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ABSTRACT_FACT: {
			AbstractFact abstractFact = (AbstractFact) theEObject;
			T result = caseAbstractFact(abstractFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.FACT: {
			Fact fact = (Fact) theEObject;
			T result = caseFact(fact);
			if (result == null)
				result = caseAbstractFact(fact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEARNER_PLAYER: {
			LearnerPlayer learnerPlayer = (LearnerPlayer) theEObject;
			T result = caseLearnerPlayer(learnerPlayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY: {
			HighLevelActivity highLevelActivity = (HighLevelActivity) theEObject;
			T result = caseHighLevelActivity(highLevelActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ENTRY_ROOM: {
			EntryRoom entryRoom = (EntryRoom) theEObject;
			T result = caseEntryRoom(entryRoom);
			if (result == null)
				result = caseRoom(entryRoom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.DOOR: {
			Door door = (Door) theEObject;
			T result = caseDoor(door);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.QF_RECONSTRUCTION: {
			QFReconstruction qfReconstruction = (QFReconstruction) theEObject;
			T result = caseQFReconstruction(qfReconstruction);
			if (result == null)
				result = caseSubObjective(qfReconstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE: {
			SubObjective subObjective = (SubObjective) theEObject;
			T result = caseSubObjective(subObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.RESPONSE_MODALITY: {
			ResponseModality responseModality = (ResponseModality) theEObject;
			T result = caseResponseModality(responseModality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.QF_ONE_COMPLETION: {
			QFOneCompletion qfOneCompletion = (QFOneCompletion) theEObject;
			T result = caseQFOneCompletion(qfOneCompletion);
			if (result == null)
				result = caseSubObjective(qfOneCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.GAME_PROFILE: {
			GameProfile gameProfile = (GameProfile) theEObject;
			T result = caseGameProfile(gameProfile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEARNING_PROFILE: {
			LearningProfile learningProfile = (LearningProfile) theEObject;
			T result = caseLearningProfile(learningProfile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE: {
			LearningObjective learningObjective = (LearningObjective) theEObject;
			T result = caseLearningObjective(learningObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEVEL: {
			Level level = (Level) theEObject;
			T result = caseLevel(level);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.KNOWLEDGE: {
			Knowledge knowledge = (Knowledge) theEObject;
			T result = caseKnowledge(knowledge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.QF_VALIDITY_DETERMINATION: {
			QFValidityDetermination qfValidityDetermination = (QFValidityDetermination) theEObject;
			T result = caseQFValidityDetermination(qfValidityDetermination);
			if (result == null)
				result = caseSubObjective(qfValidityDetermination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ROOM: {
			Room room = (Room) theEObject;
			T result = caseRoom(room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.GAMING_OBJECTIVE: {
			GamingObjective gamingObjective = (GamingObjective) theEObject;
			T result = caseGamingObjective(gamingObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.GAME_DOMAIN: {
			GameDomain gameDomain = (GameDomain) theEObject;
			T result = caseGameDomain(gameDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.GAME_ELEMENTS: {
			GameElements gameElements = (GameElements) theEObject;
			T result = caseGameElements(gameElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT: {
			ConceptualElement conceptualElement = (ConceptualElement) theEObject;
			T result = caseConceptualElement(conceptualElement);
			if (result == null)
				result = caseGameElements(conceptualElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT: {
			ConcreteElement concreteElement = (ConcreteElement) theEObject;
			T result = caseConcreteElement(concreteElement);
			if (result == null)
				result = caseGameElements(concreteElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ROOM_TYPE_TO_EINT_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<RoomType, Integer> roomTypeToEIntMap = (Map.Entry<RoomType, Integer>) theEObject;
			T result = caseRoomTypeToEIntMap(roomTypeToEIntMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.LEARNING_PATHS: {
			LearningPaths learningPaths = (LearningPaths) theEObject;
			T result = caseLearningPaths(learningPaths);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.DOORS3_ROOM: {
			Doors3Room doors3Room = (Doors3Room) theEObject;
			T result = caseDoors3Room(doors3Room);
			if (result == null)
				result = caseQuestionRoom(doors3Room);
			if (result == null)
				result = caseRoom(doors3Room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.CHESTS3_ROOM: {
			Chests3Room chests3Room = (Chests3Room) theEObject;
			T result = caseChests3Room(chests3Room);
			if (result == null)
				result = caseQuestionRoom(chests3Room);
			if (result == null)
				result = caseRoom(chests3Room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY: {
			AdaptedLearningGameActivity adaptedLearningGameActivity = (AdaptedLearningGameActivity) theEObject;
			T result = caseAdaptedLearningGameActivity(adaptedLearningGameActivity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.MTQF_ONE_COMPLETION: {
			MTQFOneCompletion mtqfOneCompletion = (MTQFOneCompletion) theEObject;
			T result = caseMTQFOneCompletion(mtqfOneCompletion);
			if (result == null)
				result = caseQFOneCompletion(mtqfOneCompletion);
			if (result == null)
				result = caseSubObjective(mtqfOneCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.MT_LEVEL: {
			MTLevel mtLevel = (MTLevel) theEObject;
			T result = caseMTLevel(mtLevel);
			if (result == null)
				result = caseLevel(mtLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT: {
			DimensionsEntanglement dimensionsEntanglement = (DimensionsEntanglement) theEObject;
			T result = caseDimensionsEntanglement(dimensionsEntanglement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.SEMANTIC_RELATION: {
			SemanticRelation semanticRelation = (SemanticRelation) theEObject;
			T result = caseSemanticRelation(semanticRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE: {
			Room2SubObjectiveCompliance room2SubObjectiveCompliance = (Room2SubObjectiveCompliance) theEObject;
			T result = caseRoom2SubObjectiveCompliance(room2SubObjectiveCompliance);
			if (result == null)
				result = caseSemanticRelation(room2SubObjectiveCompliance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.PREREQUISITE: {
			Prerequisite prerequisite = (Prerequisite) theEObject;
			T result = casePrerequisite(prerequisite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.MT_TABLE_BUILDING: {
			MTTableBuilding mtTableBuilding = (MTTableBuilding) theEObject;
			T result = caseMTTableBuilding(mtTableBuilding);
			if (result == null)
				result = caseParameter(mtTableBuilding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.MT_RESULT_POSITION: {
			MTResultPosition mtResultPosition = (MTResultPosition) theEObject;
			T result = caseMTResultPosition(mtResultPosition);
			if (result == null)
				result = caseParameter(mtResultPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM: {
			MTLevelParam mtLevelParam = (MTLevelParam) theEObject;
			T result = caseMTLevelParam(mtLevelParam);
			if (result == null)
				result = caseLevel(mtLevelParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE: {
			Parameter2RoomIncompliance parameter2RoomIncompliance = (Parameter2RoomIncompliance) theEObject;
			T result = caseParameter2RoomIncompliance(parameter2RoomIncompliance);
			if (result == null)
				result = caseSemanticRelation(parameter2RoomIncompliance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoice(MultipleChoice object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Exit Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitRoom(ExitRoom object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Current Progression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Progression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentProgression(CurrentProgression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>High Level Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>High Level Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighLevelActivity(HighLevelActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryRoom(EntryRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Response Modality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Modality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseModality(ResponseModality object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Game Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameProfile(GameProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningProfile(LearningProfile object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Gaming Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gaming Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamingObjective(GamingObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameDomain(GameDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameElements(GameElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualElement(ConceptualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteElement(ConcreteElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type To EInt Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type To EInt Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypeToEIntMap(Map.Entry<RoomType, Integer> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Doors3 Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doors3 Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoors3Room(Doors3Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chests3 Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chests3 Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChests3Room(Chests3Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapted Learning Game Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapted Learning Game Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptedLearningGameActivity(AdaptedLearningGameActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF One Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF One Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFOneCompletion(MTQFOneCompletion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Entanglement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Entanglement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsEntanglement(DimensionsEntanglement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticRelation(SemanticRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room2 Sub Objective Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room2 Sub Objective Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom2SubObjectiveCompliance(Room2SubObjectiveCompliance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MT Table Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Table Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTTableBuilding(MTTableBuilding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Result Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Result Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTResultPosition(MTResultPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Level Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Level Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLevelParam(MTLevelParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter2 Room Incompliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter2 Room Incompliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter2RoomIncompliance(Parameter2RoomIncompliance object) {
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

} //GeneratorMetamodelsSwitch
