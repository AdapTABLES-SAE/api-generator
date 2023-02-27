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
	 * The feature id for the '<em><b>Levels Difficulty Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS = 1;

	/**
	 * The number of structural features of the '<em>Game Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DESCRIPTION_FEATURE_COUNT = 2;

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
	int ATASK = 27;

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
	 * The number of structural features of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_FEATURE_COUNT = 5;

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
	int COMPLETION1_TASK = 28;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION1_TASK__MAX_TIME = ATASK__MAX_TIME;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__RESPONSE_MODALITY = COMPLETION1_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__ID = COMPLETION1_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__MAX_TIME = COMPLETION1_TASK__MAX_TIME;

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
	 * The meta object id for the '{@link generator.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResponseModalityImpl
	 * @see generator.impl.GeneratorPackageImpl#getResponseModality()
	 * @generated
	 */
	int RESPONSE_MODALITY = 23;

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
	int MULTIPLE_CHOICE = 24;

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
	int ENTER_RESPONSE = 25;

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
	int ROOM_TYPES = 26;

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
	int COMPLETION2_TASK = 29;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION2_TASK__MAX_TIME = ATASK__MAX_TIME;

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
	int RECONSTRUCTION_TASK = 30;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__RESPONSE_MODALITY = ATASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__ID = ATASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_TASK__MAX_TIME = ATASK__MAX_TIME;

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
	int IDENTIFICATION_TASK = 31;

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
	int MEMBERSHIP_ID_TASK = 32;

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
	int MT_COMPLETION2 = 33;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__RESPONSE_MODALITY = COMPLETION2_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__ID = COMPLETION2_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__MAX_TIME = COMPLETION2_TASK__MAX_TIME;

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
	int MT_RECONTRUCTION = 34;

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
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__RESPONSE_MODALITY = RECONSTRUCTION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__ID = RECONSTRUCTION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__MAX_TIME = RECONSTRUCTION_TASK__MAX_TIME;

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
	int MT_IDENTIFICATION = 35;

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
	int MT_MEMBERSHIP = 36;

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
	int RESULTS = 37;

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
	int RESULTS_BY_TASK = 38;

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
	int MT_FACT = 39;

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
	int MT_RESULT_FACT = 40;

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
	int QUESTIONABLE_FACT = 41;

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
	 * The number of operations of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion1Impl <em>MTQF Completion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion1()
	 * @generated
	 */
	int MTQF_COMPLETION1 = 42;

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
	int MTQF_COMPLETION2 = 43;

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
	int MTQF_REBUILD = 44;

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
	int MTQF_IDENTIFICATION = 45;

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
	int MTQF_MEMBERSHIP = 46;

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
	int QUESTIONED_FACT = 47;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__QUESTIONABLEFACT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__QUESTION_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Questioned Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT___SET_QUESTION_TEXT = 0;

	/**
	 * The number of operations of the '<em>Questioned Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generator.impl.MTQeFCompletion1Impl <em>MT Qe FCompletion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQeFCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQeFCompletion1()
	 * @generated
	 */
	int MT_QE_FCOMPLETION1 = 48;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1__QUESTIONABLEFACT = QUESTIONED_FACT__QUESTIONABLEFACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1__POSITION = QUESTIONED_FACT__POSITION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1__QUESTION_TEXT = QUESTIONED_FACT__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Propositions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1__PROPOSITIONS = QUESTIONED_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Qe FCompletion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1_FEATURE_COUNT = QUESTIONED_FACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1___SET_QUESTION_TEXT = QUESTIONED_FACT___SET_QUESTION_TEXT;

	/**
	 * The number of operations of the '<em>MT Qe FCompletion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION1_OPERATION_COUNT = QUESTIONED_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQeFCompletion2Impl <em>MT Qe FCompletion2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQeFCompletion2Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQeFCompletion2()
	 * @generated
	 */
	int MT_QE_FCOMPLETION2 = 49;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2__QUESTIONABLEFACT = QUESTIONED_FACT__QUESTIONABLEFACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2__POSITION = QUESTIONED_FACT__POSITION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2__QUESTION_TEXT = QUESTIONED_FACT__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Propositions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2__PROPOSITIONS = QUESTIONED_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Qe FCompletion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2_FEATURE_COUNT = QUESTIONED_FACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2___SET_QUESTION_TEXT = QUESTIONED_FACT___SET_QUESTION_TEXT;

	/**
	 * The number of operations of the '<em>MT Qe FCompletion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FCOMPLETION2_OPERATION_COUNT = QUESTIONED_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQeFRebuildImpl <em>MT Qe FRebuild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQeFRebuildImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQeFRebuild()
	 * @generated
	 */
	int MT_QE_FREBUILD = 50;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD__QUESTIONABLEFACT = QUESTIONED_FACT__QUESTIONABLEFACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD__POSITION = QUESTIONED_FACT__POSITION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD__QUESTION_TEXT = QUESTIONED_FACT__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Propositions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD__PROPOSITIONS = QUESTIONED_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Qe FRebuild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD_FEATURE_COUNT = QUESTIONED_FACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD___SET_QUESTION_TEXT = QUESTIONED_FACT___SET_QUESTION_TEXT;

	/**
	 * The number of operations of the '<em>MT Qe FRebuild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FREBUILD_OPERATION_COUNT = QUESTIONED_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQeFIdentificationImpl <em>MT Qe FIdentification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQeFIdentificationImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQeFIdentification()
	 * @generated
	 */
	int MT_QE_FIDENTIFICATION = 51;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION__QUESTIONABLEFACT = QUESTIONED_FACT__QUESTIONABLEFACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION__POSITION = QUESTIONED_FACT__POSITION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION__QUESTION_TEXT = QUESTIONED_FACT__QUESTION_TEXT;

	/**
	 * The number of structural features of the '<em>MT Qe FIdentification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION_FEATURE_COUNT = QUESTIONED_FACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION___SET_QUESTION_TEXT = QUESTIONED_FACT___SET_QUESTION_TEXT;

	/**
	 * The number of operations of the '<em>MT Qe FIdentification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FIDENTIFICATION_OPERATION_COUNT = QUESTIONED_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MTQeFMembershipImpl <em>MT Qe FMembership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQeFMembershipImpl
	 * @see generator.impl.GeneratorPackageImpl#getMTQeFMembership()
	 * @generated
	 */
	int MT_QE_FMEMBERSHIP = 52;

	/**
	 * The feature id for the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP__QUESTIONABLEFACT = QUESTIONED_FACT__QUESTIONABLEFACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP__POSITION = QUESTIONED_FACT__POSITION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP__QUESTION_TEXT = QUESTIONED_FACT__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Bad Propositions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS = QUESTIONED_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Qe FMembership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP_FEATURE_COUNT = QUESTIONED_FACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Question Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP___SET_QUESTION_TEXT = QUESTIONED_FACT___SET_QUESTION_TEXT;

	/**
	 * The number of operations of the '<em>MT Qe FMembership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_QE_FMEMBERSHIP_OPERATION_COUNT = QUESTIONED_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.CompletionCriteriaImpl <em>Completion Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CompletionCriteriaImpl
	 * @see generator.impl.GeneratorPackageImpl#getCompletionCriteria()
	 * @generated
	 */
	int COMPLETION_CRITERIA = 53;

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
	int LEVELS_DIFFICULTY_PROGRESS = 54;

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
	int CURRENT_GAME_LEVEL = 55;

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
	 * The meta object id for the '{@link generator.impl.GameElementsImpl <em>Game Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameElementsImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameElements()
	 * @generated
	 */
	int GAME_ELEMENTS = 56;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS__EQUIPMENTS = 0;

	/**
	 * The feature id for the '<em><b>Gameplay Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS__GAMEPLAY_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Game Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CoreGPElementsImpl <em>Core GP Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CoreGPElementsImpl
	 * @see generator.impl.GeneratorPackageImpl#getCoreGPElements()
	 * @generated
	 */
	int CORE_GP_ELEMENTS = 57;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENTS__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Core GP Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Core GP Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.EquipmentsImpl <em>Equipments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentsImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipments()
	 * @generated
	 */
	int EQUIPMENTS = 58;

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
	 * The meta object id for the '{@link generator.impl.CoreGPElementImpl <em>Core GP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CoreGPElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getCoreGPElement()
	 * @generated
	 */
	int CORE_GP_ELEMENT = 59;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENT__ABILITY = 2;

	/**
	 * The number of structural features of the '<em>Core GP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Core GP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 60;

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
	 * The meta object id for the '{@link generator.impl.AnswerElementsImpl <em>Answer Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AnswerElementsImpl
	 * @see generator.impl.GeneratorPackageImpl#getAnswerElements()
	 * @generated
	 */
	int ANSWER_ELEMENTS = 61;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS__ID = CORE_GP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS__TYPE = CORE_GP_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS__ABILITY = CORE_GP_ELEMENT__ABILITY;

	/**
	 * The feature id for the '<em><b>Single Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS__SINGLE_ANSWER = CORE_GP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS_FEATURE_COUNT = CORE_GP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Answer Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_ELEMENTS_OPERATION_COUNT = CORE_GP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PositionedElementImpl <em>Positioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionedElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getPositionedElement()
	 * @generated
	 */
	int POSITIONED_ELEMENT = 67;

	/**
	 * The number of structural features of the '<em>Positioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Positioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.UniqueAnswerElementImpl <em>Unique Answer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.UniqueAnswerElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getUniqueAnswerElement()
	 * @generated
	 */
	int UNIQUE_ANSWER_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER_ELEMENT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unique Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ANSWER_ELEMENT_OPERATION_COUNT = POSITIONED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ManyAnswerElementImpl <em>Many Answer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ManyAnswerElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getManyAnswerElement()
	 * @generated
	 */
	int MANY_ANSWER_ELEMENT = 63;

	/**
	 * The feature id for the '<em><b>Display Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_ANSWER_ELEMENT__DISPLAY_VALUES = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_ANSWER_ELEMENT__RIGHT_VALUE = POSITIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Many Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_ANSWER_ELEMENT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Many Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_ANSWER_ELEMENT_OPERATION_COUNT = POSITIONED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.NonAnswerElementImpl <em>Non Answer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.NonAnswerElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getNonAnswerElement()
	 * @generated
	 */
	int NON_ANSWER_ELEMENT = 64;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ANSWER_ELEMENT__ID = CORE_GP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ANSWER_ELEMENT__TYPE = CORE_GP_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ANSWER_ELEMENT__ABILITY = CORE_GP_ELEMENT__ABILITY;

	/**
	 * The number of structural features of the '<em>Non Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ANSWER_ELEMENT_FEATURE_COUNT = CORE_GP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ANSWER_ELEMENT_OPERATION_COUNT = CORE_GP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplayImpl <em>Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplay()
	 * @generated
	 */
	int GAMEPLAY = 65;

	/**
	 * The feature id for the '<em><b>Quantified Elements By Ability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__QUANTIFIED_ELEMENTS_BY_ABILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuantifiedElementsByAbilityImpl <em>Quantified Elements By Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuantifiedElementsByAbilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuantifiedElementsByAbility()
	 * @generated
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY = 66;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY__ABILITY = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY__MAX = 2;

	/**
	 * The number of structural features of the '<em>Quantified Elements By Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Quantified Elements By Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_ELEMENTS_BY_ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplaysImpl <em>Gameplays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplaysImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplays()
	 * @generated
	 */
	int GAMEPLAYS = 68;

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
	int QUESTIONABLE_FACT_RESULT = 69;

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
	 * The meta object id for the '{@link generator.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Directions
	 * @see generator.impl.GeneratorPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 70;

	/**
	 * The meta object id for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.DungeonMode
	 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
	 * @generated
	 */
	int DUNGEON_MODE = 71;

	/**
	 * The meta object id for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TableBuild
	 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 72;

	/**
	 * The meta object id for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ResultPosition
	 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 73;

	/**
	 * The meta object id for the '{@link generator.ESingleTarget <em>ESingle Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESingleTarget
	 * @see generator.impl.GeneratorPackageImpl#getESingleTarget()
	 * @generated
	 */
	int ESINGLE_TARGET = 74;

	/**
	 * The meta object id for the '{@link generator.ETaskType <em>ETask Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ETaskType
	 * @see generator.impl.GeneratorPackageImpl#getETaskType()
	 * @generated
	 */
	int ETASK_TYPE = 75;

	/**
	 * The meta object id for the '{@link generator.EModality <em>EModality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EModality
	 * @see generator.impl.GeneratorPackageImpl#getEModality()
	 * @generated
	 */
	int EMODALITY = 76;

	/**
	 * The meta object id for the '{@link generator.ESeveralTarget <em>ESeveral Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESeveralTarget
	 * @see generator.impl.GeneratorPackageImpl#getESeveralTarget()
	 * @generated
	 */
	int ESEVERAL_TARGET = 77;

	/**
	 * The meta object id for the '{@link generator.Effect <em>Effect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Effect
	 * @see generator.impl.GeneratorPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 78;

	/**
	 * The meta object id for the '{@link generator.Ability <em>Ability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Ability
	 * @see generator.impl.GeneratorPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 79;

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
	 * Returns the meta object for the reference '{@link generator.QuestionedFact#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.QuestionedFact#getPosition()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EReference getQuestionedFact_Position();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionedFact#getQuestionText <em>Question Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Text</em>'.
	 * @see generator.QuestionedFact#getQuestionText()
	 * @see #getQuestionedFact()
	 * @generated
	 */
	EAttribute getQuestionedFact_QuestionText();

	/**
	 * Returns the meta object for the '{@link generator.QuestionedFact#setQuestionText() <em>Set Question Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Question Text</em>' operation.
	 * @see generator.QuestionedFact#setQuestionText()
	 * @generated
	 */
	EOperation getQuestionedFact__SetQuestionText();

	/**
	 * Returns the meta object for class '{@link generator.MTQeFCompletion1 <em>MT Qe FCompletion1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Qe FCompletion1</em>'.
	 * @see generator.MTQeFCompletion1
	 * @generated
	 */
	EClass getMTQeFCompletion1();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTQeFCompletion1#getPropositions <em>Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Propositions</em>'.
	 * @see generator.MTQeFCompletion1#getPropositions()
	 * @see #getMTQeFCompletion1()
	 * @generated
	 */
	EAttribute getMTQeFCompletion1_Propositions();

	/**
	 * Returns the meta object for class '{@link generator.MTQeFCompletion2 <em>MT Qe FCompletion2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Qe FCompletion2</em>'.
	 * @see generator.MTQeFCompletion2
	 * @generated
	 */
	EClass getMTQeFCompletion2();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTQeFCompletion2#getPropositions <em>Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Propositions</em>'.
	 * @see generator.MTQeFCompletion2#getPropositions()
	 * @see #getMTQeFCompletion2()
	 * @generated
	 */
	EAttribute getMTQeFCompletion2_Propositions();

	/**
	 * Returns the meta object for class '{@link generator.MTQeFRebuild <em>MT Qe FRebuild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Qe FRebuild</em>'.
	 * @see generator.MTQeFRebuild
	 * @generated
	 */
	EClass getMTQeFRebuild();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTQeFRebuild#getPropositions <em>Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Propositions</em>'.
	 * @see generator.MTQeFRebuild#getPropositions()
	 * @see #getMTQeFRebuild()
	 * @generated
	 */
	EAttribute getMTQeFRebuild_Propositions();

	/**
	 * Returns the meta object for class '{@link generator.MTQeFIdentification <em>MT Qe FIdentification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Qe FIdentification</em>'.
	 * @see generator.MTQeFIdentification
	 * @generated
	 */
	EClass getMTQeFIdentification();

	/**
	 * Returns the meta object for class '{@link generator.MTQeFMembership <em>MT Qe FMembership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Qe FMembership</em>'.
	 * @see generator.MTQeFMembership
	 * @generated
	 */
	EClass getMTQeFMembership();

	/**
	 * Returns the meta object for the attribute list '{@link generator.MTQeFMembership#getBadPropositions <em>Bad Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bad Propositions</em>'.
	 * @see generator.MTQeFMembership#getBadPropositions()
	 * @see #getMTQeFMembership()
	 * @generated
	 */
	EAttribute getMTQeFMembership_BadPropositions();

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
	 * Returns the meta object for class '{@link generator.GameElements <em>Game Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Elements</em>'.
	 * @see generator.GameElements
	 * @generated
	 */
	EClass getGameElements();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GameElements#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equipments</em>'.
	 * @see generator.GameElements#getEquipments()
	 * @see #getGameElements()
	 * @generated
	 */
	EReference getGameElements_Equipments();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameElements#getGameplayElements <em>Gameplay Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameplay Elements</em>'.
	 * @see generator.GameElements#getGameplayElements()
	 * @see #getGameElements()
	 * @generated
	 */
	EReference getGameElements_GameplayElements();

	/**
	 * Returns the meta object for class '{@link generator.CoreGPElements <em>Core GP Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core GP Elements</em>'.
	 * @see generator.CoreGPElements
	 * @generated
	 */
	EClass getCoreGPElements();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.CoreGPElements#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see generator.CoreGPElements#getElements()
	 * @see #getCoreGPElements()
	 * @generated
	 */
	EReference getCoreGPElements_Elements();

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
	 * Returns the meta object for class '{@link generator.CoreGPElement <em>Core GP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core GP Element</em>'.
	 * @see generator.CoreGPElement
	 * @generated
	 */
	EClass getCoreGPElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.CoreGPElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.CoreGPElement#getID()
	 * @see #getCoreGPElement()
	 * @generated
	 */
	EAttribute getCoreGPElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.CoreGPElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.CoreGPElement#getType()
	 * @see #getCoreGPElement()
	 * @generated
	 */
	EAttribute getCoreGPElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.CoreGPElement#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see generator.CoreGPElement#getAbility()
	 * @see #getCoreGPElement()
	 * @generated
	 */
	EAttribute getCoreGPElement_Ability();

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
	 * Returns the meta object for class '{@link generator.AnswerElements <em>Answer Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Elements</em>'.
	 * @see generator.AnswerElements
	 * @generated
	 */
	EClass getAnswerElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.AnswerElements#isSingleAnswer <em>Single Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Answer</em>'.
	 * @see generator.AnswerElements#isSingleAnswer()
	 * @see #getAnswerElements()
	 * @generated
	 */
	EAttribute getAnswerElements_SingleAnswer();

	/**
	 * Returns the meta object for class '{@link generator.UniqueAnswerElement <em>Unique Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Answer Element</em>'.
	 * @see generator.UniqueAnswerElement
	 * @generated
	 */
	EClass getUniqueAnswerElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.UniqueAnswerElement#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Value</em>'.
	 * @see generator.UniqueAnswerElement#getDisplayValue()
	 * @see #getUniqueAnswerElement()
	 * @generated
	 */
	EAttribute getUniqueAnswerElement_DisplayValue();

	/**
	 * Returns the meta object for class '{@link generator.ManyAnswerElement <em>Many Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Answer Element</em>'.
	 * @see generator.ManyAnswerElement
	 * @generated
	 */
	EClass getManyAnswerElement();

	/**
	 * Returns the meta object for the attribute list '{@link generator.ManyAnswerElement#getDisplayValues <em>Display Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Display Values</em>'.
	 * @see generator.ManyAnswerElement#getDisplayValues()
	 * @see #getManyAnswerElement()
	 * @generated
	 */
	EAttribute getManyAnswerElement_DisplayValues();

	/**
	 * Returns the meta object for the attribute '{@link generator.ManyAnswerElement#getRightValue <em>Right Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Value</em>'.
	 * @see generator.ManyAnswerElement#getRightValue()
	 * @see #getManyAnswerElement()
	 * @generated
	 */
	EAttribute getManyAnswerElement_RightValue();

	/**
	 * Returns the meta object for class '{@link generator.NonAnswerElement <em>Non Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Answer Element</em>'.
	 * @see generator.NonAnswerElement
	 * @generated
	 */
	EClass getNonAnswerElement();

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
	 * Returns the meta object for the containment reference list '{@link generator.Gameplay#getQuantifiedElementsByAbility <em>Quantified Elements By Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantified Elements By Ability</em>'.
	 * @see generator.Gameplay#getQuantifiedElementsByAbility()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_QuantifiedElementsByAbility();

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
	 * Returns the meta object for class '{@link generator.QuantifiedElementsByAbility <em>Quantified Elements By Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Elements By Ability</em>'.
	 * @see generator.QuantifiedElementsByAbility
	 * @generated
	 */
	EClass getQuantifiedElementsByAbility();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuantifiedElementsByAbility#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see generator.QuantifiedElementsByAbility#getAbility()
	 * @see #getQuantifiedElementsByAbility()
	 * @generated
	 */
	EAttribute getQuantifiedElementsByAbility_Ability();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuantifiedElementsByAbility#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see generator.QuantifiedElementsByAbility#getMin()
	 * @see #getQuantifiedElementsByAbility()
	 * @generated
	 */
	EAttribute getQuantifiedElementsByAbility_Min();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuantifiedElementsByAbility#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see generator.QuantifiedElementsByAbility#getMax()
	 * @see #getQuantifiedElementsByAbility()
	 * @generated
	 */
	EAttribute getQuantifiedElementsByAbility_Max();

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
	 * Returns the meta object for enum '{@link generator.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect</em>'.
	 * @see generator.Effect
	 * @generated
	 */
	EEnum getEffect();

	/**
	 * Returns the meta object for enum '{@link generator.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ability</em>'.
	 * @see generator.Ability
	 * @generated
	 */
	EEnum getAbility();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

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
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONED_FACT__POSITION = eINSTANCE.getQuestionedFact_Position();

		/**
		 * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONED_FACT__QUESTION_TEXT = eINSTANCE.getQuestionedFact_QuestionText();

		/**
		 * The meta object literal for the '<em><b>Set Question Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTIONED_FACT___SET_QUESTION_TEXT = eINSTANCE.getQuestionedFact__SetQuestionText();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQeFCompletion1Impl <em>MT Qe FCompletion1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQeFCompletion1Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTQeFCompletion1()
		 * @generated
		 */
		EClass MT_QE_FCOMPLETION1 = eINSTANCE.getMTQeFCompletion1();

		/**
		 * The meta object literal for the '<em><b>Propositions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_QE_FCOMPLETION1__PROPOSITIONS = eINSTANCE.getMTQeFCompletion1_Propositions();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQeFCompletion2Impl <em>MT Qe FCompletion2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQeFCompletion2Impl
		 * @see generator.impl.GeneratorPackageImpl#getMTQeFCompletion2()
		 * @generated
		 */
		EClass MT_QE_FCOMPLETION2 = eINSTANCE.getMTQeFCompletion2();

		/**
		 * The meta object literal for the '<em><b>Propositions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_QE_FCOMPLETION2__PROPOSITIONS = eINSTANCE.getMTQeFCompletion2_Propositions();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQeFRebuildImpl <em>MT Qe FRebuild</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQeFRebuildImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQeFRebuild()
		 * @generated
		 */
		EClass MT_QE_FREBUILD = eINSTANCE.getMTQeFRebuild();

		/**
		 * The meta object literal for the '<em><b>Propositions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_QE_FREBUILD__PROPOSITIONS = eINSTANCE.getMTQeFRebuild_Propositions();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQeFIdentificationImpl <em>MT Qe FIdentification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQeFIdentificationImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQeFIdentification()
		 * @generated
		 */
		EClass MT_QE_FIDENTIFICATION = eINSTANCE.getMTQeFIdentification();

		/**
		 * The meta object literal for the '{@link generator.impl.MTQeFMembershipImpl <em>MT Qe FMembership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MTQeFMembershipImpl
		 * @see generator.impl.GeneratorPackageImpl#getMTQeFMembership()
		 * @generated
		 */
		EClass MT_QE_FMEMBERSHIP = eINSTANCE.getMTQeFMembership();

		/**
		 * The meta object literal for the '<em><b>Bad Propositions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_QE_FMEMBERSHIP__BAD_PROPOSITIONS = eINSTANCE.getMTQeFMembership_BadPropositions();

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
		 * The meta object literal for the '{@link generator.impl.GameElementsImpl <em>Game Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameElementsImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameElements()
		 * @generated
		 */
		EClass GAME_ELEMENTS = eINSTANCE.getGameElements();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ELEMENTS__EQUIPMENTS = eINSTANCE.getGameElements_Equipments();

		/**
		 * The meta object literal for the '<em><b>Gameplay Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ELEMENTS__GAMEPLAY_ELEMENTS = eINSTANCE.getGameElements_GameplayElements();

		/**
		 * The meta object literal for the '{@link generator.impl.CoreGPElementsImpl <em>Core GP Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CoreGPElementsImpl
		 * @see generator.impl.GeneratorPackageImpl#getCoreGPElements()
		 * @generated
		 */
		EClass CORE_GP_ELEMENTS = eINSTANCE.getCoreGPElements();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_GP_ELEMENTS__ELEMENTS = eINSTANCE.getCoreGPElements_Elements();

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
		 * The meta object literal for the '{@link generator.impl.CoreGPElementImpl <em>Core GP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CoreGPElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getCoreGPElement()
		 * @generated
		 */
		EClass CORE_GP_ELEMENT = eINSTANCE.getCoreGPElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_GP_ELEMENT__ID = eINSTANCE.getCoreGPElement_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_GP_ELEMENT__TYPE = eINSTANCE.getCoreGPElement_Type();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_GP_ELEMENT__ABILITY = eINSTANCE.getCoreGPElement_Ability();

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
		 * The meta object literal for the '{@link generator.impl.AnswerElementsImpl <em>Answer Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AnswerElementsImpl
		 * @see generator.impl.GeneratorPackageImpl#getAnswerElements()
		 * @generated
		 */
		EClass ANSWER_ELEMENTS = eINSTANCE.getAnswerElements();

		/**
		 * The meta object literal for the '<em><b>Single Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_ELEMENTS__SINGLE_ANSWER = eINSTANCE.getAnswerElements_SingleAnswer();

		/**
		 * The meta object literal for the '{@link generator.impl.UniqueAnswerElementImpl <em>Unique Answer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.UniqueAnswerElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getUniqueAnswerElement()
		 * @generated
		 */
		EClass UNIQUE_ANSWER_ELEMENT = eINSTANCE.getUniqueAnswerElement();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE = eINSTANCE.getUniqueAnswerElement_DisplayValue();

		/**
		 * The meta object literal for the '{@link generator.impl.ManyAnswerElementImpl <em>Many Answer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ManyAnswerElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getManyAnswerElement()
		 * @generated
		 */
		EClass MANY_ANSWER_ELEMENT = eINSTANCE.getManyAnswerElement();

		/**
		 * The meta object literal for the '<em><b>Display Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_ANSWER_ELEMENT__DISPLAY_VALUES = eINSTANCE.getManyAnswerElement_DisplayValues();

		/**
		 * The meta object literal for the '<em><b>Right Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_ANSWER_ELEMENT__RIGHT_VALUE = eINSTANCE.getManyAnswerElement_RightValue();

		/**
		 * The meta object literal for the '{@link generator.impl.NonAnswerElementImpl <em>Non Answer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.NonAnswerElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getNonAnswerElement()
		 * @generated
		 */
		EClass NON_ANSWER_ELEMENT = eINSTANCE.getNonAnswerElement();

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
		 * The meta object literal for the '<em><b>Quantified Elements By Ability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__QUANTIFIED_ELEMENTS_BY_ABILITY = eINSTANCE.getGameplay_QuantifiedElementsByAbility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__NAME = eINSTANCE.getGameplay_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.QuantifiedElementsByAbilityImpl <em>Quantified Elements By Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuantifiedElementsByAbilityImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuantifiedElementsByAbility()
		 * @generated
		 */
		EClass QUANTIFIED_ELEMENTS_BY_ABILITY = eINSTANCE.getQuantifiedElementsByAbility();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_ELEMENTS_BY_ABILITY__ABILITY = eINSTANCE.getQuantifiedElementsByAbility_Ability();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_ELEMENTS_BY_ABILITY__MIN = eINSTANCE.getQuantifiedElementsByAbility_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_ELEMENTS_BY_ABILITY__MAX = eINSTANCE.getQuantifiedElementsByAbility_Max();

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
		 * The meta object literal for the '{@link generator.Effect <em>Effect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.Effect
		 * @see generator.impl.GeneratorPackageImpl#getEffect()
		 * @generated
		 */
		EEnum EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '{@link generator.Ability <em>Ability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.Ability
		 * @see generator.impl.GeneratorPackageImpl#getAbility()
		 * @generated
		 */
		EEnum ABILITY = eINSTANCE.getAbility();

	}

} //GeneratorPackage
