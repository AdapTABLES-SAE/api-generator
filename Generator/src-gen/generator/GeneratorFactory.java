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
	 * Returns a new object of class '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite</em>'.
	 * @generated
	 */
	Prerequisite createPrerequisite();

	/**
	 * Returns a new object of class '<em>Learning Paths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Paths</em>'.
	 * @generated
	 */
	LearningPaths createLearningPaths();

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
	 * Returns a new object of class '<em>Dungeon OLD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dungeon OLD</em>'.
	 * @generated
	 */
	DungeonOLD createDungeonOLD();

	/**
	 * Returns a new object of class '<em>Game Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Objective</em>'.
	 * @generated
	 */
	GameObjective createGameObjective();

	/**
	 * Returns a new object of class '<em>Classic Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classic Room</em>'.
	 * @generated
	 */
	ClassicRoom createClassicRoom();

	/**
	 * Returns a new object of class '<em>Question Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Room</em>'.
	 * @generated
	 */
	QuestionRoom createQuestionRoom();

	/**
	 * Returns a new object of class '<em>Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pathway</em>'.
	 * @generated
	 */
	Pathway createPathway();

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
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Placed Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placed Object</em>'.
	 * @generated
	 */
	PlacedObject createPlacedObject();

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
	 * Returns a new object of class '<em>Roguelite Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roguelite Context</em>'.
	 * @generated
	 */
	RogueliteContext createRogueliteContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
