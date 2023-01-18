/**
 */
package generator.impl;

import generator.*;

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
public class GeneratorFactoryImpl extends EFactoryImpl implements GeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorFactory init() {
		try {
			GeneratorFactory theGeneratorFactory = (GeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratorPackage.eNS_URI);
			if (theGeneratorFactory != null) {
				return theGeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactoryImpl() {
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
		case GeneratorPackage.SET_OF_FACTS:
			return createSetOfFacts();
		case GeneratorPackage.KNOWLEDGE:
			return createKnowledge();
		case GeneratorPackage.DUNGEON:
			return createDungeon();
		case GeneratorPackage.ROOM:
			return createRoom();
		case GeneratorPackage.GAME_DESCRIPTION:
			return createGameDescription();
		case GeneratorPackage.SMALL_ROOM_TYPE:
			return createSmallRoomType();
		case GeneratorPackage.LARGE_ROOM_TYPE:
			return createLargeRoomType();
		case GeneratorPackage.ROOM_ACCESS:
			return createRoomAccess();
		case GeneratorPackage.GAME_CONTEXT:
			return createGameContext();
		case GeneratorPackage.LEARNING_DOMAIN:
			return createLearningDomain();
		case GeneratorPackage.LEARNING_PATH:
			return createLearningPath();
		case GeneratorPackage.OBJECTIVE:
			return createObjective();
		case GeneratorPackage.PREREQUISITE:
			return createPrerequisite();
		case GeneratorPackage.MT_LEVEL:
			return createMTLevel();
		case GeneratorPackage.MT_COMPLETION1:
			return createMTCompletion1();
		case GeneratorPackage.GENERATION_CONTEXT:
			return createGenerationContext();
		case GeneratorPackage.LEARNER_PLAYER:
			return createLearnerPlayer();
		case GeneratorPackage.PROGRESSION:
			return createProgression();
		case GeneratorPackage.CURRENT_OBJECTIVE_LEVEL:
			return createCurrentObjectiveLevel();
		case GeneratorPackage.POSITION:
			return createPosition();
		case GeneratorPackage.MULTIPLE_CHOICE:
			return createMultipleChoice();
		case GeneratorPackage.ENTER_RESPONSE:
			return createEnterResponse();
		case GeneratorPackage.ROOM_TYPES:
			return createRoomTypes();
		case GeneratorPackage.MT_COMPLETION2:
			return createMTCompletion2();
		case GeneratorPackage.MT_RECONTRUCTION:
			return createMTRecontruction();
		case GeneratorPackage.MT_IDENTIFICATION:
			return createMTIdentification();
		case GeneratorPackage.MT_MEMBERSHIP:
			return createMTMembership();
		case GeneratorPackage.RESULTS:
			return createResults();
		case GeneratorPackage.RESULTS_BY_TASK:
			return createResultsByTask();
		case GeneratorPackage.QF_RESULTS:
			return createQFResults();
		case GeneratorPackage.MT_FACT:
			return createMTFact();
		case GeneratorPackage.MT_RESULT_FACT:
			return createMTResultFact();
		case GeneratorPackage.MTQF_COMPLETION1:
			return createMTQFCompletion1();
		case GeneratorPackage.MTQF_COMPLETION2:
			return createMTQFCompletion2();
		case GeneratorPackage.MTQF_REBUILD:
			return createMTQFRebuild();
		case GeneratorPackage.MTQF_IDENTIFICATION:
			return createMTQFIdentification();
		case GeneratorPackage.MTQF_MEMBERSHIP:
			return createMTQFMembership();
		case GeneratorPackage.MT_QE_FCOMPLETION1:
			return createMTQeFCompletion1();
		case GeneratorPackage.MT_QE_FCOMPLETION2:
			return createMTQeFCompletion2();
		case GeneratorPackage.MT_QE_FREBUILD:
			return createMTQeFRebuild();
		case GeneratorPackage.MT_QE_FIDENTICATION:
			return createMTQeFIdentication();
		case GeneratorPackage.MT_QE_FMEMBERSHIP:
			return createMTQeFMembership();
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
		case GeneratorPackage.DIRECTIONS:
			return createDirectionsFromString(eDataType, initialValue);
		case GeneratorPackage.DUNGEON_MODE:
			return createDungeonModeFromString(eDataType, initialValue);
		case GeneratorPackage.TABLE_BUILD:
			return createTableBuildFromString(eDataType, initialValue);
		case GeneratorPackage.RESULT_POSITION:
			return createResultPositionFromString(eDataType, initialValue);
		case GeneratorPackage.ESINGLE_TARGET:
			return createESingleTargetFromString(eDataType, initialValue);
		case GeneratorPackage.ETASK_TYPE:
			return createETaskTypeFromString(eDataType, initialValue);
		case GeneratorPackage.EMODALITY:
			return createEModalityFromString(eDataType, initialValue);
		case GeneratorPackage.ESEVERAL_TARGET:
			return createESeveralTargetFromString(eDataType, initialValue);
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
		case GeneratorPackage.DIRECTIONS:
			return convertDirectionsToString(eDataType, instanceValue);
		case GeneratorPackage.DUNGEON_MODE:
			return convertDungeonModeToString(eDataType, instanceValue);
		case GeneratorPackage.TABLE_BUILD:
			return convertTableBuildToString(eDataType, instanceValue);
		case GeneratorPackage.RESULT_POSITION:
			return convertResultPositionToString(eDataType, instanceValue);
		case GeneratorPackage.ESINGLE_TARGET:
			return convertESingleTargetToString(eDataType, instanceValue);
		case GeneratorPackage.ETASK_TYPE:
			return convertETaskTypeToString(eDataType, instanceValue);
		case GeneratorPackage.EMODALITY:
			return convertEModalityToString(eDataType, instanceValue);
		case GeneratorPackage.ESEVERAL_TARGET:
			return convertESeveralTargetToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
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
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDescription createGameDescription() {
		GameDescriptionImpl gameDescription = new GameDescriptionImpl();
		return gameDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallRoomType createSmallRoomType() {
		SmallRoomTypeImpl smallRoomType = new SmallRoomTypeImpl();
		return smallRoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeRoomType createLargeRoomType() {
		LargeRoomTypeImpl largeRoomType = new LargeRoomTypeImpl();
		return largeRoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAccess createRoomAccess() {
		RoomAccessImpl roomAccess = new RoomAccessImpl();
		return roomAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameContext createGameContext() {
		GameContextImpl gameContext = new GameContextImpl();
		return gameContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDomain createLearningDomain() {
		LearningDomainImpl learningDomain = new LearningDomainImpl();
		return learningDomain;
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
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prerequisite createPrerequisite() {
		PrerequisiteImpl prerequisite = new PrerequisiteImpl();
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTLevel createMTLevel() {
		MTLevelImpl mtLevel = new MTLevelImpl();
		return mtLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCompletion1 createMTCompletion1() {
		MTCompletion1Impl mtCompletion1 = new MTCompletion1Impl();
		return mtCompletion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationContext createGenerationContext() {
		GenerationContextImpl generationContext = new GenerationContextImpl();
		return generationContext;
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
	public Progression createProgression() {
		ProgressionImpl progression = new ProgressionImpl();
		return progression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentObjectiveLevel createCurrentObjectiveLevel() {
		CurrentObjectiveLevelImpl currentObjectiveLevel = new CurrentObjectiveLevelImpl();
		return currentObjectiveLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
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
	public EnterResponse createEnterResponse() {
		EnterResponseImpl enterResponse = new EnterResponseImpl();
		return enterResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes createRoomTypes() {
		RoomTypesImpl roomTypes = new RoomTypesImpl();
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCompletion2 createMTCompletion2() {
		MTCompletion2Impl mtCompletion2 = new MTCompletion2Impl();
		return mtCompletion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTRecontruction createMTRecontruction() {
		MTRecontructionImpl mtRecontruction = new MTRecontructionImpl();
		return mtRecontruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTIdentification createMTIdentification() {
		MTIdentificationImpl mtIdentification = new MTIdentificationImpl();
		return mtIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMembership createMTMembership() {
		MTMembershipImpl mtMembership = new MTMembershipImpl();
		return mtMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsByTask createResultsByTask() {
		ResultsByTaskImpl resultsByTask = new ResultsByTaskImpl();
		return resultsByTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFResults createQFResults() {
		QFResultsImpl qfResults = new QFResultsImpl();
		return qfResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTFact createMTFact() {
		MTFactImpl mtFact = new MTFactImpl();
		return mtFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTResultFact createMTResultFact() {
		MTResultFactImpl mtResultFact = new MTResultFactImpl();
		return mtResultFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion1 createMTQFCompletion1() {
		MTQFCompletion1Impl mtqfCompletion1 = new MTQFCompletion1Impl();
		return mtqfCompletion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFCompletion2 createMTQFCompletion2() {
		MTQFCompletion2Impl mtqfCompletion2 = new MTQFCompletion2Impl();
		return mtqfCompletion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFRebuild createMTQFRebuild() {
		MTQFRebuildImpl mtqfRebuild = new MTQFRebuildImpl();
		return mtqfRebuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFIdentification createMTQFIdentification() {
		MTQFIdentificationImpl mtqfIdentification = new MTQFIdentificationImpl();
		return mtqfIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFMembership createMTQFMembership() {
		MTQFMembershipImpl mtqfMembership = new MTQFMembershipImpl();
		return mtqfMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFCompletion1 createMTQeFCompletion1() {
		MTQeFCompletion1Impl mtQeFCompletion1 = new MTQeFCompletion1Impl();
		return mtQeFCompletion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFCompletion2 createMTQeFCompletion2() {
		MTQeFCompletion2Impl mtQeFCompletion2 = new MTQeFCompletion2Impl();
		return mtQeFCompletion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFRebuild createMTQeFRebuild() {
		MTQeFRebuildImpl mtQeFRebuild = new MTQeFRebuildImpl();
		return mtQeFRebuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFIdentication createMTQeFIdentication() {
		MTQeFIdenticationImpl mtQeFIdentication = new MTQeFIdenticationImpl();
		return mtQeFIdentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQeFMembership createMTQeFMembership() {
		MTQeFMembershipImpl mtQeFMembership = new MTQeFMembershipImpl();
		return mtQeFMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directions createDirectionsFromString(EDataType eDataType, String initialValue) {
		Directions result = Directions.get(initialValue);
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
	public String convertDirectionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DungeonMode createDungeonModeFromString(EDataType eDataType, String initialValue) {
		DungeonMode result = DungeonMode.get(initialValue);
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
	public String convertDungeonModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableBuild createTableBuildFromString(EDataType eDataType, String initialValue) {
		TableBuild result = TableBuild.get(initialValue);
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
	public String convertTableBuildToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPosition createResultPositionFromString(EDataType eDataType, String initialValue) {
		ResultPosition result = ResultPosition.get(initialValue);
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
	public String convertResultPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESingleTarget createESingleTargetFromString(EDataType eDataType, String initialValue) {
		ESingleTarget result = ESingleTarget.get(initialValue);
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
	public String convertESingleTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskType createETaskTypeFromString(EDataType eDataType, String initialValue) {
		ETaskType result = ETaskType.get(initialValue);
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
	public String convertETaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModality createEModalityFromString(EDataType eDataType, String initialValue) {
		EModality result = EModality.get(initialValue);
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
	public String convertEModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESeveralTarget createESeveralTargetFromString(EDataType eDataType, String initialValue) {
		ESeveralTarget result = ESeveralTarget.get(initialValue);
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
	public String convertESeveralTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorPackage getGeneratorPackage() {
		return (GeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorPackage getPackage() {
		return GeneratorPackage.eINSTANCE;
	}

} //GeneratorFactoryImpl
