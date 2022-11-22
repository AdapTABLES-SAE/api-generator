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
	int SET_OF_FACTS__FACTS = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS__NAME = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Of Facts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Of Facts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.FactImpl
	 * @see generator.impl.GeneratorPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__DESCRIPTION = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.KnowledgeImpl
	 * @see generator.impl.GeneratorPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 3;

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
	int DUNGEON = 4;

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
	 * The number of structural features of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_FEATURE_COUNT = 5;

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
	int ROOM = 5;

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
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__QUESTION = 4;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 5;

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
	int GAME_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Gameplays</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__GAMEPLAYS = 1;

	/**
	 * The feature id for the '<em><b>Elementtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ELEMENTTYPES = 2;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Roomtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__ROOMTYPES = 4;

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
	int ROOM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__POSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 2;

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
	int SMALL_ROOM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__POSITIONS = ROOM_TYPE__POSITIONS;

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
	int LARGE_ROOM_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__POSITIONS = ROOM_TYPE__POSITIONS;

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
	int ROOM_ACCESS = 10;

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
	int GAME_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT__NUMBER_OF_ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT__MODE = 1;

	/**
	 * The number of structural features of the '<em>Game Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 12;

	/**
	 * The feature id for the '<em><b>Tasktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASKTYPE = 0;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERCENTAGE_OF_APPARITION = 1;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NB_CONSECUTIVE_SUCCESS = 2;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERCENTAGE_OF_VALID_FACTS = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearningDomainImpl <em>Learning Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningDomainImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningDomain()
	 * @generated
	 */
	int LEARNING_DOMAIN = 13;

	/**
	 * The feature id for the '<em><b>Learningpaths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN__LEARNINGPATHS = 0;

	/**
	 * The feature id for the '<em><b>Tasktypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN__TASKTYPES = 1;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN__RESPONSEMODALITIES = 2;

	/**
	 * The number of structural features of the '<em>Learning Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DOMAIN_FEATURE_COUNT = 3;

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
	int LEARNING_PATH = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__LEARNINGOBJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__KNOWLEDGE = 2;

	/**
	 * The number of structural features of the '<em>Learning Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Learning Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningObjectiveImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningObjective()
	 * @generated
	 */
	int LEARNING_OBJECTIVE = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__PREREQUISITES = 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__LEVELS = 3;

	/**
	 * The feature id for the '<em><b>Setoffacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__SETOFFACTS = 4;

	/**
	 * The number of structural features of the '<em>Learning Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Learning Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PrerequisiteImpl
	 * @see generator.impl.GeneratorPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 16;

	/**
	 * The feature id for the '<em><b>Succes Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__SUCCES_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Required Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__REQUIRED_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_FEATURE_COUNT = 2;

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
	int LEVEL = 17;

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
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 2;

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
	int MT_LEVEL = 18;

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
	 * The meta object id for the '{@link generator.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TaskTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESPONSEMODALITIES = 1;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CompletionTypeImpl <em>Completion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CompletionTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletionType()
	 * @generated
	 */
	int COMPLETION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE__NAME = TASK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE__RESPONSEMODALITIES = TASK_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE__NB_MISSING_ELEMENTS = TASK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE__FACT_ORDER = TASK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Natural Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE__NATURAL_LANGUAGE = TASK_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Completion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Completion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TYPE_OPERATION_COUNT = TASK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTCompletionTypeImpl <em>MT Completion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTCompletionTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTCompletionType()
	 * @generated
	 */
	int MT_COMPLETION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__NAME = COMPLETION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__RESPONSEMODALITIES = COMPLETION_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__NB_MISSING_ELEMENTS = COMPLETION_TYPE__NB_MISSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Fact Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__FACT_ORDER = COMPLETION_TYPE__FACT_ORDER;

	/**
	 * The feature id for the '<em><b>Natural Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__NATURAL_LANGUAGE = COMPLETION_TYPE__NATURAL_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE__TARGETS = COMPLETION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Completion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE_FEATURE_COUNT = COMPLETION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MT Completion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION_TYPE_OPERATION_COUNT = COMPLETION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.TaskTypesImpl <em>Task Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TaskTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getTaskTypes()
	 * @generated
	 */
	int TASK_TYPES = 20;

	/**
	 * The feature id for the '<em><b>Tasktypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES__TASKTYPES = 0;

	/**
	 * The number of structural features of the '<em>Task Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.VerificationTypeImpl <em>Verification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.VerificationTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getVerificationType()
	 * @generated
	 */
	int VERIFICATION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_TYPE__NAME = TASK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_TYPE__RESPONSEMODALITIES = TASK_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Verify True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_TYPE__VERIFY_TRUE = TASK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_TYPE_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_TYPE_OPERATION_COUNT = TASK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ReconstructionTypeImpl <em>Reconstruction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ReconstructionTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getReconstructionType()
	 * @generated
	 */
	int RECONSTRUCTION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TYPE__NAME = TASK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TYPE__RESPONSEMODALITIES = TASK_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Nb False Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION = TASK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconstruction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TYPE_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reconstruction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TYPE_OPERATION_COUNT = TASK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.FactVerificationTypeImpl <em>Fact Verification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.FactVerificationTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getFactVerificationType()
	 * @generated
	 */
	int FACT_VERIFICATION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VERIFICATION_TYPE__NAME = VERIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VERIFICATION_TYPE__RESPONSEMODALITIES = VERIFICATION_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Verify True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VERIFICATION_TYPE__VERIFY_TRUE = VERIFICATION_TYPE__VERIFY_TRUE;

	/**
	 * The number of structural features of the '<em>Fact Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VERIFICATION_TYPE_FEATURE_COUNT = VERIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VERIFICATION_TYPE_OPERATION_COUNT = VERIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ResultVerificationTypeImpl <em>Result Verification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResultVerificationTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getResultVerificationType()
	 * @generated
	 */
	int RESULT_VERIFICATION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE__NAME = VERIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE__RESPONSEMODALITIES = VERIFICATION_TYPE__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Verify True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE__VERIFY_TRUE = VERIFICATION_TYPE__VERIFY_TRUE;

	/**
	 * The feature id for the '<em><b>Nb False Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE__NB_FALSE_PROPOSITION = VERIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE_FEATURE_COUNT = VERIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Verification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_TYPE_OPERATION_COUNT = VERIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GenerationContextImpl <em>Generation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GenerationContextImpl
	 * @see generator.impl.GeneratorPackageImpl#getGenerationContext()
	 * @generated
	 */
	int GENERATION_CONTEXT = 27;

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
	int LEARNER_PLAYER = 28;

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
	 * The number of structural features of the '<em>Learner Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER_FEATURE_COUNT = 3;

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
	int PROGRESSION = 29;

	/**
	 * The feature id for the '<em><b>Currentobjectivelevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION__CURRENTOBJECTIVELEVELS = 0;

	/**
	 * The number of structural features of the '<em>Progression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION_FEATURE_COUNT = 1;

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
	int CURRENT_OBJECTIVE_LEVEL = 30;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE = 0;

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
	 * The number of structural features of the '<em>Current Objective Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL_FEATURE_COUNT = 3;

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
	int POSITION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 32;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Incomplete Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INCOMPLETE_FACT = 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResponseModalityImpl
	 * @see generator.impl.GeneratorPackageImpl#getResponseModality()
	 * @generated
	 */
	int RESPONSE_MODALITY = 33;

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
	int MULTIPLE_CHOICE = 34;

	/**
	 * The feature id for the '<em><b>Nb Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NB_CHOICES = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 1;

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
	int ENTER_RESPONSE = 35;

	/**
	 * The number of structural features of the '<em>Enter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_RESPONSE_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_RESPONSE_OPERATION_COUNT = RESPONSE_MODALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.InteractionETypeImpl <em>Interaction EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.InteractionETypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getInteractionEType()
	 * @generated
	 */
	int INTERACTION_ETYPE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ETYPE__NAME = ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ETYPE__ABILITIES = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ETYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_ETYPE_OPERATION_COUNT = ELEMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 38;

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
	 * The meta object id for the '{@link generator.impl.ActiveAbilityImpl <em>Active Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ActiveAbilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getActiveAbility()
	 * @generated
	 */
	int ACTIVE_ABILITY = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_ABILITY__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_ABILITY__ABILITY = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_ABILITY_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_ABILITY_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PassiveAbilityImpl <em>Passive Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PassiveAbilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getPassiveAbility()
	 * @generated
	 */
	int PASSIVE_ABILITY = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_ABILITY__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_ABILITY__ABILITY = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passive Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_ABILITY_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passive Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_ABILITY_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplayImpl <em>Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplay()
	 * @generated
	 */
	int GAMEPLAY = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Gamerules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__GAMERULES = 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__REQUIREMENT = 2;

	/**
	 * The number of structural features of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY___IS_AVAILABLE = 0;

	/**
	 * The number of operations of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.GameRuleImpl <em>Game Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameRuleImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameRule()
	 * @generated
	 */
	int GAME_RULE = 42;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ability2activate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__ABILITY2ACTIVATE = 1;

	/**
	 * The feature id for the '<em><b>Interactionelementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__INTERACTIONELEMENTTYPE = 2;

	/**
	 * The number of structural features of the '<em>Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.BuyableElementImpl <em>Buyable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.BuyableElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getBuyableElement()
	 * @generated
	 */
	int BUYABLE_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT__BOUGHT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT__ACTIVATED = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buyable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Buyable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.AvatarEquipmentImpl <em>Avatar Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AvatarEquipmentImpl
	 * @see generator.impl.GeneratorPackageImpl#getAvatarEquipment()
	 * @generated
	 */
	int AVATAR_EQUIPMENT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT__NAME = BUYABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT__TYPE = BUYABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT__BOUGHT = BUYABLE_ELEMENT__BOUGHT;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT__ACTIVATED = BUYABLE_ELEMENT__ACTIVATED;

	/**
	 * The number of structural features of the '<em>Avatar Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT_FEATURE_COUNT = BUYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avatar Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_EQUIPMENT_OPERATION_COUNT = BUYABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementsImpl
	 * @see generator.impl.GeneratorPackageImpl#getElements()
	 * @generated
	 */
	int ELEMENTS = 46;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplaysImpl <em>Gameplays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplaysImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplays()
	 * @generated
	 */
	int GAMEPLAYS = 47;

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
	 * The meta object id for the '{@link generator.impl.ElementTypesImpl <em>Element Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementTypes()
	 * @generated
	 */
	int ELEMENT_TYPES = 48;

	/**
	 * The feature id for the '<em><b>Elementtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPES__ELEMENTTYPES = 0;

	/**
	 * The number of structural features of the '<em>Element Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.AbilitiesImpl <em>Abilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbilitiesImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbilities()
	 * @generated
	 */
	int ABILITIES = 49;

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
	 * The meta object id for the '{@link generator.impl.RoomTypesImpl <em>Room Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoomTypes()
	 * @generated
	 */
	int ROOM_TYPES = 50;

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
	 * The meta object id for the '{@link generator.impl.EquipmentETypeImpl <em>Equipment EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentETypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipmentEType()
	 * @generated
	 */
	int EQUIPMENT_ETYPE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ETYPE__NAME = ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Equipment EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ETYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equipment EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ETYPE_OPERATION_COUNT = ELEMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementPositionImpl <em>Element Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementPositionImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementPosition()
	 * @generated
	 */
	int ELEMENT_POSITION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__NAME = POSITION__NAME;

	/**
	 * The feature id for the '<em><b>Autorized ETypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__AUTORIZED_ETYPES = POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_FEATURE_COUNT = POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_OPERATION_COUNT = POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MappingModelImpl
	 * @see generator.impl.GeneratorPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 53;

	/**
	 * The feature id for the '<em><b>Compliancerelations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__COMPLIANCERELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ComplianceRelationsImpl <em>Compliance Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ComplianceRelationsImpl
	 * @see generator.impl.GeneratorPackageImpl#getComplianceRelations()
	 * @generated
	 */
	int COMPLIANCE_RELATIONS = 55;

	/**
	 * The number of structural features of the '<em>Compliance Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_RELATIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Compliance Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_RELATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.Modality2RoomTypeImpl <em>Modality2 Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.Modality2RoomTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getModality2RoomType()
	 * @generated
	 */
	int MODALITY2_ROOM_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY2_ROOM_TYPE__RESPONSEMODALITY = COMPLIANCE_RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY2_ROOM_TYPE__ROOMTYPE = COMPLIANCE_RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modality2 Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY2_ROOM_TYPE_FEATURE_COUNT = COMPLIANCE_RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modality2 Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY2_ROOM_TYPE_OPERATION_COUNT = COMPLIANCE_RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.TaskType2GameplayImpl <em>Task Type2 Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TaskType2GameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getTaskType2Gameplay()
	 * @generated
	 */
	int TASK_TYPE2_GAMEPLAY = 56;

	/**
	 * The feature id for the '<em><b>Gameplay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE2_GAMEPLAY__GAMEPLAY = COMPLIANCE_RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE2_GAMEPLAY__TASKTYPE = COMPLIANCE_RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Type2 Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE2_GAMEPLAY_FEATURE_COUNT = COMPLIANCE_RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Type2 Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE2_GAMEPLAY_OPERATION_COUNT = COMPLIANCE_RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ResponseModalitiesImpl <em>Response Modalities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResponseModalitiesImpl
	 * @see generator.impl.GeneratorPackageImpl#getResponseModalities()
	 * @generated
	 */
	int RESPONSE_MODALITIES = 57;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITIES__RESPONSEMODALITIES = 0;

	/**
	 * The number of structural features of the '<em>Response Modalities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Modalities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.Gameplay2RoomTypeImpl <em>Gameplay2 Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.Gameplay2RoomTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplay2RoomType()
	 * @generated
	 */
	int GAMEPLAY2_ROOM_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY2_ROOM_TYPE__ROOMTYPE = COMPLIANCE_RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gameplay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY2_ROOM_TYPE__GAMEPLAY = COMPLIANCE_RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gameplay2 Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY2_ROOM_TYPE_FEATURE_COUNT = COMPLIANCE_RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gameplay2 Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY2_ROOM_TYPE_OPERATION_COUNT = COMPLIANCE_RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.GPBricks <em>GP Bricks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.GPBricks
	 * @see generator.impl.GeneratorPackageImpl#getGPBricks()
	 * @generated
	 */
	int GP_BRICKS = 59;

	/**
	 * The meta object id for the '{@link generator.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Directions
	 * @see generator.impl.GeneratorPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 60;

	/**
	 * The meta object id for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.DungeonMode
	 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
	 * @generated
	 */
	int DUNGEON_MODE = 61;

	/**
	 * The meta object id for the '{@link generator.VerifiableElement <em>Verifiable Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.VerifiableElement
	 * @see generator.impl.GeneratorPackageImpl#getVerifiableElement()
	 * @generated
	 */
	int VERIFIABLE_ELEMENT = 62;

	/**
	 * The meta object id for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TableBuild
	 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 63;

	/**
	 * The meta object id for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ResultPosition
	 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 64;

	/**
	 * The meta object id for the '{@link generator.TargetElement <em>Target Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TargetElement
	 * @see generator.impl.GeneratorPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 65;

	/**
	 * The meta object id for the '{@link generator.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Order
	 * @see generator.impl.GeneratorPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 66;

	/**
	 * The meta object id for the '{@link generator.EPassiveAbility <em>EPassive Ability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EPassiveAbility
	 * @see generator.impl.GeneratorPackageImpl#getEPassiveAbility()
	 * @generated
	 */
	int EPASSIVE_ABILITY = 67;

	/**
	 * The meta object id for the '{@link generator.EActiveAbility <em>EActive Ability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EActiveAbility
	 * @see generator.impl.GeneratorPackageImpl#getEActiveAbility()
	 * @generated
	 */
	int EACTIVE_ABILITY = 68;

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
	 * Returns the meta object for class '{@link generator.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see generator.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.Fact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.Fact#getDescription()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Description();

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
	 * Returns the meta object for the containment reference '{@link generator.Room#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see generator.Room#getQuestion()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Question();

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
	 * Returns the meta object for the containment reference '{@link generator.GameDescription#getElementtypes <em>Elementtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elementtypes</em>'.
	 * @see generator.GameDescription#getElementtypes()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Elementtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameDescription#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see generator.GameDescription#getAbilities()
	 * @see #getGameDescription()
	 * @generated
	 */
	EReference getGameDescription_Abilities();

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
	 * Returns the meta object for the containment reference list '{@link generator.RoomType#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see generator.RoomType#getPositions()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Positions();

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
	 * Returns the meta object for the attribute '{@link generator.GameContext#getNumberOfRooms <em>Number Of Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rooms</em>'.
	 * @see generator.GameContext#getNumberOfRooms()
	 * @see #getGameContext()
	 * @generated
	 */
	EAttribute getGameContext_NumberOfRooms();

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
	 * Returns the meta object for class '{@link generator.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see generator.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link generator.Task#getTasktype <em>Tasktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tasktype</em>'.
	 * @see generator.Task#getTasktype()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Tasktype();

	/**
	 * Returns the meta object for the attribute '{@link generator.Task#getPercentageOfApparition <em>Percentage Of Apparition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Apparition</em>'.
	 * @see generator.Task#getPercentageOfApparition()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PercentageOfApparition();

	/**
	 * Returns the meta object for the attribute '{@link generator.Task#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Consecutive Success</em>'.
	 * @see generator.Task#getNbConsecutiveSuccess()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_NbConsecutiveSuccess();

	/**
	 * Returns the meta object for the attribute '{@link generator.Task#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Valid Facts</em>'.
	 * @see generator.Task#getPercentageOfValidFacts()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PercentageOfValidFacts();

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
	 * Returns the meta object for the containment reference '{@link generator.LearningDomain#getTasktypes <em>Tasktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasktypes</em>'.
	 * @see generator.LearningDomain#getTasktypes()
	 * @see #getLearningDomain()
	 * @generated
	 */
	EReference getLearningDomain_Tasktypes();

	/**
	 * Returns the meta object for the containment reference '{@link generator.LearningDomain#getResponsemodalities <em>Responsemodalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsemodalities</em>'.
	 * @see generator.LearningDomain#getResponsemodalities()
	 * @see #getLearningDomain()
	 * @generated
	 */
	EReference getLearningDomain_Responsemodalities();

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
	 * Returns the meta object for the containment reference list '{@link generator.LearningPath#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningobjective</em>'.
	 * @see generator.LearningPath#getLearningobjective()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Learningobjective();

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
	 * Returns the meta object for class '{@link generator.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Objective</em>'.
	 * @see generator.LearningObjective
	 * @generated
	 */
	EClass getLearningObjective();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearningObjective#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.LearningObjective#getID()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EAttribute getLearningObjective_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearningObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.LearningObjective#getName()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EAttribute getLearningObjective_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearningObjective#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see generator.LearningObjective#getPrerequisites()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Prerequisites();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearningObjective#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see generator.LearningObjective#getLevels()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Levels();

	/**
	 * Returns the meta object for the reference list '{@link generator.LearningObjective#getSetoffacts <em>Setoffacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setoffacts</em>'.
	 * @see generator.LearningObjective#getSetoffacts()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Setoffacts();

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
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getSuccesPercentage <em>Succes Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Succes Percentage</em>'.
	 * @see generator.Prerequisite#getSuccesPercentage()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_SuccesPercentage();

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
	 * Returns the meta object for class '{@link generator.MTCompletionType <em>MT Completion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Completion Type</em>'.
	 * @see generator.MTCompletionType
	 * @generated
	 */
	EClass getMTCompletionType();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTCompletionType#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see generator.MTCompletionType#getTargets()
	 * @see #getMTCompletionType()
	 * @generated
	 */
	EAttribute getMTCompletionType_Targets();

	/**
	 * Returns the meta object for class '{@link generator.TaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Types</em>'.
	 * @see generator.TaskTypes
	 * @generated
	 */
	EClass getTaskTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.TaskTypes#getTasktypes <em>Tasktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasktypes</em>'.
	 * @see generator.TaskTypes#getTasktypes()
	 * @see #getTaskTypes()
	 * @generated
	 */
	EReference getTaskTypes_Tasktypes();

	/**
	 * Returns the meta object for class '{@link generator.CompletionType <em>Completion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Type</em>'.
	 * @see generator.CompletionType
	 * @generated
	 */
	EClass getCompletionType();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionType#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.CompletionType#getNbMissingElements()
	 * @see #getCompletionType()
	 * @generated
	 */
	EAttribute getCompletionType_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionType#getFactOrder <em>Fact Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Order</em>'.
	 * @see generator.CompletionType#getFactOrder()
	 * @see #getCompletionType()
	 * @generated
	 */
	EAttribute getCompletionType_FactOrder();

	/**
	 * Returns the meta object for the attribute '{@link generator.CompletionType#isNaturalLanguage <em>Natural Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Natural Language</em>'.
	 * @see generator.CompletionType#isNaturalLanguage()
	 * @see #getCompletionType()
	 * @generated
	 */
	EAttribute getCompletionType_NaturalLanguage();

	/**
	 * Returns the meta object for class '{@link generator.VerificationType <em>Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Type</em>'.
	 * @see generator.VerificationType
	 * @generated
	 */
	EClass getVerificationType();

	/**
	 * Returns the meta object for the attribute '{@link generator.VerificationType#isVerifyTrue <em>Verify True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify True</em>'.
	 * @see generator.VerificationType#isVerifyTrue()
	 * @see #getVerificationType()
	 * @generated
	 */
	EAttribute getVerificationType_VerifyTrue();

	/**
	 * Returns the meta object for class '{@link generator.ReconstructionType <em>Reconstruction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconstruction Type</em>'.
	 * @see generator.ReconstructionType
	 * @generated
	 */
	EClass getReconstructionType();

	/**
	 * Returns the meta object for the attribute '{@link generator.ReconstructionType#getNbFalseProposition <em>Nb False Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb False Proposition</em>'.
	 * @see generator.ReconstructionType#getNbFalseProposition()
	 * @see #getReconstructionType()
	 * @generated
	 */
	EAttribute getReconstructionType_NbFalseProposition();

	/**
	 * Returns the meta object for class '{@link generator.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see generator.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the attribute '{@link generator.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the reference list '{@link generator.TaskType#getResponsemodalities <em>Responsemodalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsemodalities</em>'.
	 * @see generator.TaskType#getResponsemodalities()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Responsemodalities();

	/**
	 * Returns the meta object for class '{@link generator.FactVerificationType <em>Fact Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Verification Type</em>'.
	 * @see generator.FactVerificationType
	 * @generated
	 */
	EClass getFactVerificationType();

	/**
	 * Returns the meta object for class '{@link generator.ResultVerificationType <em>Result Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Verification Type</em>'.
	 * @see generator.ResultVerificationType
	 * @generated
	 */
	EClass getResultVerificationType();

	/**
	 * Returns the meta object for the attribute '{@link generator.ResultVerificationType#getNbFalseProposition <em>Nb False Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb False Proposition</em>'.
	 * @see generator.ResultVerificationType#getNbFalseProposition()
	 * @see #getResultVerificationType()
	 * @generated
	 */
	EAttribute getResultVerificationType_NbFalseProposition();

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
	 * Returns the meta object for class '{@link generator.CurrentObjectiveLevel <em>Current Objective Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Objective Level</em>'.
	 * @see generator.CurrentObjectiveLevel
	 * @generated
	 */
	EClass getCurrentObjectiveLevel();

	/**
	 * Returns the meta object for the reference '{@link generator.CurrentObjectiveLevel#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningobjective</em>'.
	 * @see generator.CurrentObjectiveLevel#getLearningobjective()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EReference getCurrentObjectiveLevel_Learningobjective();

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
	 * Returns the meta object for class '{@link generator.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see generator.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link generator.Position#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Position#getName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Name();

	/**
	 * Returns the meta object for class '{@link generator.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see generator.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the reference '{@link generator.Question#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.Question#getPosition()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Position();

	/**
	 * Returns the meta object for the attribute '{@link generator.Question#getIncompleteFact <em>Incomplete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incomplete Fact</em>'.
	 * @see generator.Question#getIncompleteFact()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IncompleteFact();

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
	 * Returns the meta object for class '{@link generator.EnterResponse <em>Enter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enter Response</em>'.
	 * @see generator.EnterResponse
	 * @generated
	 */
	EClass getEnterResponse();

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
	 * Returns the meta object for the attribute '{@link generator.ElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.ElementType#getName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Name();

	/**
	 * Returns the meta object for class '{@link generator.InteractionEType <em>Interaction EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction EType</em>'.
	 * @see generator.InteractionEType
	 * @generated
	 */
	EClass getInteractionEType();

	/**
	 * Returns the meta object for the reference list '{@link generator.InteractionEType#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abilities</em>'.
	 * @see generator.InteractionEType#getAbilities()
	 * @see #getInteractionEType()
	 * @generated
	 */
	EReference getInteractionEType_Abilities();

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
	 * Returns the meta object for class '{@link generator.ActiveAbility <em>Active Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Ability</em>'.
	 * @see generator.ActiveAbility
	 * @generated
	 */
	EClass getActiveAbility();

	/**
	 * Returns the meta object for the attribute '{@link generator.ActiveAbility#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see generator.ActiveAbility#getAbility()
	 * @see #getActiveAbility()
	 * @generated
	 */
	EAttribute getActiveAbility_Ability();

	/**
	 * Returns the meta object for class '{@link generator.PassiveAbility <em>Passive Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Ability</em>'.
	 * @see generator.PassiveAbility
	 * @generated
	 */
	EClass getPassiveAbility();

	/**
	 * Returns the meta object for the attribute '{@link generator.PassiveAbility#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see generator.PassiveAbility#getAbility()
	 * @see #getPassiveAbility()
	 * @generated
	 */
	EAttribute getPassiveAbility_Ability();

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
	 * Returns the meta object for the attribute '{@link generator.Gameplay#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.Gameplay#getDescription()
	 * @see #getGameplay()
	 * @generated
	 */
	EAttribute getGameplay_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Gameplay#getGamerules <em>Gamerules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamerules</em>'.
	 * @see generator.Gameplay#getGamerules()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_Gamerules();

	/**
	 * Returns the meta object for the reference '{@link generator.Gameplay#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see generator.Gameplay#getRequirement()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_Requirement();

	/**
	 * Returns the meta object for the '{@link generator.Gameplay#isAvailable() <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Available</em>' operation.
	 * @see generator.Gameplay#isAvailable()
	 * @generated
	 */
	EOperation getGameplay__IsAvailable();

	/**
	 * Returns the meta object for class '{@link generator.GameRule <em>Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Rule</em>'.
	 * @see generator.GameRule
	 * @generated
	 */
	EClass getGameRule();

	/**
	 * Returns the meta object for the attribute '{@link generator.GameRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.GameRule#getType()
	 * @see #getGameRule()
	 * @generated
	 */
	EAttribute getGameRule_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.GameRule#getAbility2activate <em>Ability2activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability2activate</em>'.
	 * @see generator.GameRule#getAbility2activate()
	 * @see #getGameRule()
	 * @generated
	 */
	EAttribute getGameRule_Ability2activate();

	/**
	 * Returns the meta object for the reference '{@link generator.GameRule#getInteractionelementtype <em>Interactionelementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interactionelementtype</em>'.
	 * @see generator.GameRule#getInteractionelementtype()
	 * @see #getGameRule()
	 * @generated
	 */
	EReference getGameRule_Interactionelementtype();

	/**
	 * Returns the meta object for class '{@link generator.BuyableElement <em>Buyable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buyable Element</em>'.
	 * @see generator.BuyableElement
	 * @generated
	 */
	EClass getBuyableElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.BuyableElement#isBought <em>Bought</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bought</em>'.
	 * @see generator.BuyableElement#isBought()
	 * @see #getBuyableElement()
	 * @generated
	 */
	EAttribute getBuyableElement_Bought();

	/**
	 * Returns the meta object for the attribute '{@link generator.BuyableElement#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see generator.BuyableElement#isActivated()
	 * @see #getBuyableElement()
	 * @generated
	 */
	EAttribute getBuyableElement_Activated();

	/**
	 * Returns the meta object for class '{@link generator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see generator.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference '{@link generator.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see generator.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Type();

	/**
	 * Returns the meta object for class '{@link generator.AvatarEquipment <em>Avatar Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avatar Equipment</em>'.
	 * @see generator.AvatarEquipment
	 * @generated
	 */
	EClass getAvatarEquipment();

	/**
	 * Returns the meta object for class '{@link generator.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see generator.Elements
	 * @generated
	 */
	EClass getElements();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Elements#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see generator.Elements#getElements()
	 * @see #getElements()
	 * @generated
	 */
	EReference getElements_Elements();

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
	 * Returns the meta object for class '{@link generator.ElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Types</em>'.
	 * @see generator.ElementTypes
	 * @generated
	 */
	EClass getElementTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.ElementTypes#getElementtypes <em>Elementtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementtypes</em>'.
	 * @see generator.ElementTypes#getElementtypes()
	 * @see #getElementTypes()
	 * @generated
	 */
	EReference getElementTypes_Elementtypes();

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
	 * Returns the meta object for class '{@link generator.EquipmentEType <em>Equipment EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment EType</em>'.
	 * @see generator.EquipmentEType
	 * @generated
	 */
	EClass getEquipmentEType();

	/**
	 * Returns the meta object for class '{@link generator.ElementPosition <em>Element Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Position</em>'.
	 * @see generator.ElementPosition
	 * @generated
	 */
	EClass getElementPosition();

	/**
	 * Returns the meta object for the reference list '{@link generator.ElementPosition#getAutorizedETypes <em>Autorized ETypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Autorized ETypes</em>'.
	 * @see generator.ElementPosition#getAutorizedETypes()
	 * @see #getElementPosition()
	 * @generated
	 */
	EReference getElementPosition_AutorizedETypes();

	/**
	 * Returns the meta object for class '{@link generator.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see generator.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.MappingModel#getCompliancerelations <em>Compliancerelations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliancerelations</em>'.
	 * @see generator.MappingModel#getCompliancerelations()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Compliancerelations();

	/**
	 * Returns the meta object for class '{@link generator.Modality2RoomType <em>Modality2 Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality2 Room Type</em>'.
	 * @see generator.Modality2RoomType
	 * @generated
	 */
	EClass getModality2RoomType();

	/**
	 * Returns the meta object for the reference '{@link generator.Modality2RoomType#getResponsemodality <em>Responsemodality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsemodality</em>'.
	 * @see generator.Modality2RoomType#getResponsemodality()
	 * @see #getModality2RoomType()
	 * @generated
	 */
	EReference getModality2RoomType_Responsemodality();

	/**
	 * Returns the meta object for the reference list '{@link generator.Modality2RoomType#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomtype</em>'.
	 * @see generator.Modality2RoomType#getRoomtype()
	 * @see #getModality2RoomType()
	 * @generated
	 */
	EReference getModality2RoomType_Roomtype();

	/**
	 * Returns the meta object for class '{@link generator.ComplianceRelations <em>Compliance Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Relations</em>'.
	 * @see generator.ComplianceRelations
	 * @generated
	 */
	EClass getComplianceRelations();

	/**
	 * Returns the meta object for class '{@link generator.TaskType2Gameplay <em>Task Type2 Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type2 Gameplay</em>'.
	 * @see generator.TaskType2Gameplay
	 * @generated
	 */
	EClass getTaskType2Gameplay();

	/**
	 * Returns the meta object for the reference list '{@link generator.TaskType2Gameplay#getGameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gameplay</em>'.
	 * @see generator.TaskType2Gameplay#getGameplay()
	 * @see #getTaskType2Gameplay()
	 * @generated
	 */
	EReference getTaskType2Gameplay_Gameplay();

	/**
	 * Returns the meta object for the reference '{@link generator.TaskType2Gameplay#getTasktype <em>Tasktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tasktype</em>'.
	 * @see generator.TaskType2Gameplay#getTasktype()
	 * @see #getTaskType2Gameplay()
	 * @generated
	 */
	EReference getTaskType2Gameplay_Tasktype();

	/**
	 * Returns the meta object for class '{@link generator.ResponseModalities <em>Response Modalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Modalities</em>'.
	 * @see generator.ResponseModalities
	 * @generated
	 */
	EClass getResponseModalities();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.ResponseModalities#getResponsemodalities <em>Responsemodalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsemodalities</em>'.
	 * @see generator.ResponseModalities#getResponsemodalities()
	 * @see #getResponseModalities()
	 * @generated
	 */
	EReference getResponseModalities_Responsemodalities();

	/**
	 * Returns the meta object for class '{@link generator.Gameplay2RoomType <em>Gameplay2 Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gameplay2 Room Type</em>'.
	 * @see generator.Gameplay2RoomType
	 * @generated
	 */
	EClass getGameplay2RoomType();

	/**
	 * Returns the meta object for the reference '{@link generator.Gameplay2RoomType#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see generator.Gameplay2RoomType#getRoomtype()
	 * @see #getGameplay2RoomType()
	 * @generated
	 */
	EReference getGameplay2RoomType_Roomtype();

	/**
	 * Returns the meta object for the reference list '{@link generator.Gameplay2RoomType#getGameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gameplay</em>'.
	 * @see generator.Gameplay2RoomType#getGameplay()
	 * @see #getGameplay2RoomType()
	 * @generated
	 */
	EReference getGameplay2RoomType_Gameplay();

	/**
	 * Returns the meta object for enum '{@link generator.GPBricks <em>GP Bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GP Bricks</em>'.
	 * @see generator.GPBricks
	 * @generated
	 */
	EEnum getGPBricks();

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
	 * Returns the meta object for enum '{@link generator.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verifiable Element</em>'.
	 * @see generator.VerifiableElement
	 * @generated
	 */
	EEnum getVerifiableElement();

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
	 * Returns the meta object for enum '{@link generator.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Element</em>'.
	 * @see generator.TargetElement
	 * @generated
	 */
	EEnum getTargetElement();

	/**
	 * Returns the meta object for enum '{@link generator.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see generator.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the meta object for enum '{@link generator.EPassiveAbility <em>EPassive Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPassive Ability</em>'.
	 * @see generator.EPassiveAbility
	 * @generated
	 */
	EEnum getEPassiveAbility();

	/**
	 * Returns the meta object for enum '{@link generator.EActiveAbility <em>EActive Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EActive Ability</em>'.
	 * @see generator.EActiveAbility
	 * @generated
	 */
	EEnum getEActiveAbility();

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
		 * The meta object literal for the '{@link generator.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.FactImpl
		 * @see generator.impl.GeneratorPackageImpl#getFact()
		 * @generated
		 */
		EClass FACT = eINSTANCE.getFact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__DESCRIPTION = eINSTANCE.getFact_Description();

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
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__QUESTION = eINSTANCE.getRoom_Question();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ELEMENTS = eINSTANCE.getGameDescription_Elements();

		/**
		 * The meta object literal for the '<em><b>Gameplays</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__GAMEPLAYS = eINSTANCE.getGameDescription_Gameplays();

		/**
		 * The meta object literal for the '<em><b>Elementtypes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ELEMENTTYPES = eINSTANCE.getGameDescription_Elementtypes();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ABILITIES = eINSTANCE.getGameDescription_Abilities();

		/**
		 * The meta object literal for the '<em><b>Roomtypes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DESCRIPTION__ROOMTYPES = eINSTANCE.getGameDescription_Roomtypes();

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
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__POSITIONS = eINSTANCE.getRoomType_Positions();

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
		 * The meta object literal for the '<em><b>Number Of Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_CONTEXT__NUMBER_OF_ROOMS = eINSTANCE.getGameContext_NumberOfRooms();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_CONTEXT__MODE = eINSTANCE.getGameContext_Mode();

		/**
		 * The meta object literal for the '{@link generator.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Tasktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASKTYPE = eINSTANCE.getTask_Tasktype();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Apparition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERCENTAGE_OF_APPARITION = eINSTANCE.getTask_PercentageOfApparition();

		/**
		 * The meta object literal for the '<em><b>Nb Consecutive Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NB_CONSECUTIVE_SUCCESS = eINSTANCE.getTask_NbConsecutiveSuccess();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Valid Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERCENTAGE_OF_VALID_FACTS = eINSTANCE.getTask_PercentageOfValidFacts();

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
		 * The meta object literal for the '<em><b>Tasktypes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DOMAIN__TASKTYPES = eINSTANCE.getLearningDomain_Tasktypes();

		/**
		 * The meta object literal for the '<em><b>Responsemodalities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DOMAIN__RESPONSEMODALITIES = eINSTANCE.getLearningDomain_Responsemodalities();

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
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__LEARNINGOBJECTIVE = eINSTANCE.getLearningPath_Learningobjective();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__KNOWLEDGE = eINSTANCE.getLearningPath_Knowledge();

		/**
		 * The meta object literal for the '{@link generator.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearningObjectiveImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearningObjective()
		 * @generated
		 */
		EClass LEARNING_OBJECTIVE = eINSTANCE.getLearningObjective();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_OBJECTIVE__ID = eINSTANCE.getLearningObjective_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_OBJECTIVE__NAME = eINSTANCE.getLearningObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__PREREQUISITES = eINSTANCE.getLearningObjective_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__LEVELS = eINSTANCE.getLearningObjective_Levels();

		/**
		 * The meta object literal for the '<em><b>Setoffacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__SETOFFACTS = eINSTANCE.getLearningObjective_Setoffacts();

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
		 * The meta object literal for the '<em><b>Succes Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__SUCCES_PERCENTAGE = eINSTANCE.getPrerequisite_SuccesPercentage();

		/**
		 * The meta object literal for the '<em><b>Required Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__REQUIRED_LEVEL = eINSTANCE.getPrerequisite_RequiredLevel();

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
		 * The meta object literal for the '{@link generator.impl.MTCompletionTypeImpl <em>MT Completion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTCompletionTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTCompletionType()
		 * @generated
		 */
		EClass MT_COMPLETION_TYPE = eINSTANCE.getMTCompletionType();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION_TYPE__TARGETS = eINSTANCE.getMTCompletionType_Targets();

		/**
		 * The meta object literal for the '{@link generator.impl.TaskTypesImpl <em>Task Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TaskTypesImpl
		 * @see generator.impl.GeneratorPackageImpl#getTaskTypes()
		 * @generated
		 */
		EClass TASK_TYPES = eINSTANCE.getTaskTypes();

		/**
		 * The meta object literal for the '<em><b>Tasktypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPES__TASKTYPES = eINSTANCE.getTaskTypes_Tasktypes();

		/**
		 * The meta object literal for the '{@link generator.impl.CompletionTypeImpl <em>Completion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CompletionTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getCompletionType()
		 * @generated
		 */
		EClass COMPLETION_TYPE = eINSTANCE.getCompletionType();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_TYPE__NB_MISSING_ELEMENTS = eINSTANCE.getCompletionType_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Fact Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_TYPE__FACT_ORDER = eINSTANCE.getCompletionType_FactOrder();

		/**
		 * The meta object literal for the '<em><b>Natural Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_TYPE__NATURAL_LANGUAGE = eINSTANCE.getCompletionType_NaturalLanguage();

		/**
		 * The meta object literal for the '{@link generator.impl.VerificationTypeImpl <em>Verification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.VerificationTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getVerificationType()
		 * @generated
		 */
		EClass VERIFICATION_TYPE = eINSTANCE.getVerificationType();

		/**
		 * The meta object literal for the '<em><b>Verify True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_TYPE__VERIFY_TRUE = eINSTANCE.getVerificationType_VerifyTrue();

		/**
		 * The meta object literal for the '{@link generator.impl.ReconstructionTypeImpl <em>Reconstruction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ReconstructionTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getReconstructionType()
		 * @generated
		 */
		EClass RECONSTRUCTION_TYPE = eINSTANCE.getReconstructionType();

		/**
		 * The meta object literal for the '<em><b>Nb False Proposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION = eINSTANCE.getReconstructionType_NbFalseProposition();

		/**
		 * The meta object literal for the '{@link generator.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TaskTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>Responsemodalities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__RESPONSEMODALITIES = eINSTANCE.getTaskType_Responsemodalities();

		/**
		 * The meta object literal for the '{@link generator.impl.FactVerificationTypeImpl <em>Fact Verification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.FactVerificationTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getFactVerificationType()
		 * @generated
		 */
		EClass FACT_VERIFICATION_TYPE = eINSTANCE.getFactVerificationType();

		/**
		 * The meta object literal for the '{@link generator.impl.ResultVerificationTypeImpl <em>Result Verification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResultVerificationTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getResultVerificationType()
		 * @generated
		 */
		EClass RESULT_VERIFICATION_TYPE = eINSTANCE.getResultVerificationType();

		/**
		 * The meta object literal for the '<em><b>Nb False Proposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_VERIFICATION_TYPE__NB_FALSE_PROPOSITION = eINSTANCE
				.getResultVerificationType_NbFalseProposition();

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
		 * The meta object literal for the '{@link generator.impl.CurrentObjectiveLevelImpl <em>Current Objective Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CurrentObjectiveLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurrentObjectiveLevel()
		 * @generated
		 */
		EClass CURRENT_OBJECTIVE_LEVEL = eINSTANCE.getCurrentObjectiveLevel();

		/**
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE = eINSTANCE.getCurrentObjectiveLevel_Learningobjective();

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
		 * The meta object literal for the '{@link generator.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PositionImpl
		 * @see generator.impl.GeneratorPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__POSITION = eINSTANCE.getQuestion_Position();

		/**
		 * The meta object literal for the '<em><b>Incomplete Fact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INCOMPLETE_FACT = eINSTANCE.getQuestion_IncompleteFact();

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
		 * The meta object literal for the '<em><b>Nb Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__NB_CHOICES = eINSTANCE.getMultipleChoice_NbChoices();

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
		 * The meta object literal for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.InteractionETypeImpl <em>Interaction EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.InteractionETypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getInteractionEType()
		 * @generated
		 */
		EClass INTERACTION_ETYPE = eINSTANCE.getInteractionEType();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_ETYPE__ABILITIES = eINSTANCE.getInteractionEType_Abilities();

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
		 * The meta object literal for the '{@link generator.impl.ActiveAbilityImpl <em>Active Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ActiveAbilityImpl
		 * @see generator.impl.GeneratorPackageImpl#getActiveAbility()
		 * @generated
		 */
		EClass ACTIVE_ABILITY = eINSTANCE.getActiveAbility();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_ABILITY__ABILITY = eINSTANCE.getActiveAbility_Ability();

		/**
		 * The meta object literal for the '{@link generator.impl.PassiveAbilityImpl <em>Passive Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PassiveAbilityImpl
		 * @see generator.impl.GeneratorPackageImpl#getPassiveAbility()
		 * @generated
		 */
		EClass PASSIVE_ABILITY = eINSTANCE.getPassiveAbility();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_ABILITY__ABILITY = eINSTANCE.getPassiveAbility_Ability();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__DESCRIPTION = eINSTANCE.getGameplay_Description();

		/**
		 * The meta object literal for the '<em><b>Gamerules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__GAMERULES = eINSTANCE.getGameplay_Gamerules();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__REQUIREMENT = eINSTANCE.getGameplay_Requirement();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAMEPLAY___IS_AVAILABLE = eINSTANCE.getGameplay__IsAvailable();

		/**
		 * The meta object literal for the '{@link generator.impl.GameRuleImpl <em>Game Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameRuleImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameRule()
		 * @generated
		 */
		EClass GAME_RULE = eINSTANCE.getGameRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_RULE__TYPE = eINSTANCE.getGameRule_Type();

		/**
		 * The meta object literal for the '<em><b>Ability2activate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_RULE__ABILITY2ACTIVATE = eINSTANCE.getGameRule_Ability2activate();

		/**
		 * The meta object literal for the '<em><b>Interactionelementtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_RULE__INTERACTIONELEMENTTYPE = eINSTANCE.getGameRule_Interactionelementtype();

		/**
		 * The meta object literal for the '{@link generator.impl.BuyableElementImpl <em>Buyable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.BuyableElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getBuyableElement()
		 * @generated
		 */
		EClass BUYABLE_ELEMENT = eINSTANCE.getBuyableElement();

		/**
		 * The meta object literal for the '<em><b>Bought</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUYABLE_ELEMENT__BOUGHT = eINSTANCE.getBuyableElement_Bought();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUYABLE_ELEMENT__ACTIVATED = eINSTANCE.getBuyableElement_Activated();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.AvatarEquipmentImpl <em>Avatar Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AvatarEquipmentImpl
		 * @see generator.impl.GeneratorPackageImpl#getAvatarEquipment()
		 * @generated
		 */
		EClass AVATAR_EQUIPMENT = eINSTANCE.getAvatarEquipment();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementsImpl
		 * @see generator.impl.GeneratorPackageImpl#getElements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getElements();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS__ELEMENTS = eINSTANCE.getElements_Elements();

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
		 * The meta object literal for the '{@link generator.impl.ElementTypesImpl <em>Element Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementTypesImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementTypes()
		 * @generated
		 */
		EClass ELEMENT_TYPES = eINSTANCE.getElementTypes();

		/**
		 * The meta object literal for the '<em><b>Elementtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPES__ELEMENTTYPES = eINSTANCE.getElementTypes_Elementtypes();

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
		 * The meta object literal for the '{@link generator.impl.EquipmentETypeImpl <em>Equipment EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.EquipmentETypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getEquipmentEType()
		 * @generated
		 */
		EClass EQUIPMENT_ETYPE = eINSTANCE.getEquipmentEType();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementPositionImpl <em>Element Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementPositionImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementPosition()
		 * @generated
		 */
		EClass ELEMENT_POSITION = eINSTANCE.getElementPosition();

		/**
		 * The meta object literal for the '<em><b>Autorized ETypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION__AUTORIZED_ETYPES = eINSTANCE.getElementPosition_AutorizedETypes();

		/**
		 * The meta object literal for the '{@link generator.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MappingModelImpl
		 * @see generator.impl.GeneratorPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Compliancerelations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__COMPLIANCERELATIONS = eINSTANCE.getMappingModel_Compliancerelations();

		/**
		 * The meta object literal for the '{@link generator.impl.Modality2RoomTypeImpl <em>Modality2 Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.Modality2RoomTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getModality2RoomType()
		 * @generated
		 */
		EClass MODALITY2_ROOM_TYPE = eINSTANCE.getModality2RoomType();

		/**
		 * The meta object literal for the '<em><b>Responsemodality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY2_ROOM_TYPE__RESPONSEMODALITY = eINSTANCE.getModality2RoomType_Responsemodality();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY2_ROOM_TYPE__ROOMTYPE = eINSTANCE.getModality2RoomType_Roomtype();

		/**
		 * The meta object literal for the '{@link generator.impl.ComplianceRelationsImpl <em>Compliance Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ComplianceRelationsImpl
		 * @see generator.impl.GeneratorPackageImpl#getComplianceRelations()
		 * @generated
		 */
		EClass COMPLIANCE_RELATIONS = eINSTANCE.getComplianceRelations();

		/**
		 * The meta object literal for the '{@link generator.impl.TaskType2GameplayImpl <em>Task Type2 Gameplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TaskType2GameplayImpl
		 * @see generator.impl.GeneratorPackageImpl#getTaskType2Gameplay()
		 * @generated
		 */
		EClass TASK_TYPE2_GAMEPLAY = eINSTANCE.getTaskType2Gameplay();

		/**
		 * The meta object literal for the '<em><b>Gameplay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE2_GAMEPLAY__GAMEPLAY = eINSTANCE.getTaskType2Gameplay_Gameplay();

		/**
		 * The meta object literal for the '<em><b>Tasktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE2_GAMEPLAY__TASKTYPE = eINSTANCE.getTaskType2Gameplay_Tasktype();

		/**
		 * The meta object literal for the '{@link generator.impl.ResponseModalitiesImpl <em>Response Modalities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResponseModalitiesImpl
		 * @see generator.impl.GeneratorPackageImpl#getResponseModalities()
		 * @generated
		 */
		EClass RESPONSE_MODALITIES = eINSTANCE.getResponseModalities();

		/**
		 * The meta object literal for the '<em><b>Responsemodalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_MODALITIES__RESPONSEMODALITIES = eINSTANCE.getResponseModalities_Responsemodalities();

		/**
		 * The meta object literal for the '{@link generator.impl.Gameplay2RoomTypeImpl <em>Gameplay2 Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.Gameplay2RoomTypeImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameplay2RoomType()
		 * @generated
		 */
		EClass GAMEPLAY2_ROOM_TYPE = eINSTANCE.getGameplay2RoomType();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY2_ROOM_TYPE__ROOMTYPE = eINSTANCE.getGameplay2RoomType_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Gameplay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY2_ROOM_TYPE__GAMEPLAY = eINSTANCE.getGameplay2RoomType_Gameplay();

		/**
		 * The meta object literal for the '{@link generator.GPBricks <em>GP Bricks</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.GPBricks
		 * @see generator.impl.GeneratorPackageImpl#getGPBricks()
		 * @generated
		 */
		EEnum GP_BRICKS = eINSTANCE.getGPBricks();

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
		 * The meta object literal for the '{@link generator.VerifiableElement <em>Verifiable Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.VerifiableElement
		 * @see generator.impl.GeneratorPackageImpl#getVerifiableElement()
		 * @generated
		 */
		EEnum VERIFIABLE_ELEMENT = eINSTANCE.getVerifiableElement();

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
		 * The meta object literal for the '{@link generator.TargetElement <em>Target Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.TargetElement
		 * @see generator.impl.GeneratorPackageImpl#getTargetElement()
		 * @generated
		 */
		EEnum TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '{@link generator.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.Order
		 * @see generator.impl.GeneratorPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link generator.EPassiveAbility <em>EPassive Ability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EPassiveAbility
		 * @see generator.impl.GeneratorPackageImpl#getEPassiveAbility()
		 * @generated
		 */
		EEnum EPASSIVE_ABILITY = eINSTANCE.getEPassiveAbility();

		/**
		 * The meta object literal for the '{@link generator.EActiveAbility <em>EActive Ability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EActiveAbility
		 * @see generator.impl.GeneratorPackageImpl#getEActiveAbility()
		 * @generated
		 */
		EEnum EACTIVE_ABILITY = eINSTANCE.getEActiveAbility();

	}

} //GeneratorPackage
