package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import factgenerator_template.FactGeneratorTemplate;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AbstractFact;
import generator.DynamicMultipleChoice;
import generator.ECorrectness;
import generator.ESeveralTarget;
import generator.MTCompletion2;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion2;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFCompletion2Impl;
import structures.DungeonElements;
import structures.Soluce;

public class MTFactGeneratorCOMP2 extends FactGeneratorTemplate {

	public MTFactGeneratorCOMP2(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {

			MTCompletion2 taskC = (MTCompletion2) task;
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<AQuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				for (ESeveralTarget target : taskC.getTargets()) {
					if(build.equals(TableBuild.MIX)) {
						if(equalPos.equals(ResultPosition.MIX)) {
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
						} else {
							add2Set(qfs, buildQF(factC, equalPos, TableBuild.OPERAND_TABLE, target));
							add2Set(qfs, buildQF(factC, equalPos, TableBuild.TABLE_OPERAND, target));
						}
					} else {
						if(equalPos.equals(ResultPosition.MIX)) {
							add2Set(qfs, buildQF(factC, ResultPosition.LEFT, build, target));
							add2Set(qfs, buildQF(factC, ResultPosition.RIGHT, build, target));
						} else {
							add2Set(qfs, buildQF(factC, equalPos, build, target));
						}
					}
				}

				return qfs;
			}	
		}

		return new HashSet<>();
	}
	
	private void add2Set(Set<AQuestionableFact> set, AQuestionableFact fact) {
		set.add(fact);
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
	protected int correctnessToReach(AQuestionableFact fact) {
		return 2;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		MTQFCompletion2 fact = (MTQFCompletion2) qFact;
		if(fact.getLeftOperand() == -1) solutions.add(new Soluce(fact.getSoluceLeft()+""));
		if(fact.getRightOperand() == -1) solutions.add(new Soluce(fact.getSoluceRight()+""));
		if(fact.getResult() == -1) solutions.add(new Soluce(fact.getSoluceRes()+""));
		return solutions;
	}
	
	private boolean containsSoluce(List<Soluce> soluces, int value) {
		for(Soluce sol: soluces) {
			if(sol.getValue().equals(value+"")) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MTQFCompletion2 qfact = (MTQFCompletion2) qFact;
		DynamicMultipleChoice mc = (DynamicMultipleChoice) task.getResponseModality();
		
		List<Integer> propositions_temp = new ArrayList<>();
		List<Soluce> solutions = getListOfGoodSolutions(qFact); 
		
		int min1 = qfact.getSoluceLeft()-8 >= 0? qfact.getSoluceLeft()-8: 1;
		int min2 = qfact.getSoluceRight()-8 >= 0? qfact.getSoluceRight()-8: 1;
		int min3 = qfact.getSoluceRes()-8 >= 0? qfact.getSoluceRes()-8: 1; 
		int max1 = qfact.getSoluceLeft()+8;
		int max2 = qfact.getSoluceRight()+8;
		int max3 = qfact.getSoluceRes()+8; 
		int number;
		while(propositions_temp.size() < mc.getNbBadChoices()) {
			switch(propositions_temp.size()) {
			case 1:
				number = new Random().nextInt(max1 - min1) + min1;
				break;
			case 2:
				number = new Random().nextInt(max2 - min2) + min2;
				break;
			default:
				number = new Random().nextInt(max3 - min3) + min3;
			}
			if(!propositions_temp.contains(number) && !containsSoluce(solutions, number) && !createsOtherSolution(qfact, propositions_temp, number)) {
				propositions_temp.add(number);
			}
		}
		

		List<Soluce> badpropositions = new ArrayList<>();
		for(Integer value: propositions_temp) {
			badpropositions.add(new Soluce(value+""));
		}
		
		
		propositions.put(ECorrectness.CORRECT, solutions);
		propositions.put(ECorrectness.INCORRECT, badpropositions);
		
		return propositions;
	}	
	
	private boolean createsOtherSolution(MTQFCompletion2 fact, List<Integer> previousResults, int number) { // TODO : to verify
		List<Integer> previousRes = new ArrayList<>();
		previousRes.add(fact.getSoluceLeft());
		previousRes.add(fact.getSoluceRight());
		previousRes.add(fact.getSoluceRes());
		previousRes.addAll(previousResults);

		for(int i = 0; i < previousRes.size() - 1; i++) {
			if(previousRes.contains(previousRes.get(i) * number)) {return true;}
			for(int j = 1; j < previousRes.size(); j++) {
				if((previousRes.get(i) * previousRes.get(j)) == number) {return true;}
			}
		}
		return false;
	}
	
	@Override
	protected List<String> factSolutionsToString(AQuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		MTQFCompletion2 qfact = (MTQFCompletion2) qFact;
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

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean conditionForMembershipTaskOnFacts(AbstractFact fact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Set<AQuestionableFact> generateMembershipQuestionableFacts(ATask task, HashMap<String, List<AbstractFact>> facts,
			int numberByFact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts) {
		// TODO Auto-generated method stub
		return null;
	}
}
