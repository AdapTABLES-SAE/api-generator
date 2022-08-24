/**
 */
package generator.impl;

import generator.AbstractFact;
import generator.AvatarActions;
import generator.ClassicRoom;
import generator.CoreGameRule;
import generator.Directions;
import generator.Dungeon;
import generator.DungeonMode;
import generator.DungeonOLD;
import generator.ElementShape;
import generator.ElementState;
import generator.ElementType;
import generator.Fact;
import generator.Floor;
import generator.GPBricks;
import generator.GameContent;
import generator.GameDescription;
import generator.GameObjective;
import generator.Gameplay;
import generator.GeneratorFactory;
import generator.GeneratorPackage;
import generator.IRoomElement;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearningObjective;
import generator.LearningPath;
import generator.LearningPaths;
import generator.Level;
import generator.Location;
import generator.Pathway;
import generator.PlacedObject;
import generator.Prerequisite;
import generator.ProblemResolution;
import generator.QFOneCompletion;
import generator.QFReconstruction;
import generator.QFTwoCompletion;
import generator.QFValidityDetermination;
import generator.QuestionRoom;
import generator.ResultValidityDetermination;
import generator.RogueliteContext;
import generator.Room;
import generator.RoomAccess;
import generator.RoomOLD;
import generator.RoomPaths;
import generator.RoomType;
import generator.RoomType2;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.State;
import generator.SubObjective;
import generator.SubObjectiveType;

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
	private EClass qfValidityDeterminationEClass = null;

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
	private EClass resultValidityDeterminationEClass = null;

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
	private EClass qfTwoCompletionEClass = null;

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
	private EClass gameContentEClass = null;

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
	private EClass coreGameRuleEClass = null;

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
	private EClass dungeonOLDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomOLDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicRoomEClass = null;

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
	private EClass pathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementStateEClass = null;

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
	private EClass rogueliteContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subObjectiveTypeEEnum = null;

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
	private EEnum avatarActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomPathsEEnum = null;

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
	public EClass getQFValidityDetermination() {
		return qfValidityDeterminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFValidityDetermination_Type() {
		return (EAttribute) qfValidityDeterminationEClass.getEStructuralFeatures().get(0);
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
	public EClass getQFOneCompletion() {
		return qfOneCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFOneCompletion_Type() {
		return (EAttribute) qfOneCompletionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getQFReconstruction_Type() {
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
	public EClass getQFTwoCompletion() {
		return qfTwoCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQFTwoCompletion_Type() {
		return (EAttribute) qfTwoCompletionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getProblemResolution_Type() {
		return (EAttribute) problemResolutionEClass.getEStructuralFeatures().get(0);
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
	public EClass getLearningPath() {
		return learningPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Knowledge() {
		return (EReference) learningPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningPath_Name() {
		return (EAttribute) learningPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningPath_Learningobjectives() {
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
	public EClass getGameContent() {
		return gameContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameContent_Gameplays() {
		return (EReference) gameContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameContent_Elements() {
		return (EReference) gameContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameContent_Gameobjectives() {
		return (EReference) gameContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameContent_Roomtype() {
		return (EReference) gameContentEClass.getEStructuralFeatures().get(3);
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
	public EReference getGameplay_Coregamerules() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_Description() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreGameRule() {
		return coreGameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreGameRule_RuleType() {
		return (EAttribute) coreGameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreGameRule_ActionToDo() {
		return (EAttribute) coreGameRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreGameRule_Element() {
		return (EReference) coreGameRuleEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getElementType_AcceptedActions() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_Shape() {
		return (EReference) elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_State() {
		return (EReference) elementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDungeonOLD() {
		return dungeonOLDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDungeonOLD_NumberOfRooms() {
		return (EAttribute) dungeonOLDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeonOLD_Gameobjective() {
		return (EReference) dungeonOLDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeonOLD_Rooms() {
		return (EReference) dungeonOLDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameObjective() {
		return gameObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameObjective_Description() {
		return (EAttribute) gameObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomOLD() {
		return roomOLDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_South() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_North() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_East() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_West() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_Roomtype() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOLD_InitialState() {
		return (EReference) roomOLDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicRoom() {
		return classicRoomEClass;
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
	public EReference getQuestionRoom_SucessState() {
		return (EReference) questionRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathway() {
		return pathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType2() {
		return roomType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType2_Description() {
		return (EAttribute) roomType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType2_Acceptedfloors() {
		return (EReference) roomType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType2_Paths() {
		return (EAttribute) roomType2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Locations() {
		return (EReference) floorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_Description() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_AcceptedElements() {
		return (EReference) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Maxshape() {
		return (EReference) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Placedobjects() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacedObject() {
		return placedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacedObject_DisplayValue() {
		return (EAttribute) placedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomElement() {
		return iRoomElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementShape() {
		return elementShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementShape_Height() {
		return (EAttribute) elementShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementShape_Width() {
		return (EAttribute) elementShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementState() {
		return elementStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementState_State() {
		return (EAttribute) elementStateEClass.getEStructuralFeatures().get(0);
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
	public EClass getRogueliteContext() {
		return rogueliteContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRogueliteContext_NumberOfRooms() {
		return (EAttribute) rogueliteContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRogueliteContext_Mode() {
		return (EAttribute) rogueliteContextEClass.getEStructuralFeatures().get(1);
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
	public EEnum getGPBricks() {
		return gpBricksEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvatarActions() {
		return avatarActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomPaths() {
		return roomPathsEEnum;
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
		prerequisiteEClass = createEClass(PREREQUISITE);
		createEAttribute(prerequisiteEClass, PREREQUISITE__SUCCESS_PERCENTAGE);
		createEReference(prerequisiteEClass, PREREQUISITE__PREREQUISITE);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__ID);
		createEReference(levelEClass, LEVEL__SUBOBJECTIVES);

		qfValidityDeterminationEClass = createEClass(QF_VALIDITY_DETERMINATION);
		createEAttribute(qfValidityDeterminationEClass, QF_VALIDITY_DETERMINATION__TYPE);

		learningPathsEClass = createEClass(LEARNING_PATHS);
		createEReference(learningPathsEClass, LEARNING_PATHS__LEARNINGPATHS);

		resultValidityDeterminationEClass = createEClass(RESULT_VALIDITY_DETERMINATION);
		createEAttribute(resultValidityDeterminationEClass, RESULT_VALIDITY_DETERMINATION__NEW_ATTRIBUTE);

		qfOneCompletionEClass = createEClass(QF_ONE_COMPLETION);
		createEAttribute(qfOneCompletionEClass, QF_ONE_COMPLETION__TYPE);

		qfReconstructionEClass = createEClass(QF_RECONSTRUCTION);
		createEAttribute(qfReconstructionEClass, QF_RECONSTRUCTION__TYPE);

		subObjectiveEClass = createEClass(SUB_OBJECTIVE);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_APPARITION);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__PERCENTAGE_OF_VALID_FACTS);
		createEAttribute(subObjectiveEClass, SUB_OBJECTIVE__NB_CONSECUTIVE_SUCCESS);

		qfTwoCompletionEClass = createEClass(QF_TWO_COMPLETION);
		createEAttribute(qfTwoCompletionEClass, QF_TWO_COMPLETION__TYPE);

		problemResolutionEClass = createEClass(PROBLEM_RESOLUTION);
		createEAttribute(problemResolutionEClass, PROBLEM_RESOLUTION__TYPE);

		abstractFactEClass = createEClass(ABSTRACT_FACT);

		setOfFactsEClass = createEClass(SET_OF_FACTS);
		createEReference(setOfFactsEClass, SET_OF_FACTS__FACTS);
		createEAttribute(setOfFactsEClass, SET_OF_FACTS__NAME);

		factEClass = createEClass(FACT);
		createEAttribute(factEClass, FACT__DESCRIPTION);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__NAME);
		createEReference(knowledgeEClass, KNOWLEDGE__KNOWLEDGEFACTS);

		learningPathEClass = createEClass(LEARNING_PATH);
		createEReference(learningPathEClass, LEARNING_PATH__KNOWLEDGE);
		createEAttribute(learningPathEClass, LEARNING_PATH__NAME);
		createEReference(learningPathEClass, LEARNING_PATH__LEARNINGOBJECTIVES);

		learningObjectiveEClass = createEClass(LEARNING_OBJECTIVE);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__LEVELS);
		createEReference(learningObjectiveEClass, LEARNING_OBJECTIVE__PREREQUISITES);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__ID);
		createEAttribute(learningObjectiveEClass, LEARNING_OBJECTIVE__NAME);

		gameContentEClass = createEClass(GAME_CONTENT);
		createEReference(gameContentEClass, GAME_CONTENT__GAMEPLAYS);
		createEReference(gameContentEClass, GAME_CONTENT__ELEMENTS);
		createEReference(gameContentEClass, GAME_CONTENT__GAMEOBJECTIVES);
		createEReference(gameContentEClass, GAME_CONTENT__ROOMTYPE);

		gameplayEClass = createEClass(GAMEPLAY);
		createEReference(gameplayEClass, GAMEPLAY__COREGAMERULES);
		createEAttribute(gameplayEClass, GAMEPLAY__DESCRIPTION);

		coreGameRuleEClass = createEClass(CORE_GAME_RULE);
		createEAttribute(coreGameRuleEClass, CORE_GAME_RULE__RULE_TYPE);
		createEAttribute(coreGameRuleEClass, CORE_GAME_RULE__ACTION_TO_DO);
		createEReference(coreGameRuleEClass, CORE_GAME_RULE__ELEMENT);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__ACCEPTED_ACTIONS);
		createEReference(elementTypeEClass, ELEMENT_TYPE__SHAPE);
		createEReference(elementTypeEClass, ELEMENT_TYPE__STATE);

		dungeonOLDEClass = createEClass(DUNGEON_OLD);
		createEAttribute(dungeonOLDEClass, DUNGEON_OLD__NUMBER_OF_ROOMS);
		createEReference(dungeonOLDEClass, DUNGEON_OLD__GAMEOBJECTIVE);
		createEReference(dungeonOLDEClass, DUNGEON_OLD__ROOMS);

		gameObjectiveEClass = createEClass(GAME_OBJECTIVE);
		createEAttribute(gameObjectiveEClass, GAME_OBJECTIVE__DESCRIPTION);

		roomOLDEClass = createEClass(ROOM_OLD);
		createEReference(roomOLDEClass, ROOM_OLD__SOUTH);
		createEReference(roomOLDEClass, ROOM_OLD__NORTH);
		createEReference(roomOLDEClass, ROOM_OLD__EAST);
		createEReference(roomOLDEClass, ROOM_OLD__WEST);
		createEReference(roomOLDEClass, ROOM_OLD__ROOMTYPE);
		createEReference(roomOLDEClass, ROOM_OLD__INITIAL_STATE);

		classicRoomEClass = createEClass(CLASSIC_ROOM);

		questionRoomEClass = createEClass(QUESTION_ROOM);
		createEReference(questionRoomEClass, QUESTION_ROOM__SUCESS_STATE);

		pathwayEClass = createEClass(PATHWAY);

		roomType2EClass = createEClass(ROOM_TYPE2);
		createEAttribute(roomType2EClass, ROOM_TYPE2__DESCRIPTION);
		createEReference(roomType2EClass, ROOM_TYPE2__ACCEPTEDFLOORS);
		createEAttribute(roomType2EClass, ROOM_TYPE2__PATHS);

		floorEClass = createEClass(FLOOR);
		createEReference(floorEClass, FLOOR__LOCATIONS);
		createEAttribute(floorEClass, FLOOR__DESCRIPTION);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__ACCEPTED_ELEMENTS);
		createEReference(locationEClass, LOCATION__MAXSHAPE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__PLACEDOBJECTS);

		placedObjectEClass = createEClass(PLACED_OBJECT);
		createEAttribute(placedObjectEClass, PLACED_OBJECT__DISPLAY_VALUE);

		iRoomElementEClass = createEClass(IROOM_ELEMENT);

		elementShapeEClass = createEClass(ELEMENT_SHAPE);
		createEAttribute(elementShapeEClass, ELEMENT_SHAPE__HEIGHT);
		createEAttribute(elementShapeEClass, ELEMENT_SHAPE__WIDTH);

		elementStateEClass = createEClass(ELEMENT_STATE);
		createEAttribute(elementStateEClass, ELEMENT_STATE__STATE);

		dungeonEClass = createEClass(DUNGEON);
		createEReference(dungeonEClass, DUNGEON__ROOMS);
		createEAttribute(dungeonEClass, DUNGEON__MODE);
		createEReference(dungeonEClass, DUNGEON__ENTRY);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__X);
		createEAttribute(roomEClass, ROOM__Y);
		createEReference(roomEClass, ROOM__ROOMACCESS);
		createEReference(roomEClass, ROOM__ROOMTYPE);

		gameDescriptionEClass = createEClass(GAME_DESCRIPTION);
		createEReference(gameDescriptionEClass, GAME_DESCRIPTION__ROOMTYPES);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEOperation(roomTypeEClass, ROOM_TYPE___GET_DIRECTIONS);

		smallRoomTypeEClass = createEClass(SMALL_ROOM_TYPE);
		createEAttribute(smallRoomTypeEClass, SMALL_ROOM_TYPE__DIRECTIONS);

		largeRoomTypeEClass = createEClass(LARGE_ROOM_TYPE);
		createEAttribute(largeRoomTypeEClass, LARGE_ROOM_TYPE__DIRECTIONS);

		roomAccessEClass = createEClass(ROOM_ACCESS);
		createEAttribute(roomAccessEClass, ROOM_ACCESS__DIRECTION);
		createEReference(roomAccessEClass, ROOM_ACCESS__OTHERROOMACCESS);

		rogueliteContextEClass = createEClass(ROGUELITE_CONTEXT);
		createEAttribute(rogueliteContextEClass, ROGUELITE_CONTEXT__NUMBER_OF_ROOMS);
		createEAttribute(rogueliteContextEClass, ROGUELITE_CONTEXT__MODE);

		// Create enums
		subObjectiveTypeEEnum = createEEnum(SUB_OBJECTIVE_TYPE);
		gpBricksEEnum = createEEnum(GP_BRICKS);
		avatarActionsEEnum = createEEnum(AVATAR_ACTIONS);
		roomPathsEEnum = createEEnum(ROOM_PATHS);
		directionsEEnum = createEEnum(DIRECTIONS);
		dungeonModeEEnum = createEEnum(DUNGEON_MODE);
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
		qfValidityDeterminationEClass.getESuperTypes().add(this.getSubObjective());
		resultValidityDeterminationEClass.getESuperTypes().add(this.getSubObjective());
		qfOneCompletionEClass.getESuperTypes().add(this.getSubObjective());
		qfReconstructionEClass.getESuperTypes().add(this.getSubObjective());
		qfTwoCompletionEClass.getESuperTypes().add(this.getSubObjective());
		problemResolutionEClass.getESuperTypes().add(this.getSubObjective());
		setOfFactsEClass.getESuperTypes().add(this.getAbstractFact());
		factEClass.getESuperTypes().add(this.getAbstractFact());
		elementTypeEClass.getESuperTypes().add(this.getIRoomElement());
		classicRoomEClass.getESuperTypes().add(this.getRoomOLD());
		questionRoomEClass.getESuperTypes().add(this.getRoomOLD());
		floorEClass.getESuperTypes().add(this.getElementType());
		smallRoomTypeEClass.getESuperTypes().add(this.getRoomType());
		largeRoomTypeEClass.getESuperTypes().add(this.getRoomType());

		// Initialize classes, features, and operations; add parameters
		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_SuccessPercentage(), ecorePackage.getEInt(), "successPercentage", null, 0, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_Prerequisite(), this.getLevel(), null, "prerequisite", null, 1, 1,
				Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Level.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Subobjectives(), this.getSubObjective(), null, "subobjectives", null, 0, -1,
				Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qfValidityDeterminationEClass, QFValidityDetermination.class, "QFValidityDetermination", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFValidityDetermination_Type(), this.getSubObjectiveType(), "type", "QF_VALIDITY", 0, 1,
				QFValidityDetermination.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningPathsEClass, LearningPaths.class, "LearningPaths", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningPaths_Learningpaths(), this.getLearningPath(), null, "learningpaths", null, 1, -1,
				LearningPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultValidityDeterminationEClass, ResultValidityDetermination.class, "ResultValidityDetermination",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultValidityDetermination_NewAttribute(), this.getSubObjectiveType(), "newAttribute",
				"RES_VALIDITY", 0, 1, ResultValidityDetermination.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qfOneCompletionEClass, QFOneCompletion.class, "QFOneCompletion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFOneCompletion_Type(), this.getSubObjectiveType(), "type", "COMPLETION1", 0, 1,
				QFOneCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qfReconstructionEClass, QFReconstruction.class, "QFReconstruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFReconstruction_Type(), this.getSubObjectiveType(), "type", "RECONSTRUCTION", 0, 1,
				QFReconstruction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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

		initEClass(qfTwoCompletionEClass, QFTwoCompletion.class, "QFTwoCompletion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQFTwoCompletion_Type(), this.getSubObjectiveType(), "type", "COMPLETION2", 0, 1,
				QFTwoCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(problemResolutionEClass, ProblemResolution.class, "ProblemResolution", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProblemResolution_Type(), this.getSubObjectiveType(), "type", "PB_RESOLUTION", 0, 1,
				ProblemResolution.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningPath_Knowledge(), this.getKnowledge(), null, "knowledge", null, 1, 1,
				LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Learningobjectives(), this.getLearningObjective(), null, "learningobjectives",
				null, 0, -1, LearningPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningObjectiveEClass, LearningObjective.class, "LearningObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningObjective_Levels(), this.getLevel(), null, "levels", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningObjective_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_ID(), ecorePackage.getEString(), "ID", null, 0, 1, LearningObjective.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				LearningObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gameContentEClass, GameContent.class, "GameContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameContent_Gameplays(), this.getGameplay(), null, "gameplays", null, 1, -1,
				GameContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameContent_Elements(), this.getElementType(), null, "elements", null, 0, -1,
				GameContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameContent_Gameobjectives(), this.getGameObjective(), null, "gameobjectives", null, 1, -1,
				GameContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameContent_Roomtype(), this.getRoomType2(), null, "roomtype", null, 0, -1, GameContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameplayEClass, Gameplay.class, "Gameplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameplay_Coregamerules(), this.getCoreGameRule(), null, "coregamerules", null, 1, -1,
				Gameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_Description(), ecorePackage.getEString(), "description", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreGameRuleEClass, CoreGameRule.class, "CoreGameRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoreGameRule_RuleType(), this.getGPBricks(), "ruleType", "MOVE", 0, 1, CoreGameRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreGameRule_ActionToDo(), this.getAvatarActions(), "actionToDo", "WALK_RUN", 0, 1,
				CoreGameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCoreGameRule_Element(), this.getElementType(), null, "element", null, 0, 1,
				CoreGameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_AcceptedActions(), this.getAvatarActions(), "acceptedActions", null, 1, -1,
				ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getElementType_Shape(), this.getElementShape(), null, "shape", null, 1, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementType_State(), this.getElementState(), null, "state", null, 1, -1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dungeonOLDEClass, DungeonOLD.class, "DungeonOLD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDungeonOLD_NumberOfRooms(), ecorePackage.getEInt(), "numberOfRooms", null, 0, 1,
				DungeonOLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDungeonOLD_Gameobjective(), this.getGameObjective(), null, "gameobjective", null, 1, 1,
				DungeonOLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeonOLD_Rooms(), this.getRoomOLD(), null, "rooms", null, 2, -1, DungeonOLD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameObjectiveEClass, GameObjective.class, "GameObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameObjective_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				GameObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roomOLDEClass, RoomOLD.class, "RoomOLD", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomOLD_South(), this.getPathway(), null, "south", null, 1, 1, RoomOLD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoomOLD_North(), this.getPathway(), null, "north", null, 1, 1, RoomOLD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoomOLD_East(), this.getPathway(), null, "east", null, 1, 1, RoomOLD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoomOLD_West(), this.getPathway(), null, "west", null, 1, 1, RoomOLD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoomOLD_Roomtype(), this.getRoomType2(), null, "roomtype", null, 1, 1, RoomOLD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomOLD_InitialState(), this.getState(), null, "initialState", null, 1, 1, RoomOLD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classicRoomEClass, ClassicRoom.class, "ClassicRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionRoomEClass, QuestionRoom.class, "QuestionRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionRoom_SucessState(), this.getState(), null, "sucessState", null, 1, 1,
				QuestionRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathwayEClass, Pathway.class, "Pathway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomType2EClass, RoomType2.class, "RoomType2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType2_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				RoomType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType2_Acceptedfloors(), this.getFloor(), null, "acceptedfloors", null, 1, -1,
				RoomType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomType2_Paths(), this.getRoomPaths(), "paths", null, 0, 4, RoomType2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloor_Locations(), this.getLocation(), null, "locations", null, 0, -1, Floor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_Description(), ecorePackage.getEString(), "description", null, 0, 1, Floor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_AcceptedElements(), this.getIRoomElement(), null, "acceptedElements", null, 1, -1,
				Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Maxshape(), this.getElementShape(), null, "maxshape", null, 1, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Placedobjects(), this.getPlacedObject(), null, "placedobjects", null, 0, -1,
				State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placedObjectEClass, PlacedObject.class, "PlacedObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacedObject_DisplayValue(), ecorePackage.getEString(), "displayValue", null, 0, 1,
				PlacedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(iRoomElementEClass, IRoomElement.class, "IRoomElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementShapeEClass, ElementShape.class, "ElementShape", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementShape_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, ElementShape.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementShape_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, ElementShape.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementStateEClass, ElementState.class, "ElementState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementState_State(), ecorePackage.getEString(), "state", null, 0, 1, ElementState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dungeonEClass, Dungeon.class, "Dungeon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDungeon_Rooms(), this.getRoom(), null, "rooms", null, 1, -1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDungeon_Mode(), this.getDungeonMode(), "mode", null, 0, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeon_Entry(), this.getRoom(), null, "entry", null, 1, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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

		initEClass(gameDescriptionEClass, GameDescription.class, "GameDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameDescription_Roomtypes(), this.getRoomType(), null, "roomtypes", null, 1, -1,
				GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoomType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(rogueliteContextEClass, RogueliteContext.class, "RogueliteContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRogueliteContext_NumberOfRooms(), ecorePackage.getEInt(), "numberOfRooms", null, 0, 1,
				RogueliteContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRogueliteContext_Mode(), this.getDungeonMode(), "mode", null, 0, 1, RogueliteContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(subObjectiveTypeEEnum, SubObjectiveType.class, "SubObjectiveType");
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.COMPLETION1);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.COMPLETION2);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.RECONSTRUCTION);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.QF_VALIDITY);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.RES_VALIDITY);
		addEEnumLiteral(subObjectiveTypeEEnum, SubObjectiveType.PB_RESOLUTION);

		initEEnum(gpBricksEEnum, GPBricks.class, "GPBricks");
		addEEnumLiteral(gpBricksEEnum, GPBricks.SELECT);
		addEEnumLiteral(gpBricksEEnum, GPBricks.MOVE);
		addEEnumLiteral(gpBricksEEnum, GPBricks.AVOID);
		addEEnumLiteral(gpBricksEEnum, GPBricks.DESTROY);
		addEEnumLiteral(gpBricksEEnum, GPBricks.MANAGE);
		addEEnumLiteral(gpBricksEEnum, GPBricks.WRITE);

		initEEnum(avatarActionsEEnum, AvatarActions.class, "AvatarActions");
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.TOUCH);
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.GO_THROUGH);
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.STRIKE);
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.WALK_RUN);
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.PICKUP_CARRY);
		addEEnumLiteral(avatarActionsEEnum, AvatarActions.NONE);

		initEEnum(roomPathsEEnum, RoomPaths.class, "RoomPaths");
		addEEnumLiteral(roomPathsEEnum, RoomPaths.NORTH);
		addEEnumLiteral(roomPathsEEnum, RoomPaths.SOUTH);
		addEEnumLiteral(roomPathsEEnum, RoomPaths.EAST);
		addEEnumLiteral(roomPathsEEnum, RoomPaths.WEST);

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

		initEEnum(dungeonModeEEnum, DungeonMode.class, "DungeonMode");
		addEEnumLiteral(dungeonModeEEnum, DungeonMode.LINEAR);
		addEEnumLiteral(dungeonModeEEnum, DungeonMode.LABYRINTHINE);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
