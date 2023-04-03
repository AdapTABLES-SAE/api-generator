package factgenerator_template;

import java.util.List;

import factsgenerator_maths.MTFactGeneratorCOMP1;
import factsgenerator_maths.MTFactGeneratorCOMP2;
import factsgenerator_maths.MTFactGeneratorID;
import factsgenerator_maths.MTFactGeneratorMEMB;
import factsgenerator_maths.MTFactGeneratorREB;
import generator.ResultsByTask;
import managers.EducationElementsManager;

public class FactGenerator {
	
	public static void generateQuestionableFacts(EducationElementsManager eeManager) {
		eeManager.instanciateQFbyTasks();
		boolean wasGenerated = false;
		for (ResultsByTask resBytask : eeManager.getLearnerResultsByTasks()) {
			if(resBytask.getQuestionableFacts().isEmpty()) {
				generateQuestionableFactsByTask(eeManager, resBytask);
				wasGenerated = true;
			}
		}
		if(wasGenerated) {
			eeManager.saveLearnerModel();
		}
	}

	private static void  generateQuestionableFactsByTask(EducationElementsManager eeManager, ResultsByTask resBytask) {  
		FactGeneratorTemplate factGenerator; 
		switch(resBytask.getTask().getType()) {
		case COMPLETE1: 
			factGenerator = new MTFactGeneratorCOMP1(eeManager);
			break;
		case COMPLETE2: 
			factGenerator = new MTFactGeneratorCOMP2(eeManager);
			break;
		case REBUILD: 
			factGenerator = new MTFactGeneratorREB(eeManager);
			break;
		case IDENTIFY: 
			factGenerator = new MTFactGeneratorID(eeManager);
			break;
		default: 
			factGenerator = new MTFactGeneratorMEMB(eeManager);
			break;
		}
		resBytask.getQuestionableFacts().addAll(factGenerator.generateQuestionableFacts(resBytask.getTask()));
	}
	
	public static void generateQuestionedFact(EducationElementsManager eeManager, List<ResultsByTask> tasks) throws Exception {
		FactGeneratorTemplate factGenerator = null; 
		for (ResultsByTask aTask : tasks) {
			switch(aTask.getTask().getType()) {
			case COMPLETE1: 
				factGenerator = new MTFactGeneratorCOMP1(eeManager);
				break;
			case COMPLETE2: 
				factGenerator = new MTFactGeneratorCOMP2(eeManager);
				break;
			case REBUILD: 
				factGenerator = new MTFactGeneratorREB(eeManager);
				break;
			case IDENTIFY: 
				factGenerator = new MTFactGeneratorID(eeManager);
				break;
			default: 
				factGenerator = new MTFactGeneratorMEMB(eeManager);
				break;
			}	
			if(factGenerator != null) factGenerator.generateQuestionedFact(eeManager, aTask);
		}
	}
}
