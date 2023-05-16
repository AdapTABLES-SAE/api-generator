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
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFRebuild;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFRebuildImpl;
import structures.DungeonElements;

public class MTFactGeneratorREB extends FactGeneratorTemplate {

	public MTFactGeneratorREB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE));
					qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE));
				} else {
					qfs.add(buildQF(factC, equalPos, build));
					qfs.add(buildQF(factC, equalPos, build));
				}
				
				
				return qfs;
			}			
		}
		
		return new HashSet<>();
	}
	
	private MTQFRebuild buildQF(MTFact fact, ResultPosition resPos, TableBuild build) {
		MTQFRebuild qf = new MTQFRebuildImpl(); 
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
		
		return qf;	
	}
	
	private boolean createsOtherSolution(MTQFRebuild fact, List<Integer> previousResults, int number) { // TODO : to verify
		List<Integer> previousRes = new ArrayList<>(previousResults);
		previousRes.add(fact.getSoluceLeft());
		previousRes.add(fact.getSoluceRight());
		previousRes.add(fact.getSoluceRes());
		
		for (Integer integer : previousRes) {
			int compute = number * integer;
			if(previousRes.contains(compute)) {
				return true;
			}
			for (Integer integer2 : previousRes) {
				if(integer * integer2 == number) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	protected int correctnessToReach(ATask aTask) {
		return 3;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		solutions.add(((MTQFRebuild) qFact).getSoluceLeft()+"");
		solutions.add(((MTQFRebuild) qFact).getSoluceRight()+"");
		solutions.add(((MTQFRebuild) qFact).getSoluceRes()+"");
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		MTQFRebuild qfact = (MTQFRebuild) qFact;
		List<Integer> propositions_temp = new ArrayList<>();
		
		
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
			if(!propositions_temp.contains(number) && !createsOtherSolution(qfact, propositions_temp, number)) {
				propositions_temp.add(number);
			}
		}
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return propositions;
	}	
	
	@Override
	protected List<String> factSolutionsToString(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		MTQFRebuild qfact = (MTQFRebuild) qFact;
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
