/**
 */
package generator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import generator.AbstractFact;
import generator.ClassicRoom;
import generator.CoreGameRule;
import generator.Dungeon;
import generator.DungeonOLD;
import generator.ElementShape;
import generator.ElementState;
import generator.ElementType;
import generator.Fact;
import generator.Floor;
import generator.GameContent;
import generator.GameDescription;
import generator.GameObjective;
import generator.Gameplay;
import generator.GeneratorPackage;
import generator.IRoomElement;
import generator.Knowledge;
import generator.LargeRoomType;
import generator.LearningObjective;
import generator.LearningPath;
import generator.LearningPaths;
import generator.Level;
import generator.Location;
import generator.Pathway;
import generator.PlacedObject;
import generator.Prerequisite;
import generator.ProblemResolution;
import generator.QFOneCompletion;
import generator.QFReconstruction;
import generator.QFTwoCompletion;
import generator.QFValidityDetermination;
import generator.QuestionRoom;
import generator.ResultValidityDetermination;
import generator.RogueliteContext;
import generator.Room;
import generator.RoomAccess;
import generator.RoomOLD;
import generator.RoomType;
import generator.RoomType2;
import generator.SetOfFacts;
import generator.SmallRoomType;
import generator.State;
import generator.SubObjective;
import generators.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage
 * @generated
 */
public class GeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorSwitch<Adapter> modelSwitch = new GeneratorSwitch<Adapter>() {
		@Override
		public Adapter casePrerequisite(Prerequisite object) {
			return createPrerequisiteAdapter();
		}

		@Override
		public Adapter caseLevel(Level object) {
			return createLevelAdapter();
		}

		@Override
		public Adapter caseQFValidityDetermination(QFValidityDetermination object) {
			return createQFValidityDeterminationAdapter();
		}

		@Override
		public Adapter caseLearningPaths(LearningPaths object) {
			return createLearningPathsAdapter();
		}

		@Override
		public Adapter caseResultValidityDetermination(ResultValidityDetermination object) {
			return createResultValidityDeterminationAdapter();
		}

		@Override
		public Adapter caseQFOneCompletion(QFOneCompletion object) {
			return createQFOneCompletionAdapter();
		}

		@Override
		public Adapter caseQFReconstruction(QFReconstruction object) {
			return createQFReconstructionAdapter();
		}

		@Override
		public Adapter caseSubObjective(SubObjective object) {
			return createSubObjectiveAdapter();
		}

		@Override
		public Adapter caseQFTwoCompletion(QFTwoCompletion object) {
			return createQFTwoCompletionAdapter();
		}

		@Override
		public Adapter caseProblemResolution(ProblemResolution object) {
			return createProblemResolutionAdapter();
		}

		@Override
		public Adapter caseAbstractFact(AbstractFact object) {
			return createAbstractFactAdapter();
		}

		@Override
		public Adapter caseSetOfFacts(SetOfFacts object) {
			return createSetOfFactsAdapter();
		}

		@Override
		public Adapter caseFact(Fact object) {
			return createFactAdapter();
		}

		@Override
		public Adapter caseKnowledge(Knowledge object) {
			return createKnowledgeAdapter();
		}

		@Override
		public Adapter caseLearningPath(LearningPath object) {
			return createLearningPathAdapter();
		}

		@Override
		public Adapter caseLearningObjective(LearningObjective object) {
			return createLearningObjectiveAdapter();
		}

		@Override
		public Adapter caseGameContent(GameContent object) {
			return createGameContentAdapter();
		}

		@Override
		public Adapter caseGameplay(Gameplay object) {
			return createGameplayAdapter();
		}

		@Override
		public Adapter caseCoreGameRule(CoreGameRule object) {
			return createCoreGameRuleAdapter();
		}

		@Override
		public Adapter caseElementType(ElementType object) {
			return createElementTypeAdapter();
		}

		@Override
		public Adapter caseDungeonOLD(DungeonOLD object) {
			return createDungeonOLDAdapter();
		}

		@Override
		public Adapter caseGameObjective(GameObjective object) {
			return createGameObjectiveAdapter();
		}

		@Override
		public Adapter caseRoomOLD(RoomOLD object) {
			return createRoomOLDAdapter();
		}

		@Override
		public Adapter caseClassicRoom(ClassicRoom object) {
			return createClassicRoomAdapter();
		}

		@Override
		public Adapter caseQuestionRoom(QuestionRoom object) {
			return createQuestionRoomAdapter();
		}

		@Override
		public Adapter casePathway(Pathway object) {
			return createPathwayAdapter();
		}

		@Override
		public Adapter caseRoomType2(RoomType2 object) {
			return createRoomType2Adapter();
		}

		@Override
		public Adapter caseFloor(Floor object) {
			return createFloorAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter casePlacedObject(PlacedObject object) {
			return createPlacedObjectAdapter();
		}

		@Override
		public Adapter caseIRoomElement(IRoomElement object) {
			return createIRoomElementAdapter();
		}

		@Override
		public Adapter caseElementShape(ElementShape object) {
			return createElementShapeAdapter();
		}

		@Override
		public Adapter caseElementState(ElementState object) {
			return createElementStateAdapter();
		}

		@Override
		public Adapter caseDungeon(Dungeon object) {
			return createDungeonAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseGameDescription(GameDescription object) {
			return createGameDescriptionAdapter();
		}

		@Override
		public Adapter caseRoomType(RoomType object) {
			return createRoomTypeAdapter();
		}

		@Override
		public Adapter caseSmallRoomType(SmallRoomType object) {
			return createSmallRoomTypeAdapter();
		}

		@Override
		public Adapter caseLargeRoomType(LargeRoomType object) {
			return createLargeRoomTypeAdapter();
		}

		@Override
		public Adapter caseRoomAccess(RoomAccess object) {
			return createRoomAccessAdapter();
		}

		@Override
		public Adapter caseRogueliteContext(RogueliteContext object) {
			return createRogueliteContextAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Prerequisite
	 * @generated
	 */
	public Adapter createPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QFValidityDetermination <em>QF Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QFValidityDetermination
	 * @generated
	 */
	public Adapter createQFValidityDeterminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearningPaths <em>Learning Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearningPaths
	 * @generated
	 */
	public Adapter createLearningPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ResultValidityDetermination <em>Result Validity Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ResultValidityDetermination
	 * @generated
	 */
	public Adapter createResultValidityDeterminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QFOneCompletion <em>QF One Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QFOneCompletion
	 * @generated
	 */
	public Adapter createQFOneCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QFReconstruction <em>QF Reconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QFReconstruction
	 * @generated
	 */
	public Adapter createQFReconstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.SubObjective <em>Sub Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.SubObjective
	 * @generated
	 */
	public Adapter createSubObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QFTwoCompletion <em>QF Two Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QFTwoCompletion
	 * @generated
	 */
	public Adapter createQFTwoCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ProblemResolution <em>Problem Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ProblemResolution
	 * @generated
	 */
	public Adapter createProblemResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AbstractFact <em>Abstract Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AbstractFact
	 * @generated
	 */
	public Adapter createAbstractFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.SetOfFacts <em>Set Of Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.SetOfFacts
	 * @generated
	 */
	public Adapter createSetOfFactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Knowledge
	 * @generated
	 */
	public Adapter createKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearningPath <em>Learning Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearningPath
	 * @generated
	 */
	public Adapter createLearningPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearningObjective
	 * @generated
	 */
	public Adapter createLearningObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GameContent <em>Game Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameContent
	 * @generated
	 */
	public Adapter createGameContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Gameplay <em>Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Gameplay
	 * @generated
	 */
	public Adapter createGameplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CoreGameRule <em>Core Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CoreGameRule
	 * @generated
	 */
	public Adapter createCoreGameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.DungeonOLD <em>Dungeon OLD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.DungeonOLD
	 * @generated
	 */
	public Adapter createDungeonOLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GameObjective <em>Game Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameObjective
	 * @generated
	 */
	public Adapter createGameObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RoomOLD <em>Room OLD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RoomOLD
	 * @generated
	 */
	public Adapter createRoomOLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ClassicRoom <em>Classic Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ClassicRoom
	 * @generated
	 */
	public Adapter createClassicRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QuestionRoom <em>Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionRoom
	 * @generated
	 */
	public Adapter createQuestionRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Pathway
	 * @generated
	 */
	public Adapter createPathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RoomType2 <em>Room Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RoomType2
	 * @generated
	 */
	public Adapter createRoomType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PlacedObject <em>Placed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PlacedObject
	 * @generated
	 */
	public Adapter createPlacedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.IRoomElement <em>IRoom Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.IRoomElement
	 * @generated
	 */
	public Adapter createIRoomElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementShape <em>Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementShape
	 * @generated
	 */
	public Adapter createElementShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementState <em>Element State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementState
	 * @generated
	 */
	public Adapter createElementStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Dungeon <em>Dungeon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Dungeon
	 * @generated
	 */
	public Adapter createDungeonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GameDescription <em>Game Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameDescription
	 * @generated
	 */
	public Adapter createGameDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.SmallRoomType <em>Small Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.SmallRoomType
	 * @generated
	 */
	public Adapter createSmallRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LargeRoomType <em>Large Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LargeRoomType
	 * @generated
	 */
	public Adapter createLargeRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RoomAccess <em>Room Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RoomAccess
	 * @generated
	 */
	public Adapter createRoomAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RogueliteContext <em>Roguelite Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RogueliteContext
	 * @generated
	 */
	public Adapter createRogueliteContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratorAdapterFactory
