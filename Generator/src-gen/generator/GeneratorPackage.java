/**
 */
package generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/generator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.impl.AbstractFactImpl <em>Abstract Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbstractFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbstractFact()
	 * @generated
	 */
	int ABSTRACT_FACT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.SetOfFactsImpl <em>Set Of Facts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.SetOfFactsImpl
	 * @see generator.impl.GeneratorPackageImpl#getSetOfFacts()
	 * @generated
	 */
	int SET_OF_FACTS = 1;

	/**
	 * The feature id for the '<em><b>Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS__FACTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Set Of Facts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set Of Facts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.KnowledgeImpl
	 * @see generator.impl.GeneratorPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Knowledgefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__KNOWLEDGEFACTS = 1;

	/**
	 * The number of structural features of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.DungeonImpl <em>Dungeon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DungeonImpl
	 * @see generator.impl.GeneratorPackageImpl#getDungeon()
	 * @generated
	 */
	int DUNGEON = 3;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__MODE = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__LEARNINGOBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__EXIT = 5;

	/**
	 * The number of structural features of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__Y = 1;

	/**
	 * The feature id for the '<em><b>Roomaccess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMACCESS = 2;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = 3;

	/**
	 * The feature id for the '<em><b>Questioned Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__QUESTIONED_FACTS = 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TASK = 5;

	/**
	 * The feature id for the '<em><b>Positioned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__POSITIONED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Gameplay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__GAMEPLAY = 7;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameDescriptionImpl <em>Game Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameDescriptionImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameDescription()
	 * @generated
	 */
	int GAME_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Roomtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ROOMTYPES = 0;

	/**
	 * The feature id for the '<em><b>Levels Difficulty Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS = 1;

	/**
	 * The feature id for the '<em><b>Gameplays</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__GAMEPLAYS = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ABILITIES = 4;

	/**
	 * The number of structural features of the '<em>Game Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ELEMENT_POSITIONS = 1;

	/**
	 * The feature id for the '<em><b>For Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__FOR_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>For Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__FOR_EXIT = 3;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Directions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_DIRECTIONS = 0;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.SmallRoomTypeImpl <em>Small Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.SmallRoomTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getSmallRoomType()
	 * @generated
	 */
	int SMALL_ROOM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Element Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__ELEMENT_POSITIONS = ROOM_TYPE__ELEMENT_POSITIONS;

	/**
	 * The feature id for the '<em><b>For Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__FOR_ENTRY = ROOM_TYPE__FOR_ENTRY;

	/**
	 * The feature id for the '<em><b>For Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__FOR_EXIT = ROOM_TYPE__FOR_EXIT;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__DIRECTIONS = ROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Small Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE_FEATURE_COUNT = ROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Directions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___GET_DIRECTIONS = ROOM_TYPE___GET_DIRECTIONS;

	/**
	 * The number of operations of the '<em>Small Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE_OPERATION_COUNT = ROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.LargeRoomTypeImpl <em>Large Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LargeRoomTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getLargeRoomType()
	 * @generated
	 */
	int LARGE_ROOM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Element Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__ELEMENT_POSITIONS = ROOM_TYPE__ELEMENT_POSITIONS;

	/**
	 * The feature id for the '<em><b>For Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__FOR_ENTRY = ROOM_TYPE__FOR_ENTRY;

	/**
	 * The feature id for the '<em><b>For Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__FOR_EXIT = ROOM_TYPE__FOR_EXIT;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__DIRECTIONS = ROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Large Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE_FEATURE_COUNT = ROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Directions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___GET_DIRECTIONS = ROOM_TYPE___GET_DIRECTIONS;

	/**
	 * The number of operations of the '<em>Large Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE_OPERATION_COUNT = ROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomAccessImpl <em>Room Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomAccessImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoomAccess()
	 * @generated
	 */
	int ROOM_ACCESS = 9;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACCESS__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Otherroomaccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACCESS__OTHERROOMACCESS = 1;

	/**
	 * The number of structural features of the '<em>Room Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameContextImpl <em>Game Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameContextImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameContext()
	 * @generated
	 */
	int GAME_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT__MODE = 0;

	/**
	 * The number of structural features of the '<em>Game Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearningDomainImpl <em>Learning Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningDomainImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningDomain()
	 * @generated
	 */
	int LEARNING_DOMAIN = 11;

	/**
	 * The feature id for the '<em><b>Learningpaths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN__LEARNINGPATHS = 0;

	/**
	 * The number of structural features of the '<em>Learning Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Learning Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearningPathImpl <em>Learning Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningPathImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningPath()
	 * @generated
	 */
	int LEARNING_PATH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__OBJECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__KNOWLEDGE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__ID = 3;

	/**
	 * The number of structural features of the '<em>Learning Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Learning Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ObjectiveImpl
	 * @see generator.impl.GeneratorPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__PREREQUISITES = 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__LEVELS = 3;

	/**
	 * The feature id for the '<em><b>Setoffacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__SETOFFACTS = 4;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PrerequisiteImpl
	 * @see generator.impl.GeneratorPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 14;

	/**
	 * The feature id for the '<em><b>Succes Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__SUCCES_PERCENT = 0;

	/**
	 * The feature id for the '<em><b>Required Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__REQUIRED_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Encounters Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__ENCOUNTERS_PERCENT = 2;

	/**
	 * The number of structural features of the '<em>Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Completion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__COMPLETION_CRITERIA = 2;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTLevelImpl <em>MT Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTLevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTLevel()
	 * @generated
	 */
	int MT_LEVEL = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__ID = LEVEL__ID;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__TASKS = LEVEL__TASKS;

	/**
	 * The feature id for the '<em><b>Completion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__COMPLETION_CRITERIA = LEVEL__COMPLETION_CRITERIA;

	/**
	 * The feature id for the '<em><b>Build Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__BUILD_SETUP = LEVEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Position Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__RESULT_POSITION_SETUP = LEVEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__MIN_INTERVAL = LEVEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__MAX_INTERVAL = LEVEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MT Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL_FEATURE_COUNT = LEVEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MT Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL_OPERATION_COUNT = LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ATaskImpl <em>ATask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ATaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getATask()
	 * @generated
	 */
	int ATASK = 26;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__PERCENT_OF_APPARITION = 0;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__NB_CONSECUTIVE_SUCCESS = 1;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__RESPONSE_MODALITY = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__ID = 3;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__MAX_TIME = 4;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__NB_FACTS = 5;

	/**
	 * The number of structural features of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___GET_TYPE = 0;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___IS_CHECK_ON_LEARNER_ACTION = 1;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___NB_EXPECTED_ANSWERS = 2;

	/**
	 * The number of operations of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link generator.impl.CompletionTaskImpl <em>Completion Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CompletionTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletionTask()
	 * @generated
	 */
	int COMPLETION_TASK = 27;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__MAX_TIME = ATASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__NB_FACTS = ATASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completion Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___NB_EXPECTED_ANSWERS = ATASK___NB_EXPECTED_ANSWERS;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___GET_NB_MISSING_ELEMENTS = ATASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Completion Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.impl.MTCompletion1Impl <em>MT Completion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTCompletion1()
	 * @generated
	 */
	int MT_COMPLETION1 = 17;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__TARGETS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__CHECK_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___NB_EXPECTED_ANSWERS = COMPLETION_TASK___NB_EXPECTED_ANSWERS;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The number of operations of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GenerationContextImpl <em>Generation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GenerationContextImpl
	 * @see generator.impl.GeneratorPackageImpl#getGenerationContext()
	 * @generated
	 */
	int GENERATION_CONTEXT = 18;

	/**
	 * The feature id for the '<em><b>Gamecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONTEXT__GAMECONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Learnerplayer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONTEXT__LEARNERPLAYER = 1;

	/**
	 * The number of structural features of the '<em>Generation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearnerPlayerImpl <em>Learner Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearnerPlayerImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearnerPlayer()
	 * @generated
	 */
	int LEARNER_PLAYER = 19;

	/**
	 * The feature id for the '<em><b>Progression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__PROGRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Learningpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__LEARNINGPATH = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__ID = 3;

	/**
	 * The number of structural features of the '<em>Learner Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Learner Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ProgressionImpl <em>Progression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ProgressionImpl
	 * @see generator.impl.GeneratorPackageImpl#getProgression()
	 * @generated
	 */
	int PROGRESSION = 20;

	/**
	 * The feature id for the '<em><b>Currentobjectivelevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION__CURRENTOBJECTIVELEVELS = 0;

	/**
	 * The feature id for the '<em><b>Current Game Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION__CURRENT_GAME_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Progression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Progression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CurrentObjectiveLevelImpl <em>Current Objective Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CurrentObjectiveLevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getCurrentObjectiveLevel()
	 * @generated
	 */
	int CURRENT_OBJECTIVE_LEVEL = 21;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__ACHIEVED = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__RESULTS = 3;

	/**
	 * The feature id for the '<em><b>Encounters Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT = 4;

	/**
	 * The feature id for the '<em><b>Sucess Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT = 5;

	/**
	 * The number of structural features of the '<em>Current Objective Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Current Objective Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionImpl
	 * @see generator.impl.GeneratorPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 57;

	/**
	 * The meta object id for the '{@link generator.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResponseModalityImpl
	 * @see generator.impl.GeneratorPackageImpl#getResponseModality()
	 * @generated
	 */
	int RESPONSE_MODALITY = 22;

	/**
	 * The number of structural features of the '<em>Response Modality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Response Modality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MultipleChoiceImpl
	 * @see generator.impl.GeneratorPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__TYPE = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NB_CHOICES = RESPONSE_MODALITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Bad Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NB_BAD_CHOICES = RESPONSE_MODALITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = RESPONSE_MODALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.EnterResponseImpl <em>Enter Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EnterResponseImpl
	 * @see generator.impl.GeneratorPackageImpl#getEnterResponse()
	 * @generated
	 */
	int ENTER_RESPONSE = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_RESPONSE__TYPE = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_RESPONSE_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_RESPONSE_OPERATION_COUNT = RESPONSE_MODALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomTypesImpl <em>Room Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoomTypes()
	 * @generated
	 */
	int ROOM_TYPES = 25;

	/**
	 * The feature id for the '<em><b>Roomtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES__ROOMTYPES = 0;

	/**
	 * The number of structural features of the '<em>Room Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.IdentificationTaskImpl <em>Identification Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.IdentificationTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getIdentificationTask()
	 * @generated
	 */
	int IDENTIFICATION_TASK = 28;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__MAX_TIME = ATASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__NB_FACTS = ATASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__CHECK_LEARNER_ACTION = ATASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identification Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___NB_EXPECTED_ANSWERS = ATASK___NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Identification Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MembershipIDTaskImpl <em>Membership ID Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MembershipIDTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getMembershipIDTask()
	 * @generated
	 */
	int MEMBERSHIP_ID_TASK = 29;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__MAX_TIME = ATASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__NB_FACTS = ATASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identify Shared Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY = ATASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION = ATASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Membership ID Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___NB_EXPECTED_ANSWERS = ATASK___NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Membership ID Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTCompletion2Impl <em>MT Completion2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTCompletion2Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTCompletion2()
	 * @generated
	 */
	int MT_COMPLETION2 = 30;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__TARGETS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__CHECK_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___NB_EXPECTED_ANSWERS = COMPLETION_TASK___NB_EXPECTED_ANSWERS;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The number of operations of the '<em>MT Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTRecontructionImpl <em>MT Recontruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTRecontructionImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTRecontruction()
	 * @generated
	 */
	int MT_RECONTRUCTION = 31;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__CHECK_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MT Recontruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___NB_EXPECTED_ANSWERS = COMPLETION_TASK___NB_EXPECTED_ANSWERS;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The number of operations of the '<em>MT Recontruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTIdentificationImpl <em>MT Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTIdentificationImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTIdentification()
	 * @generated
	 */
	int MT_IDENTIFICATION = 32;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__PERCENT_OF_APPARITION = IDENTIFICATION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__NB_CONSECUTIVE_SUCCESS = IDENTIFICATION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__RESPONSE_MODALITY = IDENTIFICATION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__ID = IDENTIFICATION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__MAX_TIME = IDENTIFICATION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__NB_FACTS = IDENTIFICATION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__TYPE = IDENTIFICATION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__CHECK_LEARNER_ACTION = IDENTIFICATION_TASK__CHECK_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__TARGET = IDENTIFICATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION_FEATURE_COUNT = IDENTIFICATION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___GET_TYPE = IDENTIFICATION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___IS_CHECK_ON_LEARNER_ACTION = IDENTIFICATION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___NB_EXPECTED_ANSWERS = IDENTIFICATION_TASK___NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>MT Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION_OPERATION_COUNT = IDENTIFICATION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTMembershipImpl <em>MT Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTMembershipImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTMembership()
	 * @generated
	 */
	int MT_MEMBERSHIP = 33;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__PERCENT_OF_APPARITION = MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__NB_CONSECUTIVE_SUCCESS = MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__RESPONSE_MODALITY = MEMBERSHIP_ID_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__ID = MEMBERSHIP_ID_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__MAX_TIME = MEMBERSHIP_ID_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__NB_FACTS = MEMBERSHIP_ID_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__TYPE = MEMBERSHIP_ID_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Identify Shared Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__IDENTIFY_SHARED_PROPERTY = MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__CHECK_LEARNER_ACTION = MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION;

	/**
	 * The number of structural features of the '<em>MT Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP_FEATURE_COUNT = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___GET_TYPE = MEMBERSHIP_ID_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___IS_CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___NB_EXPECTED_ANSWERS = MEMBERSHIP_ID_TASK___NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>MT Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP_OPERATION_COUNT = MEMBERSHIP_ID_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResultsImpl
	 * @see generator.impl.GeneratorPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 34;

	/**
	 * The feature id for the '<em><b>Resultsbytask</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__RESULTSBYTASK = 0;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ResultsByTaskImpl <em>Results By Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResultsByTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getResultsByTask()
	 * @generated
	 */
	int RESULTS_BY_TASK = 35;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Questionable Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__QUESTIONABLE_FACTS = 1;

	/**
	 * The feature id for the '<em><b>Sucess Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__SUCESS_PERCENT = 2;

	/**
	 * The feature id for the '<em><b>Encounters Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__ENCOUNTERS_PERCENT = 3;

	/**
	 * The number of structural features of the '<em>Results By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Results By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTFactImpl <em>MT Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTFact()
	 * @generated
	 */
	int MT_FACT = 36;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT__TABLE = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT__OP = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT__RES = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>MT Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTResultFactImpl <em>MT Result Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTResultFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTResultFact()
	 * @generated
	 */
	int MT_RESULT_FACT = 37;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RESULT_FACT__TABLE = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RESULT_FACT__RES = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MT Result Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RESULT_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MT Result Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RESULT_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionableFactImpl <em>Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionableFact()
	 * @generated
	 */
	int QUESTIONABLE_FACT = 38;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__ACHIEVED = 0;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__WAS_SELECTED = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__ID = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT = 0;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT___GET_COMPLETE_FACT = 1;

	/**
	 * The number of operations of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion1Impl <em>MTQF Completion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion1()
	 * @generated
	 */
	int MTQF_COMPLETION1 = 39;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__LEFT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__RIGHT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__RESULT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__SOLUCE = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result On Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__RESULT_ON_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MTQF Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>MTQF Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion2Impl <em>MTQF Completion2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion2Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion2()
	 * @generated
	 */
	int MTQF_COMPLETION2 = 40;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__LEFT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__RIGHT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__RESULT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soluce Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__SOLUCE_LEFT = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Soluce Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__SOLUCE_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Soluce Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__SOLUCE_RES = QUESTIONABLE_FACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result On Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__RESULT_ON_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MTQF Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>MTQF Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFRebuildImpl <em>MTQF Rebuild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFRebuildImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFRebuild()
	 * @generated
	 */
	int MTQF_REBUILD = 41;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>Soluce Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__SOLUCE_LEFT = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soluce Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__SOLUCE_RES = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result On Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__RESULT_ON_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soluce Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__SOLUCE_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MTQF Rebuild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>MTQF Rebuild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFIdentificationImpl <em>MTQF Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFIdentificationImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFIdentification()
	 * @generated
	 */
	int MTQF_IDENTIFICATION = 42;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__RESULT = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__RIGHT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__LEFT_OPERAND = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__SOLUCE = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result On Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__RESULT_ON_RIGHT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__BUILD = QUESTIONABLE_FACT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MTQF Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>MTQF Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFMembershipImpl <em>MTQF Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFMembershipImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFMembership()
	 * @generated
	 */
	int MTQF_MEMBERSHIP = 43;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>Good Results</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__GOOD_RESULTS = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__TABLE = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MTQF Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>MTQF Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionedFactImpl <em>Questioned Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionedFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionedFact()
	 * @generated
	 */
	int QUESTIONED_FACT = 44;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__QUESTIONABLEFACT = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Propositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__PROPOSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Entrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__ENTRYS = 3;

	/**
	 * The feature id for the '<em><b>Correctness To Reach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__CORRECTNESS_TO_REACH = 4;

	/**
	 * The feature id for the '<em><b>Learner Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__LEARNER_VALIDATION = 5;

	/**
	 * The feature id for the '<em><b>Complete Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__COMPLETE_FACT = 6;

	/**
	 * The feature id for the '<em><b>Fact Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__FACT_CORRECTNESS = 7;

	/**
	 * The number of structural features of the '<em>Questioned Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Questioned Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CompletionCriteriaImpl <em>Completion Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CompletionCriteriaImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletionCriteria()
	 * @generated
	 */
	int COMPLETION_CRITERIA = 45;

	/**
	 * The feature id for the '<em><b>Succes Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CRITERIA__SUCCES_PERCENT = 0;

	/**
	 * The feature id for the '<em><b>Encounters Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CRITERIA__ENCOUNTERS_PERCENT = 1;

	/**
	 * The number of structural features of the '<em>Completion Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CRITERIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Completion Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LevelsDifficultyProgressImpl <em>Levels Difficulty Progress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LevelsDifficultyProgressImpl
	 * @see generator.impl.GeneratorPackageImpl#getLevelsDifficultyProgress()
	 * @generated
	 */
	int LEVELS_DIFFICULTY_PROGRESS = 46;

	/**
	 * The feature id for the '<em><b>Nb QRoom Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE = 0;

	/**
	 * The feature id for the '<em><b>Nb NQ Room Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE = 1;

	/**
	 * The feature id for the '<em><b>Init Nb QRoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM = 2;

	/**
	 * The feature id for the '<em><b>Init Nb NQ Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM = 3;

	/**
	 * The number of structural features of the '<em>Levels Difficulty Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Levels Difficulty Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CurrentGameLevelImpl <em>Current Game Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CurrentGameLevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getCurrentGameLevel()
	 * @generated
	 */
	int CURRENT_GAME_LEVEL = 47;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_GAME_LEVEL__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Current Game Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_GAME_LEVEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Current Game Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_GAME_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameElementTypesImpl <em>Game Element Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameElementTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameElementTypes()
	 * @generated
	 */
	int GAME_ELEMENT_TYPES = 48;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES__EQUIPMENTS = 0;

	/**
	 * The feature id for the '<em><b>Element Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES__ELEMENT_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Game Element Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Element Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementsTypesImpl <em>Elements Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementsTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementsTypes()
	 * @generated
	 */
	int ELEMENTS_TYPES = 49;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPES__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Elements Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elements Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.EquipmentsImpl <em>Equipments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentsImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipments()
	 * @generated
	 */
	int EQUIPMENTS = 50;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENTS__EQUIPMENTS = 0;

	/**
	 * The number of structural features of the '<em>Equipments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Equipments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 65;

	/**
	 * The meta object id for the '{@link generator.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 51;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__BOUGHT = 1;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ACTIVATED = 2;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplayImpl <em>Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplay()
	 * @generated
	 */
	int GAMEPLAY = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__PROMPT = 2;

	/**
	 * The feature id for the '<em><b>Undoable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__UNDOABLE = 3;

	/**
	 * The number of structural features of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplaysImpl <em>Gameplays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplaysImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplays()
	 * @generated
	 */
	int GAMEPLAYS = 53;

	/**
	 * The feature id for the '<em><b>Gameplays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAYS__GAMEPLAYS = 0;

	/**
	 * The number of structural features of the '<em>Gameplays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAYS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gameplays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionableFactResultImpl <em>Questionable Fact Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionableFactResultImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionableFactResult()
	 * @generated
	 */
	int QUESTIONABLE_FACT_RESULT = 54;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT__RESPONSE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Answer Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT__ANSWER_VALID = 1;

	/**
	 * The feature id for the '<em><b>Given Answers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS = 2;

	/**
	 * The number of structural features of the '<em>Questionable Fact Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Questionable Fact Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.AbilitiesImpl <em>Abilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbilitiesImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbilities()
	 * @generated
	 */
	int ABILITIES = 56;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITIES__ABILITIES = 0;

	/**
	 * The number of structural features of the '<em>Abilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITIES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Restricted To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__RESTRICTED_TO = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.PositionedElementImpl <em>Positioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionedElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getPositionedElement()
	 * @generated
	 */
	int POSITIONED_ELEMENT = 58;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__CORRECTNESS = 2;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__DISPLAYS = 3;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__ELEMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Expected Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__EXPECTED_ANSWER = 5;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__FACT = 6;

	/**
	 * The feature id for the '<em><b>Accepted Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__ACCEPTED_FACTS = 7;

	/**
	 * The number of structural features of the '<em>Positioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Positioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ParameterImpl
	 * @see generator.impl.GeneratorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionParamImpl <em>Question Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionParam()
	 * @generated
	 */
	int QUESTION_PARAM = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__INTERACTIVE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__SOLUTIONS = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PropositionParamImpl <em>Proposition Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PropositionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getPropositionParam()
	 * @generated
	 */
	int PROPOSITION_PARAM = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM__STATE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proposition Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proposition Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.AValueImpl <em>AValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AValueImpl
	 * @see generator.impl.GeneratorPackageImpl#getAValue()
	 * @generated
	 */
	int AVALUE = 74;

	/**
	 * The number of structural features of the '<em>AValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>AValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ValueImpl
	 * @see generator.impl.GeneratorPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = AVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = AVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = AVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.CorrectnessImpl <em>Correctness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CorrectnessImpl
	 * @see generator.impl.GeneratorPackageImpl#getCorrectness()
	 * @generated
	 */
	int CORRECTNESS = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Correctness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Correctness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.EntrySoluceParamImpl <em>Entry Soluce Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EntrySoluceParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getEntrySoluceParam()
	 * @generated
	 */
	int ENTRY_SOLUCE_PARAM = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM__STATE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Soluce Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Soluce Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ABILITY = 3;

	/**
	 * The feature id for the '<em><b>Nb Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NB_DISPLAYS = 4;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Is Displayable Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT = 0;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DisplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__INTERACTIVE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__CORRECTNESS = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.AComponentImpl <em>AComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AComponentImpl
	 * @see generator.impl.GeneratorPackageImpl#getAComponent()
	 * @generated
	 */
	int ACOMPONENT = 67;

	/**
	 * The feature id for the '<em><b>Allowed Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT__ALLOWED_ABILITY = 0;

	/**
	 * The feature id for the '<em><b>Expected Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT__EXPECTED_SIZE = 1;

	/**
	 * The number of structural features of the '<em>AComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.StructureImpl
	 * @see generator.impl.GeneratorPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 68;

	/**
	 * The feature id for the '<em><b>Allowed Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ALLOWED_ABILITY = ACOMPONENT__ALLOWED_ABILITY;

	/**
	 * The feature id for the '<em><b>Expected Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__EXPECTED_SIZE = ACOMPONENT__EXPECTED_SIZE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMPONENTS = ACOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Per Fact Or Propositions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PER_FACT_OR_PROPOSITIONS = ACOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = ACOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = ACOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ComponentImpl
	 * @see generator.impl.GeneratorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 69;

	/**
	 * The feature id for the '<em><b>Allowed Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOWED_ABILITY = ACOMPONENT__ALLOWED_ABILITY;

	/**
	 * The feature id for the '<em><b>Expected Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXPECTED_SIZE = ACOMPONENT__EXPECTED_SIZE;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DISPLAY_VALUE = ACOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wear Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WEAR_CHOICES = ACOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DEFAULT_CORRECTNESS = ACOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wear Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WEAR_STATEMENT = ACOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUT_ENTRY = ACOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__QUANTITY = ACOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ACOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ACOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuantityImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Fact Nb Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__FACT_NB_ANSWERS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.WantedAnswersParamImpl <em>Wanted Answers Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.WantedAnswersParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getWantedAnswersParam()
	 * @generated
	 */
	int WANTED_ANSWERS_PARAM = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANTED_ANSWERS_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Wanted Answers Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANTED_ANSWERS_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wanted Answers Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANTED_ANSWERS_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ExpectedAnswerImpl <em>Expected Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ExpectedAnswerImpl
	 * @see generator.impl.GeneratorPackageImpl#getExpectedAnswer()
	 * @generated
	 */
	int EXPECTED_ANSWER = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_ANSWER__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Expected Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_ANSWER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expected Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_ANSWER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.CorrectnessValueImpl <em>Correctness Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CorrectnessValueImpl
	 * @see generator.impl.GeneratorPackageImpl#getCorrectnessValue()
	 * @generated
	 */
	int CORRECTNESS_VALUE = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS_VALUE__VALUE = AVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correctness Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS_VALUE_FEATURE_COUNT = AVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Correctness Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTNESS_VALUE_OPERATION_COUNT = AVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PositionedStructureElementImpl <em>Positioned Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionedStructureElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getPositionedStructureElement()
	 * @generated
	 */
	int POSITIONED_STRUCTURE_ELEMENT = 75;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__ID = POSITIONED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__POSITION = POSITIONED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__CORRECTNESS = POSITIONED_ELEMENT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__DISPLAYS = POSITIONED_ELEMENT__DISPLAYS;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__ELEMENT_TYPE = POSITIONED_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Expected Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__EXPECTED_ANSWER = POSITIONED_ELEMENT__EXPECTED_ANSWER;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__FACT = POSITIONED_ELEMENT__FACT;

	/**
	 * The feature id for the '<em><b>Accepted Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__ACCEPTED_FACTS = POSITIONED_ELEMENT__ACCEPTED_FACTS;

	/**
	 * The feature id for the '<em><b>Created Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positioned Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positioned Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT_OPERATION_COUNT = POSITIONED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.FactSolutionParamImpl <em>Fact Solution Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.FactSolutionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getFactSolutionParam()
	 * @generated
	 */
	int FACT_SOLUTION_PARAM = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SOLUTION_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Fact Solution Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SOLUTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Solution Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SOLUTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.OrderingTaskImpl <em>Ordering Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.OrderingTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getOrderingTask()
	 * @generated
	 */
	int ORDERING_TASK = 77;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__MAX_TIME = ATASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__NB_FACTS = ATASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__CHECK_LEARNER_ACTION = ATASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ordering Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___NB_EXPECTED_ANSWERS = ATASK___NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Ordering Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PromptImpl <em>Prompt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PromptImpl
	 * @see generator.impl.GeneratorPackageImpl#getPrompt()
	 * @generated
	 */
	int PROMPT = 78;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT__PROMPT = 0;

	/**
	 * The number of structural features of the '<em>Prompt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prompt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.FactCorrectnessParamImpl <em>Fact Correctness Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.FactCorrectnessParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getFactCorrectnessParam()
	 * @generated
	 */
	int FACT_CORRECTNESS_PARAM = 79;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_CORRECTNESS_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Fact Correctness Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_CORRECTNESS_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Correctness Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_CORRECTNESS_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplayTaskRelationsImpl <em>Gameplay Task Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplayTaskRelationsImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplayTaskRelations()
	 * @generated
	 */
	int GAMEPLAY_TASK_RELATIONS = 80;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_TASK_RELATIONS__RELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Gameplay Task Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_TASK_RELATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gameplay Task Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_TASK_RELATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RelationImpl
	 * @see generator.impl.GeneratorPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 81;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TASK = 0;

	/**
	 * The feature id for the '<em><b>Gameplay</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GAMEPLAY = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ConditionImpl
	 * @see generator.impl.GeneratorPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 82;

	/**
	 * The feature id for the '<em><b>Statement Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATEMENT_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NB_FACTS = 1;

	/**
	 * The feature id for the '<em><b>Answer Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANSWER_MODALITY = 2;

	/**
	 * The feature id for the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NB_EXPECTED_ANSWERS = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionGameplayImpl <em>Question Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionGameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionGameplay()
	 * @generated
	 */
	int QUESTION_GAMEPLAY = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__NAME = GAMEPLAY__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__COMPONENTS = GAMEPLAY__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__PROMPT = GAMEPLAY__PROMPT;

	/**
	 * The feature id for the '<em><b>Undoable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__UNDOABLE = GAMEPLAY__UNDOABLE;

	/**
	 * The feature id for the '<em><b>Manual Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__MANUAL_VALIDATION = GAMEPLAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__CATEGORY = GAMEPLAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Integrated Propositions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS = GAMEPLAY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restricted To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__RESTRICTED_TO = GAMEPLAY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY_FEATURE_COUNT = GAMEPLAY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Question Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY_OPERATION_COUNT = GAMEPLAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.NoQuestionGameplayImpl <em>No Question Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.NoQuestionGameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getNoQuestionGameplay()
	 * @generated
	 */
	int NO_QUESTION_GAMEPLAY = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY__NAME = GAMEPLAY__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY__COMPONENTS = GAMEPLAY__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY__PROMPT = GAMEPLAY__PROMPT;

	/**
	 * The feature id for the '<em><b>Undoable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY__UNDOABLE = GAMEPLAY__UNDOABLE;

	/**
	 * The number of structural features of the '<em>No Question Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY_FEATURE_COUNT = GAMEPLAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Question Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY_OPERATION_COUNT = GAMEPLAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.SizeImpl
	 * @see generator.impl.GeneratorPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 85;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.StatementElementTypeImpl <em>Statement Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.StatementElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getStatementElementType()
	 * @generated
	 */
	int STATEMENT_ELEMENT_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__SIZE = ELEMENT_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__ID = ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__TYPE = ELEMENT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__ABILITY = ELEMENT_TYPE__ABILITY;

	/**
	 * The feature id for the '<em><b>Nb Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__NB_DISPLAYS = ELEMENT_TYPE__NB_DISPLAYS;

	/**
	 * The feature id for the '<em><b>For Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Displayable Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT = ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT;

	/**
	 * The number of operations of the '<em>Statement Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE_OPERATION_COUNT = ELEMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Directions
	 * @see generator.impl.GeneratorPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 87;

	/**
	 * The meta object id for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.DungeonMode
	 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
	 * @generated
	 */
	int DUNGEON_MODE = 88;

	/**
	 * The meta object id for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TableBuild
	 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 89;

	/**
	 * The meta object id for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ResultPosition
	 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 90;

	/**
	 * The meta object id for the '{@link generator.ESingleTarget <em>ESingle Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESingleTarget
	 * @see generator.impl.GeneratorPackageImpl#getESingleTarget()
	 * @generated
	 */
	int ESINGLE_TARGET = 91;

	/**
	 * The meta object id for the '{@link generator.ETaskType <em>ETask Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ETaskType
	 * @see generator.impl.GeneratorPackageImpl#getETaskType()
	 * @generated
	 */
	int ETASK_TYPE = 92;

	/**
	 * The meta object id for the '{@link generator.EModality <em>EModality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EModality
	 * @see generator.impl.GeneratorPackageImpl#getEModality()
	 * @generated
	 */
	int EMODALITY = 93;

	/**
	 * The meta object id for the '{@link generator.ESeveralTarget <em>ESeveral Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESeveralTarget
	 * @see generator.impl.GeneratorPackageImpl#getESeveralTarget()
	 * @generated
	 */
	int ESEVERAL_TARGET = 94;

	/**
	 * The meta object id for the '{@link generator.ElementSize <em>Element Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ElementSize
	 * @see generator.impl.GeneratorPackageImpl#getElementSize()
	 * @generated
	 */
	int ELEMENT_SIZE = 95;

	/**
	 * The meta object id for the '{@link generator.GPCategory <em>GP Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.GPCategory
	 * @see generator.impl.GeneratorPackageImpl#getGPCategory()
	 * @generated
	 */
	int GP_CATEGORY = 96;

	/**
	 * The meta object id for the '{@link generator.ECorrectness <em>ECorrectness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ECorrectness
	 * @see generator.impl.GeneratorPackageImpl#getECorrectness()
	 * @generated
	 */
	int ECORRECTNESS = 97;

	/**
	 * The meta object id for the '{@link generator.EBoundary <em>EBoundary</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EBoundary
	 * @see generator.impl.GeneratorPackageImpl#getEBoundary()
	 * @generated
	 */
	int EBOUNDARY = 98;

	/**
	 * The meta object id for the '{@link generator.EStatementType <em>EStatement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EStatementType
	 * @see generator.impl.GeneratorPackageImpl#getEStatementType()
	 * @generated
	 */
	int ESTATEMENT_TYPE = 99;

	/**
	 * Returns the meta object for class '{@link generator.AbstractFact <em>Abstract Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Fact</em>'.
	 * @see generator.AbstractFact
	 * @generated
	 */
	EClass getAbstractFact();

	/**
	 * Returns the meta object for class '{@link generator.SetOfFacts <em>Set Of Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Of Facts</em>'.
	 * @see generator.SetOfFacts
	 * @generated
	 */
	EClass getSetOfFacts();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.SetOfFacts#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see generator.SetOfFacts#getFacts()
	 * @see #getSetOfFacts()
	 * @generated
	 */
	EReference getSetOfFacts_Facts();

	/**
	 * Returns the meta object for the attribute '{@link generator.SetOfFacts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.SetOfFacts#getName()
	 * @see #getSetOfFacts()
	 * @generated
	 */
	EAttribute getSetOfFacts_Name();

	/**
	 * Returns the meta object for class '{@link generator.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see generator.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link generator.Knowledge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Knowledge#getName()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Knowledge#getKnowledgefacts <em>Knowledgefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledgefacts</em>'.
	 * @see generator.Knowledge#getKnowledgefacts()
	 * @see #getKnowledge()
	 * @generated
	 */
	EReference getKnowledge_Knowledgefacts();

	/**
	 * Returns the meta object for class '{@link generator.Dungeon <em>Dungeon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dungeon</em>'.
	 * @see generator.Dungeon
	 * @generated
	 */
	EClass getDungeon();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Dungeon#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see generator.Dungeon#getRooms()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link generator.Dungeon#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see generator.Dungeon#getMode()
	 * @see #getDungeon()
	 * @generated
	 */
	EAttribute getDungeon_Mode();

	/**
	 * Returns the meta object for the reference '{@link generator.Dungeon#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see generator.Dungeon#getEntry()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Entry();

	/**
	 * Returns the meta object for the reference '{@link generator.Dungeon#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see generator.Dungeon#getLevel()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Level();

	/**
	 * Returns the meta object for the reference '{@link generator.Dungeon#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningobjective</em>'.
	 * @see generator.Dungeon#getLearningobjective()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Learningobjective();

	/**
	 * Returns the meta object for the reference '{@link generator.Dungeon#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit</em>'.
	 * @see generator.Dungeon#getExit()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Exit();

	/**
	 * Returns the meta object for class '{@link generator.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see generator.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link generator.Room#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see generator.Room#getX()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_X();

	/**
	 * Returns the meta object for the attribute '{@link generator.Room#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see generator.Room#getY()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Y();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Room#getRoomaccess <em>Roomaccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roomaccess</em>'.
	 * @see generator.Room#getRoomaccess()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomaccess();

	/**
	 * Returns the meta object for the reference '{@link generator.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see generator.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Room#getQuestionedFacts <em>Questioned Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questioned Facts</em>'.
	 * @see generator.Room#getQuestionedFacts()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_QuestionedFacts();

	/**
	 * Returns the meta object for the reference '{@link generator.Room#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see generator.Room#getTask()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Room#getPositionedElement <em>Positioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positioned Element</em>'.
	 * @see generator.Room#getPositionedElement()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_PositionedElement();

	/**
	 * Returns the meta object for the reference '{@link generator.Room#getGameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameplay</em>'.
	 * @see generator.Room#getGameplay()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Gameplay();

	/**
	 * Returns the meta object for class '{@link generator.GameDescription <em>Game Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Description</em>'.
	 * @see generator.GameDescription
	 * @generated
	 */
	EClass getGameDescription();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roomtypes</em>'.
	 * @see generator.GameDescription#getRoomtypes()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Roomtypes();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getLevelsDifficultyProgress <em>Levels Difficulty Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Levels Difficulty Progress</em>'.
	 * @see generator.GameDescription#getLevelsDifficultyProgress()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_LevelsDifficultyProgress();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getGameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gameplays</em>'.
	 * @see generator.GameDescription#getGameplays()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Gameplays();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see generator.GameDescription#getElements()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abilities</em>'.
	 * @see generator.GameDescription#getAbilities()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Abilities();

	/**
	 * Returns the meta object for class '{@link generator.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see generator.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link generator.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.RoomType#getElementPositions <em>Element Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Positions</em>'.
	 * @see generator.RoomType#getElementPositions()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_ElementPositions();

	/**
	 * Returns the meta object for the attribute '{@link generator.RoomType#isForEntry <em>For Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Entry</em>'.
	 * @see generator.RoomType#isForEntry()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_ForEntry();

	/**
	 * Returns the meta object for the attribute '{@link generator.RoomType#isForExit <em>For Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Exit</em>'.
	 * @see generator.RoomType#isForExit()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_ForExit();

	/**
	 * Returns the meta object for the '{@link generator.RoomType#getDirections() <em>Get Directions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Directions</em>' operation.
	 * @see generator.RoomType#getDirections()
	 * @generated
	 */
	EOperation getRoomType__GetDirections();

	/**
	 * Returns the meta object for class '{@link generator.SmallRoomType <em>Small Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Room Type</em>'.
	 * @see generator.SmallRoomType
	 * @generated
	 */
	EClass getSmallRoomType();

	/**
	 * Returns the meta object for the attribute list '{@link generator.SmallRoomType#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Directions</em>'.
	 * @see generator.SmallRoomType#getDirections()
	 * @see #getSmallRoomType()
	 * @generated
	 */
	EAttribute getSmallRoomType_Directions();

	/**
	 * Returns the meta object for class '{@link generator.LargeRoomType <em>Large Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Room Type</em>'.
	 * @see generator.LargeRoomType
	 * @generated
	 */
	EClass getLargeRoomType();

	/**
	 * Returns the meta object for the attribute list '{@link generator.LargeRoomType#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Directions</em>'.
	 * @see generator.LargeRoomType#getDirections()
	 * @see #getLargeRoomType()
	 * @generated
	 */
	EAttribute getLargeRoomType_Directions();

	/**
	 * Returns the meta object for class '{@link generator.RoomAccess <em>Room Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Access</em>'.
	 * @see generator.RoomAccess
	 * @generated
	 */
	EClass getRoomAccess();

	/**
	 * Returns the meta object for the attribute '{@link generator.RoomAccess#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see generator.RoomAccess#getDirection()
	 * @see #getRoomAccess()
	 * @generated
	 */
	EAttribute getRoomAccess_Direction();

	/**
	 * Returns the meta object for the reference '{@link generator.RoomAccess#getOtherroomaccess <em>Otherroomaccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Otherroomaccess</em>'.
	 * @see generator.RoomAccess#getOtherroomaccess()
	 * @see #getRoomAccess()
	 * @generated
	 */
	EReference getRoomAccess_Otherroomaccess();

	/**
	 * Returns the meta object for class '{@link generator.GameContext <em>Game Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Context</em>'.
	 * @see generator.GameContext
	 * @generated
	 */
	EClass getGameContext();

	/**
	 * Returns the meta object for the attribute '{@link generator.GameContext#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see generator.GameContext#getMode()
	 * @see #getGameContext()
	 * @generated
	 */
	EAttribute getGameContext_Mode();

	/**
	 * Returns the meta object for class '{@link generator.LearningDomain <em>Learning Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Domain</em>'.
	 * @see generator.LearningDomain
	 * @generated
	 */
	EClass getLearningDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearningDomain#getLearningpaths <em>Learningpaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningpaths</em>'.
	 * @see generator.LearningDomain#getLearningpaths()
	 * @see #getLearningDomain()
	 * @generated
	 */
	EReference getLearningDomain_Learningpaths();

	/**
	 * Returns the meta object for class '{@link generator.LearningPath <em>Learning Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Path</em>'.
	 * @see generator.LearningPath
	 * @generated
	 */
	EClass getLearningPath();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearningPath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.LearningPath#getName()
	 * @see #getLearningPath()
	 * @generated
	 */
	EAttribute getLearningPath_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearningPath#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see generator.LearningPath#getObjectives()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Objectives();

	/**
	 * Returns the meta object for the reference '{@link generator.LearningPath#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see generator.LearningPath#getKnowledge()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Knowledge();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearningPath#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.LearningPath#getID()
	 * @see #getLearningPath()
	 * @generated
	 */
	EAttribute getLearningPath_ID();

	/**
	 * Returns the meta object for class '{@link generator.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see generator.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the attribute '{@link generator.Objective#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Objective#getID()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.Objective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Objective#getName()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Objective#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see generator.Objective#getPrerequisites()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_Prerequisites();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Objective#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see generator.Objective#getLevels()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_Levels();

	/**
	 * Returns the meta object for the reference list '{@link generator.Objective#getSetoffacts <em>Setoffacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setoffacts</em>'.
	 * @see generator.Objective#getSetoffacts()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_Setoffacts();

	/**
	 * Returns the meta object for class '{@link generator.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite</em>'.
	 * @see generator.Prerequisite
	 * @generated
	 */
	EClass getPrerequisite();

	/**
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getSuccesPercent <em>Succes Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Succes Percent</em>'.
	 * @see generator.Prerequisite#getSuccesPercent()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_SuccesPercent();

	/**
	 * Returns the meta object for the reference '{@link generator.Prerequisite#getRequiredLevel <em>Required Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Level</em>'.
	 * @see generator.Prerequisite#getRequiredLevel()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_RequiredLevel();

	/**
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getEncountersPercent <em>Encounters Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encounters Percent</em>'.
	 * @see generator.Prerequisite#getEncountersPercent()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_EncountersPercent();

	/**
	 * Returns the meta object for class '{@link generator.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see generator.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link generator.Level#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Level#getID()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Level#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see generator.Level#getTasks()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Level#getCompletionCriteria <em>Completion Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Criteria</em>'.
	 * @see generator.Level#getCompletionCriteria()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_CompletionCriteria();

	/**
	 * Returns the meta object for class '{@link generator.MTLevel <em>MT Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Level</em>'.
	 * @see generator.MTLevel
	 * @generated
	 */
	EClass getMTLevel();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTLevel#getBuildSetup <em>Build Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Setup</em>'.
	 * @see generator.MTLevel#getBuildSetup()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_BuildSetup();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Position Setup</em>'.
	 * @see generator.MTLevel#getResultPositionSetup()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_ResultPositionSetup();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTLevel#getMinInterval <em>Min Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interval</em>'.
	 * @see generator.MTLevel#getMinInterval()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_MinInterval();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTLevel#getMaxInterval <em>Max Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interval</em>'.
	 * @see generator.MTLevel#getMaxInterval()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_MaxInterval();

	/**
	 * Returns the meta object for class '{@link generator.MTCompletion1 <em>MT Completion1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Completion1</em>'.
	 * @see generator.MTCompletion1
	 * @generated
	 */
	EClass getMTCompletion1();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTCompletion1#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see generator.MTCompletion1#getTargets()
	 * @see #getMTCompletion1()
	 * @generated
	 */
	EAttribute getMTCompletion1_Targets();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion1#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.MTCompletion1#getNbMissingElements()
	 * @see #getMTCompletion1()
	 * @generated
	 */
	EAttribute getMTCompletion1_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion1#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.MTCompletion1#isCheckLearnerAction()
	 * @see #getMTCompletion1()
	 * @generated
	 */
	EAttribute getMTCompletion1_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.GenerationContext <em>Generation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Context</em>'.
	 * @see generator.GenerationContext
	 * @generated
	 */
	EClass getGenerationContext();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GenerationContext#getGamecontext <em>Gamecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamecontext</em>'.
	 * @see generator.GenerationContext#getGamecontext()
	 * @see #getGenerationContext()
	 * @generated
	 */
	EReference getGenerationContext_Gamecontext();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GenerationContext#getLearnerplayer <em>Learnerplayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Learnerplayer</em>'.
	 * @see generator.GenerationContext#getLearnerplayer()
	 * @see #getGenerationContext()
	 * @generated
	 */
	EReference getGenerationContext_Learnerplayer();

	/**
	 * Returns the meta object for class '{@link generator.LearnerPlayer <em>Learner Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learner Player</em>'.
	 * @see generator.LearnerPlayer
	 * @generated
	 */
	EClass getLearnerPlayer();

	/**
	 * Returns the meta object for the containment reference '{@link generator.LearnerPlayer#getProgression <em>Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Progression</em>'.
	 * @see generator.LearnerPlayer#getProgression()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EReference getLearnerPlayer_Progression();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearnerPlayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.LearnerPlayer#getName()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EAttribute getLearnerPlayer_Name();

	/**
	 * Returns the meta object for the reference '{@link generator.LearnerPlayer#getLearningpath <em>Learningpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningpath</em>'.
	 * @see generator.LearnerPlayer#getLearningpath()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EReference getLearnerPlayer_Learningpath();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearnerPlayer#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.LearnerPlayer#getID()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EAttribute getLearnerPlayer_ID();

	/**
	 * Returns the meta object for class '{@link generator.Progression <em>Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progression</em>'.
	 * @see generator.Progression
	 * @generated
	 */
	EClass getProgression();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Progression#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currentobjectivelevels</em>'.
	 * @see generator.Progression#getCurrentobjectivelevels()
	 * @see #getProgression()
	 * @generated
	 */
	EReference getProgression_Currentobjectivelevels();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Progression#getCurrentGameLevel <em>Current Game Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Game Level</em>'.
	 * @see generator.Progression#getCurrentGameLevel()
	 * @see #getProgression()
	 * @generated
	 */
	EReference getProgression_CurrentGameLevel();

	/**
	 * Returns the meta object for class '{@link generator.CurrentObjectiveLevel <em>Current Objective Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Objective Level</em>'.
	 * @see generator.CurrentObjectiveLevel
	 * @generated
	 */
	EClass getCurrentObjectiveLevel();

	/**
	 * Returns the meta object for the reference '{@link generator.CurrentObjectiveLevel#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objective</em>'.
	 * @see generator.CurrentObjectiveLevel#getObjective()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EReference getCurrentObjectiveLevel_Objective();

	/**
	 * Returns the meta object for the attribute '{@link generator.CurrentObjectiveLevel#isAchieved <em>Achieved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achieved</em>'.
	 * @see generator.CurrentObjectiveLevel#isAchieved()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EAttribute getCurrentObjectiveLevel_Achieved();

	/**
	 * Returns the meta object for the reference '{@link generator.CurrentObjectiveLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see generator.CurrentObjectiveLevel#getLevel()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EReference getCurrentObjectiveLevel_Level();

	/**
	 * Returns the meta object for the containment reference '{@link generator.CurrentObjectiveLevel#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Results</em>'.
	 * @see generator.CurrentObjectiveLevel#getResults()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EReference getCurrentObjectiveLevel_Results();

	/**
	 * Returns the meta object for the attribute '{@link generator.CurrentObjectiveLevel#getEncountersPercent <em>Encounters Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encounters Percent</em>'.
	 * @see generator.CurrentObjectiveLevel#getEncountersPercent()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EAttribute getCurrentObjectiveLevel_EncountersPercent();

	/**
	 * Returns the meta object for the attribute '{@link generator.CurrentObjectiveLevel#getSucessPercent <em>Sucess Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sucess Percent</em>'.
	 * @see generator.CurrentObjectiveLevel#getSucessPercent()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EAttribute getCurrentObjectiveLevel_SucessPercent();

	/**
	 * Returns the meta object for class '{@link generator.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see generator.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link generator.Position#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see generator.Position#getSize()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Size();

	/**
	 * Returns the meta object for the reference list '{@link generator.Position#getRestrictedTo <em>Restricted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restricted To</em>'.
	 * @see generator.Position#getRestrictedTo()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_RestrictedTo();

	/**
	 * Returns the meta object for the attribute '{@link generator.Position#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Position#getID()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_ID();

	/**
	 * Returns the meta object for class '{@link generator.ResponseModality <em>Response Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Modality</em>'.
	 * @see generator.ResponseModality
	 * @generated
	 */
	EClass getResponseModality();

	/**
	 * Returns the meta object for class '{@link generator.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see generator.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the attribute '{@link generator.MultipleChoice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.MultipleChoice#getType()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.MultipleChoice#getNbChoices <em>Nb Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Choices</em>'.
	 * @see generator.MultipleChoice#getNbChoices()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_NbChoices();

	/**
	 * Returns the meta object for the attribute '{@link generator.MultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Bad Choices</em>'.
	 * @see generator.MultipleChoice#getNbBadChoices()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_NbBadChoices();

	/**
	 * Returns the meta object for class '{@link generator.EnterResponse <em>Enter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enter Response</em>'.
	 * @see generator.EnterResponse
	 * @generated
	 */
	EClass getEnterResponse();

	/**
	 * Returns the meta object for the attribute '{@link generator.EnterResponse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.EnterResponse#getType()
	 * @see #getEnterResponse()
	 * @generated
	 */
	EAttribute getEnterResponse_Type();

	/**
	 * Returns the meta object for class '{@link generator.RoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Types</em>'.
	 * @see generator.RoomTypes
	 * @generated
	 */
	EClass getRoomTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.RoomTypes#getRoomtypes <em>Roomtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roomtypes</em>'.
	 * @see generator.RoomTypes#getRoomtypes()
	 * @see #getRoomTypes()
	 * @generated
	 */
	EReference getRoomTypes_Roomtypes();

	/**
	 * Returns the meta object for class '{@link generator.ATask <em>ATask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATask</em>'.
	 * @see generator.ATask
	 * @generated
	 */
	EClass getATask();

	/**
	 * Returns the meta object for the attribute '{@link generator.ATask#getPercentOfApparition <em>Percent Of Apparition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Apparition</em>'.
	 * @see generator.ATask#getPercentOfApparition()
	 * @see #getATask()
	 * @generated
	 */
	EAttribute getATask_PercentOfApparition();

	/**
	 * Returns the meta object for the attribute '{@link generator.ATask#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Consecutive Success</em>'.
	 * @see generator.ATask#getNbConsecutiveSuccess()
	 * @see #getATask()
	 * @generated
	 */
	EAttribute getATask_NbConsecutiveSuccess();

	/**
	 * Returns the meta object for the containment reference '{@link generator.ATask#getResponseModality <em>Response Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Modality</em>'.
	 * @see generator.ATask#getResponseModality()
	 * @see #getATask()
	 * @generated
	 */
	EReference getATask_ResponseModality();

	/**
	 * Returns the meta object for the attribute '{@link generator.ATask#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.ATask#getID()
	 * @see #getATask()
	 * @generated
	 */
	EAttribute getATask_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.ATask#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see generator.ATask#getMaxTime()
	 * @see #getATask()
	 * @generated
	 */
	EAttribute getATask_MaxTime();

	/**
	 * Returns the meta object for the attribute '{@link generator.ATask#getNbFacts <em>Nb Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Facts</em>'.
	 * @see generator.ATask#getNbFacts()
	 * @see #getATask()
	 * @generated
	 */
	EAttribute getATask_NbFacts();

	/**
	 * Returns the meta object for the '{@link generator.ATask#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see generator.ATask#getType()
	 * @generated
	 */
	EOperation getATask__GetType();

	/**
	 * Returns the meta object for the '{@link generator.ATask#isCheckOnLearnerAction() <em>Is Check On Learner Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Check On Learner Action</em>' operation.
	 * @see generator.ATask#isCheckOnLearnerAction()
	 * @generated
	 */
	EOperation getATask__IsCheckOnLearnerAction();

	/**
	 * Returns the meta object for the '{@link generator.ATask#nbExpectedAnswers() <em>Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nb Expected Answers</em>' operation.
	 * @see generator.ATask#nbExpectedAnswers()
	 * @generated
	 */
	EOperation getATask__NbExpectedAnswers();

	/**
	 * Returns the meta object for class '{@link generator.CompletionTask <em>Completion Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Task</em>'.
	 * @see generator.CompletionTask
	 * @generated
	 */
	EClass getCompletionTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.CompletionTask#getType()
	 * @see #getCompletionTask()
	 * @generated
	 */
	EAttribute getCompletionTask_Type();

	/**
	 * Returns the meta object for the '{@link generator.CompletionTask#getNbMissingElements() <em>Get Nb Missing Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Missing Elements</em>' operation.
	 * @see generator.CompletionTask#getNbMissingElements()
	 * @generated
	 */
	EOperation getCompletionTask__GetNbMissingElements();

	/**
	 * Returns the meta object for class '{@link generator.IdentificationTask <em>Identification Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Task</em>'.
	 * @see generator.IdentificationTask
	 * @generated
	 */
	EClass getIdentificationTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentificationTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.IdentificationTask#getType()
	 * @see #getIdentificationTask()
	 * @generated
	 */
	EAttribute getIdentificationTask_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentificationTask#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.IdentificationTask#isCheckLearnerAction()
	 * @see #getIdentificationTask()
	 * @generated
	 */
	EAttribute getIdentificationTask_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.MembershipIDTask <em>Membership ID Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership ID Task</em>'.
	 * @see generator.MembershipIDTask
	 * @generated
	 */
	EClass getMembershipIDTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.MembershipIDTask#getType()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#isIdentifySharedProperty <em>Identify Shared Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identify Shared Property</em>'.
	 * @see generator.MembershipIDTask#isIdentifySharedProperty()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_IdentifySharedProperty();

	/**
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.MembershipIDTask#isCheckLearnerAction()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.MTCompletion2 <em>MT Completion2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Completion2</em>'.
	 * @see generator.MTCompletion2
	 * @generated
	 */
	EClass getMTCompletion2();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTCompletion2#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see generator.MTCompletion2#getTargets()
	 * @see #getMTCompletion2()
	 * @generated
	 */
	EAttribute getMTCompletion2_Targets();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion2#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.MTCompletion2#getNbMissingElements()
	 * @see #getMTCompletion2()
	 * @generated
	 */
	EAttribute getMTCompletion2_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion2#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.MTCompletion2#isCheckLearnerAction()
	 * @see #getMTCompletion2()
	 * @generated
	 */
	EAttribute getMTCompletion2_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.MTRecontruction <em>MT Recontruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Recontruction</em>'.
	 * @see generator.MTRecontruction
	 * @generated
	 */
	EClass getMTRecontruction();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTRecontruction#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.MTRecontruction#getNbMissingElements()
	 * @see #getMTRecontruction()
	 * @generated
	 */
	EAttribute getMTRecontruction_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTRecontruction#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.MTRecontruction#isCheckLearnerAction()
	 * @see #getMTRecontruction()
	 * @generated
	 */
	EAttribute getMTRecontruction_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.MTIdentification <em>MT Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Identification</em>'.
	 * @see generator.MTIdentification
	 * @generated
	 */
	EClass getMTIdentification();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTIdentification#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see generator.MTIdentification#getTarget()
	 * @see #getMTIdentification()
	 * @generated
	 */
	EAttribute getMTIdentification_Target();

	/**
	 * Returns the meta object for class '{@link generator.MTMembership <em>MT Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Membership</em>'.
	 * @see generator.MTMembership
	 * @generated
	 */
	EClass getMTMembership();

	/**
	 * Returns the meta object for class '{@link generator.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see generator.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Results#getResultsbytask <em>Resultsbytask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultsbytask</em>'.
	 * @see generator.Results#getResultsbytask()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Resultsbytask();

	/**
	 * Returns the meta object for class '{@link generator.ResultsByTask <em>Results By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results By Task</em>'.
	 * @see generator.ResultsByTask
	 * @generated
	 */
	EClass getResultsByTask();

	/**
	 * Returns the meta object for the reference '{@link generator.ResultsByTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see generator.ResultsByTask#getTask()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EReference getResultsByTask_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.ResultsByTask#getQuestionableFacts <em>Questionable Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionable Facts</em>'.
	 * @see generator.ResultsByTask#getQuestionableFacts()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EReference getResultsByTask_QuestionableFacts();

	/**
	 * Returns the meta object for the attribute '{@link generator.ResultsByTask#getSucessPercent <em>Sucess Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sucess Percent</em>'.
	 * @see generator.ResultsByTask#getSucessPercent()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EAttribute getResultsByTask_SucessPercent();

	/**
	 * Returns the meta object for the attribute '{@link generator.ResultsByTask#getEncountersPercent <em>Encounters Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encounters Percent</em>'.
	 * @see generator.ResultsByTask#getEncountersPercent()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EAttribute getResultsByTask_EncountersPercent();

	/**
	 * Returns the meta object for class '{@link generator.MTFact <em>MT Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Fact</em>'.
	 * @see generator.MTFact
	 * @generated
	 */
	EClass getMTFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTFact#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see generator.MTFact#getTable()
	 * @see #getMTFact()
	 * @generated
	 */
	EAttribute getMTFact_Table();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTFact#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see generator.MTFact#getOp()
	 * @see #getMTFact()
	 * @generated
	 */
	EAttribute getMTFact_Op();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTFact#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see generator.MTFact#getRes()
	 * @see #getMTFact()
	 * @generated
	 */
	EAttribute getMTFact_Res();

	/**
	 * Returns the meta object for class '{@link generator.MTResultFact <em>MT Result Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Result Fact</em>'.
	 * @see generator.MTResultFact
	 * @generated
	 */
	EClass getMTResultFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTResultFact#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see generator.MTResultFact#getTable()
	 * @see #getMTResultFact()
	 * @generated
	 */
	EAttribute getMTResultFact_Table();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTResultFact#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see generator.MTResultFact#getRes()
	 * @see #getMTResultFact()
	 * @generated
	 */
	EAttribute getMTResultFact_Res();

	/**
	 * Returns the meta object for class '{@link generator.QuestionableFact <em>Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionable Fact</em>'.
	 * @see generator.QuestionableFact
	 * @generated
	 */
	EClass getQuestionableFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionableFact#isAchieved <em>Achieved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achieved</em>'.
	 * @see generator.QuestionableFact#isAchieved()
	 * @see #getQuestionableFact()
	 * @generated
	 */
	EAttribute getQuestionableFact_Achieved();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionableFact#isWasSelected <em>Was Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Was Selected</em>'.
	 * @see generator.QuestionableFact#isWasSelected()
	 * @see #getQuestionableFact()
	 * @generated
	 */
	EAttribute getQuestionableFact_WasSelected();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionableFact#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.QuestionableFact#getID()
	 * @see #getQuestionableFact()
	 * @generated
	 */
	EAttribute getQuestionableFact_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.QuestionableFact#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see generator.QuestionableFact#getResults()
	 * @see #getQuestionableFact()
	 * @generated
	 */
	EReference getQuestionableFact_Results();

	/**
	 * Returns the meta object for the '{@link generator.QuestionableFact#getQuestionableFact() <em>Get Questionable Fact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Questionable Fact</em>' operation.
	 * @see generator.QuestionableFact#getQuestionableFact()
	 * @generated
	 */
	EOperation getQuestionableFact__GetQuestionableFact();

	/**
	 * Returns the meta object for the '{@link generator.QuestionableFact#getCompleteFact() <em>Get Complete Fact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Complete Fact</em>' operation.
	 * @see generator.QuestionableFact#getCompleteFact()
	 * @generated
	 */
	EOperation getQuestionableFact__GetCompleteFact();

	/**
	 * Returns the meta object for class '{@link generator.MTQFCompletion1 <em>MTQF Completion1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF Completion1</em>'.
	 * @see generator.MTQFCompletion1
	 * @generated
	 */
	EClass getMTQFCompletion1();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Operand</em>'.
	 * @see generator.MTQFCompletion1#getLeftOperand()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Operand</em>'.
	 * @see generator.MTQFCompletion1#getRightOperand()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see generator.MTQFCompletion1#getResult()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_Result();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#getSoluce <em>Soluce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce</em>'.
	 * @see generator.MTQFCompletion1#getSoluce()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_Soluce();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#isResultOnRight <em>Result On Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result On Right</em>'.
	 * @see generator.MTQFCompletion1#isResultOnRight()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_ResultOnRight();

	/**
	 * Returns the meta object for class '{@link generator.MTQFCompletion2 <em>MTQF Completion2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF Completion2</em>'.
	 * @see generator.MTQFCompletion2
	 * @generated
	 */
	EClass getMTQFCompletion2();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Operand</em>'.
	 * @see generator.MTQFCompletion2#getLeftOperand()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Operand</em>'.
	 * @see generator.MTQFCompletion2#getRightOperand()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see generator.MTQFCompletion2#getResult()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_Result();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getSoluceLeft <em>Soluce Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Left</em>'.
	 * @see generator.MTQFCompletion2#getSoluceLeft()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_SoluceLeft();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getSoluceRight <em>Soluce Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Right</em>'.
	 * @see generator.MTQFCompletion2#getSoluceRight()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_SoluceRight();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getSoluceRes <em>Soluce Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Res</em>'.
	 * @see generator.MTQFCompletion2#getSoluceRes()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_SoluceRes();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#isResultOnRight <em>Result On Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result On Right</em>'.
	 * @see generator.MTQFCompletion2#isResultOnRight()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_ResultOnRight();

	/**
	 * Returns the meta object for class '{@link generator.MTQFRebuild <em>MTQF Rebuild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF Rebuild</em>'.
	 * @see generator.MTQFRebuild
	 * @generated
	 */
	EClass getMTQFRebuild();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFRebuild#getSoluceLeft <em>Soluce Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Left</em>'.
	 * @see generator.MTQFRebuild#getSoluceLeft()
	 * @see #getMTQFRebuild()
	 * @generated
	 */
	EAttribute getMTQFRebuild_SoluceLeft();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFRebuild#getSoluceRes <em>Soluce Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Res</em>'.
	 * @see generator.MTQFRebuild#getSoluceRes()
	 * @see #getMTQFRebuild()
	 * @generated
	 */
	EAttribute getMTQFRebuild_SoluceRes();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFRebuild#isResultOnRight <em>Result On Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result On Right</em>'.
	 * @see generator.MTQFRebuild#isResultOnRight()
	 * @see #getMTQFRebuild()
	 * @generated
	 */
	EAttribute getMTQFRebuild_ResultOnRight();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFRebuild#getSoluceRight <em>Soluce Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce Right</em>'.
	 * @see generator.MTQFRebuild#getSoluceRight()
	 * @see #getMTQFRebuild()
	 * @generated
	 */
	EAttribute getMTQFRebuild_SoluceRight();

	/**
	 * Returns the meta object for class '{@link generator.MTQFIdentification <em>MTQF Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF Identification</em>'.
	 * @see generator.MTQFIdentification
	 * @generated
	 */
	EClass getMTQFIdentification();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see generator.MTQFIdentification#getResult()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_Result();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Operand</em>'.
	 * @see generator.MTQFIdentification#getRightOperand()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Operand</em>'.
	 * @see generator.MTQFIdentification#getLeftOperand()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#isSoluce <em>Soluce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soluce</em>'.
	 * @see generator.MTQFIdentification#isSoluce()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_Soluce();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#isResultOnRight <em>Result On Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result On Right</em>'.
	 * @see generator.MTQFIdentification#isResultOnRight()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_ResultOnRight();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFIdentification#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see generator.MTQFIdentification#getBuild()
	 * @see #getMTQFIdentification()
	 * @generated
	 */
	EAttribute getMTQFIdentification_Build();

	/**
	 * Returns the meta object for class '{@link generator.MTQFMembership <em>MTQF Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF Membership</em>'.
	 * @see generator.MTQFMembership
	 * @generated
	 */
	EClass getMTQFMembership();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTQFMembership#getGoodResults <em>Good Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Good Results</em>'.
	 * @see generator.MTQFMembership#getGoodResults()
	 * @see #getMTQFMembership()
	 * @generated
	 */
	EAttribute getMTQFMembership_GoodResults();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTQFMembership#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see generator.MTQFMembership#getTable()
	 * @see #getMTQFMembership()
	 * @generated
	 */
	EAttribute getMTQFMembership_Table();

	/**
	 * Returns the meta object for class '{@link generator.QuestionedFact <em>Questioned Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questioned Fact</em>'.
	 * @see generator.QuestionedFact
	 * @generated
	 */
	EClass getQuestionedFact();

	/**
	 * Returns the meta object for the reference '{@link generator.QuestionedFact#getQuestionablefact <em>Questionablefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questionablefact</em>'.
	 * @see generator.QuestionedFact#getQuestionablefact()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_Questionablefact();

	/**
	 * Returns the meta object for the containment reference '{@link generator.QuestionedFact#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see generator.QuestionedFact#getQuestion()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_Question();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.QuestionedFact#getPropositions <em>Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propositions</em>'.
	 * @see generator.QuestionedFact#getPropositions()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_Propositions();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.QuestionedFact#getEntrys <em>Entrys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrys</em>'.
	 * @see generator.QuestionedFact#getEntrys()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_Entrys();

	/**
	 * Returns the meta object for the containment reference '{@link generator.QuestionedFact#getCorrectnessToReach <em>Correctness To Reach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correctness To Reach</em>'.
	 * @see generator.QuestionedFact#getCorrectnessToReach()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_CorrectnessToReach();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionedFact#isLearnerValidation <em>Learner Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learner Validation</em>'.
	 * @see generator.QuestionedFact#isLearnerValidation()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EAttribute getQuestionedFact_LearnerValidation();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionedFact#getCompleteFact <em>Complete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Fact</em>'.
	 * @see generator.QuestionedFact#getCompleteFact()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EAttribute getQuestionedFact_CompleteFact();

	/**
	 * Returns the meta object for the containment reference '{@link generator.QuestionedFact#getFactCorrectness <em>Fact Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fact Correctness</em>'.
	 * @see generator.QuestionedFact#getFactCorrectness()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_FactCorrectness();

	/**
	 * Returns the meta object for class '{@link generator.CompletionCriteria <em>Completion Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Criteria</em>'.
	 * @see generator.CompletionCriteria
	 * @generated
	 */
	EClass getCompletionCriteria();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionCriteria#getSuccesPercent <em>Succes Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Succes Percent</em>'.
	 * @see generator.CompletionCriteria#getSuccesPercent()
	 * @see #getCompletionCriteria()
	 * @generated
	 */
	EAttribute getCompletionCriteria_SuccesPercent();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionCriteria#getEncountersPercent <em>Encounters Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encounters Percent</em>'.
	 * @see generator.CompletionCriteria#getEncountersPercent()
	 * @see #getCompletionCriteria()
	 * @generated
	 */
	EAttribute getCompletionCriteria_EncountersPercent();

	/**
	 * Returns the meta object for class '{@link generator.LevelsDifficultyProgress <em>Levels Difficulty Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Levels Difficulty Progress</em>'.
	 * @see generator.LevelsDifficultyProgress
	 * @generated
	 */
	EClass getLevelsDifficultyProgress();

	/**
	 * Returns the meta object for the attribute '{@link generator.LevelsDifficultyProgress#getNbQRoomIncrease <em>Nb QRoom Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb QRoom Increase</em>'.
	 * @see generator.LevelsDifficultyProgress#getNbQRoomIncrease()
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	EAttribute getLevelsDifficultyProgress_NbQRoomIncrease();

	/**
	 * Returns the meta object for the attribute '{@link generator.LevelsDifficultyProgress#getNbNQRoomIncrease <em>Nb NQ Room Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb NQ Room Increase</em>'.
	 * @see generator.LevelsDifficultyProgress#getNbNQRoomIncrease()
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	EAttribute getLevelsDifficultyProgress_NbNQRoomIncrease();

	/**
	 * Returns the meta object for the attribute '{@link generator.LevelsDifficultyProgress#getInitNbQRoom <em>Init Nb QRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Nb QRoom</em>'.
	 * @see generator.LevelsDifficultyProgress#getInitNbQRoom()
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	EAttribute getLevelsDifficultyProgress_InitNbQRoom();

	/**
	 * Returns the meta object for the attribute '{@link generator.LevelsDifficultyProgress#getInitNbNQRoom <em>Init Nb NQ Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Nb NQ Room</em>'.
	 * @see generator.LevelsDifficultyProgress#getInitNbNQRoom()
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	EAttribute getLevelsDifficultyProgress_InitNbNQRoom();

	/**
	 * Returns the meta object for class '{@link generator.CurrentGameLevel <em>Current Game Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Game Level</em>'.
	 * @see generator.CurrentGameLevel
	 * @generated
	 */
	EClass getCurrentGameLevel();

	/**
	 * Returns the meta object for the attribute '{@link generator.CurrentGameLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see generator.CurrentGameLevel#getLevel()
	 * @see #getCurrentGameLevel()
	 * @generated
	 */
	EAttribute getCurrentGameLevel_Level();

	/**
	 * Returns the meta object for class '{@link generator.GameElementTypes <em>Game Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Element Types</em>'.
	 * @see generator.GameElementTypes
	 * @generated
	 */
	EClass getGameElementTypes();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameElementTypes#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equipments</em>'.
	 * @see generator.GameElementTypes#getEquipments()
	 * @see #getGameElementTypes()
	 * @generated
	 */
	EReference getGameElementTypes_Equipments();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameElementTypes#getElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Types</em>'.
	 * @see generator.GameElementTypes#getElementTypes()
	 * @see #getGameElementTypes()
	 * @generated
	 */
	EReference getGameElementTypes_ElementTypes();

	/**
	 * Returns the meta object for class '{@link generator.ElementsTypes <em>Elements Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements Types</em>'.
	 * @see generator.ElementsTypes
	 * @generated
	 */
	EClass getElementsTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.ElementsTypes#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see generator.ElementsTypes#getElements()
	 * @see #getElementsTypes()
	 * @generated
	 */
	EReference getElementsTypes_Elements();

	/**
	 * Returns the meta object for class '{@link generator.Equipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipments</em>'.
	 * @see generator.Equipments
	 * @generated
	 */
	EClass getEquipments();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Equipments#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipments</em>'.
	 * @see generator.Equipments#getEquipments()
	 * @see #getEquipments()
	 * @generated
	 */
	EReference getEquipments_Equipments();

	/**
	 * Returns the meta object for class '{@link generator.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see generator.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see generator.ElementType#getSize()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Size();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.ElementType#getID()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.ElementType#getType()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Type();

	/**
	 * Returns the meta object for the reference '{@link generator.ElementType#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ability</em>'.
	 * @see generator.ElementType#getAbility()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Ability();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementType#getNbDisplays <em>Nb Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Displays</em>'.
	 * @see generator.ElementType#getNbDisplays()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_NbDisplays();

	/**
	 * Returns the meta object for the '{@link generator.ElementType#isDisplayableElement() <em>Is Displayable Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Displayable Element</em>' operation.
	 * @see generator.ElementType#isDisplayableElement()
	 * @generated
	 */
	EOperation getElementType__IsDisplayableElement();

	/**
	 * Returns the meta object for class '{@link generator.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see generator.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link generator.Equipment#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Equipment#getID()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.Equipment#isBought <em>Bought</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bought</em>'.
	 * @see generator.Equipment#isBought()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Bought();

	/**
	 * Returns the meta object for the attribute '{@link generator.Equipment#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see generator.Equipment#isActivated()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Activated();

	/**
	 * Returns the meta object for class '{@link generator.Gameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gameplay</em>'.
	 * @see generator.Gameplay
	 * @generated
	 */
	EClass getGameplay();

	/**
	 * Returns the meta object for the attribute '{@link generator.Gameplay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Gameplay#getName()
	 * @see #getGameplay()
	 * @generated
	 */
	EAttribute getGameplay_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Gameplay#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see generator.Gameplay#getComponents()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_Components();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Gameplay#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see generator.Gameplay#getPrompt()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_Prompt();

	/**
	 * Returns the meta object for the attribute '{@link generator.Gameplay#isUndoable <em>Undoable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undoable</em>'.
	 * @see generator.Gameplay#isUndoable()
	 * @see #getGameplay()
	 * @generated
	 */
	EAttribute getGameplay_Undoable();

	/**
	 * Returns the meta object for class '{@link generator.Gameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gameplays</em>'.
	 * @see generator.Gameplays
	 * @generated
	 */
	EClass getGameplays();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Gameplays#getGameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameplays</em>'.
	 * @see generator.Gameplays#getGameplays()
	 * @see #getGameplays()
	 * @generated
	 */
	EReference getGameplays_Gameplays();

	/**
	 * Returns the meta object for class '{@link generator.QuestionableFactResult <em>Questionable Fact Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionable Fact Result</em>'.
	 * @see generator.QuestionableFactResult
	 * @generated
	 */
	EClass getQuestionableFactResult();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionableFactResult#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see generator.QuestionableFactResult#getResponseTime()
	 * @see #getQuestionableFactResult()
	 * @generated
	 */
	EAttribute getQuestionableFactResult_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionableFactResult#isAnswerValid <em>Answer Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Valid</em>'.
	 * @see generator.QuestionableFactResult#isAnswerValid()
	 * @see #getQuestionableFactResult()
	 * @generated
	 */
	EAttribute getQuestionableFactResult_AnswerValid();

	/**
	 * Returns the meta object for the attribute list '{@link generator.QuestionableFactResult#getGivenAnswers <em>Given Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Given Answers</em>'.
	 * @see generator.QuestionableFactResult#getGivenAnswers()
	 * @see #getQuestionableFactResult()
	 * @generated
	 */
	EAttribute getQuestionableFactResult_GivenAnswers();

	/**
	 * Returns the meta object for class '{@link generator.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see generator.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link generator.Ability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Ability#getName()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Name();

	/**
	 * Returns the meta object for class '{@link generator.Abilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abilities</em>'.
	 * @see generator.Abilities
	 * @generated
	 */
	EClass getAbilities();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Abilities#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see generator.Abilities#getAbilities()
	 * @see #getAbilities()
	 * @generated
	 */
	EReference getAbilities_Abilities();

	/**
	 * Returns the meta object for class '{@link generator.PositionedElement <em>Positioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Element</em>'.
	 * @see generator.PositionedElement
	 * @generated
	 */
	EClass getPositionedElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.PositionedElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.PositionedElement#getID()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_ID();

	/**
	 * Returns the meta object for the reference '{@link generator.PositionedElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.PositionedElement#getPosition()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_Position();

	/**
	 * Returns the meta object for the containment reference '{@link generator.PositionedElement#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correctness</em>'.
	 * @see generator.PositionedElement#getCorrectness()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_Correctness();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.PositionedElement#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see generator.PositionedElement#getDisplays()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_Displays();

	/**
	 * Returns the meta object for the reference '{@link generator.PositionedElement#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see generator.PositionedElement#getElementType()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_ElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.PositionedElement#getExpectedAnswer <em>Expected Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Answer</em>'.
	 * @see generator.PositionedElement#getExpectedAnswer()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_ExpectedAnswer();

	/**
	 * Returns the meta object for the reference '{@link generator.PositionedElement#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact</em>'.
	 * @see generator.PositionedElement#getFact()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_Fact();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.PositionedElement#getAcceptedFacts <em>Accepted Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accepted Facts</em>'.
	 * @see generator.PositionedElement#getAcceptedFacts()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_AcceptedFacts();

	/**
	 * Returns the meta object for class '{@link generator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see generator.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see generator.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for class '{@link generator.QuestionParam <em>Question Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Param</em>'.
	 * @see generator.QuestionParam
	 * @generated
	 */
	EClass getQuestionParam();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionParam#isInteractive <em>Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interactive</em>'.
	 * @see generator.QuestionParam#isInteractive()
	 * @see #getQuestionParam()
	 * @generated
	 */
	EAttribute getQuestionParam_Interactive();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.QuestionParam#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see generator.QuestionParam#getSolutions()
	 * @see #getQuestionParam()
	 * @generated
	 */
	EReference getQuestionParam_Solutions();

	/**
	 * Returns the meta object for class '{@link generator.PropositionParam <em>Proposition Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition Param</em>'.
	 * @see generator.PropositionParam
	 * @generated
	 */
	EClass getPropositionParam();

	/**
	 * Returns the meta object for the containment reference '{@link generator.PropositionParam#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see generator.PropositionParam#getState()
	 * @see #getPropositionParam()
	 * @generated
	 */
	EReference getPropositionParam_State();

	/**
	 * Returns the meta object for class '{@link generator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see generator.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link generator.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for class '{@link generator.Correctness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correctness</em>'.
	 * @see generator.Correctness
	 * @generated
	 */
	EClass getCorrectness();

	/**
	 * Returns the meta object for class '{@link generator.EntrySoluceParam <em>Entry Soluce Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Soluce Param</em>'.
	 * @see generator.EntrySoluceParam
	 * @generated
	 */
	EClass getEntrySoluceParam();

	/**
	 * Returns the meta object for the attribute '{@link generator.EntrySoluceParam#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see generator.EntrySoluceParam#getState()
	 * @see #getEntrySoluceParam()
	 * @generated
	 */
	EAttribute getEntrySoluceParam_State();

	/**
	 * Returns the meta object for class '{@link generator.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see generator.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link generator.Display#isInteractive <em>Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interactive</em>'.
	 * @see generator.Display#isInteractive()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Interactive();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Display#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correctness</em>'.
	 * @see generator.Display#getCorrectness()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Correctness();

	/**
	 * Returns the meta object for class '{@link generator.AComponent <em>AComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AComponent</em>'.
	 * @see generator.AComponent
	 * @generated
	 */
	EClass getAComponent();

	/**
	 * Returns the meta object for the reference '{@link generator.AComponent#getAllowedAbility <em>Allowed Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allowed Ability</em>'.
	 * @see generator.AComponent#getAllowedAbility()
	 * @see #getAComponent()
	 * @generated
	 */
	EReference getAComponent_AllowedAbility();

	/**
	 * Returns the meta object for the containment reference '{@link generator.AComponent#getExpectedSize <em>Expected Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Size</em>'.
	 * @see generator.AComponent#getExpectedSize()
	 * @see #getAComponent()
	 * @generated
	 */
	EReference getAComponent_ExpectedSize();

	/**
	 * Returns the meta object for class '{@link generator.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see generator.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see generator.Structure#getComponents()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Components();

	/**
	 * Returns the meta object for the attribute '{@link generator.Structure#isPerFactOrPropositions <em>Per Fact Or Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Fact Or Propositions</em>'.
	 * @see generator.Structure#isPerFactOrPropositions()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_PerFactOrPropositions();

	/**
	 * Returns the meta object for class '{@link generator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see generator.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Component#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Value</em>'.
	 * @see generator.Component#getDisplayValue()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link generator.Component#isWearChoices <em>Wear Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Choices</em>'.
	 * @see generator.Component#isWearChoices()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_WearChoices();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Component#getDefaultCorrectness <em>Default Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Correctness</em>'.
	 * @see generator.Component#getDefaultCorrectness()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DefaultCorrectness();

	/**
	 * Returns the meta object for the attribute '{@link generator.Component#isWearStatement <em>Wear Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Statement</em>'.
	 * @see generator.Component#isWearStatement()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_WearStatement();

	/**
	 * Returns the meta object for the attribute '{@link generator.Component#isInputEntry <em>Input Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Entry</em>'.
	 * @see generator.Component#isInputEntry()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_InputEntry();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Component#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see generator.Component#getQuantity()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Quantity();

	/**
	 * Returns the meta object for class '{@link generator.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see generator.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link generator.Quantity#isFactNbAnswers <em>Fact Nb Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Nb Answers</em>'.
	 * @see generator.Quantity#isFactNbAnswers()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_FactNbAnswers();

	/**
	 * Returns the meta object for class '{@link generator.WantedAnswersParam <em>Wanted Answers Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wanted Answers Param</em>'.
	 * @see generator.WantedAnswersParam
	 * @generated
	 */
	EClass getWantedAnswersParam();

	/**
	 * Returns the meta object for class '{@link generator.ExpectedAnswer <em>Expected Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Answer</em>'.
	 * @see generator.ExpectedAnswer
	 * @generated
	 */
	EClass getExpectedAnswer();

	/**
	 * Returns the meta object for class '{@link generator.CorrectnessValue <em>Correctness Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correctness Value</em>'.
	 * @see generator.CorrectnessValue
	 * @generated
	 */
	EClass getCorrectnessValue();

	/**
	 * Returns the meta object for the attribute '{@link generator.CorrectnessValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.CorrectnessValue#getValue()
	 * @see #getCorrectnessValue()
	 * @generated
	 */
	EAttribute getCorrectnessValue_Value();

	/**
	 * Returns the meta object for class '{@link generator.AValue <em>AValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AValue</em>'.
	 * @see generator.AValue
	 * @generated
	 */
	EClass getAValue();

	/**
	 * Returns the meta object for class '{@link generator.PositionedStructureElement <em>Positioned Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Structure Element</em>'.
	 * @see generator.PositionedStructureElement
	 * @generated
	 */
	EClass getPositionedStructureElement();

	/**
	 * Returns the meta object for the containment reference '{@link generator.PositionedStructureElement#getCreatedPosition <em>Created Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created Position</em>'.
	 * @see generator.PositionedStructureElement#getCreatedPosition()
	 * @see #getPositionedStructureElement()
	 * @generated
	 */
	EReference getPositionedStructureElement_CreatedPosition();

	/**
	 * Returns the meta object for class '{@link generator.FactSolutionParam <em>Fact Solution Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Solution Param</em>'.
	 * @see generator.FactSolutionParam
	 * @generated
	 */
	EClass getFactSolutionParam();

	/**
	 * Returns the meta object for class '{@link generator.OrderingTask <em>Ordering Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordering Task</em>'.
	 * @see generator.OrderingTask
	 * @generated
	 */
	EClass getOrderingTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.OrderingTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.OrderingTask#getType()
	 * @see #getOrderingTask()
	 * @generated
	 */
	EAttribute getOrderingTask_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.OrderingTask#isCheckLearnerAction <em>Check Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Learner Action</em>'.
	 * @see generator.OrderingTask#isCheckLearnerAction()
	 * @see #getOrderingTask()
	 * @generated
	 */
	EAttribute getOrderingTask_CheckLearnerAction();

	/**
	 * Returns the meta object for class '{@link generator.Prompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt</em>'.
	 * @see generator.Prompt
	 * @generated
	 */
	EClass getPrompt();

	/**
	 * Returns the meta object for the attribute '{@link generator.Prompt#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see generator.Prompt#getPrompt()
	 * @see #getPrompt()
	 * @generated
	 */
	EAttribute getPrompt_Prompt();

	/**
	 * Returns the meta object for class '{@link generator.FactCorrectnessParam <em>Fact Correctness Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Correctness Param</em>'.
	 * @see generator.FactCorrectnessParam
	 * @generated
	 */
	EClass getFactCorrectnessParam();

	/**
	 * Returns the meta object for class '{@link generator.GameplayTaskRelations <em>Gameplay Task Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gameplay Task Relations</em>'.
	 * @see generator.GameplayTaskRelations
	 * @generated
	 */
	EClass getGameplayTaskRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameplayTaskRelations#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see generator.GameplayTaskRelations#getRelations()
	 * @see #getGameplayTaskRelations()
	 * @generated
	 */
	EReference getGameplayTaskRelations_Relations();

	/**
	 * Returns the meta object for class '{@link generator.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see generator.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link generator.Relation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see generator.Relation#getTask()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Task();

	/**
	 * Returns the meta object for the attribute list '{@link generator.Relation#getGameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gameplay</em>'.
	 * @see generator.Relation#getGameplay()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Gameplay();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Relation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see generator.Relation#getCondition()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Condition();

	/**
	 * Returns the meta object for class '{@link generator.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see generator.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute list '{@link generator.Condition#getStatementTypes <em>Statement Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Statement Types</em>'.
	 * @see generator.Condition#getStatementTypes()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_StatementTypes();

	/**
	 * Returns the meta object for the attribute '{@link generator.Condition#getNbFacts <em>Nb Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Facts</em>'.
	 * @see generator.Condition#getNbFacts()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_NbFacts();

	/**
	 * Returns the meta object for the attribute '{@link generator.Condition#getNbExpectedAnswers <em>Nb Expected Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Expected Answers</em>'.
	 * @see generator.Condition#getNbExpectedAnswers()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_NbExpectedAnswers();

	/**
	 * Returns the meta object for the attribute '{@link generator.Condition#getAnswerModality <em>Answer Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Modality</em>'.
	 * @see generator.Condition#getAnswerModality()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_AnswerModality();

	/**
	 * Returns the meta object for class '{@link generator.QuestionGameplay <em>Question Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Gameplay</em>'.
	 * @see generator.QuestionGameplay
	 * @generated
	 */
	EClass getQuestionGameplay();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionGameplay#isManualValidation <em>Manual Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Validation</em>'.
	 * @see generator.QuestionGameplay#isManualValidation()
	 * @see #getQuestionGameplay()
	 * @generated
	 */
	EAttribute getQuestionGameplay_ManualValidation();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionGameplay#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see generator.QuestionGameplay#getCategory()
	 * @see #getQuestionGameplay()
	 * @generated
	 */
	EAttribute getQuestionGameplay_Category();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionGameplay#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Integrated Propositions</em>'.
	 * @see generator.QuestionGameplay#isHasIntegratedPropositions()
	 * @see #getQuestionGameplay()
	 * @generated
	 */
	EAttribute getQuestionGameplay_HasIntegratedPropositions();

	/**
	 * Returns the meta object for the attribute list '{@link generator.QuestionGameplay#getRestrictedTo <em>Restricted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Restricted To</em>'.
	 * @see generator.QuestionGameplay#getRestrictedTo()
	 * @see #getQuestionGameplay()
	 * @generated
	 */
	EAttribute getQuestionGameplay_RestrictedTo();

	/**
	 * Returns the meta object for class '{@link generator.NoQuestionGameplay <em>No Question Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Question Gameplay</em>'.
	 * @see generator.NoQuestionGameplay
	 * @generated
	 */
	EClass getNoQuestionGameplay();

	/**
	 * Returns the meta object for class '{@link generator.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see generator.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for class '{@link generator.StatementElementType <em>Statement Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Element Type</em>'.
	 * @see generator.StatementElementType
	 * @generated
	 */
	EClass getStatementElementType();

	/**
	 * Returns the meta object for the attribute '{@link generator.StatementElementType#isForStructure <em>For Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Structure</em>'.
	 * @see generator.StatementElementType#isForStructure()
	 * @see #getStatementElementType()
	 * @generated
	 */
	EAttribute getStatementElementType_ForStructure();

	/**
	 * Returns the meta object for enum '{@link generator.Directions <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Directions</em>'.
	 * @see generator.Directions
	 * @generated
	 */
	EEnum getDirections();

	/**
	 * Returns the meta object for enum '{@link generator.DungeonMode <em>Dungeon Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dungeon Mode</em>'.
	 * @see generator.DungeonMode
	 * @generated
	 */
	EEnum getDungeonMode();

	/**
	 * Returns the meta object for enum '{@link generator.TableBuild <em>Table Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Build</em>'.
	 * @see generator.TableBuild
	 * @generated
	 */
	EEnum getTableBuild();

	/**
	 * Returns the meta object for enum '{@link generator.ResultPosition <em>Result Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Position</em>'.
	 * @see generator.ResultPosition
	 * @generated
	 */
	EEnum getResultPosition();

	/**
	 * Returns the meta object for enum '{@link generator.ESingleTarget <em>ESingle Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESingle Target</em>'.
	 * @see generator.ESingleTarget
	 * @generated
	 */
	EEnum getESingleTarget();

	/**
	 * Returns the meta object for enum '{@link generator.ETaskType <em>ETask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETask Type</em>'.
	 * @see generator.ETaskType
	 * @generated
	 */
	EEnum getETaskType();

	/**
	 * Returns the meta object for enum '{@link generator.EModality <em>EModality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EModality</em>'.
	 * @see generator.EModality
	 * @generated
	 */
	EEnum getEModality();

	/**
	 * Returns the meta object for enum '{@link generator.ESeveralTarget <em>ESeveral Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESeveral Target</em>'.
	 * @see generator.ESeveralTarget
	 * @generated
	 */
	EEnum getESeveralTarget();

	/**
	 * Returns the meta object for enum '{@link generator.ElementSize <em>Element Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Size</em>'.
	 * @see generator.ElementSize
	 * @generated
	 */
	EEnum getElementSize();

	/**
	 * Returns the meta object for enum '{@link generator.GPCategory <em>GP Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GP Category</em>'.
	 * @see generator.GPCategory
	 * @generated
	 */
	EEnum getGPCategory();

	/**
	 * Returns the meta object for enum '{@link generator.ECorrectness <em>ECorrectness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECorrectness</em>'.
	 * @see generator.ECorrectness
	 * @generated
	 */
	EEnum getECorrectness();

	/**
	 * Returns the meta object for enum '{@link generator.EBoundary <em>EBoundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBoundary</em>'.
	 * @see generator.EBoundary
	 * @generated
	 */
	EEnum getEBoundary();

	/**
	 * Returns the meta object for enum '{@link generator.EStatementType <em>EStatement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStatement Type</em>'.
	 * @see generator.EStatementType
	 * @generated
	 */
	EEnum getEStatementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link generator.impl.AbstractFactImpl <em>Abstract Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AbstractFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getAbstractFact()
		 * @generated
		 */
		EClass ABSTRACT_FACT = eINSTANCE.getAbstractFact();

		/**
		 * The meta object literal for the '{@link generator.impl.SetOfFactsImpl <em>Set Of Facts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.SetOfFactsImpl
		 * @see generator.impl.GeneratorPackageImpl#getSetOfFacts()
		 * @generated
		 */
		EClass SET_OF_FACTS = eINSTANCE.getSetOfFacts();

		/**
		 * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OF_FACTS__FACTS = eINSTANCE.getSetOfFacts_Facts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OF_FACTS__NAME = eINSTANCE.getSetOfFacts_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.KnowledgeImpl
		 * @see generator.impl.GeneratorPackageImpl#getKnowledge()
		 * @generated
		 */
		EClass KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__NAME = eINSTANCE.getKnowledge_Name();

		/**
		 * The meta object literal for the '<em><b>Knowledgefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE__KNOWLEDGEFACTS = eINSTANCE.getKnowledge_Knowledgefacts();

		/**
		 * The meta object literal for the '{@link generator.impl.DungeonImpl <em>Dungeon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DungeonImpl
		 * @see generator.impl.GeneratorPackageImpl#getDungeon()
		 * @generated
		 */
		EClass DUNGEON = eINSTANCE.getDungeon();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__ROOMS = eINSTANCE.getDungeon_Rooms();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNGEON__MODE = eINSTANCE.getDungeon_Mode();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__ENTRY = eINSTANCE.getDungeon_Entry();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__LEVEL = eINSTANCE.getDungeon_Level();

		/**
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__LEARNINGOBJECTIVE = eINSTANCE.getDungeon_Learningobjective();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__EXIT = eINSTANCE.getDungeon_Exit();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomImpl
		 * @see generator.impl.GeneratorPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__X = eINSTANCE.getRoom_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__Y = eINSTANCE.getRoom_Y();

		/**
		 * The meta object literal for the '<em><b>Roomaccess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMACCESS = eINSTANCE.getRoom_Roomaccess();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Questioned Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__QUESTIONED_FACTS = eINSTANCE.getRoom_QuestionedFacts();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TASK = eINSTANCE.getRoom_Task();

		/**
		 * The meta object literal for the '<em><b>Positioned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__POSITIONED_ELEMENT = eINSTANCE.getRoom_PositionedElement();

		/**
		 * The meta object literal for the '<em><b>Gameplay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__GAMEPLAY = eINSTANCE.getRoom_Gameplay();

		/**
		 * The meta object literal for the '{@link generator.impl.GameDescriptionImpl <em>Game Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameDescriptionImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameDescription()
		 * @generated
		 */
		EClass GAME_DESCRIPTION = eINSTANCE.getGameDescription();

		/**
		 * The meta object literal for the '<em><b>Roomtypes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ROOMTYPES = eINSTANCE.getGameDescription_Roomtypes();

		/**
		 * The meta object literal for the '<em><b>Levels Difficulty Progress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS = eINSTANCE
				.getGameDescription_LevelsDifficultyProgress();

		/**
		 * The meta object literal for the '<em><b>Gameplays</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__GAMEPLAYS = eINSTANCE.getGameDescription_Gameplays();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ELEMENTS = eINSTANCE.getGameDescription_Elements();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ABILITIES = eINSTANCE.getGameDescription_Abilities();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Element Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__ELEMENT_POSITIONS = eINSTANCE.getRoomType_ElementPositions();

		/**
		 * The meta object literal for the '<em><b>For Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__FOR_ENTRY = eINSTANCE.getRoomType_ForEntry();

		/**
		 * The meta object literal for the '<em><b>For Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__FOR_EXIT = eINSTANCE.getRoomType_ForExit();

		/**
		 * The meta object literal for the '<em><b>Get Directions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___GET_DIRECTIONS = eINSTANCE.getRoomType__GetDirections();

		/**
		 * The meta object literal for the '{@link generator.impl.SmallRoomTypeImpl <em>Small Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.SmallRoomTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getSmallRoomType()
		 * @generated
		 */
		EClass SMALL_ROOM_TYPE = eINSTANCE.getSmallRoomType();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_ROOM_TYPE__DIRECTIONS = eINSTANCE.getSmallRoomType_Directions();

		/**
		 * The meta object literal for the '{@link generator.impl.LargeRoomTypeImpl <em>Large Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LargeRoomTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getLargeRoomType()
		 * @generated
		 */
		EClass LARGE_ROOM_TYPE = eINSTANCE.getLargeRoomType();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_ROOM_TYPE__DIRECTIONS = eINSTANCE.getLargeRoomType_Directions();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomAccessImpl <em>Room Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomAccessImpl
		 * @see generator.impl.GeneratorPackageImpl#getRoomAccess()
		 * @generated
		 */
		EClass ROOM_ACCESS = eINSTANCE.getRoomAccess();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ACCESS__DIRECTION = eINSTANCE.getRoomAccess_Direction();

		/**
		 * The meta object literal for the '<em><b>Otherroomaccess</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ACCESS__OTHERROOMACCESS = eINSTANCE.getRoomAccess_Otherroomaccess();

		/**
		 * The meta object literal for the '{@link generator.impl.GameContextImpl <em>Game Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameContextImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameContext()
		 * @generated
		 */
		EClass GAME_CONTEXT = eINSTANCE.getGameContext();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_CONTEXT__MODE = eINSTANCE.getGameContext_Mode();

		/**
		 * The meta object literal for the '{@link generator.impl.LearningDomainImpl <em>Learning Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearningDomainImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearningDomain()
		 * @generated
		 */
		EClass LEARNING_DOMAIN = eINSTANCE.getLearningDomain();

		/**
		 * The meta object literal for the '<em><b>Learningpaths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DOMAIN__LEARNINGPATHS = eINSTANCE.getLearningDomain_Learningpaths();

		/**
		 * The meta object literal for the '{@link generator.impl.LearningPathImpl <em>Learning Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearningPathImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearningPath()
		 * @generated
		 */
		EClass LEARNING_PATH = eINSTANCE.getLearningPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_PATH__NAME = eINSTANCE.getLearningPath_Name();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__OBJECTIVES = eINSTANCE.getLearningPath_Objectives();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__KNOWLEDGE = eINSTANCE.getLearningPath_Knowledge();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_PATH__ID = eINSTANCE.getLearningPath_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ObjectiveImpl
		 * @see generator.impl.GeneratorPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__ID = eINSTANCE.getObjective_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__PREREQUISITES = eINSTANCE.getObjective_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__LEVELS = eINSTANCE.getObjective_Levels();

		/**
		 * The meta object literal for the '<em><b>Setoffacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__SETOFFACTS = eINSTANCE.getObjective_Setoffacts();

		/**
		 * The meta object literal for the '{@link generator.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PrerequisiteImpl
		 * @see generator.impl.GeneratorPackageImpl#getPrerequisite()
		 * @generated
		 */
		EClass PREREQUISITE = eINSTANCE.getPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Succes Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__SUCCES_PERCENT = eINSTANCE.getPrerequisite_SuccesPercent();

		/**
		 * The meta object literal for the '<em><b>Required Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__REQUIRED_LEVEL = eINSTANCE.getPrerequisite_RequiredLevel();

		/**
		 * The meta object literal for the '<em><b>Encounters Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__ENCOUNTERS_PERCENT = eINSTANCE.getPrerequisite_EncountersPercent();

		/**
		 * The meta object literal for the '{@link generator.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__ID = eINSTANCE.getLevel_ID();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__TASKS = eINSTANCE.getLevel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Completion Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__COMPLETION_CRITERIA = eINSTANCE.getLevel_CompletionCriteria();

		/**
		 * The meta object literal for the '{@link generator.impl.MTLevelImpl <em>MT Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTLevel()
		 * @generated
		 */
		EClass MT_LEVEL = eINSTANCE.getMTLevel();

		/**
		 * The meta object literal for the '<em><b>Build Setup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_LEVEL__BUILD_SETUP = eINSTANCE.getMTLevel_BuildSetup();

		/**
		 * The meta object literal for the '<em><b>Result Position Setup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_LEVEL__RESULT_POSITION_SETUP = eINSTANCE.getMTLevel_ResultPositionSetup();

		/**
		 * The meta object literal for the '<em><b>Min Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_LEVEL__MIN_INTERVAL = eINSTANCE.getMTLevel_MinInterval();

		/**
		 * The meta object literal for the '<em><b>Max Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_LEVEL__MAX_INTERVAL = eINSTANCE.getMTLevel_MaxInterval();

		/**
		 * The meta object literal for the '{@link generator.impl.MTCompletion1Impl <em>MT Completion1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTCompletion1Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTCompletion1()
		 * @generated
		 */
		EClass MT_COMPLETION1 = eINSTANCE.getMTCompletion1();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION1__TARGETS = eINSTANCE.getMTCompletion1_Targets();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION1__NB_MISSING_ELEMENTS = eINSTANCE.getMTCompletion1_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION1__CHECK_LEARNER_ACTION = eINSTANCE.getMTCompletion1_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.GenerationContextImpl <em>Generation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GenerationContextImpl
		 * @see generator.impl.GeneratorPackageImpl#getGenerationContext()
		 * @generated
		 */
		EClass GENERATION_CONTEXT = eINSTANCE.getGenerationContext();

		/**
		 * The meta object literal for the '<em><b>Gamecontext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_CONTEXT__GAMECONTEXT = eINSTANCE.getGenerationContext_Gamecontext();

		/**
		 * The meta object literal for the '<em><b>Learnerplayer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_CONTEXT__LEARNERPLAYER = eINSTANCE.getGenerationContext_Learnerplayer();

		/**
		 * The meta object literal for the '{@link generator.impl.LearnerPlayerImpl <em>Learner Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearnerPlayerImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearnerPlayer()
		 * @generated
		 */
		EClass LEARNER_PLAYER = eINSTANCE.getLearnerPlayer();

		/**
		 * The meta object literal for the '<em><b>Progression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PLAYER__PROGRESSION = eINSTANCE.getLearnerPlayer_Progression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNER_PLAYER__NAME = eINSTANCE.getLearnerPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Learningpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PLAYER__LEARNINGPATH = eINSTANCE.getLearnerPlayer_Learningpath();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNER_PLAYER__ID = eINSTANCE.getLearnerPlayer_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.ProgressionImpl <em>Progression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ProgressionImpl
		 * @see generator.impl.GeneratorPackageImpl#getProgression()
		 * @generated
		 */
		EClass PROGRESSION = eINSTANCE.getProgression();

		/**
		 * The meta object literal for the '<em><b>Currentobjectivelevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESSION__CURRENTOBJECTIVELEVELS = eINSTANCE.getProgression_Currentobjectivelevels();

		/**
		 * The meta object literal for the '<em><b>Current Game Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESSION__CURRENT_GAME_LEVEL = eINSTANCE.getProgression_CurrentGameLevel();

		/**
		 * The meta object literal for the '{@link generator.impl.CurrentObjectiveLevelImpl <em>Current Objective Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CurrentObjectiveLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurrentObjectiveLevel()
		 * @generated
		 */
		EClass CURRENT_OBJECTIVE_LEVEL = eINSTANCE.getCurrentObjectiveLevel();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_OBJECTIVE_LEVEL__OBJECTIVE = eINSTANCE.getCurrentObjectiveLevel_Objective();

		/**
		 * The meta object literal for the '<em><b>Achieved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_OBJECTIVE_LEVEL__ACHIEVED = eINSTANCE.getCurrentObjectiveLevel_Achieved();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_OBJECTIVE_LEVEL__LEVEL = eINSTANCE.getCurrentObjectiveLevel_Level();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_OBJECTIVE_LEVEL__RESULTS = eINSTANCE.getCurrentObjectiveLevel_Results();

		/**
		 * The meta object literal for the '<em><b>Encounters Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT = eINSTANCE.getCurrentObjectiveLevel_EncountersPercent();

		/**
		 * The meta object literal for the '<em><b>Sucess Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT = eINSTANCE.getCurrentObjectiveLevel_SucessPercent();

		/**
		 * The meta object literal for the '{@link generator.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PositionImpl
		 * @see generator.impl.GeneratorPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__SIZE = eINSTANCE.getPosition_Size();

		/**
		 * The meta object literal for the '<em><b>Restricted To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__RESTRICTED_TO = eINSTANCE.getPosition_RestrictedTo();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ID = eINSTANCE.getPosition_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResponseModalityImpl
		 * @see generator.impl.GeneratorPackageImpl#getResponseModality()
		 * @generated
		 */
		EClass RESPONSE_MODALITY = eINSTANCE.getResponseModality();

		/**
		 * The meta object literal for the '{@link generator.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MultipleChoiceImpl
		 * @see generator.impl.GeneratorPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__TYPE = eINSTANCE.getMultipleChoice_Type();

		/**
		 * The meta object literal for the '<em><b>Nb Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__NB_CHOICES = eINSTANCE.getMultipleChoice_NbChoices();

		/**
		 * The meta object literal for the '<em><b>Nb Bad Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__NB_BAD_CHOICES = eINSTANCE.getMultipleChoice_NbBadChoices();

		/**
		 * The meta object literal for the '{@link generator.impl.EnterResponseImpl <em>Enter Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.EnterResponseImpl
		 * @see generator.impl.GeneratorPackageImpl#getEnterResponse()
		 * @generated
		 */
		EClass ENTER_RESPONSE = eINSTANCE.getEnterResponse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTER_RESPONSE__TYPE = eINSTANCE.getEnterResponse_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomTypesImpl <em>Room Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomTypesImpl
		 * @see generator.impl.GeneratorPackageImpl#getRoomTypes()
		 * @generated
		 */
		EClass ROOM_TYPES = eINSTANCE.getRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Roomtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPES__ROOMTYPES = eINSTANCE.getRoomTypes_Roomtypes();

		/**
		 * The meta object literal for the '{@link generator.impl.ATaskImpl <em>ATask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ATaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getATask()
		 * @generated
		 */
		EClass ATASK = eINSTANCE.getATask();

		/**
		 * The meta object literal for the '<em><b>Percent Of Apparition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATASK__PERCENT_OF_APPARITION = eINSTANCE.getATask_PercentOfApparition();

		/**
		 * The meta object literal for the '<em><b>Nb Consecutive Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATASK__NB_CONSECUTIVE_SUCCESS = eINSTANCE.getATask_NbConsecutiveSuccess();

		/**
		 * The meta object literal for the '<em><b>Response Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATASK__RESPONSE_MODALITY = eINSTANCE.getATask_ResponseModality();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATASK__ID = eINSTANCE.getATask_ID();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATASK__MAX_TIME = eINSTANCE.getATask_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Nb Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATASK__NB_FACTS = eINSTANCE.getATask_NbFacts();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___GET_TYPE = eINSTANCE.getATask__GetType();

		/**
		 * The meta object literal for the '<em><b>Is Check On Learner Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___IS_CHECK_ON_LEARNER_ACTION = eINSTANCE.getATask__IsCheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___NB_EXPECTED_ANSWERS = eINSTANCE.getATask__NbExpectedAnswers();

		/**
		 * The meta object literal for the '{@link generator.impl.CompletionTaskImpl <em>Completion Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CompletionTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getCompletionTask()
		 * @generated
		 */
		EClass COMPLETION_TASK = eINSTANCE.getCompletionTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_TASK__TYPE = eINSTANCE.getCompletionTask_Type();

		/**
		 * The meta object literal for the '<em><b>Get Nb Missing Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETION_TASK___GET_NB_MISSING_ELEMENTS = eINSTANCE.getCompletionTask__GetNbMissingElements();

		/**
		 * The meta object literal for the '{@link generator.impl.IdentificationTaskImpl <em>Identification Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.IdentificationTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getIdentificationTask()
		 * @generated
		 */
		EClass IDENTIFICATION_TASK = eINSTANCE.getIdentificationTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TASK__TYPE = eINSTANCE.getIdentificationTask_Type();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TASK__CHECK_LEARNER_ACTION = eINSTANCE.getIdentificationTask_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.MembershipIDTaskImpl <em>Membership ID Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MembershipIDTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getMembershipIDTask()
		 * @generated
		 */
		EClass MEMBERSHIP_ID_TASK = eINSTANCE.getMembershipIDTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__TYPE = eINSTANCE.getMembershipIDTask_Type();

		/**
		 * The meta object literal for the '<em><b>Identify Shared Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY = eINSTANCE
				.getMembershipIDTask_IdentifySharedProperty();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION = eINSTANCE.getMembershipIDTask_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.MTCompletion2Impl <em>MT Completion2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTCompletion2Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTCompletion2()
		 * @generated
		 */
		EClass MT_COMPLETION2 = eINSTANCE.getMTCompletion2();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION2__TARGETS = eINSTANCE.getMTCompletion2_Targets();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION2__NB_MISSING_ELEMENTS = eINSTANCE.getMTCompletion2_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION2__CHECK_LEARNER_ACTION = eINSTANCE.getMTCompletion2_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.MTRecontructionImpl <em>MT Recontruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTRecontructionImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTRecontruction()
		 * @generated
		 */
		EClass MT_RECONTRUCTION = eINSTANCE.getMTRecontruction();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RECONTRUCTION__NB_MISSING_ELEMENTS = eINSTANCE.getMTRecontruction_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RECONTRUCTION__CHECK_LEARNER_ACTION = eINSTANCE.getMTRecontruction_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.MTIdentificationImpl <em>MT Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTIdentificationImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTIdentification()
		 * @generated
		 */
		EClass MT_IDENTIFICATION = eINSTANCE.getMTIdentification();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_IDENTIFICATION__TARGET = eINSTANCE.getMTIdentification_Target();

		/**
		 * The meta object literal for the '{@link generator.impl.MTMembershipImpl <em>MT Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTMembershipImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTMembership()
		 * @generated
		 */
		EClass MT_MEMBERSHIP = eINSTANCE.getMTMembership();

		/**
		 * The meta object literal for the '{@link generator.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResultsImpl
		 * @see generator.impl.GeneratorPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Resultsbytask</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__RESULTSBYTASK = eINSTANCE.getResults_Resultsbytask();

		/**
		 * The meta object literal for the '{@link generator.impl.ResultsByTaskImpl <em>Results By Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResultsByTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getResultsByTask()
		 * @generated
		 */
		EClass RESULTS_BY_TASK = eINSTANCE.getResultsByTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_BY_TASK__TASK = eINSTANCE.getResultsByTask_Task();

		/**
		 * The meta object literal for the '<em><b>Questionable Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_BY_TASK__QUESTIONABLE_FACTS = eINSTANCE.getResultsByTask_QuestionableFacts();

		/**
		 * The meta object literal for the '<em><b>Sucess Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS_BY_TASK__SUCESS_PERCENT = eINSTANCE.getResultsByTask_SucessPercent();

		/**
		 * The meta object literal for the '<em><b>Encounters Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS_BY_TASK__ENCOUNTERS_PERCENT = eINSTANCE.getResultsByTask_EncountersPercent();

		/**
		 * The meta object literal for the '{@link generator.impl.MTFactImpl <em>MT Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTFact()
		 * @generated
		 */
		EClass MT_FACT = eINSTANCE.getMTFact();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_FACT__TABLE = eINSTANCE.getMTFact_Table();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_FACT__OP = eINSTANCE.getMTFact_Op();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_FACT__RES = eINSTANCE.getMTFact_Res();

		/**
		 * The meta object literal for the '{@link generator.impl.MTResultFactImpl <em>MT Result Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTResultFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTResultFact()
		 * @generated
		 */
		EClass MT_RESULT_FACT = eINSTANCE.getMTResultFact();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RESULT_FACT__TABLE = eINSTANCE.getMTResultFact_Table();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RESULT_FACT__RES = eINSTANCE.getMTResultFact_Res();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionableFactImpl <em>Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionableFact()
		 * @generated
		 */
		EClass QUESTIONABLE_FACT = eINSTANCE.getQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Achieved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT__ACHIEVED = eINSTANCE.getQuestionableFact_Achieved();

		/**
		 * The meta object literal for the '<em><b>Was Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT__WAS_SELECTED = eINSTANCE.getQuestionableFact_WasSelected();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT__ID = eINSTANCE.getQuestionableFact_ID();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONABLE_FACT__RESULTS = eINSTANCE.getQuestionableFact_Results();

		/**
		 * The meta object literal for the '<em><b>Get Questionable Fact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT = eINSTANCE.getQuestionableFact__GetQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Get Complete Fact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTIONABLE_FACT___GET_COMPLETE_FACT = eINSTANCE.getQuestionableFact__GetCompleteFact();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQFCompletion1Impl <em>MTQF Completion1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQFCompletion1Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion1()
		 * @generated
		 */
		EClass MTQF_COMPLETION1 = eINSTANCE.getMTQFCompletion1();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__LEFT_OPERAND = eINSTANCE.getMTQFCompletion1_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__RIGHT_OPERAND = eINSTANCE.getMTQFCompletion1_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__RESULT = eINSTANCE.getMTQFCompletion1_Result();

		/**
		 * The meta object literal for the '<em><b>Soluce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__SOLUCE = eINSTANCE.getMTQFCompletion1_Soluce();

		/**
		 * The meta object literal for the '<em><b>Result On Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__RESULT_ON_RIGHT = eINSTANCE.getMTQFCompletion1_ResultOnRight();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQFCompletion2Impl <em>MTQF Completion2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQFCompletion2Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion2()
		 * @generated
		 */
		EClass MTQF_COMPLETION2 = eINSTANCE.getMTQFCompletion2();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__LEFT_OPERAND = eINSTANCE.getMTQFCompletion2_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__RIGHT_OPERAND = eINSTANCE.getMTQFCompletion2_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__RESULT = eINSTANCE.getMTQFCompletion2_Result();

		/**
		 * The meta object literal for the '<em><b>Soluce Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__SOLUCE_LEFT = eINSTANCE.getMTQFCompletion2_SoluceLeft();

		/**
		 * The meta object literal for the '<em><b>Soluce Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__SOLUCE_RIGHT = eINSTANCE.getMTQFCompletion2_SoluceRight();

		/**
		 * The meta object literal for the '<em><b>Soluce Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__SOLUCE_RES = eINSTANCE.getMTQFCompletion2_SoluceRes();

		/**
		 * The meta object literal for the '<em><b>Result On Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__RESULT_ON_RIGHT = eINSTANCE.getMTQFCompletion2_ResultOnRight();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQFRebuildImpl <em>MTQF Rebuild</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQFRebuildImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQFRebuild()
		 * @generated
		 */
		EClass MTQF_REBUILD = eINSTANCE.getMTQFRebuild();

		/**
		 * The meta object literal for the '<em><b>Soluce Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_REBUILD__SOLUCE_LEFT = eINSTANCE.getMTQFRebuild_SoluceLeft();

		/**
		 * The meta object literal for the '<em><b>Soluce Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_REBUILD__SOLUCE_RES = eINSTANCE.getMTQFRebuild_SoluceRes();

		/**
		 * The meta object literal for the '<em><b>Result On Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_REBUILD__RESULT_ON_RIGHT = eINSTANCE.getMTQFRebuild_ResultOnRight();

		/**
		 * The meta object literal for the '<em><b>Soluce Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_REBUILD__SOLUCE_RIGHT = eINSTANCE.getMTQFRebuild_SoluceRight();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQFIdentificationImpl <em>MTQF Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQFIdentificationImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQFIdentification()
		 * @generated
		 */
		EClass MTQF_IDENTIFICATION = eINSTANCE.getMTQFIdentification();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__RESULT = eINSTANCE.getMTQFIdentification_Result();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__RIGHT_OPERAND = eINSTANCE.getMTQFIdentification_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__LEFT_OPERAND = eINSTANCE.getMTQFIdentification_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Soluce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__SOLUCE = eINSTANCE.getMTQFIdentification_Soluce();

		/**
		 * The meta object literal for the '<em><b>Result On Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__RESULT_ON_RIGHT = eINSTANCE.getMTQFIdentification_ResultOnRight();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_IDENTIFICATION__BUILD = eINSTANCE.getMTQFIdentification_Build();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQFMembershipImpl <em>MTQF Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQFMembershipImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQFMembership()
		 * @generated
		 */
		EClass MTQF_MEMBERSHIP = eINSTANCE.getMTQFMembership();

		/**
		 * The meta object literal for the '<em><b>Good Results</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_MEMBERSHIP__GOOD_RESULTS = eINSTANCE.getMTQFMembership_GoodResults();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_MEMBERSHIP__TABLE = eINSTANCE.getMTQFMembership_Table();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionedFactImpl <em>Questioned Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionedFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionedFact()
		 * @generated
		 */
		EClass QUESTIONED_FACT = eINSTANCE.getQuestionedFact();

		/**
		 * The meta object literal for the '<em><b>Questionablefact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__QUESTIONABLEFACT = eINSTANCE.getQuestionedFact_Questionablefact();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__QUESTION = eINSTANCE.getQuestionedFact_Question();

		/**
		 * The meta object literal for the '<em><b>Propositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__PROPOSITIONS = eINSTANCE.getQuestionedFact_Propositions();

		/**
		 * The meta object literal for the '<em><b>Entrys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__ENTRYS = eINSTANCE.getQuestionedFact_Entrys();

		/**
		 * The meta object literal for the '<em><b>Correctness To Reach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__CORRECTNESS_TO_REACH = eINSTANCE.getQuestionedFact_CorrectnessToReach();

		/**
		 * The meta object literal for the '<em><b>Learner Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONED_FACT__LEARNER_VALIDATION = eINSTANCE.getQuestionedFact_LearnerValidation();

		/**
		 * The meta object literal for the '<em><b>Complete Fact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONED_FACT__COMPLETE_FACT = eINSTANCE.getQuestionedFact_CompleteFact();

		/**
		 * The meta object literal for the '<em><b>Fact Correctness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__FACT_CORRECTNESS = eINSTANCE.getQuestionedFact_FactCorrectness();

		/**
		 * The meta object literal for the '{@link generator.impl.CompletionCriteriaImpl <em>Completion Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CompletionCriteriaImpl
		 * @see generator.impl.GeneratorPackageImpl#getCompletionCriteria()
		 * @generated
		 */
		EClass COMPLETION_CRITERIA = eINSTANCE.getCompletionCriteria();

		/**
		 * The meta object literal for the '<em><b>Succes Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_CRITERIA__SUCCES_PERCENT = eINSTANCE.getCompletionCriteria_SuccesPercent();

		/**
		 * The meta object literal for the '<em><b>Encounters Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_CRITERIA__ENCOUNTERS_PERCENT = eINSTANCE.getCompletionCriteria_EncountersPercent();

		/**
		 * The meta object literal for the '{@link generator.impl.LevelsDifficultyProgressImpl <em>Levels Difficulty Progress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LevelsDifficultyProgressImpl
		 * @see generator.impl.GeneratorPackageImpl#getLevelsDifficultyProgress()
		 * @generated
		 */
		EClass LEVELS_DIFFICULTY_PROGRESS = eINSTANCE.getLevelsDifficultyProgress();

		/**
		 * The meta object literal for the '<em><b>Nb QRoom Increase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE = eINSTANCE
				.getLevelsDifficultyProgress_NbQRoomIncrease();

		/**
		 * The meta object literal for the '<em><b>Nb NQ Room Increase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE = eINSTANCE
				.getLevelsDifficultyProgress_NbNQRoomIncrease();

		/**
		 * The meta object literal for the '<em><b>Init Nb QRoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM = eINSTANCE.getLevelsDifficultyProgress_InitNbQRoom();

		/**
		 * The meta object literal for the '<em><b>Init Nb NQ Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM = eINSTANCE.getLevelsDifficultyProgress_InitNbNQRoom();

		/**
		 * The meta object literal for the '{@link generator.impl.CurrentGameLevelImpl <em>Current Game Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CurrentGameLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurrentGameLevel()
		 * @generated
		 */
		EClass CURRENT_GAME_LEVEL = eINSTANCE.getCurrentGameLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_GAME_LEVEL__LEVEL = eINSTANCE.getCurrentGameLevel_Level();

		/**
		 * The meta object literal for the '{@link generator.impl.GameElementTypesImpl <em>Game Element Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameElementTypesImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameElementTypes()
		 * @generated
		 */
		EClass GAME_ELEMENT_TYPES = eINSTANCE.getGameElementTypes();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ELEMENT_TYPES__EQUIPMENTS = eINSTANCE.getGameElementTypes_Equipments();

		/**
		 * The meta object literal for the '<em><b>Element Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ELEMENT_TYPES__ELEMENT_TYPES = eINSTANCE.getGameElementTypes_ElementTypes();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementsTypesImpl <em>Elements Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementsTypesImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementsTypes()
		 * @generated
		 */
		EClass ELEMENTS_TYPES = eINSTANCE.getElementsTypes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS_TYPES__ELEMENTS = eINSTANCE.getElementsTypes_Elements();

		/**
		 * The meta object literal for the '{@link generator.impl.EquipmentsImpl <em>Equipments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.EquipmentsImpl
		 * @see generator.impl.GeneratorPackageImpl#getEquipments()
		 * @generated
		 */
		EClass EQUIPMENTS = eINSTANCE.getEquipments();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENTS__EQUIPMENTS = eINSTANCE.getEquipments_Equipments();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__SIZE = eINSTANCE.getElementType_Size();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__ID = eINSTANCE.getElementType_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__TYPE = eINSTANCE.getElementType_Type();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__ABILITY = eINSTANCE.getElementType_Ability();

		/**
		 * The meta object literal for the '<em><b>Nb Displays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NB_DISPLAYS = eINSTANCE.getElementType_NbDisplays();

		/**
		 * The meta object literal for the '<em><b>Is Displayable Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT = eINSTANCE.getElementType__IsDisplayableElement();

		/**
		 * The meta object literal for the '{@link generator.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.EquipmentImpl
		 * @see generator.impl.GeneratorPackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__ID = eINSTANCE.getEquipment_ID();

		/**
		 * The meta object literal for the '<em><b>Bought</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__BOUGHT = eINSTANCE.getEquipment_Bought();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__ACTIVATED = eINSTANCE.getEquipment_Activated();

		/**
		 * The meta object literal for the '{@link generator.impl.GameplayImpl <em>Gameplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameplayImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameplay()
		 * @generated
		 */
		EClass GAMEPLAY = eINSTANCE.getGameplay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__NAME = eINSTANCE.getGameplay_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__COMPONENTS = eINSTANCE.getGameplay_Components();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__PROMPT = eINSTANCE.getGameplay_Prompt();

		/**
		 * The meta object literal for the '<em><b>Undoable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__UNDOABLE = eINSTANCE.getGameplay_Undoable();

		/**
		 * The meta object literal for the '{@link generator.impl.GameplaysImpl <em>Gameplays</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameplaysImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameplays()
		 * @generated
		 */
		EClass GAMEPLAYS = eINSTANCE.getGameplays();

		/**
		 * The meta object literal for the '<em><b>Gameplays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAYS__GAMEPLAYS = eINSTANCE.getGameplays_Gameplays();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionableFactResultImpl <em>Questionable Fact Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionableFactResultImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionableFactResult()
		 * @generated
		 */
		EClass QUESTIONABLE_FACT_RESULT = eINSTANCE.getQuestionableFactResult();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT_RESULT__RESPONSE_TIME = eINSTANCE.getQuestionableFactResult_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Answer Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT_RESULT__ANSWER_VALID = eINSTANCE.getQuestionableFactResult_AnswerValid();

		/**
		 * The meta object literal for the '<em><b>Given Answers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS = eINSTANCE.getQuestionableFactResult_GivenAnswers();

		/**
		 * The meta object literal for the '{@link generator.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AbilityImpl
		 * @see generator.impl.GeneratorPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__NAME = eINSTANCE.getAbility_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.AbilitiesImpl <em>Abilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AbilitiesImpl
		 * @see generator.impl.GeneratorPackageImpl#getAbilities()
		 * @generated
		 */
		EClass ABILITIES = eINSTANCE.getAbilities();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITIES__ABILITIES = eINSTANCE.getAbilities_Abilities();

		/**
		 * The meta object literal for the '{@link generator.impl.PositionedElementImpl <em>Positioned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PositionedElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getPositionedElement()
		 * @generated
		 */
		EClass POSITIONED_ELEMENT = eINSTANCE.getPositionedElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__ID = eINSTANCE.getPositionedElement_ID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__POSITION = eINSTANCE.getPositionedElement_Position();

		/**
		 * The meta object literal for the '<em><b>Correctness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__CORRECTNESS = eINSTANCE.getPositionedElement_Correctness();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__DISPLAYS = eINSTANCE.getPositionedElement_Displays();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__ELEMENT_TYPE = eINSTANCE.getPositionedElement_ElementType();

		/**
		 * The meta object literal for the '<em><b>Expected Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__EXPECTED_ANSWER = eINSTANCE.getPositionedElement_ExpectedAnswer();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__FACT = eINSTANCE.getPositionedElement_Fact();

		/**
		 * The meta object literal for the '<em><b>Accepted Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__ACCEPTED_FACTS = eINSTANCE.getPositionedElement_AcceptedFacts();

		/**
		 * The meta object literal for the '{@link generator.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ParameterImpl
		 * @see generator.impl.GeneratorPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionParamImpl <em>Question Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionParam()
		 * @generated
		 */
		EClass QUESTION_PARAM = eINSTANCE.getQuestionParam();

		/**
		 * The meta object literal for the '<em><b>Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PARAM__INTERACTIVE = eINSTANCE.getQuestionParam_Interactive();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_PARAM__SOLUTIONS = eINSTANCE.getQuestionParam_Solutions();

		/**
		 * The meta object literal for the '{@link generator.impl.PropositionParamImpl <em>Proposition Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PropositionParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getPropositionParam()
		 * @generated
		 */
		EClass PROPOSITION_PARAM = eINSTANCE.getPropositionParam();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION_PARAM__STATE = eINSTANCE.getPropositionParam_State();

		/**
		 * The meta object literal for the '{@link generator.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ValueImpl
		 * @see generator.impl.GeneratorPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link generator.impl.CorrectnessImpl <em>Correctness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CorrectnessImpl
		 * @see generator.impl.GeneratorPackageImpl#getCorrectness()
		 * @generated
		 */
		EClass CORRECTNESS = eINSTANCE.getCorrectness();

		/**
		 * The meta object literal for the '{@link generator.impl.EntrySoluceParamImpl <em>Entry Soluce Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.EntrySoluceParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getEntrySoluceParam()
		 * @generated
		 */
		EClass ENTRY_SOLUCE_PARAM = eINSTANCE.getEntrySoluceParam();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_SOLUCE_PARAM__STATE = eINSTANCE.getEntrySoluceParam_State();

		/**
		 * The meta object literal for the '{@link generator.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DisplayImpl
		 * @see generator.impl.GeneratorPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__INTERACTIVE = eINSTANCE.getDisplay_Interactive();

		/**
		 * The meta object literal for the '<em><b>Correctness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__CORRECTNESS = eINSTANCE.getDisplay_Correctness();

		/**
		 * The meta object literal for the '{@link generator.impl.AComponentImpl <em>AComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AComponentImpl
		 * @see generator.impl.GeneratorPackageImpl#getAComponent()
		 * @generated
		 */
		EClass ACOMPONENT = eINSTANCE.getAComponent();

		/**
		 * The meta object literal for the '<em><b>Allowed Ability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPONENT__ALLOWED_ABILITY = eINSTANCE.getAComponent_AllowedAbility();

		/**
		 * The meta object literal for the '<em><b>Expected Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPONENT__EXPECTED_SIZE = eINSTANCE.getAComponent_ExpectedSize();

		/**
		 * The meta object literal for the '{@link generator.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.StructureImpl
		 * @see generator.impl.GeneratorPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__COMPONENTS = eINSTANCE.getStructure_Components();

		/**
		 * The meta object literal for the '<em><b>Per Fact Or Propositions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__PER_FACT_OR_PROPOSITIONS = eINSTANCE.getStructure_PerFactOrPropositions();

		/**
		 * The meta object literal for the '{@link generator.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ComponentImpl
		 * @see generator.impl.GeneratorPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DISPLAY_VALUE = eINSTANCE.getComponent_DisplayValue();

		/**
		 * The meta object literal for the '<em><b>Wear Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__WEAR_CHOICES = eINSTANCE.getComponent_WearChoices();

		/**
		 * The meta object literal for the '<em><b>Default Correctness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DEFAULT_CORRECTNESS = eINSTANCE.getComponent_DefaultCorrectness();

		/**
		 * The meta object literal for the '<em><b>Wear Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__WEAR_STATEMENT = eINSTANCE.getComponent_WearStatement();

		/**
		 * The meta object literal for the '<em><b>Input Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__INPUT_ENTRY = eINSTANCE.getComponent_InputEntry();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__QUANTITY = eINSTANCE.getComponent_Quantity();

		/**
		 * The meta object literal for the '{@link generator.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuantityImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Fact Nb Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__FACT_NB_ANSWERS = eINSTANCE.getQuantity_FactNbAnswers();

		/**
		 * The meta object literal for the '{@link generator.impl.WantedAnswersParamImpl <em>Wanted Answers Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.WantedAnswersParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getWantedAnswersParam()
		 * @generated
		 */
		EClass WANTED_ANSWERS_PARAM = eINSTANCE.getWantedAnswersParam();

		/**
		 * The meta object literal for the '{@link generator.impl.ExpectedAnswerImpl <em>Expected Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ExpectedAnswerImpl
		 * @see generator.impl.GeneratorPackageImpl#getExpectedAnswer()
		 * @generated
		 */
		EClass EXPECTED_ANSWER = eINSTANCE.getExpectedAnswer();

		/**
		 * The meta object literal for the '{@link generator.impl.CorrectnessValueImpl <em>Correctness Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CorrectnessValueImpl
		 * @see generator.impl.GeneratorPackageImpl#getCorrectnessValue()
		 * @generated
		 */
		EClass CORRECTNESS_VALUE = eINSTANCE.getCorrectnessValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRECTNESS_VALUE__VALUE = eINSTANCE.getCorrectnessValue_Value();

		/**
		 * The meta object literal for the '{@link generator.impl.AValueImpl <em>AValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AValueImpl
		 * @see generator.impl.GeneratorPackageImpl#getAValue()
		 * @generated
		 */
		EClass AVALUE = eINSTANCE.getAValue();

		/**
		 * The meta object literal for the '{@link generator.impl.PositionedStructureElementImpl <em>Positioned Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PositionedStructureElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getPositionedStructureElement()
		 * @generated
		 */
		EClass POSITIONED_STRUCTURE_ELEMENT = eINSTANCE.getPositionedStructureElement();

		/**
		 * The meta object literal for the '<em><b>Created Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION = eINSTANCE
				.getPositionedStructureElement_CreatedPosition();

		/**
		 * The meta object literal for the '{@link generator.impl.FactSolutionParamImpl <em>Fact Solution Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.FactSolutionParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getFactSolutionParam()
		 * @generated
		 */
		EClass FACT_SOLUTION_PARAM = eINSTANCE.getFactSolutionParam();

		/**
		 * The meta object literal for the '{@link generator.impl.OrderingTaskImpl <em>Ordering Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.OrderingTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getOrderingTask()
		 * @generated
		 */
		EClass ORDERING_TASK = eINSTANCE.getOrderingTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERING_TASK__TYPE = eINSTANCE.getOrderingTask_Type();

		/**
		 * The meta object literal for the '<em><b>Check Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERING_TASK__CHECK_LEARNER_ACTION = eINSTANCE.getOrderingTask_CheckLearnerAction();

		/**
		 * The meta object literal for the '{@link generator.impl.PromptImpl <em>Prompt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PromptImpl
		 * @see generator.impl.GeneratorPackageImpl#getPrompt()
		 * @generated
		 */
		EClass PROMPT = eINSTANCE.getPrompt();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT__PROMPT = eINSTANCE.getPrompt_Prompt();

		/**
		 * The meta object literal for the '{@link generator.impl.FactCorrectnessParamImpl <em>Fact Correctness Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.FactCorrectnessParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getFactCorrectnessParam()
		 * @generated
		 */
		EClass FACT_CORRECTNESS_PARAM = eINSTANCE.getFactCorrectnessParam();

		/**
		 * The meta object literal for the '{@link generator.impl.GameplayTaskRelationsImpl <em>Gameplay Task Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameplayTaskRelationsImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameplayTaskRelations()
		 * @generated
		 */
		EClass GAMEPLAY_TASK_RELATIONS = eINSTANCE.getGameplayTaskRelations();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY_TASK_RELATIONS__RELATIONS = eINSTANCE.getGameplayTaskRelations_Relations();

		/**
		 * The meta object literal for the '{@link generator.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RelationImpl
		 * @see generator.impl.GeneratorPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TASK = eINSTANCE.getRelation_Task();

		/**
		 * The meta object literal for the '<em><b>Gameplay</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__GAMEPLAY = eINSTANCE.getRelation_Gameplay();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CONDITION = eINSTANCE.getRelation_Condition();

		/**
		 * The meta object literal for the '{@link generator.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ConditionImpl
		 * @see generator.impl.GeneratorPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Statement Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__STATEMENT_TYPES = eINSTANCE.getCondition_StatementTypes();

		/**
		 * The meta object literal for the '<em><b>Nb Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NB_FACTS = eINSTANCE.getCondition_NbFacts();

		/**
		 * The meta object literal for the '<em><b>Nb Expected Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NB_EXPECTED_ANSWERS = eINSTANCE.getCondition_NbExpectedAnswers();

		/**
		 * The meta object literal for the '<em><b>Answer Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ANSWER_MODALITY = eINSTANCE.getCondition_AnswerModality();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionGameplayImpl <em>Question Gameplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionGameplayImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionGameplay()
		 * @generated
		 */
		EClass QUESTION_GAMEPLAY = eINSTANCE.getQuestionGameplay();

		/**
		 * The meta object literal for the '<em><b>Manual Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GAMEPLAY__MANUAL_VALIDATION = eINSTANCE.getQuestionGameplay_ManualValidation();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GAMEPLAY__CATEGORY = eINSTANCE.getQuestionGameplay_Category();

		/**
		 * The meta object literal for the '<em><b>Has Integrated Propositions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS = eINSTANCE
				.getQuestionGameplay_HasIntegratedPropositions();

		/**
		 * The meta object literal for the '<em><b>Restricted To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GAMEPLAY__RESTRICTED_TO = eINSTANCE.getQuestionGameplay_RestrictedTo();

		/**
		 * The meta object literal for the '{@link generator.impl.NoQuestionGameplayImpl <em>No Question Gameplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.NoQuestionGameplayImpl
		 * @see generator.impl.GeneratorPackageImpl#getNoQuestionGameplay()
		 * @generated
		 */
		EClass NO_QUESTION_GAMEPLAY = eINSTANCE.getNoQuestionGameplay();

		/**
		 * The meta object literal for the '{@link generator.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.SizeImpl
		 * @see generator.impl.GeneratorPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link generator.impl.StatementElementTypeImpl <em>Statement Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.StatementElementTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getStatementElementType()
		 * @generated
		 */
		EClass STATEMENT_ELEMENT_TYPE = eINSTANCE.getStatementElementType();

		/**
		 * The meta object literal for the '<em><b>For Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE = eINSTANCE.getStatementElementType_ForStructure();

		/**
		 * The meta object literal for the '{@link generator.Directions <em>Directions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.Directions
		 * @see generator.impl.GeneratorPackageImpl#getDirections()
		 * @generated
		 */
		EEnum DIRECTIONS = eINSTANCE.getDirections();

		/**
		 * The meta object literal for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.DungeonMode
		 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
		 * @generated
		 */
		EEnum DUNGEON_MODE = eINSTANCE.getDungeonMode();

		/**
		 * The meta object literal for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.TableBuild
		 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
		 * @generated
		 */
		EEnum TABLE_BUILD = eINSTANCE.getTableBuild();

		/**
		 * The meta object literal for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ResultPosition
		 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
		 * @generated
		 */
		EEnum RESULT_POSITION = eINSTANCE.getResultPosition();

		/**
		 * The meta object literal for the '{@link generator.ESingleTarget <em>ESingle Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ESingleTarget
		 * @see generator.impl.GeneratorPackageImpl#getESingleTarget()
		 * @generated
		 */
		EEnum ESINGLE_TARGET = eINSTANCE.getESingleTarget();

		/**
		 * The meta object literal for the '{@link generator.ETaskType <em>ETask Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ETaskType
		 * @see generator.impl.GeneratorPackageImpl#getETaskType()
		 * @generated
		 */
		EEnum ETASK_TYPE = eINSTANCE.getETaskType();

		/**
		 * The meta object literal for the '{@link generator.EModality <em>EModality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EModality
		 * @see generator.impl.GeneratorPackageImpl#getEModality()
		 * @generated
		 */
		EEnum EMODALITY = eINSTANCE.getEModality();

		/**
		 * The meta object literal for the '{@link generator.ESeveralTarget <em>ESeveral Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ESeveralTarget
		 * @see generator.impl.GeneratorPackageImpl#getESeveralTarget()
		 * @generated
		 */
		EEnum ESEVERAL_TARGET = eINSTANCE.getESeveralTarget();

		/**
		 * The meta object literal for the '{@link generator.ElementSize <em>Element Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ElementSize
		 * @see generator.impl.GeneratorPackageImpl#getElementSize()
		 * @generated
		 */
		EEnum ELEMENT_SIZE = eINSTANCE.getElementSize();

		/**
		 * The meta object literal for the '{@link generator.GPCategory <em>GP Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.GPCategory
		 * @see generator.impl.GeneratorPackageImpl#getGPCategory()
		 * @generated
		 */
		EEnum GP_CATEGORY = eINSTANCE.getGPCategory();

		/**
		 * The meta object literal for the '{@link generator.ECorrectness <em>ECorrectness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ECorrectness
		 * @see generator.impl.GeneratorPackageImpl#getECorrectness()
		 * @generated
		 */
		EEnum ECORRECTNESS = eINSTANCE.getECorrectness();

		/**
		 * The meta object literal for the '{@link generator.EBoundary <em>EBoundary</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EBoundary
		 * @see generator.impl.GeneratorPackageImpl#getEBoundary()
		 * @generated
		 */
		EEnum EBOUNDARY = eINSTANCE.getEBoundary();

		/**
		 * The meta object literal for the '{@link generator.EStatementType <em>EStatement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EStatementType
		 * @see generator.impl.GeneratorPackageImpl#getEStatementType()
		 * @generated
		 */
		EEnum ESTATEMENT_TYPE = eINSTANCE.getEStatementType();

	}

} //GeneratorPackage
