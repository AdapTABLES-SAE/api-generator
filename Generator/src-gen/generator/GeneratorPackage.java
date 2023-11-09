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
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FACT__REPRESENTATION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FACT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS__VISUALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Set Of Facts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_FACTS_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Learner Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__LEARNER_PLAYER = 6;

	/**
	 * The feature id for the '<em><b>Curses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__CURSES = 7;

	/**
	 * The number of structural features of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NB_EXPECTED_ANSWERS = 8;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Directions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_DIRECTIONS = 0;

	/**
	 * The operation id for the '<em>Is Entry Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___IS_ENTRY_ROOM_TYPE = 1;

	/**
	 * The operation id for the '<em>Is Exit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___IS_EXIT_ROOM_TYPE = 2;

	/**
	 * The operation id for the '<em>Is Question Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___IS_QUESTION_ROOM_TYPE = 3;

	/**
	 * The operation id for the '<em>Is Trap Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___IS_TRAP_ROOM_TYPE = 4;

	/**
	 * The operation id for the '<em>Is Portal Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___IS_PORTAL_ROOM_TYPE = 5;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 6;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__TYPE = ROOM_TYPE__TYPE;

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
	 * The operation id for the '<em>Is Entry Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___IS_ENTRY_ROOM_TYPE = ROOM_TYPE___IS_ENTRY_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Exit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___IS_EXIT_ROOM_TYPE = ROOM_TYPE___IS_EXIT_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Question Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___IS_QUESTION_ROOM_TYPE = ROOM_TYPE___IS_QUESTION_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Trap Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___IS_TRAP_ROOM_TYPE = ROOM_TYPE___IS_TRAP_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Portal Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE___IS_PORTAL_ROOM_TYPE = ROOM_TYPE___IS_PORTAL_ROOM_TYPE;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__TYPE = ROOM_TYPE__TYPE;

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
	 * The operation id for the '<em>Is Entry Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___IS_ENTRY_ROOM_TYPE = ROOM_TYPE___IS_ENTRY_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Exit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___IS_EXIT_ROOM_TYPE = ROOM_TYPE___IS_EXIT_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Question Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___IS_QUESTION_ROOM_TYPE = ROOM_TYPE___IS_QUESTION_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Trap Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___IS_TRAP_ROOM_TYPE = ROOM_TYPE___IS_TRAP_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Is Portal Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE___IS_PORTAL_ROOM_TYPE = ROOM_TYPE___IS_PORTAL_ROOM_TYPE;

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
	 * The feature id for the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__SUCCESS_PERCENT = 0;

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
	 * The meta object id for the '{@link generator.ATask <em>ATask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ATask
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
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___GET_NB_EXPECTED_ANSWERS = 1;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___IS_GRAPHIC_TASK = 2;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___IS_CHECK_ON_LEARNER_ACTION = 3;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK___IS_NO_STATEMENT_TASK = 4;

	/**
	 * The number of operations of the '<em>ATask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATASK_OPERATION_COUNT = 5;

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
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___IS_GRAPHIC_TASK = ATASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___IS_NO_STATEMENT_TASK = ATASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___GET_NB_MISSING_ELEMENTS = ATASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS = ATASK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Completion Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>MT Completion1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION1_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ClassroomImpl <em>Classroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ClassroomImpl
	 * @see generator.impl.GeneratorPackageImpl#getClassroom()
	 * @generated
	 */
	int CLASSROOM = 18;

	/**
	 * The feature id for the '<em><b>Gamecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__GAMECONTEXT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Learner Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__LEARNER_PLAYERS = 3;

	/**
	 * The number of structural features of the '<em>Classroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Classroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__STATISTICS = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__LAST_NAME = 5;

	/**
	 * The number of structural features of the '<em>Learner Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Player Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION__PLAYER_PROGRESS = 0;

	/**
	 * The feature id for the '<em><b>Learner Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESSION__LEARNER_PROGRESS = 1;

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
	 * The feature id for the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OBJECTIVE_LEVEL__SUCCESS_PERCENT = 5;

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
	 * The meta object id for the '{@link generator.impl.DynamicMultipleChoiceImpl <em>Dynamic Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DynamicMultipleChoiceImpl
	 * @see generator.impl.GeneratorPackageImpl#getDynamicMultipleChoice()
	 * @generated
	 */
	int DYNAMIC_MULTIPLE_CHOICE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MULTIPLE_CHOICE__TYPE = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Bad Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MULTIPLE_CHOICE__NB_BAD_CHOICES = RESPONSE_MODALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MULTIPLE_CHOICE_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamic Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MULTIPLE_CHOICE_OPERATION_COUNT = RESPONSE_MODALITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__CHECK_ON_LEARNER_ACTION = ATASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK__NO_STATEMENT_TASK = ATASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identification Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___IS_GRAPHIC_TASK = ATASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___IS_NO_STATEMENT_TASK = ATASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK___GET_NB_EXPECTED_ANSWERS = ATASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identification Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION = ATASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK__NO_STATEMENT_TASK = ATASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Membership ID Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___IS_GRAPHIC_TASK = ATASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___IS_NO_STATEMENT_TASK = ATASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS = ATASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Membership ID Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_ID_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MT Completion2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_COMPLETION2___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Recontruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_RECONTRUCTION___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__CHECK_ON_LEARNER_ACTION = IDENTIFICATION_TASK__CHECK_ON_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION__NO_STATEMENT_TASK = IDENTIFICATION_TASK__NO_STATEMENT_TASK;

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
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___IS_GRAPHIC_TASK = IDENTIFICATION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___IS_CHECK_ON_LEARNER_ACTION = IDENTIFICATION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___IS_NO_STATEMENT_TASK = IDENTIFICATION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_IDENTIFICATION___GET_NB_EXPECTED_ANSWERS = IDENTIFICATION_TASK___GET_NB_EXPECTED_ANSWERS;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP__NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK__NO_STATEMENT_TASK;

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
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___IS_GRAPHIC_TASK = MEMBERSHIP_ID_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___IS_CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___IS_NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_MEMBERSHIP___GET_NB_EXPECTED_ANSWERS = MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS;

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
	 * The feature id for the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_BY_TASK__SUCCESS_PERCENT = 2;

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
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

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
	 * The meta object id for the '{@link generator.impl.AQuestionableFactImpl <em>AQuestionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AQuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getAQuestionableFact()
	 * @generated
	 */
	int AQUESTIONABLE_FACT = 112;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT__WAS_SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT__ACHIEVED = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT__RESULTS = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT__ID = 3;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT__QUESTION_WITH_IMAGE = 4;

	/**
	 * The number of structural features of the '<em>AQuestionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>AQuestionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTIONABLE_FACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionableFactImpl <em>Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionableFact()
	 * @generated
	 */
	int QUESTIONABLE_FACT = 37;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__WAS_SELECTED = AQUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__ACHIEVED = AQUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__RESULTS = AQUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__ID = AQUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT__QUESTION_WITH_IMAGE = AQUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The number of structural features of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_FEATURE_COUNT = AQUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT = AQUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT___GET_COMPLETE_FACT = AQUESTIONABLE_FACT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_OPERATION_COUNT = AQUESTIONABLE_FACT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link generator.impl.MTQFCompletion1Impl <em>MTQF Completion1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MTQFCompletion1Impl
	 * @see generator.impl.GeneratorPackageImpl#getMTQFCompletion1()
	 * @generated
	 */
	int MTQF_COMPLETION1 = 38;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION1__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

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
	int MTQF_COMPLETION2 = 39;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_COMPLETION2__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

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
	int MTQF_REBUILD = 40;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_REBUILD__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

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
	int MTQF_IDENTIFICATION = 41;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_IDENTIFICATION__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

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
	int MTQF_MEMBERSHIP = 42;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_MEMBERSHIP__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

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
	int QUESTIONED_FACT = 43;

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
	 * The feature id for the '<em><b>Fact Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT__FACT_CORRECTNESS = 6;

	/**
	 * The number of structural features of the '<em>Questioned Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONED_FACT_FEATURE_COUNT = 7;

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
	int COMPLETION_CRITERIA = 44;

	/**
	 * The feature id for the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CRITERIA__SUCCESS_PERCENT = 0;

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
	int LEVELS_DIFFICULTY_PROGRESS = 45;

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
	 * The feature id for the '<em><b>Curses Availabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES = 4;

	/**
	 * The number of structural features of the '<em>Levels Difficulty Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Levels Difficulty Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_DIFFICULTY_PROGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameElementTypesImpl <em>Game Element Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameElementTypesImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameElementTypes()
	 * @generated
	 */
	int GAME_ELEMENT_TYPES = 46;

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
	 * The feature id for the '<em><b>Curses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES__CURSES = 2;

	/**
	 * The number of structural features of the '<em>Game Element Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENT_TYPES_FEATURE_COUNT = 3;

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
	int ELEMENTS_TYPES = 47;

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
	int EQUIPMENTS = 48;

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
	 * The meta object id for the '{@link generator.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.EquipmentImpl
	 * @see generator.impl.GeneratorPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 49;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Locked Abilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__LOCKED_ABILITIES = 1;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 2;

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
	int GAMEPLAY = 50;

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
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__LOCKED = 4;

	/**
	 * The number of structural features of the '<em>Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY_FEATURE_COUNT = 5;

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
	int GAMEPLAYS = 51;

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
	int QUESTIONABLE_FACT_RESULT = 52;

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
	 * The feature id for the '<em><b>On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT__ON_TIME = 3;

	/**
	 * The number of structural features of the '<em>Questionable Fact Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FACT_RESULT_FEATURE_COUNT = 4;

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
	int ABILITY = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Locking Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__LOCKING_EQUIPMENT = 1;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 2;

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
	int ABILITIES = 54;

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
	 * The meta object id for the '{@link generator.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionImpl
	 * @see generator.impl.GeneratorPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 55;

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
	int POSITIONED_ELEMENT = 56;

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
	 * The feature id for the '<em><b>Expected Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__EXPECTED_ANSWER = 4;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__FACT = 5;

	/**
	 * The feature id for the '<em><b>Accepted Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__ACCEPTED_FACTS = 6;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__ELEMENT_TYPE = 7;

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
	int PARAMETER = 57;

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
	 * The meta object id for the '{@link generator.impl.AQuestionParamImpl <em>AQuestion Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AQuestionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getAQuestionParam()
	 * @generated
	 */
	int AQUESTION_PARAM = 104;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTION_PARAM__VALUE = PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>AQuestion Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AQuestion Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUESTION_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionParamImpl <em>Question Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionParam()
	 * @generated
	 */
	int QUESTION_PARAM = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__VALUE = AQUESTION_PARAM__VALUE;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__INTERACTIVE = AQUESTION_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__SOLUTIONS = AQUESTION_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__COMPLETE_FACT = AQUESTION_PARAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM__IMAGE = AQUESTION_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM_FEATURE_COUNT = AQUESTION_PARAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PARAM_OPERATION_COUNT = AQUESTION_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PropositionParamImpl <em>Proposition Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PropositionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getPropositionParam()
	 * @generated
	 */
	int PROPOSITION_PARAM = 59;

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
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM__POSITION = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM__IMAGE = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Proposition Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

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
	int AVALUE = 71;

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
	int VALUE = 60;

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
	int CORRECTNESS = 61;

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
	int ENTRY_SOLUCE_PARAM = 62;

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
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM__POSITION = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Soluce Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entry Soluce Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SOLUCE_PARAM_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DisplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 63;

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
	 * The feature id for the '<em><b>Image Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IMAGE_DISPLAY = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

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
	int ACOMPONENT = 64;

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
	 * The feature id for the '<em><b>For Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT__FOR_PROPOSITION = 2;

	/**
	 * The feature id for the '<em><b>For Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT__FOR_STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>AComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_FEATURE_COUNT = 4;

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
	int STRUCTURE = 65;

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
	 * The feature id for the '<em><b>For Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FOR_PROPOSITION = ACOMPONENT__FOR_PROPOSITION;

	/**
	 * The feature id for the '<em><b>For Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FOR_STATEMENT = ACOMPONENT__FOR_STATEMENT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMPONENTS = ACOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternate Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ALTERNATE_COMPONENTS = ACOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FOR_FACT = ACOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FOR_MAP = ACOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = ACOMPONENT_FEATURE_COUNT + 4;

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
	int COMPONENT = 66;

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
	 * The feature id for the '<em><b>For Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FOR_PROPOSITION = ACOMPONENT__FOR_PROPOSITION;

	/**
	 * The feature id for the '<em><b>For Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FOR_STATEMENT = ACOMPONENT__FOR_STATEMENT;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DISPLAY_VALUE = ACOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DEFAULT_CORRECTNESS = ACOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUT_ENTRY = ACOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__QUANTITY = ACOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ACOMPONENT_FEATURE_COUNT + 4;

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
	int QUANTITY = 67;

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
	int WANTED_ANSWERS_PARAM = 68;

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
	int EXPECTED_ANSWER = 69;

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
	int CORRECTNESS_VALUE = 70;

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
	int POSITIONED_STRUCTURE_ELEMENT = 72;

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
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_STRUCTURE_ELEMENT__ELEMENT_TYPE = POSITIONED_ELEMENT__ELEMENT_TYPE;

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
	int FACT_SOLUTION_PARAM = 73;

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
	int ORDERING_TASK = 74;

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
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__CHECK_ON_LEARNER_ACTION = ATASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK__NO_STATEMENT_TASK = ATASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ordering Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK_FEATURE_COUNT = ATASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___GET_TYPE = ATASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___IS_GRAPHIC_TASK = ATASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___IS_CHECK_ON_LEARNER_ACTION = ATASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___IS_NO_STATEMENT_TASK = ATASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK___GET_NB_EXPECTED_ANSWERS = ATASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordering Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TASK_OPERATION_COUNT = ATASK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.impl.PromptImpl <em>Prompt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PromptImpl
	 * @see generator.impl.GeneratorPackageImpl#getPrompt()
	 * @generated
	 */
	int PROMPT = 75;

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
	int FACT_CORRECTNESS_PARAM = 76;

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
	int GAMEPLAY_TASK_RELATIONS = 77;

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
	int RELATION = 78;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TASK = 0;

	/**
	 * The feature id for the '<em><b>Gameplays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GAMEPLAYS = 1;

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
	int CONDITION = 79;

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
	int QUESTION_GAMEPLAY = 80;

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
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__LOCKED = GAMEPLAY__LOCKED;

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
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY__STATEMENT_TYPE = GAMEPLAY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Question Gameplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GAMEPLAY_FEATURE_COUNT = GAMEPLAY_FEATURE_COUNT + 5;

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
	int NO_QUESTION_GAMEPLAY = 81;

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
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_GAMEPLAY__LOCKED = GAMEPLAY__LOCKED;

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
	int SIZE = 82;

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
	 * The meta object id for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 89;

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
	 * The feature id for the '<em><b>Nb Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NB_DISPLAYS = 3;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ABILITY = 4;

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
	 * The meta object id for the '{@link generator.impl.StatementElementTypeImpl <em>Statement Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.StatementElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getStatementElementType()
	 * @generated
	 */
	int STATEMENT_ELEMENT_TYPE = 83;

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
	 * The feature id for the '<em><b>Nb Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__NB_DISPLAYS = ELEMENT_TYPE__NB_DISPLAYS;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ELEMENT_TYPE__ABILITY = ELEMENT_TYPE__ABILITY;

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
	 * The meta object id for the '{@link generator.impl.PlayerProgressImpl <em>Player Progress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PlayerProgressImpl
	 * @see generator.impl.GeneratorPackageImpl#getPlayerProgress()
	 * @generated
	 */
	int PLAYER_PROGRESS = 84;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROGRESS__CURRENT_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Coins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROGRESS__COINS = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROGRESS__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Player Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROGRESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LearnerProgressImpl <em>Learner Progress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearnerProgressImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearnerProgress()
	 * @generated
	 */
	int LEARNER_PROGRESS = 85;

	/**
	 * The feature id for the '<em><b>Currentobjectivelevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PROGRESS__CURRENTOBJECTIVELEVELS = 0;

	/**
	 * The number of structural features of the '<em>Learner Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PROGRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Learner Progress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PROGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ItemImpl
	 * @see generator.impl.GeneratorPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 86;

	/**
	 * The feature id for the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BOUGHT = 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ACTIVATED = 1;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EQUIPMENT = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ItemsImpl <em>Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ItemsImpl
	 * @see generator.impl.GeneratorPackageImpl#getItems()
	 * @generated
	 */
	int ITEMS = 87;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.StatisticsImpl
	 * @see generator.impl.GeneratorPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 88;

	/**
	 * The feature id for the '<em><b>Nb Correct Given Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_CORRECT_GIVEN_ANSWERS = 0;

	/**
	 * The feature id for the '<em><b>Nb Questions Encountered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_QUESTIONS_ENCOUNTERED = 1;

	/**
	 * The feature id for the '<em><b>Max Game Level Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MAX_GAME_LEVEL_REACHED = 2;

	/**
	 * The feature id for the '<em><b>Total Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__TOTAL_TIME_MIN = 3;

	/**
	 * The feature id for the '<em><b>Nb Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_DEATHS = 4;

	/**
	 * The feature id for the '<em><b>Nb Levels Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_LEVELS_GENERATED = 5;

	/**
	 * The feature id for the '<em><b>Nb Finished Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_FINISHED_LEVELS = 6;

	/**
	 * The feature id for the '<em><b>Nb Unfinished Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NB_UNFINISHED_LEVELS = 7;

	/**
	 * The feature id for the '<em><b>Total Coins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__TOTAL_COINS = 8;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CursesImpl <em>Curses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CursesImpl
	 * @see generator.impl.GeneratorPackageImpl#getCurses()
	 * @generated
	 */
	int CURSES = 90;

	/**
	 * The feature id for the '<em><b>Curses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSES__CURSES = 0;

	/**
	 * The number of structural features of the '<em>Curses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Curses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.CurseImpl <em>Curse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CurseImpl
	 * @see generator.impl.GeneratorPackageImpl#getCurse()
	 * @generated
	 */
	int CURSE = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Curse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Curse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LabyrinthCurseImpl <em>Labyrinth Curse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LabyrinthCurseImpl
	 * @see generator.impl.GeneratorPackageImpl#getLabyrinthCurse()
	 * @generated
	 */
	int LABYRINTH_CURSE = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABYRINTH_CURSE__NAME = CURSE__NAME;

	/**
	 * The number of structural features of the '<em>Labyrinth Curse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABYRINTH_CURSE_FEATURE_COUNT = CURSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Labyrinth Curse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABYRINTH_CURSE_OPERATION_COUNT = CURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.CurseEligibilityImpl <em>Curse Eligibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CurseEligibilityImpl
	 * @see generator.impl.GeneratorPackageImpl#getCurseEligibility()
	 * @generated
	 */
	int CURSE_ELIGIBILITY = 93;

	/**
	 * The feature id for the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_ELIGIBILITY__START_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Curse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_ELIGIBILITY__CURSE = 1;

	/**
	 * The number of structural features of the '<em>Curse Eligibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_ELIGIBILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Curse Eligibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSE_ELIGIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ImageImpl
	 * @see generator.impl.GeneratorPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 94;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.VisualizationImpl
	 * @see generator.impl.GeneratorPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 95;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__POSITIONS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__ID = 1;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.VisualizationPositionImpl <em>Visualization Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.VisualizationPositionImpl
	 * @see generator.impl.GeneratorPackageImpl#getVisualizationPosition()
	 * @generated
	 */
	int VISUALIZATION_POSITION = 96;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_POSITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Visualization Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_POSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Visualization Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.LegendTextImpl <em>Legend Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LegendTextImpl
	 * @see generator.impl.GeneratorPackageImpl#getLegendText()
	 * @generated
	 */
	int LEGEND_TEXT = 97;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TEXT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TEXT__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Legend Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legend Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.HistoryFactImpl <em>History Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.HistoryFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getHistoryFact()
	 * @generated
	 */
	int HISTORY_FACT = 98;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FACT__EVENT = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FACT__TIME = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>History Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>History Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GeographyLegendFactImpl <em>Geography Legend Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GeographyLegendFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getGeographyLegendFact()
	 * @generated
	 */
	int GEOGRAPHY_LEGEND_FACT = 99;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_LEGEND_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_LEGEND_FACT__LEGEND = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geography Legend Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_LEGEND_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Geography Legend Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_LEGEND_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.GeographyFactImpl <em>Geography Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GeographyFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getGeographyFact()
	 * @generated
	 */
	int GEOGRAPHY_FACT = 100;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT__POSITION = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT__TYPE = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT__VALUE = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Geography Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Geography Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TimeImpl
	 * @see generator.impl.GeneratorPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 103;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DateImpl
	 * @see generator.impl.GeneratorPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 101;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = TIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = TIME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = TIME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__POSITION = TIME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = TIME_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE___TO_STRING = TIME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = TIME_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.impl.TimePeriodImpl <em>Time Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TimePeriodImpl
	 * @see generator.impl.GeneratorPackageImpl#getTimePeriod()
	 * @generated
	 */
	int TIME_PERIOD = 102;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD__START_YEAR = TIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD__END_YEAR = TIME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD__START_POSITION = TIME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD__END_POSITION = TIME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_FEATURE_COUNT = TIME_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD___TO_STRING = TIME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_OPERATION_COUNT = TIME_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link generator.impl.VisualizationQuestionParamImpl <em>Visualization Question Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.VisualizationQuestionParamImpl
	 * @see generator.impl.GeneratorPackageImpl#getVisualizationQuestionParam()
	 * @generated
	 */
	int VISUALIZATION_QUESTION_PARAM = 105;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_QUESTION_PARAM__VALUE = AQUESTION_PARAM__VALUE;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_QUESTION_PARAM__VISUALIZATION = AQUESTION_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualization Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_QUESTION_PARAM_FEATURE_COUNT = AQUESTION_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visualization Question Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_QUESTION_PARAM_OPERATION_COUNT = AQUESTION_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.HistoricalEventAssociationImpl <em>Historical Event Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.HistoricalEventAssociationImpl
	 * @see generator.impl.GeneratorPackageImpl#getHistoricalEventAssociation()
	 * @generated
	 */
	int HISTORICAL_EVENT_ASSOCIATION = 106;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__SOURCE = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__MISSING = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__TARGET = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Historical Event Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Historical Event Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_EVENT_ASSOCIATION_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.LegendAMapImpl <em>Legend AMap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LegendAMapImpl
	 * @see generator.impl.GeneratorPackageImpl#getLegendAMap()
	 * @generated
	 */
	int LEGEND_AMAP = 107;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__MISSING = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graphic Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__GRAPHIC_TASK = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Legend AMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Legend AMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_AMAP_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.LocateOnAMapImpl <em>Locate On AMap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LocateOnAMapImpl
	 * @see generator.impl.GeneratorPackageImpl#getLocateOnAMap()
	 * @generated
	 */
	int LOCATE_ON_AMAP = 108;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__PERCENT_OF_APPARITION = MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__NB_CONSECUTIVE_SUCCESS = MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__RESPONSE_MODALITY = MEMBERSHIP_ID_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__ID = MEMBERSHIP_ID_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__MAX_TIME = MEMBERSHIP_ID_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__NB_FACTS = MEMBERSHIP_ID_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__TYPE = MEMBERSHIP_ID_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Identify Shared Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__IDENTIFY_SHARED_PROPERTY = MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK__NO_STATEMENT_TASK;

	/**
	 * The feature id for the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Learners Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__LEARNERS_CHOICES = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graphic Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP__GRAPHIC_TASK = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locate On AMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP_FEATURE_COUNT = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP___GET_TYPE = MEMBERSHIP_ID_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP___IS_GRAPHIC_TASK = MEMBERSHIP_ID_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP___IS_CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP___IS_NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP___GET_NB_EXPECTED_ANSWERS = MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Locate On AMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATE_ON_AMAP_OPERATION_COUNT = MEMBERSHIP_ID_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TeacherImpl
	 * @see generator.impl.GeneratorPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 109;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ID = 0;

	/**
	 * The feature id for the '<em><b>Classrooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__CLASSROOMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.TeachersImpl <em>Teachers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.TeachersImpl
	 * @see generator.impl.GeneratorPackageImpl#getTeachers()
	 * @generated
	 */
	int TEACHERS = 110;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHERS__TEACHERS = 0;

	/**
	 * The number of structural features of the '<em>Teachers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Teachers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ClassroomsImpl <em>Classrooms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ClassroomsImpl
	 * @see generator.impl.GeneratorPackageImpl#getClassrooms()
	 * @generated
	 */
	int CLASSROOMS = 111;

	/**
	 * The feature id for the '<em><b>Classrooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOMS__CLASSROOMS = 0;

	/**
	 * The number of structural features of the '<em>Classrooms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classrooms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.AVisualizationQuestionableFactImpl <em>AVisualization Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AVisualizationQuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getAVisualizationQuestionableFact()
	 * @generated
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT = 113;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__WAS_SELECTED = AQUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__ACHIEVED = AQUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__RESULTS = AQUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__ID = AQUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE = AQUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION = AQUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS = AQUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE = AQUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AVisualization Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT_FEATURE_COUNT = AQUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>AVisualization Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVISUALIZATION_QUESTIONABLE_FACT_OPERATION_COUNT = AQUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.VisualizationSolutionImpl <em>Visualization Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.VisualizationSolutionImpl
	 * @see generator.impl.GeneratorPackageImpl#getVisualizationSolution()
	 * @generated
	 */
	int VISUALIZATION_SOLUTION = 114;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_SOLUTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Visualization Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_SOLUTION__VISUALIZATION_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_SOLUTION__IMAGE = 2;

	/**
	 * The number of structural features of the '<em>Visualization Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_SOLUTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visualization Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.HGLevelImpl <em>HG Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.HGLevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getHGLevel()
	 * @generated
	 */
	int HG_LEVEL = 115;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HG_LEVEL__ID = LEVEL__ID;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HG_LEVEL__TASKS = LEVEL__TASKS;

	/**
	 * The feature id for the '<em><b>Completion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HG_LEVEL__COMPLETION_CRITERIA = LEVEL__COMPLETION_CRITERIA;

	/**
	 * The number of structural features of the '<em>HG Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HG_LEVEL_FEATURE_COUNT = LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HG Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HG_LEVEL_OPERATION_COUNT = LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PositionedVisualizationElementImpl <em>Positioned Visualization Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PositionedVisualizationElementImpl
	 * @see generator.impl.GeneratorPackageImpl#getPositionedVisualizationElement()
	 * @generated
	 */
	int POSITIONED_VISUALIZATION_ELEMENT = 116;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__ID = POSITIONED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__POSITION = POSITIONED_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__CORRECTNESS = POSITIONED_ELEMENT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__DISPLAYS = POSITIONED_ELEMENT__DISPLAYS;

	/**
	 * The feature id for the '<em><b>Expected Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__EXPECTED_ANSWER = POSITIONED_ELEMENT__EXPECTED_ANSWER;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__FACT = POSITIONED_ELEMENT__FACT;

	/**
	 * The feature id for the '<em><b>Accepted Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__ACCEPTED_FACTS = POSITIONED_ELEMENT__ACCEPTED_FACTS;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__ELEMENT_TYPE = POSITIONED_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Created Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION = POSITIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Positioned Visualization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Positioned Visualization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_VISUALIZATION_ELEMENT_OPERATION_COUNT = POSITIONED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.DateQuestionableFactImpl <em>Date Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DateQuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getDateQuestionableFact()
	 * @generated
	 */
	int DATE_QUESTIONABLE_FACT = 117;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Missing Elements Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Date Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>Date Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_QUESTIONABLE_FACT_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.HistoricalChronologyImpl <em>Historical Chronology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.HistoricalChronologyImpl
	 * @see generator.impl.GeneratorPackageImpl#getHistoricalChronology()
	 * @generated
	 */
	int HISTORICAL_CHRONOLOGY = 118;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__PERCENT_OF_APPARITION = ORDERING_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__NB_CONSECUTIVE_SUCCESS = ORDERING_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__RESPONSE_MODALITY = ORDERING_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__ID = ORDERING_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__MAX_TIME = ORDERING_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__NB_FACTS = ORDERING_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__TYPE = ORDERING_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__CHECK_ON_LEARNER_ACTION = ORDERING_TASK__CHECK_ON_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__NO_STATEMENT_TASK = ORDERING_TASK__NO_STATEMENT_TASK;

	/**
	 * The feature id for the '<em><b>Mix Date Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD = ORDERING_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graphic Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY__GRAPHIC_TASK = ORDERING_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Historical Chronology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY_FEATURE_COUNT = ORDERING_TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY___GET_TYPE = ORDERING_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY___IS_GRAPHIC_TASK = ORDERING_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY___IS_CHECK_ON_LEARNER_ACTION = ORDERING_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY___IS_NO_STATEMENT_TASK = ORDERING_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY___GET_NB_EXPECTED_ANSWERS = ORDERING_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Historical Chronology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_CHRONOLOGY_OPERATION_COUNT = ORDERING_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MapQuestionableFactImpl <em>Map Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MapQuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getMapQuestionableFact()
	 * @generated
	 */
	int MAP_QUESTIONABLE_FACT = 119;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__WAS_SELECTED = AVISUALIZATION_QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__ACHIEVED = AVISUALIZATION_QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__RESULTS = AVISUALIZATION_QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__ID = AVISUALIZATION_QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE = AVISUALIZATION_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__VISUALIZATION = AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION;

	/**
	 * The feature id for the '<em><b>Visualization Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS = AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__CONSIGNE = AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT__TYPE = AVISUALIZATION_QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT_FEATURE_COUNT = AVISUALIZATION_QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_QUESTIONABLE_FACT_OPERATION_COUNT = AVISUALIZATION_QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoTechniqueFactImpl <em>Judo Technique Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoTechniqueFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoTechniqueFact()
	 * @generated
	 */
	int JUDO_TECHNIQUE_FACT = 120;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT__NAME = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT__DESCRIPTION = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT__CATEGORY = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Judo Technique Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Judo Technique Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_TECHNIQUE_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.ClassifyTechniqueImpl <em>Classify Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ClassifyTechniqueImpl
	 * @see generator.impl.GeneratorPackageImpl#getClassifyTechnique()
	 * @generated
	 */
	int CLASSIFY_TECHNIQUE = 121;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__PERCENT_OF_APPARITION = MEMBERSHIP_ID_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__NB_CONSECUTIVE_SUCCESS = MEMBERSHIP_ID_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__RESPONSE_MODALITY = MEMBERSHIP_ID_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__ID = MEMBERSHIP_ID_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__MAX_TIME = MEMBERSHIP_ID_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__NB_FACTS = MEMBERSHIP_ID_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__TYPE = MEMBERSHIP_ID_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Identify Shared Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__IDENTIFY_SHARED_PROPERTY = MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE__NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK__NO_STATEMENT_TASK;

	/**
	 * The number of structural features of the '<em>Classify Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE_FEATURE_COUNT = MEMBERSHIP_ID_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE___GET_TYPE = MEMBERSHIP_ID_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE___IS_GRAPHIC_TASK = MEMBERSHIP_ID_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE___IS_CHECK_ON_LEARNER_ACTION = MEMBERSHIP_ID_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE___IS_NO_STATEMENT_TASK = MEMBERSHIP_ID_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE___GET_NB_EXPECTED_ANSWERS = MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Classify Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_TECHNIQUE_OPERATION_COUNT = MEMBERSHIP_ID_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.IdentifyTechniqueImpl <em>Identify Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.IdentifyTechniqueImpl
	 * @see generator.impl.GeneratorPackageImpl#getIdentifyTechnique()
	 * @generated
	 */
	int IDENTIFY_TECHNIQUE = 122;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__MISSING = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__SOURCE = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Identify Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Identify Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_TECHNIQUE_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoQuestionableTechniqueFactImpl <em>Judo Questionable Technique Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoQuestionableTechniqueFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableTechniqueFact()
	 * @generated
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT = 123;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Source Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Missing Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Judo Questionable Technique Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>Judo Questionable Technique Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_TECHNIQUE_FACT_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoQuestionableClassifyFactImpl <em>Judo Questionable Classify Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoQuestionableClassifyFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableClassifyFact()
	 * @generated
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT = 124;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Techniques</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Judo Questionable Classify Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>Judo Questionable Classify Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_CLASSIFY_FACT_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoLevelImpl <em>Judo Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoLevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoLevel()
	 * @generated
	 */
	int JUDO_LEVEL = 125;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_LEVEL__ID = LEVEL__ID;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_LEVEL__TASKS = LEVEL__TASKS;

	/**
	 * The feature id for the '<em><b>Completion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_LEVEL__COMPLETION_CRITERIA = LEVEL__COMPLETION_CRITERIA;

	/**
	 * The number of structural features of the '<em>Judo Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_LEVEL_FEATURE_COUNT = LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Judo Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_LEVEL_OPERATION_COUNT = LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoArbitrationGestureFactImpl <em>Judo Arbitration Gesture Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoArbitrationGestureFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoArbitrationGestureFact()
	 * @generated
	 */
	int JUDO_ARBITRATION_GESTURE_FACT = 126;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_ARBITRATION_GESTURE_FACT__REPRESENTATION = ABSTRACT_FACT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_ARBITRATION_GESTURE_FACT__NAME = ABSTRACT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_ARBITRATION_GESTURE_FACT__DESCRIPTION = ABSTRACT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Judo Arbitration Gesture Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_ARBITRATION_GESTURE_FACT_FEATURE_COUNT = ABSTRACT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Judo Arbitration Gesture Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_ARBITRATION_GESTURE_FACT_OPERATION_COUNT = ABSTRACT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.IdentifyArbitrationGestureImpl <em>Identify Arbitration Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.IdentifyArbitrationGestureImpl
	 * @see generator.impl.GeneratorPackageImpl#getIdentifyArbitrationGesture()
	 * @generated
	 */
	int IDENTIFY_ARBITRATION_GESTURE = 127;

	/**
	 * The feature id for the '<em><b>Percent Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__PERCENT_OF_APPARITION = COMPLETION_TASK__PERCENT_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__NB_CONSECUTIVE_SUCCESS = COMPLETION_TASK__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Response Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__RESPONSE_MODALITY = COMPLETION_TASK__RESPONSE_MODALITY;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__ID = COMPLETION_TASK__ID;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__MAX_TIME = COMPLETION_TASK__MAX_TIME;

	/**
	 * The feature id for the '<em><b>Nb Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__NB_FACTS = COMPLETION_TASK__NB_FACTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__TYPE = COMPLETION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__NB_MISSING_ELEMENTS = COMPLETION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check On Learner Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__CHECK_ON_LEARNER_ACTION = COMPLETION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__SOURCE = COMPLETION_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Statement Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE__NO_STATEMENT_TASK = COMPLETION_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identify Arbitration Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE_FEATURE_COUNT = COMPLETION_TASK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___GET_TYPE = COMPLETION_TASK___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Graphic Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___IS_GRAPHIC_TASK = COMPLETION_TASK___IS_GRAPHIC_TASK;

	/**
	 * The operation id for the '<em>Is Check On Learner Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___IS_CHECK_ON_LEARNER_ACTION = COMPLETION_TASK___IS_CHECK_ON_LEARNER_ACTION;

	/**
	 * The operation id for the '<em>Is No Statement Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___IS_NO_STATEMENT_TASK = COMPLETION_TASK___IS_NO_STATEMENT_TASK;

	/**
	 * The operation id for the '<em>Get Nb Missing Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___GET_NB_MISSING_ELEMENTS = COMPLETION_TASK___GET_NB_MISSING_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nb Expected Answers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE___GET_NB_EXPECTED_ANSWERS = COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS;

	/**
	 * The number of operations of the '<em>Identify Arbitration Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_ARBITRATION_GESTURE_OPERATION_COUNT = COMPLETION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.JudoQuestionableArbitrationFactImpl <em>Judo Questionable Arbitration Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.JudoQuestionableArbitrationFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT = 128;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__WAS_SELECTED = QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__ACHIEVED = QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__RESULTS = QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__ID = QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__QUESTION_WITH_IMAGE = QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME = QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION = QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Representation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID = QUESTIONABLE_FACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE = QUESTIONABLE_FACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Representation ID Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE = QUESTIONABLE_FACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description Soluce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE = QUESTIONABLE_FACT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Judo Questionable Arbitration Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT_FEATURE_COUNT = QUESTIONABLE_FACT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Questionable Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT___GET_QUESTIONABLE_FACT = QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT;

	/**
	 * The operation id for the '<em>Get Complete Fact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT___GET_COMPLETE_FACT = QUESTIONABLE_FACT___GET_COMPLETE_FACT;

	/**
	 * The number of operations of the '<em>Judo Questionable Arbitration Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDO_QUESTIONABLE_ARBITRATION_FACT_OPERATION_COUNT = QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.MultipleChoiceImpl
	 * @see generator.impl.GeneratorPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 129;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__TYPE = DYNAMIC_MULTIPLE_CHOICE__TYPE;

	/**
	 * The feature id for the '<em><b>Nb Bad Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NB_BAD_CHOICES = DYNAMIC_MULTIPLE_CHOICE__NB_BAD_CHOICES;

	/**
	 * The feature id for the '<em><b>Nb Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NB_CHOICES = DYNAMIC_MULTIPLE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = DYNAMIC_MULTIPLE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = DYNAMIC_MULTIPLE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.LegendQuestionableFactImpl <em>Legend Questionable Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LegendQuestionableFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getLegendQuestionableFact()
	 * @generated
	 */
	int LEGEND_QUESTIONABLE_FACT = 130;

	/**
	 * The feature id for the '<em><b>Was Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__WAS_SELECTED = AVISUALIZATION_QUESTIONABLE_FACT__WAS_SELECTED;

	/**
	 * The feature id for the '<em><b>Achieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__ACHIEVED = AVISUALIZATION_QUESTIONABLE_FACT__ACHIEVED;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__RESULTS = AVISUALIZATION_QUESTIONABLE_FACT__RESULTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__ID = AVISUALIZATION_QUESTIONABLE_FACT__ID;

	/**
	 * The feature id for the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE = AVISUALIZATION_QUESTIONABLE_FACT__QUESTION_WITH_IMAGE;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__VISUALIZATION = AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION;

	/**
	 * The feature id for the '<em><b>Visualization Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS = AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__CONSIGNE = AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT__TARGET = AVISUALIZATION_QUESTIONABLE_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legend Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT_FEATURE_COUNT = AVISUALIZATION_QUESTIONABLE_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legend Questionable Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_QUESTIONABLE_FACT_OPERATION_COUNT = AVISUALIZATION_QUESTIONABLE_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.Directions
	 * @see generator.impl.GeneratorPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 131;

	/**
	 * The meta object id for the '{@link generator.DungeonMode <em>Dungeon Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.DungeonMode
	 * @see generator.impl.GeneratorPackageImpl#getDungeonMode()
	 * @generated
	 */
	int DUNGEON_MODE = 132;

	/**
	 * The meta object id for the '{@link generator.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.TableBuild
	 * @see generator.impl.GeneratorPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 133;

	/**
	 * The meta object id for the '{@link generator.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ResultPosition
	 * @see generator.impl.GeneratorPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 134;

	/**
	 * The meta object id for the '{@link generator.ESingleTarget <em>ESingle Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESingleTarget
	 * @see generator.impl.GeneratorPackageImpl#getESingleTarget()
	 * @generated
	 */
	int ESINGLE_TARGET = 135;

	/**
	 * The meta object id for the '{@link generator.ETaskType <em>ETask Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ETaskType
	 * @see generator.impl.GeneratorPackageImpl#getETaskType()
	 * @generated
	 */
	int ETASK_TYPE = 136;

	/**
	 * The meta object id for the '{@link generator.EModality <em>EModality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EModality
	 * @see generator.impl.GeneratorPackageImpl#getEModality()
	 * @generated
	 */
	int EMODALITY = 137;

	/**
	 * The meta object id for the '{@link generator.ESeveralTarget <em>ESeveral Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ESeveralTarget
	 * @see generator.impl.GeneratorPackageImpl#getESeveralTarget()
	 * @generated
	 */
	int ESEVERAL_TARGET = 138;

	/**
	 * The meta object id for the '{@link generator.ElementSize <em>Element Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ElementSize
	 * @see generator.impl.GeneratorPackageImpl#getElementSize()
	 * @generated
	 */
	int ELEMENT_SIZE = 139;

	/**
	 * The meta object id for the '{@link generator.GPCategory <em>GP Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.GPCategory
	 * @see generator.impl.GeneratorPackageImpl#getGPCategory()
	 * @generated
	 */
	int GP_CATEGORY = 140;

	/**
	 * The meta object id for the '{@link generator.ECorrectness <em>ECorrectness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ECorrectness
	 * @see generator.impl.GeneratorPackageImpl#getECorrectness()
	 * @generated
	 */
	int ECORRECTNESS = 141;

	/**
	 * The meta object id for the '{@link generator.EBoundary <em>EBoundary</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EBoundary
	 * @see generator.impl.GeneratorPackageImpl#getEBoundary()
	 * @generated
	 */
	int EBOUNDARY = 142;

	/**
	 * The meta object id for the '{@link generator.ERoomType <em>ERoom Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ERoomType
	 * @see generator.impl.GeneratorPackageImpl#getERoomType()
	 * @generated
	 */
	int EROOM_TYPE = 143;

	/**
	 * The meta object id for the '{@link generator.EGeographyValue <em>EGeography Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EGeographyValue
	 * @see generator.impl.GeneratorPackageImpl#getEGeographyValue()
	 * @generated
	 */
	int EGEOGRAPHY_VALUE = 144;

	/**
	 * The meta object id for the '{@link generator.EHistoryTarget <em>EHistory Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EHistoryTarget
	 * @see generator.impl.GeneratorPackageImpl#getEHistoryTarget()
	 * @generated
	 */
	int EHISTORY_TARGET = 145;

	/**
	 * The meta object id for the '{@link generator.ELegendTarget <em>ELegend Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ELegendTarget
	 * @see generator.impl.GeneratorPackageImpl#getELegendTarget()
	 * @generated
	 */
	int ELEGEND_TARGET = 146;

	/**
	 * The meta object id for the '{@link generator.EStatementType <em>EStatement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EStatementType
	 * @see generator.impl.GeneratorPackageImpl#getEStatementType()
	 * @generated
	 */
	int ESTATEMENT_TYPE = 147;

	/**
	 * The meta object id for the '{@link generator.ETimeTarget <em>ETime Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.ETimeTarget
	 * @see generator.impl.GeneratorPackageImpl#getETimeTarget()
	 * @generated
	 */
	int ETIME_TARGET = 148;

	/**
	 * The meta object id for the '{@link generator.EJudoTarget <em>EJudo Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.EJudoTarget
	 * @see generator.impl.GeneratorPackageImpl#getEJudoTarget()
	 * @generated
	 */
	int EJUDO_TARGET = 149;

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
	 * Returns the meta object for the containment reference '{@link generator.AbstractFact#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see generator.AbstractFact#getRepresentation()
	 * @see #getAbstractFact()
	 * @generated
	 */
	EReference getAbstractFact_Representation();

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
	 * Returns the meta object for the containment reference '{@link generator.SetOfFacts#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualization</em>'.
	 * @see generator.SetOfFacts#getVisualization()
	 * @see #getSetOfFacts()
	 * @generated
	 */
	EReference getSetOfFacts_Visualization();

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
	 * Returns the meta object for the reference '{@link generator.Dungeon#getLearnerPlayer <em>Learner Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learner Player</em>'.
	 * @see generator.Dungeon#getLearnerPlayer()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_LearnerPlayer();

	/**
	 * Returns the meta object for the reference list '{@link generator.Dungeon#getCurses <em>Curses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curses</em>'.
	 * @see generator.Dungeon#getCurses()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Curses();

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
	 * Returns the meta object for the attribute '{@link generator.Room#getNbExpectedAnswers <em>Nb Expected Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Expected Answers</em>'.
	 * @see generator.Room#getNbExpectedAnswers()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_NbExpectedAnswers();

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
	 * Returns the meta object for the attribute '{@link generator.RoomType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.RoomType#getType()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Type();

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
	 * Returns the meta object for the '{@link generator.RoomType#isEntryRoomType() <em>Is Entry Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Entry Room Type</em>' operation.
	 * @see generator.RoomType#isEntryRoomType()
	 * @generated
	 */
	EOperation getRoomType__IsEntryRoomType();

	/**
	 * Returns the meta object for the '{@link generator.RoomType#isExitRoomType() <em>Is Exit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exit Room Type</em>' operation.
	 * @see generator.RoomType#isExitRoomType()
	 * @generated
	 */
	EOperation getRoomType__IsExitRoomType();

	/**
	 * Returns the meta object for the '{@link generator.RoomType#isQuestionRoomType() <em>Is Question Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Question Room Type</em>' operation.
	 * @see generator.RoomType#isQuestionRoomType()
	 * @generated
	 */
	EOperation getRoomType__IsQuestionRoomType();

	/**
	 * Returns the meta object for the '{@link generator.RoomType#isTrapRoomType() <em>Is Trap Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Trap Room Type</em>' operation.
	 * @see generator.RoomType#isTrapRoomType()
	 * @generated
	 */
	EOperation getRoomType__IsTrapRoomType();

	/**
	 * Returns the meta object for the '{@link generator.RoomType#isPortalRoomType() <em>Is Portal Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Portal Room Type</em>' operation.
	 * @see generator.RoomType#isPortalRoomType()
	 * @generated
	 */
	EOperation getRoomType__IsPortalRoomType();

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
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getSuccessPercent <em>Success Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percent</em>'.
	 * @see generator.Prerequisite#getSuccessPercent()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_SuccessPercent();

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
	 * Returns the meta object for the attribute '{@link generator.MTCompletion1#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.MTCompletion1#isCheckOnLearnerAction()
	 * @see #getMTCompletion1()
	 * @generated
	 */
	EAttribute getMTCompletion1_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion1#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.MTCompletion1#isNoStatementTask()
	 * @see #getMTCompletion1()
	 * @generated
	 */
	EAttribute getMTCompletion1_NoStatementTask();

	/**
	 * Returns the meta object for class '{@link generator.Classroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classroom</em>'.
	 * @see generator.Classroom
	 * @generated
	 */
	EClass getClassroom();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Classroom#getGamecontext <em>Gamecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamecontext</em>'.
	 * @see generator.Classroom#getGamecontext()
	 * @see #getClassroom()
	 * @generated
	 */
	EReference getClassroom_Gamecontext();

	/**
	 * Returns the meta object for the attribute '{@link generator.Classroom#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Classroom#getID()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.Classroom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Classroom#getName()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_Name();

	/**
	 * Returns the meta object for the reference list '{@link generator.Classroom#getLearnerPlayers <em>Learner Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Learner Players</em>'.
	 * @see generator.Classroom#getLearnerPlayers()
	 * @see #getClassroom()
	 * @generated
	 */
	EReference getClassroom_LearnerPlayers();

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
	 * Returns the meta object for the containment reference '{@link generator.LearnerPlayer#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see generator.LearnerPlayer#getStatistics()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EReference getLearnerPlayer_Statistics();

	/**
	 * Returns the meta object for the attribute '{@link generator.LearnerPlayer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see generator.LearnerPlayer#getLastName()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EAttribute getLearnerPlayer_LastName();

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
	 * Returns the meta object for the containment reference '{@link generator.Progression#getPlayerProgress <em>Player Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Progress</em>'.
	 * @see generator.Progression#getPlayerProgress()
	 * @see #getProgression()
	 * @generated
	 */
	EReference getProgression_PlayerProgress();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Progression#getLearnerProgress <em>Learner Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Learner Progress</em>'.
	 * @see generator.Progression#getLearnerProgress()
	 * @see #getProgression()
	 * @generated
	 */
	EReference getProgression_LearnerProgress();

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
	 * Returns the meta object for the attribute '{@link generator.CurrentObjectiveLevel#getSuccessPercent <em>Success Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percent</em>'.
	 * @see generator.CurrentObjectiveLevel#getSuccessPercent()
	 * @see #getCurrentObjectiveLevel()
	 * @generated
	 */
	EAttribute getCurrentObjectiveLevel_SuccessPercent();

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
	 * Returns the meta object for class '{@link generator.DynamicMultipleChoice <em>Dynamic Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Multiple Choice</em>'.
	 * @see generator.DynamicMultipleChoice
	 * @generated
	 */
	EClass getDynamicMultipleChoice();

	/**
	 * Returns the meta object for the attribute '{@link generator.DynamicMultipleChoice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.DynamicMultipleChoice#getType()
	 * @see #getDynamicMultipleChoice()
	 * @generated
	 */
	EAttribute getDynamicMultipleChoice_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.DynamicMultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Bad Choices</em>'.
	 * @see generator.DynamicMultipleChoice#getNbBadChoices()
	 * @see #getDynamicMultipleChoice()
	 * @generated
	 */
	EAttribute getDynamicMultipleChoice_NbBadChoices();

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
	 * Returns the meta object for the '{@link generator.ATask#getNbExpectedAnswers() <em>Get Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Expected Answers</em>' operation.
	 * @see generator.ATask#getNbExpectedAnswers()
	 * @generated
	 */
	EOperation getATask__GetNbExpectedAnswers();

	/**
	 * Returns the meta object for the '{@link generator.ATask#isGraphicTask() <em>Is Graphic Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Graphic Task</em>' operation.
	 * @see generator.ATask#isGraphicTask()
	 * @generated
	 */
	EOperation getATask__IsGraphicTask();

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
	 * Returns the meta object for the '{@link generator.ATask#isNoStatementTask() <em>Is No Statement Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is No Statement Task</em>' operation.
	 * @see generator.ATask#isNoStatementTask()
	 * @generated
	 */
	EOperation getATask__IsNoStatementTask();

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
	 * Returns the meta object for the '{@link generator.CompletionTask#getNbExpectedAnswers() <em>Get Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Expected Answers</em>' operation.
	 * @see generator.CompletionTask#getNbExpectedAnswers()
	 * @generated
	 */
	EOperation getCompletionTask__GetNbExpectedAnswers();

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
	 * Returns the meta object for the attribute '{@link generator.IdentificationTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.IdentificationTask#isCheckOnLearnerAction()
	 * @see #getIdentificationTask()
	 * @generated
	 */
	EAttribute getIdentificationTask_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentificationTask#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.IdentificationTask#isNoStatementTask()
	 * @see #getIdentificationTask()
	 * @generated
	 */
	EAttribute getIdentificationTask_NoStatementTask();

	/**
	 * Returns the meta object for the '{@link generator.IdentificationTask#getNbExpectedAnswers() <em>Get Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Expected Answers</em>' operation.
	 * @see generator.IdentificationTask#getNbExpectedAnswers()
	 * @generated
	 */
	EOperation getIdentificationTask__GetNbExpectedAnswers();

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
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.MembershipIDTask#isCheckOnLearnerAction()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.MembershipIDTask#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.MembershipIDTask#isNoStatementTask()
	 * @see #getMembershipIDTask()
	 * @generated
	 */
	EAttribute getMembershipIDTask_NoStatementTask();

	/**
	 * Returns the meta object for the '{@link generator.MembershipIDTask#getNbExpectedAnswers() <em>Get Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Expected Answers</em>' operation.
	 * @see generator.MembershipIDTask#getNbExpectedAnswers()
	 * @generated
	 */
	EOperation getMembershipIDTask__GetNbExpectedAnswers();

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
	 * Returns the meta object for the attribute '{@link generator.MTCompletion2#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.MTCompletion2#isCheckOnLearnerAction()
	 * @see #getMTCompletion2()
	 * @generated
	 */
	EAttribute getMTCompletion2_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTCompletion2#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.MTCompletion2#isNoStatementTask()
	 * @see #getMTCompletion2()
	 * @generated
	 */
	EAttribute getMTCompletion2_NoStatementTask();

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
	 * Returns the meta object for the attribute '{@link generator.MTRecontruction#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.MTRecontruction#isCheckOnLearnerAction()
	 * @see #getMTRecontruction()
	 * @generated
	 */
	EAttribute getMTRecontruction_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.MTRecontruction#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.MTRecontruction#isNoStatementTask()
	 * @see #getMTRecontruction()
	 * @generated
	 */
	EAttribute getMTRecontruction_NoStatementTask();

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
	 * Returns the meta object for the attribute '{@link generator.ResultsByTask#getSuccessPercent <em>Success Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percent</em>'.
	 * @see generator.ResultsByTask#getSuccessPercent()
	 * @see #getResultsByTask()
	 * @generated
	 */
	EAttribute getResultsByTask_SuccessPercent();

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
	 * Returns the meta object for class '{@link generator.QuestionableFact <em>Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionable Fact</em>'.
	 * @see generator.QuestionableFact
	 * @generated
	 */
	EClass getQuestionableFact();

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
	 * Returns the meta object for the attribute '{@link generator.CompletionCriteria#getSuccessPercent <em>Success Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percent</em>'.
	 * @see generator.CompletionCriteria#getSuccessPercent()
	 * @see #getCompletionCriteria()
	 * @generated
	 */
	EAttribute getCompletionCriteria_SuccessPercent();

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
	 * Returns the meta object for the containment reference list '{@link generator.LevelsDifficultyProgress#getCursesAvailabilities <em>Curses Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curses Availabilities</em>'.
	 * @see generator.LevelsDifficultyProgress#getCursesAvailabilities()
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	EReference getLevelsDifficultyProgress_CursesAvailabilities();

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
	 * Returns the meta object for the containment reference '{@link generator.GameElementTypes#getCurses <em>Curses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Curses</em>'.
	 * @see generator.GameElementTypes#getCurses()
	 * @see #getGameElementTypes()
	 * @generated
	 */
	EReference getGameElementTypes_Curses();

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
	 * Returns the meta object for the reference list '{@link generator.Equipment#getLockedAbilities <em>Locked Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locked Abilities</em>'.
	 * @see generator.Equipment#getLockedAbilities()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_LockedAbilities();

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
	 * Returns the meta object for the attribute '{@link generator.Gameplay#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see generator.Gameplay#isLocked()
	 * @see #getGameplay()
	 * @generated
	 */
	EAttribute getGameplay_Locked();

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
	 * Returns the meta object for the attribute '{@link generator.QuestionableFactResult#isOnTime <em>On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Time</em>'.
	 * @see generator.QuestionableFactResult#isOnTime()
	 * @see #getQuestionableFactResult()
	 * @generated
	 */
	EAttribute getQuestionableFactResult_OnTime();

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
	 * Returns the meta object for the reference '{@link generator.Ability#getLockingEquipment <em>Locking Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locking Equipment</em>'.
	 * @see generator.Ability#getLockingEquipment()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_LockingEquipment();

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
	 * Returns the meta object for the attribute '{@link generator.QuestionParam#getCompleteFact <em>Complete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Fact</em>'.
	 * @see generator.QuestionParam#getCompleteFact()
	 * @see #getQuestionParam()
	 * @generated
	 */
	EAttribute getQuestionParam_CompleteFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.QuestionParam#isImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see generator.QuestionParam#isImage()
	 * @see #getQuestionParam()
	 * @generated
	 */
	EAttribute getQuestionParam_Image();

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
	 * Returns the meta object for the containment reference '{@link generator.PropositionParam#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see generator.PropositionParam#getPosition()
	 * @see #getPropositionParam()
	 * @generated
	 */
	EReference getPropositionParam_Position();

	/**
	 * Returns the meta object for the attribute '{@link generator.PropositionParam#isImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see generator.PropositionParam#isImage()
	 * @see #getPropositionParam()
	 * @generated
	 */
	EAttribute getPropositionParam_Image();

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
	 * Returns the meta object for the containment reference '{@link generator.EntrySoluceParam#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see generator.EntrySoluceParam#getPosition()
	 * @see #getEntrySoluceParam()
	 * @generated
	 */
	EReference getEntrySoluceParam_Position();

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
	 * Returns the meta object for the attribute '{@link generator.Display#isImageDisplay <em>Image Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Display</em>'.
	 * @see generator.Display#isImageDisplay()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_ImageDisplay();

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
	 * Returns the meta object for the attribute '{@link generator.AComponent#isForProposition <em>For Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Proposition</em>'.
	 * @see generator.AComponent#isForProposition()
	 * @see #getAComponent()
	 * @generated
	 */
	EAttribute getAComponent_ForProposition();

	/**
	 * Returns the meta object for the attribute '{@link generator.AComponent#isForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Statement</em>'.
	 * @see generator.AComponent#isForStatement()
	 * @see #getAComponent()
	 * @generated
	 */
	EAttribute getAComponent_ForStatement();

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
	 * Returns the meta object for the attribute '{@link generator.Structure#isAlternateComponents <em>Alternate Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternate Components</em>'.
	 * @see generator.Structure#isAlternateComponents()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_AlternateComponents();

	/**
	 * Returns the meta object for the attribute '{@link generator.Structure#isForFact <em>For Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Fact</em>'.
	 * @see generator.Structure#isForFact()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_ForFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.Structure#isForMap <em>For Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Map</em>'.
	 * @see generator.Structure#isForMap()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_ForMap();

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
	 * Returns the meta object for the attribute '{@link generator.OrderingTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.OrderingTask#isCheckOnLearnerAction()
	 * @see #getOrderingTask()
	 * @generated
	 */
	EAttribute getOrderingTask_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.OrderingTask#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.OrderingTask#isNoStatementTask()
	 * @see #getOrderingTask()
	 * @generated
	 */
	EAttribute getOrderingTask_NoStatementTask();

	/**
	 * Returns the meta object for the '{@link generator.OrderingTask#getNbExpectedAnswers() <em>Get Nb Expected Answers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nb Expected Answers</em>' operation.
	 * @see generator.OrderingTask#getNbExpectedAnswers()
	 * @generated
	 */
	EOperation getOrderingTask__GetNbExpectedAnswers();

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
	 * Returns the meta object for the attribute list '{@link generator.Relation#getGameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gameplays</em>'.
	 * @see generator.Relation#getGameplays()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Gameplays();

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
	 * Returns the meta object for the attribute '{@link generator.QuestionGameplay#getStatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Type</em>'.
	 * @see generator.QuestionGameplay#getStatementType()
	 * @see #getQuestionGameplay()
	 * @generated
	 */
	EAttribute getQuestionGameplay_StatementType();

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
	 * Returns the meta object for class '{@link generator.PlayerProgress <em>Player Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Progress</em>'.
	 * @see generator.PlayerProgress
	 * @generated
	 */
	EClass getPlayerProgress();

	/**
	 * Returns the meta object for the attribute '{@link generator.PlayerProgress#getCurrentLevel <em>Current Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Level</em>'.
	 * @see generator.PlayerProgress#getCurrentLevel()
	 * @see #getPlayerProgress()
	 * @generated
	 */
	EAttribute getPlayerProgress_CurrentLevel();

	/**
	 * Returns the meta object for the attribute '{@link generator.PlayerProgress#getCoins <em>Coins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coins</em>'.
	 * @see generator.PlayerProgress#getCoins()
	 * @see #getPlayerProgress()
	 * @generated
	 */
	EAttribute getPlayerProgress_Coins();

	/**
	 * Returns the meta object for the containment reference '{@link generator.PlayerProgress#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see generator.PlayerProgress#getItems()
	 * @see #getPlayerProgress()
	 * @generated
	 */
	EReference getPlayerProgress_Items();

	/**
	 * Returns the meta object for class '{@link generator.LearnerProgress <em>Learner Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learner Progress</em>'.
	 * @see generator.LearnerProgress
	 * @generated
	 */
	EClass getLearnerProgress();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearnerProgress#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currentobjectivelevels</em>'.
	 * @see generator.LearnerProgress#getCurrentobjectivelevels()
	 * @see #getLearnerProgress()
	 * @generated
	 */
	EReference getLearnerProgress_Currentobjectivelevels();

	/**
	 * Returns the meta object for class '{@link generator.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see generator.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link generator.Item#isBought <em>Bought</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bought</em>'.
	 * @see generator.Item#isBought()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Bought();

	/**
	 * Returns the meta object for the attribute '{@link generator.Item#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see generator.Item#isActivated()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Activated();

	/**
	 * Returns the meta object for the reference '{@link generator.Item#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see generator.Item#getEquipment()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Equipment();

	/**
	 * Returns the meta object for class '{@link generator.Items <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items</em>'.
	 * @see generator.Items
	 * @generated
	 */
	EClass getItems();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Items#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see generator.Items#getItems()
	 * @see #getItems()
	 * @generated
	 */
	EReference getItems_Items();

	/**
	 * Returns the meta object for class '{@link generator.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see generator.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbCorrectGivenAnswers <em>Nb Correct Given Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Correct Given Answers</em>'.
	 * @see generator.Statistics#getNbCorrectGivenAnswers()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbCorrectGivenAnswers();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbQuestionsEncountered <em>Nb Questions Encountered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Questions Encountered</em>'.
	 * @see generator.Statistics#getNbQuestionsEncountered()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbQuestionsEncountered();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getMaxGameLevelReached <em>Max Game Level Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Game Level Reached</em>'.
	 * @see generator.Statistics#getMaxGameLevelReached()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_MaxGameLevelReached();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getTotalTimeMin <em>Total Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time Min</em>'.
	 * @see generator.Statistics#getTotalTimeMin()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_TotalTimeMin();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbDeaths <em>Nb Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Deaths</em>'.
	 * @see generator.Statistics#getNbDeaths()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbDeaths();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbLevelsGenerated <em>Nb Levels Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Levels Generated</em>'.
	 * @see generator.Statistics#getNbLevelsGenerated()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbLevelsGenerated();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbFinishedLevels <em>Nb Finished Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Finished Levels</em>'.
	 * @see generator.Statistics#getNbFinishedLevels()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbFinishedLevels();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getNbUnfinishedLevels <em>Nb Unfinished Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Unfinished Levels</em>'.
	 * @see generator.Statistics#getNbUnfinishedLevels()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_NbUnfinishedLevels();

	/**
	 * Returns the meta object for the attribute '{@link generator.Statistics#getTotalCoins <em>Total Coins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Coins</em>'.
	 * @see generator.Statistics#getTotalCoins()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_TotalCoins();

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
	 * Returns the meta object for the '{@link generator.ElementType#isDisplayableElement() <em>Is Displayable Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Displayable Element</em>' operation.
	 * @see generator.ElementType#isDisplayableElement()
	 * @generated
	 */
	EOperation getElementType__IsDisplayableElement();

	/**
	 * Returns the meta object for class '{@link generator.Curses <em>Curses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curses</em>'.
	 * @see generator.Curses
	 * @generated
	 */
	EClass getCurses();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Curses#getCurses <em>Curses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curses</em>'.
	 * @see generator.Curses#getCurses()
	 * @see #getCurses()
	 * @generated
	 */
	EReference getCurses_Curses();

	/**
	 * Returns the meta object for class '{@link generator.Curse <em>Curse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curse</em>'.
	 * @see generator.Curse
	 * @generated
	 */
	EClass getCurse();

	/**
	 * Returns the meta object for the attribute '{@link generator.Curse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Curse#getName()
	 * @see #getCurse()
	 * @generated
	 */
	EAttribute getCurse_Name();

	/**
	 * Returns the meta object for class '{@link generator.LabyrinthCurse <em>Labyrinth Curse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labyrinth Curse</em>'.
	 * @see generator.LabyrinthCurse
	 * @generated
	 */
	EClass getLabyrinthCurse();

	/**
	 * Returns the meta object for class '{@link generator.CurseEligibility <em>Curse Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curse Eligibility</em>'.
	 * @see generator.CurseEligibility
	 * @generated
	 */
	EClass getCurseEligibility();

	/**
	 * Returns the meta object for the attribute '{@link generator.CurseEligibility#getStartLevel <em>Start Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Level</em>'.
	 * @see generator.CurseEligibility#getStartLevel()
	 * @see #getCurseEligibility()
	 * @generated
	 */
	EAttribute getCurseEligibility_StartLevel();

	/**
	 * Returns the meta object for the reference '{@link generator.CurseEligibility#getCurse <em>Curse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curse</em>'.
	 * @see generator.CurseEligibility#getCurse()
	 * @see #getCurseEligibility()
	 * @generated
	 */
	EReference getCurseEligibility_Curse();

	/**
	 * Returns the meta object for class '{@link generator.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see generator.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link generator.Image#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Image#getID()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_ID();

	/**
	 * Returns the meta object for class '{@link generator.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see generator.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Visualization#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see generator.Visualization#getPositions()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Positions();

	/**
	 * Returns the meta object for the attribute '{@link generator.Visualization#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Visualization#getID()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_ID();

	/**
	 * Returns the meta object for class '{@link generator.VisualizationPosition <em>Visualization Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Position</em>'.
	 * @see generator.VisualizationPosition
	 * @generated
	 */
	EClass getVisualizationPosition();

	/**
	 * Returns the meta object for the attribute '{@link generator.VisualizationPosition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.VisualizationPosition#getID()
	 * @see #getVisualizationPosition()
	 * @generated
	 */
	EAttribute getVisualizationPosition_ID();

	/**
	 * Returns the meta object for class '{@link generator.LegendText <em>Legend Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend Text</em>'.
	 * @see generator.LegendText
	 * @generated
	 */
	EClass getLegendText();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see generator.LegendText#getText()
	 * @see #getLegendText()
	 * @generated
	 */
	EAttribute getLegendText_Text();

	/**
	 * Returns the meta object for the reference '{@link generator.LegendText#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.LegendText#getPosition()
	 * @see #getLegendText()
	 * @generated
	 */
	EReference getLegendText_Position();

	/**
	 * Returns the meta object for class '{@link generator.HistoryFact <em>History Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Fact</em>'.
	 * @see generator.HistoryFact
	 * @generated
	 */
	EClass getHistoryFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoryFact#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see generator.HistoryFact#getEvent()
	 * @see #getHistoryFact()
	 * @generated
	 */
	EAttribute getHistoryFact_Event();

	/**
	 * Returns the meta object for the containment reference '{@link generator.HistoryFact#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see generator.HistoryFact#getTime()
	 * @see #getHistoryFact()
	 * @generated
	 */
	EReference getHistoryFact_Time();

	/**
	 * Returns the meta object for class '{@link generator.GeographyLegendFact <em>Geography Legend Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geography Legend Fact</em>'.
	 * @see generator.GeographyLegendFact
	 * @generated
	 */
	EClass getGeographyLegendFact();

	/**
	 * Returns the meta object for the containment reference '{@link generator.GeographyLegendFact#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend</em>'.
	 * @see generator.GeographyLegendFact#getLegend()
	 * @see #getGeographyLegendFact()
	 * @generated
	 */
	EReference getGeographyLegendFact_Legend();

	/**
	 * Returns the meta object for the reference '{@link generator.GeographyLegendFact#getSymbolPosition <em>Symbol Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol Position</em>'.
	 * @see generator.GeographyLegendFact#getSymbolPosition()
	 * @see #getGeographyLegendFact()
	 * @generated
	 */
	EReference getGeographyLegendFact_SymbolPosition();

	/**
	 * Returns the meta object for class '{@link generator.GeographyFact <em>Geography Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geography Fact</em>'.
	 * @see generator.GeographyFact
	 * @generated
	 */
	EClass getGeographyFact();

	/**
	 * Returns the meta object for the reference '{@link generator.GeographyFact#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.GeographyFact#getPosition()
	 * @see #getGeographyFact()
	 * @generated
	 */
	EReference getGeographyFact_Position();

	/**
	 * Returns the meta object for the attribute '{@link generator.GeographyFact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.GeographyFact#getType()
	 * @see #getGeographyFact()
	 * @generated
	 */
	EAttribute getGeographyFact_Type();

	/**
	 * Returns the meta object for the attribute '{@link generator.GeographyFact#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.GeographyFact#getValue()
	 * @see #getGeographyFact()
	 * @generated
	 */
	EAttribute getGeographyFact_Value();

	/**
	 * Returns the meta object for class '{@link generator.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see generator.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link generator.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see generator.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link generator.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see generator.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link generator.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see generator.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the reference '{@link generator.Date#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see generator.Date#getPosition()
	 * @see #getDate()
	 * @generated
	 */
	EReference getDate_Position();

	/**
	 * Returns the meta object for the '{@link generator.Date#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see generator.Date#toString()
	 * @generated
	 */
	EOperation getDate__ToString();

	/**
	 * Returns the meta object for class '{@link generator.TimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period</em>'.
	 * @see generator.TimePeriod
	 * @generated
	 */
	EClass getTimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link generator.TimePeriod#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Year</em>'.
	 * @see generator.TimePeriod#getStartYear()
	 * @see #getTimePeriod()
	 * @generated
	 */
	EAttribute getTimePeriod_StartYear();

	/**
	 * Returns the meta object for the attribute '{@link generator.TimePeriod#getEndYear <em>End Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Year</em>'.
	 * @see generator.TimePeriod#getEndYear()
	 * @see #getTimePeriod()
	 * @generated
	 */
	EAttribute getTimePeriod_EndYear();

	/**
	 * Returns the meta object for the reference '{@link generator.TimePeriod#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Position</em>'.
	 * @see generator.TimePeriod#getStartPosition()
	 * @see #getTimePeriod()
	 * @generated
	 */
	EReference getTimePeriod_StartPosition();

	/**
	 * Returns the meta object for the reference '{@link generator.TimePeriod#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Position</em>'.
	 * @see generator.TimePeriod#getEndPosition()
	 * @see #getTimePeriod()
	 * @generated
	 */
	EReference getTimePeriod_EndPosition();

	/**
	 * Returns the meta object for the '{@link generator.TimePeriod#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see generator.TimePeriod#toString()
	 * @generated
	 */
	EOperation getTimePeriod__ToString();

	/**
	 * Returns the meta object for class '{@link generator.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see generator.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link generator.AQuestionParam <em>AQuestion Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AQuestion Param</em>'.
	 * @see generator.AQuestionParam
	 * @generated
	 */
	EClass getAQuestionParam();

	/**
	 * Returns the meta object for class '{@link generator.VisualizationQuestionParam <em>Visualization Question Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Question Param</em>'.
	 * @see generator.VisualizationQuestionParam
	 * @generated
	 */
	EClass getVisualizationQuestionParam();

	/**
	 * Returns the meta object for the reference '{@link generator.VisualizationQuestionParam#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization</em>'.
	 * @see generator.VisualizationQuestionParam#getVisualization()
	 * @see #getVisualizationQuestionParam()
	 * @generated
	 */
	EReference getVisualizationQuestionParam_Visualization();

	/**
	 * Returns the meta object for class '{@link generator.HistoricalEventAssociation <em>Historical Event Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Event Association</em>'.
	 * @see generator.HistoricalEventAssociation
	 * @generated
	 */
	EClass getHistoricalEventAssociation();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalEventAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see generator.HistoricalEventAssociation#getSource()
	 * @see #getHistoricalEventAssociation()
	 * @generated
	 */
	EAttribute getHistoricalEventAssociation_Source();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalEventAssociation#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see generator.HistoricalEventAssociation#getMissing()
	 * @see #getHistoricalEventAssociation()
	 * @generated
	 */
	EAttribute getHistoricalEventAssociation_Missing();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalEventAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see generator.HistoricalEventAssociation#getTarget()
	 * @see #getHistoricalEventAssociation()
	 * @generated
	 */
	EAttribute getHistoricalEventAssociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalEventAssociation#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.HistoricalEventAssociation#isCheckOnLearnerAction()
	 * @see #getHistoricalEventAssociation()
	 * @generated
	 */
	EAttribute getHistoricalEventAssociation_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalEventAssociation#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.HistoricalEventAssociation#isNoStatementTask()
	 * @see #getHistoricalEventAssociation()
	 * @generated
	 */
	EAttribute getHistoricalEventAssociation_NoStatementTask();

	/**
	 * Returns the meta object for class '{@link generator.LegendAMap <em>Legend AMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend AMap</em>'.
	 * @see generator.LegendAMap
	 * @generated
	 */
	EClass getLegendAMap();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendAMap#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.LegendAMap#getNbMissingElements()
	 * @see #getLegendAMap()
	 * @generated
	 */
	EAttribute getLegendAMap_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendAMap#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see generator.LegendAMap#getMissing()
	 * @see #getLegendAMap()
	 * @generated
	 */
	EAttribute getLegendAMap_Missing();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendAMap#isGraphicTask <em>Graphic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphic Task</em>'.
	 * @see generator.LegendAMap#isGraphicTask()
	 * @see #getLegendAMap()
	 * @generated
	 */
	EAttribute getLegendAMap_GraphicTask();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendAMap#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.LegendAMap#isCheckOnLearnerAction()
	 * @see #getLegendAMap()
	 * @generated
	 */
	EAttribute getLegendAMap_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendAMap#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.LegendAMap#isNoStatementTask()
	 * @see #getLegendAMap()
	 * @generated
	 */
	EAttribute getLegendAMap_NoStatementTask();

	/**
	 * Returns the meta object for class '{@link generator.LocateOnAMap <em>Locate On AMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locate On AMap</em>'.
	 * @see generator.LocateOnAMap
	 * @generated
	 */
	EClass getLocateOnAMap();

	/**
	 * Returns the meta object for the attribute '{@link generator.LocateOnAMap#getNbExpectedAnswers <em>Nb Expected Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Expected Answers</em>'.
	 * @see generator.LocateOnAMap#getNbExpectedAnswers()
	 * @see #getLocateOnAMap()
	 * @generated
	 */
	EAttribute getLocateOnAMap_NbExpectedAnswers();

	/**
	 * Returns the meta object for the attribute '{@link generator.LocateOnAMap#isLearnersChoices <em>Learners Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learners Choices</em>'.
	 * @see generator.LocateOnAMap#isLearnersChoices()
	 * @see #getLocateOnAMap()
	 * @generated
	 */
	EAttribute getLocateOnAMap_LearnersChoices();

	/**
	 * Returns the meta object for the attribute '{@link generator.LocateOnAMap#isGraphicTask <em>Graphic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphic Task</em>'.
	 * @see generator.LocateOnAMap#isGraphicTask()
	 * @see #getLocateOnAMap()
	 * @generated
	 */
	EAttribute getLocateOnAMap_GraphicTask();

	/**
	 * Returns the meta object for class '{@link generator.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see generator.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link generator.Teacher#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.Teacher#getID()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_ID();

	/**
	 * Returns the meta object for the reference list '{@link generator.Teacher#getClassrooms <em>Classrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classrooms</em>'.
	 * @see generator.Teacher#getClassrooms()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Classrooms();

	/**
	 * Returns the meta object for the attribute '{@link generator.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for class '{@link generator.Teachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teachers</em>'.
	 * @see generator.Teachers
	 * @generated
	 */
	EClass getTeachers();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Teachers#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teachers</em>'.
	 * @see generator.Teachers#getTeachers()
	 * @see #getTeachers()
	 * @generated
	 */
	EReference getTeachers_Teachers();

	/**
	 * Returns the meta object for class '{@link generator.Classrooms <em>Classrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classrooms</em>'.
	 * @see generator.Classrooms
	 * @generated
	 */
	EClass getClassrooms();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Classrooms#getClassrooms <em>Classrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classrooms</em>'.
	 * @see generator.Classrooms#getClassrooms()
	 * @see #getClassrooms()
	 * @generated
	 */
	EReference getClassrooms_Classrooms();

	/**
	 * Returns the meta object for class '{@link generator.AQuestionableFact <em>AQuestionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AQuestionable Fact</em>'.
	 * @see generator.AQuestionableFact
	 * @generated
	 */
	EClass getAQuestionableFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.AQuestionableFact#isWasSelected <em>Was Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Was Selected</em>'.
	 * @see generator.AQuestionableFact#isWasSelected()
	 * @see #getAQuestionableFact()
	 * @generated
	 */
	EAttribute getAQuestionableFact_WasSelected();

	/**
	 * Returns the meta object for the attribute '{@link generator.AQuestionableFact#isAchieved <em>Achieved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achieved</em>'.
	 * @see generator.AQuestionableFact#isAchieved()
	 * @see #getAQuestionableFact()
	 * @generated
	 */
	EAttribute getAQuestionableFact_Achieved();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.AQuestionableFact#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see generator.AQuestionableFact#getResults()
	 * @see #getAQuestionableFact()
	 * @generated
	 */
	EReference getAQuestionableFact_Results();

	/**
	 * Returns the meta object for the attribute '{@link generator.AQuestionableFact#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generator.AQuestionableFact#getID()
	 * @see #getAQuestionableFact()
	 * @generated
	 */
	EAttribute getAQuestionableFact_ID();

	/**
	 * Returns the meta object for the attribute '{@link generator.AQuestionableFact#isQuestionWithImage <em>Question With Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question With Image</em>'.
	 * @see generator.AQuestionableFact#isQuestionWithImage()
	 * @see #getAQuestionableFact()
	 * @generated
	 */
	EAttribute getAQuestionableFact_QuestionWithImage();

	/**
	 * Returns the meta object for class '{@link generator.AVisualizationQuestionableFact <em>AVisualization Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVisualization Questionable Fact</em>'.
	 * @see generator.AVisualizationQuestionableFact
	 * @generated
	 */
	EClass getAVisualizationQuestionableFact();

	/**
	 * Returns the meta object for the reference '{@link generator.AVisualizationQuestionableFact#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization</em>'.
	 * @see generator.AVisualizationQuestionableFact#getVisualization()
	 * @see #getAVisualizationQuestionableFact()
	 * @generated
	 */
	EReference getAVisualizationQuestionableFact_Visualization();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.AVisualizationQuestionableFact#getVisualizationSolutions <em>Visualization Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization Solutions</em>'.
	 * @see generator.AVisualizationQuestionableFact#getVisualizationSolutions()
	 * @see #getAVisualizationQuestionableFact()
	 * @generated
	 */
	EReference getAVisualizationQuestionableFact_VisualizationSolutions();

	/**
	 * Returns the meta object for the attribute '{@link generator.AVisualizationQuestionableFact#getConsigne <em>Consigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consigne</em>'.
	 * @see generator.AVisualizationQuestionableFact#getConsigne()
	 * @see #getAVisualizationQuestionableFact()
	 * @generated
	 */
	EAttribute getAVisualizationQuestionableFact_Consigne();

	/**
	 * Returns the meta object for class '{@link generator.VisualizationSolution <em>Visualization Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Solution</em>'.
	 * @see generator.VisualizationSolution
	 * @generated
	 */
	EClass getVisualizationSolution();

	/**
	 * Returns the meta object for the attribute '{@link generator.VisualizationSolution#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.VisualizationSolution#getValue()
	 * @see #getVisualizationSolution()
	 * @generated
	 */
	EAttribute getVisualizationSolution_Value();

	/**
	 * Returns the meta object for the reference '{@link generator.VisualizationSolution#getVisualizationPosition <em>Visualization Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization Position</em>'.
	 * @see generator.VisualizationSolution#getVisualizationPosition()
	 * @see #getVisualizationSolution()
	 * @generated
	 */
	EReference getVisualizationSolution_VisualizationPosition();

	/**
	 * Returns the meta object for the attribute '{@link generator.VisualizationSolution#isImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see generator.VisualizationSolution#isImage()
	 * @see #getVisualizationSolution()
	 * @generated
	 */
	EAttribute getVisualizationSolution_Image();

	/**
	 * Returns the meta object for class '{@link generator.HGLevel <em>HG Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HG Level</em>'.
	 * @see generator.HGLevel
	 * @generated
	 */
	EClass getHGLevel();

	/**
	 * Returns the meta object for class '{@link generator.PositionedVisualizationElement <em>Positioned Visualization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Visualization Element</em>'.
	 * @see generator.PositionedVisualizationElement
	 * @generated
	 */
	EClass getPositionedVisualizationElement();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.PositionedVisualizationElement#getCreatedPositions <em>Created Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Created Positions</em>'.
	 * @see generator.PositionedVisualizationElement#getCreatedPositions()
	 * @see #getPositionedVisualizationElement()
	 * @generated
	 */
	EReference getPositionedVisualizationElement_CreatedPositions();

	/**
	 * Returns the meta object for the reference '{@link generator.PositionedVisualizationElement#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization</em>'.
	 * @see generator.PositionedVisualizationElement#getVisualization()
	 * @see #getPositionedVisualizationElement()
	 * @generated
	 */
	EReference getPositionedVisualizationElement_Visualization();

	/**
	 * Returns the meta object for class '{@link generator.DateQuestionableFact <em>Date Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Questionable Fact</em>'.
	 * @see generator.DateQuestionableFact
	 * @generated
	 */
	EClass getDateQuestionableFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.DateQuestionableFact#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element</em>'.
	 * @see generator.DateQuestionableFact#getSourceElement()
	 * @see #getDateQuestionableFact()
	 * @generated
	 */
	EAttribute getDateQuestionableFact_SourceElement();

	/**
	 * Returns the meta object for the attribute list '{@link generator.DateQuestionableFact#getMissingElements <em>Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Missing Elements</em>'.
	 * @see generator.DateQuestionableFact#getMissingElements()
	 * @see #getDateQuestionableFact()
	 * @generated
	 */
	EAttribute getDateQuestionableFact_MissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.DateQuestionableFact#getSourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element Type</em>'.
	 * @see generator.DateQuestionableFact#getSourceElementType()
	 * @see #getDateQuestionableFact()
	 * @generated
	 */
	EAttribute getDateQuestionableFact_SourceElementType();

	/**
	 * Returns the meta object for the attribute '{@link generator.DateQuestionableFact#getMissingElementsType <em>Missing Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Elements Type</em>'.
	 * @see generator.DateQuestionableFact#getMissingElementsType()
	 * @see #getDateQuestionableFact()
	 * @generated
	 */
	EAttribute getDateQuestionableFact_MissingElementsType();

	/**
	 * Returns the meta object for class '{@link generator.HistoricalChronology <em>Historical Chronology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Chronology</em>'.
	 * @see generator.HistoricalChronology
	 * @generated
	 */
	EClass getHistoricalChronology();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalChronology#isMixDatePeriod <em>Mix Date Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mix Date Period</em>'.
	 * @see generator.HistoricalChronology#isMixDatePeriod()
	 * @see #getHistoricalChronology()
	 * @generated
	 */
	EAttribute getHistoricalChronology_MixDatePeriod();

	/**
	 * Returns the meta object for the attribute '{@link generator.HistoricalChronology#isGraphicTask <em>Graphic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphic Task</em>'.
	 * @see generator.HistoricalChronology#isGraphicTask()
	 * @see #getHistoricalChronology()
	 * @generated
	 */
	EAttribute getHistoricalChronology_GraphicTask();

	/**
	 * Returns the meta object for class '{@link generator.MapQuestionableFact <em>Map Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Questionable Fact</em>'.
	 * @see generator.MapQuestionableFact
	 * @generated
	 */
	EClass getMapQuestionableFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.MapQuestionableFact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.MapQuestionableFact#getType()
	 * @see #getMapQuestionableFact()
	 * @generated
	 */
	EAttribute getMapQuestionableFact_Type();

	/**
	 * Returns the meta object for class '{@link generator.JudoTechniqueFact <em>Judo Technique Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Technique Fact</em>'.
	 * @see generator.JudoTechniqueFact
	 * @generated
	 */
	EClass getJudoTechniqueFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoTechniqueFact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.JudoTechniqueFact#getName()
	 * @see #getJudoTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoTechniqueFact_Name();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoTechniqueFact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.JudoTechniqueFact#getDescription()
	 * @see #getJudoTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoTechniqueFact_Description();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoTechniqueFact#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see generator.JudoTechniqueFact#getCategory()
	 * @see #getJudoTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoTechniqueFact_Category();

	/**
	 * Returns the meta object for class '{@link generator.ClassifyTechnique <em>Classify Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classify Technique</em>'.
	 * @see generator.ClassifyTechnique
	 * @generated
	 */
	EClass getClassifyTechnique();

	/**
	 * Returns the meta object for class '{@link generator.IdentifyTechnique <em>Identify Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identify Technique</em>'.
	 * @see generator.IdentifyTechnique
	 * @generated
	 */
	EClass getIdentifyTechnique();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyTechnique#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.IdentifyTechnique#getNbMissingElements()
	 * @see #getIdentifyTechnique()
	 * @generated
	 */
	EAttribute getIdentifyTechnique_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyTechnique#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.IdentifyTechnique#isCheckOnLearnerAction()
	 * @see #getIdentifyTechnique()
	 * @generated
	 */
	EAttribute getIdentifyTechnique_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyTechnique#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see generator.IdentifyTechnique#getMissing()
	 * @see #getIdentifyTechnique()
	 * @generated
	 */
	EAttribute getIdentifyTechnique_Missing();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyTechnique#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see generator.IdentifyTechnique#getSource()
	 * @see #getIdentifyTechnique()
	 * @generated
	 */
	EAttribute getIdentifyTechnique_Source();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyTechnique#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.IdentifyTechnique#isNoStatementTask()
	 * @see #getIdentifyTechnique()
	 * @generated
	 */
	EAttribute getIdentifyTechnique_NoStatementTask();

	/**
	 * Returns the meta object for class '{@link generator.JudoQuestionableTechniqueFact <em>Judo Questionable Technique Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Questionable Technique Fact</em>'.
	 * @see generator.JudoQuestionableTechniqueFact
	 * @generated
	 */
	EClass getJudoQuestionableTechniqueFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableTechniqueFact#getSourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element Type</em>'.
	 * @see generator.JudoQuestionableTechniqueFact#getSourceElementType()
	 * @see #getJudoQuestionableTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableTechniqueFact_SourceElementType();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableTechniqueFact#getMissingElement <em>Missing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Element</em>'.
	 * @see generator.JudoQuestionableTechniqueFact#getMissingElement()
	 * @see #getJudoQuestionableTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableTechniqueFact_MissingElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableTechniqueFact#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element</em>'.
	 * @see generator.JudoQuestionableTechniqueFact#getSourceElement()
	 * @see #getJudoQuestionableTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableTechniqueFact_SourceElement();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableTechniqueFact#getMissingElementType <em>Missing Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Element Type</em>'.
	 * @see generator.JudoQuestionableTechniqueFact#getMissingElementType()
	 * @see #getJudoQuestionableTechniqueFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableTechniqueFact_MissingElementType();

	/**
	 * Returns the meta object for class '{@link generator.JudoQuestionableClassifyFact <em>Judo Questionable Classify Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Questionable Classify Fact</em>'.
	 * @see generator.JudoQuestionableClassifyFact
	 * @generated
	 */
	EClass getJudoQuestionableClassifyFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableClassifyFact#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see generator.JudoQuestionableClassifyFact#getCategory()
	 * @see #getJudoQuestionableClassifyFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableClassifyFact_Category();

	/**
	 * Returns the meta object for the attribute list '{@link generator.JudoQuestionableClassifyFact#getTechniques <em>Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Techniques</em>'.
	 * @see generator.JudoQuestionableClassifyFact#getTechniques()
	 * @see #getJudoQuestionableClassifyFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableClassifyFact_Techniques();

	/**
	 * Returns the meta object for class '{@link generator.JudoLevel <em>Judo Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Level</em>'.
	 * @see generator.JudoLevel
	 * @generated
	 */
	EClass getJudoLevel();

	/**
	 * Returns the meta object for class '{@link generator.JudoArbitrationGestureFact <em>Judo Arbitration Gesture Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Arbitration Gesture Fact</em>'.
	 * @see generator.JudoArbitrationGestureFact
	 * @generated
	 */
	EClass getJudoArbitrationGestureFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoArbitrationGestureFact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.JudoArbitrationGestureFact#getName()
	 * @see #getJudoArbitrationGestureFact()
	 * @generated
	 */
	EAttribute getJudoArbitrationGestureFact_Name();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoArbitrationGestureFact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.JudoArbitrationGestureFact#getDescription()
	 * @see #getJudoArbitrationGestureFact()
	 * @generated
	 */
	EAttribute getJudoArbitrationGestureFact_Description();

	/**
	 * Returns the meta object for class '{@link generator.IdentifyArbitrationGesture <em>Identify Arbitration Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identify Arbitration Gesture</em>'.
	 * @see generator.IdentifyArbitrationGesture
	 * @generated
	 */
	EClass getIdentifyArbitrationGesture();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyArbitrationGesture#getNbMissingElements <em>Nb Missing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missing Elements</em>'.
	 * @see generator.IdentifyArbitrationGesture#getNbMissingElements()
	 * @see #getIdentifyArbitrationGesture()
	 * @generated
	 */
	EAttribute getIdentifyArbitrationGesture_NbMissingElements();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyArbitrationGesture#isCheckOnLearnerAction <em>Check On Learner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check On Learner Action</em>'.
	 * @see generator.IdentifyArbitrationGesture#isCheckOnLearnerAction()
	 * @see #getIdentifyArbitrationGesture()
	 * @generated
	 */
	EAttribute getIdentifyArbitrationGesture_CheckOnLearnerAction();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyArbitrationGesture#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see generator.IdentifyArbitrationGesture#getSource()
	 * @see #getIdentifyArbitrationGesture()
	 * @generated
	 */
	EAttribute getIdentifyArbitrationGesture_Source();

	/**
	 * Returns the meta object for the attribute '{@link generator.IdentifyArbitrationGesture#isNoStatementTask <em>No Statement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Statement Task</em>'.
	 * @see generator.IdentifyArbitrationGesture#isNoStatementTask()
	 * @see #getIdentifyArbitrationGesture()
	 * @generated
	 */
	EAttribute getIdentifyArbitrationGesture_NoStatementTask();

	/**
	 * Returns the meta object for class '{@link generator.JudoQuestionableArbitrationFact <em>Judo Questionable Arbitration Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judo Questionable Arbitration Fact</em>'.
	 * @see generator.JudoQuestionableArbitrationFact
	 * @generated
	 */
	EClass getJudoQuestionableArbitrationFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getName()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_Name();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getDescription()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_Description();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getRepresentationID <em>Representation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation ID</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getRepresentationID()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_RepresentationID();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getNameSoluce <em>Name Soluce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Soluce</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getNameSoluce()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_NameSoluce();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getRepresentationIDSoluce <em>Representation ID Soluce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation ID Soluce</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getRepresentationIDSoluce()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_RepresentationIDSoluce();

	/**
	 * Returns the meta object for the attribute '{@link generator.JudoQuestionableArbitrationFact#getDescriptionSoluce <em>Description Soluce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Soluce</em>'.
	 * @see generator.JudoQuestionableArbitrationFact#getDescriptionSoluce()
	 * @see #getJudoQuestionableArbitrationFact()
	 * @generated
	 */
	EAttribute getJudoQuestionableArbitrationFact_DescriptionSoluce();

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
	 * Returns the meta object for class '{@link generator.LegendQuestionableFact <em>Legend Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend Questionable Fact</em>'.
	 * @see generator.LegendQuestionableFact
	 * @generated
	 */
	EClass getLegendQuestionableFact();

	/**
	 * Returns the meta object for the attribute '{@link generator.LegendQuestionableFact#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see generator.LegendQuestionableFact#getTarget()
	 * @see #getLegendQuestionableFact()
	 * @generated
	 */
	EAttribute getLegendQuestionableFact_Target();

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
	 * Returns the meta object for enum '{@link generator.ERoomType <em>ERoom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERoom Type</em>'.
	 * @see generator.ERoomType
	 * @generated
	 */
	EEnum getERoomType();

	/**
	 * Returns the meta object for enum '{@link generator.EGeographyValue <em>EGeography Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGeography Value</em>'.
	 * @see generator.EGeographyValue
	 * @generated
	 */
	EEnum getEGeographyValue();

	/**
	 * Returns the meta object for enum '{@link generator.EHistoryTarget <em>EHistory Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EHistory Target</em>'.
	 * @see generator.EHistoryTarget
	 * @generated
	 */
	EEnum getEHistoryTarget();

	/**
	 * Returns the meta object for enum '{@link generator.ELegendTarget <em>ELegend Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ELegend Target</em>'.
	 * @see generator.ELegendTarget
	 * @generated
	 */
	EEnum getELegendTarget();

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
	 * Returns the meta object for enum '{@link generator.ETimeTarget <em>ETime Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETime Target</em>'.
	 * @see generator.ETimeTarget
	 * @generated
	 */
	EEnum getETimeTarget();

	/**
	 * Returns the meta object for enum '{@link generator.EJudoTarget <em>EJudo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EJudo Target</em>'.
	 * @see generator.EJudoTarget
	 * @generated
	 */
	EEnum getEJudoTarget();

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
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FACT__REPRESENTATION = eINSTANCE.getAbstractFact_Representation();

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
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OF_FACTS__VISUALIZATION = eINSTANCE.getSetOfFacts_Visualization();

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
		 * The meta object literal for the '<em><b>Learner Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__LEARNER_PLAYER = eINSTANCE.getDungeon_LearnerPlayer();

		/**
		 * The meta object literal for the '<em><b>Curses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__CURSES = eINSTANCE.getDungeon_Curses();

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
		 * The meta object literal for the '<em><b>Nb Expected Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NB_EXPECTED_ANSWERS = eINSTANCE.getRoom_NbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__TYPE = eINSTANCE.getRoomType_Type();

		/**
		 * The meta object literal for the '<em><b>Get Directions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___GET_DIRECTIONS = eINSTANCE.getRoomType__GetDirections();

		/**
		 * The meta object literal for the '<em><b>Is Entry Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___IS_ENTRY_ROOM_TYPE = eINSTANCE.getRoomType__IsEntryRoomType();

		/**
		 * The meta object literal for the '<em><b>Is Exit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___IS_EXIT_ROOM_TYPE = eINSTANCE.getRoomType__IsExitRoomType();

		/**
		 * The meta object literal for the '<em><b>Is Question Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___IS_QUESTION_ROOM_TYPE = eINSTANCE.getRoomType__IsQuestionRoomType();

		/**
		 * The meta object literal for the '<em><b>Is Trap Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___IS_TRAP_ROOM_TYPE = eINSTANCE.getRoomType__IsTrapRoomType();

		/**
		 * The meta object literal for the '<em><b>Is Portal Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___IS_PORTAL_ROOM_TYPE = eINSTANCE.getRoomType__IsPortalRoomType();

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
		 * The meta object literal for the '<em><b>Success Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__SUCCESS_PERCENT = eINSTANCE.getPrerequisite_SuccessPercent();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION1__CHECK_ON_LEARNER_ACTION = eINSTANCE.getMTCompletion1_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION1__NO_STATEMENT_TASK = eINSTANCE.getMTCompletion1_NoStatementTask();

		/**
		 * The meta object literal for the '{@link generator.impl.ClassroomImpl <em>Classroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ClassroomImpl
		 * @see generator.impl.GeneratorPackageImpl#getClassroom()
		 * @generated
		 */
		EClass CLASSROOM = eINSTANCE.getClassroom();

		/**
		 * The meta object literal for the '<em><b>Gamecontext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSROOM__GAMECONTEXT = eINSTANCE.getClassroom_Gamecontext();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__ID = eINSTANCE.getClassroom_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__NAME = eINSTANCE.getClassroom_Name();

		/**
		 * The meta object literal for the '<em><b>Learner Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSROOM__LEARNER_PLAYERS = eINSTANCE.getClassroom_LearnerPlayers();

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
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PLAYER__STATISTICS = eINSTANCE.getLearnerPlayer_Statistics();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNER_PLAYER__LAST_NAME = eINSTANCE.getLearnerPlayer_LastName();

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
		 * The meta object literal for the '<em><b>Player Progress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESSION__PLAYER_PROGRESS = eINSTANCE.getProgression_PlayerProgress();

		/**
		 * The meta object literal for the '<em><b>Learner Progress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESSION__LEARNER_PROGRESS = eINSTANCE.getProgression_LearnerProgress();

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
		 * The meta object literal for the '<em><b>Success Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_OBJECTIVE_LEVEL__SUCCESS_PERCENT = eINSTANCE.getCurrentObjectiveLevel_SuccessPercent();

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
		 * The meta object literal for the '{@link generator.impl.DynamicMultipleChoiceImpl <em>Dynamic Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DynamicMultipleChoiceImpl
		 * @see generator.impl.GeneratorPackageImpl#getDynamicMultipleChoice()
		 * @generated
		 */
		EClass DYNAMIC_MULTIPLE_CHOICE = eINSTANCE.getDynamicMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_MULTIPLE_CHOICE__TYPE = eINSTANCE.getDynamicMultipleChoice_Type();

		/**
		 * The meta object literal for the '<em><b>Nb Bad Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_MULTIPLE_CHOICE__NB_BAD_CHOICES = eINSTANCE.getDynamicMultipleChoice_NbBadChoices();

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
		 * The meta object literal for the '{@link generator.ATask <em>ATask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ATask
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
		 * The meta object literal for the '<em><b>Get Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___GET_NB_EXPECTED_ANSWERS = eINSTANCE.getATask__GetNbExpectedAnswers();

		/**
		 * The meta object literal for the '<em><b>Is Graphic Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___IS_GRAPHIC_TASK = eINSTANCE.getATask__IsGraphicTask();

		/**
		 * The meta object literal for the '<em><b>Is Check On Learner Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___IS_CHECK_ON_LEARNER_ACTION = eINSTANCE.getATask__IsCheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>Is No Statement Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATASK___IS_NO_STATEMENT_TASK = eINSTANCE.getATask__IsNoStatementTask();

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
		 * The meta object literal for the '<em><b>Get Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS = eINSTANCE.getCompletionTask__GetNbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TASK__CHECK_ON_LEARNER_ACTION = eINSTANCE
				.getIdentificationTask_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TASK__NO_STATEMENT_TASK = eINSTANCE.getIdentificationTask_NoStatementTask();

		/**
		 * The meta object literal for the '<em><b>Get Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFICATION_TASK___GET_NB_EXPECTED_ANSWERS = eINSTANCE
				.getIdentificationTask__GetNbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__CHECK_ON_LEARNER_ACTION = eINSTANCE.getMembershipIDTask_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_ID_TASK__NO_STATEMENT_TASK = eINSTANCE.getMembershipIDTask_NoStatementTask();

		/**
		 * The meta object literal for the '<em><b>Get Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS = eINSTANCE.getMembershipIDTask__GetNbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION2__CHECK_ON_LEARNER_ACTION = eINSTANCE.getMTCompletion2_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_COMPLETION2__NO_STATEMENT_TASK = eINSTANCE.getMTCompletion2_NoStatementTask();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RECONTRUCTION__CHECK_ON_LEARNER_ACTION = eINSTANCE.getMTRecontruction_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_RECONTRUCTION__NO_STATEMENT_TASK = eINSTANCE.getMTRecontruction_NoStatementTask();

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
		 * The meta object literal for the '<em><b>Success Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS_BY_TASK__SUCCESS_PERCENT = eINSTANCE.getResultsByTask_SuccessPercent();

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
		 * The meta object literal for the '{@link generator.impl.QuestionableFactImpl <em>Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionableFact()
		 * @generated
		 */
		EClass QUESTIONABLE_FACT = eINSTANCE.getQuestionableFact();

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
		 * The meta object literal for the '<em><b>Success Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_CRITERIA__SUCCESS_PERCENT = eINSTANCE.getCompletionCriteria_SuccessPercent();

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
		 * The meta object literal for the '<em><b>Curses Availabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES = eINSTANCE
				.getLevelsDifficultyProgress_CursesAvailabilities();

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
		 * The meta object literal for the '<em><b>Curses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ELEMENT_TYPES__CURSES = eINSTANCE.getGameElementTypes_Curses();

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
		 * The meta object literal for the '<em><b>Locked Abilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__LOCKED_ABILITIES = eINSTANCE.getEquipment_LockedAbilities();

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
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__LOCKED = eINSTANCE.getGameplay_Locked();

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
		 * The meta object literal for the '<em><b>On Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE_FACT_RESULT__ON_TIME = eINSTANCE.getQuestionableFactResult_OnTime();

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
		 * The meta object literal for the '<em><b>Locking Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__LOCKING_EQUIPMENT = eINSTANCE.getAbility_LockingEquipment();

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
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__ELEMENT_TYPE = eINSTANCE.getPositionedElement_ElementType();

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
		 * The meta object literal for the '<em><b>Complete Fact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PARAM__COMPLETE_FACT = eINSTANCE.getQuestionParam_CompleteFact();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PARAM__IMAGE = eINSTANCE.getQuestionParam_Image();

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
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION_PARAM__POSITION = eINSTANCE.getPropositionParam_Position();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION_PARAM__IMAGE = eINSTANCE.getPropositionParam_Image();

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
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_SOLUCE_PARAM__POSITION = eINSTANCE.getEntrySoluceParam_Position();

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
		 * The meta object literal for the '<em><b>Image Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__IMAGE_DISPLAY = eINSTANCE.getDisplay_ImageDisplay();

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
		 * The meta object literal for the '<em><b>For Proposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOMPONENT__FOR_PROPOSITION = eINSTANCE.getAComponent_ForProposition();

		/**
		 * The meta object literal for the '<em><b>For Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOMPONENT__FOR_STATEMENT = eINSTANCE.getAComponent_ForStatement();

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
		 * The meta object literal for the '<em><b>Alternate Components</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__ALTERNATE_COMPONENTS = eINSTANCE.getStructure_AlternateComponents();

		/**
		 * The meta object literal for the '<em><b>For Fact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__FOR_FACT = eINSTANCE.getStructure_ForFact();

		/**
		 * The meta object literal for the '<em><b>For Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__FOR_MAP = eINSTANCE.getStructure_ForMap();

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
		 * The meta object literal for the '<em><b>Default Correctness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DEFAULT_CORRECTNESS = eINSTANCE.getComponent_DefaultCorrectness();

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
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERING_TASK__CHECK_ON_LEARNER_ACTION = eINSTANCE.getOrderingTask_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERING_TASK__NO_STATEMENT_TASK = eINSTANCE.getOrderingTask_NoStatementTask();

		/**
		 * The meta object literal for the '<em><b>Get Nb Expected Answers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDERING_TASK___GET_NB_EXPECTED_ANSWERS = eINSTANCE.getOrderingTask__GetNbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Gameplays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__GAMEPLAYS = eINSTANCE.getRelation_Gameplays();

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
		 * The meta object literal for the '<em><b>Answer Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ANSWER_MODALITY = eINSTANCE.getCondition_AnswerModality();

		/**
		 * The meta object literal for the '<em><b>Nb Expected Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NB_EXPECTED_ANSWERS = eINSTANCE.getCondition_NbExpectedAnswers();

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
		 * The meta object literal for the '<em><b>Statement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GAMEPLAY__STATEMENT_TYPE = eINSTANCE.getQuestionGameplay_StatementType();

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
		 * The meta object literal for the '{@link generator.impl.PlayerProgressImpl <em>Player Progress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PlayerProgressImpl
		 * @see generator.impl.GeneratorPackageImpl#getPlayerProgress()
		 * @generated
		 */
		EClass PLAYER_PROGRESS = eINSTANCE.getPlayerProgress();

		/**
		 * The meta object literal for the '<em><b>Current Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROGRESS__CURRENT_LEVEL = eINSTANCE.getPlayerProgress_CurrentLevel();

		/**
		 * The meta object literal for the '<em><b>Coins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROGRESS__COINS = eINSTANCE.getPlayerProgress_Coins();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_PROGRESS__ITEMS = eINSTANCE.getPlayerProgress_Items();

		/**
		 * The meta object literal for the '{@link generator.impl.LearnerProgressImpl <em>Learner Progress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearnerProgressImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearnerProgress()
		 * @generated
		 */
		EClass LEARNER_PROGRESS = eINSTANCE.getLearnerProgress();

		/**
		 * The meta object literal for the '<em><b>Currentobjectivelevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PROGRESS__CURRENTOBJECTIVELEVELS = eINSTANCE.getLearnerProgress_Currentobjectivelevels();

		/**
		 * The meta object literal for the '{@link generator.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ItemImpl
		 * @see generator.impl.GeneratorPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Bought</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__BOUGHT = eINSTANCE.getItem_Bought();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ACTIVATED = eINSTANCE.getItem_Activated();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__EQUIPMENT = eINSTANCE.getItem_Equipment();

		/**
		 * The meta object literal for the '{@link generator.impl.ItemsImpl <em>Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ItemsImpl
		 * @see generator.impl.GeneratorPackageImpl#getItems()
		 * @generated
		 */
		EClass ITEMS = eINSTANCE.getItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS__ITEMS = eINSTANCE.getItems_Items();

		/**
		 * The meta object literal for the '{@link generator.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.StatisticsImpl
		 * @see generator.impl.GeneratorPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '<em><b>Nb Correct Given Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_CORRECT_GIVEN_ANSWERS = eINSTANCE.getStatistics_NbCorrectGivenAnswers();

		/**
		 * The meta object literal for the '<em><b>Nb Questions Encountered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_QUESTIONS_ENCOUNTERED = eINSTANCE.getStatistics_NbQuestionsEncountered();

		/**
		 * The meta object literal for the '<em><b>Max Game Level Reached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MAX_GAME_LEVEL_REACHED = eINSTANCE.getStatistics_MaxGameLevelReached();

		/**
		 * The meta object literal for the '<em><b>Total Time Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__TOTAL_TIME_MIN = eINSTANCE.getStatistics_TotalTimeMin();

		/**
		 * The meta object literal for the '<em><b>Nb Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_DEATHS = eINSTANCE.getStatistics_NbDeaths();

		/**
		 * The meta object literal for the '<em><b>Nb Levels Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_LEVELS_GENERATED = eINSTANCE.getStatistics_NbLevelsGenerated();

		/**
		 * The meta object literal for the '<em><b>Nb Finished Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_FINISHED_LEVELS = eINSTANCE.getStatistics_NbFinishedLevels();

		/**
		 * The meta object literal for the '<em><b>Nb Unfinished Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__NB_UNFINISHED_LEVELS = eINSTANCE.getStatistics_NbUnfinishedLevels();

		/**
		 * The meta object literal for the '<em><b>Total Coins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__TOTAL_COINS = eINSTANCE.getStatistics_TotalCoins();

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
		 * The meta object literal for the '<em><b>Nb Displays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NB_DISPLAYS = eINSTANCE.getElementType_NbDisplays();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__ABILITY = eINSTANCE.getElementType_Ability();

		/**
		 * The meta object literal for the '<em><b>Is Displayable Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT = eINSTANCE.getElementType__IsDisplayableElement();

		/**
		 * The meta object literal for the '{@link generator.impl.CursesImpl <em>Curses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CursesImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurses()
		 * @generated
		 */
		EClass CURSES = eINSTANCE.getCurses();

		/**
		 * The meta object literal for the '<em><b>Curses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSES__CURSES = eINSTANCE.getCurses_Curses();

		/**
		 * The meta object literal for the '{@link generator.impl.CurseImpl <em>Curse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CurseImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurse()
		 * @generated
		 */
		EClass CURSE = eINSTANCE.getCurse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSE__NAME = eINSTANCE.getCurse_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.LabyrinthCurseImpl <em>Labyrinth Curse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LabyrinthCurseImpl
		 * @see generator.impl.GeneratorPackageImpl#getLabyrinthCurse()
		 * @generated
		 */
		EClass LABYRINTH_CURSE = eINSTANCE.getLabyrinthCurse();

		/**
		 * The meta object literal for the '{@link generator.impl.CurseEligibilityImpl <em>Curse Eligibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CurseEligibilityImpl
		 * @see generator.impl.GeneratorPackageImpl#getCurseEligibility()
		 * @generated
		 */
		EClass CURSE_ELIGIBILITY = eINSTANCE.getCurseEligibility();

		/**
		 * The meta object literal for the '<em><b>Start Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSE_ELIGIBILITY__START_LEVEL = eINSTANCE.getCurseEligibility_StartLevel();

		/**
		 * The meta object literal for the '<em><b>Curse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSE_ELIGIBILITY__CURSE = eINSTANCE.getCurseEligibility_Curse();

		/**
		 * The meta object literal for the '{@link generator.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ImageImpl
		 * @see generator.impl.GeneratorPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ID = eINSTANCE.getImage_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.VisualizationImpl
		 * @see generator.impl.GeneratorPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__POSITIONS = eINSTANCE.getVisualization_Positions();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__ID = eINSTANCE.getVisualization_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.VisualizationPositionImpl <em>Visualization Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.VisualizationPositionImpl
		 * @see generator.impl.GeneratorPackageImpl#getVisualizationPosition()
		 * @generated
		 */
		EClass VISUALIZATION_POSITION = eINSTANCE.getVisualizationPosition();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_POSITION__ID = eINSTANCE.getVisualizationPosition_ID();

		/**
		 * The meta object literal for the '{@link generator.impl.LegendTextImpl <em>Legend Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LegendTextImpl
		 * @see generator.impl.GeneratorPackageImpl#getLegendText()
		 * @generated
		 */
		EClass LEGEND_TEXT = eINSTANCE.getLegendText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_TEXT__TEXT = eINSTANCE.getLegendText_Text();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGEND_TEXT__POSITION = eINSTANCE.getLegendText_Position();

		/**
		 * The meta object literal for the '{@link generator.impl.HistoryFactImpl <em>History Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.HistoryFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getHistoryFact()
		 * @generated
		 */
		EClass HISTORY_FACT = eINSTANCE.getHistoryFact();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY_FACT__EVENT = eINSTANCE.getHistoryFact_Event();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY_FACT__TIME = eINSTANCE.getHistoryFact_Time();

		/**
		 * The meta object literal for the '{@link generator.impl.GeographyLegendFactImpl <em>Geography Legend Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GeographyLegendFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getGeographyLegendFact()
		 * @generated
		 */
		EClass GEOGRAPHY_LEGEND_FACT = eINSTANCE.getGeographyLegendFact();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHY_LEGEND_FACT__LEGEND = eINSTANCE.getGeographyLegendFact_Legend();

		/**
		 * The meta object literal for the '<em><b>Symbol Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHY_LEGEND_FACT__SYMBOL_POSITION = eINSTANCE.getGeographyLegendFact_SymbolPosition();

		/**
		 * The meta object literal for the '{@link generator.impl.GeographyFactImpl <em>Geography Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GeographyFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getGeographyFact()
		 * @generated
		 */
		EClass GEOGRAPHY_FACT = eINSTANCE.getGeographyFact();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHY_FACT__POSITION = eINSTANCE.getGeographyFact_Position();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY_FACT__TYPE = eINSTANCE.getGeographyFact_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY_FACT__VALUE = eINSTANCE.getGeographyFact_Value();

		/**
		 * The meta object literal for the '{@link generator.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DateImpl
		 * @see generator.impl.GeneratorPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE__POSITION = eINSTANCE.getDate_Position();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE___TO_STRING = eINSTANCE.getDate__ToString();

		/**
		 * The meta object literal for the '{@link generator.impl.TimePeriodImpl <em>Time Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TimePeriodImpl
		 * @see generator.impl.GeneratorPackageImpl#getTimePeriod()
		 * @generated
		 */
		EClass TIME_PERIOD = eINSTANCE.getTimePeriod();

		/**
		 * The meta object literal for the '<em><b>Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD__START_YEAR = eINSTANCE.getTimePeriod_StartYear();

		/**
		 * The meta object literal for the '<em><b>End Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD__END_YEAR = eINSTANCE.getTimePeriod_EndYear();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PERIOD__START_POSITION = eINSTANCE.getTimePeriod_StartPosition();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PERIOD__END_POSITION = eINSTANCE.getTimePeriod_EndPosition();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_PERIOD___TO_STRING = eINSTANCE.getTimePeriod__ToString();

		/**
		 * The meta object literal for the '{@link generator.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TimeImpl
		 * @see generator.impl.GeneratorPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link generator.impl.AQuestionParamImpl <em>AQuestion Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AQuestionParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getAQuestionParam()
		 * @generated
		 */
		EClass AQUESTION_PARAM = eINSTANCE.getAQuestionParam();

		/**
		 * The meta object literal for the '{@link generator.impl.VisualizationQuestionParamImpl <em>Visualization Question Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.VisualizationQuestionParamImpl
		 * @see generator.impl.GeneratorPackageImpl#getVisualizationQuestionParam()
		 * @generated
		 */
		EClass VISUALIZATION_QUESTION_PARAM = eINSTANCE.getVisualizationQuestionParam();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_QUESTION_PARAM__VISUALIZATION = eINSTANCE
				.getVisualizationQuestionParam_Visualization();

		/**
		 * The meta object literal for the '{@link generator.impl.HistoricalEventAssociationImpl <em>Historical Event Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.HistoricalEventAssociationImpl
		 * @see generator.impl.GeneratorPackageImpl#getHistoricalEventAssociation()
		 * @generated
		 */
		EClass HISTORICAL_EVENT_ASSOCIATION = eINSTANCE.getHistoricalEventAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_EVENT_ASSOCIATION__SOURCE = eINSTANCE.getHistoricalEventAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_EVENT_ASSOCIATION__MISSING = eINSTANCE.getHistoricalEventAssociation_Missing();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_EVENT_ASSOCIATION__TARGET = eINSTANCE.getHistoricalEventAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_EVENT_ASSOCIATION__CHECK_ON_LEARNER_ACTION = eINSTANCE
				.getHistoricalEventAssociation_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_EVENT_ASSOCIATION__NO_STATEMENT_TASK = eINSTANCE
				.getHistoricalEventAssociation_NoStatementTask();

		/**
		 * The meta object literal for the '{@link generator.impl.LegendAMapImpl <em>Legend AMap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LegendAMapImpl
		 * @see generator.impl.GeneratorPackageImpl#getLegendAMap()
		 * @generated
		 */
		EClass LEGEND_AMAP = eINSTANCE.getLegendAMap();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_AMAP__NB_MISSING_ELEMENTS = eINSTANCE.getLegendAMap_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_AMAP__MISSING = eINSTANCE.getLegendAMap_Missing();

		/**
		 * The meta object literal for the '<em><b>Graphic Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_AMAP__GRAPHIC_TASK = eINSTANCE.getLegendAMap_GraphicTask();

		/**
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_AMAP__CHECK_ON_LEARNER_ACTION = eINSTANCE.getLegendAMap_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_AMAP__NO_STATEMENT_TASK = eINSTANCE.getLegendAMap_NoStatementTask();

		/**
		 * The meta object literal for the '{@link generator.impl.LocateOnAMapImpl <em>Locate On AMap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LocateOnAMapImpl
		 * @see generator.impl.GeneratorPackageImpl#getLocateOnAMap()
		 * @generated
		 */
		EClass LOCATE_ON_AMAP = eINSTANCE.getLocateOnAMap();

		/**
		 * The meta object literal for the '<em><b>Nb Expected Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATE_ON_AMAP__NB_EXPECTED_ANSWERS = eINSTANCE.getLocateOnAMap_NbExpectedAnswers();

		/**
		 * The meta object literal for the '<em><b>Learners Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATE_ON_AMAP__LEARNERS_CHOICES = eINSTANCE.getLocateOnAMap_LearnersChoices();

		/**
		 * The meta object literal for the '<em><b>Graphic Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATE_ON_AMAP__GRAPHIC_TASK = eINSTANCE.getLocateOnAMap_GraphicTask();

		/**
		 * The meta object literal for the '{@link generator.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TeacherImpl
		 * @see generator.impl.GeneratorPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__ID = eINSTANCE.getTeacher_ID();

		/**
		 * The meta object literal for the '<em><b>Classrooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__CLASSROOMS = eINSTANCE.getTeacher_Classrooms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '{@link generator.impl.TeachersImpl <em>Teachers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.TeachersImpl
		 * @see generator.impl.GeneratorPackageImpl#getTeachers()
		 * @generated
		 */
		EClass TEACHERS = eINSTANCE.getTeachers();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHERS__TEACHERS = eINSTANCE.getTeachers_Teachers();

		/**
		 * The meta object literal for the '{@link generator.impl.ClassroomsImpl <em>Classrooms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ClassroomsImpl
		 * @see generator.impl.GeneratorPackageImpl#getClassrooms()
		 * @generated
		 */
		EClass CLASSROOMS = eINSTANCE.getClassrooms();

		/**
		 * The meta object literal for the '<em><b>Classrooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSROOMS__CLASSROOMS = eINSTANCE.getClassrooms_Classrooms();

		/**
		 * The meta object literal for the '{@link generator.impl.AQuestionableFactImpl <em>AQuestionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AQuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getAQuestionableFact()
		 * @generated
		 */
		EClass AQUESTIONABLE_FACT = eINSTANCE.getAQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Was Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AQUESTIONABLE_FACT__WAS_SELECTED = eINSTANCE.getAQuestionableFact_WasSelected();

		/**
		 * The meta object literal for the '<em><b>Achieved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AQUESTIONABLE_FACT__ACHIEVED = eINSTANCE.getAQuestionableFact_Achieved();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AQUESTIONABLE_FACT__RESULTS = eINSTANCE.getAQuestionableFact_Results();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AQUESTIONABLE_FACT__ID = eINSTANCE.getAQuestionableFact_ID();

		/**
		 * The meta object literal for the '<em><b>Question With Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AQUESTIONABLE_FACT__QUESTION_WITH_IMAGE = eINSTANCE.getAQuestionableFact_QuestionWithImage();

		/**
		 * The meta object literal for the '{@link generator.impl.AVisualizationQuestionableFactImpl <em>AVisualization Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.AVisualizationQuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getAVisualizationQuestionableFact()
		 * @generated
		 */
		EClass AVISUALIZATION_QUESTIONABLE_FACT = eINSTANCE.getAVisualizationQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION = eINSTANCE
				.getAVisualizationQuestionableFact_Visualization();

		/**
		 * The meta object literal for the '<em><b>Visualization Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVISUALIZATION_QUESTIONABLE_FACT__VISUALIZATION_SOLUTIONS = eINSTANCE
				.getAVisualizationQuestionableFact_VisualizationSolutions();

		/**
		 * The meta object literal for the '<em><b>Consigne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVISUALIZATION_QUESTIONABLE_FACT__CONSIGNE = eINSTANCE.getAVisualizationQuestionableFact_Consigne();

		/**
		 * The meta object literal for the '{@link generator.impl.VisualizationSolutionImpl <em>Visualization Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.VisualizationSolutionImpl
		 * @see generator.impl.GeneratorPackageImpl#getVisualizationSolution()
		 * @generated
		 */
		EClass VISUALIZATION_SOLUTION = eINSTANCE.getVisualizationSolution();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_SOLUTION__VALUE = eINSTANCE.getVisualizationSolution_Value();

		/**
		 * The meta object literal for the '<em><b>Visualization Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_SOLUTION__VISUALIZATION_POSITION = eINSTANCE
				.getVisualizationSolution_VisualizationPosition();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_SOLUTION__IMAGE = eINSTANCE.getVisualizationSolution_Image();

		/**
		 * The meta object literal for the '{@link generator.impl.HGLevelImpl <em>HG Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.HGLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getHGLevel()
		 * @generated
		 */
		EClass HG_LEVEL = eINSTANCE.getHGLevel();

		/**
		 * The meta object literal for the '{@link generator.impl.PositionedVisualizationElementImpl <em>Positioned Visualization Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PositionedVisualizationElementImpl
		 * @see generator.impl.GeneratorPackageImpl#getPositionedVisualizationElement()
		 * @generated
		 */
		EClass POSITIONED_VISUALIZATION_ELEMENT = eINSTANCE.getPositionedVisualizationElement();

		/**
		 * The meta object literal for the '<em><b>Created Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_VISUALIZATION_ELEMENT__CREATED_POSITIONS = eINSTANCE
				.getPositionedVisualizationElement_CreatedPositions();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_VISUALIZATION_ELEMENT__VISUALIZATION = eINSTANCE
				.getPositionedVisualizationElement_Visualization();

		/**
		 * The meta object literal for the '{@link generator.impl.DateQuestionableFactImpl <em>Date Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DateQuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getDateQuestionableFact()
		 * @generated
		 */
		EClass DATE_QUESTIONABLE_FACT = eINSTANCE.getDateQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT = eINSTANCE.getDateQuestionableFact_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Missing Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS = eINSTANCE.getDateQuestionableFact_MissingElements();

		/**
		 * The meta object literal for the '<em><b>Source Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_QUESTIONABLE_FACT__SOURCE_ELEMENT_TYPE = eINSTANCE.getDateQuestionableFact_SourceElementType();

		/**
		 * The meta object literal for the '<em><b>Missing Elements Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_QUESTIONABLE_FACT__MISSING_ELEMENTS_TYPE = eINSTANCE
				.getDateQuestionableFact_MissingElementsType();

		/**
		 * The meta object literal for the '{@link generator.impl.HistoricalChronologyImpl <em>Historical Chronology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.HistoricalChronologyImpl
		 * @see generator.impl.GeneratorPackageImpl#getHistoricalChronology()
		 * @generated
		 */
		EClass HISTORICAL_CHRONOLOGY = eINSTANCE.getHistoricalChronology();

		/**
		 * The meta object literal for the '<em><b>Mix Date Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_CHRONOLOGY__MIX_DATE_PERIOD = eINSTANCE.getHistoricalChronology_MixDatePeriod();

		/**
		 * The meta object literal for the '<em><b>Graphic Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_CHRONOLOGY__GRAPHIC_TASK = eINSTANCE.getHistoricalChronology_GraphicTask();

		/**
		 * The meta object literal for the '{@link generator.impl.MapQuestionableFactImpl <em>Map Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.MapQuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getMapQuestionableFact()
		 * @generated
		 */
		EClass MAP_QUESTIONABLE_FACT = eINSTANCE.getMapQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_QUESTIONABLE_FACT__TYPE = eINSTANCE.getMapQuestionableFact_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoTechniqueFactImpl <em>Judo Technique Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoTechniqueFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoTechniqueFact()
		 * @generated
		 */
		EClass JUDO_TECHNIQUE_FACT = eINSTANCE.getJudoTechniqueFact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_TECHNIQUE_FACT__NAME = eINSTANCE.getJudoTechniqueFact_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_TECHNIQUE_FACT__DESCRIPTION = eINSTANCE.getJudoTechniqueFact_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_TECHNIQUE_FACT__CATEGORY = eINSTANCE.getJudoTechniqueFact_Category();

		/**
		 * The meta object literal for the '{@link generator.impl.ClassifyTechniqueImpl <em>Classify Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ClassifyTechniqueImpl
		 * @see generator.impl.GeneratorPackageImpl#getClassifyTechnique()
		 * @generated
		 */
		EClass CLASSIFY_TECHNIQUE = eINSTANCE.getClassifyTechnique();

		/**
		 * The meta object literal for the '{@link generator.impl.IdentifyTechniqueImpl <em>Identify Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.IdentifyTechniqueImpl
		 * @see generator.impl.GeneratorPackageImpl#getIdentifyTechnique()
		 * @generated
		 */
		EClass IDENTIFY_TECHNIQUE = eINSTANCE.getIdentifyTechnique();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_TECHNIQUE__NB_MISSING_ELEMENTS = eINSTANCE.getIdentifyTechnique_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_TECHNIQUE__CHECK_ON_LEARNER_ACTION = eINSTANCE.getIdentifyTechnique_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_TECHNIQUE__MISSING = eINSTANCE.getIdentifyTechnique_Missing();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_TECHNIQUE__SOURCE = eINSTANCE.getIdentifyTechnique_Source();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_TECHNIQUE__NO_STATEMENT_TASK = eINSTANCE.getIdentifyTechnique_NoStatementTask();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoQuestionableTechniqueFactImpl <em>Judo Questionable Technique Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoQuestionableTechniqueFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableTechniqueFact()
		 * @generated
		 */
		EClass JUDO_QUESTIONABLE_TECHNIQUE_FACT = eINSTANCE.getJudoQuestionableTechniqueFact();

		/**
		 * The meta object literal for the '<em><b>Source Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT_TYPE = eINSTANCE
				.getJudoQuestionableTechniqueFact_SourceElementType();

		/**
		 * The meta object literal for the '<em><b>Missing Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT = eINSTANCE
				.getJudoQuestionableTechniqueFact_MissingElement();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_TECHNIQUE_FACT__SOURCE_ELEMENT = eINSTANCE
				.getJudoQuestionableTechniqueFact_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Missing Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_TECHNIQUE_FACT__MISSING_ELEMENT_TYPE = eINSTANCE
				.getJudoQuestionableTechniqueFact_MissingElementType();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoQuestionableClassifyFactImpl <em>Judo Questionable Classify Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoQuestionableClassifyFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableClassifyFact()
		 * @generated
		 */
		EClass JUDO_QUESTIONABLE_CLASSIFY_FACT = eINSTANCE.getJudoQuestionableClassifyFact();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_CLASSIFY_FACT__CATEGORY = eINSTANCE.getJudoQuestionableClassifyFact_Category();

		/**
		 * The meta object literal for the '<em><b>Techniques</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_CLASSIFY_FACT__TECHNIQUES = eINSTANCE.getJudoQuestionableClassifyFact_Techniques();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoLevelImpl <em>Judo Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoLevelImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoLevel()
		 * @generated
		 */
		EClass JUDO_LEVEL = eINSTANCE.getJudoLevel();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoArbitrationGestureFactImpl <em>Judo Arbitration Gesture Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoArbitrationGestureFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoArbitrationGestureFact()
		 * @generated
		 */
		EClass JUDO_ARBITRATION_GESTURE_FACT = eINSTANCE.getJudoArbitrationGestureFact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_ARBITRATION_GESTURE_FACT__NAME = eINSTANCE.getJudoArbitrationGestureFact_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_ARBITRATION_GESTURE_FACT__DESCRIPTION = eINSTANCE.getJudoArbitrationGestureFact_Description();

		/**
		 * The meta object literal for the '{@link generator.impl.IdentifyArbitrationGestureImpl <em>Identify Arbitration Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.IdentifyArbitrationGestureImpl
		 * @see generator.impl.GeneratorPackageImpl#getIdentifyArbitrationGesture()
		 * @generated
		 */
		EClass IDENTIFY_ARBITRATION_GESTURE = eINSTANCE.getIdentifyArbitrationGesture();

		/**
		 * The meta object literal for the '<em><b>Nb Missing Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_ARBITRATION_GESTURE__NB_MISSING_ELEMENTS = eINSTANCE
				.getIdentifyArbitrationGesture_NbMissingElements();

		/**
		 * The meta object literal for the '<em><b>Check On Learner Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_ARBITRATION_GESTURE__CHECK_ON_LEARNER_ACTION = eINSTANCE
				.getIdentifyArbitrationGesture_CheckOnLearnerAction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_ARBITRATION_GESTURE__SOURCE = eINSTANCE.getIdentifyArbitrationGesture_Source();

		/**
		 * The meta object literal for the '<em><b>No Statement Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFY_ARBITRATION_GESTURE__NO_STATEMENT_TASK = eINSTANCE
				.getIdentifyArbitrationGesture_NoStatementTask();

		/**
		 * The meta object literal for the '{@link generator.impl.JudoQuestionableArbitrationFactImpl <em>Judo Questionable Arbitration Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.JudoQuestionableArbitrationFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getJudoQuestionableArbitrationFact()
		 * @generated
		 */
		EClass JUDO_QUESTIONABLE_ARBITRATION_FACT = eINSTANCE.getJudoQuestionableArbitrationFact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME = eINSTANCE.getJudoQuestionableArbitrationFact_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION = eINSTANCE
				.getJudoQuestionableArbitrationFact_Description();

		/**
		 * The meta object literal for the '<em><b>Representation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID = eINSTANCE
				.getJudoQuestionableArbitrationFact_RepresentationID();

		/**
		 * The meta object literal for the '<em><b>Name Soluce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__NAME_SOLUCE = eINSTANCE
				.getJudoQuestionableArbitrationFact_NameSoluce();

		/**
		 * The meta object literal for the '<em><b>Representation ID Soluce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__REPRESENTATION_ID_SOLUCE = eINSTANCE
				.getJudoQuestionableArbitrationFact_RepresentationIDSoluce();

		/**
		 * The meta object literal for the '<em><b>Description Soluce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDO_QUESTIONABLE_ARBITRATION_FACT__DESCRIPTION_SOLUCE = eINSTANCE
				.getJudoQuestionableArbitrationFact_DescriptionSoluce();

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
		 * The meta object literal for the '{@link generator.impl.LegendQuestionableFactImpl <em>Legend Questionable Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LegendQuestionableFactImpl
		 * @see generator.impl.GeneratorPackageImpl#getLegendQuestionableFact()
		 * @generated
		 */
		EClass LEGEND_QUESTIONABLE_FACT = eINSTANCE.getLegendQuestionableFact();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_QUESTIONABLE_FACT__TARGET = eINSTANCE.getLegendQuestionableFact_Target();

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
		 * The meta object literal for the '{@link generator.ERoomType <em>ERoom Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ERoomType
		 * @see generator.impl.GeneratorPackageImpl#getERoomType()
		 * @generated
		 */
		EEnum EROOM_TYPE = eINSTANCE.getERoomType();

		/**
		 * The meta object literal for the '{@link generator.EGeographyValue <em>EGeography Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EGeographyValue
		 * @see generator.impl.GeneratorPackageImpl#getEGeographyValue()
		 * @generated
		 */
		EEnum EGEOGRAPHY_VALUE = eINSTANCE.getEGeographyValue();

		/**
		 * The meta object literal for the '{@link generator.EHistoryTarget <em>EHistory Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EHistoryTarget
		 * @see generator.impl.GeneratorPackageImpl#getEHistoryTarget()
		 * @generated
		 */
		EEnum EHISTORY_TARGET = eINSTANCE.getEHistoryTarget();

		/**
		 * The meta object literal for the '{@link generator.ELegendTarget <em>ELegend Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ELegendTarget
		 * @see generator.impl.GeneratorPackageImpl#getELegendTarget()
		 * @generated
		 */
		EEnum ELEGEND_TARGET = eINSTANCE.getELegendTarget();

		/**
		 * The meta object literal for the '{@link generator.EStatementType <em>EStatement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EStatementType
		 * @see generator.impl.GeneratorPackageImpl#getEStatementType()
		 * @generated
		 */
		EEnum ESTATEMENT_TYPE = eINSTANCE.getEStatementType();

		/**
		 * The meta object literal for the '{@link generator.ETimeTarget <em>ETime Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.ETimeTarget
		 * @see generator.impl.GeneratorPackageImpl#getETimeTarget()
		 * @generated
		 */
		EEnum ETIME_TARGET = eINSTANCE.getETimeTarget();

		/**
		 * The meta object literal for the '{@link generator.EJudoTarget <em>EJudo Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.EJudoTarget
		 * @see generator.impl.GeneratorPackageImpl#getEJudoTarget()
		 * @generated
		 */
		EEnum EJUDO_TARGET = eINSTANCE.getEJudoTarget();

	}

} //GeneratorPackage
