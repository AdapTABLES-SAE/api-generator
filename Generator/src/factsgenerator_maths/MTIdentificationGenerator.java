package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import generator.AbstractFact;
import generator.ESingleTarget;
import generator.MTFact;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTQFIdentification;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFIdentificationImpl;
import managers.EducationElementsManager;

// TODO : est-ce qu'on prends en compte la construction des tables ? la position du résulats ? 
public class MTIdentificationGenerator {

	private EducationElementsManager eeManager;
	private final int[] buildFalseInteraval = {5,5};
	private List<Integer> alreadyUsed; 
	private Random rand;
	
	public MTIdentificationGenerator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
		this.alreadyUsed = new ArrayList<>();
		this.rand = new Random();
	}
	
	public Set<MTQFIdentification> generateQuestionableFacts(MTIdentification task) {
		HashSet<MTQFIdentification> questionedFacts = new HashSet<>();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
		/*System.out.println("min "+min+" max "+max);
		System.out.println("build "+((MTLevel) eeManager.getLevel()).getBuildSetup());
		System.out.println("res pos "+((MTLevel) eeManager.getLevel()).getResultPositionSetup());*/

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
	
	private Set<MTQFIdentification> generateQuestionableFactsOf(MTIdentification task, MTFact fact){
		HashSet<MTQFIdentification> qfs = new HashSet<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		ESingleTarget falseTarget = task.getTarget();
		
		if(build.equals(TableBuild.MIX)) {
			if(equalPos.equals(ResultPosition.MIX)) {
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.LEFT, null));
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.LEFT, falseTarget));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.LEFT, null));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.LEFT, falseTarget));
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.RIGHT, null));
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.RIGHT, falseTarget));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.RIGHT, null));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.RIGHT, falseTarget));
			}else {
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, equalPos, null));
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, equalPos, falseTarget));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, equalPos, null));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, equalPos, falseTarget));
			}
		}else {
			if(equalPos.equals(ResultPosition.MIX)) {
				qfs.add(buildQF(fact, build, ResultPosition.LEFT, null));
				qfs.add(buildQF(fact, build, ResultPosition.LEFT, falseTarget));
				qfs.add(buildQF(fact, build, ResultPosition.RIGHT, null));
				qfs.add(buildQF(fact, build, ResultPosition.RIGHT, falseTarget));
			}else {
				qfs.add(buildQF(fact, build, equalPos, null));
				qfs.add(buildQF(fact, build, equalPos, falseTarget));
			}
		}
		
		alreadyUsed = new ArrayList<>();
		return qfs;
	}
	
	private MTQFIdentification buildQF(MTFact fact, TableBuild build, ResultPosition equalPos, ESingleTarget target) {
		MTQFIdentification qf = new MTQFIdentificationImpl(); 
		
		if(target != null) {
			int min, max, chosenFalse = -1;
			if(target.equals(ESingleTarget.RESULT)) {
				min = fact.getRes() - buildFalseInteraval[0] >= 0? fact.getRes() - buildFalseInteraval[0]: 0;
				max = fact.getRes() + buildFalseInteraval[1];
			}else {
				min = fact.getOp() - buildFalseInteraval[0] >= 0? fact.getOp() - buildFalseInteraval[0]: 0;
				max = fact.getOp() + buildFalseInteraval[1];
			}
			
			while(chosenFalse == -1) {
				chosenFalse = rand.nextInt((max - min) + 1) + min;
				if(alreadyUsed.contains(chosenFalse)) {
					chosenFalse = -1;
				}
			}
			
			if(build.equals(TableBuild.OPERAND_TABLE)) {
				qf.setLeftOperand(target.equals(ESingleTarget.RESULT)? fact.getOp(): chosenFalse);
				qf.setRightOperand(fact.getTable());
			}else {
				qf.setLeftOperand(fact.getTable());
				qf.setRightOperand(target.equals(ESingleTarget.RESULT)? fact.getOp(): chosenFalse);
			}			
			
			qf.setResult(target.equals(ESingleTarget.RESULT)? chosenFalse: fact.getRes());
			qf.setResultOnRight(equalPos.equals(ResultPosition.RIGHT));
			qf.setSoluce(false);
		}else {
			if(build.equals(TableBuild.OPERAND_TABLE)) {
				qf.setLeftOperand(fact.getOp());
				qf.setRightOperand(fact.getTable());
			}else {
				qf.setLeftOperand(fact.getTable());
				qf.setRightOperand(fact.getOp());
			}
			qf.setResult(fact.getRes());
			qf.setResultOnRight(equalPos.equals(ResultPosition.RIGHT));
			qf.setSoluce(true);
		}
		
		return qf;
	}

}
