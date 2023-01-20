package factsgenerator_maths;

import java.util.HashSet;
import java.util.Set;

import generator.AbstractFact;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFRebuild;
import generator.MTRecontruction;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.impl.MTQFRebuildImpl;
import managers.EducationElementsManager;

public class MTRebuildGenerator {

	private EducationElementsManager eeManager;
	
	public MTRebuildGenerator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}
	
	public Set<MTQFRebuild> generateQuestionableFacts(MTRecontruction task) {
		HashSet<MTQFRebuild> questionableFacts = new HashSet<>();
		
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
						questionableFacts.addAll(generateQuestionableFactsOf(fact));
					}
				}
				
			}
		}
		
		
		return questionableFacts; 		
	}
	private Set<MTQFRebuild> generateQuestionableFactsOf(MTFact fact){
		HashSet<MTQFRebuild> qfs = new HashSet<>(); 
		
		TableBuild build = ((MTLevel) eeManager.getLevel()).getBuildSetup();
		ResultPosition equalPos = ((MTLevel) eeManager.getLevel()).getResultPositionSetup();
		
		if(equalPos.equals(ResultPosition.MIX)) {
			qfs.add(buildQF(fact, ResultPosition.LEFT, TableBuild.OPERAND_TABLE));
			qfs.add(buildQF(fact, ResultPosition.RIGHT, TableBuild.OPERAND_TABLE));
		} else {
			qfs.add(buildQF(fact, equalPos, build));
			qfs.add(buildQF(fact, equalPos, build));
		}
		
		return qfs;
		
	}
	
	private MTQFRebuild buildQF(MTFact fact, ResultPosition resPos, TableBuild build) {
		MTQFRebuild qf = new MTQFRebuildImpl(); 
		
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
}
