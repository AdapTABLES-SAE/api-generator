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
	 * Returns a new object of class '<em>MT Qe FIdentification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Qe FIdentification</em>'.
	 * @generated
	 */
	MTQeFIdentification createMTQeFIdentification();

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
	 * Returns a new object of class '<em>Levels Difficulty Progress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Levels Difficulty Progress</em>'.
	 * @generated
	 */
	LevelsDifficultyProgress createLevelsDifficultyProgress();

	/**
	 * Returns a new object of class '<em>Current Game Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Game Level</em>'.
	 * @generated
	 */
	CurrentGameLevel createCurrentGameLevel();

	/**
	 * Returns a new object of class '<em>Element Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Types</em>'.
	 * @generated
	 */
	ElementTypes createElementTypes();

	/**
	 * Returns a new object of class '<em>Core Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Elements</em>'.
	 * @generated
	 */
	CoreElements createCoreElements();

	/**
	 * Returns a new object of class '<em>Equipments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipments</em>'.
	 * @generated
	 */
	Equipments createEquipments();

	/**
	 * Returns a new object of class '<em>Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Element</em>'.
	 * @generated
	 */
	CoreElement createCoreElement();

	/**
	 * Returns a new object of class '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipment</em>'.
	 * @generated
	 */
	Equipment createEquipment();

	/**
	 * Returns a new object of class '<em>Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplay</em>'.
	 * @generated
	 */
	Gameplay createGameplay();

	/**
	 * Returns a new object of class '<em>Quantified Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantified Elements</em>'.
	 * @generated
	 */
	QuantifiedElements createQuantifiedElements();

	/**
	 * Returns a new object of class '<em>Positioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned Element</em>'.
	 * @generated
	 */
	PositionedElement createPositionedElement();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Correctness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correctness</em>'.
	 * @generated
	 */
	Correctness createCorrectness();

	/**
	 * Returns a new object of class '<em>Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Element</em>'.
	 * @generated
	 */
	StructureElement createStructureElement();

	/**
	 * Returns a new object of class '<em>Wanted Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wanted Answer</em>'.
	 * @generated
	 */
	WantedAnswer createWantedAnswer();

	/**
	 * Returns a new object of class '<em>Gameplays</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplays</em>'.
	 * @generated
	 */
	Gameplays createGameplays();

	/**
	 * Returns a new object of class '<em>Questionable Fact Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionable Fact Result</em>'.
	 * @generated
	 */
	QuestionableFactResult createQuestionableFactResult();

	/**
	 * Returns a new object of class '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ability</em>'.
	 * @generated
	 */
	Ability createAbility();

	/**
	 * Returns a new object of class '<em>Abilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abilities</em>'.
	 * @generated
	 */
	Abilities createAbilities();

	/**
	 * Returns a new object of class '<em>Structure Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Position</em>'.
	 * @generated
	 */
	StructurePosition createStructurePosition();

	/**
	 * Returns a new object of class '<em>Statement Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Position</em>'.
	 * @generated
	 */
	StatementPosition createStatementPosition();

	/**
	 * Returns a new object of class '<em>Questioned Fact Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questioned Fact Statement</em>'.
	 * @generated
	 */
	QuestionedFactStatement createQuestionedFactStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
