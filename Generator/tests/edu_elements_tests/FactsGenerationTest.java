package edu_elements_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;

import generator.ResultsByTask;
import generators.ALGAGenerator;

class FactsGenerationTest {

	ALGAGenerator generator;
/*	
	@Test
	void numberOfQuestionableFactsGeneratedAllTablesTest() {
		generator = new ALGAGenerator("learnerProfils/LP_FIC_Init.xmi");
		generator.generate();
		List<ResultsByTask> learnerResultsByTask = generator.getModelsManager().getContextModel().getLearnerplayer().getProgression().getCurrentobjectivelevels().get(0).getResults().getResultsbytask();
		for (ResultsByTask resultsByTask : learnerResultsByTask) {
			switch (resultsByTask.getTask().getID()) {
			case "C1-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 288, "C1-RES");
				break;
			case "C1-TABOP":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 576, "C1-TABOP");
				break;
			case "C2-OPTABLE":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 288, "C2-OPTABLE");
				break;
			case "REB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 288, "REB");
				break;
			case "ID-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 576, "ID-RES");
				break;
			case "MEMB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 48, "MEMB");
				break;
			default:
				break;
			}
		}
	}
	
	@Test
	void numberOfQuestionableFactsGeneratedOneTableTest() {
		generator = new ALGAGenerator("learnerProfils/LP_FIC_FactInitTest.xmi");
		generator.generate();
		List<ResultsByTask> learnerResultsByTask = generator.getModelsManager().getContextModel().getLearnerplayer().getProgression().getCurrentobjectivelevels().get(0).getResults().getResultsbytask();
		for (ResultsByTask resultsByTask : learnerResultsByTask) {
			System.out.println(resultsByTask.getQuestionableFacts().size());
			switch (resultsByTask.getTask().getID()) {
			case "C1-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 46, "C1-RES");
				break;
			case "C1-TABOP":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 92, "C1-TABOP");
				break;
			case "C2-OPTABLE":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 24, "C2-OPTABLE");
				break;
			case "REB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 24, "REB");
				break;
			case "ID-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 92, "ID-RES");
				break;
			case "MEMB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 4, "MEMB");
				break;
			default:
				break;
			}
		}
	}
	
	@Test
	void numberOfQuestionableFactsGenerated4TablesTest() {
		generator = new ALGAGenerator("learnerProfils/LP_FIC_FactInitTest2.xmi");
		generator.generate();
		List<ResultsByTask> learnerResultsByTask = generator.getModelsManager().getContextModel().getLearnerplayer().getProgression().getCurrentobjectivelevels().get(0).getResults().getResultsbytask();
		for (ResultsByTask resultsByTask : learnerResultsByTask) {
			System.out.println(resultsByTask.getQuestionableFacts().size());
			switch (resultsByTask.getTask().getID()) {
			case "C1-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 160, "C1-RES");
				break;
			case "C1-TABOP":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 320, "C1-TABOP");
				break;
			case "C2-OPTABLE":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 96, "C2-OPTABLE");
				break;
			case "REB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 96, "REB");
				break;
			case "ID-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 320, "ID-RES");
				break;
			case "MEMB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 16, "MEMB");
				break;
			default:
				break;
			}
		}
	}
	
	@Test
	void numberOfQuestionableFactsGenerated4TablesMinMax35Test() {
		generator = new ALGAGenerator("learnerProfils/LP_FIC_FactInitTest3.xmi");
		generator.generate();
		List<ResultsByTask> learnerResultsByTask = generator.getModelsManager().getContextModel().getLearnerplayer().getProgression().getCurrentobjectivelevels().get(0).getResults().getResultsbytask();
		for (ResultsByTask resultsByTask : learnerResultsByTask) {
			System.out.println(resultsByTask.getQuestionableFacts().size());
			switch (resultsByTask.getTask().getID()) {
			case "C1-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 40, "C1-RES");
				break;
			case "C1-TABOP":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 80, "C1-TABOP");
				break;
			case "C2-OPTABLE":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 24, "C2-OPTABLE");
				break;
			case "REB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 24, "REB");
				break;
			case "ID-RES":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 80, "ID-RES");
				break;
			case "MEMB":
				assertTrue(resultsByTask.getQuestionableFacts().size() == 4, "MEMB");
				break;
			default:
				break;
			}
		}
	}*/

}
