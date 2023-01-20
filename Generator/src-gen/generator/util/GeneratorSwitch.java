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
		case GeneratorPackage.OBJECTIVE: {
			Objective objective = (Objective) theEObject;
			T result = caseObjective(objective);
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
		case GeneratorPackage.MT_COMPLETION1: {
			MTCompletion1 mtCompletion1 = (MTCompletion1) theEObject;
			T result = caseMTCompletion1(mtCompletion1);
			if (result == null)
				result = caseCompletion1Task(mtCompletion1);
			if (result == null)
				result = caseATask(mtCompletion1);
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
		case GeneratorPackage.RESPONSE_MODALITY: {
			ResponseModality responseModality = (ResponseModality) theEObject;
			T result = caseResponseModality(responseModality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MULTIPLE_CHOICE: {
			MultipleChoice multipleChoice = (MultipleChoice) theEObject;
			T result = caseMultipleChoice(multipleChoice);
			if (result == null)
				result = caseResponseModality(multipleChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ENTER_RESPONSE: {
			EnterResponse enterResponse = (EnterResponse) theEObject;
			T result = caseEnterResponse(enterResponse);
			if (result == null)
				result = caseResponseModality(enterResponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ROOM_TYPES: {
			RoomTypes roomTypes = (RoomTypes) theEObject;
			T result = caseRoomTypes(roomTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ATASK: {
			ATask aTask = (ATask) theEObject;
			T result = caseATask(aTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPLETION1_TASK: {
			Completion1Task completion1Task = (Completion1Task) theEObject;
			T result = caseCompletion1Task(completion1Task);
			if (result == null)
				result = caseATask(completion1Task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPLETION2_TASK: {
			Completion2Task completion2Task = (Completion2Task) theEObject;
			T result = caseCompletion2Task(completion2Task);
			if (result == null)
				result = caseATask(completion2Task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RECONSTRUCTION_TASK: {
			ReconstructionTask reconstructionTask = (ReconstructionTask) theEObject;
			T result = caseReconstructionTask(reconstructionTask);
			if (result == null)
				result = caseATask(reconstructionTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.IDENTIFICATION_TASK: {
			IdentificationTask identificationTask = (IdentificationTask) theEObject;
			T result = caseIdentificationTask(identificationTask);
			if (result == null)
				result = caseATask(identificationTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MEMBERSHIP_ID_TASK: {
			MembershipIDTask membershipIDTask = (MembershipIDTask) theEObject;
			T result = caseMembershipIDTask(membershipIDTask);
			if (result == null)
				result = caseATask(membershipIDTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_COMPLETION2: {
			MTCompletion2 mtCompletion2 = (MTCompletion2) theEObject;
			T result = caseMTCompletion2(mtCompletion2);
			if (result == null)
				result = caseCompletion2Task(mtCompletion2);
			if (result == null)
				result = caseATask(mtCompletion2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_RECONTRUCTION: {
			MTRecontruction mtRecontruction = (MTRecontruction) theEObject;
			T result = caseMTRecontruction(mtRecontruction);
			if (result == null)
				result = caseReconstructionTask(mtRecontruction);
			if (result == null)
				result = caseATask(mtRecontruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_IDENTIFICATION: {
			MTIdentification mtIdentification = (MTIdentification) theEObject;
			T result = caseMTIdentification(mtIdentification);
			if (result == null)
				result = caseIdentificationTask(mtIdentification);
			if (result == null)
				result = caseATask(mtIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_MEMBERSHIP: {
			MTMembership mtMembership = (MTMembership) theEObject;
			T result = caseMTMembership(mtMembership);
			if (result == null)
				result = caseMembershipIDTask(mtMembership);
			if (result == null)
				result = caseATask(mtMembership);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RESULTS: {
			Results results = (Results) theEObject;
			T result = caseResults(results);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RESULTS_BY_TASK: {
			ResultsByTask resultsByTask = (ResultsByTask) theEObject;
			T result = caseResultsByTask(resultsByTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QF_RESULTS: {
			QFResults qfResults = (QFResults) theEObject;
			T result = caseQFResults(qfResults);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_FACT: {
			MTFact mtFact = (MTFact) theEObject;
			T result = caseMTFact(mtFact);
			if (result == null)
				result = caseAbstractFact(mtFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_RESULT_FACT: {
			MTResultFact mtResultFact = (MTResultFact) theEObject;
			T result = caseMTResultFact(mtResultFact);
			if (result == null)
				result = caseAbstractFact(mtResultFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTIONABLE_FACT: {
			QuestionableFact questionableFact = (QuestionableFact) theEObject;
			T result = caseQuestionableFact(questionableFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MTQF_COMPLETION1: {
			MTQFCompletion1 mtqfCompletion1 = (MTQFCompletion1) theEObject;
			T result = caseMTQFCompletion1(mtqfCompletion1);
			if (result == null)
				result = caseQuestionableFact(mtqfCompletion1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MTQF_COMPLETION2: {
			MTQFCompletion2 mtqfCompletion2 = (MTQFCompletion2) theEObject;
			T result = caseMTQFCompletion2(mtqfCompletion2);
			if (result == null)
				result = caseQuestionableFact(mtqfCompletion2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MTQF_REBUILD: {
			MTQFRebuild mtqfRebuild = (MTQFRebuild) theEObject;
			T result = caseMTQFRebuild(mtqfRebuild);
			if (result == null)
				result = caseQuestionableFact(mtqfRebuild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MTQF_IDENTIFICATION: {
			MTQFIdentification mtqfIdentification = (MTQFIdentification) theEObject;
			T result = caseMTQFIdentification(mtqfIdentification);
			if (result == null)
				result = caseQuestionableFact(mtqfIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MTQF_MEMBERSHIP: {
			MTQFMembership mtqfMembership = (MTQFMembership) theEObject;
			T result = caseMTQFMembership(mtqfMembership);
			if (result == null)
				result = caseQuestionableFact(mtqfMembership);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTIONED_FACT: {
			QuestionedFact questionedFact = (QuestionedFact) theEObject;
			T result = caseQuestionedFact(questionedFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_QE_FCOMPLETION1: {
			MTQeFCompletion1 mtQeFCompletion1 = (MTQeFCompletion1) theEObject;
			T result = caseMTQeFCompletion1(mtQeFCompletion1);
			if (result == null)
				result = caseQuestionedFact(mtQeFCompletion1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_QE_FCOMPLETION2: {
			MTQeFCompletion2 mtQeFCompletion2 = (MTQeFCompletion2) theEObject;
			T result = caseMTQeFCompletion2(mtQeFCompletion2);
			if (result == null)
				result = caseQuestionedFact(mtQeFCompletion2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_QE_FREBUILD: {
			MTQeFRebuild mtQeFRebuild = (MTQeFRebuild) theEObject;
			T result = caseMTQeFRebuild(mtQeFRebuild);
			if (result == null)
				result = caseQuestionedFact(mtQeFRebuild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_QE_FIDENTIFICATION: {
			MTQeFIdentification mtQeFIdentification = (MTQeFIdentification) theEObject;
			T result = caseMTQeFIdentification(mtQeFIdentification);
			if (result == null)
				result = caseQuestionedFact(mtQeFIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MT_QE_FMEMBERSHIP: {
			MTQeFMembership mtQeFMembership = (MTQeFMembership) theEObject;
			T result = caseMTQeFMembership(mtQeFMembership);
			if (result == null)
				result = caseQuestionedFact(mtQeFMembership);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPLETION_CRITERIA: {
			CompletionCriteria completionCriteria = (CompletionCriteria) theEObject;
			T result = caseCompletionCriteria(completionCriteria);
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
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MT Completion1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Completion1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTCompletion1(MTCompletion1 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Enter Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enter Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterResponse(EnterResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypes(RoomTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATask(ATask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion1 Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion1 Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletion1Task(Completion1Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion2 Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion2 Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletion2Task(Completion2Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconstruction Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconstruction Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconstructionTask(ReconstructionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationTask(IdentificationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership ID Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership ID Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembershipIDTask(MembershipIDTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Completion2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Completion2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTCompletion2(MTCompletion2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Recontruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Recontruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTRecontruction(MTRecontruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTIdentification(MTIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTMembership(MTMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResults(Results object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results By Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results By Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsByTask(ResultsByTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QF Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QF Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFResults(QFResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTFact(MTFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Result Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Result Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTResultFact(MTResultFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionable Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionable Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionableFact(QuestionableFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF Completion1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF Completion1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFCompletion1(MTQFCompletion1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF Completion2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF Completion2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFCompletion2(MTQFCompletion2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF Rebuild</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF Rebuild</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFRebuild(MTQFRebuild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFIdentification(MTQFIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTQF Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTQF Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQFMembership(MTQFMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questioned Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questioned Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionedFact(QuestionedFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Qe FCompletion1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Qe FCompletion1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQeFCompletion1(MTQeFCompletion1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Qe FCompletion2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Qe FCompletion2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQeFCompletion2(MTQeFCompletion2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Qe FRebuild</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Qe FRebuild</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQeFRebuild(MTQeFRebuild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Qe FIdentification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Qe FIdentification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQeFIdentification(MTQeFIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Qe FMembership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Qe FMembership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTQeFMembership(MTQeFMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionCriteria(CompletionCriteria object) {
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
