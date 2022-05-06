/**
 */
package generatorMetamodels.impl;

import generatorMetamodels.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorMetamodelsFactoryImpl extends EFactoryImpl implements GeneratorMetamodelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorMetamodelsFactory init() {
		try {
			GeneratorMetamodelsFactory theGeneratorMetamodelsFactory = (GeneratorMetamodelsFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratorMetamodelsPackage.eNS_URI);
			if (theGeneratorMetamodelsFactory != null) {
				return theGeneratorMetamodelsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorMetamodelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorMetamodelsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GeneratorMetamodelsPackage.MULTIPLE_CHOICE:
			return createMultipleChoice();
		case GeneratorMetamodelsPackage.RESULT_VERIFICATION:
			return createResultVerification();
		case GeneratorMetamodelsPackage.SET_OF_FACTS:
			return createSetOfFacts();
		case GeneratorMetamodelsPackage.PROBLEM_RESOLUTION:
			return createProblemResolution();
		case GeneratorMetamodelsPackage.EXIT_ROOM:
			return createExitRoom();
		case GeneratorMetamodelsPackage.MULTIPLE_COMPLETION:
			return createMultipleCompletion();
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION:
			return createCurrentProgression();
		case GeneratorMetamodelsPackage.DUNGEON:
			return createDungeon();
		case GeneratorMetamodelsPackage.INPUT:
			return createInput();
		case GeneratorMetamodelsPackage.LEARNING_PATH:
			return createLearningPath();
		case GeneratorMetamodelsPackage.SIMPLE_QUESTION_ROOM:
			return createSimpleQuestionRoom();
		case GeneratorMetamodelsPackage.FACT:
			return createFact();
		case GeneratorMetamodelsPackage.LEARNER_PLAYER:
			return createLearnerPlayer();
		case GeneratorMetamodelsPackage.HIGH_LEVEL_ACTIVITY:
			return createHighLevelActivity();
		case GeneratorMetamodelsPackage.ENTRY_ROOM:
			return createEntryRoom();
		case GeneratorMetamodelsPackage.DOOR:
			return createDoor();
		case GeneratorMetamodelsPackage.BOSS_ROOM:
			return createBossRoom();
		case GeneratorMetamodelsPackage.RECONSTRUCTION:
			return createReconstruction();
		case GeneratorMetamodelsPackage.SIMPLE_COMPLETION:
			return createSimpleCompletion();
		case GeneratorMetamodelsPackage.GAME_PROFILE:
			return createGameProfile();
		case GeneratorMetamodelsPackage.LEARNING_PROFILE:
			return createLearningProfile();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE:
			return createLearningObjective();
		case GeneratorMetamodelsPackage.LEVEL:
			return createLevel();
		case GeneratorMetamodelsPackage.KNOWLEDGE:
			return createKnowledge();
		case GeneratorMetamodelsPackage.FACT_VALIDITY_VERIFICATION:
			return createFactValidityVerification();
		case GeneratorMetamodelsPackage.GAMING_OBJECTIVE:
			return createGamingObjective();
		case GeneratorMetamodelsPackage.GAME_DOMAIN:
			return createGameDomain();
		case GeneratorMetamodelsPackage.CONCEPTUAL_ELEMENT:
			return createConceptualElement();
		case GeneratorMetamodelsPackage.CONCRETE_ELEMENT:
			return createConcreteElement();
		case GeneratorMetamodelsPackage.ROOM_TYPE_TO_EINT_MAP:
			return (EObject) createRoomTypeToEIntMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GeneratorMetamodelsPackage.GAME_MODE:
			return createGameModeFromString(eDataType, initialValue);
		case GeneratorMetamodelsPackage.ROOM_TYPE:
			return createRoomTypeFromString(eDataType, initialValue);
		case GeneratorMetamodelsPackage.GAME_ELEMENT_TYPE:
			return createGameElementTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GeneratorMetamodelsPackage.GAME_MODE:
			return convertGameModeToString(eDataType, instanceValue);
		case GeneratorMetamodelsPackage.ROOM_TYPE:
			return convertRoomTypeToString(eDataType, instanceValue);
		case GeneratorMetamodelsPackage.GAME_ELEMENT_TYPE:
			return convertGameElementTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultVerification createResultVerification() {
		ResultVerificationImpl resultVerification = new ResultVerificationImpl();
		return resultVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOfFacts createSetOfFacts() {
		SetOfFactsImpl setOfFacts = new SetOfFactsImpl();
		return setOfFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemResolution createProblemResolution() {
		ProblemResolutionImpl problemResolution = new ProblemResolutionImpl();
		return problemResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitRoom createExitRoom() {
		ExitRoomImpl exitRoom = new ExitRoomImpl();
		return exitRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleCompletion createMultipleCompletion() {
		MultipleCompletionImpl multipleCompletion = new MultipleCompletionImpl();
		return multipleCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentProgression createCurrentProgression() {
		CurrentProgressionImpl currentProgression = new CurrentProgressionImpl();
		return currentProgression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dungeon createDungeon() {
		DungeonImpl dungeon = new DungeonImpl();
		return dungeon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningPath createLearningPath() {
		LearningPathImpl learningPath = new LearningPathImpl();
		return learningPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuestionRoom createSimpleQuestionRoom() {
		SimpleQuestionRoomImpl simpleQuestionRoom = new SimpleQuestionRoomImpl();
		return simpleQuestionRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact createFact() {
		FactImpl fact = new FactImpl();
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnerPlayer createLearnerPlayer() {
		LearnerPlayerImpl learnerPlayer = new LearnerPlayerImpl();
		return learnerPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelActivity createHighLevelActivity() {
		HighLevelActivityImpl highLevelActivity = new HighLevelActivityImpl();
		return highLevelActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRoom createEntryRoom() {
		EntryRoomImpl entryRoom = new EntryRoomImpl();
		return entryRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BossRoom createBossRoom() {
		BossRoomImpl bossRoom = new BossRoomImpl();
		return bossRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconstruction createReconstruction() {
		ReconstructionImpl reconstruction = new ReconstructionImpl();
		return reconstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCompletion createSimpleCompletion() {
		SimpleCompletionImpl simpleCompletion = new SimpleCompletionImpl();
		return simpleCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameProfile createGameProfile() {
		GameProfileImpl gameProfile = new GameProfileImpl();
		return gameProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningProfile createLearningProfile() {
		LearningProfileImpl learningProfile = new LearningProfileImpl();
		return learningProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective createLearningObjective() {
		LearningObjectiveImpl learningObjective = new LearningObjectiveImpl();
		return learningObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactValidityVerification createFactValidityVerification() {
		FactValidityVerificationImpl factValidityVerification = new FactValidityVerificationImpl();
		return factValidityVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamingObjective createGamingObjective() {
		GamingObjectiveImpl gamingObjective = new GamingObjectiveImpl();
		return gamingObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDomain createGameDomain() {
		GameDomainImpl gameDomain = new GameDomainImpl();
		return gameDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualElement createConceptualElement() {
		ConceptualElementImpl conceptualElement = new ConceptualElementImpl();
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteElement createConcreteElement() {
		ConcreteElementImpl concreteElement = new ConcreteElementImpl();
		return concreteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<RoomType, Integer> createRoomTypeToEIntMap() {
		RoomTypeToEIntMapImpl roomTypeToEIntMap = new RoomTypeToEIntMapImpl();
		return roomTypeToEIntMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMode createGameModeFromString(EDataType eDataType, String initialValue) {
		GameMode result = GameMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGameModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomTypeFromString(EDataType eDataType, String initialValue) {
		RoomType result = RoomType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameElementType createGameElementTypeFromString(EDataType eDataType, String initialValue) {
		GameElementType result = GameElementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGameElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorMetamodelsPackage getGeneratorMetamodelsPackage() {
		return (GeneratorMetamodelsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorMetamodelsPackage getPackage() {
		return GeneratorMetamodelsPackage.eINSTANCE;
	}

} //GeneratorMetamodelsFactoryImpl
