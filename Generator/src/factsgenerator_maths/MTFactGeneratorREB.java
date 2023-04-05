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
import managers.EducationElementsManager;

public class MTFactGeneratorREB extends FactGeneratorTemplate {

	public MTFactGeneratorREB(EducationElementsManager eeManager) {
		super(eeManager);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
			int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
				
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
		
		
		int range = qfact.getSoluceRight() + qfact.getSoluceLeft() + qfact.getSoluceRes() + 10;
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			int number = new Random().nextInt(range) + 1;
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
