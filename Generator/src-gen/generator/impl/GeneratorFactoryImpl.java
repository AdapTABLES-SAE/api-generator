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
		case GeneratorPackage.GAME_CONTENT:
			return createGameContent();
		case GeneratorPackage.GAMEPLAY:
			return createGameplay();
		case GeneratorPackage.CORE_GAME_RULE:
			return createCoreGameRule();
		case GeneratorPackage.ELEMENT_TYPE:
			return createElementType();
		case GeneratorPackage.GAME_OBJECTIVE:
			return createGameObjective();
		case GeneratorPackage.ROOM_TYPE2:
			return createRoomType2();
		case GeneratorPackage.FLOOR:
			return createFloor();
		case GeneratorPackage.LOCATION:
			return createLocation();
		case GeneratorPackage.ELEMENT_SHAPE:
			return createElementShape();
		case GeneratorPackage.ELEMENT_STATE:
			return createElementState();
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
		case GeneratorPackage.ROGUELITE_CONTEXT:
			return createRogueliteContext();
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
		case GeneratorPackage.AVATAR_ACTIONS:
			return createAvatarActionsFromString(eDataType, initialValue);
		case GeneratorPackage.ROOM_PATHS:
			return createRoomPathsFromString(eDataType, initialValue);
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
		case GeneratorPackage.AVATAR_ACTIONS:
			return convertAvatarActionsToString(eDataType, instanceValue);
		case GeneratorPackage.ROOM_PATHS:
			return convertRoomPathsToString(eDataType, instanceValue);
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
	public GameContent createGameContent() {
		GameContentImpl gameContent = new GameContentImpl();
		return gameContent;
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
	public CoreGameRule createCoreGameRule() {
		CoreGameRuleImpl coreGameRule = new CoreGameRuleImpl();
		return coreGameRule;
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
	public GameObjective createGameObjective() {
		GameObjectiveImpl gameObjective = new GameObjectiveImpl();
		return gameObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType2 createRoomType2() {
		RoomType2Impl roomType2 = new RoomType2Impl();
		return roomType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementShape createElementShape() {
		ElementShapeImpl elementShape = new ElementShapeImpl();
		return elementShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementState createElementState() {
		ElementStateImpl elementState = new ElementStateImpl();
		return elementState;
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
	public RogueliteContext createRogueliteContext() {
		RogueliteContextImpl rogueliteContext = new RogueliteContextImpl();
		return rogueliteContext;
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
	public AvatarActions createAvatarActionsFromString(EDataType eDataType, String initialValue) {
		AvatarActions result = AvatarActions.get(initialValue);
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
	public String convertAvatarActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPaths createRoomPathsFromString(EDataType eDataType, String initialValue) {
		RoomPaths result = RoomPaths.get(initialValue);
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
	public String convertRoomPathsToString(EDataType eDataType, Object instanceValue) {
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
