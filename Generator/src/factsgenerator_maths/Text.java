package factsgenerator_maths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.paukov.combinatorics3.Generator;

import generator.AQuestionableFact;
import generator.impl.MTQFMembershipImpl;

public class Text {

	public static void main(String[] args) {
		
		
		
		/*List<AQuestionableFact> entiers = new ArrayList<>();
		for(int i = 0; i < 20; i++) {
			entiers.add(new MTQFMembershipImpl());
		}

		List<List<Integer>> groups = new ArrayList<>();
		int groupSize = 4;
		for(int i = 0; i < entiers.size(); i++) {
			for(int j = 0; j < entiers.size(); j++) {
				List<Integer> group = new ArrayList<>();
				for(int k = 0; k < groupSize; k++) {
					
				}
				groups.add(group);
			}
		}
		List<List<AQuestionableFact>> result = Generator.combination(entiers)
                .simple(4)
                .stream()
                .collect(Collectors.toList());
		System.out.println(result);
		
		int i = Integer.valueOf("1914") - Integer.valueOf("1913");
		System.out.println(i);*/
	}
}
