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
	 * Returns a new object of class '<em>Classroom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classroom</em>'.
	 * @generated
	 */
	Classroom createClassroom();

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
	 * Returns a new object of class '<em>Questioned Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questioned Fact</em>'.
	 * @generated
	 */
	QuestionedFact createQuestionedFact();

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
	 * Returns a new object of class '<em>Game Element Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Element Types</em>'.
	 * @generated
	 */
	GameElementTypes createGameElementTypes();

	/**
	 * Returns a new object of class '<em>Elements Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements Types</em>'.
	 * @generated
	 */
	ElementsTypes createElementsTypes();

	/**
	 * Returns a new object of class '<em>Equipments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipments</em>'.
	 * @generated
	 */
	Equipments createEquipments();

	/**
	 * Returns a new object of class '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipment</em>'.
	 * @generated
	 */
	Equipment createEquipment();

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
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Positioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned Element</em>'.
	 * @generated
	 */
	PositionedElement createPositionedElement();

	/**
	 * Returns a new object of class '<em>Question Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Param</em>'.
	 * @generated
	 */
	QuestionParam createQuestionParam();

	/**
	 * Returns a new object of class '<em>Proposition Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposition Param</em>'.
	 * @generated
	 */
	PropositionParam createPropositionParam();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Correctness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correctness</em>'.
	 * @generated
	 */
	Correctness createCorrectness();

	/**
	 * Returns a new object of class '<em>Entry Soluce Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Soluce Param</em>'.
	 * @generated
	 */
	EntrySoluceParam createEntrySoluceParam();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
	Structure createStructure();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Wanted Answers Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wanted Answers Param</em>'.
	 * @generated
	 */
	WantedAnswersParam createWantedAnswersParam();

	/**
	 * Returns a new object of class '<em>Expected Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expected Answer</em>'.
	 * @generated
	 */
	ExpectedAnswer createExpectedAnswer();

	/**
	 * Returns a new object of class '<em>Correctness Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correctness Value</em>'.
	 * @generated
	 */
	CorrectnessValue createCorrectnessValue();

	/**
	 * Returns a new object of class '<em>Positioned Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned Structure Element</em>'.
	 * @generated
	 */
	PositionedStructureElement createPositionedStructureElement();

	/**
	 * Returns a new object of class '<em>Fact Solution Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Solution Param</em>'.
	 * @generated
	 */
	FactSolutionParam createFactSolutionParam();

	/**
	 * Returns a new object of class '<em>Prompt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prompt</em>'.
	 * @generated
	 */
	Prompt createPrompt();

	/**
	 * Returns a new object of class '<em>Fact Correctness Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Correctness Param</em>'.
	 * @generated
	 */
	FactCorrectnessParam createFactCorrectnessParam();

	/**
	 * Returns a new object of class '<em>Gameplay Task Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gameplay Task Relations</em>'.
	 * @generated
	 */
	GameplayTaskRelations createGameplayTaskRelations();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Question Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Gameplay</em>'.
	 * @generated
	 */
	QuestionGameplay createQuestionGameplay();

	/**
	 * Returns a new object of class '<em>No Question Gameplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Question Gameplay</em>'.
	 * @generated
	 */
	NoQuestionGameplay createNoQuestionGameplay();

	/**
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns a new object of class '<em>Statement Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Element Type</em>'.
	 * @generated
	 */
	StatementElementType createStatementElementType();

	/**
	 * Returns a new object of class '<em>Player Progress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Progress</em>'.
	 * @generated
	 */
	PlayerProgress createPlayerProgress();

	/**
	 * Returns a new object of class '<em>Learner Progress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learner Progress</em>'.
	 * @generated
	 */
	LearnerProgress createLearnerProgress();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Items</em>'.
	 * @generated
	 */
	Items createItems();

	/**
	 * Returns a new object of class '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics</em>'.
	 * @generated
	 */
	Statistics createStatistics();

	/**
	 * Returns a new object of class '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type</em>'.
	 * @generated
	 */
	ElementType createElementType();

	/**
	 * Returns a new object of class '<em>Curses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curses</em>'.
	 * @generated
	 */
	Curses createCurses();

	/**
	 * Returns a new object of class '<em>Curse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curse</em>'.
	 * @generated
	 */
	Curse createCurse();

	/**
	 * Returns a new object of class '<em>Labyrinth Curse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labyrinth Curse</em>'.
	 * @generated
	 */
	LabyrinthCurse createLabyrinthCurse();

	/**
	 * Returns a new object of class '<em>Curse Eligibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curse Eligibility</em>'.
	 * @generated
	 */
	CurseEligibility createCurseEligibility();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization</em>'.
	 * @generated
	 */
	Visualization createVisualization();

	/**
	 * Returns a new object of class '<em>Visualization Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Position</em>'.
	 * @generated
	 */
	VisualizationPosition createVisualizationPosition();

	/**
	 * Returns a new object of class '<em>Legend Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legend Text</em>'.
	 * @generated
	 */
	LegendText createLegendText();

	/**
	 * Returns a new object of class '<em>History Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Fact</em>'.
	 * @generated
	 */
	HistoryFact createHistoryFact();

	/**
	 * Returns a new object of class '<em>Geography Legend Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geography Legend Fact</em>'.
	 * @generated
	 */
	GeographyLegendFact createGeographyLegendFact();

	/**
	 * Returns a new object of class '<em>Geography Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geography Fact</em>'.
	 * @generated
	 */
	GeographyFact createGeographyFact();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Time Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Period</em>'.
	 * @generated
	 */
	TimePeriod createTimePeriod();

	/**
	 * Returns a new object of class '<em>Visualization Question Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Question Param</em>'.
	 * @generated
	 */
	VisualizationQuestionParam createVisualizationQuestionParam();

	/**
	 * Returns a new object of class '<em>HAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAssociation</em>'.
	 * @generated
	 */
	HAssociation createHAssociation();

	/**
	 * Returns a new object of class '<em>HLegend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLegend</em>'.
	 * @generated
	 */
	HLegend createHLegend();

	/**
	 * Returns a new object of class '<em>GLocate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GLocate</em>'.
	 * @generated
	 */
	GLocate createGLocate();

	/**
	 * Returns a new object of class '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teacher</em>'.
	 * @generated
	 */
	Teacher createTeacher();

	/**
	 * Returns a new object of class '<em>Teachers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teachers</em>'.
	 * @generated
	 */
	Teachers createTeachers();

	/**
	 * Returns a new object of class '<em>Classrooms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classrooms</em>'.
	 * @generated
	 */
	Classrooms createClassrooms();

	/**
	 * Returns a new object of class '<em>Visualization Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Solution</em>'.
	 * @generated
	 */
	VisualizationSolution createVisualizationSolution();

	/**
	 * Returns a new object of class '<em>HG Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HG Level</em>'.
	 * @generated
	 */
	HGLevel createHGLevel();

	/**
	 * Returns a new object of class '<em>Positioned Visualization Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned Visualization Element</em>'.
	 * @generated
	 */
	PositionedVisualizationElement createPositionedVisualizationElement();

	/**
	 * Returns a new object of class '<em>Date Questionable Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Questionable Fact</em>'.
	 * @generated
	 */
	DateQuestionableFact createDateQuestionableFact();

	/**
	 * Returns a new object of class '<em>HChronology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HChronology</em>'.
	 * @generated
	 */
	HChronology createHChronology();

	/**
	 * Returns a new object of class '<em>Map Questionable Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Questionable Fact</em>'.
	 * @generated
	 */
	MapQuestionableFact createMapQuestionableFact();

	/**
	 * Returns a new object of class '<em>Judo Technique Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Judo Technique Fact</em>'.
	 * @generated
	 */
	JudoTechniqueFact createJudoTechniqueFact();

	/**
	 * Returns a new object of class '<em>Classify Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classify Technique</em>'.
	 * @generated
	 */
	ClassifyTechnique createClassifyTechnique();

	/**
	 * Returns a new object of class '<em>Identify Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identify Technique</em>'.
	 * @generated
	 */
	IdentifyTechnique createIdentifyTechnique();

	/**
	 * Returns a new object of class '<em>Judo Questionable Technique Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Judo Questionable Technique Fact</em>'.
	 * @generated
	 */
	JudoQuestionableTechniqueFact createJudoQuestionableTechniqueFact();

	/**
	 * Returns a new object of class '<em>Judo Questionable Classify Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Judo Questionable Classify Fact</em>'.
	 * @generated
	 */
	JudoQuestionableClassifyFact createJudoQuestionableClassifyFact();

	/**
	 * Returns a new object of class '<em>Judo Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Judo Level</em>'.
	 * @generated
	 */
	JudoLevel createJudoLevel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
