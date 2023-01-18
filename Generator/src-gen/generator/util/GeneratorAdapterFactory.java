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
		public Adapter caseKnowledge(Knowledge object) {
			return createKnowledgeAdapter();
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
		public Adapter caseGameContext(GameContext object) {
			return createGameContextAdapter();
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
		public Adapter caseObjective(Objective object) {
			return createObjectiveAdapter();
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
		public Adapter caseMTCompletion1(MTCompletion1 object) {
			return createMTCompletion1Adapter();
		}

		@Override
		public Adapter caseGenerationContext(GenerationContext object) {
			return createGenerationContextAdapter();
		}

		@Override
		public Adapter caseLearnerPlayer(LearnerPlayer object) {
			return createLearnerPlayerAdapter();
		}

		@Override
		public Adapter caseProgression(Progression object) {
			return createProgressionAdapter();
		}

		@Override
		public Adapter caseCurrentObjectiveLevel(CurrentObjectiveLevel object) {
			return createCurrentObjectiveLevelAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseResponseModality(ResponseModality object) {
			return createResponseModalityAdapter();
		}

		@Override
		public Adapter caseMultipleChoice(MultipleChoice object) {
			return createMultipleChoiceAdapter();
		}

		@Override
		public Adapter caseEnterResponse(EnterResponse object) {
			return createEnterResponseAdapter();
		}

		@Override
		public Adapter caseRoomTypes(RoomTypes object) {
			return createRoomTypesAdapter();
		}

		@Override
		public Adapter caseATask(ATask object) {
			return createATaskAdapter();
		}

		@Override
		public Adapter caseCompletion1Task(Completion1Task object) {
			return createCompletion1TaskAdapter();
		}

		@Override
		public Adapter caseCompletion2Task(Completion2Task object) {
			return createCompletion2TaskAdapter();
		}

		@Override
		public Adapter caseReconstructionTask(ReconstructionTask object) {
			return createReconstructionTaskAdapter();
		}

		@Override
		public Adapter caseIdentificationTask(IdentificationTask object) {
			return createIdentificationTaskAdapter();
		}

		@Override
		public Adapter caseMembershipIDTask(MembershipIDTask object) {
			return createMembershipIDTaskAdapter();
		}

		@Override
		public Adapter caseMTCompletion2(MTCompletion2 object) {
			return createMTCompletion2Adapter();
		}

		@Override
		public Adapter caseMTRecontruction(MTRecontruction object) {
			return createMTRecontructionAdapter();
		}

		@Override
		public Adapter caseMTIdentification(MTIdentification object) {
			return createMTIdentificationAdapter();
		}

		@Override
		public Adapter caseMTMembership(MTMembership object) {
			return createMTMembershipAdapter();
		}

		@Override
		public Adapter caseResults(Results object) {
			return createResultsAdapter();
		}

		@Override
		public Adapter caseResultsByTask(ResultsByTask object) {
			return createResultsByTaskAdapter();
		}

		@Override
		public Adapter caseQFResults(QFResults object) {
			return createQFResultsAdapter();
		}

		@Override
		public Adapter caseMTFact(MTFact object) {
			return createMTFactAdapter();
		}

		@Override
		public Adapter caseMTResultFact(MTResultFact object) {
			return createMTResultFactAdapter();
		}

		@Override
		public Adapter caseQuestionableFact(QuestionableFact object) {
			return createQuestionableFactAdapter();
		}

		@Override
		public Adapter caseMTQFCompletion1(MTQFCompletion1 object) {
			return createMTQFCompletion1Adapter();
		}

		@Override
		public Adapter caseMTQFCompletion2(MTQFCompletion2 object) {
			return createMTQFCompletion2Adapter();
		}

		@Override
		public Adapter caseMTQFRebuild(MTQFRebuild object) {
			return createMTQFRebuildAdapter();
		}

		@Override
		public Adapter caseMTQFIdentification(MTQFIdentification object) {
			return createMTQFIdentificationAdapter();
		}

		@Override
		public Adapter caseMTQFMembership(MTQFMembership object) {
			return createMTQFMembershipAdapter();
		}

		@Override
		public Adapter caseQuestionedFact(QuestionedFact object) {
			return createQuestionedFactAdapter();
		}

		@Override
		public Adapter caseMTQeFCompletion1(MTQeFCompletion1 object) {
			return createMTQeFCompletion1Adapter();
		}

		@Override
		public Adapter caseMTQeFCompletion2(MTQeFCompletion2 object) {
			return createMTQeFCompletion2Adapter();
		}

		@Override
		public Adapter caseMTQeFRebuild(MTQeFRebuild object) {
			return createMTQeFRebuildAdapter();
		}

		@Override
		public Adapter caseMTQeFIdentication(MTQeFIdentication object) {
			return createMTQeFIdenticationAdapter();
		}

		@Override
		public Adapter caseMTQeFMembership(MTQeFMembership object) {
			return createMTQeFMembershipAdapter();
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
	 * Creates a new adapter for an object of class '{@link generator.GameContext <em>Game Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameContext
	 * @generated
	 */
	public Adapter createGameContextAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.MTCompletion1 <em>MT Completion1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTCompletion1
	 * @generated
	 */
	public Adapter createMTCompletion1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GenerationContext <em>Generation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GenerationContext
	 * @generated
	 */
	public Adapter createGenerationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearnerPlayer <em>Learner Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearnerPlayer
	 * @generated
	 */
	public Adapter createLearnerPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Progression <em>Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Progression
	 * @generated
	 */
	public Adapter createProgressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CurrentObjectiveLevel <em>Current Objective Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CurrentObjectiveLevel
	 * @generated
	 */
	public Adapter createCurrentObjectiveLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ResponseModality <em>Response Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ResponseModality
	 * @generated
	 */
	public Adapter createResponseModalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MultipleChoice
	 * @generated
	 */
	public Adapter createMultipleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.EnterResponse <em>Enter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.EnterResponse
	 * @generated
	 */
	public Adapter createEnterResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RoomTypes
	 * @generated
	 */
	public Adapter createRoomTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ATask <em>ATask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ATask
	 * @generated
	 */
	public Adapter createATaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Completion1Task <em>Completion1 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Completion1Task
	 * @generated
	 */
	public Adapter createCompletion1TaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Completion2Task <em>Completion2 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Completion2Task
	 * @generated
	 */
	public Adapter createCompletion2TaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ReconstructionTask <em>Reconstruction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ReconstructionTask
	 * @generated
	 */
	public Adapter createReconstructionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.IdentificationTask <em>Identification Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.IdentificationTask
	 * @generated
	 */
	public Adapter createIdentificationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MembershipIDTask <em>Membership ID Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MembershipIDTask
	 * @generated
	 */
	public Adapter createMembershipIDTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTCompletion2 <em>MT Completion2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTCompletion2
	 * @generated
	 */
	public Adapter createMTCompletion2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTRecontruction <em>MT Recontruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTRecontruction
	 * @generated
	 */
	public Adapter createMTRecontructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTIdentification <em>MT Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTIdentification
	 * @generated
	 */
	public Adapter createMTIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTMembership <em>MT Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTMembership
	 * @generated
	 */
	public Adapter createMTMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Results
	 * @generated
	 */
	public Adapter createResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ResultsByTask <em>Results By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ResultsByTask
	 * @generated
	 */
	public Adapter createResultsByTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QFResults <em>QF Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QFResults
	 * @generated
	 */
	public Adapter createQFResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTFact <em>MT Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTFact
	 * @generated
	 */
	public Adapter createMTFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTResultFact <em>MT Result Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTResultFact
	 * @generated
	 */
	public Adapter createMTResultFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QuestionableFact <em>Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionableFact
	 * @generated
	 */
	public Adapter createQuestionableFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQFCompletion1 <em>MTQF Completion1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQFCompletion1
	 * @generated
	 */
	public Adapter createMTQFCompletion1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQFCompletion2 <em>MTQF Completion2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQFCompletion2
	 * @generated
	 */
	public Adapter createMTQFCompletion2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQFRebuild <em>MTQF Rebuild</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQFRebuild
	 * @generated
	 */
	public Adapter createMTQFRebuildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQFIdentification <em>MTQF Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQFIdentification
	 * @generated
	 */
	public Adapter createMTQFIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQFMembership <em>MTQF Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQFMembership
	 * @generated
	 */
	public Adapter createMTQFMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QuestionedFact <em>Questioned Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionedFact
	 * @generated
	 */
	public Adapter createQuestionedFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQeFCompletion1 <em>MT Qe FCompletion1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQeFCompletion1
	 * @generated
	 */
	public Adapter createMTQeFCompletion1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQeFCompletion2 <em>MT Qe FCompletion2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQeFCompletion2
	 * @generated
	 */
	public Adapter createMTQeFCompletion2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQeFRebuild <em>MT Qe FRebuild</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQeFRebuild
	 * @generated
	 */
	public Adapter createMTQeFRebuildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQeFIdentication <em>MT Qe FIdentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQeFIdentication
	 * @generated
	 */
	public Adapter createMTQeFIdenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MTQeFMembership <em>MT Qe FMembership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MTQeFMembership
	 * @generated
	 */
	public Adapter createMTQeFMembershipAdapter() {
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
