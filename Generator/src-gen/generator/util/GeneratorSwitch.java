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
				result = caseCompletionTask(mtCompletion1);
			if (result == null)
				result = caseATask(mtCompletion1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CLASSROOM: {
			Classroom classroom = (Classroom) theEObject;
			T result = caseClassroom(classroom);
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
		case GeneratorPackage.COMPLETION_TASK: {
			CompletionTask completionTask = (CompletionTask) theEObject;
			T result = caseCompletionTask(completionTask);
			if (result == null)
				result = caseATask(completionTask);
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
				result = caseCompletionTask(mtCompletion2);
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
				result = caseCompletionTask(mtRecontruction);
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
		case GeneratorPackage.COMPLETION_CRITERIA: {
			CompletionCriteria completionCriteria = (CompletionCriteria) theEObject;
			T result = caseCompletionCriteria(completionCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS: {
			LevelsDifficultyProgress levelsDifficultyProgress = (LevelsDifficultyProgress) theEObject;
			T result = caseLevelsDifficultyProgress(levelsDifficultyProgress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAME_ELEMENT_TYPES: {
			GameElementTypes gameElementTypes = (GameElementTypes) theEObject;
			T result = caseGameElementTypes(gameElementTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ELEMENTS_TYPES: {
			ElementsTypes elementsTypes = (ElementsTypes) theEObject;
			T result = caseElementsTypes(elementsTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.EQUIPMENTS: {
			Equipments equipments = (Equipments) theEObject;
			T result = caseEquipments(equipments);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.EQUIPMENT: {
			Equipment equipment = (Equipment) theEObject;
			T result = caseEquipment(equipment);
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
		case GeneratorPackage.GAMEPLAYS: {
			Gameplays gameplays = (Gameplays) theEObject;
			T result = caseGameplays(gameplays);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT: {
			QuestionableFactResult questionableFactResult = (QuestionableFactResult) theEObject;
			T result = caseQuestionableFactResult(questionableFactResult);
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
		case GeneratorPackage.ABILITIES: {
			Abilities abilities = (Abilities) theEObject;
			T result = caseAbilities(abilities);
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
		case GeneratorPackage.POSITIONED_ELEMENT: {
			PositionedElement positionedElement = (PositionedElement) theEObject;
			T result = casePositionedElement(positionedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTION_PARAM: {
			QuestionParam questionParam = (QuestionParam) theEObject;
			T result = caseQuestionParam(questionParam);
			if (result == null)
				result = caseAQuestionParam(questionParam);
			if (result == null)
				result = caseParameter(questionParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PROPOSITION_PARAM: {
			PropositionParam propositionParam = (PropositionParam) theEObject;
			T result = casePropositionParam(propositionParam);
			if (result == null)
				result = caseParameter(propositionParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseAValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CORRECTNESS: {
			Correctness correctness = (Correctness) theEObject;
			T result = caseCorrectness(correctness);
			if (result == null)
				result = caseParameter(correctness);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ENTRY_SOLUCE_PARAM: {
			EntrySoluceParam entrySoluceParam = (EntrySoluceParam) theEObject;
			T result = caseEntrySoluceParam(entrySoluceParam);
			if (result == null)
				result = caseParameter(entrySoluceParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DISPLAY: {
			Display display = (Display) theEObject;
			T result = caseDisplay(display);
			if (result == null)
				result = caseParameter(display);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ACOMPONENT: {
			AComponent aComponent = (AComponent) theEObject;
			T result = caseAComponent(aComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.STRUCTURE: {
			Structure structure = (Structure) theEObject;
			T result = caseStructure(structure);
			if (result == null)
				result = caseAComponent(structure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseAComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUANTITY: {
			Quantity quantity = (Quantity) theEObject;
			T result = caseQuantity(quantity);
			if (result == null)
				result = caseParameter(quantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.WANTED_ANSWERS_PARAM: {
			WantedAnswersParam wantedAnswersParam = (WantedAnswersParam) theEObject;
			T result = caseWantedAnswersParam(wantedAnswersParam);
			if (result == null)
				result = caseParameter(wantedAnswersParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.EXPECTED_ANSWER: {
			ExpectedAnswer expectedAnswer = (ExpectedAnswer) theEObject;
			T result = caseExpectedAnswer(expectedAnswer);
			if (result == null)
				result = caseParameter(expectedAnswer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CORRECTNESS_VALUE: {
			CorrectnessValue correctnessValue = (CorrectnessValue) theEObject;
			T result = caseCorrectnessValue(correctnessValue);
			if (result == null)
				result = caseAValue(correctnessValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.AVALUE: {
			AValue aValue = (AValue) theEObject;
			T result = caseAValue(aValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT: {
			PositionedStructureElement positionedStructureElement = (PositionedStructureElement) theEObject;
			T result = casePositionedStructureElement(positionedStructureElement);
			if (result == null)
				result = casePositionedElement(positionedStructureElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.FACT_SOLUTION_PARAM: {
			FactSolutionParam factSolutionParam = (FactSolutionParam) theEObject;
			T result = caseFactSolutionParam(factSolutionParam);
			if (result == null)
				result = caseParameter(factSolutionParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ORDERING_TASK: {
			OrderingTask orderingTask = (OrderingTask) theEObject;
			T result = caseOrderingTask(orderingTask);
			if (result == null)
				result = caseATask(orderingTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PROMPT: {
			Prompt prompt = (Prompt) theEObject;
			T result = casePrompt(prompt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.FACT_CORRECTNESS_PARAM: {
			FactCorrectnessParam factCorrectnessParam = (FactCorrectnessParam) theEObject;
			T result = caseFactCorrectnessParam(factCorrectnessParam);
			if (result == null)
				result = caseParameter(factCorrectnessParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GAMEPLAY_TASK_RELATIONS: {
			GameplayTaskRelations gameplayTaskRelations = (GameplayTaskRelations) theEObject;
			T result = caseGameplayTaskRelations(gameplayTaskRelations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUESTION_GAMEPLAY: {
			QuestionGameplay questionGameplay = (QuestionGameplay) theEObject;
			T result = caseQuestionGameplay(questionGameplay);
			if (result == null)
				result = caseGameplay(questionGameplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.NO_QUESTION_GAMEPLAY: {
			NoQuestionGameplay noQuestionGameplay = (NoQuestionGameplay) theEObject;
			T result = caseNoQuestionGameplay(noQuestionGameplay);
			if (result == null)
				result = caseGameplay(noQuestionGameplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SIZE: {
			Size size = (Size) theEObject;
			T result = caseSize(size);
			if (result == null)
				result = caseParameter(size);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE: {
			StatementElementType statementElementType = (StatementElementType) theEObject;
			T result = caseStatementElementType(statementElementType);
			if (result == null)
				result = caseElementType(statementElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PLAYER_PROGRESS: {
			PlayerProgress playerProgress = (PlayerProgress) theEObject;
			T result = casePlayerProgress(playerProgress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNER_PROGRESS: {
			LearnerProgress learnerProgress = (LearnerProgress) theEObject;
			T result = caseLearnerProgress(learnerProgress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ITEMS: {
			Items items = (Items) theEObject;
			T result = caseItems(items);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEARNER_PLAYERS: {
			LearnerPlayers learnerPlayers = (LearnerPlayers) theEObject;
			T result = caseLearnerPlayers(learnerPlayers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.STATISTICS: {
			Statistics statistics = (Statistics) theEObject;
			T result = caseStatistics(statistics);
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
		case GeneratorPackage.CURSES: {
			Curses curses = (Curses) theEObject;
			T result = caseCurses(curses);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CURSE: {
			Curse curse = (Curse) theEObject;
			T result = caseCurse(curse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LABYRINTH_CURSE: {
			LabyrinthCurse labyrinthCurse = (LabyrinthCurse) theEObject;
			T result = caseLabyrinthCurse(labyrinthCurse);
			if (result == null)
				result = caseCurse(labyrinthCurse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CURSE_ELIGIBILITY: {
			CurseEligibility curseEligibility = (CurseEligibility) theEObject;
			T result = caseCurseEligibility(curseEligibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAP: {
			Map map = (Map) theEObject;
			T result = caseMap(map);
			if (result == null)
				result = caseImage(map);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAP_ELEMENT_POSITION: {
			MapElementPosition mapElementPosition = (MapElementPosition) theEObject;
			T result = caseMapElementPosition(mapElementPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEGEND_SYMBOL: {
			LegendSymbol legendSymbol = (LegendSymbol) theEObject;
			T result = caseLegendSymbol(legendSymbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LEGEND_TEXT: {
			LegendText legendText = (LegendText) theEObject;
			T result = caseLegendText(legendText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.HISTORY_FACT: {
			HistoryFact historyFact = (HistoryFact) theEObject;
			T result = caseHistoryFact(historyFact);
			if (result == null)
				result = caseAbstractFact(historyFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT: {
			GeographyLegendFact geographyLegendFact = (GeographyLegendFact) theEObject;
			T result = caseGeographyLegendFact(geographyLegendFact);
			if (result == null)
				result = caseAbstractFact(geographyLegendFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GEOGRAPHY_FACT: {
			GeographyFact geographyFact = (GeographyFact) theEObject;
			T result = caseGeographyFact(geographyFact);
			if (result == null)
				result = caseAbstractFact(geographyFact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DATE: {
			Date date = (Date) theEObject;
			T result = caseDate(date);
			if (result == null)
				result = caseTime(date);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TIME_PERIOD: {
			TimePeriod timePeriod = (TimePeriod) theEObject;
			T result = caseTimePeriod(timePeriod);
			if (result == null)
				result = caseTime(timePeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAP_VALUE: {
			MapValue mapValue = (MapValue) theEObject;
			T result = caseMapValue(mapValue);
			if (result == null)
				result = caseValue(mapValue);
			if (result == null)
				result = caseAValue(mapValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.AQUESTION_PARAM: {
			AQuestionParam aQuestionParam = (AQuestionParam) theEObject;
			T result = caseAQuestionParam(aQuestionParam);
			if (result == null)
				result = caseParameter(aQuestionParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAP_QUESTION_PARAM: {
			MapQuestionParam mapQuestionParam = (MapQuestionParam) theEObject;
			T result = caseMapQuestionParam(mapQuestionParam);
			if (result == null)
				result = caseAQuestionParam(mapQuestionParam);
			if (result == null)
				result = caseParameter(mapQuestionParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.HASSOCIATION: {
			HAssociation hAssociation = (HAssociation) theEObject;
			T result = caseHAssociation(hAssociation);
			if (result == null)
				result = caseCompletionTask(hAssociation);
			if (result == null)
				result = caseATask(hAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.HLEGEND: {
			HLegend hLegend = (HLegend) theEObject;
			T result = caseHLegend(hLegend);
			if (result == null)
				result = caseCompletionTask(hLegend);
			if (result == null)
				result = caseATask(hLegend);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GLOCATE: {
			GLocate gLocate = (GLocate) theEObject;
			T result = caseGLocate(gLocate);
			if (result == null)
				result = caseMembershipIDTask(gLocate);
			if (result == null)
				result = caseATask(gLocate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TEACHER: {
			Teacher teacher = (Teacher) theEObject;
			T result = caseTeacher(teacher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TEACHERS: {
			Teachers teachers = (Teachers) theEObject;
			T result = caseTeachers(teachers);
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
	 * Returns the result of interpreting the object as an instance of '<em>Classroom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classroom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassroom(Classroom object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Completion Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionTask(CompletionTask object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Levels Difficulty Progress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Levels Difficulty Progress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelsDifficultyProgress(LevelsDifficultyProgress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Element Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Element Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameElementTypes(GameElementTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementsTypes(ElementsTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipments(Equipments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Questionable Fact Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionable Fact Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionableFactResult(QuestionableFactResult object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Positioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionedElement(PositionedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Question Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionParam(QuestionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropositionParam(PropositionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correctness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correctness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectness(Correctness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Soluce Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Soluce Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrySoluceParam(EntrySoluceParam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Curses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurses(Curses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurse(Curse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labyrinth Curse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labyrinth Curse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabyrinthCurse(LabyrinthCurse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curse Eligibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curse Eligibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurseEligibility(CurseEligibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Element Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Element Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapElementPosition(MapElementPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegendSymbol(LegendSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegendText(LegendText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryFact(HistoryFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geography Legend Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geography Legend Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographyLegendFact(GeographyLegendFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geography Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geography Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographyFact(GeographyFact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriod(TimePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapValue(MapValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AQuestion Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AQuestion Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAQuestionParam(AQuestionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Question Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Question Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapQuestionParam(MapQuestionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAssociation(HAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLegend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLegend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLegend(HLegend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLocate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLocate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGLocate(GLocate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeacher(Teacher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teachers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teachers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeachers(Teachers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AComponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAComponent(AComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wanted Answers Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wanted Answers Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWantedAnswersParam(WantedAnswersParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedAnswer(ExpectedAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correctness Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correctness Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrectnessValue(CorrectnessValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAValue(AValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned Structure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionedStructureElement(PositionedStructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Solution Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Solution Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactSolutionParam(FactSolutionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderingTask(OrderingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrompt(Prompt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Correctness Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Correctness Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactCorrectnessParam(FactCorrectnessParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gameplay Task Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gameplay Task Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameplayTaskRelations(GameplayTaskRelations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Gameplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionGameplay(QuestionGameplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Question Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Question Gameplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoQuestionGameplay(NoQuestionGameplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementElementType(StatementElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Progress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Progress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerProgress(PlayerProgress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learner Progress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learner Progress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearnerProgress(LearnerProgress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItems(Items object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learner Players</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learner Players</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearnerPlayers(LearnerPlayers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistics(Statistics object) {
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
