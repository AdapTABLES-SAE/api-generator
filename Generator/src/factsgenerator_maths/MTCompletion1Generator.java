package factsgenerator_maths;

import java.util.HashSet;
import java.util.Set;

import generator.AbstractFact;
import generator.ESingleTarget;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFCompletion1Impl;
import managers.EducationElementsManager;

public class MTCompletion1Generator {
	
	private EducationElementsManager eeManager;
	private int factsCounter = 1; 
	private String taskID;
	
	public MTCompletion1Generator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}

	public Set<QuestionableFact> generateQuestionableFacts(MTCompletion1 task) {
		Set<QuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				if(f instanceof MTFact) {
					MTFact fact = (MTFact) f;
					if(min <= fact.getOp() && fact.getOp()<= max){
						questionableFacts.addAll(generateQuestionableFactsOf(task, fact));
					}
				}
				
			}
		}	
		return questionableFacts; 
	}
	
	private Set<MTQFCompletion1> generateQuestionableFactsOf(MTCompletion1 task, MTFact fact){
		Set<MTQFCompletion1> qfs = new HashSet<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		for (ESingleTarget target : task.getTargets()) {
			if(build.equals(TableBuild.MIX)) {
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
					qfs.add(buildQF(fact, ResultPosition.LEFT, build, target));
					qfs.add(buildQF(fact, ResultPosition.RIGHT, build, target));
				} else {
					qfs.add(buildQF(fact, equalPos, build, target));
				}
			}
		}
		
		return qfs;
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
}
