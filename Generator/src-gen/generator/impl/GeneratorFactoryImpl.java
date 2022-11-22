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
		case GeneratorPackage.FACT:
			return createFact();
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
		case GeneratorPackage.TASK:
			return createTask();
		case GeneratorPackage.LEARNING_DOMAIN:
			return createLearningDomain();
		case GeneratorPackage.LEARNING_PATH:
			return createLearningPath();
		case GeneratorPackage.LEARNING_OBJECTIVE:
			return createLearningObjective();
		case GeneratorPackage.PREREQUISITE:
			return createPrerequisite();
		case GeneratorPackage.MT_LEVEL:
			return createMTLevel();
		case GeneratorPackage.MT_COMPLETION_TYPE:
			return createMTCompletionType();
		case GeneratorPackage.TASK_TYPES:
			return createTaskTypes();
		case GeneratorPackage.COMPLETION_TYPE:
			return createCompletionType();
		case GeneratorPackage.RECONSTRUCTION_TYPE:
			return createReconstructionType();
		case GeneratorPackage.FACT_VERIFICATION_TYPE:
			return createFactVerificationType();
		case GeneratorPackage.RESULT_VERIFICATION_TYPE:
			return createResultVerificationType();
		case GeneratorPackage.GENERATION_CONTEXT:
			return createGenerationContext();
		case GeneratorPackage.LEARNER_PLAYER:
			return createLearnerPlayer();
		case GeneratorPackage.PROGRESSION:
			return createProgression();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL:
			return createCurrentObjectiveLevel();
		case GeneratorPackage.POSITION:
			return createPosition();
		case GeneratorPackage.QUESTION:
			return createQuestion();
		case GeneratorPackage.MULTIPLE_CHOICE:
			return createMultipleChoice();
		case GeneratorPackage.ENTER_RESPONSE:
			return createEnterResponse();
		case GeneratorPackage.INTERACTION_ETYPE:
			return createInteractionEType();
		case GeneratorPackage.ACTIVE_ABILITY:
			return createActiveAbility();
		case GeneratorPackage.PASSIVE_ABILITY:
			return createPassiveAbility();
		case GeneratorPackage.GAMEPLAY:
			return createGameplay();
		case GeneratorPackage.GAME_RULE:
			return createGameRule();
		case GeneratorPackage.ELEMENT:
			return createElement();
		case GeneratorPackage.AVATAR_EQUIPMENT:
			return createAvatarEquipment();
		case GeneratorPackage.ELEMENTS:
			return createElements();
		case GeneratorPackage.GAMEPLAYS:
			return createGameplays();
		case GeneratorPackage.ELEMENT_TYPES:
			return createElementTypes();
		case GeneratorPackage.ABILITIES:
			return createAbilities();
		case GeneratorPackage.ROOM_TYPES:
			return createRoomTypes();
		case GeneratorPackage.EQUIPMENT_ETYPE:
			return createEquipmentEType();
		case GeneratorPackage.ELEMENT_POSITION:
			return createElementPosition();
		case GeneratorPackage.MAPPING_MODEL:
			return createMappingModel();
		case GeneratorPackage.MODALITY2_ROOM_TYPE:
			return createModality2RoomType();
		case GeneratorPackage.TASK_TYPE2_GAMEPLAY:
			return createTaskType2Gameplay();
		case GeneratorPackage.RESPONSE_MODALITIES:
			return createResponseModalities();
		case GeneratorPackage.GAMEPLAY2_ROOM_TYPE:
			return createGameplay2RoomType();
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
		case GeneratorPackage.GP_BRICKS:
			return createGPBricksFromString(eDataType, initialValue);
		case GeneratorPackage.DIRECTIONS:
			return createDirectionsFromString(eDataType, initialValue);
		case GeneratorPackage.DUNGEON_MODE:
			return createDungeonModeFromString(eDataType, initialValue);
		case GeneratorPackage.VERIFIABLE_ELEMENT:
			return createVerifiableElementFromString(eDataType, initialValue);
		case GeneratorPackage.TABLE_BUILD:
			return createTableBuildFromString(eDataType, initialValue);
		case GeneratorPackage.RESULT_POSITION:
			return createResultPositionFromString(eDataType, initialValue);
		case GeneratorPackage.TARGET_ELEMENT:
			return createTargetElementFromString(eDataType, initialValue);
		case GeneratorPackage.ORDER:
			return createOrderFromString(eDataType, initialValue);
		case GeneratorPackage.EPASSIVE_ABILITY:
			return createEPassiveAbilityFromString(eDataType, initialValue);
		case GeneratorPackage.EACTIVE_ABILITY:
			return createEActiveAbilityFromString(eDataType, initialValue);
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
		case GeneratorPackage.GP_BRICKS:
			return convertGPBricksToString(eDataType, instanceValue);
		case GeneratorPackage.DIRECTIONS:
			return convertDirectionsToString(eDataType, instanceValue);
		case GeneratorPackage.DUNGEON_MODE:
			return convertDungeonModeToString(eDataType, instanceValue);
		case GeneratorPackage.VERIFIABLE_ELEMENT:
			return convertVerifiableElementToString(eDataType, instanceValue);
		case GeneratorPackage.TABLE_BUILD:
			return convertTableBuildToString(eDataType, instanceValue);
		case GeneratorPackage.RESULT_POSITION:
			return convertResultPositionToString(eDataType, instanceValue);
		case GeneratorPackage.TARGET_ELEMENT:
			return convertTargetElementToString(eDataType, instanceValue);
		case GeneratorPackage.ORDER:
			return convertOrderToString(eDataType, instanceValue);
		case GeneratorPackage.EPASSIVE_ABILITY:
			return convertEPassiveAbilityToString(eDataType, instanceValue);
		case GeneratorPackage.EACTIVE_ABILITY:
			return convertEActiveAbilityToString(eDataType, instanceValue);
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
	public Fact createFact() {
		FactImpl fact = new FactImpl();
		return fact;
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
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
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
	public LearningObjective createLearningObjective() {
		LearningObjectiveImpl learningObjective = new LearningObjectiveImpl();
		return learningObjective;
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
	public MTCompletionType createMTCompletionType() {
		MTCompletionTypeImpl mtCompletionType = new MTCompletionTypeImpl();
		return mtCompletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypes createTaskTypes() {
		TaskTypesImpl taskTypes = new TaskTypesImpl();
		return taskTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionType createCompletionType() {
		CompletionTypeImpl completionType = new CompletionTypeImpl();
		return completionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconstructionType createReconstructionType() {
		ReconstructionTypeImpl reconstructionType = new ReconstructionTypeImpl();
		return reconstructionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactVerificationType createFactVerificationType() {
		FactVerificationTypeImpl factVerificationType = new FactVerificationTypeImpl();
		return factVerificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultVerificationType createResultVerificationType() {
		ResultVerificationTypeImpl resultVerificationType = new ResultVerificationTypeImpl();
		return resultVerificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationContext createGenerationContext() {
		GenerationContextImpl generationContext = new GenerationContextImpl();
		return generationContext;
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
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
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
	public EnterResponse createEnterResponse() {
		EnterResponseImpl enterResponse = new EnterResponseImpl();
		return enterResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionEType createInteractionEType() {
		InteractionETypeImpl interactionEType = new InteractionETypeImpl();
		return interactionEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveAbility createActiveAbility() {
		ActiveAbilityImpl activeAbility = new ActiveAbilityImpl();
		return activeAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveAbility createPassiveAbility() {
		PassiveAbilityImpl passiveAbility = new PassiveAbilityImpl();
		return passiveAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplay createGameplay() {
		GameplayImpl gameplay = new GameplayImpl();
		return gameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameRule createGameRule() {
		GameRuleImpl gameRule = new GameRuleImpl();
		return gameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvatarEquipment createAvatarEquipment() {
		AvatarEquipmentImpl avatarEquipment = new AvatarEquipmentImpl();
		return avatarEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements createElements() {
		ElementsImpl elements = new ElementsImpl();
		return elements;
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
	public ElementTypes createElementTypes() {
		ElementTypesImpl elementTypes = new ElementTypesImpl();
		return elementTypes;
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
	public RoomTypes createRoomTypes() {
		RoomTypesImpl roomTypes = new RoomTypesImpl();
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentEType createEquipmentEType() {
		EquipmentETypeImpl equipmentEType = new EquipmentETypeImpl();
		return equipmentEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementPosition createElementPosition() {
		ElementPositionImpl elementPosition = new ElementPositionImpl();
		return elementPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality2RoomType createModality2RoomType() {
		Modality2RoomTypeImpl modality2RoomType = new Modality2RoomTypeImpl();
		return modality2RoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType2Gameplay createTaskType2Gameplay() {
		TaskType2GameplayImpl taskType2Gameplay = new TaskType2GameplayImpl();
		return taskType2Gameplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModalities createResponseModalities() {
		ResponseModalitiesImpl responseModalities = new ResponseModalitiesImpl();
		return responseModalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gameplay2RoomType createGameplay2RoomType() {
		Gameplay2RoomTypeImpl gameplay2RoomType = new Gameplay2RoomTypeImpl();
		return gameplay2RoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPBricks createGPBricksFromString(EDataType eDataType, String initialValue) {
		GPBricks result = GPBricks.get(initialValue);
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
	public String convertGPBricksToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public VerifiableElement createVerifiableElementFromString(EDataType eDataType, String initialValue) {
		VerifiableElement result = VerifiableElement.get(initialValue);
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
	public String convertVerifiableElementToString(EDataType eDataType, Object instanceValue) {
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
	public TargetElement createTargetElementFromString(EDataType eDataType, String initialValue) {
		TargetElement result = TargetElement.get(initialValue);
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
	public String convertTargetElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
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
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPassiveAbility createEPassiveAbilityFromString(EDataType eDataType, String initialValue) {
		EPassiveAbility result = EPassiveAbility.get(initialValue);
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
	public String convertEPassiveAbilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActiveAbility createEActiveAbilityFromString(EDataType eDataType, String initialValue) {
		EActiveAbility result = EActiveAbility.get(initialValue);
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
	public String convertEActiveAbilityToString(EDataType eDataType, Object instanceValue) {
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
