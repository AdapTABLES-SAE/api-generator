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
import generator.ESeveralTarget;
import generator.MTCompletion2;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion2;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFCompletion2Impl;
import structures.DungeonElements;

public class MTFactGeneratorCOMP2 extends FactGeneratorTemplate {

	public MTFactGeneratorCOMP2(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTCompletion2 taskC = (MTCompletion2) task;
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				for (ESeveralTarget target : taskC.getTargets()) {
					if(build.equals(TableBuild.MIX) && !target.equals(ESeveralTarget.OPERAND_TABLE)) {
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
							qfs.add(buildQF(factC, ResultPosition.LEFT, build.equals(TableBuild.MIX)? TableBuild.OPERAND_TABLE : build, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, build.equals(TableBuild.MIX)? TableBuild.OPERAND_TABLE : build, target));
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
	
	private MTQFCompletion2 buildQF(MTFact fact, ResultPosition resPos, TableBuild build, ESeveralTarget target) {
		MTQFCompletion2 qf = new MTQFCompletion2Impl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		if(build.equals(TableBuild.OPERAND_TABLE)) {
			qf.setSoluceLeft(fact.getOp());
			qf.setSoluceRight(fact.getTable());
		}else {
			qf.setSoluceRight(fact.getOp());
			qf.setSoluceLeft(fact.getTable());
		}
		qf.setSoluceRes(fact.getRes());
		qf.setResultOnRight(resPos.equals(ResultPosition.RIGHT));
		
		
		switch (target) {
		case OPERAND_TABLE:
			qf.setLeftOperand(-1); 
			qf.setRightOperand(-1);
			qf.setResult(fact.getRes());
			break;
		case TABLE_RESULT:
			if(build.equals(TableBuild.OPERAND_TABLE)) {qf.setRightOperand(-1); qf.setLeftOperand(fact.getOp());} else {qf.setLeftOperand(-1); qf.setRightOperand(fact.getOp());} 
			qf.setResult(-1);
			break;
		case OPERAND_RESULT:
			if(build.equals(TableBuild.TABLE_OPERAND)) {qf.setRightOperand(-1); qf.setLeftOperand(fact.getTable());} else {qf.setLeftOperand(-1); qf.setRightOperand(fact.getTable());} 
			qf.setResult(-1);
			break;
		}
		return qf;
	}

	@Override
	protected int correctnessToReach(ATask task) {
		return 2;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		MTQFCompletion2 fact = (MTQFCompletion2) qFact;
		if(fact.getLeftOperand() == -1) solutions.add(fact.getSoluceLeft()+"");
		if(fact.getRightOperand() == -1) solutions.add(fact.getSoluceRight()+"");
		if(fact.getResult() == -1) solutions.add(fact.getSoluceRes()+"");
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		System.out.println("COMP2");
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		MTQFCompletion2 qfact = (MTQFCompletion2) qFact;
		
		List<Integer> propositions_temp = new ArrayList<>();
		List<Integer> solutions = getListOfGoodSolutions(qFact).stream().map(Integer::valueOf).collect(Collectors.toList());
		
		int min1 = qfact.getSoluceLeft()-8 >= 0? qfact.getSoluceLeft()-8: 1;
		int min2 = qfact.getSoluceRight()-8 >= 0? qfact.getSoluceRight()-8: 1;
		int min3 = qfact.getSoluceRes()-8 >= 0? qfact.getSoluceRes()-8: 1; 
		int max1 = qfact.getSoluceLeft()+8;
		int max2 = qfact.getSoluceRight()+8;
		int max3 = qfact.getSoluceRes()+8; 
		int number;
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			switch(propositions_temp.size()) {
			case 1:
				number = new Random().nextInt(max1 - min1) + min1;
				break;
			case 2:
				number = new Random().nextInt(max2 - min2) + min2;
				break;
			default:
				number = new Random().nextInt(max3 - min3) + min3;
			}
			if(!propositions_temp.contains(number) && !solutions.contains(number)) {
				propositions_temp.add(number);
			}
		}
		
		propositions.put(ECorrectness.CORRECT, solutions.stream().map(String::valueOf).collect(Collectors.toList()));
		propositions.put(ECorrectness.INCORRECT, propositions_temp.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return propositions;
	}	
	
	@Override
	protected List<String> factSolutionsToString(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		MTQFCompletion2 qfact = (MTQFCompletion2) qFact;
		if(qfact.isResultOnRight()) {
			solutions.add(qfact.getSoluceLeft() + " x " + qfact.getSoluceRight() + " = " + qfact.getSoluceRes());
			solutions.add(qfact.getSoluceRight() + " x " + qfact.getSoluceLeft() + " = " + qfact.getSoluceRes());
		} else {
			solutions.add(qfact.getSoluceRes() + " = " + qfact.getSoluceLeft() + " x " + qfact.getSoluceRight());
			solutions.add(qfact.getSoluceRes() + " = " + qfact.getSoluceRight() + " x " + qfact.getSoluceLeft());
		}
		return solutions;
	}
	
	@Override
	protected boolean isQuestionInteractive() {
		return true;
	}
}
