/**
 */
package generator.impl;

import generator.AComponent;
import generator.APosition;
import generator.ATask;
import generator.AValue;
import generator.Abilities;
import generator.Ability;
import generator.AbstractFact;
import generator.Completion1Task;
import generator.Completion2Task;
import generator.CompletionCriteria;
import generator.Component;
import generator.Correctness;
import generator.CorrectnessValue;
import generator.CurrentGameLevel;
import generator.CurrentObjectiveLevel;
import generator.Directions;
import generator.Display;
import generator.Dungeon;
import generator.DungeonMode;
import generator.ECorrectness;
import generator.EModality;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.ETaskType;
import generator.ElementSize;
import generator.ElementType;
import generator.EnterResponse;
import generator.EntrySoluceParam;
import generator.Equipment;
import generator.Equipments;
import generator.ExpectedAnswer;
import generator.GPCategory;
import generator.GPElementType;
import generator.GPElementsTypes;
import generator.GameContext;
import generator.GameDescription;
import generator.GameElementTypes;
import generator.Gameplay;
import generator.Gameplays;
import generator.GenerationContext;
import generator.GeneratorFactory;
import generator.GeneratorPackage;
import generator.IdentificationTask;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearnerPlayer;
import generator.LearningDomain;
import generator.LearningPath;
import generator.Level;
import generator.LevelsDifficultyProgress;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTFact;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTQFCompletion1;
import generator.MTQFCompletion2;
import generator.MTQFIdentification;
import generator.MTQFMembership;
import generator.MTQFRebuild;
import generator.MTRecontruction;
import generator.MTResultFact;
import generator.MembershipIDTask;
import generator.MultipleChoice;
import generator.Objective;
import generator.Parameter;
import generator.Position;
import generator.PositionedElement;
import generator.PositionedStructureElement;
import generator.Prerequisite;
import generator.Priority;
import generator.Progression;
import generator.PropositionParam;
import generator.Quantity;
import generator.QuestionParam;
import generator.QuestionableFact;
import generator.QuestionableFactResult;
import generator.QuestionedFact;
import generator.ReconstructionTask;
import generator.ResponseModality;
import generator.ResultPosition;
import generator.Results;
import generator.ResultsByTask;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.RoomTypes;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.StatementType;
import generator.Structure;
import generator.StructurePosition;
import generator.StructureType;
import generator.TableBuild;
import generator.Value;
import generator.WantedAnswersParam;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorPackageImpl extends EPackageImpl implements GeneratorPackage {
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
	private EClass setOfFactsEClass = null;

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
	private EClass dungeonEClass = null;

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
	private EClass gameDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallRoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeRoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningDomainEClass = null;

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
	private EClass objectiveEClass = null;

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
	private EClass levelEClass = null;

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
	private EClass mtCompletion1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationContextEClass = null;

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
	private EClass progressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentObjectiveLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

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
	private EClass multipleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completion1TaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completion2TaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconstructionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipIDTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtCompletion2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtRecontructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsByTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtResultFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionableFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfCompletion1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfCompletion2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfRebuildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtqfMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionedFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelsDifficultyProgressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentGameLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameElementTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpElementsTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameplaysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionableFactResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structurePositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wantedAnswersParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctnessValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedStructureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correctnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entrySoluceParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dungeonModeEEnum = null;

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
	private EEnum eSingleTargetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTaskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eModalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSeveralTargetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCorrectnessEEnum = null;

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
	 * @see generator.GeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorPackageImpl() {
		super(eNS_URI, GeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorPackage init() {
		if (isInited)
			return (GeneratorPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeneratorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeneratorPackageImpl theGeneratorPackage = registeredGeneratorPackage instanceof GeneratorPackageImpl
				? (GeneratorPackageImpl) registeredGeneratorPackage
				: new GeneratorPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorPackage.eNS_URI, theGeneratorPackage);
		return theGeneratorPackage;
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
	public EClass getDungeon() {
		return dungeonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Rooms() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDungeon_Mode() {
		return (EAttribute) dungeonEClass.getEStructuralFeatures().get(1);
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
	public EReference getDungeon_Level() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Learningobjective() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getRoom_X() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Y() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Roomaccess() {
		return (EReference) roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Roomtype() {
		return (EReference) roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_QuestionedFacts() {
		return (EReference) roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Task() {
		return (EReference) roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_PositionedElement() {
		return (EReference) roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Gameplay() {
		return (EReference) roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameDescription() {
		return gameDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Roomtypes() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_LevelsDifficultyProgress() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Gameplays() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Elements() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Abilities() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute) roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_ElementPositions() {
		return (EReference) roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_StructurePositions() {
		return (EReference) roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__GetDirections() {
		return roomTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallRoomType() {
		return smallRoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallRoomType_Directions() {
		return (EAttribute) smallRoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeRoomType() {
		return largeRoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeRoomType_Directions() {
		return (EAttribute) largeRoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomAccess() {
		return roomAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomAccess_Direction() {
		return (EAttribute) roomAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomAccess_Otherroomaccess() {
		return (EReference) roomAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameContext() {
		return gameContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameContext_Mode() {
		return (EAttribute) gameContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningDomain() {
		return learningDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningDomain_Learningpaths() {
		return (EReference) learningDomainEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getLearningPath_Name() {
		return (EAttribute) learningPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Objectives() {
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
	public EAttribute getLearningPath_ID() {
		return (EAttribute) learningPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_ID() {
		return (EAttribute) objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_Name() {
		return (EAttribute) objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_Prerequisites() {
		return (EReference) objectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_Levels() {
		return (EReference) objectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_Setoffacts() {
		return (EReference) objectiveEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getPrerequisite_SuccesPercent() {
		return (EAttribute) prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_RequiredLevel() {
		return (EReference) prerequisiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_EncountersPercent() {
		return (EAttribute) prerequisiteEClass.getEStructuralFeatures().get(2);
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
	public EReference getLevel_Tasks() {
		return (EReference) levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevel_CompletionCriteria() {
		return (EReference) levelEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMTLevel_BuildSetup() {
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
	public EClass getMTCompletion1() {
		return mtCompletion1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCompletion1_Targets() {
		return (EAttribute) mtCompletion1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationContext() {
		return generationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerationContext_Gamecontext() {
		return (EReference) generationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerationContext_Learnerplayer() {
		return (EReference) generationContextEClass.getEStructuralFeatures().get(1);
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
	public EReference getLearnerPlayer_Progression() {
		return (EReference) learnerPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearnerPlayer_Name() {
		return (EAttribute) learnerPlayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearnerPlayer_Learningpath() {
		return (EReference) learnerPlayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearnerPlayer_ID() {
		return (EAttribute) learnerPlayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgression() {
		return progressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgression_Currentobjectivelevels() {
		return (EReference) progressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgression_CurrentGameLevel() {
		return (EReference) progressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentObjectiveLevel() {
		return currentObjectiveLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentObjectiveLevel_Objective() {
		return (EReference) currentObjectiveLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentObjectiveLevel_Achieved() {
		return (EAttribute) currentObjectiveLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentObjectiveLevel_Level() {
		return (EReference) currentObjectiveLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentObjectiveLevel_Results() {
		return (EReference) currentObjectiveLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentObjectiveLevel_EncountersPercent() {
		return (EAttribute) currentObjectiveLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentObjectiveLevel_SucessPercent() {
		return (EAttribute) currentObjectiveLevelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
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
	public EClass getMultipleChoice() {
		return multipleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_Type() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_NbChoices() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_NbBadChoices() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterResponse() {
		return enterResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterResponse_Type() {
		return (EAttribute) enterResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypes() {
		return roomTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypes_Roomtypes() {
		return (EReference) roomTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATask() {
		return aTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATask_PercentOfApparition() {
		return (EAttribute) aTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATask_NbConsecutiveSuccess() {
		return (EAttribute) aTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATask_ResponseModality() {
		return (EReference) aTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATask_ID() {
		return (EAttribute) aTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATask_MaxTime() {
		return (EAttribute) aTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATask_NbFacts() {
		return (EAttribute) aTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getATask__GetType() {
		return aTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getATask__ValidationOnLearnerAction() {
		return aTaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletion1Task() {
		return completion1TaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletion1Task_Type() {
		return (EAttribute) completion1TaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletion1Task_CheckLearnerAction() {
		return (EAttribute) completion1TaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletion2Task() {
		return completion2TaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletion2Task_Type() {
		return (EAttribute) completion2TaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletion2Task_CheckLearnerAction() {
		return (EAttribute) completion2TaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconstructionTask() {
		return reconstructionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconstructionTask_Type() {
		return (EAttribute) reconstructionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconstructionTask_CheckLearnerAction() {
		return (EAttribute) reconstructionTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationTask() {
		return identificationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationTask_Type() {
		return (EAttribute) identificationTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationTask_CheckLearnerAction() {
		return (EAttribute) identificationTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembershipIDTask() {
		return membershipIDTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembershipIDTask_Type() {
		return (EAttribute) membershipIDTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembershipIDTask_CheckIsTrue() {
		return (EAttribute) membershipIDTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembershipIDTask_CheckLearnerAction() {
		return (EAttribute) membershipIDTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTCompletion2() {
		return mtCompletion2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCompletion2_Targets() {
		return (EAttribute) mtCompletion2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTRecontruction() {
		return mtRecontructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTIdentification() {
		return mtIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTIdentification_Target() {
		return (EAttribute) mtIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTMembership() {
		return mtMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResults() {
		return resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Resultsbytask() {
		return (EReference) resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsByTask() {
		return resultsByTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsByTask_Task() {
		return (EReference) resultsByTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsByTask_QuestionableFacts() {
		return (EReference) resultsByTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultsByTask_SucessPercent() {
		return (EAttribute) resultsByTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultsByTask_EncountersPercent() {
		return (EAttribute) resultsByTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTFact() {
		return mtFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTFact_Table() {
		return (EAttribute) mtFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTFact_Op() {
		return (EAttribute) mtFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTFact_Res() {
		return (EAttribute) mtFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTResultFact() {
		return mtResultFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTResultFact_Table() {
		return (EAttribute) mtResultFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTResultFact_Res() {
		return (EAttribute) mtResultFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionableFact() {
		return questionableFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFact_Achieved() {
		return (EAttribute) questionableFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFact_WasSelected() {
		return (EAttribute) questionableFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFact_ID() {
		return (EAttribute) questionableFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionableFact_Results() {
		return (EReference) questionableFactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuestionableFact__GetQuestionableFact() {
		return questionableFactEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFCompletion1() {
		return mtqfCompletion1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion1_LeftOperand() {
		return (EAttribute) mtqfCompletion1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion1_RightOperand() {
		return (EAttribute) mtqfCompletion1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion1_Result() {
		return (EAttribute) mtqfCompletion1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion1_Soluce() {
		return (EAttribute) mtqfCompletion1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion1_ResultOnRight() {
		return (EAttribute) mtqfCompletion1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFCompletion2() {
		return mtqfCompletion2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_LeftOperand() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_RightOperand() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_Result() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_SoluceLeft() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_SoluceRight() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_SoluceRes() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFCompletion2_ResultOnRight() {
		return (EAttribute) mtqfCompletion2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFRebuild() {
		return mtqfRebuildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFRebuild_SoluceLeft() {
		return (EAttribute) mtqfRebuildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFRebuild_SoluceRes() {
		return (EAttribute) mtqfRebuildEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFRebuild_ResultOnRight() {
		return (EAttribute) mtqfRebuildEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFRebuild_SoluceRight() {
		return (EAttribute) mtqfRebuildEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFIdentification() {
		return mtqfIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_Result() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_RightOperand() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_LeftOperand() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_Soluce() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_ResultOnRight() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFIdentification_Build() {
		return (EAttribute) mtqfIdentificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTQFMembership() {
		return mtqfMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFMembership_GoodResults() {
		return (EAttribute) mtqfMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTQFMembership_Table() {
		return (EAttribute) mtqfMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionedFact() {
		return questionedFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_Questionablefact() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_Question() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_Propositions() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_Entrys() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_CorrectnessToReach() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionedFact_LearnerValidation() {
		return (EAttribute) questionedFactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletionCriteria() {
		return completionCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionCriteria_SuccesPercent() {
		return (EAttribute) completionCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionCriteria_EncountersPercent() {
		return (EAttribute) completionCriteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelsDifficultyProgress() {
		return levelsDifficultyProgressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelsDifficultyProgress_NbQRoomIncrease() {
		return (EAttribute) levelsDifficultyProgressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelsDifficultyProgress_NbNQRoomIncrease() {
		return (EAttribute) levelsDifficultyProgressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelsDifficultyProgress_InitNbQRoom() {
		return (EAttribute) levelsDifficultyProgressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelsDifficultyProgress_InitNbNQRoom() {
		return (EAttribute) levelsDifficultyProgressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentGameLevel() {
		return currentGameLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentGameLevel_Level() {
		return (EAttribute) currentGameLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameElementTypes() {
		return gameElementTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameElementTypes_Equipments() {
		return (EReference) gameElementTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameElementTypes_GpElements() {
		return (EReference) gameElementTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPElementsTypes() {
		return gpElementsTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPElementsTypes_Elements() {
		return (EReference) gpElementsTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipments() {
		return equipmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipments_Equipments() {
		return (EReference) equipmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_Ability() {
		return (EReference) elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipment_ID() {
		return (EAttribute) equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipment_Bought() {
		return (EAttribute) equipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipment_Activated() {
		return (EAttribute) equipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameplay() {
		return gameplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_Name() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_Category() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay_Components() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_HasIntegratedPropositions() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_OptionalValidator() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameplays() {
		return gameplaysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplays_Gameplays() {
		return (EReference) gameplaysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionableFactResult() {
		return questionableFactResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFactResult_ResponseTime() {
		return (EAttribute) questionableFactResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFactResult_AnswerValid() {
		return (EAttribute) questionableFactResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionableFactResult_GivenAnswers() {
		return (EAttribute) questionableFactResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Name() {
		return (EAttribute) abilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_NumberOfDisplays() {
		return (EAttribute) abilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__IsElementDisplayable() {
		return abilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilities() {
		return abilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbilities_Abilities() {
		return (EReference) abilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPosition() {
		return aPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPosition_Size() {
		return (EAttribute) aPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPosition_RestrictedTo() {
		return (EReference) aPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPosition_ID() {
		return (EAttribute) aPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructurePosition() {
		return structurePositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionedElement() {
		return positionedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_ID() {
		return (EAttribute) positionedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Display() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_ElementType() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_ExpectedAnswer() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Priority() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Fact() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Position() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Correctness() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_Interactive() {
		return (EAttribute) displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAComponent() {
		return aComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAComponent_Priority() {
		return (EReference) aComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Components() {
		return (EReference) structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_StructureType() {
		return (EReference) structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructure_IsPerFact() {
		return (EAttribute) structureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ElementType() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DisplayValue() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_WearChoices() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DefaultCorrectness() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_WearStatement() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_InputEntry() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWantedAnswersParam() {
		return wantedAnswersParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriority() {
		return priorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedAnswer() {
		return expectedAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrectnessValue() {
		return correctnessValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrectnessValue_Value() {
		return (EAttribute) correctnessValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAValue() {
		return aValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionedStructureElement() {
		return positionedStructureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedStructureElement_CreatedPosition() {
		return (EReference) positionedStructureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrectness() {
		return correctnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Value() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionParam() {
		return questionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionParam_Interactive() {
		return (EAttribute) questionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropositionParam() {
		return propositionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropositionParam_State() {
		return (EReference) propositionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Value() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntrySoluceParam() {
		return entrySoluceParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrySoluceParam_State() {
		return (EAttribute) entrySoluceParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureType() {
		return structureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPElementType() {
		return gpElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPElementType_Size() {
		return (EAttribute) gpElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPElementType_ID() {
		return (EAttribute) gpElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPElementType_Type() {
		return (EAttribute) gpElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirections() {
		return directionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDungeonMode() {
		return dungeonModeEEnum;
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
	public EEnum getESingleTarget() {
		return eSingleTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getETaskType() {
		return eTaskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEModality() {
		return eModalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESeveralTarget() {
		return eSeveralTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementSize() {
		return elementSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatementType() {
		return statementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPCategory() {
		return gpCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECorrectness() {
		return eCorrectnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactory getGeneratorFactory() {
		return (GeneratorFactory) getEFactoryInstance();
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
		abstractFactEClass = createEClass(ABSTRACT_FACT);

		setOfFactsEClass = createEClass(SET_OF_FACTS);
		createEReference(setOfFactsEClass, SET_OF_FACTS__FACTS);
		createEAttribute(setOfFactsEClass, SET_OF_FACTS__NAME);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__NAME);
		createEReference(knowledgeEClass, KNOWLEDGE__KNOWLEDGEFACTS);

		dungeonEClass = createEClass(DUNGEON);
		createEReference(dungeonEClass, DUNGEON__ROOMS);
		createEAttribute(dungeonEClass, DUNGEON__MODE);
		createEReference(dungeonEClass, DUNGEON__ENTRY);
		createEReference(dungeonEClass, DUNGEON__LEVEL);
		createEReference(dungeonEClass, DUNGEON__LEARNINGOBJECTIVE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__X);
		createEAttribute(roomEClass, ROOM__Y);
		createEReference(roomEClass, ROOM__ROOMACCESS);
		createEReference(roomEClass, ROOM__ROOMTYPE);
		createEReference(roomEClass, ROOM__QUESTIONED_FACTS);
		createEReference(roomEClass, ROOM__TASK);
		createEReference(roomEClass, ROOM__POSITIONED_ELEMENT);
		createEReference(roomEClass, ROOM__GAMEPLAY);

		gameDescriptionEClass = createEClass(GAME_DESCRIPTION);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ROOMTYPES);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__LEVELS_DIFFICULTY_PROGRESS);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__GAMEPLAYS);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ELEMENTS);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ABILITIES);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEReference(roomTypeEClass, ROOM_TYPE__ELEMENT_POSITIONS);
		createEReference(roomTypeEClass, ROOM_TYPE__STRUCTURE_POSITIONS);
		createEOperation(roomTypeEClass, ROOM_TYPE___GET_DIRECTIONS);

		smallRoomTypeEClass = createEClass(SMALL_ROOM_TYPE);
		createEAttribute(smallRoomTypeEClass, SMALL_ROOM_TYPE__DIRECTIONS);

		largeRoomTypeEClass = createEClass(LARGE_ROOM_TYPE);
		createEAttribute(largeRoomTypeEClass, LARGE_ROOM_TYPE__DIRECTIONS);

		roomAccessEClass = createEClass(ROOM_ACCESS);
		createEAttribute(roomAccessEClass, ROOM_ACCESS__DIRECTION);
		createEReference(roomAccessEClass, ROOM_ACCESS__OTHERROOMACCESS);

		gameContextEClass = createEClass(GAME_CONTEXT);
		createEAttribute(gameContextEClass, GAME_CONTEXT__MODE);

		learningDomainEClass = createEClass(LEARNING_DOMAIN);
		createEReference(learningDomainEClass, LEARNING_DOMAIN__LEARNINGPATHS);

		learningPathEClass = createEClass(LEARNING_PATH);
		createEAttribute(learningPathEClass, LEARNING_PATH__NAME);
		createEReference(learningPathEClass, LEARNING_PATH__OBJECTIVES);
		createEReference(learningPathEClass, LEARNING_PATH__KNOWLEDGE);
		createEAttribute(learningPathEClass, LEARNING_PATH__ID);

		objectiveEClass = createEClass(OBJECTIVE);
		createEAttribute(objectiveEClass, OBJECTIVE__ID);
		createEAttribute(objectiveEClass, OBJECTIVE__NAME);
		createEReference(objectiveEClass, OBJECTIVE__PREREQUISITES);
		createEReference(objectiveEClass, OBJECTIVE__LEVELS);
		createEReference(objectiveEClass, OBJECTIVE__SETOFFACTS);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEAttribute(prerequisiteEClass, PREREQUISITE__SUCCES_PERCENT);
		createEReference(prerequisiteEClass, PREREQUISITE__REQUIRED_LEVEL);
		createEAttribute(prerequisiteEClass, PREREQUISITE__ENCOUNTERS_PERCENT);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__ID);
		createEReference(levelEClass, LEVEL__TASKS);
		createEReference(levelEClass, LEVEL__COMPLETION_CRITERIA);

		mtLevelEClass = createEClass(MT_LEVEL);
		createEAttribute(mtLevelEClass, MT_LEVEL__BUILD_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__RESULT_POSITION_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__MIN_INTERVAL);
		createEAttribute(mtLevelEClass, MT_LEVEL__MAX_INTERVAL);

		mtCompletion1EClass = createEClass(MT_COMPLETION1);
		createEAttribute(mtCompletion1EClass, MT_COMPLETION1__TARGETS);

		generationContextEClass = createEClass(GENERATION_CONTEXT);
		createEReference(generationContextEClass, GENERATION_CONTEXT__GAMECONTEXT);
		createEReference(generationContextEClass, GENERATION_CONTEXT__LEARNERPLAYER);

		learnerPlayerEClass = createEClass(LEARNER_PLAYER);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__PROGRESSION);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__NAME);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__LEARNINGPATH);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__ID);

		progressionEClass = createEClass(PROGRESSION);
		createEReference(progressionEClass, PROGRESSION__CURRENTOBJECTIVELEVELS);
		createEReference(progressionEClass, PROGRESSION__CURRENT_GAME_LEVEL);

		currentObjectiveLevelEClass = createEClass(CURRENT_OBJECTIVE_LEVEL);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__OBJECTIVE);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__ACHIEVED);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__LEVEL);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__RESULTS);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__SUCESS_PERCENT);

		positionEClass = createEClass(POSITION);

		responseModalityEClass = createEClass(RESPONSE_MODALITY);

		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__TYPE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_CHOICES);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_BAD_CHOICES);

		enterResponseEClass = createEClass(ENTER_RESPONSE);
		createEAttribute(enterResponseEClass, ENTER_RESPONSE__TYPE);

		roomTypesEClass = createEClass(ROOM_TYPES);
		createEReference(roomTypesEClass, ROOM_TYPES__ROOMTYPES);

		aTaskEClass = createEClass(ATASK);
		createEAttribute(aTaskEClass, ATASK__PERCENT_OF_APPARITION);
		createEAttribute(aTaskEClass, ATASK__NB_CONSECUTIVE_SUCCESS);
		createEReference(aTaskEClass, ATASK__RESPONSE_MODALITY);
		createEAttribute(aTaskEClass, ATASK__ID);
		createEAttribute(aTaskEClass, ATASK__MAX_TIME);
		createEAttribute(aTaskEClass, ATASK__NB_FACTS);
		createEOperation(aTaskEClass, ATASK___GET_TYPE);
		createEOperation(aTaskEClass, ATASK___VALIDATION_ON_LEARNER_ACTION);

		completion1TaskEClass = createEClass(COMPLETION1_TASK);
		createEAttribute(completion1TaskEClass, COMPLETION1_TASK__TYPE);
		createEAttribute(completion1TaskEClass, COMPLETION1_TASK__CHECK_LEARNER_ACTION);

		completion2TaskEClass = createEClass(COMPLETION2_TASK);
		createEAttribute(completion2TaskEClass, COMPLETION2_TASK__TYPE);
		createEAttribute(completion2TaskEClass, COMPLETION2_TASK__CHECK_LEARNER_ACTION);

		reconstructionTaskEClass = createEClass(RECONSTRUCTION_TASK);
		createEAttribute(reconstructionTaskEClass, RECONSTRUCTION_TASK__TYPE);
		createEAttribute(reconstructionTaskEClass, RECONSTRUCTION_TASK__CHECK_LEARNER_ACTION);

		identificationTaskEClass = createEClass(IDENTIFICATION_TASK);
		createEAttribute(identificationTaskEClass, IDENTIFICATION_TASK__TYPE);
		createEAttribute(identificationTaskEClass, IDENTIFICATION_TASK__CHECK_LEARNER_ACTION);

		membershipIDTaskEClass = createEClass(MEMBERSHIP_ID_TASK);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__TYPE);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__CHECK_IS_TRUE);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION);

		mtCompletion2EClass = createEClass(MT_COMPLETION2);
		createEAttribute(mtCompletion2EClass, MT_COMPLETION2__TARGETS);

		mtRecontructionEClass = createEClass(MT_RECONTRUCTION);

		mtIdentificationEClass = createEClass(MT_IDENTIFICATION);
		createEAttribute(mtIdentificationEClass, MT_IDENTIFICATION__TARGET);

		mtMembershipEClass = createEClass(MT_MEMBERSHIP);

		resultsEClass = createEClass(RESULTS);
		createEReference(resultsEClass, RESULTS__RESULTSBYTASK);

		resultsByTaskEClass = createEClass(RESULTS_BY_TASK);
		createEReference(resultsByTaskEClass, RESULTS_BY_TASK__TASK);
		createEReference(resultsByTaskEClass, RESULTS_BY_TASK__QUESTIONABLE_FACTS);
		createEAttribute(resultsByTaskEClass, RESULTS_BY_TASK__SUCESS_PERCENT);
		createEAttribute(resultsByTaskEClass, RESULTS_BY_TASK__ENCOUNTERS_PERCENT);

		mtFactEClass = createEClass(MT_FACT);
		createEAttribute(mtFactEClass, MT_FACT__TABLE);
		createEAttribute(mtFactEClass, MT_FACT__OP);
		createEAttribute(mtFactEClass, MT_FACT__RES);

		mtResultFactEClass = createEClass(MT_RESULT_FACT);
		createEAttribute(mtResultFactEClass, MT_RESULT_FACT__TABLE);
		createEAttribute(mtResultFactEClass, MT_RESULT_FACT__RES);

		questionableFactEClass = createEClass(QUESTIONABLE_FACT);
		createEAttribute(questionableFactEClass, QUESTIONABLE_FACT__ACHIEVED);
		createEAttribute(questionableFactEClass, QUESTIONABLE_FACT__WAS_SELECTED);
		createEAttribute(questionableFactEClass, QUESTIONABLE_FACT__ID);
		createEReference(questionableFactEClass, QUESTIONABLE_FACT__RESULTS);
		createEOperation(questionableFactEClass, QUESTIONABLE_FACT___GET_QUESTIONABLE_FACT);

		mtqfCompletion1EClass = createEClass(MTQF_COMPLETION1);
		createEAttribute(mtqfCompletion1EClass, MTQF_COMPLETION1__LEFT_OPERAND);
		createEAttribute(mtqfCompletion1EClass, MTQF_COMPLETION1__RIGHT_OPERAND);
		createEAttribute(mtqfCompletion1EClass, MTQF_COMPLETION1__RESULT);
		createEAttribute(mtqfCompletion1EClass, MTQF_COMPLETION1__SOLUCE);
		createEAttribute(mtqfCompletion1EClass, MTQF_COMPLETION1__RESULT_ON_RIGHT);

		mtqfCompletion2EClass = createEClass(MTQF_COMPLETION2);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__LEFT_OPERAND);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__RIGHT_OPERAND);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__RESULT);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__SOLUCE_LEFT);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__SOLUCE_RIGHT);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__SOLUCE_RES);
		createEAttribute(mtqfCompletion2EClass, MTQF_COMPLETION2__RESULT_ON_RIGHT);

		mtqfRebuildEClass = createEClass(MTQF_REBUILD);
		createEAttribute(mtqfRebuildEClass, MTQF_REBUILD__SOLUCE_LEFT);
		createEAttribute(mtqfRebuildEClass, MTQF_REBUILD__SOLUCE_RES);
		createEAttribute(mtqfRebuildEClass, MTQF_REBUILD__RESULT_ON_RIGHT);
		createEAttribute(mtqfRebuildEClass, MTQF_REBUILD__SOLUCE_RIGHT);

		mtqfIdentificationEClass = createEClass(MTQF_IDENTIFICATION);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__RESULT);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__RIGHT_OPERAND);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__LEFT_OPERAND);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__SOLUCE);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__RESULT_ON_RIGHT);
		createEAttribute(mtqfIdentificationEClass, MTQF_IDENTIFICATION__BUILD);

		mtqfMembershipEClass = createEClass(MTQF_MEMBERSHIP);
		createEAttribute(mtqfMembershipEClass, MTQF_MEMBERSHIP__GOOD_RESULTS);
		createEAttribute(mtqfMembershipEClass, MTQF_MEMBERSHIP__TABLE);

		questionedFactEClass = createEClass(QUESTIONED_FACT);
		createEReference(questionedFactEClass, QUESTIONED_FACT__QUESTIONABLEFACT);
		createEReference(questionedFactEClass, QUESTIONED_FACT__QUESTION);
		createEReference(questionedFactEClass, QUESTIONED_FACT__PROPOSITIONS);
		createEReference(questionedFactEClass, QUESTIONED_FACT__ENTRYS);
		createEReference(questionedFactEClass, QUESTIONED_FACT__CORRECTNESS_TO_REACH);
		createEAttribute(questionedFactEClass, QUESTIONED_FACT__LEARNER_VALIDATION);

		completionCriteriaEClass = createEClass(COMPLETION_CRITERIA);
		createEAttribute(completionCriteriaEClass, COMPLETION_CRITERIA__SUCCES_PERCENT);
		createEAttribute(completionCriteriaEClass, COMPLETION_CRITERIA__ENCOUNTERS_PERCENT);

		levelsDifficultyProgressEClass = createEClass(LEVELS_DIFFICULTY_PROGRESS);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM);

		currentGameLevelEClass = createEClass(CURRENT_GAME_LEVEL);
		createEAttribute(currentGameLevelEClass, CURRENT_GAME_LEVEL__LEVEL);

		gameElementTypesEClass = createEClass(GAME_ELEMENT_TYPES);
		createEReference(gameElementTypesEClass, GAME_ELEMENT_TYPES__EQUIPMENTS);
		createEReference(gameElementTypesEClass, GAME_ELEMENT_TYPES__GP_ELEMENTS);

		gpElementsTypesEClass = createEClass(GP_ELEMENTS_TYPES);
		createEReference(gpElementsTypesEClass, GP_ELEMENTS_TYPES__ELEMENTS);

		equipmentsEClass = createEClass(EQUIPMENTS);
		createEReference(equipmentsEClass, EQUIPMENTS__EQUIPMENTS);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEReference(elementTypeEClass, ELEMENT_TYPE__ABILITY);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__ID);
		createEAttribute(equipmentEClass, EQUIPMENT__BOUGHT);
		createEAttribute(equipmentEClass, EQUIPMENT__ACTIVATED);

		gameplayEClass = createEClass(GAMEPLAY);
		createEAttribute(gameplayEClass, GAMEPLAY__NAME);
		createEAttribute(gameplayEClass, GAMEPLAY__CATEGORY);
		createEReference(gameplayEClass, GAMEPLAY__COMPONENTS);
		createEAttribute(gameplayEClass, GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS);
		createEAttribute(gameplayEClass, GAMEPLAY__OPTIONAL_VALIDATOR);

		gameplaysEClass = createEClass(GAMEPLAYS);
		createEReference(gameplaysEClass, GAMEPLAYS__GAMEPLAYS);

		questionableFactResultEClass = createEClass(QUESTIONABLE_FACT_RESULT);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__RESPONSE_TIME);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__ANSWER_VALID);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__NAME);
		createEAttribute(abilityEClass, ABILITY__NUMBER_OF_DISPLAYS);
		createEOperation(abilityEClass, ABILITY___IS_ELEMENT_DISPLAYABLE);

		abilitiesEClass = createEClass(ABILITIES);
		createEReference(abilitiesEClass, ABILITIES__ABILITIES);

		aPositionEClass = createEClass(APOSITION);
		createEAttribute(aPositionEClass, APOSITION__SIZE);
		createEReference(aPositionEClass, APOSITION__RESTRICTED_TO);
		createEAttribute(aPositionEClass, APOSITION__ID);

		structurePositionEClass = createEClass(STRUCTURE_POSITION);

		positionedElementEClass = createEClass(POSITIONED_ELEMENT);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__ID);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__POSITION);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__CORRECTNESS);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__DISPLAY);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__ELEMENT_TYPE);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__EXPECTED_ANSWER);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__PRIORITY);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__FACT);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__VALUE);

		questionParamEClass = createEClass(QUESTION_PARAM);
		createEAttribute(questionParamEClass, QUESTION_PARAM__INTERACTIVE);

		propositionParamEClass = createEClass(PROPOSITION_PARAM);
		createEReference(propositionParamEClass, PROPOSITION_PARAM__STATE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);

		correctnessEClass = createEClass(CORRECTNESS);

		entrySoluceParamEClass = createEClass(ENTRY_SOLUCE_PARAM);
		createEAttribute(entrySoluceParamEClass, ENTRY_SOLUCE_PARAM__STATE);

		structureTypeEClass = createEClass(STRUCTURE_TYPE);

		gpElementTypeEClass = createEClass(GP_ELEMENT_TYPE);
		createEAttribute(gpElementTypeEClass, GP_ELEMENT_TYPE__SIZE);
		createEAttribute(gpElementTypeEClass, GP_ELEMENT_TYPE__ID);
		createEAttribute(gpElementTypeEClass, GP_ELEMENT_TYPE__TYPE);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__INTERACTIVE);

		aComponentEClass = createEClass(ACOMPONENT);
		createEReference(aComponentEClass, ACOMPONENT__PRIORITY);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__COMPONENTS);
		createEReference(structureEClass, STRUCTURE__STRUCTURE_TYPE);
		createEAttribute(structureEClass, STRUCTURE__IS_PER_FACT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__ELEMENT_TYPE);
		createEReference(componentEClass, COMPONENT__DISPLAY_VALUE);
		createEAttribute(componentEClass, COMPONENT__WEAR_CHOICES);
		createEReference(componentEClass, COMPONENT__DEFAULT_CORRECTNESS);
		createEAttribute(componentEClass, COMPONENT__WEAR_STATEMENT);
		createEAttribute(componentEClass, COMPONENT__INPUT_ENTRY);

		quantityEClass = createEClass(QUANTITY);

		wantedAnswersParamEClass = createEClass(WANTED_ANSWERS_PARAM);

		priorityEClass = createEClass(PRIORITY);

		expectedAnswerEClass = createEClass(EXPECTED_ANSWER);

		correctnessValueEClass = createEClass(CORRECTNESS_VALUE);
		createEAttribute(correctnessValueEClass, CORRECTNESS_VALUE__VALUE);

		aValueEClass = createEClass(AVALUE);

		positionedStructureElementEClass = createEClass(POSITIONED_STRUCTURE_ELEMENT);
		createEReference(positionedStructureElementEClass, POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION);

		// Create enums
		directionsEEnum = createEEnum(DIRECTIONS);
		dungeonModeEEnum = createEEnum(DUNGEON_MODE);
		tableBuildEEnum = createEEnum(TABLE_BUILD);
		resultPositionEEnum = createEEnum(RESULT_POSITION);
		eSingleTargetEEnum = createEEnum(ESINGLE_TARGET);
		eTaskTypeEEnum = createEEnum(ETASK_TYPE);
		eModalityEEnum = createEEnum(EMODALITY);
		eSeveralTargetEEnum = createEEnum(ESEVERAL_TARGET);
		elementSizeEEnum = createEEnum(ELEMENT_SIZE);
		statementTypeEEnum = createEEnum(STATEMENT_TYPE);
		gpCategoryEEnum = createEEnum(GP_CATEGORY);
		eCorrectnessEEnum = createEEnum(ECORRECTNESS);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smallRoomTypeEClass.getESuperTypes().add(this.getRoomType());
		largeRoomTypeEClass.getESuperTypes().add(this.getRoomType());
		mtLevelEClass.getESuperTypes().add(this.getLevel());
		mtCompletion1EClass.getESuperTypes().add(this.getCompletion1Task());
		positionEClass.getESuperTypes().add(this.getAPosition());
		multipleChoiceEClass.getESuperTypes().add(this.getResponseModality());
		enterResponseEClass.getESuperTypes().add(this.getResponseModality());
		completion1TaskEClass.getESuperTypes().add(this.getATask());
		completion2TaskEClass.getESuperTypes().add(this.getATask());
		reconstructionTaskEClass.getESuperTypes().add(this.getATask());
		identificationTaskEClass.getESuperTypes().add(this.getATask());
		membershipIDTaskEClass.getESuperTypes().add(this.getATask());
		mtCompletion2EClass.getESuperTypes().add(this.getCompletion2Task());
		mtRecontructionEClass.getESuperTypes().add(this.getReconstructionTask());
		mtIdentificationEClass.getESuperTypes().add(this.getIdentificationTask());
		mtMembershipEClass.getESuperTypes().add(this.getMembershipIDTask());
		mtFactEClass.getESuperTypes().add(this.getAbstractFact());
		mtResultFactEClass.getESuperTypes().add(this.getAbstractFact());
		mtqfCompletion1EClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfCompletion2EClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfRebuildEClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfIdentificationEClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfMembershipEClass.getESuperTypes().add(this.getQuestionableFact());
		elementTypeEClass.getESuperTypes().add(this.getGPElementType());
		structurePositionEClass.getESuperTypes().add(this.getAPosition());
		questionParamEClass.getESuperTypes().add(this.getParameter());
		propositionParamEClass.getESuperTypes().add(this.getParameter());
		valueEClass.getESuperTypes().add(this.getAValue());
		correctnessEClass.getESuperTypes().add(this.getParameter());
		entrySoluceParamEClass.getESuperTypes().add(this.getParameter());
		structureTypeEClass.getESuperTypes().add(this.getGPElementType());
		displayEClass.getESuperTypes().add(this.getParameter());
		structureEClass.getESuperTypes().add(this.getAComponent());
		componentEClass.getESuperTypes().add(this.getAComponent());
		quantityEClass.getESuperTypes().add(this.getParameter());
		wantedAnswersParamEClass.getESuperTypes().add(this.getParameter());
		priorityEClass.getESuperTypes().add(this.getParameter());
		expectedAnswerEClass.getESuperTypes().add(this.getParameter());
		correctnessValueEClass.getESuperTypes().add(this.getAValue());
		positionedStructureElementEClass.getESuperTypes().add(this.getPositionedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractFactEClass, AbstractFact.class, "AbstractFact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOfFactsEClass, SetOfFacts.class, "SetOfFacts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOfFacts_Facts(), this.getAbstractFact(), null, "facts", null, 0, -1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOfFacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Knowledge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledge_Knowledgefacts(), this.getSetOfFacts(), null, "knowledgefacts", null, 0, -1,
				Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dungeonEClass, Dungeon.class, "Dungeon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDungeon_Rooms(), this.getRoom(), null, "rooms", null, 1, -1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDungeon_Mode(), this.getDungeonMode(), "mode", null, 0, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeon_Entry(), this.getRoom(), null, "entry", null, 1, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDungeon_Level(), this.getLevel(), null, "level", null, 1, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDungeon_Learningobjective(), this.getObjective(), null, "learningobjective", null, 1, 1,
				Dungeon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_X(), ecorePackage.getEInt(), "x", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Roomaccess(), this.getRoomAccess(), null, "roomaccess", null, 0, -1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Roomtype(), this.getRoomType(), null, "roomtype", null, 1, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoom_QuestionedFacts(), this.getQuestionedFact(), null, "questionedFacts", null, 0, -1,
				Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Task(), this.getATask(), null, "task", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoom_PositionedElement(), this.getPositionedElement(), null, "positionedElement", null, 0, -1,
				Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Gameplay(), this.getGameplay(), null, "gameplay", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gameDescriptionEClass, GameDescription.class, "GameDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameDescription_Roomtypes(), this.getRoomTypes(), null, "roomtypes", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_LevelsDifficultyProgress(), this.getLevelsDifficultyProgress(), null,
				"levelsDifficultyProgress", null, 1, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Gameplays(), this.getGameplays(), null, "gameplays", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Elements(), this.getGameElementTypes(), null, "elements", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Abilities(), this.getAbilities(), null, "abilities", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoomType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_ElementPositions(), this.getPosition(), null, "elementPositions", null, 0, -1,
				RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_StructurePositions(), this.getStructurePosition(), null, "structurePositions", null,
				0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoomType__GetDirections(), this.getDirections(), "getDirections", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(smallRoomTypeEClass, SmallRoomType.class, "SmallRoomType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmallRoomType_Directions(), this.getDirections(), "directions", null, 1, 4,
				SmallRoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(largeRoomTypeEClass, LargeRoomType.class, "LargeRoomType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLargeRoomType_Directions(), this.getDirections(), "directions", null, 1, 8,
				LargeRoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roomAccessEClass, RoomAccess.class, "RoomAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomAccess_Direction(), this.getDirections(), "direction", null, 0, 1, RoomAccess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomAccess_Otherroomaccess(), this.getRoomAccess(), null, "otherroomaccess", null, 0, 1,
				RoomAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameContextEClass, GameContext.class, "GameContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameContext_Mode(), this.getDungeonMode(), "mode", null, 0, 1, GameContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningDomainEClass, LearningDomain.class, "LearningDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningDomain_Learningpaths(), this.getLearningPath(), null, "learningpaths", null, 0, -1,
				LearningDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Objectives(), this.getObjective(), null, "objectives", null, 0, -1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Knowledge(), this.getKnowledge(), null, "knowledge", null, 1, 1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningPath_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjective_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Objective.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1,
				Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Levels(), this.getLevel(), null, "levels", null, 0, -1, Objective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Setoffacts(), this.getSetOfFacts(), null, "setoffacts", null, 1, -1,
				Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_SuccesPercent(), ecorePackage.getEDouble(), "succesPercent", null, 0, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_RequiredLevel(), this.getLevel(), null, "requiredLevel", null, 1, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_EncountersPercent(), ecorePackage.getEDouble(), "encountersPercent", "100.0", 0,
				1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Tasks(), this.getATask(), null, "tasks", null, 1, -1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLevel_CompletionCriteria(), this.getCompletionCriteria(), null, "completionCriteria", null, 0,
				1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtLevelEClass, MTLevel.class, "MTLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTLevel_BuildSetup(), this.getTableBuild(), "buildSetup", null, 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_ResultPositionSetup(), this.getResultPosition(), "resultPositionSetup", null, 0, 1,
				MTLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_MinInterval(), ecorePackage.getEInt(), "minInterval", "1", 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTLevel_MaxInterval(), ecorePackage.getEInt(), "maxInterval", "10", 0, 1, MTLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtCompletion1EClass, MTCompletion1.class, "MTCompletion1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTCompletion1_Targets(), this.getESingleTarget(), "targets", null, 1, -1, MTCompletion1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationContextEClass, GenerationContext.class, "GenerationContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerationContext_Gamecontext(), this.getGameContext(), null, "gamecontext", null, 1, 1,
				GenerationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerationContext_Learnerplayer(), this.getLearnerPlayer(), null, "learnerplayer", null, 1, 1,
				GenerationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learnerPlayerEClass, LearnerPlayer.class, "LearnerPlayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearnerPlayer_Progression(), this.getProgression(), null, "progression", null, 0, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearnerPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearnerPlayer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearnerPlayer_Learningpath(), this.getLearningPath(), null, "learningpath", null, 1, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearnerPlayer_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearnerPlayer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressionEClass, Progression.class, "Progression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgression_Currentobjectivelevels(), this.getCurrentObjectiveLevel(), null,
				"currentobjectivelevels", null, 0, -1, Progression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgression_CurrentGameLevel(), this.getCurrentGameLevel(), null, "currentGameLevel", null, 0,
				1, Progression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentObjectiveLevelEClass, CurrentObjectiveLevel.class, "CurrentObjectiveLevel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentObjectiveLevel_Objective(), this.getObjective(), null, "objective", null, 1, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentObjectiveLevel_Achieved(), ecorePackage.getEBoolean(), "achieved", "true", 0, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentObjectiveLevel_Level(), this.getLevel(), null, "level", null, 1, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentObjectiveLevel_Results(), this.getResults(), null, "results", null, 0, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentObjectiveLevel_EncountersPercent(), ecorePackage.getEDouble(), "encountersPercent",
				null, 0, 1, CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentObjectiveLevel_SucessPercent(), ecorePackage.getEDouble(), "sucessPercent", null, 0, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseModalityEClass, ResponseModality.class, "ResponseModality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_Type(), this.getEModality(), "type", "CHOICE", 0, 1, MultipleChoice.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_NbChoices(), ecorePackage.getEInt(), "nbChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_NbBadChoices(), ecorePackage.getEInt(), "nbBadChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enterResponseEClass, EnterResponse.class, "EnterResponse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterResponse_Type(), this.getEModality(), "type", "INPUT", 0, 1, EnterResponse.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomTypesEClass, RoomTypes.class, "RoomTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypes_Roomtypes(), this.getRoomType(), null, "roomtypes", null, 1, -1, RoomTypes.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aTaskEClass, ATask.class, "ATask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATask_PercentOfApparition(), ecorePackage.getEInt(), "percentOfApparition", null, 0, 1,
				ATask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getATask_NbConsecutiveSuccess(), ecorePackage.getEInt(), "nbConsecutiveSuccess", null, 0, 1,
				ATask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getATask_ResponseModality(), this.getResponseModality(), null, "responseModality", null, 0, 1,
				ATask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_ID(), theXMLTypePackage.getString(), "ID", null, 0, 1, ATask.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_MaxTime(), ecorePackage.getEDouble(), "maxTime", "20.0", 0, 1, ATask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_NbFacts(), ecorePackage.getEInt(), "nbFacts", "1", 0, 1, ATask.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getATask__GetType(), this.getETaskType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getATask__ValidationOnLearnerAction(), ecorePackage.getEBoolean(), "validationOnLearnerAction",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(completion1TaskEClass, Completion1Task.class, "Completion1Task", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletion1Task_Type(), this.getETaskType(), "type", "COMPLETE1", 0, 1, Completion1Task.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletion1Task_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction", null,
				0, 1, Completion1Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completion2TaskEClass, Completion2Task.class, "Completion2Task", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletion2Task_Type(), this.getETaskType(), "type", "COMPLETE2", 0, 1, Completion2Task.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletion2Task_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"true", 0, 1, Completion2Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconstructionTaskEClass, ReconstructionTask.class, "ReconstructionTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconstructionTask_Type(), this.getETaskType(), "type", "REBUILD", 0, 1,
				ReconstructionTask.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconstructionTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"true", 0, 1, ReconstructionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationTaskEClass, IdentificationTask.class, "IdentificationTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentificationTask_Type(), this.getETaskType(), "type", "IDENTIFY", 0, 1,
				IdentificationTask.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"true", 0, 1, IdentificationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membershipIDTaskEClass, MembershipIDTask.class, "MembershipIDTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembershipIDTask_Type(), this.getETaskType(), "type", "MEMBERSHIP", 0, 1,
				MembershipIDTask.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembershipIDTask_CheckIsTrue(), ecorePackage.getEBoolean(), "checkIsTrue", "true", 0, 1,
				MembershipIDTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembershipIDTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"false", 0, 1, MembershipIDTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtCompletion2EClass, MTCompletion2.class, "MTCompletion2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTCompletion2_Targets(), this.getESeveralTarget(), "targets", null, 2, -1,
				MTCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtRecontructionEClass, MTRecontruction.class, "MTRecontruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtIdentificationEClass, MTIdentification.class, "MTIdentification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTIdentification_Target(), this.getESingleTarget(), "target", "RESULT", 1, 1,
				MTIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtMembershipEClass, MTMembership.class, "MTMembership", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultsEClass, Results.class, "Results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResults_Resultsbytask(), this.getResultsByTask(), null, "resultsbytask", null, 0, -1,
				Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsByTaskEClass, ResultsByTask.class, "ResultsByTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsByTask_Task(), this.getATask(), null, "task", null, 0, 1, ResultsByTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultsByTask_QuestionableFacts(), this.getQuestionableFact(), null, "questionableFacts",
				null, 0, -1, ResultsByTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultsByTask_SucessPercent(), ecorePackage.getEDouble(), "sucessPercent", null, 0, 1,
				ResultsByTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultsByTask_EncountersPercent(), ecorePackage.getEDouble(), "encountersPercent", null, 0, 1,
				ResultsByTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(mtFactEClass, MTFact.class, "MTFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTFact_Table(), ecorePackage.getEInt(), "table", null, 0, 1, MTFact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTFact_Op(), ecorePackage.getEInt(), "op", null, 0, 1, MTFact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTFact_Res(), ecorePackage.getEInt(), "res", null, 0, 1, MTFact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtResultFactEClass, MTResultFact.class, "MTResultFact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTResultFact_Table(), ecorePackage.getEInt(), "table", null, 0, 1, MTResultFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTResultFact_Res(), ecorePackage.getEInt(), "res", null, 0, 1, MTResultFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionableFactEClass, QuestionableFact.class, "QuestionableFact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionableFact_Achieved(), ecorePackage.getEBoolean(), "achieved", "false", 0, 1,
				QuestionableFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionableFact_WasSelected(), ecorePackage.getEBoolean(), "wasSelected", "false", 0, 1,
				QuestionableFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionableFact_ID(), ecorePackage.getEString(), "ID", null, 0, 1, QuestionableFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionableFact_Results(), this.getQuestionableFactResult(), null, "results", null, 0, -1,
				QuestionableFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getQuestionableFact__GetQuestionableFact(), ecorePackage.getEString(), "getQuestionableFact", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(mtqfCompletion1EClass, MTQFCompletion1.class, "MTQFCompletion1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFCompletion1_LeftOperand(), ecorePackage.getEInt(), "leftOperand", null, 0, 1,
				MTQFCompletion1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion1_RightOperand(), ecorePackage.getEInt(), "rightOperand", null, 0, 1,
				MTQFCompletion1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion1_Result(), ecorePackage.getEInt(), "result", null, 0, 1, MTQFCompletion1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion1_Soluce(), ecorePackage.getEInt(), "soluce", null, 0, 1, MTQFCompletion1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion1_ResultOnRight(), theXMLTypePackage.getBoolean(), "resultOnRight", "true", 0,
				1, MTQFCompletion1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtqfCompletion2EClass, MTQFCompletion2.class, "MTQFCompletion2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFCompletion2_LeftOperand(), ecorePackage.getEInt(), "leftOperand", null, 0, 1,
				MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_RightOperand(), ecorePackage.getEInt(), "rightOperand", null, 0, 1,
				MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_Result(), ecorePackage.getEInt(), "result", null, 0, 1, MTQFCompletion2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_SoluceLeft(), ecorePackage.getEInt(), "soluceLeft", null, 0, 1,
				MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_SoluceRight(), ecorePackage.getEInt(), "soluceRight", null, 0, 1,
				MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_SoluceRes(), ecorePackage.getEInt(), "soluceRes", null, 0, 1,
				MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFCompletion2_ResultOnRight(), theXMLTypePackage.getBoolean(), "resultOnRight", "true", 0,
				1, MTQFCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtqfRebuildEClass, MTQFRebuild.class, "MTQFRebuild", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFRebuild_SoluceLeft(), ecorePackage.getEInt(), "soluceLeft", null, 0, 1, MTQFRebuild.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFRebuild_SoluceRes(), ecorePackage.getEInt(), "soluceRes", null, 0, 1, MTQFRebuild.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFRebuild_ResultOnRight(), theXMLTypePackage.getBoolean(), "resultOnRight", "true", 0, 1,
				MTQFRebuild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFRebuild_SoluceRight(), ecorePackage.getEInt(), "soluceRight", null, 0, 1,
				MTQFRebuild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtqfIdentificationEClass, MTQFIdentification.class, "MTQFIdentification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFIdentification_Result(), ecorePackage.getEInt(), "result", null, 0, 1,
				MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFIdentification_RightOperand(), ecorePackage.getEInt(), "rightOperand", null, 0, 1,
				MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFIdentification_LeftOperand(), ecorePackage.getEInt(), "leftOperand", null, 0, 1,
				MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFIdentification_Soluce(), ecorePackage.getEBoolean(), "soluce", null, 0, 1,
				MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFIdentification_ResultOnRight(), theXMLTypePackage.getBoolean(), "resultOnRight", "true",
				0, 1, MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFIdentification_Build(), this.getTableBuild(), "build", null, 0, 1,
				MTQFIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mtqfMembershipEClass, MTQFMembership.class, "MTQFMembership", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTQFMembership_GoodResults(), ecorePackage.getEInt(), "goodResults", null, 1, -1,
				MTQFMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTQFMembership_Table(), ecorePackage.getEInt(), "table", null, 0, 1, MTQFMembership.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionedFactEClass, QuestionedFact.class, "QuestionedFact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionedFact_Questionablefact(), this.getQuestionableFact(), null, "questionablefact", null,
				1, 1, QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionedFact_Question(), this.getQuestionParam(), null, "question", null, 0, 1,
				QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionedFact_Propositions(), this.getPropositionParam(), null, "propositions", null, 0, -1,
				QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionedFact_Entrys(), this.getEntrySoluceParam(), null, "entrys", null, 0, -1,
				QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionedFact_CorrectnessToReach(), this.getWantedAnswersParam(), null, "correctnessToReach",
				null, 0, 1, QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionedFact_LearnerValidation(), ecorePackage.getEBoolean(), "learnerValidation", null, 0,
				1, QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(completionCriteriaEClass, CompletionCriteria.class, "CompletionCriteria", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletionCriteria_SuccesPercent(), ecorePackage.getEDouble(), "succesPercent", "80.0", 0, 1,
				CompletionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionCriteria_EncountersPercent(), ecorePackage.getEDouble(), "encountersPercent",
				"100.0", 0, 1, CompletionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelsDifficultyProgressEClass, LevelsDifficultyProgress.class, "LevelsDifficultyProgress",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelsDifficultyProgress_NbQRoomIncrease(), ecorePackage.getEInt(), "nbQRoomIncrease", "2", 0,
				1, LevelsDifficultyProgress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevelsDifficultyProgress_NbNQRoomIncrease(), ecorePackage.getEInt(), "nbNQRoomIncrease", "1",
				0, 1, LevelsDifficultyProgress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevelsDifficultyProgress_InitNbQRoom(), ecorePackage.getEInt(), "initNbQRoom", "5", 0, 1,
				LevelsDifficultyProgress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevelsDifficultyProgress_InitNbNQRoom(), ecorePackage.getEInt(), "initNbNQRoom", "1", 0, 1,
				LevelsDifficultyProgress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentGameLevelEClass, CurrentGameLevel.class, "CurrentGameLevel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentGameLevel_Level(), ecorePackage.getEInt(), "level", "1", 0, 1, CurrentGameLevel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameElementTypesEClass, GameElementTypes.class, "GameElementTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameElementTypes_Equipments(), this.getEquipments(), null, "equipments", null, 0, 1,
				GameElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameElementTypes_GpElements(), this.getGPElementsTypes(), null, "gpElements", null, 0, 1,
				GameElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpElementsTypesEClass, GPElementsTypes.class, "GPElementsTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPElementsTypes_Elements(), this.getGPElementType(), null, "elements", null, 0, -1,
				GPElementsTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentsEClass, Equipments.class, "Equipments", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipments_Equipments(), this.getEquipment(), null, "equipments", null, 0, -1,
				Equipments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementType_Ability(), this.getAbility(), null, "ability", null, 1, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Equipment.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipment_Bought(), ecorePackage.getEBoolean(), "bought", null, 0, 1, Equipment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipment_Activated(), ecorePackage.getEBoolean(), "activated", null, 0, 1, Equipment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameplayEClass, Gameplay.class, "Gameplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameplay_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gameplay.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_Category(), this.getGPCategory(), "category", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay_Components(), this.getAComponent(), null, "components", null, 0, -1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_HasIntegratedPropositions(), ecorePackage.getEBoolean(), "hasIntegratedPropositions",
				null, 0, 1, Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_OptionalValidator(), ecorePackage.getEBoolean(), "optionalValidator", "false", 0, 1,
				Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gameplaysEClass, Gameplays.class, "Gameplays", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameplays_Gameplays(), this.getGameplay(), null, "gameplays", null, 0, -1, Gameplays.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionableFactResultEClass, QuestionableFactResult.class, "QuestionableFactResult", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionableFactResult_ResponseTime(), ecorePackage.getEInt(), "responseTime", null, 0, 1,
				QuestionableFactResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionableFactResult_AnswerValid(), ecorePackage.getEBoolean(), "answerValid", null, 0, 1,
				QuestionableFactResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionableFactResult_GivenAnswers(), ecorePackage.getEString(), "givenAnswers", null, 0, -1,
				QuestionableFactResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ability.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_NumberOfDisplays(), ecorePackage.getEInt(), "numberOfDisplays", null, 0, 1,
				Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAbility__IsElementDisplayable(), ecorePackage.getEBoolean(), "isElementDisplayable", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(abilitiesEClass, Abilities.class, "Abilities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbilities_Abilities(), this.getAbility(), null, "abilities", null, 0, -1, Abilities.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aPositionEClass, APosition.class, "APosition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPosition_Size(), this.getElementSize(), "size", null, 0, 1, APosition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPosition_RestrictedTo(), this.getAbility(), null, "restrictedTo", null, 0, -1,
				APosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPosition_ID(), ecorePackage.getEString(), "ID", null, 0, 1, APosition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structurePositionEClass, StructurePosition.class, "StructurePosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionedElementEClass, PositionedElement.class, "PositionedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionedElement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, PositionedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Position(), this.getAPosition(), null, "position", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Correctness(), this.getCorrectness(), null, "correctness", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Display(), this.getDisplay(), null, "display", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_ElementType(), this.getGPElementType(), null, "elementType", null, 1, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_ExpectedAnswer(), this.getExpectedAnswer(), null, "expectedAnswer", null, 0,
				1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Priority(), this.getPriority(), null, "priority", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Fact(), this.getQuestionedFact(), null, "fact", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Value(), this.getAValue(), null, "value", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionParamEClass, QuestionParam.class, "QuestionParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionParam_Interactive(), ecorePackage.getEBoolean(), "interactive", null, 0, 1,
				QuestionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(propositionParamEClass, PropositionParam.class, "PropositionParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropositionParam_State(), this.getCorrectness(), null, "state", null, 0, 1,
				PropositionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correctnessEClass, Correctness.class, "Correctness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(entrySoluceParamEClass, EntrySoluceParam.class, "EntrySoluceParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntrySoluceParam_State(), this.getECorrectness(), "state", null, 0, 1, EntrySoluceParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureTypeEClass, StructureType.class, "StructureType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpElementTypeEClass, GPElementType.class, "GPElementType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPElementType_Size(), this.getElementSize(), "size", null, 0, 1, GPElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPElementType_ID(), ecorePackage.getEString(), "ID", null, 0, 1, GPElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPElementType_Type(), ecorePackage.getEString(), "type", "", 0, 1, GPElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplay_Interactive(), ecorePackage.getEBoolean(), "interactive", null, 0, 1, Display.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aComponentEClass, AComponent.class, "AComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAComponent_Priority(), this.getPriority(), null, "priority", null, 0, 1, AComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Components(), this.getAComponent(), null, "components", null, 0, -1,
				Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_StructureType(), this.getStructureType(), null, "structureType", null, 0, 1,
				Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructure_IsPerFact(), ecorePackage.getEBoolean(), "isPerFact", "false", 0, 1,
				Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ElementType(), this.getElementType(), null, "elementType", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DisplayValue(), this.getDisplay(), null, "displayValue", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_WearChoices(), ecorePackage.getEBoolean(), "wearChoices", "false", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DefaultCorrectness(), this.getCorrectness(), null, "defaultCorrectness", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_WearStatement(), ecorePackage.getEBoolean(), "wearStatement", "false", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_InputEntry(), ecorePackage.getEBoolean(), "inputEntry", "false", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(wantedAnswersParamEClass, WantedAnswersParam.class, "WantedAnswersParam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorityEClass, Priority.class, "Priority", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedAnswerEClass, ExpectedAnswer.class, "ExpectedAnswer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctnessValueEClass, CorrectnessValue.class, "CorrectnessValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrectnessValue_Value(), this.getECorrectness(), "value", null, 0, 1, CorrectnessValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aValueEClass, AValue.class, "AValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionedStructureElementEClass, PositionedStructureElement.class, "PositionedStructureElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionedStructureElement_CreatedPosition(), this.getAPosition(), null, "createdPosition",
				null, 0, 1, PositionedStructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionsEEnum, Directions.class, "Directions");
		addEEnumLiteral(directionsEEnum, Directions.SOUTH);
		addEEnumLiteral(directionsEEnum, Directions.EAST);
		addEEnumLiteral(directionsEEnum, Directions.NORTH);
		addEEnumLiteral(directionsEEnum, Directions.WEST);
		addEEnumLiteral(directionsEEnum, Directions.SOUTH_EAST);
		addEEnumLiteral(directionsEEnum, Directions.SOUTH_WEST);
		addEEnumLiteral(directionsEEnum, Directions.NORTH_EAST);
		addEEnumLiteral(directionsEEnum, Directions.NORTH_WEST);
		addEEnumLiteral(directionsEEnum, Directions.EAST_SOUTH);
		addEEnumLiteral(directionsEEnum, Directions.EAST_NORTH);
		addEEnumLiteral(directionsEEnum, Directions.WEST_NORTH);
		addEEnumLiteral(directionsEEnum, Directions.WEST_SOUTH);
		addEEnumLiteral(directionsEEnum, Directions.NONE);

		initEEnum(dungeonModeEEnum, DungeonMode.class, "DungeonMode");
		addEEnumLiteral(dungeonModeEEnum, DungeonMode.LINEAR);
		addEEnumLiteral(dungeonModeEEnum, DungeonMode.LABYRINTHINE);

		initEEnum(tableBuildEEnum, TableBuild.class, "TableBuild");
		addEEnumLiteral(tableBuildEEnum, TableBuild.TABLE_OPERAND);
		addEEnumLiteral(tableBuildEEnum, TableBuild.OPERAND_TABLE);
		addEEnumLiteral(tableBuildEEnum, TableBuild.MIX);

		initEEnum(resultPositionEEnum, ResultPosition.class, "ResultPosition");
		addEEnumLiteral(resultPositionEEnum, ResultPosition.RIGHT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.LEFT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.MIX);

		initEEnum(eSingleTargetEEnum, ESingleTarget.class, "ESingleTarget");
		addEEnumLiteral(eSingleTargetEEnum, ESingleTarget.RESULT);
		addEEnumLiteral(eSingleTargetEEnum, ESingleTarget.TABLE);
		addEEnumLiteral(eSingleTargetEEnum, ESingleTarget.OPERAND);

		initEEnum(eTaskTypeEEnum, ETaskType.class, "ETaskType");
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.COMPLETE1);
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.COMPLETE2);
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.REBUILD);
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.IDENTIFY);
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.MEMBERSHIP);

		initEEnum(eModalityEEnum, EModality.class, "EModality");
		addEEnumLiteral(eModalityEEnum, EModality.CHOICE);
		addEEnumLiteral(eModalityEEnum, EModality.INPUT);

		initEEnum(eSeveralTargetEEnum, ESeveralTarget.class, "ESeveralTarget");
		addEEnumLiteral(eSeveralTargetEEnum, ESeveralTarget.OPERAND_TABLE);
		addEEnumLiteral(eSeveralTargetEEnum, ESeveralTarget.OPERAND_RESULT);
		addEEnumLiteral(eSeveralTargetEEnum, ESeveralTarget.TABLE_RESULT);

		initEEnum(elementSizeEEnum, ElementSize.class, "ElementSize");
		addEEnumLiteral(elementSizeEEnum, ElementSize.SMALL);
		addEEnumLiteral(elementSizeEEnum, ElementSize.MEDIUM);
		addEEnumLiteral(elementSizeEEnum, ElementSize.LARGE);

		initEEnum(statementTypeEEnum, StatementType.class, "StatementType");
		addEEnumLiteral(statementTypeEEnum, StatementType.TEXTUAL);
		addEEnumLiteral(statementTypeEEnum, StatementType.TEXTUAL_INTERACTIVE);
		addEEnumLiteral(statementTypeEEnum, StatementType.GRAPHIC);
		addEEnumLiteral(statementTypeEEnum, StatementType.NONE);
		addEEnumLiteral(statementTypeEEnum, StatementType.TO_FILL_IN);

		initEEnum(gpCategoryEEnum, GPCategory.class, "GPCategory");
		addEEnumLiteral(gpCategoryEEnum, GPCategory.SELECT_UNIQUE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.SELECT_MULTIPLE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.DIRECT_RESPONSE);

		initEEnum(eCorrectnessEEnum, ECorrectness.class, "ECorrectness");
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.CORRECT);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.INCORRECT);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.FACT_CORRECTNESS);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.NOT_FACT_CORRECTNESS);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
