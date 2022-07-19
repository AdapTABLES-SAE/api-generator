/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.AbstractFact;
import generatorMetamodels.AdaptedLearningGameActivity;
import generatorMetamodels.Chests3Room;
import generatorMetamodels.ConceptualElement;
import generatorMetamodels.ConcreteElement;
import generatorMetamodels.CurrentProgression;
import generatorMetamodels.DimensionsEntanglement;
import generatorMetamodels.Door;
import generatorMetamodels.Doors3Room;
import generatorMetamodels.Dungeon;
import generatorMetamodels.EntryRoom;
import generatorMetamodels.ExitRoom;
import generatorMetamodels.Fact;
import generatorMetamodels.GameDomain;
import generatorMetamodels.GameElementType;
import generatorMetamodels.GameElements;
import generatorMetamodels.GameMode;
import generatorMetamodels.GameProfile;
import generatorMetamodels.GamingObjective;
import generatorMetamodels.GeneratorMetamodelsFactory;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;
import generatorMetamodels.IParameter;
import generatorMetamodels.Input;
import generatorMetamodels.Knowledge;
import generatorMetamodels.LearnerPlayer;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.LearningPath;
import generatorMetamodels.LearningPaths;
import generatorMetamodels.LearningProfile;
import generatorMetamodels.Level;
import generatorMetamodels.MTLevel;
import generatorMetamodels.MTLevelParam;
import generatorMetamodels.MTQFOneCompletion;
import generatorMetamodels.MTResultPosition;
import generatorMetamodels.MTTableBuilding;
import generatorMetamodels.MultipleChoice;
import generatorMetamodels.ParamE2RoomCompliance;
import generatorMetamodels.Parameter2RoomIncompliance;
import generatorMetamodels.Prerequisite;
import generatorMetamodels.ProblemResolution;
import generatorMetamodels.QFOneCompletion;
import generatorMetamodels.QFReconstruction;
import generatorMetamodels.QFTwoCompletion;
import generatorMetamodels.QFValidityDetermination;
import generatorMetamodels.QuestionRoom;
import generatorMetamodels.Relations2Parameter;
import generatorMetamodels.ResponseModality;
import generatorMetamodels.ResultPosition;
import generatorMetamodels.ResultValidityDetermination;
import generatorMetamodels.Room;
import generatorMetamodels.Room2SubObjectiveCompliance;
import generatorMetamodels.RoomType;
import generatorMetamodels.SemanticRelation;
import generatorMetamodels.SetOfFacts;
import generatorMetamodels.SubObjective;
import generatorMetamodels.SubObjectiveType;
import generatorMetamodels.TableBuild;
import generatorMetamodels.TargetElement;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorMetamodelsPackageImpl extends EPackageImpl implements GeneratorMetamodelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultValidityDeterminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOfFactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qfTwoCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentProgressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dungeonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learnerPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qfReconstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseModalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qfOneCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qfValidityDeterminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamingObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeToEIntMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningPathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doors3RoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chests3RoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptedLearningGameActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfOneCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsEntanglementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass room2SubObjectiveComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtTableBuildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtResultPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtLevelParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter2RoomIncomplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relations2ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramE2RoomComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableBuildEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subObjectiveTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorMetamodelsPackageImpl() {
		super(eNS_URI, GeneratorMetamodelsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GeneratorMetamodelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorMetamodelsPackage init() {
		if (isInited)
			return (GeneratorMetamodelsPackage) EPackage.Registry.INSTANCE
					.getEPackage(GeneratorMetamodelsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeneratorMetamodelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeneratorMetamodelsPackageImpl theGeneratorMetamodelsPackage = registeredGeneratorMetamodelsPackage instanceof GeneratorMetamodelsPackageImpl
				? (GeneratorMetamodelsPackageImpl) registeredGeneratorMetamodelsPackage
				: new GeneratorMetamodelsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGeneratorMetamodelsPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorMetamodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorMetamodelsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorMetamodelsPackage.eNS_URI, theGeneratorMetamodelsPackage);
		return theGeneratorMetamodelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleChoice() {
		return multipleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_NbChoices() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultValidityDetermination() {
		return resultValidityDeterminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultValidityDetermination_NewAttribute() {
		return (EAttribute) resultValidityDeterminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOfFacts() {
		return setOfFactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetOfFacts_Facts() {
		return (EReference) setOfFactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOfFacts_Name() {
		return (EAttribute) setOfFactsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemResolution() {
		return problemResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemResolution_NewAttribute() {
		return (EAttribute) problemResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitRoom() {
		return exitRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExitRoom_Type() {
		return (EAttribute) exitRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQFTwoCompletion() {
		return qfTwoCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFTwoCompletion_NewAttribute() {
		return (EAttribute) qfTwoCompletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentProgression() {
		return currentProgressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentProgression_Learningobjective() {
		return (EReference) currentProgressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentProgression_Level() {
		return (EReference) currentProgressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDungeon() {
		return dungeonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDungeon_Mode() {
		return (EAttribute) dungeonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Rooms() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Entry() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDungeon_NumberOfRooms() {
		return (EAttribute) dungeonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Gamingobjective() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIParameter() {
		return iParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionRoom() {
		return questionRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningPath() {
		return learningPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Learningobjectives() {
		return (EReference) learningPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Knowledge() {
		return (EReference) learningPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningPath_Name() {
		return (EAttribute) learningPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFact() {
		return abstractFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFact() {
		return factEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFact_Description() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearnerPlayer() {
		return learnerPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearnerPlayer_Learningprofile() {
		return (EReference) learnerPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearnerPlayer_Gameprofile() {
		return (EReference) learnerPlayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearnerPlayer_Firstname() {
		return (EAttribute) learnerPlayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearnerPlayer_Lastname() {
		return (EAttribute) learnerPlayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighLevelActivity() {
		return highLevelActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelActivity_Level() {
		return (EReference) highLevelActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevelActivity_NumberOfQuestions() {
		return (EAttribute) highLevelActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelActivity_Gamingobjective() {
		return (EReference) highLevelActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevelActivity_SelectedMode() {
		return (EAttribute) highLevelActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelActivity_RoomTypesByPercentage() {
		return (EReference) highLevelActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelActivity__AddRoomPercentage__EMap() {
		return highLevelActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryRoom() {
		return entryRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryRoom_Type() {
		return (EAttribute) entryRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQFReconstruction() {
		return qfReconstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFReconstruction_NewAttribute() {
		return (EAttribute) qfReconstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjective() {
		return subObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_PercentageOfApparition() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_PercentageOfValidFacts() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_NbConsecutiveSuccess() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjective_Responsemodality() {
		return (EReference) subObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseModality() {
		return responseModalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseModality_ResponseTime() {
		return (EAttribute) responseModalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQFOneCompletion() {
		return qfOneCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFOneCompletion_NewAttribute() {
		return (EAttribute) qfOneCompletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameProfile() {
		return gameProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningProfile() {
		return learningProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningProfile_Learningpath() {
		return (EReference) learningProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningProfile_Currentprogressions() {
		return (EReference) learningProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningObjective() {
		return learningObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Levels() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Setoffacts() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_ID() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_Name() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Prerequisites() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevel() {
		return levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevel_ID() {
		return (EAttribute) levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevel_Subobjectives() {
		return (EReference) levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledge() {
		return knowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_Name() {
		return (EAttribute) knowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledge_Knowledgefacts() {
		return (EReference) knowledgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQFValidityDetermination() {
		return qfValidityDeterminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFValidityDetermination_NewAttribute() {
		return (EAttribute) qfValidityDeterminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Concreteelements() {
		return (EReference) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamingObjective() {
		return gamingObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamingObjective_Name() {
		return (EAttribute) gamingObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameDomain() {
		return gameDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDomain_Gamingobjectives() {
		return (EReference) gameDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDomain_Gameelements() {
		return (EReference) gameDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameElements() {
		return gameElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameElements_Name() {
		return (EAttribute) gameElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameElements_Type() {
		return (EAttribute) gameElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualElement() {
		return conceptualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualElement_Representations() {
		return (EReference) conceptualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptualElement_Adaptable() {
		return (EAttribute) conceptualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteElement() {
		return concreteElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteElement_ImgPath() {
		return (EAttribute) concreteElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypeToEIntMap() {
		return roomTypeToEIntMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomTypeToEIntMap_Key() {
		return (EAttribute) roomTypeToEIntMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomTypeToEIntMap_Value() {
		return (EAttribute) roomTypeToEIntMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningPaths() {
		return learningPathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPaths_Learningpaths() {
		return (EReference) learningPathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoors3Room() {
		return doors3RoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChests3Room() {
		return chests3RoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptedLearningGameActivity() {
		return adaptedLearningGameActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptedLearningGameActivity_Dungeon() {
		return (EReference) adaptedLearningGameActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFOneCompletion() {
		return mtqfOneCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFOneCompletion_Targets() {
		return (EAttribute) mtqfOneCompletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTLevel() {
		return mtLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevel_BuildTableSetup() {
		return (EAttribute) mtLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevel_ResultPositionSetup() {
		return (EAttribute) mtLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevel_MinInterval() {
		return (EAttribute) mtLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevel_MaxInterval() {
		return (EAttribute) mtLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionsEntanglement() {
		return dimensionsEntanglementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionsEntanglement_Semanticrelations() {
		return (EReference) dimensionsEntanglementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticRelation() {
		return semanticRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom2SubObjectiveCompliance() {
		return room2SubObjectiveComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom2SubObjectiveCompliance_RoomType() {
		return (EAttribute) room2SubObjectiveComplianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom2SubObjectiveCompliance_SubObjType() {
		return (EAttribute) room2SubObjectiveComplianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrerequisite() {
		return prerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_SuccessPercentage() {
		return (EAttribute) prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_Prerequisite() {
		return (EReference) prerequisiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTTableBuilding() {
		return mtTableBuildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTTableBuilding_Value() {
		return (EAttribute) mtTableBuildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTResultPosition() {
		return mtResultPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTResultPosition_Value() {
		return (EAttribute) mtResultPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTLevelParam() {
		return mtLevelParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevelParam_MaxInterval() {
		return (EAttribute) mtLevelParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTLevelParam_MinInterval() {
		return (EAttribute) mtLevelParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTLevelParam_BuildTableSetup() {
		return (EReference) mtLevelParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTLevelParam_ResultPositionSetup() {
		return (EReference) mtLevelParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter2RoomIncompliance() {
		return parameter2RoomIncomplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter2RoomIncompliance_RoomType() {
		return (EAttribute) parameter2RoomIncomplianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter2RoomIncompliance_Parameter() {
		return (EReference) parameter2RoomIncomplianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelations2Parameter() {
		return relations2ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelations2Parameter_Value1() {
		return (EAttribute) relations2ParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamE2RoomCompliance() {
		return paramE2RoomComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameMode() {
		return gameModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomType() {
		return roomTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameElementType() {
		return gameElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTableBuild() {
		return tableBuildEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultPosition() {
		return resultPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetElement() {
		return targetElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubObjectiveType() {
		return subObjectiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorMetamodelsFactory getGeneratorMetamodelsFactory() {
		return (GeneratorMetamodelsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_CHOICES);

		resultValidityDeterminationEClass = createEClass(RESULT_VALIDITY_DETERMINATION);
		createEAttribute(resultValidityDeterminationEClass, RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE);

		setOfFactsEClass = createEClass(SET_OF_FACTS);
		createEReference(setOfFactsEClass, SET_OF_FACTS__FACTS);
		createEAttribute(setOfFactsEClass, SET_OF_FACTS__NAME);

		problemResolutionEClass = createEClass(PROBLEM_RESOLUTION);
		createEAttribute(problemResolutionEClass, PROBLEM_RESOLUTION__NEW_ATTRIBUTE);

		exitRoomEClass = createEClass(EXIT_ROOM);
		createEAttribute(exitRoomEClass, EXIT_ROOM__TYPE);

		qfTwoCompletionEClass = createEClass(QF_TWO_COMPLETION);
		createEAttribute(qfTwoCompletionEClass, QF_TWO_COMPLETION__NEW_ATTRIBUTE);

		currentProgressionEClass = createEClass(CURRENT_PROGRESSION);
		createEReference(currentProgressionEClass, CURRENT_PROGRESSION__LEARNINGOBJECTIVE);
		createEReference(currentProgressionEClass, CURRENT_PROGRESSION__LEVEL);

		dungeonEClass = createEClass(DUNGEON);
		createEAttribute(dungeonEClass, DUNGEON__MODE);
		createEReference(dungeonEClass, DUNGEON__ROOMS);
		createEReference(dungeonEClass, DUNGEON__ENTRY);
		createEAttribute(dungeonEClass, DUNGEON__NUMBER_OF_ROOMS);
		createEReference(dungeonEClass, DUNGEON__GAMINGOBJECTIVE);

		iParameterEClass = createEClass(IPARAMETER);

		inputEClass = createEClass(INPUT);

		questionRoomEClass = createEClass(QUESTION_ROOM);

		learningPathEClass = createEClass(LEARNING_PATH);
		createEReference(learningPathEClass, LEARNING_PATH__LEARNINGOBJECTIVES);
		createEReference(learningPathEClass, LEARNING_PATH__KNOWLEDGE);
		createEAttribute(learningPathEClass, LEARNING_PATH__NAME);

		abstractFactEClass = createEClass(ABSTRACT_FACT);

		factEClass = createEClass(FACT);
		createEAttribute(factEClass, FACT__DESCRIPTION);

		learnerPlayerEClass = createEClass(LEARNER_PLAYER);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__LEARNINGPROFILE);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__GAMEPROFILE);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__FIRSTNAME);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__LASTNAME);

		highLevelActivityEClass = createEClass(HIGH_LEVEL_ACTIVITY);
		createEReference(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY__LEVEL);
		createEAttribute(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY__NUMBER_OF_QUESTIONS);
		createEReference(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY__GAMINGOBJECTIVE);
		createEAttribute(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY__SELECTED_MODE);
		createEReference(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY__ROOM_TYPES_BY_PERCENTAGE);
		createEOperation(highLevelActivityEClass, HIGH_LEVEL_ACTIVITY___ADD_ROOM_PERCENTAGE__EMAP);

		entryRoomEClass = createEClass(ENTRY_ROOM);
		createEAttribute(entryRoomEClass, ENTRY_ROOM__TYPE);

		doorEClass = createEClass(DOOR);

		qfReconstructionEClass = createEClass(QF_RECONSTRUCTION);
		createEAttribute(qfReconstructionEClass, QF_RECONSTRUCTION__NEW_ATTRIBUTE);

		subObjectiveEClass = createEClass(SUB_OBJECTIVE);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS);
		createEReference(subObjectiveEClass, SUB_OBJECTIVE__RESPONSEMODALITY);

		responseModalityEClass = createEClass(RESPONSE_MODALITY);
		createEAttribute(responseModalityEClass, RESPONSE_MODALITY__RESPONSE_TIME);

		qfOneCompletionEClass = createEClass(QF_ONE_COMPLETION);
		createEAttribute(qfOneCompletionEClass, QF_ONE_COMPLETION__NEW_ATTRIBUTE);

		gameProfileEClass = createEClass(GAME_PROFILE);

		learningProfileEClass = createEClass(LEARNING_PROFILE);
		createEReference(learningProfileEClass, LEARNING_PROFILE__LEARNINGPATH);
		createEReference(learningProfileEClass, LEARNING_PROFILE__CURRENTPROGRESSIONS);

		learningObjectiveEClass = createEClass(LEARNING_OBJECTIVE);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__LEVELS);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__SETOFFACTS);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__ID);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__NAME);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__PREREQUISITES);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__ID);
		createEReference(levelEClass, LEVEL__SUBOBJECTIVES);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__NAME);
		createEReference(knowledgeEClass, KNOWLEDGE__KNOWLEDGEFACTS);

		qfValidityDeterminationEClass = createEClass(QF_VALIDITY_DETERMINATION);
		createEAttribute(qfValidityDeterminationEClass, QF_VALIDITY_DETERMINATION__NEW_ATTRIBUTE);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__CONCRETEELEMENTS);

		gamingObjectiveEClass = createEClass(GAMING_OBJECTIVE);
		createEAttribute(gamingObjectiveEClass, GAMING_OBJECTIVE__NAME);

		gameDomainEClass = createEClass(GAME_DOMAIN);
		createEReference(gameDomainEClass, GAME_DOMAIN__GAMINGOBJECTIVES);
		createEReference(gameDomainEClass, GAME_DOMAIN__GAMEELEMENTS);

		gameElementsEClass = createEClass(GAME_ELEMENTS);
		createEAttribute(gameElementsEClass, GAME_ELEMENTS__NAME);
		createEAttribute(gameElementsEClass, GAME_ELEMENTS__TYPE);

		conceptualElementEClass = createEClass(CONCEPTUAL_ELEMENT);
		createEReference(conceptualElementEClass, CONCEPTUAL_ELEMENT__REPRESENTATIONS);
		createEAttribute(conceptualElementEClass, CONCEPTUAL_ELEMENT__ADAPTABLE);

		concreteElementEClass = createEClass(CONCRETE_ELEMENT);
		createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__IMG_PATH);

		roomTypeToEIntMapEClass = createEClass(ROOM_TYPE_TO_EINT_MAP);
		createEAttribute(roomTypeToEIntMapEClass, ROOM_TYPE_TO_EINT_MAP__KEY);
		createEAttribute(roomTypeToEIntMapEClass, ROOM_TYPE_TO_EINT_MAP__VALUE);

		learningPathsEClass = createEClass(LEARNING_PATHS);
		createEReference(learningPathsEClass, LEARNING_PATHS__LEARNINGPATHS);

		doors3RoomEClass = createEClass(DOORS3_ROOM);

		chests3RoomEClass = createEClass(CHESTS3_ROOM);

		adaptedLearningGameActivityEClass = createEClass(ADAPTED_LEARNING_GAME_ACTIVITY);
		createEReference(adaptedLearningGameActivityEClass, ADAPTED_LEARNING_GAME_ACTIVITY__DUNGEON);

		mtqfOneCompletionEClass = createEClass(MTQF_ONE_COMPLETION);
		createEAttribute(mtqfOneCompletionEClass, MTQF_ONE_COMPLETION__TARGETS);

		mtLevelEClass = createEClass(MT_LEVEL);
		createEAttribute(mtLevelEClass, MT_LEVEL__BUILD_TABLE_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__RESULT_POSITION_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__MIN_INTERVAL);
		createEAttribute(mtLevelEClass, MT_LEVEL__MAX_INTERVAL);

		dimensionsEntanglementEClass = createEClass(DIMENSIONS_ENTANGLEMENT);
		createEReference(dimensionsEntanglementEClass, DIMENSIONS_ENTANGLEMENT__SEMANTICRELATIONS);

		semanticRelationEClass = createEClass(SEMANTIC_RELATION);

		room2SubObjectiveComplianceEClass = createEClass(ROOM2_SUB_OBJECTIVE_COMPLIANCE);
		createEAttribute(room2SubObjectiveComplianceEClass, ROOM2_SUB_OBJECTIVE_COMPLIANCE__ROOM_TYPE);
		createEAttribute(room2SubObjectiveComplianceEClass, ROOM2_SUB_OBJECTIVE_COMPLIANCE__SUB_OBJ_TYPE);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEAttribute(prerequisiteEClass, PREREQUISITE__SUCCESS_PERCENTAGE);
		createEReference(prerequisiteEClass, PREREQUISITE__PREREQUISITE);

		mtTableBuildingEClass = createEClass(MT_TABLE_BUILDING);
		createEAttribute(mtTableBuildingEClass, MT_TABLE_BUILDING__VALUE);

		mtResultPositionEClass = createEClass(MT_RESULT_POSITION);
		createEAttribute(mtResultPositionEClass, MT_RESULT_POSITION__VALUE);

		mtLevelParamEClass = createEClass(MT_LEVEL_PARAM);
		createEAttribute(mtLevelParamEClass, MT_LEVEL_PARAM__MAX_INTERVAL);
		createEAttribute(mtLevelParamEClass, MT_LEVEL_PARAM__MIN_INTERVAL);
		createEReference(mtLevelParamEClass, MT_LEVEL_PARAM__BUILD_TABLE_SETUP);
		createEReference(mtLevelParamEClass, MT_LEVEL_PARAM__RESULT_POSITION_SETUP);

		parameter2RoomIncomplianceEClass = createEClass(PARAMETER2_ROOM_INCOMPLIANCE);
		createEAttribute(parameter2RoomIncomplianceEClass, PARAMETER2_ROOM_INCOMPLIANCE__ROOM_TYPE);
		createEReference(parameter2RoomIncomplianceEClass, PARAMETER2_ROOM_INCOMPLIANCE__PARAMETER);

		relations2ParameterEClass = createEClass(RELATIONS2_PARAMETER);
		createEAttribute(relations2ParameterEClass, RELATIONS2_PARAMETER__VALUE1);

		paramE2RoomComplianceEClass = createEClass(PARAM_E2_ROOM_COMPLIANCE);

		// Create enums
		gameModeEEnum = createEEnum(GAME_MODE);
		roomTypeEEnum = createEEnum(ROOM_TYPE);
		gameElementTypeEEnum = createEEnum(GAME_ELEMENT_TYPE);
		tableBuildEEnum = createEEnum(TABLE_BUILD);
		resultPositionEEnum = createEEnum(RESULT_POSITION);
		targetElementEEnum = createEEnum(TARGET_ELEMENT);
		subObjectiveTypeEEnum = createEEnum(SUB_OBJECTIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter relations2ParameterEClass_P = addETypeParameter(relations2ParameterEClass, "P");

		// Set bounds for type parameters

		// Add supertypes to classes
		multipleChoiceEClass.getESuperTypes().add(this.getResponseModality());
		resultValidityDeterminationEClass.getESuperTypes().add(this.getSubObjective());
		setOfFactsEClass.getESuperTypes().add(this.getAbstractFact());
		problemResolutionEClass.getESuperTypes().add(this.getSubObjective());
		exitRoomEClass.getESuperTypes().add(this.getRoom());
		qfTwoCompletionEClass.getESuperTypes().add(this.getSubObjective());
		inputEClass.getESuperTypes().add(this.getResponseModality());
		questionRoomEClass.getESuperTypes().add(this.getRoom());
		factEClass.getESuperTypes().add(this.getAbstractFact());
		entryRoomEClass.getESuperTypes().add(this.getRoom());
		qfReconstructionEClass.getESuperTypes().add(this.getSubObjective());
		qfOneCompletionEClass.getESuperTypes().add(this.getSubObjective());
		qfValidityDeterminationEClass.getESuperTypes().add(this.getSubObjective());
		conceptualElementEClass.getESuperTypes().add(this.getGameElements());
		concreteElementEClass.getESuperTypes().add(this.getGameElements());
		doors3RoomEClass.getESuperTypes().add(this.getQuestionRoom());
		chests3RoomEClass.getESuperTypes().add(this.getQuestionRoom());
		mtqfOneCompletionEClass.getESuperTypes().add(this.getQFOneCompletion());
		mtLevelEClass.getESuperTypes().add(this.getLevel());
		room2SubObjectiveComplianceEClass.getESuperTypes().add(this.getSemanticRelation());
		mtTableBuildingEClass.getESuperTypes().add(this.getIParameter());
		mtResultPositionEClass.getESuperTypes().add(this.getIParameter());
		mtLevelParamEClass.getESuperTypes().add(this.getLevel());
		parameter2RoomIncomplianceEClass.getESuperTypes().add(this.getSemanticRelation());
		relations2ParameterEClass.getESuperTypes().add(this.getSemanticRelation());
		EGenericType g1 = createEGenericType(this.getRelations2Parameter());
		EGenericType g2 = createEGenericType(ecorePackage.getEEnumLiteral());
		g1.getETypeArguments().add(g2);
		paramE2RoomComplianceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_NbChoices(), ecorePackage.getEInt(), "nbChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resultValidityDeterminationEClass, ResultValidityDetermination.class, "ResultValidityDetermination",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultValidityDetermination_NewAttribute(), this.getSubObjectiveType(), "newAttribute",
				"RES_VALIDITY", 0, 1, ResultValidityDetermination.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setOfFactsEClass, SetOfFacts.class, "SetOfFacts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOfFacts_Facts(), this.getAbstractFact(), null, "facts", null, 1, -1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOfFacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemResolutionEClass, ProblemResolution.class, "ProblemResolution", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProblemResolution_NewAttribute(), this.getSubObjectiveType(), "newAttribute", "PB_RESOLUTION",
				0, 1, ProblemResolution.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitRoomEClass, ExitRoom.class, "ExitRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExitRoom_Type(), this.getRoomType(), "type", "EXIT", 0, 1, ExitRoom.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qfTwoCompletionEClass, QFTwoCompletion.class, "QFTwoCompletion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFTwoCompletion_NewAttribute(), this.getSubObjectiveType(), "newAttribute", "COMPLETION2", 0,
				1, QFTwoCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(currentProgressionEClass, CurrentProgression.class, "CurrentProgression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentProgression_Learningobjective(), this.getLearningObjective(), null,
				"learningobjective", null, 1, 1, CurrentProgression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentProgression_Level(), this.getLevel(), null, "level", null, 1, 1,
				CurrentProgression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dungeonEClass, Dungeon.class, "Dungeon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDungeon_Mode(), this.getGameMode(), "mode", "NONE", 0, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeon_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDungeon_Entry(), this.getEntryRoom(), null, "entry", null, 1, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDungeon_NumberOfRooms(), ecorePackage.getEInt(), "numberOfRooms", null, 0, 1, Dungeon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeon_Gamingobjective(), this.getGamingObjective(), null, "gamingobjective", null, 1, 1,
				Dungeon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iParameterEClass, IParameter.class, "IParameter", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionRoomEClass, QuestionRoom.class, "QuestionRoom", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningPath_Learningobjectives(), this.getLearningObjective(), null, "learningobjectives",
				null, 0, -1, LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Knowledge(), this.getKnowledge(), null, "knowledge", null, 0, 1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFactEClass, AbstractFact.class, "AbstractFact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(factEClass, Fact.class, "Fact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Fact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learnerPlayerEClass, LearnerPlayer.class, "LearnerPlayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearnerPlayer_Learningprofile(), this.getLearningProfile(), null, "learningprofile", null, 1,
				1, LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearnerPlayer_Gameprofile(), this.getGameProfile(), null, "gameprofile", null, 1, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearnerPlayer_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearnerPlayer_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(highLevelActivityEClass, HighLevelActivity.class, "HighLevelActivity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHighLevelActivity_Level(), this.getLevel(), null, "level", null, 1, 1,
				HighLevelActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighLevelActivity_NumberOfQuestions(), ecorePackage.getEInt(), "numberOfQuestions", "10", 0,
				1, HighLevelActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighLevelActivity_Gamingobjective(), this.getGamingObjective(), null, "gamingobjective", null,
				1, 1, HighLevelActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighLevelActivity_SelectedMode(), this.getGameMode(), "selectedMode", "NONE", 0, 1,
				HighLevelActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getHighLevelActivity_RoomTypesByPercentage(), this.getRoomTypeToEIntMap(), null,
				"roomTypesByPercentage", null, 0, -1, HighLevelActivity.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHighLevelActivity__AddRoomPercentage__EMap(), null, "addRoomPercentage", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoomTypeToEIntMap(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entryRoomEClass, EntryRoom.class, "EntryRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryRoom_Type(), this.getRoomType(), "type", "ENTRY", 0, 1, EntryRoom.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qfReconstructionEClass, QFReconstruction.class, "QFReconstruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFReconstruction_NewAttribute(), this.getSubObjectiveType(), "newAttribute", "RECONSTRUCTION",
				0, 1, QFReconstruction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subObjectiveEClass, SubObjective.class, "SubObjective", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubObjective_PercentageOfApparition(), ecorePackage.getEInt(), "percentageOfApparition", null,
				0, 1, SubObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubObjective_PercentageOfValidFacts(), ecorePackage.getEInt(), "percentageOfValidFacts", null,
				0, 1, SubObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubObjective_NbConsecutiveSuccess(), ecorePackage.getEInt(), "nbConsecutiveSuccess", null, 0,
				1, SubObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSubObjective_Responsemodality(), this.getResponseModality(), null, "responsemodality", null,
				1, 1, SubObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseModalityEClass, ResponseModality.class, "ResponseModality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseModality_ResponseTime(), ecorePackage.getEInt(), "responseTime", null, 0, 1,
				ResponseModality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qfOneCompletionEClass, QFOneCompletion.class, "QFOneCompletion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFOneCompletion_NewAttribute(), this.getSubObjectiveType(), "newAttribute", "COMPLETION1", 0,
				1, QFOneCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gameProfileEClass, GameProfile.class, "GameProfile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(learningProfileEClass, LearningProfile.class, "LearningProfile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningProfile_Learningpath(), this.getLearningPath(), null, "learningpath", null, 1, 1,
				LearningProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningProfile_Currentprogressions(), this.getCurrentProgression(), null,
				"currentprogressions", null, 0, -1, LearningProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningObjectiveEClass, LearningObjective.class, "LearningObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningObjective_Levels(), this.getLevel(), null, "levels", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Setoffacts(), this.getSetOfFacts(), null, "setoffacts", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearningObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Subobjectives(), this.getSubObjective(), null, "subobjectives", null, 0, -1,
				Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Knowledge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledge_Knowledgefacts(), this.getAbstractFact(), null, "knowledgefacts", null, 0, -1,
				Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qfValidityDeterminationEClass, QFValidityDetermination.class, "QFValidityDetermination", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFValidityDetermination_NewAttribute(), this.getSubObjectiveType(), "newAttribute",
				"QF_VALIDITY", 0, 1, QFValidityDetermination.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Concreteelements(), this.getConcreteElement(), null, "concreteelements", null, 0, -1,
				Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamingObjectiveEClass, GamingObjective.class, "GamingObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGamingObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, GamingObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameDomainEClass, GameDomain.class, "GameDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameDomain_Gamingobjectives(), this.getGamingObjective(), null, "gamingobjectives", null, 1,
				-1, GameDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDomain_Gameelements(), this.getGameElements(), null, "gameelements", null, 0, -1,
				GameDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameElementsEClass, GameElements.class, "GameElements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameElements_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameElements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameElements_Type(), this.getGameElementType(), "type", "OTHER", 0, 1, GameElements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptualElementEClass, ConceptualElement.class, "ConceptualElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualElement_Representations(), this.getConcreteElement(), null, "representations", null,
				1, -1, ConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConceptualElement_Adaptable(), ecorePackage.getEBoolean(), "adaptable", null, 0, 1,
				ConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(concreteElementEClass, ConcreteElement.class, "ConcreteElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteElement_ImgPath(), ecorePackage.getEString(), "imgPath", null, 0, 1,
				ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roomTypeToEIntMapEClass, Map.Entry.class, "RoomTypeToEIntMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomTypeToEIntMap_Key(), this.getRoomType(), "key", "ENTRY", 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomTypeToEIntMap_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(learningPathsEClass, LearningPaths.class, "LearningPaths", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningPaths_Learningpaths(), this.getLearningPath(), null, "learningpaths", null, 0, -1,
				LearningPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doors3RoomEClass, Doors3Room.class, "Doors3Room", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(chests3RoomEClass, Chests3Room.class, "Chests3Room", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptedLearningGameActivityEClass, AdaptedLearningGameActivity.class, "AdaptedLearningGameActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptedLearningGameActivity_Dungeon(), this.getDungeon(), null, "dungeon", null, 1, 1,
				AdaptedLearningGameActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtqfOneCompletionEClass, MTQFOneCompletion.class, "MTQFOneCompletion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFOneCompletion_Targets(), this.getTargetElement(), "targets", null, 0, -1,
				MTQFOneCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtLevelEClass, MTLevel.class, "MTLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTLevel_BuildTableSetup(), this.getTableBuild(), "buildTableSetup", null, 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_ResultPositionSetup(), this.getResultPosition(), "resultPositionSetup", "RIGHT", 0, 1,
				MTLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_MinInterval(), ecorePackage.getEInt(), "minInterval", "1", 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_MaxInterval(), ecorePackage.getEInt(), "maxInterval", "10", 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionsEntanglementEClass, DimensionsEntanglement.class, "DimensionsEntanglement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionsEntanglement_Semanticrelations(), this.getSemanticRelation(), null,
				"semanticrelations", null, 0, -1, DimensionsEntanglement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticRelationEClass, SemanticRelation.class, "SemanticRelation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(room2SubObjectiveComplianceEClass, Room2SubObjectiveCompliance.class, "Room2SubObjectiveCompliance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom2SubObjectiveCompliance_RoomType(), this.getRoomType(), "roomType", "DOOR", 0, 1,
				Room2SubObjectiveCompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom2SubObjectiveCompliance_SubObjType(), this.getSubObjectiveType(), "subObjType", null, 0,
				1, Room2SubObjectiveCompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_SuccessPercentage(), ecorePackage.getEInt(), "successPercentage", null, 0, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_Prerequisite(), this.getLevel(), null, "prerequisite", null, 1, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtTableBuildingEClass, MTTableBuilding.class, "MTTableBuilding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTTableBuilding_Value(), this.getTableBuild(), "value", null, 0, 1, MTTableBuilding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtResultPositionEClass, MTResultPosition.class, "MTResultPosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTResultPosition_Value(), this.getResultPosition(), "value", "RIGHT", 0, 1,
				MTResultPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtLevelParamEClass, MTLevelParam.class, "MTLevelParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTLevelParam_MaxInterval(), ecorePackage.getEInt(), "maxInterval", "10", 0, 1,
				MTLevelParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevelParam_MinInterval(), ecorePackage.getEInt(), "minInterval", "1", 0, 1,
				MTLevelParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMTLevelParam_BuildTableSetup(), this.getMTTableBuilding(), null, "buildTableSetup", null, 1,
				1, MTLevelParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTLevelParam_ResultPositionSetup(), this.getMTResultPosition(), null, "resultPositionSetup",
				null, 1, 1, MTLevelParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter2RoomIncomplianceEClass, Parameter2RoomIncompliance.class, "Parameter2RoomIncompliance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter2RoomIncompliance_RoomType(), this.getRoomType(), "roomType", "DOOR", 0, 1,
				Parameter2RoomIncompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter2RoomIncompliance_Parameter(), this.getIParameter(), null, "parameter", null, 1, 1,
				Parameter2RoomIncompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relations2ParameterEClass, Relations2Parameter.class, "Relations2Parameter", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(relations2ParameterEClass_P);
		initEAttribute(getRelations2Parameter_Value1(), g1, "value1", null, 0, 1, Relations2Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramE2RoomComplianceEClass, ParamE2RoomCompliance.class, "ParamE2RoomCompliance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(gameModeEEnum, GameMode.class, "GameMode");
		addEEnumLiteral(gameModeEEnum, GameMode.LINEAR);
		addEEnumLiteral(gameModeEEnum, GameMode.LABIRINTHINE);
		addEEnumLiteral(gameModeEEnum, GameMode.RAMDOM);
		addEEnumLiteral(gameModeEEnum, GameMode.NONE);

		initEEnum(roomTypeEEnum, RoomType.class, "RoomType");
		addEEnumLiteral(roomTypeEEnum, RoomType.ENTRY);
		addEEnumLiteral(roomTypeEEnum, RoomType.EXIT);
		addEEnumLiteral(roomTypeEEnum, RoomType.DOOR);
		addEEnumLiteral(roomTypeEEnum, RoomType.CHEST);

		initEEnum(gameElementTypeEEnum, GameElementType.class, "GameElementType");
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.CONTENT);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.RULE);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.AESTHETIC);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.OTHER);

		initEEnum(tableBuildEEnum, TableBuild.class, "TableBuild");
		addEEnumLiteral(tableBuildEEnum, TableBuild.TABLE_OPERAND);
		addEEnumLiteral(tableBuildEEnum, TableBuild.OPERAND_TABLE);
		addEEnumLiteral(tableBuildEEnum, TableBuild.MIX);

		initEEnum(resultPositionEEnum, ResultPosition.class, "ResultPosition");
		addEEnumLiteral(resultPositionEEnum, ResultPosition.LEFT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.RIGHT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.MIX);

		initEEnum(targetElementEEnum, TargetElement.class, "TargetElement");
		addEEnumLiteral(targetElementEEnum, TargetElement.RESULT);
		addEEnumLiteral(targetElementEEnum, TargetElement.TABLE);
		addEEnumLiteral(targetElementEEnum, TargetElement.OPERAND);

		initEEnum(subObjectiveTypeEEnum, SubObjectiveType.class, "SubObjectiveType");
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.COMPLETION1);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.COMPLETION2);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.RECONSTRUCTION);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.QF_VALIDITY);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.RES_VALIDITY);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.PB_RESOLUTION);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorMetamodelsPackageImpl
