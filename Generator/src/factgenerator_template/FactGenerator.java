package factgenerator_template;

import java.util.Set;

import factsgenerator_hg.HGFactGeneratorAssociation;
import factsgenerator_hg.HGFactGeneratorChronology;
import factsgenerator_hg.HGFactGeneratorLocate;
import factsgenerator_maths.MTFactGeneratorCOMP1;
import factsgenerator_maths.MTFactGeneratorCOMP2;
import factsgenerator_maths.MTFactGeneratorID;
import factsgenerator_maths.MTFactGeneratorMEMB;
import factsgenerator_maths.MTFactGeneratorREB;
import generator.AQuestionableFact;
import generator.ATask;
import generator.CompletionTask;
import generator.ResultsByTask;
import generators.ALGAGenerator;
import structures.DidacticDomain;
import structures.DungeonElements;
import structures.RoomElements;

public class FactGenerator {
	
	public static void  generateQuestionableFactsByTask(DungeonElements dungeonElements, ResultsByTask resBytask) {  
		FactGeneratorTemplate factGenerator; 
		
		if(ALGAGenerator.DOMAIN.equals(DidacticDomain.MATHEMATICS)) {
			factGenerator = getCorrectMathFactsGenerators(dungeonElements, resBytask.getTask());
		} else {
			factGenerator = getCorrectHGFactsGenerators(dungeonElements, resBytask.getTask());
		}
		
		Set<AQuestionableFact> facts = factGenerator.generateQuestionableFacts(resBytask.getTask());
		resBytask.getQuestionableFacts().addAll(facts);
	}
	
	private static FactGeneratorTemplate getCorrectHGFactsGenerators(DungeonElements dungeonElements, ATask task) {
		FactGeneratorTemplate factGenerator; 
		switch(task.getType()) {
		case COMPLETE: 
			factGenerator = new HGFactGeneratorAssociation(dungeonElements);
			break;
		case MEMBERSHIP: 
			factGenerator = new HGFactGeneratorLocate(dungeonElements);
			break;
			default:
				factGenerator = new HGFactGeneratorChronology(dungeonElements);
				break;
		}
		return factGenerator;
	}
	
	private static FactGeneratorTemplate getCorrectMathFactsGenerators(DungeonElements dungeonElements, ATask task) {
		FactGeneratorTemplate factGenerator; 
		switch(task.getType()) {
		case COMPLETE: 
			switch (((CompletionTask) task).getNbMissingElements()) {
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
		return factGenerator;
	}
	
	public static void generateQuestionedFact(DungeonElements dungeonElements) throws Exception {
		FactGeneratorTemplate factGenerator; 
		for (RoomElements roomElements : dungeonElements.getRoomsElements()) {
						if(ALGAGenerator.DOMAIN.equals(DidacticDomain.MATHEMATICS)) {
				factGenerator = getCorrectMathFactsGenerators(dungeonElements, roomElements.getTask());
			} else {
				factGenerator = getCorrectHGFactsGenerators(dungeonElements, roomElements.getTask());
			}
			if(factGenerator != null) factGenerator.generateQuestionedFact(roomElements);
		}
		dungeonElements.shuffleRoomsOrder();
	}
}
