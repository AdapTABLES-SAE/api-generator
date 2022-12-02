package factsgenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

	public Set<MTQFCompletion2> generateCompletion2QFacts(MTCompletion2 task) {
		HashSet<MTQFCompletion2> questionedFacts = new HashSet<>();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		System.out.println("min "+min+" max "+max);
		System.out.println("build "+((MTLevel) eeManager.getLevel()).getBuildSetup());
		System.out.println("res pos "+((MTLevel) eeManager.getLevel()).getResultPositionSetup());
		System.out.println("targets "+task.getTargets());

		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				if(f instanceof MTFact) {
					MTFact fact = (MTFact) f;
					if(min <= fact.getOp() && fact.getOp()<= max){
						questionedFacts.addAll(getQuestionableFactsCompletion2(task, fact));
					}
				}
				
			}
		}
		
		
		return questionedFacts; 
	}
	
	private List<MTQFCompletion2> getQuestionableFactsCompletion2(MTCompletion2 task, MTFact fact){
		List<MTQFCompletion2> qfs = new ArrayList<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		for (ESeveralTarget target : task.getTargets()) {
			if(build.equals(TableBuild.MIX)) {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQC2Fact(fact, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC2Fact(fact, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC2Fact(fact, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
					qfs.add(buildQC2Fact(fact, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
				} else {
					qfs.add(buildQC2Fact(fact, equalPos, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC2Fact(fact, equalPos, TableBuild.TABLE_OPERAND, target));
				}
			} else {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQC2Fact(fact, ResultPosition.LEFT, build, target));
					qfs.add(buildQC2Fact(fact, ResultPosition.RIGHT, build, target));
				} else {
					qfs.add(buildQC2Fact(fact, equalPos, build, target));
				}
			}
		}
		
		return qfs;
	}
	
	private MTQFCompletion2 buildQC2Fact(MTFact fact, ResultPosition resPos, TableBuild build, ESeveralTarget target) {
		MTQFCompletion2 qf = new MTQFCompletion2Impl(); 
				
		// TODO
		/*if(build.equals(TableBuild.OPERAND_TABLE)) {
			qf.setLeftOperand(fact.getOp());
			qf.setRightOperand(fact.getTable());
		}else {
			qf.setRightOperand(fact.getOp());
			qf.setLeftOperand(fact.getTable());	
		}
		qf.setResult(fact.getRes());
		qf.setResultOnRight(resPos.equals(ResultPosition.RIGHT));
		
		switch (target) {
		case OPERAND_TABLE:
			if(build.equals(TableBuild.OPERAND_TABLE)) {qf.setLeftOperand(-1);} else {qf.setRightOperand(-1);}
			qf.setSoluce(fact.getOp());
			break;
		case TABLE_RESULT:
			if(build.equals(TableBuild.OPERAND_TABLE)) {qf.setRightOperand(-1);} else {qf.setLeftOperand(-1);} 
			qf.setSoluce(fact.getTable());
			break;
		case OPERAND_RESULT:
			qf.setResult(-1);
			qf.setSoluce(fact.getRes());
			break;
		}*/
		return qf;
	}
}
