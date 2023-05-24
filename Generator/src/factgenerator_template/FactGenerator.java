package factgenerator_template;

import factsgenerator_maths.MTFactGeneratorCOMP1;
import factsgenerator_maths.MTFactGeneratorCOMP2;
import factsgenerator_maths.MTFactGeneratorID;
import factsgenerator_maths.MTFactGeneratorMEMB;
import factsgenerator_maths.MTFactGeneratorREB;
import generator.CompletionTask;
import generator.ResultsByTask;
import structures.DungeonElements;
import structures.RoomElements;

public class FactGenerator {
	
	/*public static void generateQuestionableFacts(DungeonElements dungeonElements) {
		dungeonElements.instanciateQFbyTasks();
		boolean wasGenerated = false;
		for (ResultsByTask resBytask : dungeonElements.getLearnerResultsByTasks()) {
			if(resBytask.getQuestionableFacts().isEmpty()) {
				generateQuestionableFactsByTask(dungeonElements, resBytask);
				wasGenerated = true;
			}
		}
		if(wasGenerated) {
			dungeonElements.saveLearnerModel();
		}
	}*/

	public static void  generateQuestionableFactsByTask(DungeonElements dungeonElements, ResultsByTask resBytask) {  
		FactGeneratorTemplate factGenerator; 
		switch(resBytask.getTask().getType()) {
		case COMPLETE: 
			switch (((CompletionTask) resBytask.getTask()).getNbMissingElements()) {
			case 1:
				factGenerator = new MTFactGeneratorCOMP1(dungeonElements);
				break;
			case 2:
				factGenerator = new MTFactGeneratorCOMP2(dungeonElements);		
				break;
			default: // 3
				factGenerator = new MTFactGeneratorREB(dungeonElements);
				break;
			}
			break;
		case IDENTIFY: 
			factGenerator = new MTFactGeneratorID(dungeonElements);
			break;
		default: 
			factGenerator = new MTFactGeneratorMEMB(dungeonElements);
			break;
		}
		resBytask.getQuestionableFacts().addAll(factGenerator.generateQuestionableFacts(resBytask.getTask()));
	}
	
	public static void generateQuestionedFact(DungeonElements dungeonElements) throws Exception {
		//System.out.println("Generate Questioned Facts");
		FactGeneratorTemplate factGenerator = null; 
		//int roomOrder = 0;
		//System.out.println("Number of rooms with tasks "+tasks.size());
		for (RoomElements roomElements : dungeonElements.getRoomsElements()) {
			//ResultsByTask aTask = roomElements.getCorrespondingResultByTask(dungeonElements.getCurrentObjectiveLevel());
			//System.out.println(aTask.getTask().getID()+" __");
			switch(roomElements.getTask().getType()) {
			case COMPLETE: 
				switch (((CompletionTask) roomElements.getTask()).getNbMissingElements()) {
				case 1:
					factGenerator = new MTFactGeneratorCOMP1(dungeonElements);
					break;
				case 2:
					factGenerator = new MTFactGeneratorCOMP2(dungeonElements);		
					break;
				default: // 3
					factGenerator = new MTFactGeneratorREB(dungeonElements);
					break;
				}
				break;
			case IDENTIFY: 
				factGenerator = new MTFactGeneratorID(dungeonElements);
				break;
			default: 
				factGenerator = new MTFactGeneratorMEMB(dungeonElements);
				break;
			}	
			if(factGenerator != null) factGenerator.generateQuestionedFact(roomElements);
			//roomOrder++;
		}
		
		dungeonElements.shuffleRoomsOrder();
		//System.out.println("End Generate Question Facts");
	}
}
