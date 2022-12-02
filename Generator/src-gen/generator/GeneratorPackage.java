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
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TASK = 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 6;

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
	 * The number of structural features of the '<em>Game Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Achievement Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__ACHIEVEMENT_PERCENT = 2;

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
	int ATASK = 28;

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
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK__RESPONSEMODALITIES = 2;

	/**
	 * The number of structural features of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___GET_TYPE = 0;

	/**
	 * The number of operations of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.Completion1TaskImpl <em>Completion1 Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.Completion1TaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletion1Task()
	 * @generated
	 */
	int COMPLETION1_TASK = 29;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__RESPONSEMODALITIES = ATASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completion1 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>Completion1 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

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
	int MT_COMPLETION1__PERCENT_OF_APPARITION = COMPLETION1_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__NB_CONSECUTIVE_SUCCESS = COMPLETION1_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__RESPONSEMODALITIES = COMPLETION1_TASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__TYPE = COMPLETION1_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__TARGETS = COMPLETION1_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_FEATURE_COUNT = COMPLETION1_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_TYPE = COMPLETION1_TASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_OPERATION_COUNT = COMPLETION1_TASK_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Current Objective Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL_FEATURE_COUNT = 4;

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
	int POSITION = 22;

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
	int QUESTION = 23;

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
	int RESPONSE_MODALITY = 24;

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
	int MULTIPLE_CHOICE = 25;

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
	int ENTER_RESPONSE = 26;

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
	int ROOM_TYPES = 27;

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
	 * The meta object id for the '{@link generator.impl.Completion2TaskImpl <em>Completion2 Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.Completion2TaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletion2Task()
	 * @generated
	 */
	int COMPLETION2_TASK = 30;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__RESPONSEMODALITIES = ATASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completion2 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>Completion2 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ReconstructionTaskImpl <em>Reconstruction Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ReconstructionTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getReconstructionTask()
	 * @generated
	 */
	int RECONSTRUCTION_TASK = 31;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__PERCENT_OF_APPARITION = ATASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__NB_CONSECUTIVE_SUCCESS = ATASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__RESPONSEMODALITIES = ATASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconstruction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>Reconstruction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.IdentificationTaskImpl <em>Identification Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.IdentificationTaskImpl
	 * @see generator.impl.GeneratorPackageImpl#getIdentificationTask()
	 * @generated
	 */
	int IDENTIFICATION_TASK = 32;

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
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__RESPONSEMODALITIES = ATASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__NB_FACTS = ATASK_FEATURE_COUNT + 1;

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
	int MEMBERSHIP_ID_TASK = 33;

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
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__RESPONSEMODALITIES = ATASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__TYPE = ATASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__CHECK_IS_TRUE = ATASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Membership ID Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___GET_TYPE = ATASK___GET_TYPE;

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
	int MT_COMPLETION2 = 34;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__PERCENT_OF_APPARITION = COMPLETION2_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__NB_CONSECUTIVE_SUCCESS = COMPLETION2_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__RESPONSEMODALITIES = COMPLETION2_TASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__TYPE = COMPLETION2_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__TARGETS = COMPLETION2_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2_FEATURE_COUNT = COMPLETION2_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_TYPE = COMPLETION2_TASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>MT Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2_OPERATION_COUNT = COMPLETION2_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTRecontructionImpl <em>MT Recontruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTRecontructionImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTRecontruction()
	 * @generated
	 */
	int MT_RECONTRUCTION = 35;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__PERCENT_OF_APPARITION = RECONSTRUCTION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__NB_CONSECUTIVE_SUCCESS = RECONSTRUCTION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__RESPONSEMODALITIES = RECONSTRUCTION_TASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__TYPE = RECONSTRUCTION_TASK__TYPE;

	/**
	 * The number of structural features of the '<em>MT Recontruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION_FEATURE_COUNT = RECONSTRUCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_TYPE = RECONSTRUCTION_TASK___GET_TYPE;

	/**
	 * The number of operations of the '<em>MT Recontruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION_OPERATION_COUNT = RECONSTRUCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTIdentificationImpl <em>MT Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTIdentificationImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTIdentification()
	 * @generated
	 */
	int MT_IDENTIFICATION = 36;

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
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__RESPONSEMODALITIES = IDENTIFICATION_TASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__TYPE = IDENTIFICATION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__NB_FACTS = IDENTIFICATION_TASK__NB_FACTS;

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
	int MT_MEMBERSHIP = 37;

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
	 * The feature id for the '<em><b>Responsemodalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__RESPONSEMODALITIES = MEMBERSHIP_ID_TASK__RESPONSEMODALITIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__TYPE = MEMBERSHIP_ID_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Check Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__CHECK_IS_TRUE = MEMBERSHIP_ID_TASK__CHECK_IS_TRUE;

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
	int RESULTS = 38;

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
	int RESULTS_BY_TASK = 39;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Questionedfacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__QUESTIONEDFACTS = 1;

	/**
	 * The number of structural features of the '<em>Results By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Results By Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QFResultsImpl <em>QF Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QFResultsImpl
	 * @see generator.impl.GeneratorPackageImpl#getQFResults()
	 * @generated
	 */
	int QF_RESULTS = 40;

	/**
	 * The number of structural features of the '<em>QF Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RESULTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>QF Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTFactImpl <em>MT Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTFact()
	 * @generated
	 */
	int MT_FACT = 41;

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
	int MT_RESULT_FACT = 42;

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
	int QUESTIONABLE_FACT = 43;

	/**
	 * The feature id for the '<em><b>Qfresults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__QFRESULTS = 0;

	/**
	 * The number of structural features of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion1Impl <em>MTQF Completion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion1()
	 * @generated
	 */
	int MTQF_COMPLETION1 = 44;

	/**
	 * The feature id for the '<em><b>Qfresults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__QFRESULTS = QUESTIONABLE_FACT__QFRESULTS;

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
	 * The feature id for the '<em><b>NO VALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__NO_VALUE = QUESTIONABLE_FACT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MTQF Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MTQF Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion2Impl <em>MTQF Completion2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion2Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion2()
	 * @generated
	 */
	int MTQF_COMPLETION2 = 45;

	/**
	 * The feature id for the '<em><b>Qfresults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__QFRESULTS = QUESTIONABLE_FACT__QFRESULTS;

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
	 * The feature id for the '<em><b>NO VALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__NO_VALUE = QUESTIONABLE_FACT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>MTQF Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MTQF Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Directions
	 * @see generator.impl.GeneratorPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 46;

	/**
	 * The meta object id for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.DungeonMode
	 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
	 * @generated
	 */
	int DUNGEON_MODE = 47;

	/**
	 * The meta object id for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TableBuild
	 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 48;

	/**
	 * The meta object id for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ResultPosition
	 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 49;

	/**
	 * The meta object id for the '{@link generator.ESingleTarget <em>ESingle Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESingleTarget
	 * @see generator.impl.GeneratorPackageImpl#getESingleTarget()
	 * @generated
	 */
	int ESINGLE_TARGET = 50;

	/**
	 * The meta object id for the '{@link generator.ETaskType <em>ETask Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ETaskType
	 * @see generator.impl.GeneratorPackageImpl#getETaskType()
	 * @generated
	 */
	int ETASK_TYPE = 51;

	/**
	 * The meta object id for the '{@link generator.EModality <em>EModality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EModality
	 * @see generator.impl.GeneratorPackageImpl#getEModality()
	 * @generated
	 */
	int EMODALITY = 52;

	/**
	 * The meta object id for the '{@link generator.ESeveralTarget <em>ESeveral Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESeveralTarget
	 * @see generator.impl.GeneratorPackageImpl#getESeveralTarget()
	 * @generated
	 */
	int ESEVERAL_TARGET = 53;

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
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getAchievementPercent <em>Achievement Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achievement Percent</em>'.
	 * @see generator.Prerequisite#getAchievementPercent()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_AchievementPercent();

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
	 * Returns the meta object for the containment reference list '{@link generator.ATask#getResponsemodalities <em>Responsemodalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsemodalities</em>'.
	 * @see generator.ATask#getResponsemodalities()
	 * @see #getATask()
	 * @generated
	 */
	EReference getATask_Responsemodalities();

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
	 * Returns the meta object for class '{@link generator.Completion1Task <em>Completion1 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion1 Task</em>'.
	 * @see generator.Completion1Task
	 * @generated
	 */
	EClass getCompletion1Task();

	/**
	 * Returns the meta object for the attribute '{@link generator.Completion1Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.Completion1Task#getType()
	 * @see #getCompletion1Task()
	 * @generated
	 */
	EAttribute getCompletion1Task_Type();

	/**
	 * Returns the meta object for class '{@link generator.Completion2Task <em>Completion2 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion2 Task</em>'.
	 * @see generator.Completion2Task
	 * @generated
	 */
	EClass getCompletion2Task();

	/**
	 * Returns the meta object for the attribute '{@link generator.Completion2Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.Completion2Task#getType()
	 * @see #getCompletion2Task()
	 * @generated
	 */
	EAttribute getCompletion2Task_Type();

	/**
	 * Returns the meta object for class '{@link generator.ReconstructionTask <em>Reconstruction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconstruction Task</em>'.
	 * @see generator.ReconstructionTask
	 * @generated
	 */
	EClass getReconstructionTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.ReconstructionTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.ReconstructionTask#getType()
	 * @see #getReconstructionTask()
	 * @generated
	 */
	EAttribute getReconstructionTask_Type();

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
	 * Returns the meta object for the attribute '{@link generator.IdentificationTask#getNbFacts <em>Nb Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Facts</em>'.
	 * @see generator.IdentificationTask#getNbFacts()
	 * @see #getIdentificationTask()
	 * @generated
	 */
	EAttribute getIdentificationTask_NbFacts();

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
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#isCheckIsTrue <em>Check Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Is True</em>'.
	 * @see generator.MembershipIDTask#isCheckIsTrue()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_CheckIsTrue();

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
	 * Returns the meta object for class '{@link generator.MTRecontruction <em>MT Recontruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Recontruction</em>'.
	 * @see generator.MTRecontruction
	 * @generated
	 */
	EClass getMTRecontruction();

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
	 * Returns the meta object for the containment reference list '{@link generator.ResultsByTask#getQuestionedfacts <em>Questionedfacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionedfacts</em>'.
	 * @see generator.ResultsByTask#getQuestionedfacts()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EReference getResultsByTask_Questionedfacts();

	/**
	 * Returns the meta object for class '{@link generator.QFResults <em>QF Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Results</em>'.
	 * @see generator.QFResults
	 * @generated
	 */
	EClass getQFResults();

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
	 * Returns the meta object for the containment reference list '{@link generator.QuestionableFact#getQfresults <em>Qfresults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qfresults</em>'.
	 * @see generator.QuestionableFact#getQfresults()
	 * @see #getQuestionableFact()
	 * @generated
	 */
	EReference getQuestionableFact_Qfresults();

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
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion1#getNO_VALUE <em>NO VALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NO VALUE</em>'.
	 * @see generator.MTQFCompletion1#getNO_VALUE()
	 * @see #getMTQFCompletion1()
	 * @generated
	 */
	EAttribute getMTQFCompletion1_NO_VALUE();

	/**
	 * Returns the meta object for the '{@link generator.MTQFCompletion1#getQuestionableFact() <em>Get Questionable Fact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Questionable Fact</em>' operation.
	 * @see generator.MTQFCompletion1#getQuestionableFact()
	 * @generated
	 */
	EOperation getMTQFCompletion1__GetQuestionableFact();

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
	 * Returns the meta object for the attribute '{@link generator.MTQFCompletion2#getNO_VALUE <em>NO VALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NO VALUE</em>'.
	 * @see generator.MTQFCompletion2#getNO_VALUE()
	 * @see #getMTQFCompletion2()
	 * @generated
	 */
	EAttribute getMTQFCompletion2_NO_VALUE();

	/**
	 * Returns the meta object for the '{@link generator.MTQFCompletion2#getQuestionableFact() <em>Get Questionable Fact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Questionable Fact</em>' operation.
	 * @see generator.MTQFCompletion2#getQuestionableFact()
	 * @generated
	 */
	EOperation getMTQFCompletion2__GetQuestionableFact();

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
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TASK = eINSTANCE.getRoom_Task();

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
		 * The meta object literal for the '<em><b>Achievement Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__ACHIEVEMENT_PERCENT = eINSTANCE.getPrerequisite_AchievementPercent();

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
		 * The meta object literal for the '<em><b>Responsemodalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATASK__RESPONSEMODALITIES = eINSTANCE.getATask_Responsemodalities();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___GET_TYPE = eINSTANCE.getATask__GetType();

		/**
		 * The meta object literal for the '{@link generator.impl.Completion1TaskImpl <em>Completion1 Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.Completion1TaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getCompletion1Task()
		 * @generated
		 */
		EClass COMPLETION1_TASK = eINSTANCE.getCompletion1Task();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION1_TASK__TYPE = eINSTANCE.getCompletion1Task_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.Completion2TaskImpl <em>Completion2 Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.Completion2TaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getCompletion2Task()
		 * @generated
		 */
		EClass COMPLETION2_TASK = eINSTANCE.getCompletion2Task();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION2_TASK__TYPE = eINSTANCE.getCompletion2Task_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.ReconstructionTaskImpl <em>Reconstruction Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ReconstructionTaskImpl
		 * @see generator.impl.GeneratorPackageImpl#getReconstructionTask()
		 * @generated
		 */
		EClass RECONSTRUCTION_TASK = eINSTANCE.getReconstructionTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONSTRUCTION_TASK__TYPE = eINSTANCE.getReconstructionTask_Type();

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
		 * The meta object literal for the '<em><b>Nb Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TASK__NB_FACTS = eINSTANCE.getIdentificationTask_NbFacts();

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
		 * The meta object literal for the '<em><b>Check Is True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__CHECK_IS_TRUE = eINSTANCE.getMembershipIDTask_CheckIsTrue();

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
		 * The meta object literal for the '{@link generator.impl.MTRecontructionImpl <em>MT Recontruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTRecontructionImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTRecontruction()
		 * @generated
		 */
		EClass MT_RECONTRUCTION = eINSTANCE.getMTRecontruction();

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
		 * The meta object literal for the '<em><b>Questionedfacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_BY_TASK__QUESTIONEDFACTS = eINSTANCE.getResultsByTask_Questionedfacts();

		/**
		 * The meta object literal for the '{@link generator.impl.QFResultsImpl <em>QF Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QFResultsImpl
		 * @see generator.impl.GeneratorPackageImpl#getQFResults()
		 * @generated
		 */
		EClass QF_RESULTS = eINSTANCE.getQFResults();

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
		 * The meta object literal for the '<em><b>Qfresults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONABLE_FACT__QFRESULTS = eINSTANCE.getQuestionableFact_Qfresults();

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
		 * The meta object literal for the '<em><b>NO VALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION1__NO_VALUE = eINSTANCE.getMTQFCompletion1_NO_VALUE();

		/**
		 * The meta object literal for the '<em><b>Get Questionable Fact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MTQF_COMPLETION1___GET_QUESTIONABLE_FACT = eINSTANCE.getMTQFCompletion1__GetQuestionableFact();

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
		 * The meta object literal for the '<em><b>NO VALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_COMPLETION2__NO_VALUE = eINSTANCE.getMTQFCompletion2_NO_VALUE();

		/**
		 * The meta object literal for the '<em><b>Get Questionable Fact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MTQF_COMPLETION2___GET_QUESTIONABLE_FACT = eINSTANCE.getMTQFCompletion2__GetQuestionableFact();

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

	}

} //GeneratorPackage
