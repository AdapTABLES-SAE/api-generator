package factgenerator_template;

import java.util.Set;

import factsgenerator_maths.MTFactGeneratorCOMP1;
import factsgenerator_maths.MTFactGeneratorCOMP2;
import factsgenerator_maths.MTFactGeneratorID;
import factsgenerator_maths.MTFactGeneratorMEMB;
import factsgenerator_maths.MTFactGeneratorREB;
import generator.CompletionTask;
import generator.QuestionableFact;
import generator.ResultsByTask;
import structures.DungeonElements;
import structures.RoomElements;

public class FactGenerator {
	
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
		Set<QuestionableFact> facts = factGenerator.generateQuestionableFacts(resBytask.getTask());
		resBytask.getQuestionableFacts().addAll(facts);
	}
	
	public static void generateQuestionedFact(DungeonElements dungeonElements) throws Exception {
		System.out.println("Generate Questioned Facts");
		FactGeneratorTemplate factGenerator = null; 
		for (RoomElements roomElements : dungeonElements.getRoomsElements()) {
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
		}
		
		dungeonElements.shuffleRoomsOrder();
		System.out.println("End Generate Question Facts");
	}
}
