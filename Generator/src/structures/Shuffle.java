package structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generator.AbstractFact;
import generator.QuestionableFact;
import generator.ResultsByTask;

public class Shuffle {
	
	public static List<AbstractFact> shuffle(List<AbstractFact> eList){
		Random rand = new Random();
		List<AbstractFact> shuffledElem = new ArrayList<>();
		int number = eList.size();
		int j;
		while (shuffledElem.size() != number) {
			j = rand.nextInt(eList.size()); 
			shuffledElem.add(eList.get(j));
			eList.remove(j);
		}
		return shuffledElem;
	}
	
	public static List<ResultsByTask> shuffleTask(List<ResultsByTask> tasks){
		Random rand = new Random();
		List<ResultsByTask> tasksShuffled = new ArrayList<>();
		int number = tasks.size();
		int j;
		while (tasksShuffled.size() != number) {
			j = rand.nextInt(tasks.size()); 
			tasksShuffled.add(tasks.get(j));
			tasks.remove(j);
		}
		return tasksShuffled;
	}
	
	public static List<QuestionableFact> shuffleQFacts(List<QuestionableFact> qfacts){
		Random rand = new Random();
		List<QuestionableFact> qfactsShuffled = new ArrayList<>();
		int number = qfacts.size();
		int j;
		while (qfactsShuffled.size() != number) {
			j = rand.nextInt(qfacts.size()); 
			qfactsShuffled.add(qfacts.get(j));
			qfacts.remove(j);
		}
		return qfactsShuffled;
	}
}
