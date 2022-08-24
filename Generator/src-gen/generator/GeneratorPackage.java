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
	 * The meta object id for the '{@link generator.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PrerequisiteImpl
	 * @see generator.impl.GeneratorPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 0;

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
	 * The meta object id for the '{@link generator.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LevelImpl
	 * @see generator.impl.GeneratorPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Subobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SUBOBJECTIVES = 1;

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
	 * The meta object id for the '{@link generator.impl.SubObjectiveImpl <em>Sub Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.SubObjectiveImpl
	 * @see generator.impl.GeneratorPackageImpl#getSubObjective()
	 * @generated
	 */
	int SUB_OBJECTIVE = 7;

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
	 * The number of structural features of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sub Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.QFValidityDeterminationImpl <em>QF Validity Determination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QFValidityDeterminationImpl
	 * @see generator.impl.GeneratorPackageImpl#getQFValidityDetermination()
	 * @generated
	 */
	int QF_VALIDITY_DETERMINATION = 2;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_VALIDITY_DETERMINATION__TYPE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generator.impl.LearningPathsImpl <em>Learning Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningPathsImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningPaths()
	 * @generated
	 */
	int LEARNING_PATHS = 3;

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
	 * The meta object id for the '{@link generator.impl.ResultValidityDeterminationImpl <em>Result Validity Determination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ResultValidityDeterminationImpl
	 * @see generator.impl.GeneratorPackageImpl#getResultValidityDetermination()
	 * @generated
	 */
	int RESULT_VALIDITY_DETERMINATION = 4;

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
	 * The meta object id for the '{@link generator.impl.QFOneCompletionImpl <em>QF One Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QFOneCompletionImpl
	 * @see generator.impl.GeneratorPackageImpl#getQFOneCompletion()
	 * @generated
	 */
	int QF_ONE_COMPLETION = 5;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_ONE_COMPLETION__TYPE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generator.impl.QFReconstructionImpl <em>QF Reconstruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QFReconstructionImpl
	 * @see generator.impl.GeneratorPackageImpl#getQFReconstruction()
	 * @generated
	 */
	int QF_RECONSTRUCTION = 6;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_RECONSTRUCTION__TYPE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generator.impl.QFTwoCompletionImpl <em>QF Two Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QFTwoCompletionImpl
	 * @see generator.impl.GeneratorPackageImpl#getQFTwoCompletion()
	 * @generated
	 */
	int QF_TWO_COMPLETION = 8;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QF_TWO_COMPLETION__TYPE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generator.impl.ProblemResolutionImpl <em>Problem Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ProblemResolutionImpl
	 * @see generator.impl.GeneratorPackageImpl#getProblemResolution()
	 * @generated
	 */
	int PROBLEM_RESOLUTION = 9;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_RESOLUTION__TYPE = SUB_OBJECTIVE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link generator.impl.AbstractFactImpl <em>Abstract Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.AbstractFactImpl
	 * @see generator.impl.GeneratorPackageImpl#getAbstractFact()
	 * @generated
	 */
	int ABSTRACT_FACT = 10;

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
	int SET_OF_FACTS = 11;

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
	int FACT = 12;

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
	int KNOWLEDGE = 13;

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
	 * The meta object id for the '{@link generator.impl.LearningPathImpl <em>Learning Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LearningPathImpl
	 * @see generator.impl.GeneratorPackageImpl#getLearningPath()
	 * @generated
	 */
	int LEARNING_PATH = 14;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__KNOWLEDGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Learningobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_PATH__LEARNINGOBJECTIVES = 2;

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
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__PREREQUISITES = 1;

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
	 * The number of structural features of the '<em>Learning Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Learning Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameContentImpl <em>Game Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameContentImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameContent()
	 * @generated
	 */
	int GAME_CONTENT = 16;

	/**
	 * The feature id for the '<em><b>Gameplays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT__GAMEPLAYS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Gameobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT__GAMEOBJECTIVES = 2;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT__ROOMTYPE = 3;

	/**
	 * The number of structural features of the '<em>Game Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Game Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameplayImpl <em>Gameplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameplayImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameplay()
	 * @generated
	 */
	int GAMEPLAY = 17;

	/**
	 * The feature id for the '<em><b>Coregamerules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__COREGAMERULES = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMEPLAY__DESCRIPTION = 1;

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
	 * The meta object id for the '{@link generator.impl.CoreGameRuleImpl <em>Core Game Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.CoreGameRuleImpl
	 * @see generator.impl.GeneratorPackageImpl#getCoreGameRule()
	 * @generated
	 */
	int CORE_GAME_RULE = 18;

	/**
	 * The feature id for the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GAME_RULE__RULE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Action To Do</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GAME_RULE__ACTION_TO_DO = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GAME_RULE__ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Core Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GAME_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Core Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_GAME_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.IRoomElement <em>IRoom Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.IRoomElement
	 * @see generator.impl.GeneratorPackageImpl#getIRoomElement()
	 * @generated
	 */
	int IROOM_ELEMENT = 31;

	/**
	 * The number of structural features of the '<em>IRoom Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IRoom Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementTypeImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = IROOM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accepted Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ACCEPTED_ACTIONS = IROOM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SHAPE = IROOM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__STATE = IROOM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = IROOM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = IROOM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.DungeonOLDImpl <em>Dungeon OLD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DungeonOLDImpl
	 * @see generator.impl.GeneratorPackageImpl#getDungeonOLD()
	 * @generated
	 */
	int DUNGEON_OLD = 20;

	/**
	 * The feature id for the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OLD__NUMBER_OF_ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Gameobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OLD__GAMEOBJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OLD__ROOMS = 2;

	/**
	 * The number of structural features of the '<em>Dungeon OLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dungeon OLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNGEON_OLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.GameObjectiveImpl <em>Game Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GameObjectiveImpl
	 * @see generator.impl.GeneratorPackageImpl#getGameObjective()
	 * @generated
	 */
	int GAME_OBJECTIVE = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Game Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomOLDImpl <em>Room OLD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomOLDImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoomOLD()
	 * @generated
	 */
	int ROOM_OLD = 22;

	/**
	 * The feature id for the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__SOUTH = 0;

	/**
	 * The feature id for the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__NORTH = 1;

	/**
	 * The feature id for the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__EAST = 2;

	/**
	 * The feature id for the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__WEST = 3;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__ROOMTYPE = 4;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD__INITIAL_STATE = 5;

	/**
	 * The number of structural features of the '<em>Room OLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Room OLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ClassicRoomImpl <em>Classic Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ClassicRoomImpl
	 * @see generator.impl.GeneratorPackageImpl#getClassicRoom()
	 * @generated
	 */
	int CLASSIC_ROOM = 23;

	/**
	 * The feature id for the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__SOUTH = ROOM_OLD__SOUTH;

	/**
	 * The feature id for the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__NORTH = ROOM_OLD__NORTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__EAST = ROOM_OLD__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__WEST = ROOM_OLD__WEST;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__ROOMTYPE = ROOM_OLD__ROOMTYPE;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM__INITIAL_STATE = ROOM_OLD__INITIAL_STATE;

	/**
	 * The number of structural features of the '<em>Classic Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM_FEATURE_COUNT = ROOM_OLD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classic Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_ROOM_OPERATION_COUNT = ROOM_OLD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.QuestionRoomImpl <em>Question Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.QuestionRoomImpl
	 * @see generator.impl.GeneratorPackageImpl#getQuestionRoom()
	 * @generated
	 */
	int QUESTION_ROOM = 24;

	/**
	 * The feature id for the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__SOUTH = ROOM_OLD__SOUTH;

	/**
	 * The feature id for the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__NORTH = ROOM_OLD__NORTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__EAST = ROOM_OLD__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__WEST = ROOM_OLD__WEST;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__ROOMTYPE = ROOM_OLD__ROOMTYPE;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__INITIAL_STATE = ROOM_OLD__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Sucess State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM__SUCESS_STATE = ROOM_OLD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM_FEATURE_COUNT = ROOM_OLD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ROOM_OPERATION_COUNT = ROOM_OLD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.PathwayImpl <em>Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PathwayImpl
	 * @see generator.impl.GeneratorPackageImpl#getPathway()
	 * @generated
	 */
	int PATHWAY = 25;

	/**
	 * The number of structural features of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.RoomType2Impl <em>Room Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomType2Impl
	 * @see generator.impl.GeneratorPackageImpl#getRoomType2()
	 * @generated
	 */
	int ROOM_TYPE2 = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE2__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Acceptedfloors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE2__ACCEPTEDFLOORS = 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE2__PATHS = 2;

	/**
	 * The number of structural features of the '<em>Room Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE2_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.FloorImpl
	 * @see generator.impl.GeneratorPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Accepted Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ACCEPTED_ACTIONS = ELEMENT_TYPE__ACCEPTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__SHAPE = ELEMENT_TYPE__SHAPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__STATE = ELEMENT_TYPE__STATE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__LOCATIONS = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__DESCRIPTION = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = ELEMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generator.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.LocationImpl
	 * @see generator.impl.GeneratorPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 28;

	/**
	 * The feature id for the '<em><b>Accepted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ACCEPTED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Maxshape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MAXSHAPE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.StateImpl
	 * @see generator.impl.GeneratorPackageImpl#getState()
	 * @generated
	 */
	int STATE = 29;

	/**
	 * The feature id for the '<em><b>Placedobjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PLACEDOBJECTS = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.PlacedObjectImpl <em>Placed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.PlacedObjectImpl
	 * @see generator.impl.GeneratorPackageImpl#getPlacedObject()
	 * @generated
	 */
	int PLACED_OBJECT = 30;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACED_OBJECT__DISPLAY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Placed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACED_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Placed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACED_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementShapeImpl <em>Element Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementShapeImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementShape()
	 * @generated
	 */
	int ELEMENT_SHAPE = 32;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SHAPE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SHAPE__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Element Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SHAPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.ElementStateImpl <em>Element State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.ElementStateImpl
	 * @see generator.impl.GeneratorPackageImpl#getElementState()
	 * @generated
	 */
	int ELEMENT_STATE = 33;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STATE__STATE = 0;

	/**
	 * The number of structural features of the '<em>Element State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.impl.DungeonImpl <em>Dungeon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.DungeonImpl
	 * @see generator.impl.GeneratorPackageImpl#getDungeon()
	 * @generated
	 */
	int DUNGEON = 34;

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
	 * The meta object id for the '{@link generator.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RoomImpl
	 * @see generator.impl.GeneratorPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 35;

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
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

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
	int GAME_DESCRIPTION = 36;

	/**
	 * The feature id for the '<em><b>Roomtypes</b></em>' containment reference list.
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
	int ROOM_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 1;

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
	int SMALL_ROOM_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

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
	int LARGE_ROOM_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ROOM_TYPE__NAME = ROOM_TYPE__NAME;

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
	int ROOM_ACCESS = 40;

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
	 * The meta object id for the '{@link generator.impl.RogueliteContextImpl <em>Roguelite Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.RogueliteContextImpl
	 * @see generator.impl.GeneratorPackageImpl#getRogueliteContext()
	 * @generated
	 */
	int ROGUELITE_CONTEXT = 41;

	/**
	 * The feature id for the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROGUELITE_CONTEXT__NUMBER_OF_ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROGUELITE_CONTEXT__MODE = 1;

	/**
	 * The number of structural features of the '<em>Roguelite Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROGUELITE_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Roguelite Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROGUELITE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.SubObjectiveType <em>Sub Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.SubObjectiveType
	 * @see generator.impl.GeneratorPackageImpl#getSubObjectiveType()
	 * @generated
	 */
	int SUB_OBJECTIVE_TYPE = 42;

	/**
	 * The meta object id for the '{@link generator.GPBricks <em>GP Bricks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.GPBricks
	 * @see generator.impl.GeneratorPackageImpl#getGPBricks()
	 * @generated
	 */
	int GP_BRICKS = 43;

	/**
	 * The meta object id for the '{@link generator.AvatarActions <em>Avatar Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.AvatarActions
	 * @see generator.impl.GeneratorPackageImpl#getAvatarActions()
	 * @generated
	 */
	int AVATAR_ACTIONS = 44;

	/**
	 * The meta object id for the '{@link generator.RoomPaths <em>Room Paths</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.RoomPaths
	 * @see generator.impl.GeneratorPackageImpl#getRoomPaths()
	 * @generated
	 */
	int ROOM_PATHS = 45;

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
	 * Returns the meta object for class '{@link generator.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite</em>'.
	 * @see generator.Prerequisite
	 * @generated
	 */
	EClass getPrerequisite();

	/**
	 * Returns the meta object for the attribute '{@link generator.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Percentage</em>'.
	 * @see generator.Prerequisite#getSuccessPercentage()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_SuccessPercentage();

	/**
	 * Returns the meta object for the reference '{@link generator.Prerequisite#getPrerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prerequisite</em>'.
	 * @see generator.Prerequisite#getPrerequisite()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_Prerequisite();

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
	 * Returns the meta object for the containment reference list '{@link generator.Level#getSubobjectives <em>Subobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subobjectives</em>'.
	 * @see generator.Level#getSubobjectives()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Subobjectives();

	/**
	 * Returns the meta object for class '{@link generator.QFValidityDetermination <em>QF Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Validity Determination</em>'.
	 * @see generator.QFValidityDetermination
	 * @generated
	 */
	EClass getQFValidityDetermination();

	/**
	 * Returns the meta object for the attribute '{@link generator.QFValidityDetermination#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.QFValidityDetermination#getType()
	 * @see #getQFValidityDetermination()
	 * @generated
	 */
	EAttribute getQFValidityDetermination_Type();

	/**
	 * Returns the meta object for class '{@link generator.LearningPaths <em>Learning Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Paths</em>'.
	 * @see generator.LearningPaths
	 * @generated
	 */
	EClass getLearningPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.LearningPaths#getLearningpaths <em>Learningpaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningpaths</em>'.
	 * @see generator.LearningPaths#getLearningpaths()
	 * @see #getLearningPaths()
	 * @generated
	 */
	EReference getLearningPaths_Learningpaths();

	/**
	 * Returns the meta object for class '{@link generator.ResultValidityDetermination <em>Result Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Validity Determination</em>'.
	 * @see generator.ResultValidityDetermination
	 * @generated
	 */
	EClass getResultValidityDetermination();

	/**
	 * Returns the meta object for the attribute '{@link generator.ResultValidityDetermination#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see generator.ResultValidityDetermination#getNewAttribute()
	 * @see #getResultValidityDetermination()
	 * @generated
	 */
	EAttribute getResultValidityDetermination_NewAttribute();

	/**
	 * Returns the meta object for class '{@link generator.QFOneCompletion <em>QF One Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF One Completion</em>'.
	 * @see generator.QFOneCompletion
	 * @generated
	 */
	EClass getQFOneCompletion();

	/**
	 * Returns the meta object for the attribute '{@link generator.QFOneCompletion#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.QFOneCompletion#getType()
	 * @see #getQFOneCompletion()
	 * @generated
	 */
	EAttribute getQFOneCompletion_Type();

	/**
	 * Returns the meta object for class '{@link generator.QFReconstruction <em>QF Reconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Reconstruction</em>'.
	 * @see generator.QFReconstruction
	 * @generated
	 */
	EClass getQFReconstruction();

	/**
	 * Returns the meta object for the attribute '{@link generator.QFReconstruction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.QFReconstruction#getType()
	 * @see #getQFReconstruction()
	 * @generated
	 */
	EAttribute getQFReconstruction_Type();

	/**
	 * Returns the meta object for class '{@link generator.SubObjective <em>Sub Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Objective</em>'.
	 * @see generator.SubObjective
	 * @generated
	 */
	EClass getSubObjective();

	/**
	 * Returns the meta object for the attribute '{@link generator.SubObjective#getPercentageOfApparition <em>Percentage Of Apparition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Apparition</em>'.
	 * @see generator.SubObjective#getPercentageOfApparition()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_PercentageOfApparition();

	/**
	 * Returns the meta object for the attribute '{@link generator.SubObjective#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Valid Facts</em>'.
	 * @see generator.SubObjective#getPercentageOfValidFacts()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_PercentageOfValidFacts();

	/**
	 * Returns the meta object for the attribute '{@link generator.SubObjective#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Consecutive Success</em>'.
	 * @see generator.SubObjective#getNbConsecutiveSuccess()
	 * @see #getSubObjective()
	 * @generated
	 */
	EAttribute getSubObjective_NbConsecutiveSuccess();

	/**
	 * Returns the meta object for class '{@link generator.QFTwoCompletion <em>QF Two Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QF Two Completion</em>'.
	 * @see generator.QFTwoCompletion
	 * @generated
	 */
	EClass getQFTwoCompletion();

	/**
	 * Returns the meta object for the attribute '{@link generator.QFTwoCompletion#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.QFTwoCompletion#getType()
	 * @see #getQFTwoCompletion()
	 * @generated
	 */
	EAttribute getQFTwoCompletion_Type();

	/**
	 * Returns the meta object for class '{@link generator.ProblemResolution <em>Problem Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Resolution</em>'.
	 * @see generator.ProblemResolution
	 * @generated
	 */
	EClass getProblemResolution();

	/**
	 * Returns the meta object for the attribute '{@link generator.ProblemResolution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see generator.ProblemResolution#getType()
	 * @see #getProblemResolution()
	 * @generated
	 */
	EAttribute getProblemResolution_Type();

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
	 * Returns the meta object for class '{@link generator.LearningPath <em>Learning Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Path</em>'.
	 * @see generator.LearningPath
	 * @generated
	 */
	EClass getLearningPath();

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
	 * Returns the meta object for the containment reference list '{@link generator.LearningPath#getLearningobjectives <em>Learningobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningobjectives</em>'.
	 * @see generator.LearningPath#getLearningobjectives()
	 * @see #getLearningPath()
	 * @generated
	 */
	EReference getLearningPath_Learningobjectives();

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
	 * Returns the meta object for class '{@link generator.GameContent <em>Game Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Content</em>'.
	 * @see generator.GameContent
	 * @generated
	 */
	EClass getGameContent();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameContent#getGameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameplays</em>'.
	 * @see generator.GameContent#getGameplays()
	 * @see #getGameContent()
	 * @generated
	 */
	EReference getGameContent_Gameplays();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameContent#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see generator.GameContent#getElements()
	 * @see #getGameContent()
	 * @generated
	 */
	EReference getGameContent_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameContent#getGameobjectives <em>Gameobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameobjectives</em>'.
	 * @see generator.GameContent#getGameobjectives()
	 * @see #getGameContent()
	 * @generated
	 */
	EReference getGameContent_Gameobjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameContent#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roomtype</em>'.
	 * @see generator.GameContent#getRoomtype()
	 * @see #getGameContent()
	 * @generated
	 */
	EReference getGameContent_Roomtype();

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
	 * Returns the meta object for the containment reference list '{@link generator.Gameplay#getCoregamerules <em>Coregamerules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coregamerules</em>'.
	 * @see generator.Gameplay#getCoregamerules()
	 * @see #getGameplay()
	 * @generated
	 */
	EReference getGameplay_Coregamerules();

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
	 * Returns the meta object for class '{@link generator.CoreGameRule <em>Core Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Game Rule</em>'.
	 * @see generator.CoreGameRule
	 * @generated
	 */
	EClass getCoreGameRule();

	/**
	 * Returns the meta object for the attribute '{@link generator.CoreGameRule#getRuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Type</em>'.
	 * @see generator.CoreGameRule#getRuleType()
	 * @see #getCoreGameRule()
	 * @generated
	 */
	EAttribute getCoreGameRule_RuleType();

	/**
	 * Returns the meta object for the attribute '{@link generator.CoreGameRule#getActionToDo <em>Action To Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action To Do</em>'.
	 * @see generator.CoreGameRule#getActionToDo()
	 * @see #getCoreGameRule()
	 * @generated
	 */
	EAttribute getCoreGameRule_ActionToDo();

	/**
	 * Returns the meta object for the reference '{@link generator.CoreGameRule#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see generator.CoreGameRule#getElement()
	 * @see #getCoreGameRule()
	 * @generated
	 */
	EReference getCoreGameRule_Element();

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
	 * Returns the meta object for the attribute list '{@link generator.ElementType#getAcceptedActions <em>Accepted Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Actions</em>'.
	 * @see generator.ElementType#getAcceptedActions()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_AcceptedActions();

	/**
	 * Returns the meta object for the containment reference '{@link generator.ElementType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see generator.ElementType#getShape()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.ElementType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see generator.ElementType#getState()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_State();

	/**
	 * Returns the meta object for class '{@link generator.DungeonOLD <em>Dungeon OLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dungeon OLD</em>'.
	 * @see generator.DungeonOLD
	 * @generated
	 */
	EClass getDungeonOLD();

	/**
	 * Returns the meta object for the attribute '{@link generator.DungeonOLD#getNumberOfRooms <em>Number Of Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rooms</em>'.
	 * @see generator.DungeonOLD#getNumberOfRooms()
	 * @see #getDungeonOLD()
	 * @generated
	 */
	EAttribute getDungeonOLD_NumberOfRooms();

	/**
	 * Returns the meta object for the reference '{@link generator.DungeonOLD#getGameobjective <em>Gameobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameobjective</em>'.
	 * @see generator.DungeonOLD#getGameobjective()
	 * @see #getDungeonOLD()
	 * @generated
	 */
	EReference getDungeonOLD_Gameobjective();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.DungeonOLD#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see generator.DungeonOLD#getRooms()
	 * @see #getDungeonOLD()
	 * @generated
	 */
	EReference getDungeonOLD_Rooms();

	/**
	 * Returns the meta object for class '{@link generator.GameObjective <em>Game Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Objective</em>'.
	 * @see generator.GameObjective
	 * @generated
	 */
	EClass getGameObjective();

	/**
	 * Returns the meta object for the attribute '{@link generator.GameObjective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.GameObjective#getDescription()
	 * @see #getGameObjective()
	 * @generated
	 */
	EAttribute getGameObjective_Description();

	/**
	 * Returns the meta object for class '{@link generator.RoomOLD <em>Room OLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room OLD</em>'.
	 * @see generator.RoomOLD
	 * @generated
	 */
	EClass getRoomOLD();

	/**
	 * Returns the meta object for the containment reference '{@link generator.RoomOLD#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>South</em>'.
	 * @see generator.RoomOLD#getSouth()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_South();

	/**
	 * Returns the meta object for the containment reference '{@link generator.RoomOLD#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>North</em>'.
	 * @see generator.RoomOLD#getNorth()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_North();

	/**
	 * Returns the meta object for the containment reference '{@link generator.RoomOLD#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>East</em>'.
	 * @see generator.RoomOLD#getEast()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_East();

	/**
	 * Returns the meta object for the containment reference '{@link generator.RoomOLD#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>West</em>'.
	 * @see generator.RoomOLD#getWest()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_West();

	/**
	 * Returns the meta object for the reference '{@link generator.RoomOLD#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see generator.RoomOLD#getRoomtype()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_Roomtype();

	/**
	 * Returns the meta object for the containment reference '{@link generator.RoomOLD#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial State</em>'.
	 * @see generator.RoomOLD#getInitialState()
	 * @see #getRoomOLD()
	 * @generated
	 */
	EReference getRoomOLD_InitialState();

	/**
	 * Returns the meta object for class '{@link generator.ClassicRoom <em>Classic Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classic Room</em>'.
	 * @see generator.ClassicRoom
	 * @generated
	 */
	EClass getClassicRoom();

	/**
	 * Returns the meta object for class '{@link generator.QuestionRoom <em>Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Room</em>'.
	 * @see generator.QuestionRoom
	 * @generated
	 */
	EClass getQuestionRoom();

	/**
	 * Returns the meta object for the containment reference '{@link generator.QuestionRoom#getSucessState <em>Sucess State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sucess State</em>'.
	 * @see generator.QuestionRoom#getSucessState()
	 * @see #getQuestionRoom()
	 * @generated
	 */
	EReference getQuestionRoom_SucessState();

	/**
	 * Returns the meta object for class '{@link generator.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pathway</em>'.
	 * @see generator.Pathway
	 * @generated
	 */
	EClass getPathway();

	/**
	 * Returns the meta object for class '{@link generator.RoomType2 <em>Room Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type2</em>'.
	 * @see generator.RoomType2
	 * @generated
	 */
	EClass getRoomType2();

	/**
	 * Returns the meta object for the attribute '{@link generator.RoomType2#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.RoomType2#getDescription()
	 * @see #getRoomType2()
	 * @generated
	 */
	EAttribute getRoomType2_Description();

	/**
	 * Returns the meta object for the reference list '{@link generator.RoomType2#getAcceptedfloors <em>Acceptedfloors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acceptedfloors</em>'.
	 * @see generator.RoomType2#getAcceptedfloors()
	 * @see #getRoomType2()
	 * @generated
	 */
	EReference getRoomType2_Acceptedfloors();

	/**
	 * Returns the meta object for the attribute list '{@link generator.RoomType2#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see generator.RoomType2#getPaths()
	 * @see #getRoomType2()
	 * @generated
	 */
	EAttribute getRoomType2_Paths();

	/**
	 * Returns the meta object for class '{@link generator.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see generator.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.Floor#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see generator.Floor#getLocations()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Locations();

	/**
	 * Returns the meta object for the attribute '{@link generator.Floor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see generator.Floor#getDescription()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Description();

	/**
	 * Returns the meta object for class '{@link generator.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see generator.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link generator.Location#getAcceptedElements <em>Accepted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accepted Elements</em>'.
	 * @see generator.Location#getAcceptedElements()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_AcceptedElements();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Location#getMaxshape <em>Maxshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxshape</em>'.
	 * @see generator.Location#getMaxshape()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Maxshape();

	/**
	 * Returns the meta object for class '{@link generator.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see generator.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.State#getPlacedobjects <em>Placedobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placedobjects</em>'.
	 * @see generator.State#getPlacedobjects()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Placedobjects();

	/**
	 * Returns the meta object for class '{@link generator.PlacedObject <em>Placed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placed Object</em>'.
	 * @see generator.PlacedObject
	 * @generated
	 */
	EClass getPlacedObject();

	/**
	 * Returns the meta object for the attribute '{@link generator.PlacedObject#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Value</em>'.
	 * @see generator.PlacedObject#getDisplayValue()
	 * @see #getPlacedObject()
	 * @generated
	 */
	EAttribute getPlacedObject_DisplayValue();

	/**
	 * Returns the meta object for class '{@link generator.IRoomElement <em>IRoom Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Element</em>'.
	 * @see generator.IRoomElement
	 * @generated
	 */
	EClass getIRoomElement();

	/**
	 * Returns the meta object for class '{@link generator.ElementShape <em>Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Shape</em>'.
	 * @see generator.ElementShape
	 * @generated
	 */
	EClass getElementShape();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementShape#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see generator.ElementShape#getHeight()
	 * @see #getElementShape()
	 * @generated
	 */
	EAttribute getElementShape_Height();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementShape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see generator.ElementShape#getWidth()
	 * @see #getElementShape()
	 * @generated
	 */
	EAttribute getElementShape_Width();

	/**
	 * Returns the meta object for class '{@link generator.ElementState <em>Element State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element State</em>'.
	 * @see generator.ElementState
	 * @generated
	 */
	EClass getElementState();

	/**
	 * Returns the meta object for the attribute '{@link generator.ElementState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see generator.ElementState#getState()
	 * @see #getElementState()
	 * @generated
	 */
	EAttribute getElementState_State();

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
	 * Returns the meta object for class '{@link generator.GameDescription <em>Game Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Description</em>'.
	 * @see generator.GameDescription
	 * @generated
	 */
	EClass getGameDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roomtypes</em>'.
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
	 * Returns the meta object for class '{@link generator.RogueliteContext <em>Roguelite Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roguelite Context</em>'.
	 * @see generator.RogueliteContext
	 * @generated
	 */
	EClass getRogueliteContext();

	/**
	 * Returns the meta object for the attribute '{@link generator.RogueliteContext#getNumberOfRooms <em>Number Of Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rooms</em>'.
	 * @see generator.RogueliteContext#getNumberOfRooms()
	 * @see #getRogueliteContext()
	 * @generated
	 */
	EAttribute getRogueliteContext_NumberOfRooms();

	/**
	 * Returns the meta object for the attribute '{@link generator.RogueliteContext#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see generator.RogueliteContext#getMode()
	 * @see #getRogueliteContext()
	 * @generated
	 */
	EAttribute getRogueliteContext_Mode();

	/**
	 * Returns the meta object for enum '{@link generator.SubObjectiveType <em>Sub Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Objective Type</em>'.
	 * @see generator.SubObjectiveType
	 * @generated
	 */
	EEnum getSubObjectiveType();

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
	 * Returns the meta object for enum '{@link generator.AvatarActions <em>Avatar Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Avatar Actions</em>'.
	 * @see generator.AvatarActions
	 * @generated
	 */
	EEnum getAvatarActions();

	/**
	 * Returns the meta object for enum '{@link generator.RoomPaths <em>Room Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Paths</em>'.
	 * @see generator.RoomPaths
	 * @generated
	 */
	EEnum getRoomPaths();

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
		 * The meta object literal for the '{@link generator.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PrerequisiteImpl
		 * @see generator.impl.GeneratorPackageImpl#getPrerequisite()
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
		 * The meta object literal for the '<em><b>Subobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__SUBOBJECTIVES = eINSTANCE.getLevel_Subobjectives();

		/**
		 * The meta object literal for the '{@link generator.impl.QFValidityDeterminationImpl <em>QF Validity Determination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QFValidityDeterminationImpl
		 * @see generator.impl.GeneratorPackageImpl#getQFValidityDetermination()
		 * @generated
		 */
		EClass QF_VALIDITY_DETERMINATION = eINSTANCE.getQFValidityDetermination();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_VALIDITY_DETERMINATION__TYPE = eINSTANCE.getQFValidityDetermination_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.LearningPathsImpl <em>Learning Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearningPathsImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearningPaths()
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
		 * The meta object literal for the '{@link generator.impl.ResultValidityDeterminationImpl <em>Result Validity Determination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ResultValidityDeterminationImpl
		 * @see generator.impl.GeneratorPackageImpl#getResultValidityDetermination()
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
		 * The meta object literal for the '{@link generator.impl.QFOneCompletionImpl <em>QF One Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QFOneCompletionImpl
		 * @see generator.impl.GeneratorPackageImpl#getQFOneCompletion()
		 * @generated
		 */
		EClass QF_ONE_COMPLETION = eINSTANCE.getQFOneCompletion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_ONE_COMPLETION__TYPE = eINSTANCE.getQFOneCompletion_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.QFReconstructionImpl <em>QF Reconstruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QFReconstructionImpl
		 * @see generator.impl.GeneratorPackageImpl#getQFReconstruction()
		 * @generated
		 */
		EClass QF_RECONSTRUCTION = eINSTANCE.getQFReconstruction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_RECONSTRUCTION__TYPE = eINSTANCE.getQFReconstruction_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.SubObjectiveImpl <em>Sub Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.SubObjectiveImpl
		 * @see generator.impl.GeneratorPackageImpl#getSubObjective()
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
		 * The meta object literal for the '{@link generator.impl.QFTwoCompletionImpl <em>QF Two Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QFTwoCompletionImpl
		 * @see generator.impl.GeneratorPackageImpl#getQFTwoCompletion()
		 * @generated
		 */
		EClass QF_TWO_COMPLETION = eINSTANCE.getQFTwoCompletion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QF_TWO_COMPLETION__TYPE = eINSTANCE.getQFTwoCompletion_Type();

		/**
		 * The meta object literal for the '{@link generator.impl.ProblemResolutionImpl <em>Problem Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ProblemResolutionImpl
		 * @see generator.impl.GeneratorPackageImpl#getProblemResolution()
		 * @generated
		 */
		EClass PROBLEM_RESOLUTION = eINSTANCE.getProblemResolution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_RESOLUTION__TYPE = eINSTANCE.getProblemResolution_Type();

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
		 * The meta object literal for the '{@link generator.impl.LearningPathImpl <em>Learning Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LearningPathImpl
		 * @see generator.impl.GeneratorPackageImpl#getLearningPath()
		 * @generated
		 */
		EClass LEARNING_PATH = eINSTANCE.getLearningPath();

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
		 * The meta object literal for the '<em><b>Learningobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_PATH__LEARNINGOBJECTIVES = eINSTANCE.getLearningPath_Learningobjectives();

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
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__LEVELS = eINSTANCE.getLearningObjective_Levels();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_OBJECTIVE__PREREQUISITES = eINSTANCE.getLearningObjective_Prerequisites();

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
		 * The meta object literal for the '{@link generator.impl.GameContentImpl <em>Game Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameContentImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameContent()
		 * @generated
		 */
		EClass GAME_CONTENT = eINSTANCE.getGameContent();

		/**
		 * The meta object literal for the '<em><b>Gameplays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONTENT__GAMEPLAYS = eINSTANCE.getGameContent_Gameplays();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONTENT__ELEMENTS = eINSTANCE.getGameContent_Elements();

		/**
		 * The meta object literal for the '<em><b>Gameobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONTENT__GAMEOBJECTIVES = eINSTANCE.getGameContent_Gameobjectives();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONTENT__ROOMTYPE = eINSTANCE.getGameContent_Roomtype();

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
		 * The meta object literal for the '<em><b>Coregamerules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMEPLAY__COREGAMERULES = eINSTANCE.getGameplay_Coregamerules();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMEPLAY__DESCRIPTION = eINSTANCE.getGameplay_Description();

		/**
		 * The meta object literal for the '{@link generator.impl.CoreGameRuleImpl <em>Core Game Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.CoreGameRuleImpl
		 * @see generator.impl.GeneratorPackageImpl#getCoreGameRule()
		 * @generated
		 */
		EClass CORE_GAME_RULE = eINSTANCE.getCoreGameRule();

		/**
		 * The meta object literal for the '<em><b>Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_GAME_RULE__RULE_TYPE = eINSTANCE.getCoreGameRule_RuleType();

		/**
		 * The meta object literal for the '<em><b>Action To Do</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_GAME_RULE__ACTION_TO_DO = eINSTANCE.getCoreGameRule_ActionToDo();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_GAME_RULE__ELEMENT = eINSTANCE.getCoreGameRule_Element();

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
		 * The meta object literal for the '<em><b>Accepted Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__ACCEPTED_ACTIONS = eINSTANCE.getElementType_AcceptedActions();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__SHAPE = eINSTANCE.getElementType_Shape();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__STATE = eINSTANCE.getElementType_State();

		/**
		 * The meta object literal for the '{@link generator.impl.DungeonOLDImpl <em>Dungeon OLD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.DungeonOLDImpl
		 * @see generator.impl.GeneratorPackageImpl#getDungeonOLD()
		 * @generated
		 */
		EClass DUNGEON_OLD = eINSTANCE.getDungeonOLD();

		/**
		 * The meta object literal for the '<em><b>Number Of Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNGEON_OLD__NUMBER_OF_ROOMS = eINSTANCE.getDungeonOLD_NumberOfRooms();

		/**
		 * The meta object literal for the '<em><b>Gameobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON_OLD__GAMEOBJECTIVE = eINSTANCE.getDungeonOLD_Gameobjective();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNGEON_OLD__ROOMS = eINSTANCE.getDungeonOLD_Rooms();

		/**
		 * The meta object literal for the '{@link generator.impl.GameObjectiveImpl <em>Game Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameObjectiveImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameObjective()
		 * @generated
		 */
		EClass GAME_OBJECTIVE = eINSTANCE.getGameObjective();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_OBJECTIVE__DESCRIPTION = eINSTANCE.getGameObjective_Description();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomOLDImpl <em>Room OLD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomOLDImpl
		 * @see generator.impl.GeneratorPackageImpl#getRoomOLD()
		 * @generated
		 */
		EClass ROOM_OLD = eINSTANCE.getRoomOLD();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__SOUTH = eINSTANCE.getRoomOLD_South();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__NORTH = eINSTANCE.getRoomOLD_North();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__EAST = eINSTANCE.getRoomOLD_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__WEST = eINSTANCE.getRoomOLD_West();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__ROOMTYPE = eINSTANCE.getRoomOLD_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OLD__INITIAL_STATE = eINSTANCE.getRoomOLD_InitialState();

		/**
		 * The meta object literal for the '{@link generator.impl.ClassicRoomImpl <em>Classic Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ClassicRoomImpl
		 * @see generator.impl.GeneratorPackageImpl#getClassicRoom()
		 * @generated
		 */
		EClass CLASSIC_ROOM = eINSTANCE.getClassicRoom();

		/**
		 * The meta object literal for the '{@link generator.impl.QuestionRoomImpl <em>Question Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.QuestionRoomImpl
		 * @see generator.impl.GeneratorPackageImpl#getQuestionRoom()
		 * @generated
		 */
		EClass QUESTION_ROOM = eINSTANCE.getQuestionRoom();

		/**
		 * The meta object literal for the '<em><b>Sucess State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_ROOM__SUCESS_STATE = eINSTANCE.getQuestionRoom_SucessState();

		/**
		 * The meta object literal for the '{@link generator.impl.PathwayImpl <em>Pathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PathwayImpl
		 * @see generator.impl.GeneratorPackageImpl#getPathway()
		 * @generated
		 */
		EClass PATHWAY = eINSTANCE.getPathway();

		/**
		 * The meta object literal for the '{@link generator.impl.RoomType2Impl <em>Room Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RoomType2Impl
		 * @see generator.impl.GeneratorPackageImpl#getRoomType2()
		 * @generated
		 */
		EClass ROOM_TYPE2 = eINSTANCE.getRoomType2();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE2__DESCRIPTION = eINSTANCE.getRoomType2_Description();

		/**
		 * The meta object literal for the '<em><b>Acceptedfloors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE2__ACCEPTEDFLOORS = eINSTANCE.getRoomType2_Acceptedfloors();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE2__PATHS = eINSTANCE.getRoomType2_Paths();

		/**
		 * The meta object literal for the '{@link generator.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.FloorImpl
		 * @see generator.impl.GeneratorPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__LOCATIONS = eINSTANCE.getFloor_Locations();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__DESCRIPTION = eINSTANCE.getFloor_Description();

		/**
		 * The meta object literal for the '{@link generator.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.LocationImpl
		 * @see generator.impl.GeneratorPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Accepted Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ACCEPTED_ELEMENTS = eINSTANCE.getLocation_AcceptedElements();

		/**
		 * The meta object literal for the '<em><b>Maxshape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__MAXSHAPE = eINSTANCE.getLocation_Maxshape();

		/**
		 * The meta object literal for the '{@link generator.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.StateImpl
		 * @see generator.impl.GeneratorPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Placedobjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PLACEDOBJECTS = eINSTANCE.getState_Placedobjects();

		/**
		 * The meta object literal for the '{@link generator.impl.PlacedObjectImpl <em>Placed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.PlacedObjectImpl
		 * @see generator.impl.GeneratorPackageImpl#getPlacedObject()
		 * @generated
		 */
		EClass PLACED_OBJECT = eINSTANCE.getPlacedObject();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACED_OBJECT__DISPLAY_VALUE = eINSTANCE.getPlacedObject_DisplayValue();

		/**
		 * The meta object literal for the '{@link generator.IRoomElement <em>IRoom Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.IRoomElement
		 * @see generator.impl.GeneratorPackageImpl#getIRoomElement()
		 * @generated
		 */
		EClass IROOM_ELEMENT = eINSTANCE.getIRoomElement();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementShapeImpl <em>Element Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementShapeImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementShape()
		 * @generated
		 */
		EClass ELEMENT_SHAPE = eINSTANCE.getElementShape();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SHAPE__HEIGHT = eINSTANCE.getElementShape_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SHAPE__WIDTH = eINSTANCE.getElementShape_Width();

		/**
		 * The meta object literal for the '{@link generator.impl.ElementStateImpl <em>Element State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.ElementStateImpl
		 * @see generator.impl.GeneratorPackageImpl#getElementState()
		 * @generated
		 */
		EClass ELEMENT_STATE = eINSTANCE.getElementState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STATE__STATE = eINSTANCE.getElementState_State();

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
		 * The meta object literal for the '{@link generator.impl.GameDescriptionImpl <em>Game Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GameDescriptionImpl
		 * @see generator.impl.GeneratorPackageImpl#getGameDescription()
		 * @generated
		 */
		EClass GAME_DESCRIPTION = eINSTANCE.getGameDescription();

		/**
		 * The meta object literal for the '<em><b>Roomtypes</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link generator.impl.RogueliteContextImpl <em>Roguelite Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.RogueliteContextImpl
		 * @see generator.impl.GeneratorPackageImpl#getRogueliteContext()
		 * @generated
		 */
		EClass ROGUELITE_CONTEXT = eINSTANCE.getRogueliteContext();

		/**
		 * The meta object literal for the '<em><b>Number Of Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROGUELITE_CONTEXT__NUMBER_OF_ROOMS = eINSTANCE.getRogueliteContext_NumberOfRooms();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROGUELITE_CONTEXT__MODE = eINSTANCE.getRogueliteContext_Mode();

		/**
		 * The meta object literal for the '{@link generator.SubObjectiveType <em>Sub Objective Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.SubObjectiveType
		 * @see generator.impl.GeneratorPackageImpl#getSubObjectiveType()
		 * @generated
		 */
		EEnum SUB_OBJECTIVE_TYPE = eINSTANCE.getSubObjectiveType();

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
		 * The meta object literal for the '{@link generator.AvatarActions <em>Avatar Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.AvatarActions
		 * @see generator.impl.GeneratorPackageImpl#getAvatarActions()
		 * @generated
		 */
		EEnum AVATAR_ACTIONS = eINSTANCE.getAvatarActions();

		/**
		 * The meta object literal for the '{@link generator.RoomPaths <em>Room Paths</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.RoomPaths
		 * @see generator.impl.GeneratorPackageImpl#getRoomPaths()
		 * @generated
		 */
		EEnum ROOM_PATHS = eINSTANCE.getRoomPaths();

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

	}

} //GeneratorPackage
