/**
 */
package generatorMetamodels.util;

import generatorMetamodels.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see generatorMetamodels.GeneratorMetamodelsPackage
 * @generated
 */
public class GeneratorMetamodelsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorMetamodelsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorMetamodelsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorMetamodelsPackage.eINSTANCE;
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
	protected GeneratorMetamodelsSwitch<Adapter> modelSwitch = new GeneratorMetamodelsSwitch<Adapter>() {
		@Override
		public Adapter caseMultipleChoice(MultipleChoice object) {
			return createMultipleChoiceAdapter();
		}

		@Override
		public Adapter caseResultVerification(ResultVerification object) {
			return createResultVerificationAdapter();
		}

		@Override
		public Adapter caseSetOfFacts(SetOfFacts object) {
			return createSetOfFactsAdapter();
		}

		@Override
		public Adapter caseProblemResolution(ProblemResolution object) {
			return createProblemResolutionAdapter();
		}

		@Override
		public Adapter caseExitRoom(ExitRoom object) {
			return createExitRoomAdapter();
		}

		@Override
		public Adapter caseMultipleCompletion(MultipleCompletion object) {
			return createMultipleCompletionAdapter();
		}

		@Override
		public Adapter caseCurrentProgression(CurrentProgression object) {
			return createCurrentProgressionAdapter();
		}

		@Override
		public Adapter caseDungeon(Dungeon object) {
			return createDungeonAdapter();
		}

		@Override
		public Adapter caseSettings(Settings object) {
			return createSettingsAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseQuestionRoom(QuestionRoom object) {
			return createQuestionRoomAdapter();
		}

		@Override
		public Adapter caseLearningPath(LearningPath object) {
			return createLearningPathAdapter();
		}

		@Override
		public Adapter caseAbstractFact(AbstractFact object) {
			return createAbstractFactAdapter();
		}

		@Override
		public Adapter caseSimpleQuestionRoom(SimpleQuestionRoom object) {
			return createSimpleQuestionRoomAdapter();
		}

		@Override
		public Adapter caseFact(Fact object) {
			return createFactAdapter();
		}

		@Override
		public Adapter caseLearnerPlayer(LearnerPlayer object) {
			return createLearnerPlayerAdapter();
		}

		@Override
		public Adapter caseHighLevelActivity(HighLevelActivity object) {
			return createHighLevelActivityAdapter();
		}

		@Override
		public Adapter caseEntryRoom(EntryRoom object) {
			return createEntryRoomAdapter();
		}

		@Override
		public Adapter caseDoor(Door object) {
			return createDoorAdapter();
		}

		@Override
		public Adapter caseBossRoom(BossRoom object) {
			return createBossRoomAdapter();
		}

		@Override
		public Adapter caseReconstruction(Reconstruction object) {
			return createReconstructionAdapter();
		}

		@Override
		public Adapter caseSubObjective(SubObjective object) {
			return createSubObjectiveAdapter();
		}

		@Override
		public Adapter caseResponseModality(ResponseModality object) {
			return createResponseModalityAdapter();
		}

		@Override
		public Adapter caseSimpleCompletion(SimpleCompletion object) {
			return createSimpleCompletionAdapter();
		}

		@Override
		public Adapter caseGameProfile(GameProfile object) {
			return createGameProfileAdapter();
		}

		@Override
		public Adapter caseLearningProfile(LearningProfile object) {
			return createLearningProfileAdapter();
		}

		@Override
		public Adapter caseLearningObjective(LearningObjective object) {
			return createLearningObjectiveAdapter();
		}

		@Override
		public Adapter caseLevel(Level object) {
			return createLevelAdapter();
		}

		@Override
		public Adapter caseKnowledge(Knowledge object) {
			return createKnowledgeAdapter();
		}

		@Override
		public Adapter caseFactValidityVerification(FactValidityVerification object) {
			return createFactValidityVerificationAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
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
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.MultipleChoice
	 * @generated
	 */
	public Adapter createMultipleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.ResultVerification <em>Result Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.ResultVerification
	 * @generated
	 */
	public Adapter createResultVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.SetOfFacts <em>Set Of Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.SetOfFacts
	 * @generated
	 */
	public Adapter createSetOfFactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.ProblemResolution <em>Problem Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.ProblemResolution
	 * @generated
	 */
	public Adapter createProblemResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.ExitRoom <em>Exit Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.ExitRoom
	 * @generated
	 */
	public Adapter createExitRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.MultipleCompletion <em>Multiple Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.MultipleCompletion
	 * @generated
	 */
	public Adapter createMultipleCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.CurrentProgression <em>Current Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.CurrentProgression
	 * @generated
	 */
	public Adapter createCurrentProgressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Dungeon <em>Dungeon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Dungeon
	 * @generated
	 */
	public Adapter createDungeonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.QuestionRoom <em>Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.QuestionRoom
	 * @generated
	 */
	public Adapter createQuestionRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.LearningPath <em>Learning Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.LearningPath
	 * @generated
	 */
	public Adapter createLearningPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.AbstractFact <em>Abstract Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.AbstractFact
	 * @generated
	 */
	public Adapter createAbstractFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.SimpleQuestionRoom <em>Simple Question Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.SimpleQuestionRoom
	 * @generated
	 */
	public Adapter createSimpleQuestionRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.LearnerPlayer <em>Learner Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.LearnerPlayer
	 * @generated
	 */
	public Adapter createLearnerPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.HighLevelActivity <em>High Level Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.HighLevelActivity
	 * @generated
	 */
	public Adapter createHighLevelActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.EntryRoom <em>Entry Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.EntryRoom
	 * @generated
	 */
	public Adapter createEntryRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.BossRoom <em>Boss Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.BossRoom
	 * @generated
	 */
	public Adapter createBossRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Reconstruction <em>Reconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Reconstruction
	 * @generated
	 */
	public Adapter createReconstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.SubObjective <em>Sub Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.SubObjective
	 * @generated
	 */
	public Adapter createSubObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.ResponseModality <em>Response Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.ResponseModality
	 * @generated
	 */
	public Adapter createResponseModalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.SimpleCompletion <em>Simple Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.SimpleCompletion
	 * @generated
	 */
	public Adapter createSimpleCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.GameProfile <em>Game Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.GameProfile
	 * @generated
	 */
	public Adapter createGameProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.LearningProfile <em>Learning Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.LearningProfile
	 * @generated
	 */
	public Adapter createLearningProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.LearningObjective
	 * @generated
	 */
	public Adapter createLearningObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Knowledge
	 * @generated
	 */
	public Adapter createKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.FactValidityVerification <em>Fact Validity Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.FactValidityVerification
	 * @generated
	 */
	public Adapter createFactValidityVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generatorMetamodels.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generatorMetamodels.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
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

} //GeneratorMetamodelsAdapterFactory
