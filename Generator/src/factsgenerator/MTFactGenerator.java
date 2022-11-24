package factsgenerator;

import java.util.HashSet;
import java.util.Set;

import generator.ATask;
import generator.AbstractFact;
import generator.Knowledge;
import generator.MTCompletion1;
import generator.MTLevel;
import generator.QuestionedFact;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.TargetElement;
import generator.impl.QuestionedFactImpl;
import managers.EducationElementsManager;

public class MTFactGenerator {

	private Knowledge mTables; 
	private EducationElementsManager eeManager; 
	
	public MTFactGenerator(Knowledge multiplicationTables, EducationElementsManager eeManager) {
		mTables = multiplicationTables; 
		this.eeManager = eeManager; 
	}
	
	public void generateQFacts() {
		for (ATask task : eeManager.getTasks()) {
			switch(task.getType()) {
				case COMPLETE1: 
					generateCompletion1QFacts((MTCompletion1) task);
					break;
			}
		}
	}
	
	public Set<QuestionedFact> generateCompletion1QFacts(MTCompletion1 task) {
		Set<QuestionedFact> questionedFacts = new HashSet<>();
		
		MTLevel level = (MTLevel) eeManager.getLevel();
		TableBuild build = level.getBuildSetup();
		ResultPosition equalPosition = level.getResultPositionSetup();
		TargetElement target = task.getTargets().get(0);
		
		for (SetOfFacts setoffact : eeManager.getObjective().getSetoffacts()) {
			for (AbstractFact fact : setoffact.getFacts()) {
				QuestionedFact qf = new QuestionedFactImpl();
				//qf.setFact(fact);
				//qf.setMissing(target);
				
			}
		}
		
		
		return null; 
	}
}
