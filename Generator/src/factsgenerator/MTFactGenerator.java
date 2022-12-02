package factsgenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import generator.ATask;
import generator.AbstractFact;
import generator.MTCompletion1;
import generator.MTFact;
import generator.MTLevel;
import generator.MTQFCompletion1;
import generator.ResultPosition;
import generator.SetOfFacts;
import generator.TableBuild;
import generator.TargetElement;
import generator.impl.MTQFCompletion1Impl;
import managers.EducationElementsManager;

public class MTFactGenerator {

	//private Knowledge mTables; 
	private EducationElementsManager eeManager; 
	
	public MTFactGenerator(/*Knowledge multiplicationTables,*/ EducationElementsManager eeManager) {
		//mTables = multiplicationTables; 
		this.eeManager = eeManager; 
	}
	
	public void generateQFacts() {
		for (ATask task : eeManager.getTasks()) {
			switch(task.getType()) {
				case COMPLETE1: 
					MTCompletion1Generator generatorC1 = new MTCompletion1Generator(eeManager);
					Set<MTQFCompletion1> qfs = generatorC1.generateCompletion1QFacts((MTCompletion1) task);
					System.out.println("Level + Task "+ eeManager.getObjective()+" "+eeManager.getLevel() + " " + task.getType());
					System.out.println("Nb qfs = "+qfs.size());
					for (MTQFCompletion1 qf : qfs) {
						System.out.println(qf.getQuestionableFact());
					}
					break;
			}
		}
	}
	

}
