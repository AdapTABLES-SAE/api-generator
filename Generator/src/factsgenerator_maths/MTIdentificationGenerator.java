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
		Set<MTQFIdentification> questionableFacts = new HashSet<>();
		
		int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
		int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();

		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				if(f instanceof MTFact) {
					MTFact fact = (MTFact) f;
					if(min <= fact.getOp() && fact.getOp() <= max){
						questionableFacts.addAll(generateGoodQuestionableFactsOf(fact));
					}
				}
			}
		}
		
		questionableFacts.addAll(generateFalseFacts(task, questionableFacts));	
		return questionableFacts; 
	}
	
	private Set<MTQFIdentification> generateGoodQuestionableFactsOf(MTFact fact){
		Set<MTQFIdentification> qfs = new HashSet<>();
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		if(build.equals(TableBuild.MIX)) {
			if(equalPos.equals(ResultPosition.MIX)) {
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.LEFT));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.LEFT));
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, ResultPosition.RIGHT));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, ResultPosition.RIGHT));
			}else {
				qfs.add(buildQF(fact, TableBuild.OPERAND_TABLE, equalPos));
				qfs.add(buildQF(fact, TableBuild.TABLE_OPERAND, equalPos));
			}
		}else {
			if(equalPos.equals(ResultPosition.MIX)) {
				qfs.add(buildQF(fact, build, ResultPosition.LEFT));
				qfs.add(buildQF(fact, build, ResultPosition.RIGHT));
			}else {
				qfs.add(buildQF(fact, build, equalPos));
			}
		}
		
		alreadyUsed = new ArrayList<>();
		return qfs;
	}
	
	private List<MTQFIdentification> generateFalseFacts(MTIdentification task, Set<MTQFIdentification> goodFacts){
		ESingleTarget falseTarget = task.getTarget();
		List<MTQFIdentification> allFacts = new ArrayList<>(goodFacts); 
		
		for (MTQFIdentification questionableFact : goodFacts) {
			allFacts.add(buildBadQF(questionableFact, falseTarget));
		}
		
		return allFacts;
	}
	
	private MTQFIdentification buildBadQF(MTQFIdentification goodFact, ESingleTarget target) { 
		MTQFIdentification qf = new MTQFIdentificationImpl(); 
		
		int min, max, chosenFalse = -1;
		int solution = -1;
		if(target.equals(ESingleTarget.RESULT)) { 
			min = goodFact.getResult() - buildFalseInteraval[0] >= 0? goodFact.getResult() - buildFalseInteraval[0]: 0;
			max = goodFact.getResult() + buildFalseInteraval[1];
			solution = goodFact.getResult();
		}else {
			if(goodFact.getBuild().equals(TableBuild.OPERAND_TABLE)) {
				min = goodFact.getLeftOperand() - buildFalseInteraval[0] >= 0? goodFact.getLeftOperand() - buildFalseInteraval[0]: 0;
				max = goodFact.getLeftOperand() + buildFalseInteraval[1];
				solution = goodFact.getLeftOperand();
			}else {
				min = goodFact.getRightOperand() - buildFalseInteraval[0] >= 0? goodFact.getRightOperand() - buildFalseInteraval[0]: 0;
				max = goodFact.getRightOperand() + buildFalseInteraval[1];
				solution = goodFact.getRightOperand();
			}
			
		}
			
		while(chosenFalse == -1) {
			chosenFalse = rand.nextInt((max - min) + 1) + min;
			if(alreadyUsed.contains(chosenFalse) && !(chosenFalse == solution)) {
				chosenFalse = -1;
			}
		}
			
		if(goodFact.getBuild().equals(TableBuild.OPERAND_TABLE)) {
			qf.setLeftOperand(target.equals(ESingleTarget.RESULT)? goodFact.getLeftOperand(): chosenFalse);
			qf.setRightOperand(goodFact.getRightOperand());
		}else {
			qf.setLeftOperand(goodFact.getLeftOperand());
			qf.setRightOperand(target.equals(ESingleTarget.RESULT)? goodFact.getRightOperand(): chosenFalse);
		}			
		
		qf.setResult(target.equals(ESingleTarget.RESULT)? chosenFalse: goodFact.getResult());
		qf.setResultOnRight(goodFact.isResultOnRight());
		qf.setSoluce(false);
		return qf;
	}
	
	private MTQFIdentification buildQF(MTFact fact, TableBuild build, ResultPosition equalPos) { 
		MTQFIdentification qf = new MTQFIdentificationImpl(); 
		
		if(build.equals(TableBuild.OPERAND_TABLE)) {
			qf.setLeftOperand(fact.getOp());
			qf.setRightOperand(fact.getTable());
		}else {
			qf.setLeftOperand(fact.getTable());
			qf.setRightOperand(fact.getOp());
		}
		qf.setResult(fact.getRes());
		qf.setResultOnRight(equalPos.equals(ResultPosition.RIGHT));
		qf.setBuild(build);
		qf.setSoluce(true);
		
		return qf;
	}

}
