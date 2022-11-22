/**
 */
package generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage
 * @generated
 */
public interface GeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorFactory eINSTANCE = generator.impl.GeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Set Of Facts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Of Facts</em>'.
	 * @generated
	 */
	SetOfFacts createSetOfFacts();

	/**
	 * Returns a new object of class '<em>Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact</em>'.
	 * @generated
	 */
	Fact createFact();

	/**
	 * Returns a new object of class '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge</em>'.
	 * @generated
	 */
	Knowledge createKnowledge();

	/**
	 * Returns a new object of class '<em>Dungeon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dungeon</em>'.
	 * @generated
	 */
	Dungeon createDungeon();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Game Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Description</em>'.
	 * @generated
	 */
	GameDescription createGameDescription();

	/**
	 * Returns a new object of class '<em>Small Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Room Type</em>'.
	 * @generated
	 */
	SmallRoomType createSmallRoomType();

	/**
	 * Returns a new object of class '<em>Large Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Room Type</em>'.
	 * @generated
	 */
	LargeRoomType createLargeRoomType();

	/**
	 * Returns a new object of class '<em>Room Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Access</em>'.
	 * @generated
	 */
	RoomAccess createRoomAccess();

	/**
	 * Returns a new object of class '<em>Game Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Context</em>'.
	 * @generated
	 */
	GameContext createGameContext();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Learning Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Domain</em>'.
	 * @generated
	 */
	LearningDomain createLearningDomain();

	/**
	 * Returns a new object of class '<em>Learning Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Path</em>'.
	 * @generated
	 */
	LearningPath createLearningPath();

	/**
	 * Returns a new object of class '<em>Learning Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Objective</em>'.
	 * @generated
	 */
	LearningObjective createLearningObjective();

	/**
	 * Returns a new object of class '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite</em>'.
	 * @generated
	 */
	Prerequisite createPrerequisite();

	/**
	 * Returns a new object of class '<em>MT Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Level</em>'.
	 * @generated
	 */
	MTLevel createMTLevel();

	/**
	 * Returns a new object of class '<em>MT Completion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Completion Type</em>'.
	 * @generated
	 */
	MTCompletionType createMTCompletionType();

	/**
	 * Returns a new object of class '<em>Task Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Types</em>'.
	 * @generated
	 */
	TaskTypes createTaskTypes();

	/**
	 * Returns a new object of class '<em>Completion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completion Type</em>'.
	 * @generated
	 */
	CompletionType createCompletionType();

	/**
	 * Returns a new object of class '<em>Reconstruction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconstruction Type</em>'.
	 * @generated
	 */
	ReconstructionType createReconstructionType();

	/**
	 * Returns a new object of class '<em>Fact Verification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Verification Type</em>'.
	 * @generated
	 */
	FactVerificationType createFactVerificationType();

	/**
	 * Returns a new object of class '<em>Result Verification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Verification Type</em>'.
	 * @generated
	 */
	ResultVerificationType createResultVerificationType();

	/**
	 * Returns a new object of class '<em>Generation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Context</em>'.
	 * @generated
	 */
	GenerationContext createGenerationContext();

	/**
	 * Returns a new object of class '<em>Learner Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learner Player</em>'.
	 * @generated
	 */
	LearnerPlayer createLearnerPlayer();

	/**
	 * Returns a new object of class '<em>Progression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progression</em>'.
	 * @generated
	 */
	Progression createProgression();

	/**
	 * Returns a new object of class '<em>Current Objective Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Objective Level</em>'.
	 * @generated
	 */
	CurrentObjectiveLevel createCurrentObjectiveLevel();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice</em>'.
	 * @generated
	 */
	MultipleChoice createMultipleChoice();

	/**
	 * Returns a new object of class '<em>Enter Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enter Response</em>'.
	 * @generated
	 */
	EnterResponse createEnterResponse();

	/**
	 * Returns a new object of class '<em>Interaction EType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction EType</em>'.
	 * @generated
	 */
	InteractionEType createInteractionEType();

	/**
	 * Returns a new object of class '<em>Active Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Ability</em>'.
	 * @generated
	 */
	ActiveAbility createActiveAbility();

	/**
	 * Returns a new object of class '<em>Passive Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Ability</em>'.
	 * @generated
	 */
	PassiveAbility createPassiveAbility();

	/**
	 * Returns a new object of class '<em>Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplay</em>'.
	 * @generated
	 */
	Gameplay createGameplay();

	/**
	 * Returns a new object of class '<em>Game Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Rule</em>'.
	 * @generated
	 */
	GameRule createGameRule();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Avatar Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avatar Equipment</em>'.
	 * @generated
	 */
	AvatarEquipment createAvatarEquipment();

	/**
	 * Returns a new object of class '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements</em>'.
	 * @generated
	 */
	Elements createElements();

	/**
	 * Returns a new object of class '<em>Gameplays</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplays</em>'.
	 * @generated
	 */
	Gameplays createGameplays();

	/**
	 * Returns a new object of class '<em>Element Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Types</em>'.
	 * @generated
	 */
	ElementTypes createElementTypes();

	/**
	 * Returns a new object of class '<em>Abilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abilities</em>'.
	 * @generated
	 */
	Abilities createAbilities();

	/**
	 * Returns a new object of class '<em>Room Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Types</em>'.
	 * @generated
	 */
	RoomTypes createRoomTypes();

	/**
	 * Returns a new object of class '<em>Equipment EType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipment EType</em>'.
	 * @generated
	 */
	EquipmentEType createEquipmentEType();

	/**
	 * Returns a new object of class '<em>Element Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Position</em>'.
	 * @generated
	 */
	ElementPosition createElementPosition();

	/**
	 * Returns a new object of class '<em>Mapping Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Model</em>'.
	 * @generated
	 */
	MappingModel createMappingModel();

	/**
	 * Returns a new object of class '<em>Modality2 Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality2 Room Type</em>'.
	 * @generated
	 */
	Modality2RoomType createModality2RoomType();

	/**
	 * Returns a new object of class '<em>Task Type2 Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Type2 Gameplay</em>'.
	 * @generated
	 */
	TaskType2Gameplay createTaskType2Gameplay();

	/**
	 * Returns a new object of class '<em>Response Modalities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Modalities</em>'.
	 * @generated
	 */
	ResponseModalities createResponseModalities();

	/**
	 * Returns a new object of class '<em>Gameplay2 Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplay2 Room Type</em>'.
	 * @generated
	 */
	Gameplay2RoomType createGameplay2RoomType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
