package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import factgenerator_template.TaskFactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ESeveralTarget;
import generator.MTCompletion2;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion2;
import generator.MTQeFCompletion2;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFCompletion2Impl;
import generator.impl.MTQeFCompletion2Impl;
import managers.EducationElementsManager;

public class MTFactGeneratorCOMP2 extends TaskFactGeneratorTemplate {

	public MTFactGeneratorCOMP2(EducationElementsManager eeManager) {
		super(eeManager);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTCompletion2 taskC = (MTCompletion2) task;
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
			int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
				
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
	protected QuestionedFact initializeQuestionedFact() {
		return new MTQeFCompletion2Impl();
	}

	@Override
	protected void manageChoices(MultipleChoice mc, QuestionableFact qaf, QuestionedFact qef) {
		MTQFCompletion2 qfact = (MTQFCompletion2) qaf;
		List<Integer> propositions = new ArrayList<>();
		boolean left = qfact.getLeftOperand() == -1; 
		boolean right = qfact.getRightOperand() == -1;
		boolean res = qfact.getResult() == -1;
		if(left) {propositions.add(qfact.getSoluceLeft());} 
		if(right) {propositions.add(qfact.getSoluceRight());}
		if(res) {propositions.add(qfact.getSoluceRes());}
		
		int range = qfact.getSoluceLeft() + qfact.getSoluceRight() + qfact.getSoluceRes() + 5;
		while(propositions.size() < mc.getNbBadChoices() + 2) {
			int number = new Random().nextInt(range);
			if(!propositions.contains(number)) {
				propositions.add(number);
			}
		}
		((MTQeFCompletion2) qef).getPropositions().addAll(propositions);	
	}

	@Override
	protected int correctnessToReach(ATask aTask) {
		return 2 * aTask.getNbFacts();
	}	
}
