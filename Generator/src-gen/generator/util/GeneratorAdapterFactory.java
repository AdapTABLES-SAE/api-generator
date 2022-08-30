/**
 */
package generator.util;

import generator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
		public Adapter caseGameObjective(GameObjective object) {
			return createGameObjectiveAdapter();
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
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseLearningDomain(LearningDomain object) {
			return createLearningDomainAdapter();
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
		public Adapter casePrerequisite(Prerequisite object) {
			return createPrerequisiteAdapter();
		}

		@Override
		public Adapter caseLevel(Level object) {
			return createLevelAdapter();
		}

		@Override
		public Adapter caseMTLevel(MTLevel object) {
			return createMTLevelAdapter();
		}

		@Override
		public Adapter caseMTCompletionType(MTCompletionType object) {
			return createMTCompletionTypeAdapter();
		}

		@Override
		public Adapter caseTaskTypes(TaskTypes object) {
			return createTaskTypesAdapter();
		}

		@Override
		public Adapter caseCompletionType(CompletionType object) {
			return createCompletionTypeAdapter();
		}

		@Override
		public Adapter caseVerificationType(VerificationType object) {
			return createVerificationTypeAdapter();
		}

		@Override
		public Adapter caseReconstructionType(ReconstructionType object) {
			return createReconstructionTypeAdapter();
		}

		@Override
		public Adapter caseTaskType(TaskType object) {
			return createTaskTypeAdapter();
		}

		@Override
		public Adapter caseFactVerificationType(FactVerificationType object) {
			return createFactVerificationTypeAdapter();
		}

		@Override
		public Adapter caseResultVerificationType(ResultVerificationType object) {
			return createResultVerificationTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link generator.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearningDomain <em>Learning Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearningDomain
	 * @generated
	 */
	public Adapter createLearningDomainAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.MTLevel <em>MT Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTLevel
	 * @generated
	 */
	public Adapter createMTLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTCompletionType <em>MT Completion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTCompletionType
	 * @generated
	 */
	public Adapter createMTCompletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TaskTypes
	 * @generated
	 */
	public Adapter createTaskTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CompletionType <em>Completion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CompletionType
	 * @generated
	 */
	public Adapter createCompletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.VerificationType <em>Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.VerificationType
	 * @generated
	 */
	public Adapter createVerificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ReconstructionType <em>Reconstruction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ReconstructionType
	 * @generated
	 */
	public Adapter createReconstructionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.FactVerificationType <em>Fact Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.FactVerificationType
	 * @generated
	 */
	public Adapter createFactVerificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ResultVerificationType <em>Result Verification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ResultVerificationType
	 * @generated
	 */
	public Adapter createResultVerificationTypeAdapter() {
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
