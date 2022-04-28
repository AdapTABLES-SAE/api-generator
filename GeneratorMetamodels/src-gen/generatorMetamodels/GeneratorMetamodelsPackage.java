/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see generatorMetamodels.GeneratorMetamodelsFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorMetamodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generatorMetamodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/generatorMetamodels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generatorMetamodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorMetamodelsPackage eINSTANCE = generatorMetamodels.impl.GeneratorMetamodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ResponseModalityImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResponseModality()
	 * @generated
	 */
	int RESPONSE_MODALITY = 22;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITY__RESPONSE_TIME = 0;

	/**
	 * The number of structural features of the '<em>Response Modality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Modality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MODALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.MultipleChoiceImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__RESPONSE_TIME = RESPONSE_MODALITY__RESPONSE_TIME;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.SubObjectiveImpl <em>Sub Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SubObjectiveImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSubObjective()
	 * @generated
	 */
	int SUB_OBJECTIVE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION = 1;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS = 2;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__RESPONSEMODALITY = 4;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__SETTINGS = 5;

	/**
	 * The number of structural features of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ResultVerificationImpl <em>Result Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ResultVerificationImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultVerification()
	 * @generated
	 */
	int RESULT_VERIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>Check Is Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION__CHECK_IS_RIGHT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VERIFICATION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.AbstractFactImpl <em>Abstract Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.AbstractFactImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getAbstractFact()
	 * @generated
	 */
	int ABSTRACT_FACT = 12;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.SetOfFactsImpl <em>Set Of Facts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SetOfFactsImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSetOfFacts()
	 * @generated
	 */
	int SET_OF_FACTS = 2;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.ProblemResolutionImpl <em>Problem Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ProblemResolutionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getProblemResolution()
	 * @generated
	 */
	int PROBLEM_RESOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Problem Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Problem Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.RoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 30;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ExitRoomImpl <em>Exit Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ExitRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getExitRoom()
	 * @generated
	 */
	int EXIT_ROOM = 4;

	/**
	 * The number of structural features of the '<em>Exit Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.MultipleCompletionImpl <em>Multiple Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.MultipleCompletionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMultipleCompletion()
	 * @generated
	 */
	int MULTIPLE_COMPLETION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Multiple Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPLETION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.CurrentProgressionImpl <em>Current Progression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.CurrentProgressionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getCurrentProgression()
	 * @generated
	 */
	int CURRENT_PROGRESSION = 6;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_PROGRESSION__LEARNINGOBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_PROGRESSION__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Current Progression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_PROGRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Progression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_PROGRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.DungeonImpl <em>Dungeon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.DungeonImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDungeon()
	 * @generated
	 */
	int DUNGEON = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__MODE = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__ENTRY = 2;

	/**
	 * The number of structural features of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dungeon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SettingsImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 8;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.InputImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 9;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RESPONSE_TIME = RESPONSE_MODALITY__RESPONSE_TIME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = RESPONSE_MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = RESPONSE_MODALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.QuestionRoomImpl <em>Question Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.QuestionRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQuestionRoom()
	 * @generated
	 */
	int QUESTION_ROOM = 10;

	/**
	 * The number of structural features of the '<em>Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.LearningPathImpl <em>Learning Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LearningPathImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningPath()
	 * @generated
	 */
	int LEARNING_PATH = 11;

	/**
	 * The feature id for the '<em><b>Learningobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__LEARNINGOBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Subobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__SUBOBJECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__KNOWLEDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__NAME = 3;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.SimpleQuestionRoomImpl <em>Simple Question Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SimpleQuestionRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSimpleQuestionRoom()
	 * @generated
	 */
	int SIMPLE_QUESTION_ROOM = 13;

	/**
	 * The number of structural features of the '<em>Simple Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUESTION_ROOM_FEATURE_COUNT = QUESTION_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUESTION_ROOM_OPERATION_COUNT = QUESTION_ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.FactImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 14;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.LearnerPlayerImpl <em>Learner Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LearnerPlayerImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearnerPlayer()
	 * @generated
	 */
	int LEARNER_PLAYER = 15;

	/**
	 * The feature id for the '<em><b>Learningprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__LEARNINGPROFILE = 0;

	/**
	 * The feature id for the '<em><b>Gameprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__GAMEPROFILE = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__FIRSTNAME = 2;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNER_PLAYER__LASTNAME = 3;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.HighLevelActivityImpl <em>High Level Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.HighLevelActivityImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getHighLevelActivity()
	 * @generated
	 */
	int HIGH_LEVEL_ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>High Level Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>High Level Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.EntryRoomImpl <em>Entry Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.EntryRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getEntryRoom()
	 * @generated
	 */
	int ENTRY_ROOM = 17;

	/**
	 * The number of structural features of the '<em>Entry Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.DoorImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 18;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.BossRoomImpl <em>Boss Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.BossRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getBossRoom()
	 * @generated
	 */
	int BOSS_ROOM = 19;

	/**
	 * The number of structural features of the '<em>Boss Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS_ROOM_FEATURE_COUNT = QUESTION_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boss Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOSS_ROOM_OPERATION_COUNT = QUESTION_ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ReconstructionImpl <em>Reconstruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ReconstructionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getReconstruction()
	 * @generated
	 */
	int RECONSTRUCTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Reconstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reconstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONSTRUCTION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.SimpleCompletionImpl <em>Simple Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SimpleCompletionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSimpleCompletion()
	 * @generated
	 */
	int SIMPLE_COMPLETION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Simple Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPLETION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.GameProfileImpl <em>Game Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.GameProfileImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameProfile()
	 * @generated
	 */
	int GAME_PROFILE = 24;

	/**
	 * The number of structural features of the '<em>Game Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PROFILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Game Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.LearningProfileImpl <em>Learning Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LearningProfileImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningProfile()
	 * @generated
	 */
	int LEARNING_PROFILE = 25;

	/**
	 * The feature id for the '<em><b>Learningpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PROFILE__LEARNINGPATH = 0;

	/**
	 * The feature id for the '<em><b>Currentprogressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PROFILE__CURRENTPROGRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Learning Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Learning Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LearningObjectiveImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningObjective()
	 * @generated
	 */
	int LEARNING_OBJECTIVE = 26;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__PREREQUISITES = 1;

	/**
	 * The feature id for the '<em><b>Setoffacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__SETOFFACTS = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__NAME = 4;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LevelImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 27;

	/**
	 * The feature id for the '<em><b>Subobjectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SUBOBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = 1;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SETTINGS = 2;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.KnowledgeImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 28;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.FactValidityVerificationImpl <em>Fact Validity Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.FactValidityVerificationImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getFactValidityVerification()
	 * @generated
	 */
	int FACT_VALIDITY_VERIFICATION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__NAME = SUB_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Fact Validity Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fact Validity Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_VALIDITY_VERIFICATION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.GameMode <em>Game Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.GameMode
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameMode()
	 * @generated
	 */
	int GAME_MODE = 31;

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see generatorMetamodels.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.MultipleChoice#getNbChoices <em>Nb Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Choices</em>'.
	 * @see generatorMetamodels.MultipleChoice#getNbChoices()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_NbChoices();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ResultVerification <em>Result Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Verification</em>'.
	 * @see generatorMetamodels.ResultVerification
	 * @generated
	 */
	EClass getResultVerification();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ResultVerification#isCheckIsRight <em>Check Is Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Is Right</em>'.
	 * @see generatorMetamodels.ResultVerification#isCheckIsRight()
	 * @see #getResultVerification()
	 * @generated
	 */
	EAttribute getResultVerification_CheckIsRight();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.SetOfFacts <em>Set Of Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Of Facts</em>'.
	 * @see generatorMetamodels.SetOfFacts
	 * @generated
	 */
	EClass getSetOfFacts();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.SetOfFacts#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see generatorMetamodels.SetOfFacts#getFacts()
	 * @see #getSetOfFacts()
	 * @generated
	 */
	EReference getSetOfFacts_Facts();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.SetOfFacts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.SetOfFacts#getName()
	 * @see #getSetOfFacts()
	 * @generated
	 */
	EAttribute getSetOfFacts_Name();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ProblemResolution <em>Problem Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Resolution</em>'.
	 * @see generatorMetamodels.ProblemResolution
	 * @generated
	 */
	EClass getProblemResolution();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ExitRoom <em>Exit Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Room</em>'.
	 * @see generatorMetamodels.ExitRoom
	 * @generated
	 */
	EClass getExitRoom();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.MultipleCompletion <em>Multiple Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Completion</em>'.
	 * @see generatorMetamodels.MultipleCompletion
	 * @generated
	 */
	EClass getMultipleCompletion();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.CurrentProgression <em>Current Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Progression</em>'.
	 * @see generatorMetamodels.CurrentProgression
	 * @generated
	 */
	EClass getCurrentProgression();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.CurrentProgression#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningobjective</em>'.
	 * @see generatorMetamodels.CurrentProgression#getLearningobjective()
	 * @see #getCurrentProgression()
	 * @generated
	 */
	EReference getCurrentProgression_Learningobjective();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.CurrentProgression#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see generatorMetamodels.CurrentProgression#getLevel()
	 * @see #getCurrentProgression()
	 * @generated
	 */
	EReference getCurrentProgression_Level();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Dungeon <em>Dungeon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dungeon</em>'.
	 * @see generatorMetamodels.Dungeon
	 * @generated
	 */
	EClass getDungeon();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Dungeon#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see generatorMetamodels.Dungeon#getMode()
	 * @see #getDungeon()
	 * @generated
	 */
	EAttribute getDungeon_Mode();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.Dungeon#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see generatorMetamodels.Dungeon#getRooms()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Rooms();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.Dungeon#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see generatorMetamodels.Dungeon#getEntry()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Entry();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see generatorMetamodels.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see generatorMetamodels.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.QuestionRoom <em>Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Room</em>'.
	 * @see generatorMetamodels.QuestionRoom
	 * @generated
	 */
	EClass getQuestionRoom();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.LearningPath <em>Learning Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Path</em>'.
	 * @see generatorMetamodels.LearningPath
	 * @generated
	 */
	EClass getLearningPath();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningPath#getLearningobjectives <em>Learningobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningobjectives</em>'.
	 * @see generatorMetamodels.LearningPath#getLearningobjectives()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Learningobjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningPath#getSubobjectives <em>Subobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subobjectives</em>'.
	 * @see generatorMetamodels.LearningPath#getSubobjectives()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Subobjectives();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.LearningPath#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see generatorMetamodels.LearningPath#getKnowledge()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Knowledge();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.LearningPath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.LearningPath#getName()
	 * @see #getLearningPath()
	 * @generated
	 */
	EAttribute getLearningPath_Name();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.AbstractFact <em>Abstract Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Fact</em>'.
	 * @see generatorMetamodels.AbstractFact
	 * @generated
	 */
	EClass getAbstractFact();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.SimpleQuestionRoom <em>Simple Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Question Room</em>'.
	 * @see generatorMetamodels.SimpleQuestionRoom
	 * @generated
	 */
	EClass getSimpleQuestionRoom();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see generatorMetamodels.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Fact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generatorMetamodels.Fact#getDescription()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Description();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.LearnerPlayer <em>Learner Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learner Player</em>'.
	 * @see generatorMetamodels.LearnerPlayer
	 * @generated
	 */
	EClass getLearnerPlayer();

	/**
	 * Returns the meta object for the containment reference '{@link generatorMetamodels.LearnerPlayer#getLearningprofile <em>Learningprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Learningprofile</em>'.
	 * @see generatorMetamodels.LearnerPlayer#getLearningprofile()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EReference getLearnerPlayer_Learningprofile();

	/**
	 * Returns the meta object for the containment reference '{@link generatorMetamodels.LearnerPlayer#getGameprofile <em>Gameprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gameprofile</em>'.
	 * @see generatorMetamodels.LearnerPlayer#getGameprofile()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EReference getLearnerPlayer_Gameprofile();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.LearnerPlayer#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see generatorMetamodels.LearnerPlayer#getFirstname()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EAttribute getLearnerPlayer_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.LearnerPlayer#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see generatorMetamodels.LearnerPlayer#getLastname()
	 * @see #getLearnerPlayer()
	 * @generated
	 */
	EAttribute getLearnerPlayer_Lastname();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.HighLevelActivity <em>High Level Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level Activity</em>'.
	 * @see generatorMetamodels.HighLevelActivity
	 * @generated
	 */
	EClass getHighLevelActivity();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.HighLevelActivity#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see generatorMetamodels.HighLevelActivity#getLevel()
	 * @see #getHighLevelActivity()
	 * @generated
	 */
	EReference getHighLevelActivity_Level();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.EntryRoom <em>Entry Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Room</em>'.
	 * @see generatorMetamodels.EntryRoom
	 * @generated
	 */
	EClass getEntryRoom();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see generatorMetamodels.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.BossRoom <em>Boss Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boss Room</em>'.
	 * @see generatorMetamodels.BossRoom
	 * @generated
	 */
	EClass getBossRoom();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Reconstruction <em>Reconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconstruction</em>'.
	 * @see generatorMetamodels.Reconstruction
	 * @generated
	 */
	EClass getReconstruction();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.SubObjective <em>Sub Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Objective</em>'.
	 * @see generatorMetamodels.SubObjective
	 * @generated
	 */
	EClass getSubObjective();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.SubObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.SubObjective#getName()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_Name();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.SubObjective#getPercentageOfApparition <em>Percentage Of Apparition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Apparition</em>'.
	 * @see generatorMetamodels.SubObjective#getPercentageOfApparition()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_PercentageOfApparition();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.SubObjective#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Valid Facts</em>'.
	 * @see generatorMetamodels.SubObjective#getPercentageOfValidFacts()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_PercentageOfValidFacts();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.SubObjective#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Consecutive Success</em>'.
	 * @see generatorMetamodels.SubObjective#getNbConsecutiveSuccess()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_NbConsecutiveSuccess();

	/**
	 * Returns the meta object for the containment reference '{@link generatorMetamodels.SubObjective#getResponsemodality <em>Responsemodality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsemodality</em>'.
	 * @see generatorMetamodels.SubObjective#getResponsemodality()
	 * @see #getSubObjective()
	 * @generated
	 */
	EReference getSubObjective_Responsemodality();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.SubObjective#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see generatorMetamodels.SubObjective#getSettings()
	 * @see #getSubObjective()
	 * @generated
	 */
	EReference getSubObjective_Settings();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ResponseModality <em>Response Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Modality</em>'.
	 * @see generatorMetamodels.ResponseModality
	 * @generated
	 */
	EClass getResponseModality();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ResponseModality#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see generatorMetamodels.ResponseModality#getResponseTime()
	 * @see #getResponseModality()
	 * @generated
	 */
	EAttribute getResponseModality_ResponseTime();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.SimpleCompletion <em>Simple Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Completion</em>'.
	 * @see generatorMetamodels.SimpleCompletion
	 * @generated
	 */
	EClass getSimpleCompletion();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.GameProfile <em>Game Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Profile</em>'.
	 * @see generatorMetamodels.GameProfile
	 * @generated
	 */
	EClass getGameProfile();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.LearningProfile <em>Learning Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Profile</em>'.
	 * @see generatorMetamodels.LearningProfile
	 * @generated
	 */
	EClass getLearningProfile();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.LearningProfile#getLearningpath <em>Learningpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningpath</em>'.
	 * @see generatorMetamodels.LearningProfile#getLearningpath()
	 * @see #getLearningProfile()
	 * @generated
	 */
	EReference getLearningProfile_Learningpath();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningProfile#getCurrentprogressions <em>Currentprogressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currentprogressions</em>'.
	 * @see generatorMetamodels.LearningProfile#getCurrentprogressions()
	 * @see #getLearningProfile()
	 * @generated
	 */
	EReference getLearningProfile_Currentprogressions();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Objective</em>'.
	 * @see generatorMetamodels.LearningObjective
	 * @generated
	 */
	EClass getLearningObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningObjective#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see generatorMetamodels.LearningObjective#getLevels()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Levels();

	/**
	 * Returns the meta object for the reference list '{@link generatorMetamodels.LearningObjective#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prerequisites</em>'.
	 * @see generatorMetamodels.LearningObjective#getPrerequisites()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Prerequisites();

	/**
	 * Returns the meta object for the reference list '{@link generatorMetamodels.LearningObjective#getSetoffacts <em>Setoffacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setoffacts</em>'.
	 * @see generatorMetamodels.LearningObjective#getSetoffacts()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Setoffacts();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.LearningObjective#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generatorMetamodels.LearningObjective#getID()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EAttribute getLearningObjective_ID();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.LearningObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.LearningObjective#getName()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EAttribute getLearningObjective_Name();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see generatorMetamodels.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the reference list '{@link generatorMetamodels.Level#getSubobjectives <em>Subobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subobjectives</em>'.
	 * @see generatorMetamodels.Level#getSubobjectives()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Subobjectives();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Level#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see generatorMetamodels.Level#getID()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.Level#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see generatorMetamodels.Level#getSettings()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Settings();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see generatorMetamodels.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Knowledge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.Knowledge#getName()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.Knowledge#getKnowledgefacts <em>Knowledgefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledgefacts</em>'.
	 * @see generatorMetamodels.Knowledge#getKnowledgefacts()
	 * @see #getKnowledge()
	 * @generated
	 */
	EReference getKnowledge_Knowledgefacts();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.FactValidityVerification <em>Fact Validity Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Validity Verification</em>'.
	 * @see generatorMetamodels.FactValidityVerification
	 * @generated
	 */
	EClass getFactValidityVerification();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see generatorMetamodels.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.GameMode <em>Game Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Mode</em>'.
	 * @see generatorMetamodels.GameMode
	 * @generated
	 */
	EEnum getGameMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorMetamodelsFactory getGeneratorMetamodelsFactory();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.MultipleChoiceImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMultipleChoice()
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
		 * The meta object literal for the '{@link generatorMetamodels.impl.ResultVerificationImpl <em>Result Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ResultVerificationImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultVerification()
		 * @generated
		 */
		EClass RESULT_VERIFICATION = eINSTANCE.getResultVerification();

		/**
		 * The meta object literal for the '<em><b>Check Is Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_VERIFICATION__CHECK_IS_RIGHT = eINSTANCE.getResultVerification_CheckIsRight();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SetOfFactsImpl <em>Set Of Facts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SetOfFactsImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSetOfFacts()
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
		 * The meta object literal for the '{@link generatorMetamodels.impl.ProblemResolutionImpl <em>Problem Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ProblemResolutionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getProblemResolution()
		 * @generated
		 */
		EClass PROBLEM_RESOLUTION = eINSTANCE.getProblemResolution();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.ExitRoomImpl <em>Exit Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ExitRoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getExitRoom()
		 * @generated
		 */
		EClass EXIT_ROOM = eINSTANCE.getExitRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.MultipleCompletionImpl <em>Multiple Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.MultipleCompletionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMultipleCompletion()
		 * @generated
		 */
		EClass MULTIPLE_COMPLETION = eINSTANCE.getMultipleCompletion();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.CurrentProgressionImpl <em>Current Progression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.CurrentProgressionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getCurrentProgression()
		 * @generated
		 */
		EClass CURRENT_PROGRESSION = eINSTANCE.getCurrentProgression();

		/**
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_PROGRESSION__LEARNINGOBJECTIVE = eINSTANCE.getCurrentProgression_Learningobjective();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_PROGRESSION__LEVEL = eINSTANCE.getCurrentProgression_Level();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.DungeonImpl <em>Dungeon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.DungeonImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDungeon()
		 * @generated
		 */
		EClass DUNGEON = eINSTANCE.getDungeon();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNGEON__MODE = eINSTANCE.getDungeon_Mode();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__ROOMS = eINSTANCE.getDungeon_Rooms();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__ENTRY = eINSTANCE.getDungeon_Entry();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SettingsImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSettings()
		 * @generated
		 */
		EClass SETTINGS = eINSTANCE.getSettings();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.InputImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.QuestionRoomImpl <em>Question Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.QuestionRoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQuestionRoom()
		 * @generated
		 */
		EClass QUESTION_ROOM = eINSTANCE.getQuestionRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.LearningPathImpl <em>Learning Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LearningPathImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningPath()
		 * @generated
		 */
		EClass LEARNING_PATH = eINSTANCE.getLearningPath();

		/**
		 * The meta object literal for the '<em><b>Learningobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__LEARNINGOBJECTIVES = eINSTANCE.getLearningPath_Learningobjectives();

		/**
		 * The meta object literal for the '<em><b>Subobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__SUBOBJECTIVES = eINSTANCE.getLearningPath_Subobjectives();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__KNOWLEDGE = eINSTANCE.getLearningPath_Knowledge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_PATH__NAME = eINSTANCE.getLearningPath_Name();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.AbstractFactImpl <em>Abstract Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.AbstractFactImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getAbstractFact()
		 * @generated
		 */
		EClass ABSTRACT_FACT = eINSTANCE.getAbstractFact();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SimpleQuestionRoomImpl <em>Simple Question Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SimpleQuestionRoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSimpleQuestionRoom()
		 * @generated
		 */
		EClass SIMPLE_QUESTION_ROOM = eINSTANCE.getSimpleQuestionRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.FactImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getFact()
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
		 * The meta object literal for the '{@link generatorMetamodels.impl.LearnerPlayerImpl <em>Learner Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LearnerPlayerImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearnerPlayer()
		 * @generated
		 */
		EClass LEARNER_PLAYER = eINSTANCE.getLearnerPlayer();

		/**
		 * The meta object literal for the '<em><b>Learningprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PLAYER__LEARNINGPROFILE = eINSTANCE.getLearnerPlayer_Learningprofile();

		/**
		 * The meta object literal for the '<em><b>Gameprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNER_PLAYER__GAMEPROFILE = eINSTANCE.getLearnerPlayer_Gameprofile();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNER_PLAYER__FIRSTNAME = eINSTANCE.getLearnerPlayer_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNER_PLAYER__LASTNAME = eINSTANCE.getLearnerPlayer_Lastname();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.HighLevelActivityImpl <em>High Level Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.HighLevelActivityImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getHighLevelActivity()
		 * @generated
		 */
		EClass HIGH_LEVEL_ACTIVITY = eINSTANCE.getHighLevelActivity();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_ACTIVITY__LEVEL = eINSTANCE.getHighLevelActivity_Level();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.EntryRoomImpl <em>Entry Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.EntryRoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getEntryRoom()
		 * @generated
		 */
		EClass ENTRY_ROOM = eINSTANCE.getEntryRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.DoorImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.BossRoomImpl <em>Boss Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.BossRoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getBossRoom()
		 * @generated
		 */
		EClass BOSS_ROOM = eINSTANCE.getBossRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.ReconstructionImpl <em>Reconstruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ReconstructionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getReconstruction()
		 * @generated
		 */
		EClass RECONSTRUCTION = eINSTANCE.getReconstruction();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SubObjectiveImpl <em>Sub Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SubObjectiveImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSubObjective()
		 * @generated
		 */
		EClass SUB_OBJECTIVE = eINSTANCE.getSubObjective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_OBJECTIVE__NAME = eINSTANCE.getSubObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Apparition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION = eINSTANCE.getSubObjective_PercentageOfApparition();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Valid Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS = eINSTANCE.getSubObjective_PercentageOfValidFacts();

		/**
		 * The meta object literal for the '<em><b>Nb Consecutive Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS = eINSTANCE.getSubObjective_NbConsecutiveSuccess();

		/**
		 * The meta object literal for the '<em><b>Responsemodality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_OBJECTIVE__RESPONSEMODALITY = eINSTANCE.getSubObjective_Responsemodality();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_OBJECTIVE__SETTINGS = eINSTANCE.getSubObjective_Settings();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.ResponseModalityImpl <em>Response Modality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ResponseModalityImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResponseModality()
		 * @generated
		 */
		EClass RESPONSE_MODALITY = eINSTANCE.getResponseModality();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_MODALITY__RESPONSE_TIME = eINSTANCE.getResponseModality_ResponseTime();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SimpleCompletionImpl <em>Simple Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SimpleCompletionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSimpleCompletion()
		 * @generated
		 */
		EClass SIMPLE_COMPLETION = eINSTANCE.getSimpleCompletion();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.GameProfileImpl <em>Game Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.GameProfileImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameProfile()
		 * @generated
		 */
		EClass GAME_PROFILE = eINSTANCE.getGameProfile();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.LearningProfileImpl <em>Learning Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LearningProfileImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningProfile()
		 * @generated
		 */
		EClass LEARNING_PROFILE = eINSTANCE.getLearningProfile();

		/**
		 * The meta object literal for the '<em><b>Learningpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PROFILE__LEARNINGPATH = eINSTANCE.getLearningProfile_Learningpath();

		/**
		 * The meta object literal for the '<em><b>Currentprogressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PROFILE__CURRENTPROGRESSIONS = eINSTANCE.getLearningProfile_Currentprogressions();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LearningObjectiveImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningObjective()
		 * @generated
		 */
		EClass LEARNING_OBJECTIVE = eINSTANCE.getLearningObjective();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__LEVELS = eINSTANCE.getLearningObjective_Levels();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__PREREQUISITES = eINSTANCE.getLearningObjective_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Setoffacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__SETOFFACTS = eINSTANCE.getLearningObjective_Setoffacts();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LevelImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Subobjectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__SUBOBJECTIVES = eINSTANCE.getLevel_Subobjectives();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__ID = eINSTANCE.getLevel_ID();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__SETTINGS = eINSTANCE.getLevel_Settings();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.KnowledgeImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getKnowledge()
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
		 * The meta object literal for the '{@link generatorMetamodels.impl.FactValidityVerificationImpl <em>Fact Validity Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.FactValidityVerificationImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getFactValidityVerification()
		 * @generated
		 */
		EClass FACT_VALIDITY_VERIFICATION = eINSTANCE.getFactValidityVerification();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.RoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.GameMode <em>Game Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.GameMode
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameMode()
		 * @generated
		 */
		EEnum GAME_MODE = eINSTANCE.getGameMode();

	}

} //GeneratorMetamodelsPackage
