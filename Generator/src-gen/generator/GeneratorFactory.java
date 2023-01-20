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
	 * Returns a new object of class '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective</em>'.
	 * @generated
	 */
	Objective createObjective();

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
	 * Returns a new object of class '<em>MT Completion1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Completion1</em>'.
	 * @generated
	 */
	MTCompletion1 createMTCompletion1();

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
	 * Returns a new object of class '<em>Room Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Types</em>'.
	 * @generated
	 */
	RoomTypes createRoomTypes();

	/**
	 * Returns a new object of class '<em>MT Completion2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Completion2</em>'.
	 * @generated
	 */
	MTCompletion2 createMTCompletion2();

	/**
	 * Returns a new object of class '<em>MT Recontruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Recontruction</em>'.
	 * @generated
	 */
	MTRecontruction createMTRecontruction();

	/**
	 * Returns a new object of class '<em>MT Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Identification</em>'.
	 * @generated
	 */
	MTIdentification createMTIdentification();

	/**
	 * Returns a new object of class '<em>MT Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Membership</em>'.
	 * @generated
	 */
	MTMembership createMTMembership();

	/**
	 * Returns a new object of class '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results</em>'.
	 * @generated
	 */
	Results createResults();

	/**
	 * Returns a new object of class '<em>Results By Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results By Task</em>'.
	 * @generated
	 */
	ResultsByTask createResultsByTask();

	/**
	 * Returns a new object of class '<em>QF Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QF Results</em>'.
	 * @generated
	 */
	QFResults createQFResults();

	/**
	 * Returns a new object of class '<em>MT Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Fact</em>'.
	 * @generated
	 */
	MTFact createMTFact();

	/**
	 * Returns a new object of class '<em>MT Result Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Result Fact</em>'.
	 * @generated
	 */
	MTResultFact createMTResultFact();

	/**
	 * Returns a new object of class '<em>MTQF Completion1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTQF Completion1</em>'.
	 * @generated
	 */
	MTQFCompletion1 createMTQFCompletion1();

	/**
	 * Returns a new object of class '<em>MTQF Completion2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTQF Completion2</em>'.
	 * @generated
	 */
	MTQFCompletion2 createMTQFCompletion2();

	/**
	 * Returns a new object of class '<em>MTQF Rebuild</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTQF Rebuild</em>'.
	 * @generated
	 */
	MTQFRebuild createMTQFRebuild();

	/**
	 * Returns a new object of class '<em>MTQF Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTQF Identification</em>'.
	 * @generated
	 */
	MTQFIdentification createMTQFIdentification();

	/**
	 * Returns a new object of class '<em>MTQF Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTQF Membership</em>'.
	 * @generated
	 */
	MTQFMembership createMTQFMembership();

	/**
	 * Returns a new object of class '<em>MT Qe FCompletion1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FCompletion1</em>'.
	 * @generated
	 */
	MTQeFCompletion1 createMTQeFCompletion1();

	/**
	 * Returns a new object of class '<em>MT Qe FCompletion2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FCompletion2</em>'.
	 * @generated
	 */
	MTQeFCompletion2 createMTQeFCompletion2();

	/**
	 * Returns a new object of class '<em>MT Qe FRebuild</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FRebuild</em>'.
	 * @generated
	 */
	MTQeFRebuild createMTQeFRebuild();

	/**
	 * Returns a new object of class '<em>MT Qe FIdentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FIdentication</em>'.
	 * @generated
	 */
	MTQeFIdentication createMTQeFIdentication();

	/**
	 * Returns a new object of class '<em>MT Qe FMembership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FMembership</em>'.
	 * @generated
	 */
	MTQeFMembership createMTQeFMembership();

	/**
	 * Returns a new object of class '<em>Completion Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completion Criteria</em>'.
	 * @generated
	 */
	CompletionCriteria createCompletionCriteria();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
