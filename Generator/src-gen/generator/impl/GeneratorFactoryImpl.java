/**
 */
package generator.impl;

import generator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorFactoryImpl extends EFactoryImpl implements GeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorFactory init() {
		try {
			GeneratorFactory theGeneratorFactory = (GeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratorPackage.eNS_URI);
			if (theGeneratorFactory != null) {
				return theGeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GeneratorPackage.SET_OF_FACTS:
			return createSetOfFacts();
		case GeneratorPackage.KNOWLEDGE:
			return createKnowledge();
		case GeneratorPackage.DUNGEON:
			return createDungeon();
		case GeneratorPackage.ROOM:
			return createRoom();
		case GeneratorPackage.GAME_DESCRIPTION:
			return createGameDescription();
		case GeneratorPackage.SMALL_ROOM_TYPE:
			return createSmallRoomType();
		case GeneratorPackage.LARGE_ROOM_TYPE:
			return createLargeRoomType();
		case GeneratorPackage.ROOM_ACCESS:
			return createRoomAccess();
		case GeneratorPackage.GAME_CONTEXT:
			return createGameContext();
		case GeneratorPackage.LEARNING_DOMAIN:
			return createLearningDomain();
		case GeneratorPackage.LEARNING_PATH:
			return createLearningPath();
		case GeneratorPackage.OBJECTIVE:
			return createObjective();
		case GeneratorPackage.PREREQUISITE:
			return createPrerequisite();
		case GeneratorPackage.MT_LEVEL:
			return createMTLevel();
		case GeneratorPackage.MT_COMPLETION1:
			return createMTCompletion1();
		case GeneratorPackage.CLASSROOM:
			return createClassroom();
		case GeneratorPackage.LEARNER_PLAYER:
			return createLearnerPlayer();
		case GeneratorPackage.PROGRESSION:
			return createProgression();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL:
			return createCurrentObjectiveLevel();
		case GeneratorPackage.DYNAMIC_MULTIPLE_CHOICE:
			return createDynamicMultipleChoice();
		case GeneratorPackage.ENTER_RESPONSE:
			return createEnterResponse();
		case GeneratorPackage.ROOM_TYPES:
			return createRoomTypes();
		case GeneratorPackage.MT_COMPLETION2:
			return createMTCompletion2();
		case GeneratorPackage.MT_RECONTRUCTION:
			return createMTRecontruction();
		case GeneratorPackage.MT_IDENTIFICATION:
			return createMTIdentification();
		case GeneratorPackage.RESULTS:
			return createResults();
		case GeneratorPackage.RESULTS_BY_TASK:
			return createResultsByTask();
		case GeneratorPackage.MT_FACT:
			return createMTFact();
		case GeneratorPackage.MTQF_COMPLETION1:
			return createMTQFCompletion1();
		case GeneratorPackage.MTQF_COMPLETION2:
			return createMTQFCompletion2();
		case GeneratorPackage.MTQF_REBUILD:
			return createMTQFRebuild();
		case GeneratorPackage.MTQF_IDENTIFICATION:
			return createMTQFIdentification();
		case GeneratorPackage.MTQF_MEMBERSHIP:
			return createMTQFMembership();
		case GeneratorPackage.QUESTIONED_FACT:
			return createQuestionedFact();
		case GeneratorPackage.COMPLETION_CRITERIA:
			return createCompletionCriteria();
		case GeneratorPackage.LEVELS_DIFFICULTY_PROGRESS:
			return createLevelsDifficultyProgress();
		case GeneratorPackage.GAME_ELEMENT_TYPES:
			return createGameElementTypes();
		case GeneratorPackage.ELEMENTS_TYPES:
			return createElementsTypes();
		case GeneratorPackage.EQUIPMENTS:
			return createEquipments();
		case GeneratorPackage.EQUIPMENT:
			return createEquipment();
		case GeneratorPackage.GAMEPLAYS:
			return createGameplays();
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT:
			return createQuestionableFactResult();
		case GeneratorPackage.ABILITY:
			return createAbility();
		case GeneratorPackage.ABILITIES:
			return createAbilities();
		case GeneratorPackage.POSITION:
			return createPosition();
		case GeneratorPackage.POSITIONED_ELEMENT:
			return createPositionedElement();
		case GeneratorPackage.QUESTION_PARAM:
			return createQuestionParam();
		case GeneratorPackage.PROPOSITION_PARAM:
			return createPropositionParam();
		case GeneratorPackage.VALUE:
			return createValue();
		case GeneratorPackage.CORRECTNESS:
			return createCorrectness();
		case GeneratorPackage.ENTRY_SOLUCE_PARAM:
			return createEntrySoluceParam();
		case GeneratorPackage.DISPLAY:
			return createDisplay();
		case GeneratorPackage.STRUCTURE:
			return createStructure();
		case GeneratorPackage.COMPONENT:
			return createComponent();
		case GeneratorPackage.QUANTITY:
			return createQuantity();
		case GeneratorPackage.WANTED_ANSWERS_PARAM:
			return createWantedAnswersParam();
		case GeneratorPackage.EXPECTED_ANSWER:
			return createExpectedAnswer();
		case GeneratorPackage.CORRECTNESS_VALUE:
			return createCorrectnessValue();
		case GeneratorPackage.POSITIONED_STRUCTURE_ELEMENT:
			return createPositionedStructureElement();
		case GeneratorPackage.FACT_SOLUTION_PARAM:
			return createFactSolutionParam();
		case GeneratorPackage.PROMPT:
			return createPrompt();
		case GeneratorPackage.FACT_CORRECTNESS_PARAM:
			return createFactCorrectnessParam();
		case GeneratorPackage.GAMEPLAY_TASK_RELATIONS:
			return createGameplayTaskRelations();
		case GeneratorPackage.RELATION:
			return createRelation();
		case GeneratorPackage.CONDITION:
			return createCondition();
		case GeneratorPackage.QUESTION_GAMEPLAY:
			return createQuestionGameplay();
		case GeneratorPackage.NO_QUESTION_GAMEPLAY:
			return createNoQuestionGameplay();
		case GeneratorPackage.SIZE:
			return createSize();
		case GeneratorPackage.STATEMENT_ELEMENT_TYPE:
			return createStatementElementType();
		case GeneratorPackage.PLAYER_PROGRESS:
			return createPlayerProgress();
		case GeneratorPackage.LEARNER_PROGRESS:
			return createLearnerProgress();
		case GeneratorPackage.ITEM:
			return createItem();
		case GeneratorPackage.ITEMS:
			return createItems();
		case GeneratorPackage.STATISTICS:
			return createStatistics();
		case GeneratorPackage.ELEMENT_TYPE:
			return createElementType();
		case GeneratorPackage.CURSES:
			return createCurses();
		case GeneratorPackage.CURSE:
			return createCurse();
		case GeneratorPackage.LABYRINTH_CURSE:
			return createLabyrinthCurse();
		case GeneratorPackage.CURSE_ELIGIBILITY:
			return createCurseEligibility();
		case GeneratorPackage.IMAGE:
			return createImage();
		case GeneratorPackage.VISUALIZATION:
			return createVisualization();
		case GeneratorPackage.VISUALIZATION_POSITION:
			return createVisualizationPosition();
		case GeneratorPackage.LEGEND_TEXT:
			return createLegendText();
		case GeneratorPackage.HISTORY_FACT:
			return createHistoryFact();
		case GeneratorPackage.GEOGRAPHY_LEGEND_FACT:
			return createGeographyLegendFact();
		case GeneratorPackage.GEOGRAPHY_FACT:
			return createGeographyFact();
		case GeneratorPackage.DATE:
			return createDate();
		case GeneratorPackage.TIME_PERIOD:
			return createTimePeriod();
		case GeneratorPackage.VISUALIZATION_QUESTION_PARAM:
			return createVisualizationQuestionParam();
		case GeneratorPackage.HISTORICAL_EVENT_ASSOCIATION:
			return createHistoricalEventAssociation();
		case GeneratorPackage.LEGEND_AMAP:
			return createLegendAMap();
		case GeneratorPackage.LOCATE_ON_AMAP:
			return createLocateOnAMap();
		case GeneratorPackage.TEACHER:
			return createTeacher();
		case GeneratorPackage.TEACHERS:
			return createTeachers();
		case GeneratorPackage.CLASSROOMS:
			return createClassrooms();
		case GeneratorPackage.VISUALIZATION_SOLUTION:
			return createVisualizationSolution();
		case GeneratorPackage.HG_LEVEL:
			return createHGLevel();
		case GeneratorPackage.POSITIONED_VISUALIZATION_ELEMENT:
			return createPositionedVisualizationElement();
		case GeneratorPackage.DATE_QUESTIONABLE_FACT:
			return createDateQuestionableFact();
		case GeneratorPackage.HISTORICAL_CHRONOLOGY:
			return createHistoricalChronology();
		case GeneratorPackage.MAP_QUESTIONABLE_FACT:
			return createMapQuestionableFact();
		case GeneratorPackage.JUDO_TECHNIQUE_FACT:
			return createJudoTechniqueFact();
		case GeneratorPackage.CLASSIFY_TECHNIQUE:
			return createClassifyTechnique();
		case GeneratorPackage.IDENTIFY_TECHNIQUE:
			return createIdentifyTechnique();
		case GeneratorPackage.JUDO_QUESTIONABLE_TECHNIQUE_FACT:
			return createJudoQuestionableTechniqueFact();
		case GeneratorPackage.JUDO_QUESTIONABLE_CLASSIFY_FACT:
			return createJudoQuestionableClassifyFact();
		case GeneratorPackage.JUDO_LEVEL:
			return createJudoLevel();
		case GeneratorPackage.JUDO_ARBITRATION_GESTURE_FACT:
			return createJudoArbitrationGestureFact();
		case GeneratorPackage.IDENTIFY_ARBITRATION_GESTURE:
			return createIdentifyArbitrationGesture();
		case GeneratorPackage.JUDO_QUESTIONABLE_ARBITRATION_FACT:
			return createJudoQuestionableArbitrationFact();
		case GeneratorPackage.MULTIPLE_CHOICE:
			return createMultipleChoice();
		case GeneratorPackage.LEGEND_QUESTIONABLE_FACT:
			return createLegendQuestionableFact();
		case GeneratorPackage.MT_MEMBERSHIP:
			return createMTMembership();
		case GeneratorPackage.ORDER_EVENT:
			return createOrderEvent();
		case GeneratorPackage.ORDER_QUESTIONABLE_FACT:
			return createOrderQuestionableFact();
		case GeneratorPackage.ORDER_SOLUTION:
			return createOrderSolution();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GeneratorPackage.DIRECTIONS:
			return createDirectionsFromString(eDataType, initialValue);
		case GeneratorPackage.DUNGEON_MODE:
			return createDungeonModeFromString(eDataType, initialValue);
		case GeneratorPackage.TABLE_BUILD:
			return createTableBuildFromString(eDataType, initialValue);
		case GeneratorPackage.RESULT_POSITION:
			return createResultPositionFromString(eDataType, initialValue);
		case GeneratorPackage.ESINGLE_TARGET:
			return createESingleTargetFromString(eDataType, initialValue);
		case GeneratorPackage.ETASK_TYPE:
			return createETaskTypeFromString(eDataType, initialValue);
		case GeneratorPackage.EMODALITY:
			return createEModalityFromString(eDataType, initialValue);
		case GeneratorPackage.ESEVERAL_TARGET:
			return createESeveralTargetFromString(eDataType, initialValue);
		case GeneratorPackage.ELEMENT_SIZE:
			return createElementSizeFromString(eDataType, initialValue);
		case GeneratorPackage.GP_CATEGORY:
			return createGPCategoryFromString(eDataType, initialValue);
		case GeneratorPackage.ECORRECTNESS:
			return createECorrectnessFromString(eDataType, initialValue);
		case GeneratorPackage.EBOUNDARY:
			return createEBoundaryFromString(eDataType, initialValue);
		case GeneratorPackage.EROOM_TYPE:
			return createERoomTypeFromString(eDataType, initialValue);
		case GeneratorPackage.EGEOGRAPHY_VALUE:
			return createEGeographyValueFromString(eDataType, initialValue);
		case GeneratorPackage.EHISTORY_TARGET:
			return createEHistoryTargetFromString(eDataType, initialValue);
		case GeneratorPackage.ELEGEND_TARGET:
			return createELegendTargetFromString(eDataType, initialValue);
		case GeneratorPackage.ESTATEMENT_TYPE:
			return createEStatementTypeFromString(eDataType, initialValue);
		case GeneratorPackage.ETIME_TARGET:
			return createETimeTargetFromString(eDataType, initialValue);
		case GeneratorPackage.EJUDO_TARGET:
			return createEJudoTargetFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GeneratorPackage.DIRECTIONS:
			return convertDirectionsToString(eDataType, instanceValue);
		case GeneratorPackage.DUNGEON_MODE:
			return convertDungeonModeToString(eDataType, instanceValue);
		case GeneratorPackage.TABLE_BUILD:
			return convertTableBuildToString(eDataType, instanceValue);
		case GeneratorPackage.RESULT_POSITION:
			return convertResultPositionToString(eDataType, instanceValue);
		case GeneratorPackage.ESINGLE_TARGET:
			return convertESingleTargetToString(eDataType, instanceValue);
		case GeneratorPackage.ETASK_TYPE:
			return convertETaskTypeToString(eDataType, instanceValue);
		case GeneratorPackage.EMODALITY:
			return convertEModalityToString(eDataType, instanceValue);
		case GeneratorPackage.ESEVERAL_TARGET:
			return convertESeveralTargetToString(eDataType, instanceValue);
		case GeneratorPackage.ELEMENT_SIZE:
			return convertElementSizeToString(eDataType, instanceValue);
		case GeneratorPackage.GP_CATEGORY:
			return convertGPCategoryToString(eDataType, instanceValue);
		case GeneratorPackage.ECORRECTNESS:
			return convertECorrectnessToString(eDataType, instanceValue);
		case GeneratorPackage.EBOUNDARY:
			return convertEBoundaryToString(eDataType, instanceValue);
		case GeneratorPackage.EROOM_TYPE:
			return convertERoomTypeToString(eDataType, instanceValue);
		case GeneratorPackage.EGEOGRAPHY_VALUE:
			return convertEGeographyValueToString(eDataType, instanceValue);
		case GeneratorPackage.EHISTORY_TARGET:
			return convertEHistoryTargetToString(eDataType, instanceValue);
		case GeneratorPackage.ELEGEND_TARGET:
			return convertELegendTargetToString(eDataType, instanceValue);
		case GeneratorPackage.ESTATEMENT_TYPE:
			return convertEStatementTypeToString(eDataType, instanceValue);
		case GeneratorPackage.ETIME_TARGET:
			return convertETimeTargetToString(eDataType, instanceValue);
		case GeneratorPackage.EJUDO_TARGET:
			return convertEJudoTargetToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOfFacts createSetOfFacts() {
		SetOfFactsImpl setOfFacts = new SetOfFactsImpl();
		return setOfFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dungeon createDungeon() {
		DungeonImpl dungeon = new DungeonImpl();
		return dungeon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDescription createGameDescription() {
		GameDescriptionImpl gameDescription = new GameDescriptionImpl();
		return gameDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallRoomType createSmallRoomType() {
		SmallRoomTypeImpl smallRoomType = new SmallRoomTypeImpl();
		return smallRoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeRoomType createLargeRoomType() {
		LargeRoomTypeImpl largeRoomType = new LargeRoomTypeImpl();
		return largeRoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAccess createRoomAccess() {
		RoomAccessImpl roomAccess = new RoomAccessImpl();
		return roomAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameContext createGameContext() {
		GameContextImpl gameContext = new GameContextImpl();
		return gameContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDomain createLearningDomain() {
		LearningDomainImpl learningDomain = new LearningDomainImpl();
		return learningDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningPath createLearningPath() {
		LearningPathImpl learningPath = new LearningPathImpl();
		return learningPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prerequisite createPrerequisite() {
		PrerequisiteImpl prerequisite = new PrerequisiteImpl();
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTLevel createMTLevel() {
		MTLevelImpl mtLevel = new MTLevelImpl();
		return mtLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCompletion1 createMTCompletion1() {
		MTCompletion1Impl mtCompletion1 = new MTCompletion1Impl();
		return mtCompletion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classroom createClassroom() {
		ClassroomImpl classroom = new ClassroomImpl();
		return classroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerPlayer createLearnerPlayer() {
		LearnerPlayerImpl learnerPlayer = new LearnerPlayerImpl();
		return learnerPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progression createProgression() {
		ProgressionImpl progression = new ProgressionImpl();
		return progression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentObjectiveLevel createCurrentObjectiveLevel() {
		CurrentObjectiveLevelImpl currentObjectiveLevel = new CurrentObjectiveLevelImpl();
		return currentObjectiveLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMultipleChoice createDynamicMultipleChoice() {
		DynamicMultipleChoiceImpl dynamicMultipleChoice = new DynamicMultipleChoiceImpl();
		return dynamicMultipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterResponse createEnterResponse() {
		EnterResponseImpl enterResponse = new EnterResponseImpl();
		return enterResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes createRoomTypes() {
		RoomTypesImpl roomTypes = new RoomTypesImpl();
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCompletion2 createMTCompletion2() {
		MTCompletion2Impl mtCompletion2 = new MTCompletion2Impl();
		return mtCompletion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTRecontruction createMTRecontruction() {
		MTRecontructionImpl mtRecontruction = new MTRecontructionImpl();
		return mtRecontruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTIdentification createMTIdentification() {
		MTIdentificationImpl mtIdentification = new MTIdentificationImpl();
		return mtIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMembership createMTMembership() {
		MTMembershipImpl mtMembership = new MTMembershipImpl();
		return mtMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEvent createOrderEvent() {
		OrderEventImpl orderEvent = new OrderEventImpl();
		return orderEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderQuestionableFact createOrderQuestionableFact() {
		OrderQuestionableFactImpl orderQuestionableFact = new OrderQuestionableFactImpl();
		return orderQuestionableFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSolution createOrderSolution() {
		OrderSolutionImpl orderSolution = new OrderSolutionImpl();
		return orderSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsByTask createResultsByTask() {
		ResultsByTaskImpl resultsByTask = new ResultsByTaskImpl();
		return resultsByTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTFact createMTFact() {
		MTFactImpl mtFact = new MTFactImpl();
		return mtFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion1 createMTQFCompletion1() {
		MTQFCompletion1Impl mtqfCompletion1 = new MTQFCompletion1Impl();
		return mtqfCompletion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion2 createMTQFCompletion2() {
		MTQFCompletion2Impl mtqfCompletion2 = new MTQFCompletion2Impl();
		return mtqfCompletion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFRebuild createMTQFRebuild() {
		MTQFRebuildImpl mtqfRebuild = new MTQFRebuildImpl();
		return mtqfRebuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFIdentification createMTQFIdentification() {
		MTQFIdentificationImpl mtqfIdentification = new MTQFIdentificationImpl();
		return mtqfIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFMembership createMTQFMembership() {
		MTQFMembershipImpl mtqfMembership = new MTQFMembershipImpl();
		return mtqfMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFact createQuestionedFact() {
		QuestionedFactImpl questionedFact = new QuestionedFactImpl();
		return questionedFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCriteria createCompletionCriteria() {
		CompletionCriteriaImpl completionCriteria = new CompletionCriteriaImpl();
		return completionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelsDifficultyProgress createLevelsDifficultyProgress() {
		LevelsDifficultyProgressImpl levelsDifficultyProgress = new LevelsDifficultyProgressImpl();
		return levelsDifficultyProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameElementTypes createGameElementTypes() {
		GameElementTypesImpl gameElementTypes = new GameElementTypesImpl();
		return gameElementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsTypes createElementsTypes() {
		ElementsTypesImpl elementsTypes = new ElementsTypesImpl();
		return elementsTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipments createEquipments() {
		EquipmentsImpl equipments = new EquipmentsImpl();
		return equipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplays createGameplays() {
		GameplaysImpl gameplays = new GameplaysImpl();
		return gameplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionableFactResult createQuestionableFactResult() {
		QuestionableFactResultImpl questionableFactResult = new QuestionableFactResultImpl();
		return questionableFactResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abilities createAbilities() {
		AbilitiesImpl abilities = new AbilitiesImpl();
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedElement createPositionedElement() {
		PositionedElementImpl positionedElement = new PositionedElementImpl();
		return positionedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionParam createQuestionParam() {
		QuestionParamImpl questionParam = new QuestionParamImpl();
		return questionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropositionParam createPropositionParam() {
		PropositionParamImpl propositionParam = new PropositionParamImpl();
		return propositionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correctness createCorrectness() {
		CorrectnessImpl correctness = new CorrectnessImpl();
		return correctness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrySoluceParam createEntrySoluceParam() {
		EntrySoluceParamImpl entrySoluceParam = new EntrySoluceParamImpl();
		return entrySoluceParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WantedAnswersParam createWantedAnswersParam() {
		WantedAnswersParamImpl wantedAnswersParam = new WantedAnswersParamImpl();
		return wantedAnswersParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedAnswer createExpectedAnswer() {
		ExpectedAnswerImpl expectedAnswer = new ExpectedAnswerImpl();
		return expectedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectnessValue createCorrectnessValue() {
		CorrectnessValueImpl correctnessValue = new CorrectnessValueImpl();
		return correctnessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedStructureElement createPositionedStructureElement() {
		PositionedStructureElementImpl positionedStructureElement = new PositionedStructureElementImpl();
		return positionedStructureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactSolutionParam createFactSolutionParam() {
		FactSolutionParamImpl factSolutionParam = new FactSolutionParamImpl();
		return factSolutionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prompt createPrompt() {
		PromptImpl prompt = new PromptImpl();
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactCorrectnessParam createFactCorrectnessParam() {
		FactCorrectnessParamImpl factCorrectnessParam = new FactCorrectnessParamImpl();
		return factCorrectnessParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameplayTaskRelations createGameplayTaskRelations() {
		GameplayTaskRelationsImpl gameplayTaskRelations = new GameplayTaskRelationsImpl();
		return gameplayTaskRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionGameplay createQuestionGameplay() {
		QuestionGameplayImpl questionGameplay = new QuestionGameplayImpl();
		return questionGameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoQuestionGameplay createNoQuestionGameplay() {
		NoQuestionGameplayImpl noQuestionGameplay = new NoQuestionGameplayImpl();
		return noQuestionGameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementElementType createStatementElementType() {
		StatementElementTypeImpl statementElementType = new StatementElementTypeImpl();
		return statementElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerProgress createPlayerProgress() {
		PlayerProgressImpl playerProgress = new PlayerProgressImpl();
		return playerProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerProgress createLearnerProgress() {
		LearnerProgressImpl learnerProgress = new LearnerProgressImpl();
		return learnerProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Items createItems() {
		ItemsImpl items = new ItemsImpl();
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics createStatistics() {
		StatisticsImpl statistics = new StatisticsImpl();
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curses createCurses() {
		CursesImpl curses = new CursesImpl();
		return curses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curse createCurse() {
		CurseImpl curse = new CurseImpl();
		return curse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabyrinthCurse createLabyrinthCurse() {
		LabyrinthCurseImpl labyrinthCurse = new LabyrinthCurseImpl();
		return labyrinthCurse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurseEligibility createCurseEligibility() {
		CurseEligibilityImpl curseEligibility = new CurseEligibilityImpl();
		return curseEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPosition createVisualizationPosition() {
		VisualizationPositionImpl visualizationPosition = new VisualizationPositionImpl();
		return visualizationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendText createLegendText() {
		LegendTextImpl legendText = new LegendTextImpl();
		return legendText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryFact createHistoryFact() {
		HistoryFactImpl historyFact = new HistoryFactImpl();
		return historyFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographyLegendFact createGeographyLegendFact() {
		GeographyLegendFactImpl geographyLegendFact = new GeographyLegendFactImpl();
		return geographyLegendFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographyFact createGeographyFact() {
		GeographyFactImpl geographyFact = new GeographyFactImpl();
		return geographyFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriod createTimePeriod() {
		TimePeriodImpl timePeriod = new TimePeriodImpl();
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationQuestionParam createVisualizationQuestionParam() {
		VisualizationQuestionParamImpl visualizationQuestionParam = new VisualizationQuestionParamImpl();
		return visualizationQuestionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalEventAssociation createHistoricalEventAssociation() {
		HistoricalEventAssociationImpl historicalEventAssociation = new HistoricalEventAssociationImpl();
		return historicalEventAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendAMap createLegendAMap() {
		LegendAMapImpl legendAMap = new LegendAMapImpl();
		return legendAMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocateOnAMap createLocateOnAMap() {
		LocateOnAMapImpl locateOnAMap = new LocateOnAMapImpl();
		return locateOnAMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher createTeacher() {
		TeacherImpl teacher = new TeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teachers createTeachers() {
		TeachersImpl teachers = new TeachersImpl();
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classrooms createClassrooms() {
		ClassroomsImpl classrooms = new ClassroomsImpl();
		return classrooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationSolution createVisualizationSolution() {
		VisualizationSolutionImpl visualizationSolution = new VisualizationSolutionImpl();
		return visualizationSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGLevel createHGLevel() {
		HGLevelImpl hgLevel = new HGLevelImpl();
		return hgLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedVisualizationElement createPositionedVisualizationElement() {
		PositionedVisualizationElementImpl positionedVisualizationElement = new PositionedVisualizationElementImpl();
		return positionedVisualizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateQuestionableFact createDateQuestionableFact() {
		DateQuestionableFactImpl dateQuestionableFact = new DateQuestionableFactImpl();
		return dateQuestionableFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalChronology createHistoricalChronology() {
		HistoricalChronologyImpl historicalChronology = new HistoricalChronologyImpl();
		return historicalChronology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapQuestionableFact createMapQuestionableFact() {
		MapQuestionableFactImpl mapQuestionableFact = new MapQuestionableFactImpl();
		return mapQuestionableFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoTechniqueFact createJudoTechniqueFact() {
		JudoTechniqueFactImpl judoTechniqueFact = new JudoTechniqueFactImpl();
		return judoTechniqueFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifyTechnique createClassifyTechnique() {
		ClassifyTechniqueImpl classifyTechnique = new ClassifyTechniqueImpl();
		return classifyTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifyTechnique createIdentifyTechnique() {
		IdentifyTechniqueImpl identifyTechnique = new IdentifyTechniqueImpl();
		return identifyTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableTechniqueFact createJudoQuestionableTechniqueFact() {
		JudoQuestionableTechniqueFactImpl judoQuestionableTechniqueFact = new JudoQuestionableTechniqueFactImpl();
		return judoQuestionableTechniqueFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableClassifyFact createJudoQuestionableClassifyFact() {
		JudoQuestionableClassifyFactImpl judoQuestionableClassifyFact = new JudoQuestionableClassifyFactImpl();
		return judoQuestionableClassifyFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoLevel createJudoLevel() {
		JudoLevelImpl judoLevel = new JudoLevelImpl();
		return judoLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoArbitrationGestureFact createJudoArbitrationGestureFact() {
		JudoArbitrationGestureFactImpl judoArbitrationGestureFact = new JudoArbitrationGestureFactImpl();
		return judoArbitrationGestureFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifyArbitrationGesture createIdentifyArbitrationGesture() {
		IdentifyArbitrationGestureImpl identifyArbitrationGesture = new IdentifyArbitrationGestureImpl();
		return identifyArbitrationGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JudoQuestionableArbitrationFact createJudoQuestionableArbitrationFact() {
		JudoQuestionableArbitrationFactImpl judoQuestionableArbitrationFact = new JudoQuestionableArbitrationFactImpl();
		return judoQuestionableArbitrationFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendQuestionableFact createLegendQuestionableFact() {
		LegendQuestionableFactImpl legendQuestionableFact = new LegendQuestionableFactImpl();
		return legendQuestionableFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directions createDirectionsFromString(EDataType eDataType, String initialValue) {
		Directions result = Directions.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonMode createDungeonModeFromString(EDataType eDataType, String initialValue) {
		DungeonMode result = DungeonMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDungeonModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableBuild createTableBuildFromString(EDataType eDataType, String initialValue) {
		TableBuild result = TableBuild.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableBuildToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPosition createResultPositionFromString(EDataType eDataType, String initialValue) {
		ResultPosition result = ResultPosition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESingleTarget createESingleTargetFromString(EDataType eDataType, String initialValue) {
		ESingleTarget result = ESingleTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESingleTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskType createETaskTypeFromString(EDataType eDataType, String initialValue) {
		ETaskType result = ETaskType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModality createEModalityFromString(EDataType eDataType, String initialValue) {
		EModality result = EModality.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESeveralTarget createESeveralTargetFromString(EDataType eDataType, String initialValue) {
		ESeveralTarget result = ESeveralTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESeveralTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSize createElementSizeFromString(EDataType eDataType, String initialValue) {
		ElementSize result = ElementSize.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPCategory createGPCategoryFromString(EDataType eDataType, String initialValue) {
		GPCategory result = GPCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGPCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECorrectness createECorrectnessFromString(EDataType eDataType, String initialValue) {
		ECorrectness result = ECorrectness.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECorrectnessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBoundary createEBoundaryFromString(EDataType eDataType, String initialValue) {
		EBoundary result = EBoundary.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBoundaryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomType createERoomTypeFromString(EDataType eDataType, String initialValue) {
		ERoomType result = ERoomType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERoomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGeographyValue createEGeographyValueFromString(EDataType eDataType, String initialValue) {
		EGeographyValue result = EGeographyValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGeographyValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHistoryTarget createEHistoryTargetFromString(EDataType eDataType, String initialValue) {
		EHistoryTarget result = EHistoryTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEHistoryTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELegendTarget createELegendTargetFromString(EDataType eDataType, String initialValue) {
		ELegendTarget result = ELegendTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELegendTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStatementType createEStatementTypeFromString(EDataType eDataType, String initialValue) {
		EStatementType result = EStatementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStatementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETimeTarget createETimeTargetFromString(EDataType eDataType, String initialValue) {
		ETimeTarget result = ETimeTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETimeTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJudoTarget createEJudoTargetFromString(EDataType eDataType, String initialValue) {
		EJudoTarget result = EJudoTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJudoTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorPackage getGeneratorPackage() {
		return (GeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorPackage getPackage() {
		return GeneratorPackage.eINSTANCE;
	}

} //GeneratorFactoryImpl
