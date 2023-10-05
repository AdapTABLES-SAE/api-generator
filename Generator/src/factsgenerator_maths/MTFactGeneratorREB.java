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
import generator.ECorrectness;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFRebuild;
import generator.MultipleChoice;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFRebuildImpl;
import structures.DungeonElements;
import structures.Soluce;

public class MTFactGeneratorREB extends FactGeneratorTemplate {

	public MTFactGeneratorREB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<AQuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				if(build.equals(TableBuild.MIX)) {
					if(equalPos.equals(ResultPosition.MIX)) {
						qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE));
						qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE));
						qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.TABLE_OPERAND));
						qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND));
					} else {
						qfs.add(buildQF(factC, equalPos, TableBuild.TABLE_OPERAND));
						qfs.add(buildQF(factC, equalPos, TableBuild.OPERAND_TABLE));
					}
				} else {
					if(equalPos.equals(ResultPosition.MIX)) {
						qfs.add(buildQF(factC, ResultPosition.LEFT, build));
						qfs.add(buildQF(factC, ResultPosition.RIGHT, build));
					} else {
						qfs.add(buildQF(factC, equalPos, build));
						qfs.add(buildQF(factC, equalPos, build));
					}
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
	
	private boolean createsOtherSolution(MTQFRebuild fact, List<Integer> previousResults, int number) { // TODO : to verify
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
	protected int correctnessToReach(ATask aTask) {
		return 3 * aTask.getNbFacts();
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		solutions.add(new Soluce(((MTQFRebuild) qFact).getSoluceLeft()+""));
		solutions.add(new Soluce(((MTQFRebuild) qFact).getSoluceRight()+""));
		solutions.add(new Soluce(((MTQFRebuild) qFact).getSoluceRes()+""));
		return solutions;
	}
	
	private List<Integer> generateListOfPossibleBadChoices(MTQFRebuild qfact, int boundary) {
		Set<Integer> propositions_temp = new HashSet<>();
		
		int min = -1;
		int max = -1;
		for(int i = 0; i < 3; i++) {
			switch(i) {
			case 0:
				min = qfact.getSoluceLeft()-boundary > 0? qfact.getSoluceLeft()-boundary: 1; 
				max = min == 1? qfact.getSoluceLeft()+boundary+((qfact.getSoluceLeft()-boundary)*-1): qfact.getSoluceLeft()+boundary; 
				break;
			case 1:
				min = qfact.getSoluceRight()-boundary > 0? qfact.getSoluceRight()-boundary: 1;
				max = min == 1? qfact.getSoluceRight()+boundary+((qfact.getSoluceRight()-boundary)*-1): qfact.getSoluceRight()+boundary; 
				break;
			default:
				min = qfact.getSoluceRes()-boundary > 0? qfact.getSoluceRes()-boundary: 1;
				max = min == 1? qfact.getSoluceRes()+boundary+((qfact.getSoluceRes()-boundary)*-1): qfact.getSoluceRes()+boundary; 
				break;
			}
			for(int j = min; j < max; j++) {
				propositions_temp.add(j);
			}
		}
		return new ArrayList<>(propositions_temp);
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		MTQFRebuild qfact = (MTQFRebuild) qFact;
		List<Integer> propositions_temp = new ArrayList<>();
		List<Integer> allPossiblePropositions = new ArrayList<>();
		MultipleChoice mc = (MultipleChoice) task.getResponseModality();
	
		int number; int index;
		int boundary = 8;
		allPossiblePropositions = generateListOfPossibleBadChoices(qfact, ++boundary);
		while(propositions_temp.size() < mc.getNbBadChoices()) {// TODO : correction bug à l'infini sometimes
			index = new Random().nextInt(allPossiblePropositions.size());
			number = allPossiblePropositions.get(index);
			if(!createsOtherSolution(qfact, propositions_temp, number)) {
				propositions_temp.add(number);
			} 
			allPossiblePropositions.remove(index);
		}
		
		List<Soluce> badpropositions = new ArrayList<>();
		for(Integer value: propositions_temp) {
			badpropositions.add(new Soluce(value+""));
		}
		
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, badpropositions);
		
		return propositions;
	}	
	
	@Override
	protected List<String> factSolutionsToString(AQuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		MTQFRebuild qfact = (MTQFRebuild) qFact;
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
}
