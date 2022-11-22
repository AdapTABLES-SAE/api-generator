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
		public Adapter caseQuestion(Question object) {
			return createQuestionAdapter();
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
		public Adapter caseElementType(ElementType object) {
			return createElementTypeAdapter();
		}

		@Override
		public Adapter caseInteractionEType(InteractionEType object) {
			return createInteractionETypeAdapter();
		}

		@Override
		public Adapter caseAbility(Ability object) {
			return createAbilityAdapter();
		}

		@Override
		public Adapter caseActiveAbility(ActiveAbility object) {
			return createActiveAbilityAdapter();
		}

		@Override
		public Adapter casePassiveAbility(PassiveAbility object) {
			return createPassiveAbilityAdapter();
		}

		@Override
		public Adapter caseGameplay(Gameplay object) {
			return createGameplayAdapter();
		}

		@Override
		public Adapter caseGameRule(GameRule object) {
			return createGameRuleAdapter();
		}

		@Override
		public Adapter caseBuyableElement(BuyableElement object) {
			return createBuyableElementAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseAvatarEquipment(AvatarEquipment object) {
			return createAvatarEquipmentAdapter();
		}

		@Override
		public Adapter caseElements(Elements object) {
			return createElementsAdapter();
		}

		@Override
		public Adapter caseGameplays(Gameplays object) {
			return createGameplaysAdapter();
		}

		@Override
		public Adapter caseElementTypes(ElementTypes object) {
			return createElementTypesAdapter();
		}

		@Override
		public Adapter caseAbilities(Abilities object) {
			return createAbilitiesAdapter();
		}

		@Override
		public Adapter caseRoomTypes(RoomTypes object) {
			return createRoomTypesAdapter();
		}

		@Override
		public Adapter caseEquipmentEType(EquipmentEType object) {
			return createEquipmentETypeAdapter();
		}

		@Override
		public Adapter caseElementPosition(ElementPosition object) {
			return createElementPositionAdapter();
		}

		@Override
		public Adapter caseMappingModel(MappingModel object) {
			return createMappingModelAdapter();
		}

		@Override
		public Adapter caseModality2RoomType(Modality2RoomType object) {
			return createModality2RoomTypeAdapter();
		}

		@Override
		public Adapter caseComplianceRelations(ComplianceRelations object) {
			return createComplianceRelationsAdapter();
		}

		@Override
		public Adapter caseTaskType2Gameplay(TaskType2Gameplay object) {
			return createTaskType2GameplayAdapter();
		}

		@Override
		public Adapter caseResponseModalities(ResponseModalities object) {
			return createResponseModalitiesAdapter();
		}

		@Override
		public Adapter caseGameplay2RoomType(Gameplay2RoomType object) {
			return createGameplay2RoomTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link generator.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.InteractionEType <em>Interaction EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.InteractionEType
	 * @generated
	 */
	public Adapter createInteractionETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ActiveAbility <em>Active Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ActiveAbility
	 * @generated
	 */
	public Adapter createActiveAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PassiveAbility <em>Passive Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PassiveAbility
	 * @generated
	 */
	public Adapter createPassiveAbilityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.GameRule <em>Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameRule
	 * @generated
	 */
	public Adapter createGameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.BuyableElement <em>Buyable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.BuyableElement
	 * @generated
	 */
	public Adapter createBuyableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AvatarEquipment <em>Avatar Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AvatarEquipment
	 * @generated
	 */
	public Adapter createAvatarEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Elements
	 * @generated
	 */
	public Adapter createElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Gameplays <em>Gameplays</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Gameplays
	 * @generated
	 */
	public Adapter createGameplaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementTypes
	 * @generated
	 */
	public Adapter createElementTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Abilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Abilities
	 * @generated
	 */
	public Adapter createAbilitiesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.EquipmentEType <em>Equipment EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.EquipmentEType
	 * @generated
	 */
	public Adapter createEquipmentETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementPosition <em>Element Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementPosition
	 * @generated
	 */
	public Adapter createElementPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MappingModel
	 * @generated
	 */
	public Adapter createMappingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Modality2RoomType <em>Modality2 Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Modality2RoomType
	 * @generated
	 */
	public Adapter createModality2RoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ComplianceRelations <em>Compliance Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ComplianceRelations
	 * @generated
	 */
	public Adapter createComplianceRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TaskType2Gameplay <em>Task Type2 Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TaskType2Gameplay
	 * @generated
	 */
	public Adapter createTaskType2GameplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ResponseModalities <em>Response Modalities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ResponseModalities
	 * @generated
	 */
	public Adapter createResponseModalitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Gameplay2RoomType <em>Gameplay2 Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Gameplay2RoomType
	 * @generated
	 */
	public Adapter createGameplay2RoomTypeAdapter() {
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
