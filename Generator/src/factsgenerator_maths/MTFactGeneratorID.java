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
import generator.ESingleTarget;
import generator.MTFact;
import generator.MTIdentification;
import generator.MTLevel;
import generator.MTQFIdentification;
import generator.QuestionedFact;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFIdentificationImpl;
import structures.DungeonElements;
import structures.Soluce;

public class MTFactGeneratorID extends FactGeneratorTemplate {

	private final int[] buildFalseInteraval = {5,5};
	private Random rand;
	
	public MTFactGeneratorID(DungeonElements dungeonElements) {
		super(dungeonElements);
		this.rand = new Random();
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
	
	private List<AQuestionableFact> generateFalseFacts(MTIdentification task, Set<AQuestionableFact> goodFacts){
		ESingleTarget falseTarget = task.getTarget();
		List<AQuestionableFact> allFacts = new ArrayList<>(goodFacts); 
		
		for (AQuestionableFact AQuestionableFact : goodFacts) {
			allFacts.add(buildBadQF((MTQFIdentification) AQuestionableFact, falseTarget));
		}
		
		return allFacts;
	}
	
	private boolean isDifferentThanFactSolutions(MTQFIdentification fact, int chosenFalseProp) {
		return chosenFalseProp != fact.getLeftOperand() && chosenFalseProp != fact.getRightOperand() && chosenFalseProp != fact.getResult();
	}
	
	private MTQFIdentification buildBadQF(MTQFIdentification goodFact, ESingleTarget target) { 
		MTQFIdentification qf = new MTQFIdentificationImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		
		int min, max, chosenFalse = -1;
		if(target.equals(ESingleTarget.RESULT)) { 
			min = goodFact.getResult() - buildFalseInteraval[0] >= 0? goodFact.getResult() - buildFalseInteraval[0]: 0;
			max = goodFact.getResult() + buildFalseInteraval[1];
		}else {
			if(goodFact.getBuild().equals(TableBuild.OPERAND_TABLE)) {
				min = goodFact.getLeftOperand() - buildFalseInteraval[0] >= 0? goodFact.getLeftOperand() - buildFalseInteraval[0]: 0;
				max = goodFact.getLeftOperand() + buildFalseInteraval[1];
			}else {
				min = goodFact.getRightOperand() - buildFalseInteraval[0] >= 0? goodFact.getRightOperand() - buildFalseInteraval[0]: 0;
				max = goodFact.getRightOperand() + buildFalseInteraval[1];
			}
			
		}
			
		while(chosenFalse == -1) {
			chosenFalse = rand.nextInt((max - min) + 1) + min;
			
			if(!isDifferentThanFactSolutions(goodFact, chosenFalse)) {
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
	protected int correctnessToReach(AQuestionableFact fact) {
		return 1; //((MTQFIdentification) fact).isSoluce()? 1: 0;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		if(((MTQFIdentification) qFact).isSoluce()) {
			solutions.add(new Soluce("Vrai"));
		}else {
			solutions.add(new Soluce("Faux"));
		}
		return solutions;
	}

	@Override
	protected Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) {
		Map<ECorrectness, List<Soluce>> propositions = new HashMap<>();
		List<Soluce> propositions_temp = new ArrayList<>();
		if(!((MTQFIdentification) qFact).isSoluce()) {		
			propositions_temp.add(new Soluce("Vrai"));
		} else {
			propositions_temp.add(new Soluce("Faux"));
		}
		propositions.put(ECorrectness.CORRECT, getListOfGoodSolutions(qFact));
		propositions.put(ECorrectness.INCORRECT, propositions_temp);		
		return propositions;
	}
	
	@Override
	protected ECorrectness getFactCorrectness(AQuestionableFact qFact) {
		return ((MTQFIdentification) qFact).isSoluce()? ECorrectness.CORRECT : ECorrectness.INCORRECT;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}
	
	@Override
	protected List<AQuestionableFact> removeUnEligibleFactsBasedOnPreviouslySelectedFact(List<QuestionedFact> previousFacts, List<AQuestionableFact> facts) {
		if(previousFactsContainsOneSoluce(previousFacts)) {
			return facts;
		} else {
			List<AQuestionableFact> filteredFacts = new ArrayList<>();
			for(AQuestionableFact fact : facts) {
				if(((MTQFIdentification) fact).isSoluce()) {
					filteredFacts.add(fact);
				}
			}
			return filteredFacts;
		}
	} 
	
	private boolean previousFactsContainsOneSoluce(List<QuestionedFact> previousFacts) {
		for(QuestionedFact fact : previousFacts) {
			if(((MTQFIdentification) fact.getQuestionablefact()).isSoluce()){
				return true;
			}
		}
		return false;
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
