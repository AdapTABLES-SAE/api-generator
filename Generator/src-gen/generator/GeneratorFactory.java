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
	 * Returns a new object of class '<em>Game Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Content</em>'.
	 * @generated
	 */
	GameContent createGameContent();

	/**
	 * Returns a new object of class '<em>Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplay</em>'.
	 * @generated
	 */
	Gameplay createGameplay();

	/**
	 * Returns a new object of class '<em>Core Game Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Game Rule</em>'.
	 * @generated
	 */
	CoreGameRule createCoreGameRule();

	/**
	 * Returns a new object of class '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type</em>'.
	 * @generated
	 */
	ElementType createElementType();

	/**
	 * Returns a new object of class '<em>Game Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Objective</em>'.
	 * @generated
	 */
	GameObjective createGameObjective();

	/**
	 * Returns a new object of class '<em>Room Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type2</em>'.
	 * @generated
	 */
	RoomType2 createRoomType2();

	/**
	 * Returns a new object of class '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor</em>'.
	 * @generated
	 */
	Floor createFloor();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Element Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Shape</em>'.
	 * @generated
	 */
	ElementShape createElementShape();

	/**
	 * Returns a new object of class '<em>Element State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element State</em>'.
	 * @generated
	 */
	ElementState createElementState();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
