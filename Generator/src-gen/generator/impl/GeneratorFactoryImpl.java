/**
 */
package generator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import generator.AvatarActions;
import generator.ClassicRoom;
import generator.CoreGameRule;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.DungeonOLD;
import generator.ElementShape;
import generator.ElementState;
import generator.ElementType;
import generator.Fact;
import generator.Floor;
import generator.GPBricks;
import generator.GameContent;
import generator.GameDescription;
import generator.GameObjective;
import generator.Gameplay;
import generator.GeneratorFactory;
import generator.GeneratorPackage;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearningObjective;
import generator.LearningPath;
import generator.LearningPaths;
import generator.Location;
import generator.Pathway;
import generator.PlacedObject;
import generator.Prerequisite;
import generator.QuestionRoom;
import generator.RogueliteContext;
import generator.Room;
import generator.RoomAccess;
import generator.RoomPaths;
import generator.RoomType2;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.State;
import generator.SubObjectiveType;
import generators.*;

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
		case GeneratorPackage.PREREQUISITE:
			return createPrerequisite();
		case GeneratorPackage.LEARNING_PATHS:
			return createLearningPaths();
		case GeneratorPackage.SET_OF_FACTS:
			return createSetOfFacts();
		case GeneratorPackage.FACT:
			return createFact();
		case GeneratorPackage.KNOWLEDGE:
			return createKnowledge();
		case GeneratorPackage.LEARNING_PATH:
			return createLearningPath();
		case GeneratorPackage.LEARNING_OBJECTIVE:
			return createLearningObjective();
		case GeneratorPackage.GAME_CONTENT:
			return createGameContent();
		case GeneratorPackage.GAMEPLAY:
			return createGameplay();
		case GeneratorPackage.CORE_GAME_RULE:
			return createCoreGameRule();
		case GeneratorPackage.ELEMENT_TYPE:
			return createElementType();
		case GeneratorPackage.DUNGEON_OLD:
			return createDungeonOLD();
		case GeneratorPackage.GAME_OBJECTIVE:
			return createGameObjective();
		case GeneratorPackage.CLASSIC_ROOM:
			return createClassicRoom();
		case GeneratorPackage.QUESTION_ROOM:
			return createQuestionRoom();
		case GeneratorPackage.PATHWAY:
			return createPathway();
		case GeneratorPackage.ROOM_TYPE2:
			return createRoomType2();
		case GeneratorPackage.FLOOR:
			return createFloor();
		case GeneratorPackage.LOCATION:
			return createLocation();
		case GeneratorPackage.STATE:
			return createState();
		case GeneratorPackage.PLACED_OBJECT:
			return createPlacedObject();
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
		case GeneratorPackage.SUB_OBJECTIVE_TYPE:
			return createSubObjectiveTypeFromString(eDataType, initialValue);
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
		case GeneratorPackage.SUB_OBJECTIVE_TYPE:
			return convertSubObjectiveTypeToString(eDataType, instanceValue);
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
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public LearningPaths createLearningPaths() {
		LearningPathsImpl learningPaths = new LearningPathsImpl();
		return learningPaths;
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
	public DungeonOLD createDungeonOLD() {
		DungeonOLDImpl dungeonOLD = new DungeonOLDImpl();
		return dungeonOLD;
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
	public ClassicRoom createClassicRoom() {
		ClassicRoomImpl classicRoom = new ClassicRoomImpl();
		return classicRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRoom createQuestionRoom() {
		QuestionRoomImpl questionRoom = new QuestionRoomImpl();
		return questionRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway createPathway() {
		PathwayImpl pathway = new PathwayImpl();
		return pathway;
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
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacedObject createPlacedObject() {
		PlacedObjectImpl placedObject = new PlacedObjectImpl();
		return placedObject;
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
	public SubObjectiveType createSubObjectiveTypeFromString(EDataType eDataType, String initialValue) {
		SubObjectiveType result = SubObjectiveType.get(initialValue);
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
	public String convertSubObjectiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
