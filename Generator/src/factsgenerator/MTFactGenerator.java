package factsgenerator;

import java.util.Set;

import generator.ATask;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTIdentification;
import generator.MTMembership;
import generator.MTQFCompletion1;
import generator.MTQFCompletion2;
import generator.MTQFIdentification;
import generator.MTQFMembership;
import generator.MTQFRebuild;
import generator.MTRecontruction;
import managers.EducationElementsManager;

public class MTFactGenerator {

	//private LearnerPlayer learnerPlayer;
	private EducationElementsManager eeManager; 
	
	public MTFactGenerator(EducationElementsManager eeManager) {
		this.eeManager = eeManager; 
	}
	
	public void generateQFacts() {
		System.out.println("Obj/Level :" + eeManager.getObjective().getName() + " " + eeManager.getLevel());

		for (ATask task : eeManager.getTasks()) {
			System.out.println("\tTask Type :" +  task.getType());
			switch(task.getType()) {
				case COMPLETE1: 
					MTCompletion1Generator generatorC1 = new MTCompletion1Generator(eeManager);
					Set<MTQFCompletion1> qfs = generatorC1.generateQuestionableFacts((MTCompletion1) task);
					//System.out.println("QF Completion1 = "+qfs.size());
					/*for (MTQFCompletion1 qf : qfs) {
						System.out.println(qf.getQuestionableFact());
					}*/
					break;
				case COMPLETE2: 
					MTCompletion2Generator generatorC2 = new MTCompletion2Generator(eeManager);
					Set<MTQFCompletion2> qfsc2 = generatorC2.generateQuestionableFacts((MTCompletion2) task);
					/*System.out.println("QF Completion2 = "+qfsc2.size());
					for (MTQFCompletion2 qf : qfsc2) {
						System.out.println(qf.getQuestionableFact());
					}*/
					break;
				case REBUILD: 
					MTRebuildGenerator generatorR = new MTRebuildGenerator(eeManager);
					Set<MTQFRebuild> qfs3 = generatorR.generateQuestionableFacts((MTRecontruction) task);
					/*System.out.println("QF Rebuild = "+qfs3.size());
					for (MTQFRebuild qf : qfs3) {
						System.out.println(qf.getQuestionableFact());
					}*/
					break;
				case IDENTIFY: 
					MTIdentificationGenerator generatorID = new MTIdentificationGenerator(eeManager);
					Set<MTQFIdentification> qfsid = generatorID.generateQuestionableFacts((MTIdentification) task);
					/*System.out.println("QF Identification = "+qfsid.size());
					for (MTQFIdentification qf : qfsid) {
						System.out.println(qf.getQuestionableFact());
					}*/
					break;
				case MEMBERSHIP: 
					MTMembershipGenerator generatorMem = new MTMembershipGenerator(eeManager);
					Set<MTQFMembership> qfsmem = generatorMem.generateQuestionableFacts((MTMembership) task);
					System.out.println("QF Membership = "+qfsmem.size());
					for (MTQFMembership qf : qfsmem) {
						System.out.println(qf.getQuestionableFact());
					}
					break;
					
			}
		}
	}
	

}
