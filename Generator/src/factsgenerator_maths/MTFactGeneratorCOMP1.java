package factsgenerator_maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import factgenerator_template.TaskFactGeneratorTemplate;
import generator.ATask;
import generator.AbstractFact;
import generator.ESingleTarget;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.MTQeFCompletion1;
import generator.MultipleChoice;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultPosition;
import generator.TableBuild;
import generator.impl.MTQFCompletion1Impl;
import generator.impl.MTQeFCompletion1Impl;
import managers.EducationElementsManager;

public class MTFactGeneratorCOMP1 extends TaskFactGeneratorTemplate {

	public MTFactGeneratorCOMP1(EducationElementsManager eeManager) {
		super(eeManager);
	}

	@Override
	protected Set<QuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof MTFact) {
			MTCompletion1 taskC = (MTCompletion1) task;
			MTFact factC = (MTFact) fact;
			int min = ((MTLevel) eeManager.getLevel()).getMinInterval();
			int max = ((MTLevel) eeManager.getLevel()).getMaxInterval();
	
			if(min <= factC.getOp() && factC.getOp() <= max){
				Set<QuestionableFact> qfs = new HashSet<>(); 			
				TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
				ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
				
				for (ESingleTarget target : taskC.getTargets()) {
					if(build.equals(TableBuild.MIX)) {
						if(equalPos.equals(ResultPosition.MIX)) {
							qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, ResultPosition.LEFT, TableBuild.TABLE_OPERAND, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, TableBuild.TABLE_OPERAND, target));
						} else {
							qfs.add(buildQF(factC, equalPos, TableBuild.OPERAND_TABLE, target));
							qfs.add(buildQF(factC, equalPos, TableBuild.TABLE_OPERAND, target));
						}
					} else {
						if(equalPos.equals(ResultPosition.MIX)) {
							qfs.add(buildQF(factC, ResultPosition.LEFT, build, target));
							qfs.add(buildQF(factC, ResultPosition.RIGHT, build, target));
						} else {
							qfs.add(buildQF(factC, equalPos, build, target));
						}
					}
				}
				return qfs;
			}
		}

		
		return new HashSet<>();
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

	@Override
	protected QuestionedFact initializeQuestionedFact() {
		return new MTQeFCompletion1Impl();
	}

	@Override
	protected void manageChoices(MultipleChoice mc, QuestionableFact qaf, QuestionedFact qef) {
		MTQFCompletion1 qfact = (MTQFCompletion1) qaf;
		List<Integer> propositions = new ArrayList<>();
		propositions.add(qfact.getSoluce());
		int min = qfact.getSoluce()-10 >= 0? qfact.getSoluce()-10: 0;
		int max = qfact.getSoluce()+10;
		
		while(propositions.size() < mc.getNbBadChoices() + 1) {
			int number = new Random().nextInt(max - min) + min;
			if(!propositions.contains(number)) {
				propositions.add(number);
			}
		}
		((MTQeFCompletion1) qef).getPropositions().addAll(propositions);
	}

	@Override
	protected int correctnessToReach(ATask aTask) {
		return 1 * aTask.getNbFacts();
	}	
}
