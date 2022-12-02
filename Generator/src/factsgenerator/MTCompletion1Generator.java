package factsgenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import generator.AbstractFact;
import generator.ESingleTarget;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFCompletion1Impl;
import managers.EducationElementsManager;

public class MTCompletion1Generator {
	
	private EducationElementsManager eeManager;
	
	public MTCompletion1Generator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}

	public Set<MTQFCompletion1> generateCompletion1QFacts(MTCompletion1 task) {
		HashSet<MTQFCompletion1> questionedFacts = new HashSet<>();
		
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
						questionedFacts.addAll(getQuestionableFactsCompletion1(task, fact));
					}
				}
				
			}
		}
		
		
		return questionedFacts; 
	}
	
	private List<MTQFCompletion1> getQuestionableFactsCompletion1(MTCompletion1 task, MTFact fact){
		List<MTQFCompletion1> qfs = new ArrayList<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		for (ESingleTarget target : task.getTargets()) {
			if(build.equals(TableBuild.MIX)) {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQC1Fact(fact, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC1Fact(fact, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC1Fact(fact, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
					qfs.add(buildQC1Fact(fact, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
				} else {
					qfs.add(buildQC1Fact(fact, equalPos, TableBuild.OPERAND_TABLE, target));
					qfs.add(buildQC1Fact(fact, equalPos, TableBuild.TABLE_OPERAND, target));
				}
			} else {
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQC1Fact(fact, ResultPosition.LEFT, build, target));
					qfs.add(buildQC1Fact(fact, ResultPosition.RIGHT, build, target));
				} else {
					qfs.add(buildQC1Fact(fact, equalPos, build, target));
				}
			}
		}
		
		return qfs;
	}
	
	private MTQFCompletion1 buildQC1Fact(MTFact fact, ResultPosition resPos, TableBuild build, ESingleTarget target) {
		MTQFCompletion1 qf = new MTQFCompletion1Impl(); 
				
		// Y a des couillandres : faits complets 
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
}
