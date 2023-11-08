package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.ESingleTarget;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFCompletion1Impl;
import structures.DungeonElements;
import structures.Soluce;

public class MTFactGeneratorCOMP1 extends FactGeneratorTemplate {


	public MTFactGeneratorCOMP1(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(SetOfFacts parent, ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTCompletion1 taskC = (MTCompletion1) task;
			MTFact factC = (MTFact) fact;
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
	
			if(min <= factC.getOp() && factC.getOp() <= max){
				Set<AQuestionableFact> qfs = new HashSet<>(); 			
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				for (ESingleTarget target : taskC.getTargets()) {
					if(build.equals(TableBuild.MIX)) {
						if(equalPos.equals(ResultPosition.MIX)) {
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
						} else {
							add2Set(qfs, buildQF(factC, equalPos, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, equalPos, TableBuild.TABLE_OPERAND, target));
						}
					} else {
						if(equalPos.equals(ResultPosition.MIX)) {
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, build, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, build, target));
						} else {
							add2Set(qfs, buildQF(factC, equalPos, build, target));
						}
					}
				}
				return qfs;
			}
		}

		
		return new HashSet<>();
	}
	
	private void add2Set(Set<AQuestionableFact> set, AQuestionableFact fact) {
		set.add(fact);
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
	protected int correctnessToReach(AQuestionableFact fact) {
		return 1;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		solutions.add(new Soluce(((MTQFCompletion1) qFact).getSoluce()+""));
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MTQFCompletion1 qfact = (MTQFCompletion1) qFact;
		
		List<Integer> propositions_temp = new ArrayList<>();
		DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
		
		int min = qfact.getSoluce()-5 >= 0? qfact.getSoluce()-5: 0;
		int max = qfact.getSoluce()+5;
		
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			int number = new Random().nextInt(max - min) + min;
			if(!propositions_temp.contains(number) && !(number == qfact.getSoluce())) {
				propositions_temp.add(number);
			}
		}
		
		List<Soluce> badpropositions = new ArrayList<>();
		for(Integer value: propositions_temp) {
			badpropositions.add(new Soluce(value+""));
		}
		
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, badpropositions);
		
		return propositions;
	}	
	
	@Override
	protected boolean isQuestionInteractive() {
		return true;
	}

}
