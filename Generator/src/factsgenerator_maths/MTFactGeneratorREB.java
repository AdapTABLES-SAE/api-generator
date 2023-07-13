package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import factgenerator_template.FactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ECorrectness;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFRebuild;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFRebuildImpl;
import structures.DungeonElements;

public class MTFactGeneratorREB extends FactGeneratorTemplate {

	public MTFactGeneratorREB(DungeonElements dungeonElements) {
		super(dungeonElements);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTFact factC = (MTFact) fact;
			
			int min = ((MTLevel) dungeonElements.getChosenLevel()).getMinInterval();
			int max = ((MTLevel) dungeonElements.getChosenLevel()).getMaxInterval();
			if(min <= factC.getOp() && factC.getOp()<= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 
				
				TableBuild build = ((MTLevel) dungeonElements.getChosenLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) dungeonElements.getChosenLevel()).getResultPositionSetup();
				
				if(equalPos.equals(ResultPosition.MIX)) {
					qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE));
					qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE));
				} else {
					qfs.add(buildQF(factC, equalPos, build));
					qfs.add(buildQF(factC, equalPos, build));
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
		List<Integer> previousRes = new ArrayList<>(previousResults);
		previousRes.add(fact.getSoluceLeft());
		previousRes.add(fact.getSoluceRight());
		previousRes.add(fact.getSoluceRes());
		
		for(int i = 0; i < previousRes.size() - 1; i++) {
			int compute = number * previousRes.get(i);
			if(previousRes.contains(compute)) {
				return true;
			} else {
				for(int j = 1; j < previousRes.size(); j++) {
					if(previousRes.get(i) * previousRes.get(j) == number) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	@Override
	protected int correctnessToReach(ATask aTask) {
		return 3;
	}

	@Override
	protected List<String> getListOfGoodSolutions(QuestionableFact qFact) {
		List<String> solutions = new ArrayList<>();
		solutions.add(((MTQFRebuild) qFact).getSoluceLeft()+"");
		solutions.add(((MTQFRebuild) qFact).getSoluceRight()+"");
		solutions.add(((MTQFRebuild) qFact).getSoluceRes()+"");
		return solutions;
	}
	
	private List<Integer> generateListOfPossibleBadChoices(MTQFRebuild qfact) {
		Set<Integer> propositions_temp = new HashSet<>();
		
		int min = -1;
		int max = -1;
		for(int i = 0; i < 3; i++) {
			switch(i) {
			case 0:
				min = qfact.getSoluceLeft()-15 >= 0? qfact.getSoluceLeft()-15: 1; 
				max = min == 1? qfact.getSoluceLeft()+15+((qfact.getSoluceLeft()-15)*-1): qfact.getSoluceLeft()+15; 
				break;
			case 1:
				min = qfact.getSoluceRight()-15 >= 0? qfact.getSoluceRight()-15: 1;
				max = min == 1? qfact.getSoluceRight()+15+((qfact.getSoluceRight()-15)*-1): qfact.getSoluceRight()+15; 
				break;
			default:
				min = qfact.getSoluceRes()-15 >= 0? qfact.getSoluceRes()-15: 1;
				max = min == 1? qfact.getSoluceRes()+15+((qfact.getSoluceRes()-15)*-1): qfact.getSoluceRes()+15; 
				break;
			}
			for(int j = min; j < max; j++) {
				propositions_temp.add(j);
			}
		}
		//System.err.println(propositions_temp);
		return new ArrayList<>(propositions_temp);
	}

	@Override
	protected Map<ECorrectness, List<String>> getListOfPropositions(MultipleChoice mc, QuestionableFact qFact) {
		//System.out.println("REB");
		Map<ECorrectness, List<String>> propositions = new HashMap<>();
		MTQFRebuild qfact = (MTQFRebuild) qFact;
		List<Integer> propositions_temp = new ArrayList<>();
		List<Integer> allPossiblePropositions = generateListOfPossibleBadChoices(qfact);
	
		int number; int index;
		while(propositions_temp.size() < mc.getNbBadChoices()) {// TODO : correction bug à l'infini sometimes
			index = new Random().nextInt(allPossiblePropositions.size());
			number = allPossiblePropositions.get(index);
			//System.out.println("ICI"+number);
			if(!createsOtherSolution(qfact, propositions_temp, number)) {
				propositions_temp.add(number);
			} else {
				allPossiblePropositions.remove(index);
			}
			
		/*	if(allPossiblePropositions.isEmpty()) {
				System.err.println("PROBLEM");
			}*/
		}
		
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return propositions;
	}	
	
	@Override
	protected List<String> factSolutionsToString(QuestionableFact qFact) {
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
