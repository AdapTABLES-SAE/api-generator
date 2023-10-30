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
		public Adapter caseClassroom(Classroom object) {
			return createClassroomAdapter();
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
		public Adapter caseCompletionTask(CompletionTask object) {
			return createCompletionTaskAdapter();
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
		public Adapter caseCompletionCriteria(CompletionCriteria object) {
			return createCompletionCriteriaAdapter();
		}

		@Override
		public Adapter caseLevelsDifficultyProgress(LevelsDifficultyProgress object) {
			return createLevelsDifficultyProgressAdapter();
		}

		@Override
		public Adapter caseGameElementTypes(GameElementTypes object) {
			return createGameElementTypesAdapter();
		}

		@Override
		public Adapter caseElementsTypes(ElementsTypes object) {
			return createElementsTypesAdapter();
		}

		@Override
		public Adapter caseEquipments(Equipments object) {
			return createEquipmentsAdapter();
		}

		@Override
		public Adapter caseEquipment(Equipment object) {
			return createEquipmentAdapter();
		}

		@Override
		public Adapter caseGameplay(Gameplay object) {
			return createGameplayAdapter();
		}

		@Override
		public Adapter caseGameplays(Gameplays object) {
			return createGameplaysAdapter();
		}

		@Override
		public Adapter caseQuestionableFactResult(QuestionableFactResult object) {
			return createQuestionableFactResultAdapter();
		}

		@Override
		public Adapter caseAbility(Ability object) {
			return createAbilityAdapter();
		}

		@Override
		public Adapter caseAbilities(Abilities object) {
			return createAbilitiesAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter casePositionedElement(PositionedElement object) {
			return createPositionedElementAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseQuestionParam(QuestionParam object) {
			return createQuestionParamAdapter();
		}

		@Override
		public Adapter casePropositionParam(PropositionParam object) {
			return createPropositionParamAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseCorrectness(Correctness object) {
			return createCorrectnessAdapter();
		}

		@Override
		public Adapter caseEntrySoluceParam(EntrySoluceParam object) {
			return createEntrySoluceParamAdapter();
		}

		@Override
		public Adapter caseDisplay(Display object) {
			return createDisplayAdapter();
		}

		@Override
		public Adapter caseAComponent(AComponent object) {
			return createAComponentAdapter();
		}

		@Override
		public Adapter caseStructure(Structure object) {
			return createStructureAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseQuantity(Quantity object) {
			return createQuantityAdapter();
		}

		@Override
		public Adapter caseWantedAnswersParam(WantedAnswersParam object) {
			return createWantedAnswersParamAdapter();
		}

		@Override
		public Adapter caseExpectedAnswer(ExpectedAnswer object) {
			return createExpectedAnswerAdapter();
		}

		@Override
		public Adapter caseCorrectnessValue(CorrectnessValue object) {
			return createCorrectnessValueAdapter();
		}

		@Override
		public Adapter caseAValue(AValue object) {
			return createAValueAdapter();
		}

		@Override
		public Adapter casePositionedStructureElement(PositionedStructureElement object) {
			return createPositionedStructureElementAdapter();
		}

		@Override
		public Adapter caseFactSolutionParam(FactSolutionParam object) {
			return createFactSolutionParamAdapter();
		}

		@Override
		public Adapter caseOrderingTask(OrderingTask object) {
			return createOrderingTaskAdapter();
		}

		@Override
		public Adapter casePrompt(Prompt object) {
			return createPromptAdapter();
		}

		@Override
		public Adapter caseFactCorrectnessParam(FactCorrectnessParam object) {
			return createFactCorrectnessParamAdapter();
		}

		@Override
		public Adapter caseGameplayTaskRelations(GameplayTaskRelations object) {
			return createGameplayTaskRelationsAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseQuestionGameplay(QuestionGameplay object) {
			return createQuestionGameplayAdapter();
		}

		@Override
		public Adapter caseNoQuestionGameplay(NoQuestionGameplay object) {
			return createNoQuestionGameplayAdapter();
		}

		@Override
		public Adapter caseSize(Size object) {
			return createSizeAdapter();
		}

		@Override
		public Adapter caseStatementElementType(StatementElementType object) {
			return createStatementElementTypeAdapter();
		}

		@Override
		public Adapter casePlayerProgress(PlayerProgress object) {
			return createPlayerProgressAdapter();
		}

		@Override
		public Adapter caseLearnerProgress(LearnerProgress object) {
			return createLearnerProgressAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseItems(Items object) {
			return createItemsAdapter();
		}

		@Override
		public Adapter caseStatistics(Statistics object) {
			return createStatisticsAdapter();
		}

		@Override
		public Adapter caseElementType(ElementType object) {
			return createElementTypeAdapter();
		}

		@Override
		public Adapter caseCurses(Curses object) {
			return createCursesAdapter();
		}

		@Override
		public Adapter caseCurse(Curse object) {
			return createCurseAdapter();
		}

		@Override
		public Adapter caseLabyrinthCurse(LabyrinthCurse object) {
			return createLabyrinthCurseAdapter();
		}

		@Override
		public Adapter caseCurseEligibility(CurseEligibility object) {
			return createCurseEligibilityAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseVisualization(Visualization object) {
			return createVisualizationAdapter();
		}

		@Override
		public Adapter caseVisualizationPosition(VisualizationPosition object) {
			return createVisualizationPositionAdapter();
		}

		@Override
		public Adapter caseLegendText(LegendText object) {
			return createLegendTextAdapter();
		}

		@Override
		public Adapter caseHistoryFact(HistoryFact object) {
			return createHistoryFactAdapter();
		}

		@Override
		public Adapter caseGeographyLegendFact(GeographyLegendFact object) {
			return createGeographyLegendFactAdapter();
		}

		@Override
		public Adapter caseGeographyFact(GeographyFact object) {
			return createGeographyFactAdapter();
		}

		@Override
		public Adapter caseDate(Date object) {
			return createDateAdapter();
		}

		@Override
		public Adapter caseTimePeriod(TimePeriod object) {
			return createTimePeriodAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseAQuestionParam(AQuestionParam object) {
			return createAQuestionParamAdapter();
		}

		@Override
		public Adapter caseVisualizationQuestionParam(VisualizationQuestionParam object) {
			return createVisualizationQuestionParamAdapter();
		}

		@Override
		public Adapter caseHAssociation(HAssociation object) {
			return createHAssociationAdapter();
		}

		@Override
		public Adapter caseHLegend(HLegend object) {
			return createHLegendAdapter();
		}

		@Override
		public Adapter caseGLocate(GLocate object) {
			return createGLocateAdapter();
		}

		@Override
		public Adapter caseTeacher(Teacher object) {
			return createTeacherAdapter();
		}

		@Override
		public Adapter caseTeachers(Teachers object) {
			return createTeachersAdapter();
		}

		@Override
		public Adapter caseClassrooms(Classrooms object) {
			return createClassroomsAdapter();
		}

		@Override
		public Adapter caseAQuestionableFact(AQuestionableFact object) {
			return createAQuestionableFactAdapter();
		}

		@Override
		public Adapter caseAVisualizationQuestionableFact(AVisualizationQuestionableFact object) {
			return createAVisualizationQuestionableFactAdapter();
		}

		@Override
		public Adapter caseVisualizationSolution(VisualizationSolution object) {
			return createVisualizationSolutionAdapter();
		}

		@Override
		public Adapter caseHGLevel(HGLevel object) {
			return createHGLevelAdapter();
		}

		@Override
		public Adapter casePositionedVisualizationElement(PositionedVisualizationElement object) {
			return createPositionedVisualizationElementAdapter();
		}

		@Override
		public Adapter caseDateQuestionableFact(DateQuestionableFact object) {
			return createDateQuestionableFactAdapter();
		}

		@Override
		public Adapter caseHChronology(HChronology object) {
			return createHChronologyAdapter();
		}

		@Override
		public Adapter caseMapQuestionableFact(MapQuestionableFact object) {
			return createMapQuestionableFactAdapter();
		}

		@Override
		public Adapter caseJudoTechniqueFact(JudoTechniqueFact object) {
			return createJudoTechniqueFactAdapter();
		}

		@Override
		public Adapter caseClassifyTechnique(ClassifyTechnique object) {
			return createClassifyTechniqueAdapter();
		}

		@Override
		public Adapter caseIdentifyTechnique(IdentifyTechnique object) {
			return createIdentifyTechniqueAdapter();
		}

		@Override
		public Adapter caseJudoQuestionableTechniqueFact(JudoQuestionableTechniqueFact object) {
			return createJudoQuestionableTechniqueFactAdapter();
		}

		@Override
		public Adapter caseJudoQuestionableClassifyFact(JudoQuestionableClassifyFact object) {
			return createJudoQuestionableClassifyFactAdapter();
		}

		@Override
		public Adapter caseJudoLevel(JudoLevel object) {
			return createJudoLevelAdapter();
		}

		@Override
		public Adapter caseJudoArbitrationGestureFact(JudoArbitrationGestureFact object) {
			return createJudoArbitrationGestureFactAdapter();
		}

		@Override
		public Adapter caseIdentifyArbitrationGesture(IdentifyArbitrationGesture object) {
			return createIdentifyArbitrationGestureAdapter();
		}

		@Override
		public Adapter caseJudoQuestionableArbitrationFact(JudoQuestionableArbitrationFact object) {
			return createJudoQuestionableArbitrationFactAdapter();
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
	 * Creates a new adapter for an object of class '{@link generator.Classroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Classroom
	 * @generated
	 */
	public Adapter createClassroomAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.CompletionTask <em>Completion Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CompletionTask
	 * @generated
	 */
	public Adapter createCompletionTaskAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.CompletionCriteria <em>Completion Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CompletionCriteria
	 * @generated
	 */
	public Adapter createCompletionCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LevelsDifficultyProgress <em>Levels Difficulty Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LevelsDifficultyProgress
	 * @generated
	 */
	public Adapter createLevelsDifficultyProgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GameElementTypes <em>Game Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameElementTypes
	 * @generated
	 */
	public Adapter createGameElementTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ElementsTypes <em>Elements Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ElementsTypes
	 * @generated
	 */
	public Adapter createElementsTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Equipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Equipments
	 * @generated
	 */
	public Adapter createEquipmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Equipment
	 * @generated
	 */
	public Adapter createEquipmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.QuestionableFactResult <em>Questionable Fact Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionableFactResult
	 * @generated
	 */
	public Adapter createQuestionableFactResultAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.PositionedElement <em>Positioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PositionedElement
	 * @generated
	 */
	public Adapter createPositionedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QuestionParam <em>Question Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionParam
	 * @generated
	 */
	public Adapter createQuestionParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PropositionParam <em>Proposition Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PropositionParam
	 * @generated
	 */
	public Adapter createPropositionParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Correctness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Correctness
	 * @generated
	 */
	public Adapter createCorrectnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.EntrySoluceParam <em>Entry Soluce Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.EntrySoluceParam
	 * @generated
	 */
	public Adapter createEntrySoluceParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AComponent <em>AComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AComponent
	 * @generated
	 */
	public Adapter createAComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.WantedAnswersParam <em>Wanted Answers Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.WantedAnswersParam
	 * @generated
	 */
	public Adapter createWantedAnswersParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ExpectedAnswer <em>Expected Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ExpectedAnswer
	 * @generated
	 */
	public Adapter createExpectedAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CorrectnessValue <em>Correctness Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CorrectnessValue
	 * @generated
	 */
	public Adapter createCorrectnessValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AValue <em>AValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AValue
	 * @generated
	 */
	public Adapter createAValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PositionedStructureElement <em>Positioned Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PositionedStructureElement
	 * @generated
	 */
	public Adapter createPositionedStructureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.FactSolutionParam <em>Fact Solution Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.FactSolutionParam
	 * @generated
	 */
	public Adapter createFactSolutionParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.OrderingTask <em>Ordering Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.OrderingTask
	 * @generated
	 */
	public Adapter createOrderingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Prompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Prompt
	 * @generated
	 */
	public Adapter createPromptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.FactCorrectnessParam <em>Fact Correctness Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.FactCorrectnessParam
	 * @generated
	 */
	public Adapter createFactCorrectnessParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GameplayTaskRelations <em>Gameplay Task Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GameplayTaskRelations
	 * @generated
	 */
	public Adapter createGameplayTaskRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.QuestionGameplay <em>Question Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.QuestionGameplay
	 * @generated
	 */
	public Adapter createQuestionGameplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.NoQuestionGameplay <em>No Question Gameplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.NoQuestionGameplay
	 * @generated
	 */
	public Adapter createNoQuestionGameplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.StatementElementType <em>Statement Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.StatementElementType
	 * @generated
	 */
	public Adapter createStatementElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PlayerProgress <em>Player Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PlayerProgress
	 * @generated
	 */
	public Adapter createPlayerProgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LearnerProgress <em>Learner Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LearnerProgress
	 * @generated
	 */
	public Adapter createLearnerProgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Items <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Items
	 * @generated
	 */
	public Adapter createItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Statistics
	 * @generated
	 */
	public Adapter createStatisticsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link generator.Curses <em>Curses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Curses
	 * @generated
	 */
	public Adapter createCursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Curse <em>Curse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Curse
	 * @generated
	 */
	public Adapter createCurseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LabyrinthCurse <em>Labyrinth Curse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LabyrinthCurse
	 * @generated
	 */
	public Adapter createLabyrinthCurseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CurseEligibility <em>Curse Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CurseEligibility
	 * @generated
	 */
	public Adapter createCurseEligibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.VisualizationPosition <em>Visualization Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.VisualizationPosition
	 * @generated
	 */
	public Adapter createVisualizationPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LegendText <em>Legend Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LegendText
	 * @generated
	 */
	public Adapter createLegendTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HistoryFact <em>History Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HistoryFact
	 * @generated
	 */
	public Adapter createHistoryFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GeographyLegendFact <em>Geography Legend Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GeographyLegendFact
	 * @generated
	 */
	public Adapter createGeographyLegendFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GeographyFact <em>Geography Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GeographyFact
	 * @generated
	 */
	public Adapter createGeographyFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TimePeriod
	 * @generated
	 */
	public Adapter createTimePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AQuestionParam <em>AQuestion Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AQuestionParam
	 * @generated
	 */
	public Adapter createAQuestionParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.VisualizationQuestionParam <em>Visualization Question Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.VisualizationQuestionParam
	 * @generated
	 */
	public Adapter createVisualizationQuestionParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HAssociation <em>HAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HAssociation
	 * @generated
	 */
	public Adapter createHAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HLegend <em>HLegend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HLegend
	 * @generated
	 */
	public Adapter createHLegendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.GLocate <em>GLocate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.GLocate
	 * @generated
	 */
	public Adapter createGLocateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Teacher
	 * @generated
	 */
	public Adapter createTeacherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Teachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Teachers
	 * @generated
	 */
	public Adapter createTeachersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Classrooms <em>Classrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Classrooms
	 * @generated
	 */
	public Adapter createClassroomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AQuestionableFact <em>AQuestionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AQuestionableFact
	 * @generated
	 */
	public Adapter createAQuestionableFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.AVisualizationQuestionableFact <em>AVisualization Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.AVisualizationQuestionableFact
	 * @generated
	 */
	public Adapter createAVisualizationQuestionableFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.VisualizationSolution <em>Visualization Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.VisualizationSolution
	 * @generated
	 */
	public Adapter createVisualizationSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.MapQuestionableFact <em>Map Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.MapQuestionableFact
	 * @generated
	 */
	public Adapter createMapQuestionableFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoTechniqueFact <em>Judo Technique Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoTechniqueFact
	 * @generated
	 */
	public Adapter createJudoTechniqueFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ClassifyTechnique <em>Classify Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ClassifyTechnique
	 * @generated
	 */
	public Adapter createClassifyTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.IdentifyTechnique <em>Identify Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.IdentifyTechnique
	 * @generated
	 */
	public Adapter createIdentifyTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoQuestionableTechniqueFact <em>Judo Questionable Technique Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoQuestionableTechniqueFact
	 * @generated
	 */
	public Adapter createJudoQuestionableTechniqueFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoQuestionableClassifyFact <em>Judo Questionable Classify Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoQuestionableClassifyFact
	 * @generated
	 */
	public Adapter createJudoQuestionableClassifyFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoLevel <em>Judo Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoLevel
	 * @generated
	 */
	public Adapter createJudoLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoArbitrationGestureFact <em>Judo Arbitration Gesture Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoArbitrationGestureFact
	 * @generated
	 */
	public Adapter createJudoArbitrationGestureFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.IdentifyArbitrationGesture <em>Identify Arbitration Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.IdentifyArbitrationGesture
	 * @generated
	 */
	public Adapter createIdentifyArbitrationGestureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.JudoQuestionableArbitrationFact <em>Judo Questionable Arbitration Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.JudoQuestionableArbitrationFact
	 * @generated
	 */
	public Adapter createJudoQuestionableArbitrationFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HGLevel <em>HG Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HGLevel
	 * @generated
	 */
	public Adapter createHGLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.PositionedVisualizationElement <em>Positioned Visualization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.PositionedVisualizationElement
	 * @generated
	 */
	public Adapter createPositionedVisualizationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.DateQuestionableFact <em>Date Questionable Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.DateQuestionableFact
	 * @generated
	 */
	public Adapter createDateQuestionableFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HChronology <em>HChronology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HChronology
	 * @generated
	 */
	public Adapter createHChronologyAdapter() {
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
