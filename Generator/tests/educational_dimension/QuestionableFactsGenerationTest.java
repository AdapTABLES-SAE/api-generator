package educational_dimension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factgenerator_template.FactGenerator;
import generator.ATask;
import generator.CompletionTask;
import generator.CurrentObjectiveLevel;
import generator.ESeveralTarget;
import generator.ESingleTarget;
import generator.GeneratorPackage;
import generator.Knowledge;
import generator.Level;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTMembership;
import generator.MTReconstruction;
import generator.MultipleChoice;
import generator.Objective;
import generator.ResultPosition;
import generator.ResultsByTask;
import generator.TableBuild;
import generator.impl.CompletionCriteriaImpl;
import generator.impl.CurrentObjectiveLevelImpl;
import generator.impl.MTCompletion1Impl;
import generator.impl.MTCompletion2Impl;
import generator.impl.MTIdentificationImpl;
import generator.impl.MTLevelImpl;
import generator.impl.MTMembershipImpl;
import generator.impl.MTReconstructionImpl;
import generator.impl.MultipleChoiceImpl;
import generator.impl.ObjectiveImpl;
import generator.impl.ResultsByTaskImpl;
import generator.impl.ResultsImpl;
import structures.DungeonElements;

class QuestionableFactsGenerationTest {

	private final static String KNOWLEDGE_FILE_PATH = "tests/modelsForTests/MultiplicationTables.xmi"; 
	private List<Level> levels; 
	private List<Objective> objectives; 
	private List<CurrentObjectiveLevel> currentOLs; 
	private Knowledge knowledge; 
	
	@BeforeEach
	void initDataSet() {
		loadInputModel();
		createObjectives();
		createLevels();
	}
	
	@Test
	void numberOfQuestionableFactsGeneratedTest() {
		buildCurrentObjectiveLevels(createEveryTasks2Test());
		generateQuestionableFactsOfCurrentObjectiveLevels();
		
		for(CurrentObjectiveLevel currentOL: currentOLs) {
			assertTrue(computeNumberOfFactsForCurrentObjectiveLevel(currentOL) == getNumberOfExpectedFactsBasedOnID(currentOL));
		}
	}
	
	
	@Test
	void numberOfQuestionableFactsGeneratedForIdentificationTest() {
		buildCurrentObjectiveLevels(createIdentificationTasks());
		generateQuestionableFactsOfCurrentObjectiveLevels();
		
		for(CurrentObjectiveLevel currentOL: currentOLs) {
			assertTrue(computeNumberOfFactsForCurrentObjectiveLevel(currentOL) <= getNumberMaxOfExpectedFactsBasedOnID(currentOL));
		}
	}
	
	private int computeNumberOfFactsForCurrentObjectiveLevel(CurrentObjectiveLevel currentOL) {
		return currentOL.getResults().getResultsbytask().get(0).getQuestionableFacts().size();
	}
	
	private int getNumberMaxOfExpectedFactsBasedOnID(CurrentObjectiveLevel currentOL) {
		String taskID = currentOL.getResults().getResultsbytask().get(0).getTask().getID();
		switch(taskID) {
        case "O1_OneTableL1ID#1": return 12*2;
        case "O1_OneTableL2ID#1": return 3*2;
        case "O1_OneTableL3ID#1": return 12*2*2;
        case "O1_OneTableL4ID#1": return 12*2*2;
        case "O1_OneTableL5ID#1": return 3*2*2;
        case "O1_OneTableL6ID#1": return 3*2*2;
        case "O1_OneTableL7ID#1": return 12*2*2*2;
        case "O1_OneTableL8ID#1": return 3*2*2*2;
        case "O2_AllTablesL1ID#1": return 12*2*12;
        case "O2_AllTablesL2ID#1": return 3*2*12;
        case "O2_AllTablesL3ID#1": return 12*2*2*12;
        case "O2_AllTablesL4ID#1": return 12*2*2*12;
        case "O2_AllTablesL5ID#1": return 3*2*2*12;
        case "O2_AllTablesL6ID#1": return 3*2*2*12;
        case "O2_AllTablesL7ID#1": return 12*2*2*2*12;
        case "O2_AllTablesL8ID#1": return 3*2*2*2*12;
		}
		return 0;
	}
	
	
	private int getNumberOfExpectedFactsBasedOnID(CurrentObjectiveLevel currentOL) {
		String taskID = currentOL.getResults().getResultsbytask().get(0).getTask().getID();
		switch(taskID) {
	    case "O1_OneTableL1C1#1": return 12;
	    case "O1_OneTableL1C1#2": return 12;
	    case "O1_OneTableL1C1#3": return 36;
	    case "O1_OneTableL1C1#4": return 24;	    
	    case "O1_OneTableL2C1#1": return 3;
	    case "O1_OneTableL2C1#2": return 3;
	    case "O1_OneTableL2C1#3": return 9;
	    case "O1_OneTableL2C1#4": return 6;	    
	    case "O1_OneTableL3C1#1": return 24;
	    case "O1_OneTableL3C1#2": return 23;
	    case "O1_OneTableL3C1#3": return 69;
	    case "O1_OneTableL3C1#4": return 47;	    
	    case "O1_OneTableL4C1#1": return 24;
	    case "O1_OneTableL4C1#2": return 24;
	    case "O1_OneTableL4C1#3": return 72;
	    case "O1_OneTableL4C1#4": return 48;
	    case "O1_OneTableL5C1#1": return 6;
	    case "O1_OneTableL5C1#2": return 6;
	    case "O1_OneTableL5C1#3": return 18;
	    case "O1_OneTableL5C1#4": return 12;	    
	    case "O1_OneTableL6C1#1": return 6;
	    case "O1_OneTableL6C1#2": return 6;
	    case "O1_OneTableL6C1#3": return 18;
	    case "O1_OneTableL6C1#4": return 12;	    
	    case "O1_OneTableL7C1#1": return 48;
	    case "O1_OneTableL7C1#2": return 46;
	    case "O1_OneTableL7C1#3": return 138;
	    case "O1_OneTableL7C1#4": return 94;	    
	    case "O1_OneTableL8C1#1": return 12;
	    case "O1_OneTableL8C1#2": return 12;
	    case "O1_OneTableL8C1#3": return 36;
	    case "O1_OneTableL8C1#4": return 24;	    
        case "O2_AllTablesL1C1#1": return 144;
        case "O2_AllTablesL1C1#2": return 144;
        case "O2_AllTablesL1C1#3": return 432;
        case "O2_AllTablesL1C1#4": return 288;       
        case "O2_AllTablesL2C1#1": return 36;
        case "O2_AllTablesL2C1#2": return 36;
        case "O2_AllTablesL2C1#3": return 108;
        case "O2_AllTablesL2C1#4": return 72;    
        case "O2_AllTablesL3C1#1": return 288;
        case "O2_AllTablesL3C1#2": return 144;
        case "O2_AllTablesL3C1#3": return 432;
        case "O2_AllTablesL3C1#4": return 432;
        case "O2_AllTablesL4C1#1": return 288;
        case "O2_AllTablesL4C1#2": return 288;
        case "O2_AllTablesL4C1#3": return 864;
        case "O2_AllTablesL4C1#4": return 576;
        case "O2_AllTablesL5C1#1": return 72;
        case "O2_AllTablesL5C1#2": return 63;
        case "O2_AllTablesL5C1#3": return 189;
        case "O2_AllTablesL5C1#4": return 135;
        case "O2_AllTablesL6C1#1": return 72;
        case "O2_AllTablesL6C1#2": return 72; 
        case "O2_AllTablesL6C1#3": return 216;
        case "O2_AllTablesL6C1#4": return 144;
        case "O2_AllTablesL7C1#1": return 576;
        case "O2_AllTablesL7C1#2": return 288;
        case "O2_AllTablesL7C1#3": return 864;
        case "O2_AllTablesL7C1#4": return 864;
        case "O2_AllTablesL8C1#1": return 144;
        case "O2_AllTablesL8C1#2": return 126;
        case "O2_AllTablesL8C1#3": return 378;
        case "O2_AllTablesL8C1#4": return 270;
        case "O1_OneTableL1C2#1": return 12;
        case "O1_OneTableL1C2#2": return 12;
        case "O1_OneTableL1C2#3": return 36;
        case "O1_OneTableL1C2#4": return 24;        
        case "O1_OneTableL2C2#1": return 3;
        case "O1_OneTableL2C2#2": return 3;
        case "O1_OneTableL2C2#3": return 9;
        case "O1_OneTableL2C2#4": return 6;     
        case "O1_OneTableL3C2#1": return 23;
        case "O1_OneTableL3C2#2": return 24;
        case "O1_OneTableL3C2#3": return 69; // 72 - 3 doublons d'une table
        case "O1_OneTableL3C2#4": return 47;        
        case "O1_OneTableL4C2#1": return 24;
        case "O1_OneTableL4C2#2": return 24;
        case "O1_OneTableL4C2#3": return 72;
        case "O1_OneTableL4C2#4": return 48;
        case "O1_OneTableL5C2#1": return 6;
        case "O1_OneTableL5C2#2": return 6;
        case "O1_OneTableL5C2#3": return 18;
        case "O1_OneTableL5C2#4": return 12;        
        case "O1_OneTableL6C2#1": return 6;
        case "O1_OneTableL6C2#2": return 6;
        case "O1_OneTableL6C2#3": return 18;
        case "O1_OneTableL6C2#4": return 12;        
        case "O1_OneTableL7C2#1": return 46;
        case "O1_OneTableL7C2#2": return 48;
        case "O1_OneTableL7C2#3": return 138;
        case "O1_OneTableL7C2#4": return 94;        
        case "O1_OneTableL8C2#1": return 12;
        case "O1_OneTableL8C2#2": return 12;
        case "O1_OneTableL8C2#3": return 36;
        case "O1_OneTableL8C2#4": return 24; 
        case "O2_AllTablesL1C2#1": return 144;
        case "O2_AllTablesL1C2#2": return 144;
        case "O2_AllTablesL1C2#3": return 432;
        case "O2_AllTablesL1C2#4": return 288;       
        case "O2_AllTablesL2C2#1": return 36;
        case "O2_AllTablesL2C2#2": return 36;
        case "O2_AllTablesL2C2#3": return 108;
        case "O2_AllTablesL2C2#4": return 72;    
        case "O2_AllTablesL3C2#1": return 144;
        case "O2_AllTablesL3C2#2": return 288;
        case "O2_AllTablesL3C2#3": return 432; // Calcul nb sans doublons = 12*3*2-3+11*3*2-3+10*3*2-3+9*3*2-3+8*3*2-3+7*3*2-3+6*3*2-3+5*3*2-3+4*3*2-3+3*3*2-3+2*3*2-3+1*3*2-3
        case "O2_AllTablesL3C2#4": return 432;
        case "O2_AllTablesL4C2#1": return 288;
        case "O2_AllTablesL4C2#2": return 288;
        case "O2_AllTablesL4C2#3": return 864;
        case "O2_AllTablesL4C2#4": return 576;
        case "O2_AllTablesL5C2#1": return 63;
        case "O2_AllTablesL5C2#2": return 72;
        case "O2_AllTablesL5C2#3": return 189;
        case "O2_AllTablesL5C2#4": return 144-9; 
        case "O2_AllTablesL6C2#1": return 72;
        case "O2_AllTablesL6C2#2": return 72; 
        case "O2_AllTablesL6C2#3": return 216;
        case "O2_AllTablesL6C2#4": return 144;
        case "O2_AllTablesL7C2#1": return 144 * 2; // O2_AllTablesL3C2#1 * 2 (pos res)
        case "O2_AllTablesL7C2#2": return 288 * 2; // O2_AllTablesL3C2#2 * 2 (pos res)
        case "O2_AllTablesL7C2#3": return 432 * 2; // O2_AllTablesL3C2#3 * 2 (pos res)
        case "O2_AllTablesL7C2#4": return 864;
        case "O2_AllTablesL8C2#1": return 126;
        case "O2_AllTablesL8C2#2": return 144;
        case "O2_AllTablesL8C2#3": return 378;
        case "O2_AllTablesL8C2#4": return 144+126; // O2_AllTablesL8C2#1 + O2_AllTablesL8C2#2
        case "O1_OneTableL1REC#1": return 12;
        case "O1_OneTableL2REC#1": return 3;
        case "O1_OneTableL3REC#1": return 23;
        case "O1_OneTableL4REC#1": return 24;
        case "O1_OneTableL5REC#1": return 6;
        case "O1_OneTableL6REC#1": return 6;
        case "O1_OneTableL7REC#1": return 12*4-2;
        case "O1_OneTableL8REC#1": return 12;
        case "O2_AllTablesL1REC#1": return 144;
        case "O2_AllTablesL2REC#1": return 36;
        case "O2_AllTablesL3REC#1": return 144;
        case "O2_AllTablesL4REC#1": return 288;
        case "O2_AllTablesL5REC#1": return 63;
        case "O2_AllTablesL6REC#1": return 72;
        case "O2_AllTablesL7REC#1": return 288;
        case "O2_AllTablesL8REC#1": return 144-18;
        case "O1_OneTableL1MEMB#1": return 4;
        case "O1_OneTableL2MEMB#1": return 1;
        case "O1_OneTableL3MEMB#1": return 4;
        case "O1_OneTableL4MEMB#1": return 4;
        case "O1_OneTableL5MEMB#1": return 1;
        case "O1_OneTableL6MEMB#1": return 1;
        case "O1_OneTableL7MEMB#1": return 4;
        case "O1_OneTableL8MEMB#1": return 1;
        case "O2_AllTablesL1MEMB#1": return 48;
        case "O2_AllTablesL2MEMB#1": return 12;
        case "O2_AllTablesL3MEMB#1": return 48;
        case "O2_AllTablesL4MEMB#1": return 48;
        case "O2_AllTablesL5MEMB#1": return 12;
        case "O2_AllTablesL6MEMB#1": return 12;
        case "O2_AllTablesL7MEMB#1": return 48;
        case "O2_AllTablesL8MEMB#1": return 12;
		}
		return 0;
	}
	
	private void generateQuestionableFactsOfCurrentObjectiveLevels() {
		for(CurrentObjectiveLevel currentOL: currentOLs) {
			//if(currentOL.getResults().getResultsbytask().get(0).getTask().getID().equals("O2_AllTablesL8REC#1")) {
			DungeonElements elements = new DungeonElements(null, -1, -1);
			elements.setCurrentObjectiveLevel(currentOL);
			FactGenerator.generateQuestionableFactsByTask(null, elements, currentOL.getResults().getResultsbytask().get(0));
		}	//	}
	}
	
	private void buildCurrentObjectiveLevels(List<ATask> tasks) {
		currentOLs = new ArrayList<>();
		
		for(Objective obj: objectives) {
			for(Level level: levels) {
				for(ATask task: tasks) {
					currentOLs.add(createCurrentObjectiveLevel(task, obj, level)); 
				}
			}
		}
	}
	
	private List<ATask> createEveryTasks2Test() {
		List<ATask> tasks = createMembershipTasks(); 
		tasks.addAll(createReconstructionTasks());
		tasks.addAll(createCompletion2Tasks());
		tasks.addAll(createCompletion1Tasks());
		return tasks;
	}
	
 	private List<ATask> createIdentificationTasks() {
		List<ATask> tasks = new ArrayList<>();
		
		MTIdentification task = new MTIdentificationImpl(); 
		task.setID("ID#1");
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		return tasks;
	}
 	
 	private List<ATask> createMembershipTasks() {
		List<ATask> tasks = new ArrayList<>();
		
		MTMembership task = new MTMembershipImpl(); 
		task.setID("MEMB#1");
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		return tasks;
	}
	
 	private List<ATask> createReconstructionTasks() {
		List<ATask> tasks = new ArrayList<>();
		
		MTReconstruction task = new MTReconstructionImpl(); 
		task.setID("REC#1");
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		return tasks;
	}
	
 	private List<ATask> createCompletion2Tasks() {
		List<ATask> tasks = new ArrayList<>();
		
		MTCompletion2 task = new MTCompletion2Impl(); 
		task.setID("C2#1"); task.getTargets().add(ESeveralTarget.OPERAND_TABLE); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion2Impl(); 
		task.setID("C2#2"); task.getTargets().add(ESeveralTarget.OPERAND_RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion2Impl(); 
		task.setID("C2#3"); task.getTargets().add(ESeveralTarget.OPERAND_TABLE); task.getTargets().add(ESeveralTarget.OPERAND_RESULT); 
		task.getTargets().add(ESeveralTarget.TABLE_RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion2Impl(); 
		task.setID("C2#4"); task.getTargets().add(ESeveralTarget.OPERAND_TABLE); task.getTargets().add(ESeveralTarget.TABLE_RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		return tasks;
	}
	
 	private List<ATask> createCompletion1Tasks(){
		List<ATask> tasks = new ArrayList<>();
		
		MTCompletion1 task = new MTCompletion1Impl(); 
		task.setID("C1#1"); task.getTargets().add(ESingleTarget.TABLE); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion1Impl(); 
		task.setID("C1#2"); task.getTargets().add(ESingleTarget.RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion1Impl(); 
		task.setID("C1#3"); task.getTargets().add(ESingleTarget.TABLE); task.getTargets().add(ESingleTarget.OPERAND); task.getTargets().add(ESingleTarget.RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		task = new MTCompletion1Impl(); 
		task.setID("C1#4"); task.getTargets().add(ESingleTarget.TABLE); task.getTargets().add(ESingleTarget.RESULT); 
		task.setResponseModality(this.getMultipleChoiceInstance(task));
		tasks.add(task);
		
		return tasks;
	}

	private void createLevels() {
		levels = new ArrayList<>();
		MTLevel level = new MTLevelImpl();
		level.setID("L1"); level.setCompletionCriteria(new CompletionCriteriaImpl()); level.setBuildSetup(TableBuild.TABLE_OPERAND); 
		level.setMinInterval(1); level.setMaxInterval(12); level.setResultPositionSetup(ResultPosition.RIGHT);
		levels.add(createDeepCopy(level)); 
		level.setID("L3"); level.setBuildSetup(TableBuild.MIX);
		levels.add(createDeepCopy(level)); 
		level.setID("L4"); level.setBuildSetup(TableBuild.TABLE_OPERAND); level.setResultPositionSetup(ResultPosition.MIX);
		levels.add(createDeepCopy(level)); 
		level.setID("L7"); level.setBuildSetup(TableBuild.MIX); level.setResultPositionSetup(ResultPosition.MIX);
		levels.add(createDeepCopy(level));
		level.setID("L8"); level.setMinInterval(3); level.setMaxInterval(5);
		levels.add(createDeepCopy(level));
		level.setID("L6"); level.setBuildSetup(TableBuild.TABLE_OPERAND);
		levels.add(createDeepCopy(level));
		level.setID("L5"); level.setBuildSetup(TableBuild.MIX); level.setResultPositionSetup(ResultPosition.LEFT);
		levels.add(createDeepCopy(level));
		level.setID("L2"); level.setBuildSetup(TableBuild.OPERAND_TABLE); level.setResultPositionSetup(ResultPosition.LEFT);
		levels.add(createDeepCopy(level));
		
	}
	
	private void createObjectives() {
		objectives = new ArrayList<>();
		
		Objective obj = new ObjectiveImpl();
		obj.setID("O1_OneTable"); obj.getSetoffacts().add(knowledge.getKnowledgefacts().get(0)); 
		objectives.add(obj);
		obj = new ObjectiveImpl();
		obj.setID("O2_AllTables"); obj.getSetoffacts().addAll(knowledge.getKnowledgefacts()); 
		objectives.add(obj);
	}
	
	private CurrentObjectiveLevel createCurrentObjectiveLevel(ATask task, Objective objective, Level level) {
		CurrentObjectiveLevel currentOL = new CurrentObjectiveLevelImpl();
		currentOL.setLevel(level);
		currentOL.setObjective(objective);
		currentOL.setResults(new ResultsImpl());
		ResultsByTask rbt = new ResultsByTaskImpl(); 
		rbt.setTask(createCopyOfTask(task, objective.getID()+level.getID()+task.getID()));
		currentOL.getResults().getResultsbytask().add(rbt);
		return currentOL;
	}
	
	private ATask createCopyOfTask(ATask task, String newID) {
		switch (task.getType()) {
		case COMPLETE: 
			if(task instanceof MTCompletion1) {
				MTCompletion1 newTask = new MTCompletion1Impl();
				newTask.setID(newID);
				newTask.setResponseModality(this.getMultipleChoiceInstance(task));
				newTask.getTargets().addAll(((MTCompletion1) task).getTargets());
				return newTask;
			}
			
			if(task instanceof MTCompletion2) {
				MTCompletion2 newTask = new MTCompletion2Impl();
				newTask.setID(newID);
				newTask.setResponseModality(this.getMultipleChoiceInstance(task));
				newTask.getTargets().addAll(((MTCompletion2) task).getTargets());
				return newTask;
			}
			
			if(task instanceof MTReconstruction) {
				MTReconstruction newTask = new MTReconstructionImpl();
				newTask.setID(newID);
				newTask.setResponseModality(this.getMultipleChoiceInstance(task));
				return newTask;
			}
		case IDENTIFY: 
			if(task instanceof MTIdentification) {
				MTIdentification newTask = new MTIdentificationImpl();
				newTask.setID(newID);
				newTask.setResponseModality(this.getMultipleChoiceInstance(task));
				return newTask;
			}
		case MEMBERSHIP: 
			if(task instanceof MTMembership) {
				MTMembership newTask = new MTMembershipImpl();
				newTask.setID(newID);
				newTask.setResponseModality(this.getMultipleChoiceInstance(task));
				newTask.setIdentifySharedProperty(((MTMembership)task).isIdentifySharedProperty());
				return newTask;
			}
		default:
			return null;
		}
		
	}
	
	private MultipleChoice getMultipleChoiceInstance(ATask task) {
		MultipleChoice mc = new MultipleChoiceImpl();
		switch(task.getType()) {
		case COMPLETE:
			if(((CompletionTask) task).getNbMissingElements() == 1){
				mc.setNbChoices(4); mc.setNbBadChoices(3);
			} else if(((CompletionTask) task).getNbMissingElements() == 2) {
				mc.setNbChoices(5); mc.setNbBadChoices(2);
			} else {
				mc.setNbChoices(6); mc.setNbBadChoices(3);
			}
			break;
		case IDENTIFY: mc.setNbChoices(2); mc.setNbBadChoices(1);
			break;
		case MEMBERSHIP: mc.setNbChoices(6); mc.setNbBadChoices(3); 
			break;
		default: 
			break;
		}
		return mc;
	}
	
	private MTLevel createDeepCopy(MTLevel level) {
		MTLevel levelC = new MTLevelImpl();
		levelC.setID(level.getID());
		levelC.setCompletionCriteria(level.getCompletionCriteria());
		levelC.setBuildSetup(level.getBuildSetup());
		levelC.setMinInterval(level.getMinInterval());
		levelC.setMaxInterval(level.getMaxInterval());
		levelC.setResultPositionSetup(level.getResultPositionSetup());
		return levelC;
	}
		
	private void loadInputModel() {
		ResourceSet resourceSet = new ResourceSetImpl();
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File multiplicationTables = new File(KNOWLEDGE_FILE_PATH);
	
		Resource resource = resourceSet.createResource(URI.createFileURI(multiplicationTables.getAbsolutePath()));
	
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 

		this.knowledge = (Knowledge) resource.getContents().get(0);
	}
}
