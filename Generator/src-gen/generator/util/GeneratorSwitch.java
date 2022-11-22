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
		case GeneratorPackage.ELEMENT_TYPE: {
			ElementType elementType = (ElementType) theEObject;
			T result = caseElementType(elementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.INTERACTION_ETYPE: {
			InteractionEType interactionEType = (InteractionEType) theEObject;
			T result = caseInteractionEType(interactionEType);
			if (result == null)
				result = caseElementType(interactionEType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ABILITY: {
			Ability ability = (Ability) theEObject;
			T result = caseAbility(ability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ACTIVE_ABILITY: {
			ActiveAbility activeAbility = (ActiveAbility) theEObject;
			T result = caseActiveAbility(activeAbility);
			if (result == null)
				result = caseAbility(activeAbility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PASSIVE_ABILITY: {
			PassiveAbility passiveAbility = (PassiveAbility) theEObject;
			T result = casePassiveAbility(passiveAbility);
			if (result == null)
				result = caseAbility(passiveAbility);
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
		case GeneratorPackage.GAME_RULE: {
			GameRule gameRule = (GameRule) theEObject;
			T result = caseGameRule(gameRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.BUYABLE_ELEMENT: {
			BuyableElement buyableElement = (BuyableElement) theEObject;
			T result = caseBuyableElement(buyableElement);
			if (result == null)
				result = caseElement(buyableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.AVATAR_EQUIPMENT: {
			AvatarEquipment avatarEquipment = (AvatarEquipment) theEObject;
			T result = caseAvatarEquipment(avatarEquipment);
			if (result == null)
				result = caseBuyableElement(avatarEquipment);
			if (result == null)
				result = caseElement(avatarEquipment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENTS: {
			Elements elements = (Elements) theEObject;
			T result = caseElements(elements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAMEPLAYS: {
			Gameplays gameplays = (Gameplays) theEObject;
			T result = caseGameplays(gameplays);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT_TYPES: {
			ElementTypes elementTypes = (ElementTypes) theEObject;
			T result = caseElementTypes(elementTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ABILITIES: {
			Abilities abilities = (Abilities) theEObject;
			T result = caseAbilities(abilities);
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
		case GeneratorPackage.EQUIPMENT_ETYPE: {
			EquipmentEType equipmentEType = (EquipmentEType) theEObject;
			T result = caseEquipmentEType(equipmentEType);
			if (result == null)
				result = caseElementType(equipmentEType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENT_POSITION: {
			ElementPosition elementPosition = (ElementPosition) theEObject;
			T result = caseElementPosition(elementPosition);
			if (result == null)
				result = casePosition(elementPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAPPING_MODEL: {
			MappingModel mappingModel = (MappingModel) theEObject;
			T result = caseMappingModel(mappingModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MODALITY2_ROOM_TYPE: {
			Modality2RoomType modality2RoomType = (Modality2RoomType) theEObject;
			T result = caseModality2RoomType(modality2RoomType);
			if (result == null)
				result = caseComplianceRelations(modality2RoomType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPLIANCE_RELATIONS: {
			ComplianceRelations complianceRelations = (ComplianceRelations) theEObject;
			T result = caseComplianceRelations(complianceRelations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY: {
			TaskType2Gameplay taskType2Gameplay = (TaskType2Gameplay) theEObject;
			T result = caseTaskType2Gameplay(taskType2Gameplay);
			if (result == null)
				result = caseComplianceRelations(taskType2Gameplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RESPONSE_MODALITIES: {
			ResponseModalities responseModalities = (ResponseModalities) theEObject;
			T result = caseResponseModalities(responseModalities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE: {
			Gameplay2RoomType gameplay2RoomType = (Gameplay2RoomType) theEObject;
			T result = caseGameplay2RoomType(gameplay2RoomType);
			if (result == null)
				result = caseComplianceRelations(gameplay2RoomType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Interaction EType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction EType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionEType(InteractionEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbility(Ability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveAbility(ActiveAbility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveAbility(PassiveAbility object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Game Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameRule(GameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buyable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buyable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuyableElement(BuyableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avatar Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avatar Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvatarEquipment(AvatarEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElements(Elements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gameplays</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gameplays</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameplays(Gameplays object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementTypes(ElementTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbilities(Abilities object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Equipment EType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment EType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentEType(EquipmentEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPosition(ElementPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingModel(MappingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality2 Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality2 Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModality2RoomType(Modality2RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceRelations(ComplianceRelations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type2 Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type2 Gameplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType2Gameplay(TaskType2Gameplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Modalities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Modalities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseModalities(ResponseModalities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gameplay2 Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gameplay2 Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameplay2RoomType(Gameplay2RoomType object) {
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
