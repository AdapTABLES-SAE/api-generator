package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import factgenerator_template.TaskFactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFRebuild;
import generator.MTQeFRebuild;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFRebuildImpl;
import generator.impl.MTQeFRebuildImpl;
import managers.EducationElementsManager;

public class MTFactGeneratorREB extends TaskFactGeneratorTemplate {

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
	
	@Override
	protected QuestionedFact initializeQuestionedFact() {
		return new MTQeFRebuildImpl();
	}

	@Override
	protected void manageChoices(MultipleChoice mc, QuestionableFact qaf, QuestionedFact qef) {
		MTQFRebuild qfact = (MTQFRebuild) qaf;
		List<Integer> propositions = new ArrayList<>();
		propositions.add(qfact.getSoluceLeft());
		propositions.add(qfact.getSoluceRight());
		propositions.add(qfact.getSoluceRes());
		
		int range = qfact.getSoluceRight() + qfact.getSoluceLeft() + qfact.getSoluceRes() + 5;
		while(propositions.size() < mc.getNbChoices()) {
			int number = new Random().nextInt(range) + 1;
			if(!propositions.contains(number) && !createsOtherSolution(qfact, propositions, number)) {
				propositions.add(number);
			}
		}
		((MTQeFRebuild) qef).getPropositions().addAll(propositions);	
	}
	
	private boolean createsOtherSolution(MTQFRebuild fact, List<Integer> previousResults, int number) { // TODO : to verify
		for (Integer integer : previousResults) {
			int compute = number * integer;
			if(previousResults.contains(compute)) {
				return true;
			}
			for (Integer integer2 : previousResults) {
				if(integer * integer2 == number) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	protected int correctnessToReach(ATask aTask) {
		return 3 * aTask.getNbFacts();
	}	
	
	/*private boolean createsOtherSolution(MTQFRebuild fact, List<Integer> previousResults, int number) { // TODO : to verify
		boolean c1, c2, c3;
		for (Integer i : previousResults) {
			for (Integer j : previousResults) {
				if(i != j && !isFactSolution(fact, i, j, number) ) {
					c1 = (i*j) == number;
					c2 = previousResults.contains((i*number));
					c3 = previousResults.contains((j*number));
					if(c1 || c2 || c3) {
						return true; 
					}
				}
			}
		}
		return false; 
	}
	
	private static boolean isFactSolution(MTQFRebuild fact, int i, int j, int z) {
		boolean s1 = i == fact.getSoluceLeft() || i == fact.getSoluceRight() || i == fact.getSoluceRes();
		boolean s2 = j == fact.getSoluceLeft() || j == fact.getSoluceRight() || j == fact.getSoluceRes();
		boolean s3 = z == fact.getSoluceLeft() || z == fact.getSoluceRight() || z == fact.getSoluceRes();
		return s1 && s2 && s3;
	}*/

}
