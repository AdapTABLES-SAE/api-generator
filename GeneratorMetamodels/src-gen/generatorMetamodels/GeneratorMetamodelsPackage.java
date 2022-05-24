/**
 */
package generatorMetamodels;

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
	int RESPONSE_MODALITY = 20;

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
	int SUB_OBJECTIVE = 19;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION = 0;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS = 1;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS = 2;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__RESPONSEMODALITY = 3;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE__SETTINGS = 4;

	/**
	 * The number of structural features of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ResultValidityDeterminationImpl <em>Result Validity Determination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ResultValidityDeterminationImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultValidityDetermination()
	 * @generated
	 */
	int RESULT_VALIDITY_DETERMINATION = 1;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Validity Determination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Validity Determination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDITY_DETERMINATION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Problem Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

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
	int ROOM = 28;

	/**
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CONCRETEELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM__CONCRETEELEMENTS = ROOM__CONCRETEELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM__TYPE = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exit Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exit Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.QFTwoCompletionImpl <em>QF Two Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.QFTwoCompletionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFTwoCompletion()
	 * @generated
	 */
	int QF_TWO_COMPLETION = 5;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QF Two Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QF Two Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__NUMBER_OF_ROOMS = 3;

	/**
	 * The feature id for the '<em><b>Gamingobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON__GAMINGOBJECTIVE = 4;

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
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__CONCRETEELEMENTS = ROOM__CONCRETEELEMENTS;

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
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__KNOWLEDGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__NAME = 2;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.FactImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 13;

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
	int LEARNER_PLAYER = 14;

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
	int HIGH_LEVEL_ACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Number Of Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS = 1;

	/**
	 * The feature id for the '<em><b>Gamingobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Selected Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__SELECTED_MODE = 3;

	/**
	 * The feature id for the '<em><b>Room Types By Percentage</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE = 4;

	/**
	 * The number of structural features of the '<em>High Level Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Add Room Percentage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY___ADD_ROOM_PERCENTAGE__EMAP = 0;

	/**
	 * The number of operations of the '<em>High Level Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_ACTIVITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.EntryRoomImpl <em>Entry Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.EntryRoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getEntryRoom()
	 * @generated
	 */
	int ENTRY_ROOM = 16;

	/**
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ROOM__CONCRETEELEMENTS = ROOM__CONCRETEELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ROOM__TYPE = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

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
	int DOOR = 17;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.QFReconstructionImpl <em>QF Reconstruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.QFReconstructionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFReconstruction()
	 * @generated
	 */
	int QF_RECONSTRUCTION = 18;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QF Reconstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QF Reconstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.QFOneCompletionImpl <em>QF One Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.QFOneCompletionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFOneCompletion()
	 * @generated
	 */
	int QF_ONE_COMPLETION = 21;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QF One Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QF One Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.GameProfileImpl <em>Game Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.GameProfileImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameProfile()
	 * @generated
	 */
	int GAME_PROFILE = 22;

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
	int LEARNING_PROFILE = 23;

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
	int LEARNING_OBJECTIVE = 24;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Setoffacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__SETOFFACTS = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__PREREQUISITES = 4;

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
	int LEVEL = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Subobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SUBOBJECTIVES = 2;

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
	int KNOWLEDGE = 26;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.QFValidityDeterminationImpl <em>QF Validity Determination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.QFValidityDeterminationImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFValidityDetermination()
	 * @generated
	 */
	int QF_VALIDITY_DETERMINATION = 27;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__PERCENTAGE_OF_APPARITION = SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__PERCENTAGE_OF_VALID_FACTS = SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__NB_CONSECUTIVE_SUCCESS = SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__RESPONSEMODALITY = SUB_OBJECTIVE__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__SETTINGS = SUB_OBJECTIVE__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__NEW_ATTRIBUTE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QF Validity Determination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION_FEATURE_COUNT = SUB_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QF Validity Determination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION_OPERATION_COUNT = SUB_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.GamingObjectiveImpl <em>Gaming Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.GamingObjectiveImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGamingObjective()
	 * @generated
	 */
	int GAMING_OBJECTIVE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMING_OBJECTIVE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Gaming Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMING_OBJECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gaming Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMING_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.GameDomainImpl <em>Game Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.GameDomainImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameDomain()
	 * @generated
	 */
	int GAME_DOMAIN = 30;

	/**
	 * The feature id for the '<em><b>Gamingobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DOMAIN__GAMINGOBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Gameelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DOMAIN__GAMEELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Game Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.GameElementsImpl <em>Game Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.GameElementsImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameElements()
	 * @generated
	 */
	int GAME_ELEMENTS = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ELEMENTS__TYPE = 1;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.ConceptualElementImpl <em>Conceptual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ConceptualElementImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getConceptualElement()
	 * @generated
	 */
	int CONCEPTUAL_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__NAME = GAME_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__TYPE = GAME_ELEMENTS__TYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__REPRESENTATIONS = GAME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adaptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__ADAPTABLE = GAME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT_FEATURE_COUNT = GAME_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conceptual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT_OPERATION_COUNT = GAME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.ConcreteElementImpl <em>Concrete Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.ConcreteElementImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getConcreteElement()
	 * @generated
	 */
	int CONCRETE_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__NAME = GAME_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__TYPE = GAME_ELEMENTS__TYPE;

	/**
	 * The feature id for the '<em><b>Img Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT__IMG_PATH = GAME_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT_FEATURE_COUNT = GAME_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ELEMENT_OPERATION_COUNT = GAME_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.RoomTypeToEIntMapImpl <em>Room Type To EInt Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.RoomTypeToEIntMapImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoomTypeToEIntMap()
	 * @generated
	 */
	int ROOM_TYPE_TO_EINT_MAP = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_TO_EINT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_TO_EINT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Room Type To EInt Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_TO_EINT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Type To EInt Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_TO_EINT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.LearningPathsImpl <em>Learning Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.LearningPathsImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningPaths()
	 * @generated
	 */
	int LEARNING_PATHS = 35;

	/**
	 * The feature id for the '<em><b>Learningpaths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATHS__LEARNINGPATHS = 0;

	/**
	 * The number of structural features of the '<em>Learning Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATHS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Learning Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.Doors3RoomImpl <em>Doors3 Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.Doors3RoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDoors3Room()
	 * @generated
	 */
	int DOORS3_ROOM = 36;

	/**
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOORS3_ROOM__CONCRETEELEMENTS = QUESTION_ROOM__CONCRETEELEMENTS;

	/**
	 * The number of structural features of the '<em>Doors3 Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOORS3_ROOM_FEATURE_COUNT = QUESTION_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Doors3 Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOORS3_ROOM_OPERATION_COUNT = QUESTION_ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.Chests3RoomImpl <em>Chests3 Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.Chests3RoomImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getChests3Room()
	 * @generated
	 */
	int CHESTS3_ROOM = 37;

	/**
	 * The feature id for the '<em><b>Concreteelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESTS3_ROOM__CONCRETEELEMENTS = QUESTION_ROOM__CONCRETEELEMENTS;

	/**
	 * The number of structural features of the '<em>Chests3 Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESTS3_ROOM_FEATURE_COUNT = QUESTION_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chests3 Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHESTS3_ROOM_OPERATION_COUNT = QUESTION_ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.AdaptedLearningGameActivityImpl <em>Adapted Learning Game Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.AdaptedLearningGameActivityImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getAdaptedLearningGameActivity()
	 * @generated
	 */
	int ADAPTED_LEARNING_GAME_ACTIVITY = 38;

	/**
	 * The feature id for the '<em><b>Dungeon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON = 0;

	/**
	 * The number of structural features of the '<em>Adapted Learning Game Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_LEARNING_GAME_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Adapted Learning Game Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_LEARNING_GAME_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.MTQFOneCompletionImpl <em>MTQF One Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.MTQFOneCompletionImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMTQFOneCompletion()
	 * @generated
	 */
	int MTQF_ONE_COMPLETION = 39;

	/**
	 * The feature id for the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__PERCENTAGE_OF_APPARITION = QF_ONE_COMPLETION__PERCENTAGE_OF_APPARITION;

	/**
	 * The feature id for the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__PERCENTAGE_OF_VALID_FACTS = QF_ONE_COMPLETION__PERCENTAGE_OF_VALID_FACTS;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__NB_CONSECUTIVE_SUCCESS = QF_ONE_COMPLETION__NB_CONSECUTIVE_SUCCESS;

	/**
	 * The feature id for the '<em><b>Responsemodality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__RESPONSEMODALITY = QF_ONE_COMPLETION__RESPONSEMODALITY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__SETTINGS = QF_ONE_COMPLETION__SETTINGS;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__NEW_ATTRIBUTE = QF_ONE_COMPLETION__NEW_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION__TARGETS = QF_ONE_COMPLETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MTQF One Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION_FEATURE_COUNT = QF_ONE_COMPLETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MTQF One Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTQF_ONE_COMPLETION_OPERATION_COUNT = QF_ONE_COMPLETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.MTLevelImpl <em>MT Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.MTLevelImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMTLevel()
	 * @generated
	 */
	int MT_LEVEL = 40;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__ID = LEVEL__ID;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__SETTINGS = LEVEL__SETTINGS;

	/**
	 * The feature id for the '<em><b>Subobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__SUBOBJECTIVES = LEVEL__SUBOBJECTIVES;

	/**
	 * The feature id for the '<em><b>Build Table Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LEVEL__BUILD_TABLE_SETUP = LEVEL_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generatorMetamodels.impl.DimensionsEntanglementImpl <em>Dimensions Entanglement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.DimensionsEntanglementImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDimensionsEntanglement()
	 * @generated
	 */
	int DIMENSIONS_ENTANGLEMENT = 41;

	/**
	 * The feature id for the '<em><b>Semanticrelations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Dimensions Entanglement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_ENTANGLEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dimensions Entanglement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_ENTANGLEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.SemanticRelationImpl <em>Semantic Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.SemanticRelationImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSemanticRelation()
	 * @generated
	 */
	int SEMANTIC_RELATION = 42;

	/**
	 * The number of structural features of the '<em>Semantic Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Semantic Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.Room2SubObjectiveComplianceImpl <em>Room2 Sub Objective Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.Room2SubObjectiveComplianceImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoom2SubObjectiveCompliance()
	 * @generated
	 */
	int ROOM2_SUB_OBJECTIVE_COMPLIANCE = 43;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE = SEMANTIC_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Obj Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE = SEMANTIC_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room2 Sub Objective Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM2_SUB_OBJECTIVE_COMPLIANCE_FEATURE_COUNT = SEMANTIC_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Room2 Sub Objective Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM2_SUB_OBJECTIVE_COMPLIANCE_OPERATION_COUNT = SEMANTIC_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generatorMetamodels.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.impl.PrerequisiteImpl
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 44;

	/**
	 * The feature id for the '<em><b>Success Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__SUCCESS_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__PREREQUISITE = 1;

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
	 * The meta object id for the '{@link generatorMetamodels.GameMode <em>Game Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.GameMode
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameMode()
	 * @generated
	 */
	int GAME_MODE = 45;

	/**
	 * The meta object id for the '{@link generatorMetamodels.RoomType <em>Room Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.RoomType
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 46;

	/**
	 * The meta object id for the '{@link generatorMetamodels.GameElementType <em>Game Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.GameElementType
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameElementType()
	 * @generated
	 */
	int GAME_ELEMENT_TYPE = 47;

	/**
	 * The meta object id for the '{@link generatorMetamodels.TableBuild <em>Table Build</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.TableBuild
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getTableBuild()
	 * @generated
	 */
	int TABLE_BUILD = 48;

	/**
	 * The meta object id for the '{@link generatorMetamodels.ResultPosition <em>Result Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.ResultPosition
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultPosition()
	 * @generated
	 */
	int RESULT_POSITION = 49;

	/**
	 * The meta object id for the '{@link generatorMetamodels.TargetElement <em>Target Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.TargetElement
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 50;

	/**
	 * The meta object id for the '{@link generatorMetamodels.SubObjectiveType <em>Sub Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generatorMetamodels.SubObjectiveType
	 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSubObjectiveType()
	 * @generated
	 */
	int SUB_OBJECTIVE_TYPE = 51;

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
	 * Returns the meta object for class '{@link generatorMetamodels.ResultValidityDetermination <em>Result Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Validity Determination</em>'.
	 * @see generatorMetamodels.ResultValidityDetermination
	 * @generated
	 */
	EClass getResultValidityDetermination();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ResultValidityDetermination#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.ResultValidityDetermination#getNewAttribute()
	 * @see #getResultValidityDetermination()
	 * @generated
	 */
	EAttribute getResultValidityDetermination_NewAttribute();

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
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ProblemResolution#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.ProblemResolution#getNewAttribute()
	 * @see #getProblemResolution()
	 * @generated
	 */
	EAttribute getProblemResolution_NewAttribute();

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
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ExitRoom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generatorMetamodels.ExitRoom#getType()
	 * @see #getExitRoom()
	 * @generated
	 */
	EAttribute getExitRoom_Type();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.QFTwoCompletion <em>QF Two Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Two Completion</em>'.
	 * @see generatorMetamodels.QFTwoCompletion
	 * @generated
	 */
	EClass getQFTwoCompletion();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.QFTwoCompletion#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.QFTwoCompletion#getNewAttribute()
	 * @see #getQFTwoCompletion()
	 * @generated
	 */
	EAttribute getQFTwoCompletion_NewAttribute();

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
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Dungeon#getNumberOfRooms <em>Number Of Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rooms</em>'.
	 * @see generatorMetamodels.Dungeon#getNumberOfRooms()
	 * @see #getDungeon()
	 * @generated
	 */
	EAttribute getDungeon_NumberOfRooms();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.Dungeon#getGamingobjective <em>Gamingobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gamingobjective</em>'.
	 * @see generatorMetamodels.Dungeon#getGamingobjective()
	 * @see #getDungeon()
	 * @generated
	 */
	EReference getDungeon_Gamingobjective();

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
	 * Returns the meta object for the attribute '{@link generatorMetamodels.HighLevelActivity#getNumberOfQuestions <em>Number Of Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Questions</em>'.
	 * @see generatorMetamodels.HighLevelActivity#getNumberOfQuestions()
	 * @see #getHighLevelActivity()
	 * @generated
	 */
	EAttribute getHighLevelActivity_NumberOfQuestions();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.HighLevelActivity#getGamingobjective <em>Gamingobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gamingobjective</em>'.
	 * @see generatorMetamodels.HighLevelActivity#getGamingobjective()
	 * @see #getHighLevelActivity()
	 * @generated
	 */
	EReference getHighLevelActivity_Gamingobjective();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.HighLevelActivity#getSelectedMode <em>Selected Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Mode</em>'.
	 * @see generatorMetamodels.HighLevelActivity#getSelectedMode()
	 * @see #getHighLevelActivity()
	 * @generated
	 */
	EAttribute getHighLevelActivity_SelectedMode();

	/**
	 * Returns the meta object for the map '{@link generatorMetamodels.HighLevelActivity#getRoomTypesByPercentage <em>Room Types By Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Room Types By Percentage</em>'.
	 * @see generatorMetamodels.HighLevelActivity#getRoomTypesByPercentage()
	 * @see #getHighLevelActivity()
	 * @generated
	 */
	EReference getHighLevelActivity_RoomTypesByPercentage();

	/**
	 * Returns the meta object for the '{@link generatorMetamodels.HighLevelActivity#addRoomPercentage(org.eclipse.emf.common.util.EMap) <em>Add Room Percentage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Percentage</em>' operation.
	 * @see generatorMetamodels.HighLevelActivity#addRoomPercentage(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getHighLevelActivity__AddRoomPercentage__EMap();

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
	 * Returns the meta object for the attribute '{@link generatorMetamodels.EntryRoom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generatorMetamodels.EntryRoom#getType()
	 * @see #getEntryRoom()
	 * @generated
	 */
	EAttribute getEntryRoom_Type();

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
	 * Returns the meta object for class '{@link generatorMetamodels.QFReconstruction <em>QF Reconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Reconstruction</em>'.
	 * @see generatorMetamodels.QFReconstruction
	 * @generated
	 */
	EClass getQFReconstruction();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.QFReconstruction#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.QFReconstruction#getNewAttribute()
	 * @see #getQFReconstruction()
	 * @generated
	 */
	EAttribute getQFReconstruction_NewAttribute();

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
	 * Returns the meta object for class '{@link generatorMetamodels.QFOneCompletion <em>QF One Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF One Completion</em>'.
	 * @see generatorMetamodels.QFOneCompletion
	 * @generated
	 */
	EClass getQFOneCompletion();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.QFOneCompletion#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.QFOneCompletion#getNewAttribute()
	 * @see #getQFOneCompletion()
	 * @generated
	 */
	EAttribute getQFOneCompletion_NewAttribute();

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
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningObjective#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see generatorMetamodels.LearningObjective#getPrerequisites()
	 * @see #getLearningObjective()
	 * @generated
	 */
	EReference getLearningObjective_Prerequisites();

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
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.Level#getSubobjectives <em>Subobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subobjectives</em>'.
	 * @see generatorMetamodels.Level#getSubobjectives()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Subobjectives();

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
	 * Returns the meta object for class '{@link generatorMetamodels.QFValidityDetermination <em>QF Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Validity Determination</em>'.
	 * @see generatorMetamodels.QFValidityDetermination
	 * @generated
	 */
	EClass getQFValidityDetermination();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.QFValidityDetermination#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generatorMetamodels.QFValidityDetermination#getNewAttribute()
	 * @see #getQFValidityDetermination()
	 * @generated
	 */
	EAttribute getQFValidityDetermination_NewAttribute();

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
	 * Returns the meta object for the reference list '{@link generatorMetamodels.Room#getConcreteelements <em>Concreteelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concreteelements</em>'.
	 * @see generatorMetamodels.Room#getConcreteelements()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Concreteelements();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.GamingObjective <em>Gaming Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaming Objective</em>'.
	 * @see generatorMetamodels.GamingObjective
	 * @generated
	 */
	EClass getGamingObjective();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.GamingObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.GamingObjective#getName()
	 * @see #getGamingObjective()
	 * @generated
	 */
	EAttribute getGamingObjective_Name();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.GameDomain <em>Game Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Domain</em>'.
	 * @see generatorMetamodels.GameDomain
	 * @generated
	 */
	EClass getGameDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.GameDomain#getGamingobjectives <em>Gamingobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamingobjectives</em>'.
	 * @see generatorMetamodels.GameDomain#getGamingobjectives()
	 * @see #getGameDomain()
	 * @generated
	 */
	EReference getGameDomain_Gamingobjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.GameDomain#getGameelements <em>Gameelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameelements</em>'.
	 * @see generatorMetamodels.GameDomain#getGameelements()
	 * @see #getGameDomain()
	 * @generated
	 */
	EReference getGameDomain_Gameelements();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.GameElements <em>Game Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Elements</em>'.
	 * @see generatorMetamodels.GameElements
	 * @generated
	 */
	EClass getGameElements();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.GameElements#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see generatorMetamodels.GameElements#getName()
	 * @see #getGameElements()
	 * @generated
	 */
	EAttribute getGameElements_Name();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.GameElements#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generatorMetamodels.GameElements#getType()
	 * @see #getGameElements()
	 * @generated
	 */
	EAttribute getGameElements_Type();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ConceptualElement <em>Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Element</em>'.
	 * @see generatorMetamodels.ConceptualElement
	 * @generated
	 */
	EClass getConceptualElement();

	/**
	 * Returns the meta object for the reference list '{@link generatorMetamodels.ConceptualElement#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representations</em>'.
	 * @see generatorMetamodels.ConceptualElement#getRepresentations()
	 * @see #getConceptualElement()
	 * @generated
	 */
	EReference getConceptualElement_Representations();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ConceptualElement#isAdaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adaptable</em>'.
	 * @see generatorMetamodels.ConceptualElement#isAdaptable()
	 * @see #getConceptualElement()
	 * @generated
	 */
	EAttribute getConceptualElement_Adaptable();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.ConcreteElement <em>Concrete Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Element</em>'.
	 * @see generatorMetamodels.ConcreteElement
	 * @generated
	 */
	EClass getConcreteElement();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.ConcreteElement#getImgPath <em>Img Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Img Path</em>'.
	 * @see generatorMetamodels.ConcreteElement#getImgPath()
	 * @see #getConcreteElement()
	 * @generated
	 */
	EAttribute getConcreteElement_ImgPath();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Room Type To EInt Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type To EInt Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDefault="ENTRY" keyDataType="generatorMetamodels.RoomType"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getRoomTypeToEIntMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRoomTypeToEIntMap()
	 * @generated
	 */
	EAttribute getRoomTypeToEIntMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRoomTypeToEIntMap()
	 * @generated
	 */
	EAttribute getRoomTypeToEIntMap_Value();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.LearningPaths <em>Learning Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Paths</em>'.
	 * @see generatorMetamodels.LearningPaths
	 * @generated
	 */
	EClass getLearningPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.LearningPaths#getLearningpaths <em>Learningpaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningpaths</em>'.
	 * @see generatorMetamodels.LearningPaths#getLearningpaths()
	 * @see #getLearningPaths()
	 * @generated
	 */
	EReference getLearningPaths_Learningpaths();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Doors3Room <em>Doors3 Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doors3 Room</em>'.
	 * @see generatorMetamodels.Doors3Room
	 * @generated
	 */
	EClass getDoors3Room();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Chests3Room <em>Chests3 Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chests3 Room</em>'.
	 * @see generatorMetamodels.Chests3Room
	 * @generated
	 */
	EClass getChests3Room();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.AdaptedLearningGameActivity <em>Adapted Learning Game Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapted Learning Game Activity</em>'.
	 * @see generatorMetamodels.AdaptedLearningGameActivity
	 * @generated
	 */
	EClass getAdaptedLearningGameActivity();

	/**
	 * Returns the meta object for the containment reference '{@link generatorMetamodels.AdaptedLearningGameActivity#getDungeon <em>Dungeon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dungeon</em>'.
	 * @see generatorMetamodels.AdaptedLearningGameActivity#getDungeon()
	 * @see #getAdaptedLearningGameActivity()
	 * @generated
	 */
	EReference getAdaptedLearningGameActivity_Dungeon();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.MTQFOneCompletion <em>MTQF One Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTQF One Completion</em>'.
	 * @see generatorMetamodels.MTQFOneCompletion
	 * @generated
	 */
	EClass getMTQFOneCompletion();

	/**
	 * Returns the meta object for the attribute list '{@link generatorMetamodels.MTQFOneCompletion#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see generatorMetamodels.MTQFOneCompletion#getTargets()
	 * @see #getMTQFOneCompletion()
	 * @generated
	 */
	EAttribute getMTQFOneCompletion_Targets();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.MTLevel <em>MT Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Level</em>'.
	 * @see generatorMetamodels.MTLevel
	 * @generated
	 */
	EClass getMTLevel();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.MTLevel#getBuildTableSetup <em>Build Table Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Table Setup</em>'.
	 * @see generatorMetamodels.MTLevel#getBuildTableSetup()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_BuildTableSetup();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Position Setup</em>'.
	 * @see generatorMetamodels.MTLevel#getResultPositionSetup()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_ResultPositionSetup();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.MTLevel#getMinInterval <em>Min Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interval</em>'.
	 * @see generatorMetamodels.MTLevel#getMinInterval()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_MinInterval();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.MTLevel#getMaxInterval <em>Max Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interval</em>'.
	 * @see generatorMetamodels.MTLevel#getMaxInterval()
	 * @see #getMTLevel()
	 * @generated
	 */
	EAttribute getMTLevel_MaxInterval();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.DimensionsEntanglement <em>Dimensions Entanglement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensions Entanglement</em>'.
	 * @see generatorMetamodels.DimensionsEntanglement
	 * @generated
	 */
	EClass getDimensionsEntanglement();

	/**
	 * Returns the meta object for the containment reference list '{@link generatorMetamodels.DimensionsEntanglement#getSemanticrelations <em>Semanticrelations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticrelations</em>'.
	 * @see generatorMetamodels.DimensionsEntanglement#getSemanticrelations()
	 * @see #getDimensionsEntanglement()
	 * @generated
	 */
	EReference getDimensionsEntanglement_Semanticrelations();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.SemanticRelation <em>Semantic Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Relation</em>'.
	 * @see generatorMetamodels.SemanticRelation
	 * @generated
	 */
	EClass getSemanticRelation();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Room2SubObjectiveCompliance <em>Room2 Sub Objective Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room2 Sub Objective Compliance</em>'.
	 * @see generatorMetamodels.Room2SubObjectiveCompliance
	 * @generated
	 */
	EClass getRoom2SubObjectiveCompliance();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Room2SubObjectiveCompliance#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see generatorMetamodels.Room2SubObjectiveCompliance#getRoomType()
	 * @see #getRoom2SubObjectiveCompliance()
	 * @generated
	 */
	EAttribute getRoom2SubObjectiveCompliance_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Room2SubObjectiveCompliance#getSubObjType <em>Sub Obj Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Obj Type</em>'.
	 * @see generatorMetamodels.Room2SubObjectiveCompliance#getSubObjType()
	 * @see #getRoom2SubObjectiveCompliance()
	 * @generated
	 */
	EAttribute getRoom2SubObjectiveCompliance_SubObjType();

	/**
	 * Returns the meta object for class '{@link generatorMetamodels.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite</em>'.
	 * @see generatorMetamodels.Prerequisite
	 * @generated
	 */
	EClass getPrerequisite();

	/**
	 * Returns the meta object for the attribute '{@link generatorMetamodels.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percentage</em>'.
	 * @see generatorMetamodels.Prerequisite#getSuccessPercentage()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_SuccessPercentage();

	/**
	 * Returns the meta object for the reference '{@link generatorMetamodels.Prerequisite#getPrerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prerequisite</em>'.
	 * @see generatorMetamodels.Prerequisite#getPrerequisite()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_Prerequisite();

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
	 * Returns the meta object for enum '{@link generatorMetamodels.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Type</em>'.
	 * @see generatorMetamodels.RoomType
	 * @generated
	 */
	EEnum getRoomType();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.GameElementType <em>Game Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Element Type</em>'.
	 * @see generatorMetamodels.GameElementType
	 * @generated
	 */
	EEnum getGameElementType();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.TableBuild <em>Table Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Build</em>'.
	 * @see generatorMetamodels.TableBuild
	 * @generated
	 */
	EEnum getTableBuild();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.ResultPosition <em>Result Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Position</em>'.
	 * @see generatorMetamodels.ResultPosition
	 * @generated
	 */
	EEnum getResultPosition();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Element</em>'.
	 * @see generatorMetamodels.TargetElement
	 * @generated
	 */
	EEnum getTargetElement();

	/**
	 * Returns the meta object for enum '{@link generatorMetamodels.SubObjectiveType <em>Sub Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Objective Type</em>'.
	 * @see generatorMetamodels.SubObjectiveType
	 * @generated
	 */
	EEnum getSubObjectiveType();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.ResultValidityDeterminationImpl <em>Result Validity Determination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ResultValidityDeterminationImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultValidityDetermination()
		 * @generated
		 */
		EClass RESULT_VALIDITY_DETERMINATION = eINSTANCE.getResultValidityDetermination();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE = eINSTANCE
				.getResultValidityDetermination_NewAttribute();

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
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_RESOLUTION__NEW_ATTRIBUTE = eINSTANCE.getProblemResolution_NewAttribute();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT_ROOM__TYPE = eINSTANCE.getExitRoom_Type();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.QFTwoCompletionImpl <em>QF Two Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.QFTwoCompletionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFTwoCompletion()
		 * @generated
		 */
		EClass QF_TWO_COMPLETION = eINSTANCE.getQFTwoCompletion();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_TWO_COMPLETION__NEW_ATTRIBUTE = eINSTANCE.getQFTwoCompletion_NewAttribute();

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
		 * The meta object literal for the '<em><b>Number Of Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNGEON__NUMBER_OF_ROOMS = eINSTANCE.getDungeon_NumberOfRooms();

		/**
		 * The meta object literal for the '<em><b>Gamingobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON__GAMINGOBJECTIVE = eINSTANCE.getDungeon_Gamingobjective();

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
		 * The meta object literal for the '<em><b>Number Of Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS = eINSTANCE.getHighLevelActivity_NumberOfQuestions();

		/**
		 * The meta object literal for the '<em><b>Gamingobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE = eINSTANCE.getHighLevelActivity_Gamingobjective();

		/**
		 * The meta object literal for the '<em><b>Selected Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_ACTIVITY__SELECTED_MODE = eINSTANCE.getHighLevelActivity_SelectedMode();

		/**
		 * The meta object literal for the '<em><b>Room Types By Percentage</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE = eINSTANCE
				.getHighLevelActivity_RoomTypesByPercentage();

		/**
		 * The meta object literal for the '<em><b>Add Room Percentage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_ACTIVITY___ADD_ROOM_PERCENTAGE__EMAP = eINSTANCE
				.getHighLevelActivity__AddRoomPercentage__EMap();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_ROOM__TYPE = eINSTANCE.getEntryRoom_Type();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.QFReconstructionImpl <em>QF Reconstruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.QFReconstructionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFReconstruction()
		 * @generated
		 */
		EClass QF_RECONSTRUCTION = eINSTANCE.getQFReconstruction();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_RECONSTRUCTION__NEW_ATTRIBUTE = eINSTANCE.getQFReconstruction_NewAttribute();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.QFOneCompletionImpl <em>QF One Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.QFOneCompletionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFOneCompletion()
		 * @generated
		 */
		EClass QF_ONE_COMPLETION = eINSTANCE.getQFOneCompletion();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_ONE_COMPLETION__NEW_ATTRIBUTE = eINSTANCE.getQFOneCompletion_NewAttribute();

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
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__PREREQUISITES = eINSTANCE.getLearningObjective_Prerequisites();

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
		 * The meta object literal for the '<em><b>Subobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__SUBOBJECTIVES = eINSTANCE.getLevel_Subobjectives();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.QFValidityDeterminationImpl <em>QF Validity Determination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.QFValidityDeterminationImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getQFValidityDetermination()
		 * @generated
		 */
		EClass QF_VALIDITY_DETERMINATION = eINSTANCE.getQFValidityDetermination();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_VALIDITY_DETERMINATION__NEW_ATTRIBUTE = eINSTANCE.getQFValidityDetermination_NewAttribute();

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
		 * The meta object literal for the '<em><b>Concreteelements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__CONCRETEELEMENTS = eINSTANCE.getRoom_Concreteelements();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.GamingObjectiveImpl <em>Gaming Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.GamingObjectiveImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGamingObjective()
		 * @generated
		 */
		EClass GAMING_OBJECTIVE = eINSTANCE.getGamingObjective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMING_OBJECTIVE__NAME = eINSTANCE.getGamingObjective_Name();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.GameDomainImpl <em>Game Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.GameDomainImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameDomain()
		 * @generated
		 */
		EClass GAME_DOMAIN = eINSTANCE.getGameDomain();

		/**
		 * The meta object literal for the '<em><b>Gamingobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DOMAIN__GAMINGOBJECTIVES = eINSTANCE.getGameDomain_Gamingobjectives();

		/**
		 * The meta object literal for the '<em><b>Gameelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DOMAIN__GAMEELEMENTS = eINSTANCE.getGameDomain_Gameelements();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.GameElementsImpl <em>Game Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.GameElementsImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameElements()
		 * @generated
		 */
		EClass GAME_ELEMENTS = eINSTANCE.getGameElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_ELEMENTS__NAME = eINSTANCE.getGameElements_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_ELEMENTS__TYPE = eINSTANCE.getGameElements_Type();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.ConceptualElementImpl <em>Conceptual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ConceptualElementImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getConceptualElement()
		 * @generated
		 */
		EClass CONCEPTUAL_ELEMENT = eINSTANCE.getConceptualElement();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_ELEMENT__REPRESENTATIONS = eINSTANCE.getConceptualElement_Representations();

		/**
		 * The meta object literal for the '<em><b>Adaptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_ELEMENT__ADAPTABLE = eINSTANCE.getConceptualElement_Adaptable();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.ConcreteElementImpl <em>Concrete Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.ConcreteElementImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getConcreteElement()
		 * @generated
		 */
		EClass CONCRETE_ELEMENT = eINSTANCE.getConcreteElement();

		/**
		 * The meta object literal for the '<em><b>Img Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ELEMENT__IMG_PATH = eINSTANCE.getConcreteElement_ImgPath();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.RoomTypeToEIntMapImpl <em>Room Type To EInt Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.RoomTypeToEIntMapImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoomTypeToEIntMap()
		 * @generated
		 */
		EClass ROOM_TYPE_TO_EINT_MAP = eINSTANCE.getRoomTypeToEIntMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE_TO_EINT_MAP__KEY = eINSTANCE.getRoomTypeToEIntMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE_TO_EINT_MAP__VALUE = eINSTANCE.getRoomTypeToEIntMap_Value();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.LearningPathsImpl <em>Learning Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.LearningPathsImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getLearningPaths()
		 * @generated
		 */
		EClass LEARNING_PATHS = eINSTANCE.getLearningPaths();

		/**
		 * The meta object literal for the '<em><b>Learningpaths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATHS__LEARNINGPATHS = eINSTANCE.getLearningPaths_Learningpaths();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.Doors3RoomImpl <em>Doors3 Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.Doors3RoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDoors3Room()
		 * @generated
		 */
		EClass DOORS3_ROOM = eINSTANCE.getDoors3Room();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.Chests3RoomImpl <em>Chests3 Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.Chests3RoomImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getChests3Room()
		 * @generated
		 */
		EClass CHESTS3_ROOM = eINSTANCE.getChests3Room();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.AdaptedLearningGameActivityImpl <em>Adapted Learning Game Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.AdaptedLearningGameActivityImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getAdaptedLearningGameActivity()
		 * @generated
		 */
		EClass ADAPTED_LEARNING_GAME_ACTIVITY = eINSTANCE.getAdaptedLearningGameActivity();

		/**
		 * The meta object literal for the '<em><b>Dungeon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON = eINSTANCE.getAdaptedLearningGameActivity_Dungeon();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.MTQFOneCompletionImpl <em>MTQF One Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.MTQFOneCompletionImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMTQFOneCompletion()
		 * @generated
		 */
		EClass MTQF_ONE_COMPLETION = eINSTANCE.getMTQFOneCompletion();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTQF_ONE_COMPLETION__TARGETS = eINSTANCE.getMTQFOneCompletion_Targets();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.MTLevelImpl <em>MT Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.MTLevelImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getMTLevel()
		 * @generated
		 */
		EClass MT_LEVEL = eINSTANCE.getMTLevel();

		/**
		 * The meta object literal for the '<em><b>Build Table Setup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_LEVEL__BUILD_TABLE_SETUP = eINSTANCE.getMTLevel_BuildTableSetup();

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
		 * The meta object literal for the '{@link generatorMetamodels.impl.DimensionsEntanglementImpl <em>Dimensions Entanglement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.DimensionsEntanglementImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getDimensionsEntanglement()
		 * @generated
		 */
		EClass DIMENSIONS_ENTANGLEMENT = eINSTANCE.getDimensionsEntanglement();

		/**
		 * The meta object literal for the '<em><b>Semanticrelations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS = eINSTANCE.getDimensionsEntanglement_Semanticrelations();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.SemanticRelationImpl <em>Semantic Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.SemanticRelationImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSemanticRelation()
		 * @generated
		 */
		EClass SEMANTIC_RELATION = eINSTANCE.getSemanticRelation();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.Room2SubObjectiveComplianceImpl <em>Room2 Sub Objective Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.Room2SubObjectiveComplianceImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoom2SubObjectiveCompliance()
		 * @generated
		 */
		EClass ROOM2_SUB_OBJECTIVE_COMPLIANCE = eINSTANCE.getRoom2SubObjectiveCompliance();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE = eINSTANCE.getRoom2SubObjectiveCompliance_RoomType();

		/**
		 * The meta object literal for the '<em><b>Sub Obj Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE = eINSTANCE.getRoom2SubObjectiveCompliance_SubObjType();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.impl.PrerequisiteImpl
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getPrerequisite()
		 * @generated
		 */
		EClass PREREQUISITE = eINSTANCE.getPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Success Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__SUCCESS_PERCENTAGE = eINSTANCE.getPrerequisite_SuccessPercentage();

		/**
		 * The meta object literal for the '<em><b>Prerequisite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__PREREQUISITE = eINSTANCE.getPrerequisite_Prerequisite();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.GameMode <em>Game Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.GameMode
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameMode()
		 * @generated
		 */
		EEnum GAME_MODE = eINSTANCE.getGameMode();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.RoomType <em>Room Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.RoomType
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getRoomType()
		 * @generated
		 */
		EEnum ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.GameElementType <em>Game Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.GameElementType
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getGameElementType()
		 * @generated
		 */
		EEnum GAME_ELEMENT_TYPE = eINSTANCE.getGameElementType();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.TableBuild <em>Table Build</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.TableBuild
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getTableBuild()
		 * @generated
		 */
		EEnum TABLE_BUILD = eINSTANCE.getTableBuild();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.ResultPosition <em>Result Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.ResultPosition
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getResultPosition()
		 * @generated
		 */
		EEnum RESULT_POSITION = eINSTANCE.getResultPosition();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.TargetElement <em>Target Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.TargetElement
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getTargetElement()
		 * @generated
		 */
		EEnum TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '{@link generatorMetamodels.SubObjectiveType <em>Sub Objective Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generatorMetamodels.SubObjectiveType
		 * @see generatorMetamodels.impl.GeneratorMetamodelsPackageImpl#getSubObjectiveType()
		 * @generated
		 */
		EEnum SUB_OBJECTIVE_TYPE = eINSTANCE.getSubObjectiveType();

	}

} //GeneratorMetamodelsPackage
