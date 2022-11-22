/**
 */
package generator.impl;

import generator.Abilities;
import generator.Ability;
import generator.AbstractFact;
import generator.ActiveAbility;
import generator.AvatarEquipment;
import generator.BuyableElement;
import generator.CompletionType;
import generator.ComplianceRelations;
import generator.CurrentObjectiveLevel;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.EActiveAbility;
import generator.EPassiveAbility;
import generator.Element;
import generator.ElementPosition;
import generator.ElementType;
import generator.ElementTypes;
import generator.Elements;
import generator.EnterResponse;
import generator.EquipmentEType;
import generator.Fact;
import generator.FactVerificationType;
import generator.GPBricks;
import generator.GameContext;
import generator.GameDescription;
import generator.GameRule;
import generator.Gameplay;
import generator.Gameplay2RoomType;
import generator.Gameplays;
import generator.GenerationContext;
import generator.GeneratorFactory;
import generator.GeneratorPackage;
import generator.InteractionEType;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearnerPlayer;
import generator.LearningDomain;
import generator.LearningObjective;
import generator.LearningPath;
import generator.Level;
import generator.MTCompletionType;
import generator.MTLevel;
import generator.MappingModel;
import generator.Modality2RoomType;
import generator.MultipleChoice;
import generator.Order;
import generator.PassiveAbility;
import generator.Position;
import generator.Prerequisite;
import generator.Progression;
import generator.Question;
import generator.ReconstructionType;
import generator.ResponseModalities;
import generator.ResponseModality;
import generator.ResultPosition;
import generator.ResultVerificationType;
import generator.Room;
import generator.RoomAccess;
import generator.RoomType;
import generator.RoomTypes;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.TableBuild;
import generator.TargetElement;
import generator.Task;
import generator.TaskType;
import generator.TaskType2Gameplay;
import generator.TaskTypes;
import generator.VerifiableElement;
import generator.VerificationType;

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
	private EClass factEClass = null;

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
	private EClass taskEClass = null;

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
	private EClass learningObjectiveEClass = null;

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
	private EClass mtCompletionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconstructionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factVerificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultVerificationTypeEClass = null;

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
	private EClass questionEClass = null;

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
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionETypeEClass = null;

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
	private EClass activeAbilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveAbilityEClass = null;

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
	private EClass gameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buyableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avatarEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsEClass = null;

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
	private EClass elementTypesEClass = null;

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
	private EClass roomTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modality2RoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceRelationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskType2GameplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseModalitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameplay2RoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpBricksEEnum = null;

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
	private EEnum verifiableElementEEnum = null;

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
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePassiveAbilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eActiveAbilityEEnum = null;

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
	public EReference getRoom_Question() {
		return (EReference) roomEClass.getEStructuralFeatures().get(4);
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
	public EReference getGameDescription_Elements() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Gameplays() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Elementtypes() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Abilities() {
		return (EReference) gameDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameDescription_Roomtypes() {
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
	public EReference getRoomType_Positions() {
		return (EReference) roomTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getGameContext_NumberOfRooms() {
		return (EAttribute) gameContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameContext_Mode() {
		return (EAttribute) gameContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Tasktype() {
		return (EReference) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PercentageOfApparition() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_NbConsecutiveSuccess() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PercentageOfValidFacts() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(3);
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
	public EReference getLearningDomain_Tasktypes() {
		return (EReference) learningDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningDomain_Responsemodalities() {
		return (EReference) learningDomainEClass.getEStructuralFeatures().get(2);
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
	public EReference getLearningPath_Learningobjective() {
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
	public EClass getLearningObjective() {
		return learningObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_ID() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObjective_Name() {
		return (EAttribute) learningObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Prerequisites() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Levels() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningObjective_Setoffacts() {
		return (EReference) learningObjectiveEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getPrerequisite_SuccesPercentage() {
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
	public EClass getMTCompletionType() {
		return mtCompletionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCompletionType_Targets() {
		return (EAttribute) mtCompletionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskTypes() {
		return taskTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskTypes_Tasktypes() {
		return (EReference) taskTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletionType() {
		return completionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionType_NbMissingElements() {
		return (EAttribute) completionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionType_FactOrder() {
		return (EAttribute) completionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionType_NaturalLanguage() {
		return (EAttribute) completionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationType() {
		return verificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerificationType_VerifyTrue() {
		return (EAttribute) verificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconstructionType() {
		return reconstructionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconstructionType_NbFalseProposition() {
		return (EAttribute) reconstructionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Name() {
		return (EAttribute) taskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Responsemodalities() {
		return (EReference) taskTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactVerificationType() {
		return factVerificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultVerificationType() {
		return resultVerificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultVerificationType_NbFalseProposition() {
		return (EAttribute) resultVerificationTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getCurrentObjectiveLevel() {
		return currentObjectiveLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentObjectiveLevel_Learningobjective() {
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
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Name() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Position() {
		return (EReference) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_IncompleteFact() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMultipleChoice_NbChoices() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(0);
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
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Name() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionEType() {
		return interactionETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionEType_Abilities() {
		return (EReference) interactionETypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getActiveAbility() {
		return activeAbilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveAbility_Ability() {
		return (EAttribute) activeAbilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveAbility() {
		return passiveAbilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveAbility_Ability() {
		return (EAttribute) passiveAbilityEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getGameplay_Description() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay_Gamerules() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay_Requirement() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameplay__IsAvailable() {
		return gameplayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameRule() {
		return gameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameRule_Type() {
		return (EAttribute) gameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameRule_Ability2activate() {
		return (EAttribute) gameRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameRule_Interactionelementtype() {
		return (EReference) gameRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuyableElement() {
		return buyableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuyableElement_Bought() {
		return (EAttribute) buyableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuyableElement_Activated() {
		return (EAttribute) buyableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Type() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvatarEquipment() {
		return avatarEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElements() {
		return elementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElements_Elements() {
		return (EReference) elementsEClass.getEStructuralFeatures().get(0);
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
	public EClass getElementTypes() {
		return elementTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementTypes_Elementtypes() {
		return (EReference) elementTypesEClass.getEStructuralFeatures().get(0);
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
	public EClass getEquipmentEType() {
		return equipmentETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementPosition() {
		return elementPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementPosition_AutorizedETypes() {
		return (EReference) elementPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_Compliancerelations() {
		return (EReference) mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModality2RoomType() {
		return modality2RoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModality2RoomType_Responsemodality() {
		return (EReference) modality2RoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModality2RoomType_Roomtype() {
		return (EReference) modality2RoomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplianceRelations() {
		return complianceRelationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType2Gameplay() {
		return taskType2GameplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType2Gameplay_Gameplay() {
		return (EReference) taskType2GameplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType2Gameplay_Tasktype() {
		return (EReference) taskType2GameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseModalities() {
		return responseModalitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseModalities_Responsemodalities() {
		return (EReference) responseModalitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameplay2RoomType() {
		return gameplay2RoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay2RoomType_Roomtype() {
		return (EReference) gameplay2RoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay2RoomType_Gameplay() {
		return (EReference) gameplay2RoomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPBricks() {
		return gpBricksEEnum;
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
	public EEnum getVerifiableElement() {
		return verifiableElementEEnum;
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
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEPassiveAbility() {
		return ePassiveAbilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEActiveAbility() {
		return eActiveAbilityEEnum;
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

		factEClass = createEClass(FACT);
		createEAttribute(factEClass, FACT__DESCRIPTION);

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
		createEReference(roomEClass, ROOM__QUESTION);

		gameDescriptionEClass = createEClass(GAME_DESCRIPTION);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ELEMENTS);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__GAMEPLAYS);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ELEMENTTYPES);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ABILITIES);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ROOMTYPES);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEReference(roomTypeEClass, ROOM_TYPE__POSITIONS);
		createEOperation(roomTypeEClass, ROOM_TYPE___GET_DIRECTIONS);

		smallRoomTypeEClass = createEClass(SMALL_ROOM_TYPE);
		createEAttribute(smallRoomTypeEClass, SMALL_ROOM_TYPE__DIRECTIONS);

		largeRoomTypeEClass = createEClass(LARGE_ROOM_TYPE);
		createEAttribute(largeRoomTypeEClass, LARGE_ROOM_TYPE__DIRECTIONS);

		roomAccessEClass = createEClass(ROOM_ACCESS);
		createEAttribute(roomAccessEClass, ROOM_ACCESS__DIRECTION);
		createEReference(roomAccessEClass, ROOM_ACCESS__OTHERROOMACCESS);

		gameContextEClass = createEClass(GAME_CONTEXT);
		createEAttribute(gameContextEClass, GAME_CONTEXT__NUMBER_OF_ROOMS);
		createEAttribute(gameContextEClass, GAME_CONTEXT__MODE);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__TASKTYPE);
		createEAttribute(taskEClass, TASK__PERCENTAGE_OF_APPARITION);
		createEAttribute(taskEClass, TASK__NB_CONSECUTIVE_SUCCESS);
		createEAttribute(taskEClass, TASK__PERCENTAGE_OF_VALID_FACTS);

		learningDomainEClass = createEClass(LEARNING_DOMAIN);
		createEReference(learningDomainEClass, LEARNING_DOMAIN__LEARNINGPATHS);
		createEReference(learningDomainEClass, LEARNING_DOMAIN__TASKTYPES);
		createEReference(learningDomainEClass, LEARNING_DOMAIN__RESPONSEMODALITIES);

		learningPathEClass = createEClass(LEARNING_PATH);
		createEAttribute(learningPathEClass, LEARNING_PATH__NAME);
		createEReference(learningPathEClass, LEARNING_PATH__LEARNINGOBJECTIVE);
		createEReference(learningPathEClass, LEARNING_PATH__KNOWLEDGE);

		learningObjectiveEClass = createEClass(LEARNING_OBJECTIVE);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__ID);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__NAME);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__PREREQUISITES);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__LEVELS);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__SETOFFACTS);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEAttribute(prerequisiteEClass, PREREQUISITE__SUCCES_PERCENTAGE);
		createEReference(prerequisiteEClass, PREREQUISITE__REQUIRED_LEVEL);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__ID);
		createEReference(levelEClass, LEVEL__TASKS);

		mtLevelEClass = createEClass(MT_LEVEL);
		createEAttribute(mtLevelEClass, MT_LEVEL__BUILD_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__RESULT_POSITION_SETUP);
		createEAttribute(mtLevelEClass, MT_LEVEL__MIN_INTERVAL);
		createEAttribute(mtLevelEClass, MT_LEVEL__MAX_INTERVAL);

		mtCompletionTypeEClass = createEClass(MT_COMPLETION_TYPE);
		createEAttribute(mtCompletionTypeEClass, MT_COMPLETION_TYPE__TARGETS);

		taskTypesEClass = createEClass(TASK_TYPES);
		createEReference(taskTypesEClass, TASK_TYPES__TASKTYPES);

		completionTypeEClass = createEClass(COMPLETION_TYPE);
		createEAttribute(completionTypeEClass, COMPLETION_TYPE__NB_MISSING_ELEMENTS);
		createEAttribute(completionTypeEClass, COMPLETION_TYPE__FACT_ORDER);
		createEAttribute(completionTypeEClass, COMPLETION_TYPE__NATURAL_LANGUAGE);

		verificationTypeEClass = createEClass(VERIFICATION_TYPE);
		createEAttribute(verificationTypeEClass, VERIFICATION_TYPE__VERIFY_TRUE);

		reconstructionTypeEClass = createEClass(RECONSTRUCTION_TYPE);
		createEAttribute(reconstructionTypeEClass, RECONSTRUCTION_TYPE__NB_FALSE_PROPOSITION);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
		createEReference(taskTypeEClass, TASK_TYPE__RESPONSEMODALITIES);

		factVerificationTypeEClass = createEClass(FACT_VERIFICATION_TYPE);

		resultVerificationTypeEClass = createEClass(RESULT_VERIFICATION_TYPE);
		createEAttribute(resultVerificationTypeEClass, RESULT_VERIFICATION_TYPE__NB_FALSE_PROPOSITION);

		generationContextEClass = createEClass(GENERATION_CONTEXT);
		createEReference(generationContextEClass, GENERATION_CONTEXT__GAMECONTEXT);
		createEReference(generationContextEClass, GENERATION_CONTEXT__LEARNERPLAYER);

		learnerPlayerEClass = createEClass(LEARNER_PLAYER);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__PROGRESSION);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__NAME);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__LEARNINGPATH);

		progressionEClass = createEClass(PROGRESSION);
		createEReference(progressionEClass, PROGRESSION__CURRENTOBJECTIVELEVELS);

		currentObjectiveLevelEClass = createEClass(CURRENT_OBJECTIVE_LEVEL);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__LEARNINGOBJECTIVE);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__ACHIEVED);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__LEVEL);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__NAME);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__POSITION);
		createEAttribute(questionEClass, QUESTION__INCOMPLETE_FACT);

		responseModalityEClass = createEClass(RESPONSE_MODALITY);

		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_CHOICES);

		enterResponseEClass = createEClass(ENTER_RESPONSE);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);

		interactionETypeEClass = createEClass(INTERACTION_ETYPE);
		createEReference(interactionETypeEClass, INTERACTION_ETYPE__ABILITIES);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__NAME);

		activeAbilityEClass = createEClass(ACTIVE_ABILITY);
		createEAttribute(activeAbilityEClass, ACTIVE_ABILITY__ABILITY);

		passiveAbilityEClass = createEClass(PASSIVE_ABILITY);
		createEAttribute(passiveAbilityEClass, PASSIVE_ABILITY__ABILITY);

		gameplayEClass = createEClass(GAMEPLAY);
		createEAttribute(gameplayEClass, GAMEPLAY__DESCRIPTION);
		createEReference(gameplayEClass, GAMEPLAY__GAMERULES);
		createEReference(gameplayEClass, GAMEPLAY__REQUIREMENT);
		createEOperation(gameplayEClass, GAMEPLAY___IS_AVAILABLE);

		gameRuleEClass = createEClass(GAME_RULE);
		createEAttribute(gameRuleEClass, GAME_RULE__TYPE);
		createEAttribute(gameRuleEClass, GAME_RULE__ABILITY2ACTIVATE);
		createEReference(gameRuleEClass, GAME_RULE__INTERACTIONELEMENTTYPE);

		buyableElementEClass = createEClass(BUYABLE_ELEMENT);
		createEAttribute(buyableElementEClass, BUYABLE_ELEMENT__BOUGHT);
		createEAttribute(buyableElementEClass, BUYABLE_ELEMENT__ACTIVATED);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__TYPE);

		avatarEquipmentEClass = createEClass(AVATAR_EQUIPMENT);

		elementsEClass = createEClass(ELEMENTS);
		createEReference(elementsEClass, ELEMENTS__ELEMENTS);

		gameplaysEClass = createEClass(GAMEPLAYS);
		createEReference(gameplaysEClass, GAMEPLAYS__GAMEPLAYS);

		elementTypesEClass = createEClass(ELEMENT_TYPES);
		createEReference(elementTypesEClass, ELEMENT_TYPES__ELEMENTTYPES);

		abilitiesEClass = createEClass(ABILITIES);
		createEReference(abilitiesEClass, ABILITIES__ABILITIES);

		roomTypesEClass = createEClass(ROOM_TYPES);
		createEReference(roomTypesEClass, ROOM_TYPES__ROOMTYPES);

		equipmentETypeEClass = createEClass(EQUIPMENT_ETYPE);

		elementPositionEClass = createEClass(ELEMENT_POSITION);
		createEReference(elementPositionEClass, ELEMENT_POSITION__AUTORIZED_ETYPES);

		mappingModelEClass = createEClass(MAPPING_MODEL);
		createEReference(mappingModelEClass, MAPPING_MODEL__COMPLIANCERELATIONS);

		modality2RoomTypeEClass = createEClass(MODALITY2_ROOM_TYPE);
		createEReference(modality2RoomTypeEClass, MODALITY2_ROOM_TYPE__RESPONSEMODALITY);
		createEReference(modality2RoomTypeEClass, MODALITY2_ROOM_TYPE__ROOMTYPE);

		complianceRelationsEClass = createEClass(COMPLIANCE_RELATIONS);

		taskType2GameplayEClass = createEClass(TASK_TYPE2_GAMEPLAY);
		createEReference(taskType2GameplayEClass, TASK_TYPE2_GAMEPLAY__GAMEPLAY);
		createEReference(taskType2GameplayEClass, TASK_TYPE2_GAMEPLAY__TASKTYPE);

		responseModalitiesEClass = createEClass(RESPONSE_MODALITIES);
		createEReference(responseModalitiesEClass, RESPONSE_MODALITIES__RESPONSEMODALITIES);

		gameplay2RoomTypeEClass = createEClass(GAMEPLAY2_ROOM_TYPE);
		createEReference(gameplay2RoomTypeEClass, GAMEPLAY2_ROOM_TYPE__ROOMTYPE);
		createEReference(gameplay2RoomTypeEClass, GAMEPLAY2_ROOM_TYPE__GAMEPLAY);

		// Create enums
		gpBricksEEnum = createEEnum(GP_BRICKS);
		directionsEEnum = createEEnum(DIRECTIONS);
		dungeonModeEEnum = createEEnum(DUNGEON_MODE);
		verifiableElementEEnum = createEEnum(VERIFIABLE_ELEMENT);
		tableBuildEEnum = createEEnum(TABLE_BUILD);
		resultPositionEEnum = createEEnum(RESULT_POSITION);
		targetElementEEnum = createEEnum(TARGET_ELEMENT);
		orderEEnum = createEEnum(ORDER);
		ePassiveAbilityEEnum = createEEnum(EPASSIVE_ABILITY);
		eActiveAbilityEEnum = createEEnum(EACTIVE_ABILITY);
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
		setOfFactsEClass.getESuperTypes().add(this.getAbstractFact());
		factEClass.getESuperTypes().add(this.getAbstractFact());
		smallRoomTypeEClass.getESuperTypes().add(this.getRoomType());
		largeRoomTypeEClass.getESuperTypes().add(this.getRoomType());
		mtLevelEClass.getESuperTypes().add(this.getLevel());
		mtCompletionTypeEClass.getESuperTypes().add(this.getCompletionType());
		completionTypeEClass.getESuperTypes().add(this.getTaskType());
		verificationTypeEClass.getESuperTypes().add(this.getTaskType());
		reconstructionTypeEClass.getESuperTypes().add(this.getTaskType());
		factVerificationTypeEClass.getESuperTypes().add(this.getVerificationType());
		resultVerificationTypeEClass.getESuperTypes().add(this.getVerificationType());
		multipleChoiceEClass.getESuperTypes().add(this.getResponseModality());
		enterResponseEClass.getESuperTypes().add(this.getResponseModality());
		interactionETypeEClass.getESuperTypes().add(this.getElementType());
		activeAbilityEClass.getESuperTypes().add(this.getAbility());
		passiveAbilityEClass.getESuperTypes().add(this.getAbility());
		buyableElementEClass.getESuperTypes().add(this.getElement());
		avatarEquipmentEClass.getESuperTypes().add(this.getBuyableElement());
		equipmentETypeEClass.getESuperTypes().add(this.getElementType());
		elementPositionEClass.getESuperTypes().add(this.getPosition());
		modality2RoomTypeEClass.getESuperTypes().add(this.getComplianceRelations());
		taskType2GameplayEClass.getESuperTypes().add(this.getComplianceRelations());
		gameplay2RoomTypeEClass.getESuperTypes().add(this.getComplianceRelations());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractFactEClass, AbstractFact.class, "AbstractFact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOfFactsEClass, SetOfFacts.class, "SetOfFacts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOfFacts_Facts(), this.getAbstractFact(), null, "facts", null, 1, -1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOfFacts_Name(), ecorePackage.getEString(), "name", null, 0, 1, SetOfFacts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factEClass, Fact.class, "Fact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Fact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Knowledge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledge_Knowledgefacts(), this.getAbstractFact(), null, "knowledgefacts", null, 0, -1,
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
		initEReference(getDungeon_Learningobjective(), this.getLearningObjective(), null, "learningobjective", null, 1,
				1, Dungeon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
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
		initEReference(getRoom_Question(), this.getQuestion(), null, "question", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gameDescriptionEClass, GameDescription.class, "GameDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameDescription_Elements(), this.getElements(), null, "elements", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Gameplays(), this.getGameplays(), null, "gameplays", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Elementtypes(), this.getElementTypes(), null, "elementtypes", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Abilities(), this.getAbilities(), null, "abilities", null, 0, -1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDescription_Roomtypes(), this.getRoomTypes(), null, "roomtypes", null, 0, 1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoomType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_Positions(), this.getPosition(), null, "positions", null, 0, -1, RoomType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getGameContext_NumberOfRooms(), ecorePackage.getEInt(), "numberOfRooms", null, 0, 1,
				GameContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameContext_Mode(), this.getDungeonMode(), "mode", null, 0, 1, GameContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Tasktype(), this.getTaskType(), null, "tasktype", null, 1, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_PercentageOfApparition(), ecorePackage.getEInt(), "percentageOfApparition", null, 0, 1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_NbConsecutiveSuccess(), ecorePackage.getEInt(), "nbConsecutiveSuccess", null, 0, 1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_PercentageOfValidFacts(), ecorePackage.getEInt(), "percentageOfValidFacts", "0", 0, 1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(learningDomainEClass, LearningDomain.class, "LearningDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningDomain_Learningpaths(), this.getLearningPath(), null, "learningpaths", null, 0, -1,
				LearningDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningDomain_Tasktypes(), this.getTaskTypes(), null, "tasktypes", null, 0, 1,
				LearningDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningDomain_Responsemodalities(), this.getResponseModalities(), null, "responsemodalities",
				null, 0, 1, LearningDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Learningobjective(), this.getLearningObjective(), null, "learningobjective",
				null, 0, -1, LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Knowledge(), this.getKnowledge(), null, "knowledge", null, 1, 1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningObjectiveEClass, LearningObjective.class, "LearningObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningObjective_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearningObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Levels(), this.getLevel(), null, "levels", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Setoffacts(), this.getSetOfFacts(), null, "setoffacts", null, 1, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_SuccesPercentage(), ecorePackage.getEInt(), "succesPercentage", null, 0, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_RequiredLevel(), this.getLevel(), null, "requiredLevel", null, 1, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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

		initEClass(mtCompletionTypeEClass, MTCompletionType.class, "MTCompletionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTCompletionType_Targets(), this.getTargetElement(), "targets", null, 1, -1,
				MTCompletionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(taskTypesEClass, TaskTypes.class, "TaskTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskTypes_Tasktypes(), this.getTaskType(), null, "tasktypes", null, 0, -1, TaskTypes.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completionTypeEClass, CompletionType.class, "CompletionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletionType_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", null, 0, 1,
				CompletionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionType_FactOrder(), this.getOrder(), "factOrder", "MIX", 0, 1, CompletionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionType_NaturalLanguage(), ecorePackage.getEBoolean(), "naturalLanguage", null, 0, 1,
				CompletionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(verificationTypeEClass, VerificationType.class, "VerificationType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerificationType_VerifyTrue(), ecorePackage.getEBoolean(), "verifyTrue", "true", 0, 1,
				VerificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reconstructionTypeEClass, ReconstructionType.class, "ReconstructionType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconstructionType_NbFalseProposition(), ecorePackage.getEInt(), "nbFalseProposition", null,
				0, 1, ReconstructionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskType_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Responsemodalities(), this.getResponseModality(), null, "responsemodalities", null,
				0, 2, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factVerificationTypeEClass, FactVerificationType.class, "FactVerificationType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultVerificationTypeEClass, ResultVerificationType.class, "ResultVerificationType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultVerificationType_NbFalseProposition(), ecorePackage.getEInt(), "nbFalseProposition",
				null, 0, 1, ResultVerificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(progressionEClass, Progression.class, "Progression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgression_Currentobjectivelevels(), this.getCurrentObjectiveLevel(), null,
				"currentobjectivelevels", null, 0, -1, Progression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentObjectiveLevelEClass, CurrentObjectiveLevel.class, "CurrentObjectiveLevel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentObjectiveLevel_Learningobjective(), this.getLearningObjective(), null,
				"learningobjective", null, 1, 1, CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentObjectiveLevel_Achieved(), ecorePackage.getEBoolean(), "achieved", null, 0, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentObjectiveLevel_Level(), this.getLevel(), null, "level", null, 1, 1,
				CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_Position(), this.getPosition(), null, "position", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_IncompleteFact(), ecorePackage.getEString(), "incompleteFact", null, 0, 1,
				Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseModalityEClass, ResponseModality.class, "ResponseModality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_NbChoices(), ecorePackage.getEInt(), "nbChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enterResponseEClass, EnterResponse.class, "EnterResponse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionETypeEClass, InteractionEType.class, "InteractionEType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionEType_Abilities(), this.getAbility(), null, "abilities", null, 0, -1,
				InteractionEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ability.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeAbilityEClass, ActiveAbility.class, "ActiveAbility", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveAbility_Ability(), this.getEActiveAbility(), "ability", null, 0, 1, ActiveAbility.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passiveAbilityEClass, PassiveAbility.class, "PassiveAbility", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveAbility_Ability(), this.getEPassiveAbility(), "ability", null, 0, 1,
				PassiveAbility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gameplayEClass, Gameplay.class, "Gameplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameplay_Description(), ecorePackage.getEString(), "description", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay_Gamerules(), this.getGameRule(), null, "gamerules", null, 1, -1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay_Requirement(), this.getAvatarEquipment(), null, "requirement", null, 0, 1,
				Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGameplay__IsAvailable(), ecorePackage.getEBoolean(), "isAvailable", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(gameRuleEClass, GameRule.class, "GameRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameRule_Type(), this.getGPBricks(), "type", "MOVE", 0, 1, GameRule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameRule_Ability2activate(), this.getEActiveAbility(), "ability2activate", null, 0, 1,
				GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGameRule_Interactionelementtype(), this.getInteractionEType(), null, "interactionelementtype",
				null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buyableElementEClass, BuyableElement.class, "BuyableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuyableElement_Bought(), ecorePackage.getEBoolean(), "bought", null, 0, 1,
				BuyableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuyableElement_Activated(), ecorePackage.getEBoolean(), "activated", null, 0, 1,
				BuyableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Type(), this.getElementType(), null, "type", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(avatarEquipmentEClass, AvatarEquipment.class, "AvatarEquipment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementsEClass, Elements.class, "Elements", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElements_Elements(), this.getElement(), null, "elements", null, 0, -1, Elements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameplaysEClass, Gameplays.class, "Gameplays", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameplays_Gameplays(), this.getGameplay(), null, "gameplays", null, 1, -1, Gameplays.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypesEClass, ElementTypes.class, "ElementTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementTypes_Elementtypes(), this.getElementType(), null, "elementtypes", null, 0, -1,
				ElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilitiesEClass, Abilities.class, "Abilities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbilities_Abilities(), this.getAbility(), null, "abilities", null, 0, -1, Abilities.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomTypesEClass, RoomTypes.class, "RoomTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypes_Roomtypes(), this.getRoomType(), null, "roomtypes", null, 1, -1, RoomTypes.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentETypeEClass, EquipmentEType.class, "EquipmentEType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementPositionEClass, ElementPosition.class, "ElementPosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementPosition_AutorizedETypes(), this.getInteractionEType(), null, "autorizedETypes", null,
				0, -1, ElementPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingModel_Compliancerelations(), this.getComplianceRelations(), null,
				"compliancerelations", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modality2RoomTypeEClass, Modality2RoomType.class, "Modality2RoomType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModality2RoomType_Responsemodality(), this.getResponseModality(), null, "responsemodality",
				null, 1, 1, Modality2RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModality2RoomType_Roomtype(), this.getRoomType(), null, "roomtype", null, 1, -1,
				Modality2RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceRelationsEClass, ComplianceRelations.class, "ComplianceRelations", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskType2GameplayEClass, TaskType2Gameplay.class, "TaskType2Gameplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskType2Gameplay_Gameplay(), this.getGameplay(), null, "gameplay", null, 1, -1,
				TaskType2Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType2Gameplay_Tasktype(), this.getTaskType(), null, "tasktype", null, 1, 1,
				TaskType2Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseModalitiesEClass, ResponseModalities.class, "ResponseModalities", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseModalities_Responsemodalities(), this.getResponseModality(), null,
				"responsemodalities", null, 0, -1, ResponseModalities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameplay2RoomTypeEClass, Gameplay2RoomType.class, "Gameplay2RoomType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameplay2RoomType_Roomtype(), this.getRoomType(), null, "roomtype", null, 1, 1,
				Gameplay2RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay2RoomType_Gameplay(), this.getGameplay(), null, "gameplay", null, 1, -1,
				Gameplay2RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gpBricksEEnum, GPBricks.class, "GPBricks");
		addEEnumLiteral(gpBricksEEnum, GPBricks.SELECT);
		addEEnumLiteral(gpBricksEEnum, GPBricks.MOVE);
		addEEnumLiteral(gpBricksEEnum, GPBricks.AVOID);
		addEEnumLiteral(gpBricksEEnum, GPBricks.DESTROY);
		addEEnumLiteral(gpBricksEEnum, GPBricks.MANAGE);
		addEEnumLiteral(gpBricksEEnum, GPBricks.WRITE);

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

		initEEnum(verifiableElementEEnum, VerifiableElement.class, "VerifiableElement");
		addEEnumLiteral(verifiableElementEEnum, VerifiableElement.FULL_FACTS);
		addEEnumLiteral(verifiableElementEEnum, VerifiableElement.RESULTS);

		initEEnum(tableBuildEEnum, TableBuild.class, "TableBuild");
		addEEnumLiteral(tableBuildEEnum, TableBuild.TABLE_OPERAND);
		addEEnumLiteral(tableBuildEEnum, TableBuild.OPERAND_TABLE);
		addEEnumLiteral(tableBuildEEnum, TableBuild.MIX);

		initEEnum(resultPositionEEnum, ResultPosition.class, "ResultPosition");
		addEEnumLiteral(resultPositionEEnum, ResultPosition.RIGHT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.LEFT);
		addEEnumLiteral(resultPositionEEnum, ResultPosition.MIX);

		initEEnum(targetElementEEnum, TargetElement.class, "TargetElement");
		addEEnumLiteral(targetElementEEnum, TargetElement.RESULT);
		addEEnumLiteral(targetElementEEnum, TargetElement.TABLE);
		addEEnumLiteral(targetElementEEnum, TargetElement.OPERAND);

		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.ASCENDING);
		addEEnumLiteral(orderEEnum, Order.DESCENDING);
		addEEnumLiteral(orderEEnum, Order.MIX);

		initEEnum(ePassiveAbilityEEnum, EPassiveAbility.class, "EPassiveAbility");
		addEEnumLiteral(ePassiveAbilityEEnum, EPassiveAbility.DETECT);
		addEEnumLiteral(ePassiveAbilityEEnum, EPassiveAbility.KILL);

		initEEnum(eActiveAbilityEEnum, EActiveAbility.class, "EActiveAbility");
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.PORTABLE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.PUSHABLE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.KILLABLE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.BREAKABLE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.PULLABLE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.NONE);
		addEEnumLiteral(eActiveAbilityEEnum, EActiveAbility.OPENABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
