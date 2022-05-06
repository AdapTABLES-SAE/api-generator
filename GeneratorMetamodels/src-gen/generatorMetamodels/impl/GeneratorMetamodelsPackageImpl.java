/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.AbstractFact;
import generatorMetamodels.BossRoom;
import generatorMetamodels.ConceptualElement;
import generatorMetamodels.ConcreteElement;
import generatorMetamodels.CurrentProgression;
import generatorMetamodels.Door;
import generatorMetamodels.Dungeon;
import generatorMetamodels.EntryRoom;
import generatorMetamodels.ExitRoom;
import generatorMetamodels.Fact;
import generatorMetamodels.FactValidityVerification;
import generatorMetamodels.GameDomain;
import generatorMetamodels.GameElementType;
import generatorMetamodels.GameElements;
import generatorMetamodels.GameMode;
import generatorMetamodels.GameProfile;
import generatorMetamodels.GamingObjective;
import generatorMetamodels.GeneratorMetamodelsFactory;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;
import generatorMetamodels.Input;
import generatorMetamodels.Knowledge;
import generatorMetamodels.LearnerPlayer;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.LearningPath;
import generatorMetamodels.LearningProfile;
import generatorMetamodels.Level;
import generatorMetamodels.MultipleChoice;
import generatorMetamodels.MultipleCompletion;
import generatorMetamodels.ProblemResolution;
import generatorMetamodels.QuestionRoom;
import generatorMetamodels.Reconstruction;
import generatorMetamodels.ResponseModality;
import generatorMetamodels.ResultVerification;
import generatorMetamodels.Room;
import generatorMetamodels.RoomType;
import generatorMetamodels.SetOfFacts;
import generatorMetamodels.Settings;
import generatorMetamodels.SimpleCompletion;
import generatorMetamodels.SimpleQuestionRoom;
import generatorMetamodels.SubObjective;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass resultVerificationEClass = null;

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
	private EClass multipleCompletionEClass = null;

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
	private EClass settingsEClass = null;

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
	private EClass simpleQuestionRoomEClass = null;

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
	private EClass bossRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconstructionEClass = null;

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
	private EClass simpleCompletionEClass = null;

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
	private EClass factValidityVerificationEClass = null;

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
	public EClass getResultVerification() {
		return resultVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultVerification_CheckIsRight() {
		return (EAttribute) resultVerificationEClass.getEStructuralFeatures().get(0);
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
	public EClass getMultipleCompletion() {
		return multipleCompletionEClass;
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
	public EClass getSettings() {
		return settingsEClass;
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
	public EReference getLearningPath_Subobjectives() {
		return (EReference) learningPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Knowledge() {
		return (EReference) learningPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningPath_Name() {
		return (EAttribute) learningPathEClass.getEStructuralFeatures().get(3);
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
	public EClass getSimpleQuestionRoom() {
		return simpleQuestionRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleQuestionRoom_Type() {
		return (EAttribute) simpleQuestionRoomEClass.getEStructuralFeatures().get(0);
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
	public EClass getBossRoom() {
		return bossRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBossRoom_Type() {
		return (EAttribute) bossRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconstruction() {
		return reconstructionEClass;
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
	public EAttribute getSubObjective_Name() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_PercentageOfApparition() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_PercentageOfValidFacts() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubObjective_NbConsecutiveSuccess() {
		return (EAttribute) subObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjective_Responsemodality() {
		return (EReference) subObjectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjective_Settings() {
		return (EReference) subObjectiveEClass.getEStructuralFeatures().get(5);
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
	public EClass getSimpleCompletion() {
		return simpleCompletionEClass;
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
	public EReference getLearningObjective_Prerequisites() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Setoffacts() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_ID() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_Name() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(4);
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
	public EReference getLevel_Subobjectives() {
		return (EReference) levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevel_ID() {
		return (EAttribute) levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevel_Settings() {
		return (EReference) levelEClass.getEStructuralFeatures().get(2);
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
	public EClass getFactValidityVerification() {
		return factValidityVerificationEClass;
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

		resultVerificationEClass = createEClass(RESULT_VERIFICATION);
		createEAttribute(resultVerificationEClass, RESULT_VERIFICATION__CHECK_IS_RIGHT);

		setOfFactsEClass = createEClass(SET_OF_FACTS);
		createEReference(setOfFactsEClass, SET_OF_FACTS__FACTS);
		createEAttribute(setOfFactsEClass, SET_OF_FACTS__NAME);

		problemResolutionEClass = createEClass(PROBLEM_RESOLUTION);

		exitRoomEClass = createEClass(EXIT_ROOM);
		createEAttribute(exitRoomEClass, EXIT_ROOM__TYPE);

		multipleCompletionEClass = createEClass(MULTIPLE_COMPLETION);

		currentProgressionEClass = createEClass(CURRENT_PROGRESSION);
		createEReference(currentProgressionEClass, CURRENT_PROGRESSION__LEARNINGOBJECTIVE);
		createEReference(currentProgressionEClass, CURRENT_PROGRESSION__LEVEL);

		dungeonEClass = createEClass(DUNGEON);
		createEAttribute(dungeonEClass, DUNGEON__MODE);
		createEReference(dungeonEClass, DUNGEON__ROOMS);
		createEReference(dungeonEClass, DUNGEON__ENTRY);
		createEAttribute(dungeonEClass, DUNGEON__NUMBER_OF_ROOMS);
		createEReference(dungeonEClass, DUNGEON__GAMINGOBJECTIVE);

		settingsEClass = createEClass(SETTINGS);

		inputEClass = createEClass(INPUT);

		questionRoomEClass = createEClass(QUESTION_ROOM);

		learningPathEClass = createEClass(LEARNING_PATH);
		createEReference(learningPathEClass, LEARNING_PATH__LEARNINGOBJECTIVES);
		createEReference(learningPathEClass, LEARNING_PATH__SUBOBJECTIVES);
		createEReference(learningPathEClass, LEARNING_PATH__KNOWLEDGE);
		createEAttribute(learningPathEClass, LEARNING_PATH__NAME);

		abstractFactEClass = createEClass(ABSTRACT_FACT);

		simpleQuestionRoomEClass = createEClass(SIMPLE_QUESTION_ROOM);
		createEAttribute(simpleQuestionRoomEClass, SIMPLE_QUESTION_ROOM__TYPE);

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

		bossRoomEClass = createEClass(BOSS_ROOM);
		createEAttribute(bossRoomEClass, BOSS_ROOM__TYPE);

		reconstructionEClass = createEClass(RECONSTRUCTION);

		subObjectiveEClass = createEClass(SUB_OBJECTIVE);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__NAME);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS);
		createEReference(subObjectiveEClass, SUB_OBJECTIVE__RESPONSEMODALITY);
		createEReference(subObjectiveEClass, SUB_OBJECTIVE__SETTINGS);

		responseModalityEClass = createEClass(RESPONSE_MODALITY);
		createEAttribute(responseModalityEClass, RESPONSE_MODALITY__RESPONSE_TIME);

		simpleCompletionEClass = createEClass(SIMPLE_COMPLETION);

		gameProfileEClass = createEClass(GAME_PROFILE);

		learningProfileEClass = createEClass(LEARNING_PROFILE);
		createEReference(learningProfileEClass, LEARNING_PROFILE__LEARNINGPATH);
		createEReference(learningProfileEClass, LEARNING_PROFILE__CURRENTPROGRESSIONS);

		learningObjectiveEClass = createEClass(LEARNING_OBJECTIVE);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__LEVELS);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__PREREQUISITES);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__SETOFFACTS);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__ID);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__NAME);

		levelEClass = createEClass(LEVEL);
		createEReference(levelEClass, LEVEL__SUBOBJECTIVES);
		createEAttribute(levelEClass, LEVEL__ID);
		createEReference(levelEClass, LEVEL__SETTINGS);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__NAME);
		createEReference(knowledgeEClass, KNOWLEDGE__KNOWLEDGEFACTS);

		factValidityVerificationEClass = createEClass(FACT_VALIDITY_VERIFICATION);

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

		// Create enums
		gameModeEEnum = createEEnum(GAME_MODE);
		roomTypeEEnum = createEEnum(ROOM_TYPE);
		gameElementTypeEEnum = createEEnum(GAME_ELEMENT_TYPE);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		multipleChoiceEClass.getESuperTypes().add(this.getResponseModality());
		resultVerificationEClass.getESuperTypes().add(this.getSubObjective());
		setOfFactsEClass.getESuperTypes().add(this.getAbstractFact());
		problemResolutionEClass.getESuperTypes().add(this.getSubObjective());
		exitRoomEClass.getESuperTypes().add(this.getRoom());
		multipleCompletionEClass.getESuperTypes().add(this.getSubObjective());
		inputEClass.getESuperTypes().add(this.getResponseModality());
		questionRoomEClass.getESuperTypes().add(this.getRoom());
		simpleQuestionRoomEClass.getESuperTypes().add(this.getQuestionRoom());
		factEClass.getESuperTypes().add(this.getAbstractFact());
		entryRoomEClass.getESuperTypes().add(this.getRoom());
		bossRoomEClass.getESuperTypes().add(this.getQuestionRoom());
		reconstructionEClass.getESuperTypes().add(this.getSubObjective());
		simpleCompletionEClass.getESuperTypes().add(this.getSubObjective());
		factValidityVerificationEClass.getESuperTypes().add(this.getSubObjective());
		conceptualElementEClass.getESuperTypes().add(this.getGameElements());
		concreteElementEClass.getESuperTypes().add(this.getGameElements());

		// Initialize classes, features, and operations; add parameters
		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_NbChoices(), ecorePackage.getEInt(), "nbChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resultVerificationEClass, ResultVerification.class, "ResultVerification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultVerification_CheckIsRight(), ecorePackage.getEBoolean(), "checkIsRight", "true", 0, 1,
				ResultVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(setOfFactsEClass, SetOfFacts.class, "SetOfFacts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOfFacts_Facts(), this.getAbstractFact(), null, "facts", null, 1, -1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOfFacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemResolutionEClass, ProblemResolution.class, "ProblemResolution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitRoomEClass, ExitRoom.class, "ExitRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExitRoom_Type(), this.getRoomType(), "type", "EXIT", 0, 1, ExitRoom.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleCompletionEClass, MultipleCompletion.class, "MultipleCompletion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(settingsEClass, Settings.class, "Settings", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionRoomEClass, QuestionRoom.class, "QuestionRoom", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningPath_Learningobjectives(), this.getLearningObjective(), null, "learningobjectives",
				null, 0, -1, LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Subobjectives(), this.getSubObjective(), null, "subobjectives", null, 0, -1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Knowledge(), this.getKnowledge(), null, "knowledge", null, 0, 1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFactEClass, AbstractFact.class, "AbstractFact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleQuestionRoomEClass, SimpleQuestionRoom.class, "SimpleQuestionRoom", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleQuestionRoom_Type(), this.getRoomType(), "type", "SIMPLE_QUESTION", 0, 1,
				SimpleQuestionRoom.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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

		initEClass(bossRoomEClass, BossRoom.class, "BossRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBossRoom_Type(), this.getRoomType(), "type", "BOSS", 0, 1, BossRoom.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconstructionEClass, Reconstruction.class, "Reconstruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subObjectiveEClass, SubObjective.class, "SubObjective", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getSubObjective_Settings(), this.getSettings(), null, "settings", null, 0, -1,
				SubObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseModalityEClass, ResponseModality.class, "ResponseModality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseModality_ResponseTime(), ecorePackage.getEInt(), "responseTime", null, 0, 1,
				ResponseModality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(simpleCompletionEClass, SimpleCompletion.class, "SimpleCompletion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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
		initEReference(getLearningObjective_Prerequisites(), this.getLevel(), null, "prerequisites", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Setoffacts(), this.getSetOfFacts(), null, "setoffacts", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearningObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevel_Subobjectives(), this.getSubObjective(), null, "subobjectives", null, 0, -1,
				Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Settings(), this.getSettings(), null, "settings", null, 0, -1, Level.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Knowledge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledge_Knowledgefacts(), this.getAbstractFact(), null, "knowledgefacts", null, 0, -1,
				Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factValidityVerificationEClass, FactValidityVerification.class, "FactValidityVerification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		// Initialize enums and add enum literals
		initEEnum(gameModeEEnum, GameMode.class, "GameMode");
		addEEnumLiteral(gameModeEEnum, GameMode.LINEAR);
		addEEnumLiteral(gameModeEEnum, GameMode.LABIRINTHINE);
		addEEnumLiteral(gameModeEEnum, GameMode.RAMDOM);
		addEEnumLiteral(gameModeEEnum, GameMode.NONE);

		initEEnum(roomTypeEEnum, RoomType.class, "RoomType");
		addEEnumLiteral(roomTypeEEnum, RoomType.ENTRY);
		addEEnumLiteral(roomTypeEEnum, RoomType.EXIT);
		addEEnumLiteral(roomTypeEEnum, RoomType.SIMPLE_QUESTION);
		addEEnumLiteral(roomTypeEEnum, RoomType.BOSS);

		initEEnum(gameElementTypeEEnum, GameElementType.class, "GameElementType");
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.CONTENT);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.RULE);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.AESTHETIC);
		addEEnumLiteral(gameElementTypeEEnum, GameElementType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorMetamodelsPackageImpl
