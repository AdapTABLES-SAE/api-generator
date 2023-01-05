package factsgenerator;

import java.util.HashSet;
import java.util.Set;

import generator.AbstractFact;
import generator.MTCompletion2;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion2;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.ESeveralTarget;
import generator.impl.MTQFCompletion2Impl;
import managers.EducationElementsManager;

public class MTCompletion2Generator {
private EducationElementsManager eeManager;
	
	public MTCompletion2Generator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}

	public Set<MTQFCompletion2> generateQuestionableFacts(MTCompletion2 task) {
		HashSet<MTQFCompletion2> questionedFacts = new HashSet<>();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		/*System.out.println("min "+min+" max "+max);
		System.out.println("build "+((MTLevel) eeManager.getLevel()).getBuildSetup());
		System.out.println("res pos "+((MTLevel) eeManager.getLevel()).getResultPositionSetup());
		System.out.println("targets "+task.getTargets());*/

		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				if(f instanceof MTFact) {
					MTFact fact = (MTFact) f;
					if(min <= fact.getOp() && fact.getOp()<= max){
						questionedFacts.addAll(generateQuestionableFactsOf(task, fact));
					}
				}
				
			}
		}
		
		
		return questionedFacts; 
	}
	
	private Set<MTQFCompletion2> generateQuestionableFactsOf(MTCompletion2 task, MTFact fact){
		HashSet<MTQFCompletion2> qfs = new HashSet<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		for (ESeveralTarget target : task.getTargets()) {
			if(build.equals(TableBuild.MIX) && !target.equals(ESeveralTarget.OPERAND_TABLE)) {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQF(fact, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQF(fact, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQF(fact, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
					qfs.add(buildQF(fact, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
				} else {
					qfs.add(buildQF(fact, equalPos, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQF(fact, equalPos, TableBuild.TABLE_OPERAND, target));
				}
			} else {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQF(fact, ResultPosition.LEFT, build.equals(TableBuild.MIX)? TableBuild.OPERAND_TABLE : build, target));
					qfs.add(buildQF(fact, ResultPosition.RIGHT, build.equals(TableBuild.MIX)? TableBuild.OPERAND_TABLE : build, target));
				} else {
					qfs.add(buildQF(fact, equalPos, build, target));
				}
			}
		}
		
		return qfs;
	}
	
	private MTQFCompletion2 buildQF(MTFact fact, ResultPosition resPos, TableBuild build, ESeveralTarget target) {
		MTQFCompletion2 qf = new MTQFCompletion2Impl(); 
				
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
}
