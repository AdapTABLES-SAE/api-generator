/**
 */
package generator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import generator.*;

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
	private EClass classroomEClass = null;

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
	private EClass completionTaskEClass = null;

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
	private EClass gameElementTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsTypesEClass = null;

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
	private EClass cursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labyrinthCurseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curseEligibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapElementPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legendSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legendTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographyLegendFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographyFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aQuestionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapQuestionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLegendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gLocateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teacherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teachersEClass = null;

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
	private EClass positionedElementEClass = null;

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
	private EClass correctnessEClass = null;

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
	private EClass factSolutionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factCorrectnessParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameplayTaskRelationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionGameplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noQuestionGameplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerProgressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learnerProgressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learnerPlayersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsEClass = null;

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
	private EEnum gpCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCorrectnessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBoundaryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eStatementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRoomTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGeographyValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eHistoryTargetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eLegendTargetEEnum = null;

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
	public EReference getDungeon_Exit() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_LearnerPlayer() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDungeon_Curses() {
		return (EReference) dungeonEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getRoomType_Type() {
		return (EAttribute) roomTypeEClass.getEStructuralFeatures().get(2);
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
	public EOperation getRoomType__IsEntryRoomType() {
		return roomTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__IsExitRoomType() {
		return roomTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__IsQuestionRoomType() {
		return roomTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__IsTrapRoomType() {
		return roomTypeEClass.getEOperations().get(4);
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
	public EAttribute getPrerequisite_SuccessPercent() {
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
	public EAttribute getMTCompletion1_NbMissingElements() {
		return (EAttribute) mtCompletion1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCompletion1_CheckLearnerAction() {
		return (EAttribute) mtCompletion1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassroom() {
		return classroomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassroom_Gamecontext() {
		return (EReference) classroomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassroom_ID() {
		return (EAttribute) classroomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassroom_LearnerPlayers() {
		return (EReference) classroomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassroom_Name() {
		return (EAttribute) classroomEClass.getEStructuralFeatures().get(3);
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
	public EReference getLearnerPlayer_Statistics() {
		return (EReference) learnerPlayerEClass.getEStructuralFeatures().get(4);
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
	public EReference getProgression_PlayerProgress() {
		return (EReference) progressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgression_LearnerProgress() {
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
	public EAttribute getCurrentObjectiveLevel_SuccessPercent() {
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
	public EAttribute getPosition_Size() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_RestrictedTo() {
		return (EReference) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_ID() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMultipleChoice_NbBadChoices() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_NbChoices() {
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
	public EOperation getATask__IsCheckOnLearnerAction() {
		return aTaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getATask__GetNbExpectedAnswers() {
		return aTaskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletionTask() {
		return completionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionTask_Type() {
		return (EAttribute) completionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompletionTask__GetNbMissingElements() {
		return completionTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompletionTask__GetNbExpectedAnswers() {
		return completionTaskEClass.getEOperations().get(1);
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
	public EOperation getIdentificationTask__GetNbExpectedAnswers() {
		return identificationTaskEClass.getEOperations().get(0);
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
	public EAttribute getMembershipIDTask_IdentifySharedProperty() {
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
	public EOperation getMembershipIDTask__GetNbExpectedAnswers() {
		return membershipIDTaskEClass.getEOperations().get(0);
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
	public EAttribute getMTCompletion2_NbMissingElements() {
		return (EAttribute) mtCompletion2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCompletion2_CheckLearnerAction() {
		return (EAttribute) mtCompletion2EClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMTRecontruction_NbMissingElements() {
		return (EAttribute) mtRecontructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTRecontruction_CheckLearnerAction() {
		return (EAttribute) mtRecontructionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getResultsByTask_SuccessPercent() {
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
	public EOperation getQuestionableFact__GetCompleteFact() {
		return questionableFactEClass.getEOperations().get(1);
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
	public EAttribute getQuestionedFact_CompleteFact() {
		return (EAttribute) questionedFactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionedFact_FactCorrectness() {
		return (EReference) questionedFactEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getCompletionCriteria_SuccessPercent() {
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
	public EReference getLevelsDifficultyProgress_CursesAvailabilities() {
		return (EReference) levelsDifficultyProgressEClass.getEStructuralFeatures().get(4);
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
	public EReference getGameElementTypes_ElementTypes() {
		return (EReference) gameElementTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameElementTypes_Curses() {
		return (EReference) gameElementTypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementsTypes() {
		return elementsTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementsTypes_Elements() {
		return (EReference) elementsTypesEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getElementType_Size() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_ID() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Type() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_Ability() {
		return (EReference) elementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_NbDisplays() {
		return (EAttribute) elementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementType__IsDisplayableElement() {
		return elementTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurses() {
		return cursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurses_Curses() {
		return (EReference) cursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurse() {
		return curseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurse_Name() {
		return (EAttribute) curseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabyrinthCurse() {
		return labyrinthCurseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurseEligibility() {
		return curseEligibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurseEligibility_StartLevel() {
		return (EAttribute) curseEligibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurseEligibility_Curse() {
		return (EReference) curseEligibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_ID() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Positions() {
		return (EReference) mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapElementPosition() {
		return mapElementPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapElementPosition_ID() {
		return (EAttribute) mapElementPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegendSymbol() {
		return legendSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegendSymbol_Image() {
		return (EReference) legendSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegendSymbol_Position() {
		return (EReference) legendSymbolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegendText() {
		return legendTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendText_Text() {
		return (EAttribute) legendTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegendText_Position() {
		return (EReference) legendTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryFact() {
		return historyFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryFact_Event() {
		return (EAttribute) historyFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryFact_Image() {
		return (EReference) historyFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryFact_Time() {
		return (EReference) historyFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographyLegendFact() {
		return geographyLegendFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographyLegendFact_Map() {
		return (EReference) geographyLegendFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographyLegendFact_Symbol() {
		return (EReference) geographyLegendFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographyLegendFact_Legend() {
		return (EReference) geographyLegendFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographyFact() {
		return geographyFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographyFact_Map() {
		return (EReference) geographyFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographyFact_Position() {
		return (EReference) geographyFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographyFact_Value() {
		return (EAttribute) geographyFactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDate_Position() {
		return (EReference) dateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriod() {
		return timePeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriod_StartYear() {
		return (EAttribute) timePeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriod_EndYear() {
		return (EAttribute) timePeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriod_Positions() {
		return (EReference) timePeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapValue() {
		return mapValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapValue__IsCorrectValue() {
		return mapValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Map() {
		return (EReference) timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAQuestionParam() {
		return aQuestionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapQuestionParam() {
		return mapQuestionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapQuestionParam_Map() {
		return (EReference) mapQuestionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAssociation() {
		return hAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHAssociation_NbMissingElements() {
		return (EAttribute) hAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHAssociation_Source() {
		return (EAttribute) hAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHAssociation_Missing() {
		return (EAttribute) hAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLegend() {
		return hLegendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHLegend_NbMissingElements() {
		return (EAttribute) hLegendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHLegend_Missing() {
		return (EAttribute) hLegendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGLocate() {
		return gLocateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGLocate_NbExpectedAnswers() {
		return (EAttribute) gLocateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGLocate_LearnersChoices() {
		return (EAttribute) gLocateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeacher() {
		return teacherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeacher_ID() {
		return (EAttribute) teacherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeacher_Classrooms() {
		return (EReference) teacherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeachers() {
		return teachersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeachers_Teachers() {
		return (EReference) teachersEClass.getEStructuralFeatures().get(0);
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
	public EReference getEquipment_LockedAbilities() {
		return (EReference) equipmentEClass.getEStructuralFeatures().get(1);
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
	public EReference getGameplay_Components() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplay_Prompt() {
		return (EReference) gameplayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_Undoable() {
		return (EAttribute) gameplayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameplay_Locked() {
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
	public EAttribute getQuestionableFactResult_OnTime() {
		return (EAttribute) questionableFactResultEClass.getEStructuralFeatures().get(3);
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
	public EReference getAbility_LockingEquipment() {
		return (EReference) abilityEClass.getEStructuralFeatures().get(1);
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
	public EReference getPositionedElement_Displays() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_ExpectedAnswer() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_Fact() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_AcceptedFacts() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_ElementType() {
		return (EReference) positionedElementEClass.getEStructuralFeatures().get(7);
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
	public EReference getQuestionParam_Solutions() {
		return (EReference) questionParamEClass.getEStructuralFeatures().get(1);
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
	public EClass getCorrectness() {
		return correctnessEClass;
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
	public EReference getDisplay_Correctness() {
		return (EReference) displayEClass.getEStructuralFeatures().get(1);
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
	public EReference getAComponent_AllowedAbility() {
		return (EReference) aComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAComponent_ExpectedSize() {
		return (EReference) aComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAComponent_ForProposition() {
		return (EAttribute) aComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAComponent_ForStatement() {
		return (EAttribute) aComponentEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getStructure_AlternateComponents() {
		return (EAttribute) structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructure_ForFact() {
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
	public EReference getComponent_DisplayValue() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DefaultCorrectness() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_InputEntry() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Quantity() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getQuantity_FactNbAnswers() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(0);
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
	public EClass getFactSolutionParam() {
		return factSolutionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingTask() {
		return orderingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderingTask_Type() {
		return (EAttribute) orderingTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderingTask_CheckLearnerAction() {
		return (EAttribute) orderingTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderingTask__NbExpectedAnswers() {
		return orderingTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrompt() {
		return promptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrompt_Prompt() {
		return (EAttribute) promptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactCorrectnessParam() {
		return factCorrectnessParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameplayTaskRelations() {
		return gameplayTaskRelationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameplayTaskRelations_Relations() {
		return (EReference) gameplayTaskRelationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Task() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Gameplays() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Condition() {
		return (EReference) relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_StatementTypes() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_NbFacts() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_NbExpectedAnswers() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_AnswerModality() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionGameplay() {
		return questionGameplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionGameplay_ManualValidation() {
		return (EAttribute) questionGameplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionGameplay_Category() {
		return (EAttribute) questionGameplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionGameplay_HasIntegratedPropositions() {
		return (EAttribute) questionGameplayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionGameplay_RestrictedTo() {
		return (EAttribute) questionGameplayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionGameplay_StatementType() {
		return (EAttribute) questionGameplayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoQuestionGameplay() {
		return noQuestionGameplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementElementType() {
		return statementElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatementElementType_ForStructure() {
		return (EAttribute) statementElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerProgress() {
		return playerProgressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerProgress_CurrentLevel() {
		return (EAttribute) playerProgressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerProgress_Coins() {
		return (EAttribute) playerProgressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayerProgress_Items() {
		return (EReference) playerProgressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearnerProgress() {
		return learnerProgressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearnerProgress_Currentobjectivelevels() {
		return (EReference) learnerProgressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Bought() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Activated() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Equipment() {
		return (EReference) itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItems() {
		return itemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItems_Items() {
		return (EReference) itemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearnerPlayers() {
		return learnerPlayersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearnerPlayers_LearnerPlayers() {
		return (EReference) learnerPlayersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatistics() {
		return statisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbCorrectGivenAnswers() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbQuestionsEncountered() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_MaxGameLevelReached() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_TotalTimeMin() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbDeaths() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbLevelsGenerated() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbFinishedLevels() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_NbUnfinishedLevels() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_TotalCoins() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(8);
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
	public EEnum getEBoundary() {
		return eBoundaryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEStatementType() {
		return eStatementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERoomType() {
		return eRoomTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGeographyValue() {
		return eGeographyValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEHistoryTarget() {
		return eHistoryTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getELegendTarget() {
		return eLegendTargetEEnum;
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
		createEReference(dungeonEClass, DUNGEON__EXIT);
		createEReference(dungeonEClass, DUNGEON__LEARNER_PLAYER);
		createEReference(dungeonEClass, DUNGEON__CURSES);

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
		createEAttribute(roomTypeEClass, ROOM_TYPE__TYPE);
		createEOperation(roomTypeEClass, ROOM_TYPE___GET_DIRECTIONS);
		createEOperation(roomTypeEClass, ROOM_TYPE___IS_ENTRY_ROOM_TYPE);
		createEOperation(roomTypeEClass, ROOM_TYPE___IS_EXIT_ROOM_TYPE);
		createEOperation(roomTypeEClass, ROOM_TYPE___IS_QUESTION_ROOM_TYPE);
		createEOperation(roomTypeEClass, ROOM_TYPE___IS_TRAP_ROOM_TYPE);

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
		createEAttribute(prerequisiteEClass, PREREQUISITE__SUCCESS_PERCENT);
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
		createEAttribute(mtCompletion1EClass, MT_COMPLETION1__NB_MISSING_ELEMENTS);
		createEAttribute(mtCompletion1EClass, MT_COMPLETION1__CHECK_LEARNER_ACTION);

		classroomEClass = createEClass(CLASSROOM);
		createEReference(classroomEClass, CLASSROOM__GAMECONTEXT);
		createEAttribute(classroomEClass, CLASSROOM__ID);
		createEReference(classroomEClass, CLASSROOM__LEARNER_PLAYERS);
		createEAttribute(classroomEClass, CLASSROOM__NAME);

		learnerPlayerEClass = createEClass(LEARNER_PLAYER);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__PROGRESSION);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__NAME);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__LEARNINGPATH);
		createEAttribute(learnerPlayerEClass, LEARNER_PLAYER__ID);
		createEReference(learnerPlayerEClass, LEARNER_PLAYER__STATISTICS);

		progressionEClass = createEClass(PROGRESSION);
		createEReference(progressionEClass, PROGRESSION__PLAYER_PROGRESS);
		createEReference(progressionEClass, PROGRESSION__LEARNER_PROGRESS);

		currentObjectiveLevelEClass = createEClass(CURRENT_OBJECTIVE_LEVEL);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__OBJECTIVE);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__ACHIEVED);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__LEVEL);
		createEReference(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__RESULTS);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__ENCOUNTERS_PERCENT);
		createEAttribute(currentObjectiveLevelEClass, CURRENT_OBJECTIVE_LEVEL__SUCCESS_PERCENT);

		responseModalityEClass = createEClass(RESPONSE_MODALITY);

		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__TYPE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_BAD_CHOICES);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__NB_CHOICES);

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
		createEOperation(aTaskEClass, ATASK___IS_CHECK_ON_LEARNER_ACTION);
		createEOperation(aTaskEClass, ATASK___GET_NB_EXPECTED_ANSWERS);

		completionTaskEClass = createEClass(COMPLETION_TASK);
		createEAttribute(completionTaskEClass, COMPLETION_TASK__TYPE);
		createEOperation(completionTaskEClass, COMPLETION_TASK___GET_NB_MISSING_ELEMENTS);
		createEOperation(completionTaskEClass, COMPLETION_TASK___GET_NB_EXPECTED_ANSWERS);

		identificationTaskEClass = createEClass(IDENTIFICATION_TASK);
		createEAttribute(identificationTaskEClass, IDENTIFICATION_TASK__TYPE);
		createEAttribute(identificationTaskEClass, IDENTIFICATION_TASK__CHECK_LEARNER_ACTION);
		createEOperation(identificationTaskEClass, IDENTIFICATION_TASK___GET_NB_EXPECTED_ANSWERS);

		membershipIDTaskEClass = createEClass(MEMBERSHIP_ID_TASK);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__TYPE);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__IDENTIFY_SHARED_PROPERTY);
		createEAttribute(membershipIDTaskEClass, MEMBERSHIP_ID_TASK__CHECK_LEARNER_ACTION);
		createEOperation(membershipIDTaskEClass, MEMBERSHIP_ID_TASK___GET_NB_EXPECTED_ANSWERS);

		mtCompletion2EClass = createEClass(MT_COMPLETION2);
		createEAttribute(mtCompletion2EClass, MT_COMPLETION2__TARGETS);
		createEAttribute(mtCompletion2EClass, MT_COMPLETION2__NB_MISSING_ELEMENTS);
		createEAttribute(mtCompletion2EClass, MT_COMPLETION2__CHECK_LEARNER_ACTION);

		mtRecontructionEClass = createEClass(MT_RECONTRUCTION);
		createEAttribute(mtRecontructionEClass, MT_RECONTRUCTION__NB_MISSING_ELEMENTS);
		createEAttribute(mtRecontructionEClass, MT_RECONTRUCTION__CHECK_LEARNER_ACTION);

		mtIdentificationEClass = createEClass(MT_IDENTIFICATION);
		createEAttribute(mtIdentificationEClass, MT_IDENTIFICATION__TARGET);

		mtMembershipEClass = createEClass(MT_MEMBERSHIP);

		resultsEClass = createEClass(RESULTS);
		createEReference(resultsEClass, RESULTS__RESULTSBYTASK);

		resultsByTaskEClass = createEClass(RESULTS_BY_TASK);
		createEReference(resultsByTaskEClass, RESULTS_BY_TASK__TASK);
		createEReference(resultsByTaskEClass, RESULTS_BY_TASK__QUESTIONABLE_FACTS);
		createEAttribute(resultsByTaskEClass, RESULTS_BY_TASK__SUCCESS_PERCENT);
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
		createEOperation(questionableFactEClass, QUESTIONABLE_FACT___GET_COMPLETE_FACT);

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
		createEAttribute(questionedFactEClass, QUESTIONED_FACT__COMPLETE_FACT);
		createEReference(questionedFactEClass, QUESTIONED_FACT__FACT_CORRECTNESS);

		completionCriteriaEClass = createEClass(COMPLETION_CRITERIA);
		createEAttribute(completionCriteriaEClass, COMPLETION_CRITERIA__SUCCESS_PERCENT);
		createEAttribute(completionCriteriaEClass, COMPLETION_CRITERIA__ENCOUNTERS_PERCENT);

		levelsDifficultyProgressEClass = createEClass(LEVELS_DIFFICULTY_PROGRESS);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__NB_QROOM_INCREASE);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__NB_NQ_ROOM_INCREASE);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__INIT_NB_QROOM);
		createEAttribute(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__INIT_NB_NQ_ROOM);
		createEReference(levelsDifficultyProgressEClass, LEVELS_DIFFICULTY_PROGRESS__CURSES_AVAILABILITIES);

		gameElementTypesEClass = createEClass(GAME_ELEMENT_TYPES);
		createEReference(gameElementTypesEClass, GAME_ELEMENT_TYPES__EQUIPMENTS);
		createEReference(gameElementTypesEClass, GAME_ELEMENT_TYPES__ELEMENT_TYPES);
		createEReference(gameElementTypesEClass, GAME_ELEMENT_TYPES__CURSES);

		elementsTypesEClass = createEClass(ELEMENTS_TYPES);
		createEReference(elementsTypesEClass, ELEMENTS_TYPES__ELEMENTS);

		equipmentsEClass = createEClass(EQUIPMENTS);
		createEReference(equipmentsEClass, EQUIPMENTS__EQUIPMENTS);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__ID);
		createEReference(equipmentEClass, EQUIPMENT__LOCKED_ABILITIES);

		gameplayEClass = createEClass(GAMEPLAY);
		createEAttribute(gameplayEClass, GAMEPLAY__NAME);
		createEReference(gameplayEClass, GAMEPLAY__COMPONENTS);
		createEReference(gameplayEClass, GAMEPLAY__PROMPT);
		createEAttribute(gameplayEClass, GAMEPLAY__UNDOABLE);
		createEAttribute(gameplayEClass, GAMEPLAY__LOCKED);

		gameplaysEClass = createEClass(GAMEPLAYS);
		createEReference(gameplaysEClass, GAMEPLAYS__GAMEPLAYS);

		questionableFactResultEClass = createEClass(QUESTIONABLE_FACT_RESULT);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__RESPONSE_TIME);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__ANSWER_VALID);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS);
		createEAttribute(questionableFactResultEClass, QUESTIONABLE_FACT_RESULT__ON_TIME);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__NAME);
		createEReference(abilityEClass, ABILITY__LOCKING_EQUIPMENT);

		abilitiesEClass = createEClass(ABILITIES);
		createEReference(abilitiesEClass, ABILITIES__ABILITIES);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__SIZE);
		createEReference(positionEClass, POSITION__RESTRICTED_TO);
		createEAttribute(positionEClass, POSITION__ID);

		positionedElementEClass = createEClass(POSITIONED_ELEMENT);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__ID);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__POSITION);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__CORRECTNESS);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__DISPLAYS);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__EXPECTED_ANSWER);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__FACT);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__ACCEPTED_FACTS);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__ELEMENT_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__VALUE);

		questionParamEClass = createEClass(QUESTION_PARAM);
		createEAttribute(questionParamEClass, QUESTION_PARAM__INTERACTIVE);
		createEReference(questionParamEClass, QUESTION_PARAM__SOLUTIONS);

		propositionParamEClass = createEClass(PROPOSITION_PARAM);
		createEReference(propositionParamEClass, PROPOSITION_PARAM__STATE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);

		correctnessEClass = createEClass(CORRECTNESS);

		entrySoluceParamEClass = createEClass(ENTRY_SOLUCE_PARAM);
		createEAttribute(entrySoluceParamEClass, ENTRY_SOLUCE_PARAM__STATE);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__INTERACTIVE);
		createEReference(displayEClass, DISPLAY__CORRECTNESS);

		aComponentEClass = createEClass(ACOMPONENT);
		createEReference(aComponentEClass, ACOMPONENT__ALLOWED_ABILITY);
		createEReference(aComponentEClass, ACOMPONENT__EXPECTED_SIZE);
		createEAttribute(aComponentEClass, ACOMPONENT__FOR_PROPOSITION);
		createEAttribute(aComponentEClass, ACOMPONENT__FOR_STATEMENT);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__COMPONENTS);
		createEAttribute(structureEClass, STRUCTURE__ALTERNATE_COMPONENTS);
		createEAttribute(structureEClass, STRUCTURE__FOR_FACT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__DISPLAY_VALUE);
		createEReference(componentEClass, COMPONENT__DEFAULT_CORRECTNESS);
		createEAttribute(componentEClass, COMPONENT__INPUT_ENTRY);
		createEReference(componentEClass, COMPONENT__QUANTITY);

		quantityEClass = createEClass(QUANTITY);
		createEAttribute(quantityEClass, QUANTITY__FACT_NB_ANSWERS);

		wantedAnswersParamEClass = createEClass(WANTED_ANSWERS_PARAM);

		expectedAnswerEClass = createEClass(EXPECTED_ANSWER);

		correctnessValueEClass = createEClass(CORRECTNESS_VALUE);
		createEAttribute(correctnessValueEClass, CORRECTNESS_VALUE__VALUE);

		aValueEClass = createEClass(AVALUE);

		positionedStructureElementEClass = createEClass(POSITIONED_STRUCTURE_ELEMENT);
		createEReference(positionedStructureElementEClass, POSITIONED_STRUCTURE_ELEMENT__CREATED_POSITION);

		factSolutionParamEClass = createEClass(FACT_SOLUTION_PARAM);

		orderingTaskEClass = createEClass(ORDERING_TASK);
		createEAttribute(orderingTaskEClass, ORDERING_TASK__TYPE);
		createEAttribute(orderingTaskEClass, ORDERING_TASK__CHECK_LEARNER_ACTION);
		createEOperation(orderingTaskEClass, ORDERING_TASK___NB_EXPECTED_ANSWERS);

		promptEClass = createEClass(PROMPT);
		createEAttribute(promptEClass, PROMPT__PROMPT);

		factCorrectnessParamEClass = createEClass(FACT_CORRECTNESS_PARAM);

		gameplayTaskRelationsEClass = createEClass(GAMEPLAY_TASK_RELATIONS);
		createEReference(gameplayTaskRelationsEClass, GAMEPLAY_TASK_RELATIONS__RELATIONS);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__TASK);
		createEAttribute(relationEClass, RELATION__GAMEPLAYS);
		createEReference(relationEClass, RELATION__CONDITION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__STATEMENT_TYPES);
		createEAttribute(conditionEClass, CONDITION__NB_FACTS);
		createEAttribute(conditionEClass, CONDITION__ANSWER_MODALITY);
		createEAttribute(conditionEClass, CONDITION__NB_EXPECTED_ANSWERS);

		questionGameplayEClass = createEClass(QUESTION_GAMEPLAY);
		createEAttribute(questionGameplayEClass, QUESTION_GAMEPLAY__MANUAL_VALIDATION);
		createEAttribute(questionGameplayEClass, QUESTION_GAMEPLAY__CATEGORY);
		createEAttribute(questionGameplayEClass, QUESTION_GAMEPLAY__HAS_INTEGRATED_PROPOSITIONS);
		createEAttribute(questionGameplayEClass, QUESTION_GAMEPLAY__RESTRICTED_TO);
		createEAttribute(questionGameplayEClass, QUESTION_GAMEPLAY__STATEMENT_TYPE);

		noQuestionGameplayEClass = createEClass(NO_QUESTION_GAMEPLAY);

		sizeEClass = createEClass(SIZE);

		statementElementTypeEClass = createEClass(STATEMENT_ELEMENT_TYPE);
		createEAttribute(statementElementTypeEClass, STATEMENT_ELEMENT_TYPE__FOR_STRUCTURE);

		playerProgressEClass = createEClass(PLAYER_PROGRESS);
		createEAttribute(playerProgressEClass, PLAYER_PROGRESS__CURRENT_LEVEL);
		createEAttribute(playerProgressEClass, PLAYER_PROGRESS__COINS);
		createEReference(playerProgressEClass, PLAYER_PROGRESS__ITEMS);

		learnerProgressEClass = createEClass(LEARNER_PROGRESS);
		createEReference(learnerProgressEClass, LEARNER_PROGRESS__CURRENTOBJECTIVELEVELS);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__BOUGHT);
		createEAttribute(itemEClass, ITEM__ACTIVATED);
		createEReference(itemEClass, ITEM__EQUIPMENT);

		itemsEClass = createEClass(ITEMS);
		createEReference(itemsEClass, ITEMS__ITEMS);

		learnerPlayersEClass = createEClass(LEARNER_PLAYERS);
		createEReference(learnerPlayersEClass, LEARNER_PLAYERS__LEARNER_PLAYERS);

		statisticsEClass = createEClass(STATISTICS);
		createEAttribute(statisticsEClass, STATISTICS__NB_CORRECT_GIVEN_ANSWERS);
		createEAttribute(statisticsEClass, STATISTICS__NB_QUESTIONS_ENCOUNTERED);
		createEAttribute(statisticsEClass, STATISTICS__MAX_GAME_LEVEL_REACHED);
		createEAttribute(statisticsEClass, STATISTICS__TOTAL_TIME_MIN);
		createEAttribute(statisticsEClass, STATISTICS__NB_DEATHS);
		createEAttribute(statisticsEClass, STATISTICS__NB_LEVELS_GENERATED);
		createEAttribute(statisticsEClass, STATISTICS__NB_FINISHED_LEVELS);
		createEAttribute(statisticsEClass, STATISTICS__NB_UNFINISHED_LEVELS);
		createEAttribute(statisticsEClass, STATISTICS__TOTAL_COINS);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__SIZE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__ID);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NB_DISPLAYS);
		createEReference(elementTypeEClass, ELEMENT_TYPE__ABILITY);
		createEOperation(elementTypeEClass, ELEMENT_TYPE___IS_DISPLAYABLE_ELEMENT);

		cursesEClass = createEClass(CURSES);
		createEReference(cursesEClass, CURSES__CURSES);

		curseEClass = createEClass(CURSE);
		createEAttribute(curseEClass, CURSE__NAME);

		labyrinthCurseEClass = createEClass(LABYRINTH_CURSE);

		curseEligibilityEClass = createEClass(CURSE_ELIGIBILITY);
		createEAttribute(curseEligibilityEClass, CURSE_ELIGIBILITY__START_LEVEL);
		createEReference(curseEligibilityEClass, CURSE_ELIGIBILITY__CURSE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__ID);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__POSITIONS);

		mapElementPositionEClass = createEClass(MAP_ELEMENT_POSITION);
		createEAttribute(mapElementPositionEClass, MAP_ELEMENT_POSITION__ID);

		legendSymbolEClass = createEClass(LEGEND_SYMBOL);
		createEReference(legendSymbolEClass, LEGEND_SYMBOL__IMAGE);
		createEReference(legendSymbolEClass, LEGEND_SYMBOL__POSITION);

		legendTextEClass = createEClass(LEGEND_TEXT);
		createEAttribute(legendTextEClass, LEGEND_TEXT__TEXT);
		createEReference(legendTextEClass, LEGEND_TEXT__POSITION);

		historyFactEClass = createEClass(HISTORY_FACT);
		createEAttribute(historyFactEClass, HISTORY_FACT__EVENT);
		createEReference(historyFactEClass, HISTORY_FACT__IMAGE);
		createEReference(historyFactEClass, HISTORY_FACT__TIME);

		geographyLegendFactEClass = createEClass(GEOGRAPHY_LEGEND_FACT);
		createEReference(geographyLegendFactEClass, GEOGRAPHY_LEGEND_FACT__MAP);
		createEReference(geographyLegendFactEClass, GEOGRAPHY_LEGEND_FACT__SYMBOL);
		createEReference(geographyLegendFactEClass, GEOGRAPHY_LEGEND_FACT__LEGEND);

		geographyFactEClass = createEClass(GEOGRAPHY_FACT);
		createEReference(geographyFactEClass, GEOGRAPHY_FACT__MAP);
		createEReference(geographyFactEClass, GEOGRAPHY_FACT__POSITION);
		createEAttribute(geographyFactEClass, GEOGRAPHY_FACT__VALUE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__DAY);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__YEAR);
		createEReference(dateEClass, DATE__POSITION);

		timePeriodEClass = createEClass(TIME_PERIOD);
		createEAttribute(timePeriodEClass, TIME_PERIOD__START_YEAR);
		createEAttribute(timePeriodEClass, TIME_PERIOD__END_YEAR);
		createEReference(timePeriodEClass, TIME_PERIOD__POSITIONS);

		mapValueEClass = createEClass(MAP_VALUE);
		createEOperation(mapValueEClass, MAP_VALUE___IS_CORRECT_VALUE);

		timeEClass = createEClass(TIME);
		createEReference(timeEClass, TIME__MAP);

		aQuestionParamEClass = createEClass(AQUESTION_PARAM);

		mapQuestionParamEClass = createEClass(MAP_QUESTION_PARAM);
		createEReference(mapQuestionParamEClass, MAP_QUESTION_PARAM__MAP);

		hAssociationEClass = createEClass(HASSOCIATION);
		createEAttribute(hAssociationEClass, HASSOCIATION__NB_MISSING_ELEMENTS);
		createEAttribute(hAssociationEClass, HASSOCIATION__SOURCE);
		createEAttribute(hAssociationEClass, HASSOCIATION__MISSING);

		hLegendEClass = createEClass(HLEGEND);
		createEAttribute(hLegendEClass, HLEGEND__NB_MISSING_ELEMENTS);
		createEAttribute(hLegendEClass, HLEGEND__MISSING);

		gLocateEClass = createEClass(GLOCATE);
		createEAttribute(gLocateEClass, GLOCATE__NB_EXPECTED_ANSWERS);
		createEAttribute(gLocateEClass, GLOCATE__LEARNERS_CHOICES);

		teacherEClass = createEClass(TEACHER);
		createEAttribute(teacherEClass, TEACHER__ID);
		createEReference(teacherEClass, TEACHER__CLASSROOMS);

		teachersEClass = createEClass(TEACHERS);
		createEReference(teachersEClass, TEACHERS__TEACHERS);

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
		gpCategoryEEnum = createEEnum(GP_CATEGORY);
		eCorrectnessEEnum = createEEnum(ECORRECTNESS);
		eBoundaryEEnum = createEEnum(EBOUNDARY);
		eRoomTypeEEnum = createEEnum(EROOM_TYPE);
		eGeographyValueEEnum = createEEnum(EGEOGRAPHY_VALUE);
		eHistoryTargetEEnum = createEEnum(EHISTORY_TARGET);
		eLegendTargetEEnum = createEEnum(ELEGEND_TARGET);
		eStatementTypeEEnum = createEEnum(ESTATEMENT_TYPE);
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
		mtCompletion1EClass.getESuperTypes().add(this.getCompletionTask());
		multipleChoiceEClass.getESuperTypes().add(this.getResponseModality());
		enterResponseEClass.getESuperTypes().add(this.getResponseModality());
		completionTaskEClass.getESuperTypes().add(this.getATask());
		identificationTaskEClass.getESuperTypes().add(this.getATask());
		membershipIDTaskEClass.getESuperTypes().add(this.getATask());
		mtCompletion2EClass.getESuperTypes().add(this.getCompletionTask());
		mtRecontructionEClass.getESuperTypes().add(this.getCompletionTask());
		mtIdentificationEClass.getESuperTypes().add(this.getIdentificationTask());
		mtMembershipEClass.getESuperTypes().add(this.getMembershipIDTask());
		mtFactEClass.getESuperTypes().add(this.getAbstractFact());
		mtResultFactEClass.getESuperTypes().add(this.getAbstractFact());
		mtqfCompletion1EClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfCompletion2EClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfRebuildEClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfIdentificationEClass.getESuperTypes().add(this.getQuestionableFact());
		mtqfMembershipEClass.getESuperTypes().add(this.getQuestionableFact());
		questionParamEClass.getESuperTypes().add(this.getAQuestionParam());
		propositionParamEClass.getESuperTypes().add(this.getParameter());
		valueEClass.getESuperTypes().add(this.getAValue());
		correctnessEClass.getESuperTypes().add(this.getParameter());
		entrySoluceParamEClass.getESuperTypes().add(this.getParameter());
		displayEClass.getESuperTypes().add(this.getParameter());
		structureEClass.getESuperTypes().add(this.getAComponent());
		componentEClass.getESuperTypes().add(this.getAComponent());
		quantityEClass.getESuperTypes().add(this.getParameter());
		wantedAnswersParamEClass.getESuperTypes().add(this.getParameter());
		expectedAnswerEClass.getESuperTypes().add(this.getParameter());
		correctnessValueEClass.getESuperTypes().add(this.getAValue());
		positionedStructureElementEClass.getESuperTypes().add(this.getPositionedElement());
		factSolutionParamEClass.getESuperTypes().add(this.getParameter());
		orderingTaskEClass.getESuperTypes().add(this.getATask());
		factCorrectnessParamEClass.getESuperTypes().add(this.getParameter());
		questionGameplayEClass.getESuperTypes().add(this.getGameplay());
		noQuestionGameplayEClass.getESuperTypes().add(this.getGameplay());
		sizeEClass.getESuperTypes().add(this.getParameter());
		statementElementTypeEClass.getESuperTypes().add(this.getElementType());
		labyrinthCurseEClass.getESuperTypes().add(this.getCurse());
		mapEClass.getESuperTypes().add(this.getImage());
		historyFactEClass.getESuperTypes().add(this.getAbstractFact());
		geographyLegendFactEClass.getESuperTypes().add(this.getAbstractFact());
		geographyFactEClass.getESuperTypes().add(this.getAbstractFact());
		dateEClass.getESuperTypes().add(this.getTime());
		timePeriodEClass.getESuperTypes().add(this.getTime());
		mapValueEClass.getESuperTypes().add(this.getValue());
		aQuestionParamEClass.getESuperTypes().add(this.getParameter());
		mapQuestionParamEClass.getESuperTypes().add(this.getAQuestionParam());
		hAssociationEClass.getESuperTypes().add(this.getCompletionTask());
		hLegendEClass.getESuperTypes().add(this.getCompletionTask());
		gLocateEClass.getESuperTypes().add(this.getMembershipIDTask());

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
		initEReference(getDungeon_Exit(), this.getRoom(), null, "exit", null, 0, 1, Dungeon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDungeon_LearnerPlayer(), this.getLearnerPlayer(), null, "learnerPlayer", null, 1, 1,
				Dungeon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDungeon_Curses(), this.getCurse(), null, "curses", null, 0, -1, Dungeon.class, !IS_TRANSIENT,
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
		initEAttribute(getRoomType_Type(), this.getERoomType(), "type", "QUESTION", 0, 1, RoomType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoomType__GetDirections(), this.getDirections(), "getDirections", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getRoomType__IsEntryRoomType(), ecorePackage.getEBoolean(), "isEntryRoomType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getRoomType__IsExitRoomType(), ecorePackage.getEBoolean(), "isExitRoomType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getRoomType__IsQuestionRoomType(), ecorePackage.getEBoolean(), "isQuestionRoomType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getRoomType__IsTrapRoomType(), ecorePackage.getEBoolean(), "isTrapRoomType", 0, 1, IS_UNIQUE,
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
		initEReference(getLearningDomain_Learningpaths(), this.getLearningPath(), null, "learningpaths", null, 1, -1,
				LearningDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningPathEClass, LearningPath.class, "LearningPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, LearningPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningPath_Objectives(), this.getObjective(), null, "objectives", null, 1, -1,
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
		initEReference(getObjective_Levels(), this.getLevel(), null, "levels", null, 1, -1, Objective.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_Setoffacts(), this.getSetOfFacts(), null, "setoffacts", null, 1, -1,
				Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_SuccessPercent(), ecorePackage.getEDouble(), "successPercent", null, 0, 1,
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
		initEReference(getLevel_CompletionCriteria(), this.getCompletionCriteria(), null, "completionCriteria", null, 1,
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
		initEAttribute(getMTCompletion1_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", "1", 0, 1,
				MTCompletion1.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCompletion1_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction", null, 0,
				1, MTCompletion1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(classroomEClass, Classroom.class, "Classroom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassroom_Gamecontext(), this.getGameContext(), null, "gamecontext", null, 1, 1,
				Classroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassroom_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Classroom.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassroom_LearnerPlayers(), this.getLearnerPlayers(), null, "learnerPlayers", null, 0, 1,
				Classroom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassroom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classroom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getLearnerPlayer_Statistics(), this.getStatistics(), null, "statistics", null, 0, 1,
				LearnerPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressionEClass, Progression.class, "Progression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgression_PlayerProgress(), this.getPlayerProgress(), null, "playerProgress", null, 0, 1,
				Progression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgression_LearnerProgress(), this.getLearnerProgress(), null, "learnerProgress", null, 0, 1,
				Progression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
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
		initEAttribute(getCurrentObjectiveLevel_SuccessPercent(), ecorePackage.getEDouble(), "successPercent", null, 0,
				1, CurrentObjectiveLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(responseModalityEClass, ResponseModality.class, "ResponseModality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_Type(), this.getEModality(), "type", "CHOICE", 0, 1, MultipleChoice.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_NbBadChoices(), ecorePackage.getEInt(), "nbBadChoices", null, 0, 1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_NbChoices(), ecorePackage.getEInt(), "nbChoices", null, 0, 1,
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
		initEReference(getATask_ResponseModality(), this.getResponseModality(), null, "responseModality", null, 1, 1,
				ATask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_ID(), theXMLTypePackage.getString(), "ID", null, 0, 1, ATask.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_MaxTime(), ecorePackage.getEInt(), "maxTime", "20", 0, 1, ATask.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATask_NbFacts(), ecorePackage.getEInt(), "nbFacts", "1", 0, 1, ATask.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getATask__GetType(), this.getETaskType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getATask__IsCheckOnLearnerAction(), ecorePackage.getEBoolean(), "isCheckOnLearnerAction", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getATask__GetNbExpectedAnswers(), ecorePackage.getEInt(), "getNbExpectedAnswers", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(completionTaskEClass, CompletionTask.class, "CompletionTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletionTask_Type(), this.getETaskType(), "type", "COMPLETE", 0, 1, CompletionTask.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompletionTask__GetNbMissingElements(), ecorePackage.getEInt(), "getNbMissingElements", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompletionTask__GetNbExpectedAnswers(), ecorePackage.getEInt(), "getNbExpectedAnswers", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(identificationTaskEClass, IdentificationTask.class, "IdentificationTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentificationTask_Type(), this.getETaskType(), "type", "IDENTIFY", 0, 1,
				IdentificationTask.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"false", 0, 1, IdentificationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIdentificationTask__GetNbExpectedAnswers(), ecorePackage.getEInt(), "getNbExpectedAnswers", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(membershipIDTaskEClass, MembershipIDTask.class, "MembershipIDTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembershipIDTask_Type(), this.getETaskType(), "type", "MEMBERSHIP", 0, 1,
				MembershipIDTask.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembershipIDTask_IdentifySharedProperty(), ecorePackage.getEBoolean(),
				"identifySharedProperty", "true", 0, 1, MembershipIDTask.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembershipIDTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"false", 0, 1, MembershipIDTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMembershipIDTask__GetNbExpectedAnswers(), ecorePackage.getEInt(), "getNbExpectedAnswers", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(mtCompletion2EClass, MTCompletion2.class, "MTCompletion2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTCompletion2_Targets(), this.getESeveralTarget(), "targets", null, 1, -1,
				MTCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCompletion2_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", "2", 0, 1,
				MTCompletion2.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCompletion2_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction", "true",
				0, 1, MTCompletion2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtRecontructionEClass, MTRecontruction.class, "MTRecontruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTRecontruction_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", "3", 0, 1,
				MTRecontruction.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTRecontruction_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction",
				"true", 0, 1, MTRecontruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getResultsByTask_SuccessPercent(), ecorePackage.getEDouble(), "successPercent", null, 0, 1,
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

		initEOperation(getQuestionableFact__GetCompleteFact(), ecorePackage.getEString(), "getCompleteFact", 0, 1,
				IS_UNIQUE, IS_ORDERED);

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
		initEReference(getQuestionedFact_Question(), this.getAQuestionParam(), null, "question", null, 0, 1,
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
		initEAttribute(getQuestionedFact_CompleteFact(), ecorePackage.getEString(), "completeFact", null, 0, 1,
				QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionedFact_FactCorrectness(), this.getFactCorrectnessParam(), null, "factCorrectness",
				null, 0, 1, QuestionedFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completionCriteriaEClass, CompletionCriteria.class, "CompletionCriteria", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletionCriteria_SuccessPercent(), ecorePackage.getEDouble(), "successPercent", "80.0", 0,
				1, CompletionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionCriteria_EncountersPercent(), ecorePackage.getEDouble(), "encountersPercent",
				"100.0", 0, 1, CompletionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelsDifficultyProgressEClass, LevelsDifficultyProgress.class, "LevelsDifficultyProgress",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelsDifficultyProgress_NbQRoomIncrease(), ecorePackage.getEInt(), "nbQRoomIncrease", "1", 0,
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
		initEReference(getLevelsDifficultyProgress_CursesAvailabilities(), this.getCurseEligibility(), null,
				"cursesAvailabilities", null, 0, -1, LevelsDifficultyProgress.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameElementTypesEClass, GameElementTypes.class, "GameElementTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameElementTypes_Equipments(), this.getEquipments(), null, "equipments", null, 0, 1,
				GameElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameElementTypes_ElementTypes(), this.getElementsTypes(), null, "elementTypes", null, 0, 1,
				GameElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameElementTypes_Curses(), this.getCurses(), null, "curses", null, 0, 1,
				GameElementTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementsTypesEClass, ElementsTypes.class, "ElementsTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementsTypes_Elements(), this.getElementType(), null, "elements", null, 0, -1,
				ElementsTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentsEClass, Equipments.class, "Equipments", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipments_Equipments(), this.getEquipment(), null, "equipments", null, 0, -1,
				Equipments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Equipment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipment_LockedAbilities(), this.getAbility(), this.getAbility_LockingEquipment(),
				"lockedAbilities", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameplayEClass, Gameplay.class, "Gameplay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameplay_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gameplay.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay_Components(), this.getAComponent(), null, "components", null, 0, -1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameplay_Prompt(), this.getPrompt(), null, "prompt", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_Undoable(), ecorePackage.getEBoolean(), "undoable", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameplay_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, Gameplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getQuestionableFactResult_OnTime(), ecorePackage.getEBoolean(), "onTime", null, 0, 1,
				QuestionableFactResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ability.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_LockingEquipment(), this.getEquipment(), this.getEquipment_LockedAbilities(),
				"lockingEquipment", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilitiesEClass, Abilities.class, "Abilities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbilities_Abilities(), this.getAbility(), null, "abilities", null, 0, -1, Abilities.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Size(), this.getElementSize(), "size", null, 0, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_RestrictedTo(), this.getAbility(), null, "restrictedTo", null, 0, -1, Position.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedElementEClass, PositionedElement.class, "PositionedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionedElement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, PositionedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Position(), this.getPosition(), null, "position", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Correctness(), this.getCorrectness(), null, "correctness", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Displays(), this.getDisplay(), null, "displays", null, 0, -1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_ExpectedAnswer(), this.getExpectedAnswer(), null, "expectedAnswer", null, 0,
				-1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_Fact(), this.getQuestionedFact(), null, "fact", null, 0, 1,
				PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_AcceptedFacts(), this.getFactSolutionParam(), null, "acceptedFacts", null,
				0, -1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_ElementType(), this.getElementType(), null, "elementType", null, 0, 1,
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
		initEReference(getQuestionParam_Solutions(), this.getFactSolutionParam(), null, "solutions", null, 0, -1,
				QuestionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propositionParamEClass, PropositionParam.class, "PropositionParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropositionParam_State(), this.getAValue(), null, "state", null, 0, 1, PropositionParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correctnessEClass, Correctness.class, "Correctness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(entrySoluceParamEClass, EntrySoluceParam.class, "EntrySoluceParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntrySoluceParam_State(), this.getECorrectness(), "state", null, 0, 1, EntrySoluceParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplay_Interactive(), ecorePackage.getEBoolean(), "interactive", null, 0, 1, Display.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplay_Correctness(), this.getCorrectness(), null, "correctness", null, 0, 1, Display.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aComponentEClass, AComponent.class, "AComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAComponent_AllowedAbility(), this.getAbility(), null, "allowedAbility", null, 0, 1,
				AComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAComponent_ExpectedSize(), this.getSize(), null, "expectedSize", null, 0, 1, AComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAComponent_ForProposition(), ecorePackage.getEBoolean(), "forProposition", "false", 0, 1,
				AComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAComponent_ForStatement(), ecorePackage.getEBoolean(), "forStatement", "false", 0, 1,
				AComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Components(), this.getAComponent(), null, "components", null, 0, -1,
				Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructure_AlternateComponents(), ecorePackage.getEBoolean(), "alternateComponents", null, 0,
				1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructure_ForFact(), ecorePackage.getEBoolean(), "forFact", null, 0, 1, Structure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_DisplayValue(), this.getDisplay(), null, "displayValue", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DefaultCorrectness(), this.getCorrectness(), null, "defaultCorrectness", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_InputEntry(), ecorePackage.getEBoolean(), "inputEntry", "false", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Quantity(), this.getQuantity(), null, "quantity", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantity_FactNbAnswers(), ecorePackage.getEBoolean(), "factNbAnswers", "false", 0, 1,
				Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(wantedAnswersParamEClass, WantedAnswersParam.class, "WantedAnswersParam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedAnswerEClass, ExpectedAnswer.class, "ExpectedAnswer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(correctnessValueEClass, CorrectnessValue.class, "CorrectnessValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrectnessValue_Value(), this.getECorrectness(), "value", null, 0, 1, CorrectnessValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aValueEClass, AValue.class, "AValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionedStructureElementEClass, PositionedStructureElement.class, "PositionedStructureElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionedStructureElement_CreatedPosition(), this.getPosition(), null, "createdPosition",
				null, 0, 1, PositionedStructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factSolutionParamEClass, FactSolutionParam.class, "FactSolutionParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderingTaskEClass, OrderingTask.class, "OrderingTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderingTask_Type(), this.getETaskType(), "type", "ORDER", 0, 1, OrderingTask.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderingTask_CheckLearnerAction(), ecorePackage.getEBoolean(), "checkLearnerAction", "true",
				0, 1, OrderingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderingTask__NbExpectedAnswers(), ecorePackage.getEInt(), "nbExpectedAnswers", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(promptEClass, Prompt.class, "Prompt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrompt_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, Prompt.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factCorrectnessParamEClass, FactCorrectnessParam.class, "FactCorrectnessParam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gameplayTaskRelationsEClass, GameplayTaskRelations.class, "GameplayTaskRelations", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameplayTaskRelations_Relations(), this.getRelation(), null, "relations", null, 0, -1,
				GameplayTaskRelations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Task(), this.getETaskType(), "task", null, 0, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Gameplays(), this.getGPCategory(), "gameplays", null, 1, -1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Condition(), this.getCondition(), null, "condition", null, 1, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_StatementTypes(), this.getEStatementType(), "statementTypes", null, 1, -1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_NbFacts(), this.getEBoundary(), "nbFacts", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_AnswerModality(), this.getEModality(), "answerModality", null, 0, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_NbExpectedAnswers(), this.getEBoundary(), "nbExpectedAnswers", null, 0, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(questionGameplayEClass, QuestionGameplay.class, "QuestionGameplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionGameplay_ManualValidation(), ecorePackage.getEBoolean(), "manualValidation", "false",
				0, 1, QuestionGameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionGameplay_Category(), this.getGPCategory(), "category", null, 0, 1,
				QuestionGameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionGameplay_HasIntegratedPropositions(), ecorePackage.getEBoolean(),
				"hasIntegratedPropositions", null, 0, 1, QuestionGameplay.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionGameplay_RestrictedTo(), this.getETaskType(), "restrictedTo", null, 0, -1,
				QuestionGameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionGameplay_StatementType(), this.getEStatementType(), "statementType", null, 0, 1,
				QuestionGameplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(noQuestionGameplayEClass, NoQuestionGameplay.class, "NoQuestionGameplay", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementElementTypeEClass, StatementElementType.class, "StatementElementType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatementElementType_ForStructure(), ecorePackage.getEBoolean(), "forStructure", null, 0, 1,
				StatementElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerProgressEClass, PlayerProgress.class, "PlayerProgress", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerProgress_CurrentLevel(), ecorePackage.getEInt(), "currentLevel", "1", 0, 1,
				PlayerProgress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProgress_Coins(), ecorePackage.getEInt(), "coins", "0", 0, 1, PlayerProgress.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayerProgress_Items(), this.getItems(), null, "items", null, 0, 1, PlayerProgress.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learnerProgressEClass, LearnerProgress.class, "LearnerProgress", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearnerProgress_Currentobjectivelevels(), this.getCurrentObjectiveLevel(), null,
				"currentobjectivelevels", null, 0, -1, LearnerProgress.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Bought(), ecorePackage.getEBoolean(), "bought", "true", 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Activated(), ecorePackage.getEBoolean(), "activated", "true", 0, 1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Equipment(), this.getEquipment(), null, "equipment", null, 0, 1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemsEClass, Items.class, "Items", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItems_Items(), this.getItem(), null, "items", null, 0, -1, Items.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(learnerPlayersEClass, LearnerPlayers.class, "LearnerPlayers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearnerPlayers_LearnerPlayers(), this.getLearnerPlayer(), null, "learnerPlayers", null, 0, -1,
				LearnerPlayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticsEClass, Statistics.class, "Statistics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatistics_NbCorrectGivenAnswers(), ecorePackage.getEInt(), "nbCorrectGivenAnswers", null, 0,
				1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_NbQuestionsEncountered(), ecorePackage.getEInt(), "nbQuestionsEncountered", null,
				0, 1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_MaxGameLevelReached(), ecorePackage.getEInt(), "maxGameLevelReached", null, 0, 1,
				Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_TotalTimeMin(), ecorePackage.getEInt(), "totalTimeMin", null, 0, 1,
				Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_NbDeaths(), ecorePackage.getEInt(), "nbDeaths", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_NbLevelsGenerated(), ecorePackage.getEInt(), "nbLevelsGenerated", null, 0, 1,
				Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_NbFinishedLevels(), ecorePackage.getEInt(), "nbFinishedLevels", null, 0, 1,
				Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_NbUnfinishedLevels(), ecorePackage.getEInt(), "nbUnfinishedLevels", null, 0, 1,
				Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_TotalCoins(), ecorePackage.getEInt(), "totalCoins", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_Size(), this.getElementSize(), "size", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_ID(), ecorePackage.getEString(), "ID", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_NbDisplays(), ecorePackage.getEInt(), "nbDisplays", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementType_Ability(), this.getAbility(), null, "ability", null, 0, 1, ElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElementType__IsDisplayableElement(), ecorePackage.getEBoolean(), "isDisplayableElement", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(cursesEClass, Curses.class, "Curses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurses_Curses(), this.getCurse(), null, "curses", null, 0, -1, Curses.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(curseEClass, Curse.class, "Curse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Curse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labyrinthCurseEClass, LabyrinthCurse.class, "LabyrinthCurse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(curseEligibilityEClass, CurseEligibility.class, "CurseEligibility", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurseEligibility_StartLevel(), ecorePackage.getEInt(), "startLevel", null, 0, 1,
				CurseEligibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCurseEligibility_Curse(), this.getCurse(), null, "curse", null, 1, 1, CurseEligibility.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Positions(), this.getMapElementPosition(), null, "positions", null, 0, -1, Map.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapElementPositionEClass, MapElementPosition.class, "MapElementPosition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapElementPosition_ID(), ecorePackage.getEString(), "ID", null, 0, 1,
				MapElementPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(legendSymbolEClass, LegendSymbol.class, "LegendSymbol", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegendSymbol_Image(), this.getImage(), null, "image", null, 1, 1, LegendSymbol.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegendSymbol_Position(), this.getMapElementPosition(), null, "position", null, 1, 1,
				LegendSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legendTextEClass, LegendText.class, "LegendText", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegendText_Text(), ecorePackage.getEString(), "text", null, 0, 1, LegendText.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegendText_Position(), this.getMapElementPosition(), null, "position", null, 1, 1,
				LegendText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historyFactEClass, HistoryFact.class, "HistoryFact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoryFact_Event(), ecorePackage.getEString(), "event", null, 0, 1, HistoryFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoryFact_Image(), this.getImage(), null, "image", null, 0, 1, HistoryFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoryFact_Time(), this.getTime(), null, "time", null, 1, 1, HistoryFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographyLegendFactEClass, GeographyLegendFact.class, "GeographyLegendFact", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeographyLegendFact_Map(), this.getMap(), null, "map", null, 1, 1, GeographyLegendFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeographyLegendFact_Symbol(), this.getLegendSymbol(), null, "symbol", null, 1, 1,
				GeographyLegendFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeographyLegendFact_Legend(), this.getLegendText(), null, "legend", null, 1, 1,
				GeographyLegendFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographyFactEClass, GeographyFact.class, "GeographyFact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeographyFact_Map(), this.getMap(), null, "map", null, 1, 1, GeographyFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeographyFact_Position(), this.getMapElementPosition(), null, "position", null, 1, 1,
				GeographyFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeographyFact_Value(), this.getEGeographyValue(), "value", null, 0, 1, GeographyFact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Day(), ecorePackage.getEString(), "day", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), ecorePackage.getEString(), "month", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Year(), ecorePackage.getEString(), "year", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDate_Position(), this.getMapElementPosition(), null, "position", null, 1, 1, Date.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePeriodEClass, TimePeriod.class, "TimePeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePeriod_StartYear(), ecorePackage.getEString(), "startYear", null, 0, 1, TimePeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriod_EndYear(), ecorePackage.getEString(), "endYear", null, 0, 1, TimePeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimePeriod_Positions(), this.getMapElementPosition(), null, "positions", null, 2, 2,
				TimePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapValueEClass, MapValue.class, "MapValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMapValue__IsCorrectValue(), ecorePackage.getEBoolean(), "isCorrectValue", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTime_Map(), this.getMap(), null, "map", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aQuestionParamEClass, AQuestionParam.class, "AQuestionParam", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapQuestionParamEClass, MapQuestionParam.class, "MapQuestionParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapQuestionParam_Map(), this.getMap(), null, "map", null, 1, 1, MapQuestionParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hAssociationEClass, HAssociation.class, "HAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHAssociation_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", "1", 0, 1,
				HAssociation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAssociation_Source(), this.getEHistoryTarget(), "source", null, 0, 1, HAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAssociation_Missing(), this.getEHistoryTarget(), "missing", "TIME", 0, 1, HAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hLegendEClass, HLegend.class, "HLegend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHLegend_NbMissingElements(), ecorePackage.getEInt(), "nbMissingElements", "1", 0, 1,
				HLegend.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHLegend_Missing(), this.getELegendTarget(), "missing", "", 0, 1, HLegend.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gLocateEClass, GLocate.class, "GLocate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGLocate_NbExpectedAnswers(), ecorePackage.getEInt(), "nbExpectedAnswers", null, 0, 1,
				GLocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGLocate_LearnersChoices(), ecorePackage.getEBoolean(), "learnersChoices", null, 0, 1,
				GLocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(teacherEClass, Teacher.class, "Teacher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeacher_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Teacher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Classrooms(), this.getClassroom(), null, "classrooms", null, 0, -1, Teacher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teachersEClass, Teachers.class, "Teachers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeachers_Teachers(), this.getTeacher(), null, "teachers", null, 0, -1, Teachers.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.COMPLETE);
		addEEnumLiteral(eTaskTypeEEnum, ETaskType.ORDER);
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
		addEEnumLiteral(elementSizeEEnum, ElementSize.XLARGE);

		initEEnum(gpCategoryEEnum, GPCategory.class, "GPCategory");
		addEEnumLiteral(gpCategoryEEnum, GPCategory.SELECT_UNIQUE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.SELECT_MULTIPLE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.DIRECT_RESPONSE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.MOVE_UNIQUE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.MOVE_MULTIPLE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.ORIENT_UNIQUE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.ORIENT_MULTIPLE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.POSITION_UNIQUE);
		addEEnumLiteral(gpCategoryEEnum, GPCategory.POSITION_MULTIPLE);

		initEEnum(eCorrectnessEEnum, ECorrectness.class, "ECorrectness");
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.CORRECT);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.INCORRECT);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.FACT_CORRECTNESS);
		addEEnumLiteral(eCorrectnessEEnum, ECorrectness.NOT_FACT_CORRECTNESS);

		initEEnum(eBoundaryEEnum, EBoundary.class, "EBoundary");
		addEEnumLiteral(eBoundaryEEnum, EBoundary.ONE);
		addEEnumLiteral(eBoundaryEEnum, EBoundary.SUP_ONE);
		addEEnumLiteral(eBoundaryEEnum, EBoundary.SUP_EQ_ONE);
		addEEnumLiteral(eBoundaryEEnum, EBoundary.EQ_NB_FACTS);
		addEEnumLiteral(eBoundaryEEnum, EBoundary.SUP_NB_FACTS);

		initEEnum(eRoomTypeEEnum, ERoomType.class, "ERoomType");
		addEEnumLiteral(eRoomTypeEEnum, ERoomType.ENTRY);
		addEEnumLiteral(eRoomTypeEEnum, ERoomType.EXIT);
		addEEnumLiteral(eRoomTypeEEnum, ERoomType.QUESTION);
		addEEnumLiteral(eRoomTypeEEnum, ERoomType.TRAP);

		initEEnum(eGeographyValueEEnum, EGeographyValue.class, "EGeographyValue");
		addEEnumLiteral(eGeographyValueEEnum, EGeographyValue.CITY);
		addEEnumLiteral(eGeographyValueEEnum, EGeographyValue.COUNTRY);

		initEEnum(eHistoryTargetEEnum, EHistoryTarget.class, "EHistoryTarget");
		addEEnumLiteral(eHistoryTargetEEnum, EHistoryTarget.EVENT);
		addEEnumLiteral(eHistoryTargetEEnum, EHistoryTarget.TIME);
		addEEnumLiteral(eHistoryTargetEEnum, EHistoryTarget.IMAGE);

		initEEnum(eLegendTargetEEnum, ELegendTarget.class, "ELegendTarget");
		addEEnumLiteral(eLegendTargetEEnum, ELegendTarget.SYMBOL);
		addEEnumLiteral(eLegendTargetEEnum, ELegendTarget.TEXT);

		initEEnum(eStatementTypeEEnum, EStatementType.class, "EStatementType");
		addEEnumLiteral(eStatementTypeEEnum, EStatementType.CLASSIC);
		addEEnumLiteral(eStatementTypeEEnum, EStatementType.FILL_IN);
		addEEnumLiteral(eStatementTypeEEnum, EStatementType.GRAPHIC);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
