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
		case GeneratorMetamodelsPackage.SET_OF_FACTS:
			return createSetOfFacts();
		case GeneratorMetamodelsPackage.EXIT_ROOM:
			return createExitRoom();
		case GeneratorMetamodelsPackage.CURRENT_PROGRESSION:
			return createCurrentProgression();
		case GeneratorMetamodelsPackage.DUNGEON:
			return createDungeon();
		case GeneratorMetamodelsPackage.INPUT:
			return createInput();
		case GeneratorMetamodelsPackage.LEARNING_PATH:
			return createLearningPath();
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
		case GeneratorMetamodelsPackage.GAME_PROFILE:
			return createGameProfile();
		case GeneratorMetamodelsPackage.LEARNING_PROFILE:
			return createLearningProfile();
		case GeneratorMetamodelsPackage.LEARNING_OBJECTIVE:
			return createLearningObjective();
		case GeneratorMetamodelsPackage.KNOWLEDGE:
			return createKnowledge();
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
		case GeneratorMetamodelsPackage.LEARNING_PATHS:
			return createLearningPaths();
		case GeneratorMetamodelsPackage.DOORS3_ROOM:
			return createDoors3Room();
		case GeneratorMetamodelsPackage.CHESTS3_ROOM:
			return createChests3Room();
		case GeneratorMetamodelsPackage.ADAPTED_LEARNING_GAME_ACTIVITY:
			return createAdaptedLearningGameActivity();
		case GeneratorMetamodelsPackage.MTQF_ONE_COMPLETION:
			return createMTQFOneCompletion();
		case GeneratorMetamodelsPackage.MT_LEVEL:
			return createMTLevel();
		case GeneratorMetamodelsPackage.DIMENSIONS_ENTANGLEMENT:
			return createDimensionsEntanglement();
		case GeneratorMetamodelsPackage.ROOM2_SUB_OBJECTIVE_COMPLIANCE:
			return createRoom2SubObjectiveCompliance();
		case GeneratorMetamodelsPackage.PREREQUISITE:
			return createPrerequisite();
		case GeneratorMetamodelsPackage.MT_TABLE_BUILDING:
			return createMTTableBuilding();
		case GeneratorMetamodelsPackage.MT_RESULT_POSITION:
			return createMTResultPosition();
		case GeneratorMetamodelsPackage.MT_LEVEL_PARAM:
			return createMTLevelParam();
		case GeneratorMetamodelsPackage.PARAMETER2_ROOM_INCOMPLIANCE:
			return createParameter2RoomIncompliance();
		case GeneratorMetamodelsPackage.PARAM_E2_ROOM_COMPLIANCE:
			return createParamE2RoomCompliance();
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
		case GeneratorMetamodelsPackage.TABLE_BUILD:
			return createTableBuildFromString(eDataType, initialValue);
		case GeneratorMetamodelsPackage.RESULT_POSITION:
			return createResultPositionFromString(eDataType, initialValue);
		case GeneratorMetamodelsPackage.TARGET_ELEMENT:
			return createTargetElementFromString(eDataType, initialValue);
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE_TYPE:
			return createSubObjectiveTypeFromString(eDataType, initialValue);
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
		case GeneratorMetamodelsPackage.TABLE_BUILD:
			return convertTableBuildToString(eDataType, instanceValue);
		case GeneratorMetamodelsPackage.RESULT_POSITION:
			return convertResultPositionToString(eDataType, instanceValue);
		case GeneratorMetamodelsPackage.TARGET_ELEMENT:
			return convertTargetElementToString(eDataType, instanceValue);
		case GeneratorMetamodelsPackage.SUB_OBJECTIVE_TYPE:
			return convertSubObjectiveTypeToString(eDataType, instanceValue);
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
	public SetOfFacts createSetOfFacts() {
		SetOfFactsImpl setOfFacts = new SetOfFactsImpl();
		return setOfFacts;
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
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
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
	public LearningPaths createLearningPaths() {
		LearningPathsImpl learningPaths = new LearningPathsImpl();
		return learningPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doors3Room createDoors3Room() {
		Doors3RoomImpl doors3Room = new Doors3RoomImpl();
		return doors3Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chests3Room createChests3Room() {
		Chests3RoomImpl chests3Room = new Chests3RoomImpl();
		return chests3Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptedLearningGameActivity createAdaptedLearningGameActivity() {
		AdaptedLearningGameActivityImpl adaptedLearningGameActivity = new AdaptedLearningGameActivityImpl();
		return adaptedLearningGameActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTQFOneCompletion createMTQFOneCompletion() {
		MTQFOneCompletionImpl mtqfOneCompletion = new MTQFOneCompletionImpl();
		return mtqfOneCompletion;
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
	public DimensionsEntanglement createDimensionsEntanglement() {
		DimensionsEntanglementImpl dimensionsEntanglement = new DimensionsEntanglementImpl();
		return dimensionsEntanglement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room2SubObjectiveCompliance createRoom2SubObjectiveCompliance() {
		Room2SubObjectiveComplianceImpl room2SubObjectiveCompliance = new Room2SubObjectiveComplianceImpl();
		return room2SubObjectiveCompliance;
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
	public MTTableBuilding createMTTableBuilding() {
		MTTableBuildingImpl mtTableBuilding = new MTTableBuildingImpl();
		return mtTableBuilding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTResultPosition createMTResultPosition() {
		MTResultPositionImpl mtResultPosition = new MTResultPositionImpl();
		return mtResultPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTLevelParam createMTLevelParam() {
		MTLevelParamImpl mtLevelParam = new MTLevelParamImpl();
		return mtLevelParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter2RoomIncompliance createParameter2RoomIncompliance() {
		Parameter2RoomIncomplianceImpl parameter2RoomIncompliance = new Parameter2RoomIncomplianceImpl();
		return parameter2RoomIncompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamE2RoomCompliance createParamE2RoomCompliance() {
		ParamE2RoomComplianceImpl paramE2RoomCompliance = new ParamE2RoomComplianceImpl();
		return paramE2RoomCompliance;
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
	public TargetElement createTargetElementFromString(EDataType eDataType, String initialValue) {
		TargetElement result = TargetElement.get(initialValue);
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
	public String convertTargetElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectiveType createSubObjectiveTypeFromString(EDataType eDataType, String initialValue) {
		SubObjectiveType result = SubObjectiveType.get(initialValue);
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
	public String convertSubObjectiveTypeToString(EDataType eDataType, Object instanceValue) {
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
