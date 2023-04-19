package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import factgenerator_template.FactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.ESingleTarget;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFCompletion1Impl;
import structures.DungeonElements;

public class MTFactGeneratorCOMP1 extends FactGeneratorTemplate {

	public MTFactGeneratorCOMP1(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTCompletion1 taskC = (MTCompletion1) task;
			MTFact factC = (MTFact) fact;
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
	
			if(min <= factC.getOp() && factC.getOp() <= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 			
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				for (ESingleTarget target : taskC.getTargets()) {
					if(build.equals(TableBuild.MIX)) {
						if(equalPos.equals(ResultPosition.MIX)) {
							qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
						} else {
							qfs.add(buildQF(factC, equalPos, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, equalPos, TableBuild.TABLE_OPERAND, target));
						}
					} else {
						if(equalPos.equals(ResultPosition.MIX)) {
							qfs.add(buildQF(factC, ResultPosition.LEFT, build, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, build, target));
						} else {
							qfs.add(buildQF(factC, equalPos, build, target));
						}
					}
				}
				return qfs;
			}
		}

		
		return new HashSet<>();
	}
	
	private MTQFCompletion1 buildQF(MTFact fact, ResultPosition resPos, TableBuild build, ESingleTarget target) {
		MTQFCompletion1 qf = new MTQFCompletion1Impl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		if(build.equals(TableBuild.OPERAND_TABLE)) {
			qf.setLeftOperand(fact.getOp());
			qf.setRightOperand(fact.getTable());
		}else {
			qf.setRightOperand(fact.getOp());
			qf.setLeftOperand(fact.getTable());	
		}
		qf.setResult(fact.getRes());
		qf.setResultOnRight(resPos.equals(ResultPosition.RIGHT));
		
		
		switch (target) {
		case OPERAND:
			if(build.equals(TableBuild.OPERAND_TABLE)) {qf.setLeftOperand(-1);} else {qf.setRightOperand(-1);}
			qf.setSoluce(fact.getOp());
			break;
		case TABLE:
			if(build.equals(TableBuild.OPERAND_TABLE)) {qf.setRightOperand(-1);} else {qf.setLeftOperand(-1);} 
			qf.setSoluce(fact.getTable());
			break;
		case RESULT:
			qf.setResult(-1);
			qf.setSoluce(fact.getRes());
			break;
		}
		return qf;
	}

	@Override
	protected int correctnessToReach(ATask task) {
		return 1;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		solutions.add(((MTQFCompletion1) qFact).getSoluce()+"");
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		MTQFCompletion1 qfact = (MTQFCompletion1) qFact;
		
		List<Integer> propositions_temp = new ArrayList<>();
		
		
		int min = qfact.getSoluce()-10 >= 0? qfact.getSoluce()-10: 0;
		int max = qfact.getSoluce()+10;
		
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			int number = new Random().nextInt(max - min) + min;
			if(!propositions_temp.contains(number) && !(number == qfact.getSoluce())) {
				propositions_temp.add(number);
			}
		}
		
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return propositions;
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return true;
	}
}
