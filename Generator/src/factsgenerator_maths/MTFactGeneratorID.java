package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import factgenerator_template.FactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.ESingleTarget;
import generator.MTFact;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTQFIdentification;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFIdentificationImpl;
import managers.EducationElementsManager;

public class MTFactGeneratorID extends FactGeneratorTemplate {

	private final int[] buildFalseInteraval = {5,5};
	private List<Integer> alreadyUsed; 
	private Random rand;
	
	public MTFactGeneratorID(EducationElementsManager eeManager) {
		super(eeManager);
		this.alreadyUsed = new ArrayList<>();
		this.rand = new Random();
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
				
				if(build.equals(TableBuild.MIX)) {
					if(equalPos.equals(ResultPosition.MIX)) {
						qfs.add(buildQF(factC, TableBuild.OPERAND_TABLE, ResultPosition.LEFT));
						qfs.add(buildQF(factC, TableBuild.TABLE_OPERAND, ResultPosition.LEFT));
						qfs.add(buildQF(factC, TableBuild.OPERAND_TABLE, ResultPosition.RIGHT));
						qfs.add(buildQF(factC, TableBuild.TABLE_OPERAND, ResultPosition.RIGHT));
					}else {
						qfs.add(buildQF(factC, TableBuild.OPERAND_TABLE, equalPos));
						qfs.add(buildQF(factC, TableBuild.TABLE_OPERAND, equalPos));
					}
				}else {
					if(equalPos.equals(ResultPosition.MIX)) {
						qfs.add(buildQF(factC, build, ResultPosition.LEFT));
						qfs.add(buildQF(factC, build, ResultPosition.RIGHT));
					}else {
						qfs.add(buildQF(factC, build, equalPos));
					}
				}
				qfs.addAll(generateFalseFacts((MTIdentification) task, qfs));
				return qfs;
			}
		}
		
		
		return new HashSet<>();
	}
	
	private List<QuestionableFact> generateFalseFacts(MTIdentification task, Set<QuestionableFact> goodFacts){
		ESingleTarget falseTarget = task.getTarget();
		List<QuestionableFact> allFacts = new ArrayList<>(goodFacts); 
		
		for (QuestionableFact questionableFact : goodFacts) {
			allFacts.add(buildBadQF((MTQFIdentification) questionableFact, falseTarget));
		}
		
		return allFacts;
	}
	
	private MTQFIdentification buildBadQF(MTQFIdentification goodFact, ESingleTarget target) { 
		MTQFIdentification qf = new MTQFIdentificationImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
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
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
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

	@Override
	protected int correctnessToReach(ATask task) {
		return 1;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		if(((MTQFIdentification) qFact).isSoluce()) {
			solutions.add(true+"");
		}else {
			solutions.add(false+"");
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		List<String> propositions_temp = new ArrayList<>();
		if(!((MTQFIdentification) qFact).isSoluce()) {
			//propositions_temp.add(qFact.toString());
			
			propositions_temp.add(true+"");
		} else {
			propositions_temp.add(false+"");
		}
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp);		
		return propositions;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}
}
