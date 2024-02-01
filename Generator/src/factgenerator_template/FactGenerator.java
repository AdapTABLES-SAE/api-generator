package factgenerator_template;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factsgenerator_hg.HGFactGeneratorAssociation;
import factsgenerator_hg.HGFactGeneratorChronology;
import factsgenerator_hg.HGFactGeneratorLegend;
import factsgenerator_hg.HGFactGeneratorLocate;
import factsgenerator_hg.HGFactGeneratorMembership;
import factsgenerator_hg.HGFactGeneratorOrderEvent;
import factsgenerator_judo.JudoFactGeneratorClassifyTechnique;
import factsgenerator_judo.JudoFactGeneratorIdentifyArbitration;
import factsgenerator_judo.JudoFactGeneratorIdentifyTechnique;
import factsgenerator_maths.MTFactGeneratorCOMP1;
import factsgenerator_maths.MTFactGeneratorCOMP2;
import factsgenerator_maths.MTFactGeneratorID;
import factsgenerator_maths.MTFactGeneratorMEMB;
import factsgenerator_maths.MTFactGeneratorREB;
import generator.AQuestionableFact;
import generator.ATask;
import generator.CompletionTask;
import generator.GeographyMembership;
import generator.HistoricalEventAssociation;
import generator.IdentifyTechnique;
import generator.LegendAMap;
import generator.OrderingTask;
import generator.ResultsByTask;
import generators.ALGAGenerator;
import managers.ModelsManager;
import structures.DidacticDomain;
import structures.DungeonElements;
import structures.RoomElements;

public class FactGenerator {
	
	public static void  generateQuestionableFactsByTask(ModelsManager modelsManager, DungeonElements dungeonElements, ResultsByTask resBytask) {  
		FactGeneratorTemplate factGenerator; 
		
		if(ALGAGenerator.DOMAIN.equals(DidacticDomain.MATHEMATICS)) {
			factGenerator = getCorrectMathFactsGenerators(dungeonElements, resBytask.getTask());
		} else if(ALGAGenerator.DOMAIN.equals(DidacticDomain.HISTORY_GEOGRAPHY)) {
			factGenerator = getCorrectHGFactsGenerators(modelsManager, dungeonElements, resBytask.getTask());
		} else {
			factGenerator = getCorrectJudoFactsGenerators(modelsManager, dungeonElements, resBytask.getTask());
		}
		
		List<AQuestionableFact> facts = new ArrayList<>(factGenerator.generateQuestionableFacts(resBytask.getTask()));
		
		if(resBytask.getTask() instanceof OrderingTask) {
			OrderingTask task = (OrderingTask) resBytask.getTask(); 
			while(facts.size() > task.getMaxQuestionableFacts()) {
				int index = new Random().nextInt(facts.size());
				facts.remove(index);
			}
		}
		
		resBytask.getQuestionableFacts().addAll(facts);
	}
	
	
	private static FactGeneratorTemplate getCorrectHGFactsGenerators(ModelsManager modelsManager, DungeonElements dungeonElements, ATask task) {
		FactGeneratorTemplate factGenerator; 
		switch(task.getType()) {
		case COMPLETE: 
			if(task instanceof HistoricalEventAssociation) {
				factGenerator = new HGFactGeneratorAssociation(modelsManager, dungeonElements);
			} else if(task instanceof LegendAMap){
				factGenerator = new HGFactGeneratorLegend(dungeonElements);
			} else {
				factGenerator = new HGFactGeneratorChronology(dungeonElements);
			}
			break;
		case ORDER:
			factGenerator = new HGFactGeneratorOrderEvent(dungeonElements);
			break;
			default: // MEMBERSHIP
				if(task instanceof GeographyMembership) {
					factGenerator = new HGFactGeneratorMembership(modelsManager, dungeonElements);
				} else {
					factGenerator = new HGFactGeneratorLocate(dungeonElements);
				}
				break;
		}
		return factGenerator;
	}
	
	private static FactGeneratorTemplate getCorrectJudoFactsGenerators(ModelsManager modelsManager, DungeonElements dungeonElements, ATask task) {
		FactGeneratorTemplate factGenerator; 
		switch(task.getType()) {
		case COMPLETE: 
			if(task instanceof IdentifyTechnique) {
				factGenerator = new JudoFactGeneratorIdentifyTechnique(modelsManager, dungeonElements);
			} else {
				factGenerator = new JudoFactGeneratorIdentifyArbitration(dungeonElements);
			}
			break;
		default: 
			factGenerator = new JudoFactGeneratorClassifyTechnique(modelsManager, dungeonElements);
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
	
	public static void generateQuestionedFact(ModelsManager modelsManager, DungeonElements dungeonElements) throws Exception {
		FactGeneratorTemplate factGenerator; 
		for (RoomElements roomElements : dungeonElements.getRoomsElements()) {
			if(ALGAGenerator.DOMAIN.equals(DidacticDomain.MATHEMATICS)) {
				factGenerator = getCorrectMathFactsGenerators(dungeonElements, roomElements.getTask());
			} else if(ALGAGenerator.DOMAIN.equals(DidacticDomain.HISTORY_GEOGRAPHY)) {
				factGenerator = getCorrectHGFactsGenerators(modelsManager, dungeonElements, roomElements.getTask());
			} else {
				factGenerator = getCorrectJudoFactsGenerators(modelsManager, dungeonElements, roomElements.getTask());
			}
			if(factGenerator != null) factGenerator.generateQuestionedFact(roomElements);
		}
		dungeonElements.shuffleRoomsOrder();
	}
}
