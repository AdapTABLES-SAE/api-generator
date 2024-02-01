package factsgenerator_hg;

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
import generator.Date;
import generator.ECorrectness;
import generator.HGQFIdentification;
import generator.HistoryFact;
import generator.QuestionedFact;
import generator.SetOfFacts;
import generator.TimePeriod;
import generator.WrongData;
import generator.impl.DateImpl;
import generator.impl.HGQFIdentificationImpl;
import generator.impl.TimePeriodImpl;
import structures.DungeonElements;
import structures.Soluce;

public class HGFactGeneratorIdentification extends FactGeneratorTemplate {

	private Random rand;
	
	public HGFactGeneratorIdentification(DungeonElements dungeonElements) {
		super(dungeonElements);
		this.rand = new Random();
	}
	
	@Override
	protected Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact) {
		if(fact instanceof HistoryFact) {
			Set<AQuestionableFact> qfs = new HashSet<>();
			qfs.add(buildQF((HistoryFact) fact));
			qfs.add(buildBadQF((HistoryFact) fact));
			return qfs;
		}
		
		return new HashSet<>();
	}
	


	private HGQFIdentification buildQF(HistoryFact fact) { 
		HGQFIdentification qf = new HGQFIdentificationImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setEvent(fact.getEvent());
		qf.setTime(fact.getTime());
		qf.setSoluce(true);
		qf.getFacts().add(fact);
		return qf;
	}
	
	private HGQFIdentification buildBadQF(HistoryFact fact) { 
		HGQFIdentification qf = new HGQFIdentificationImpl(); 
		qf.setID(taskID+"-QAFACT"+factsCounter); factsCounter++;
		qf.setEvent(fact.getEvent());
		qf.getFacts().add(fact);
		
		List<WrongData> wrongdata = new ArrayList<>(this.getPossibleWrongData(qf));
		if(fact.getTime() instanceof TimePeriod) {
			TimePeriod time = new TimePeriodImpl();
			int i = rand.nextInt(wrongdata.size());
			String a = wrongdata.get(i).getValue();
			wrongdata.remove(i);
			String b = wrongdata.get(rand.nextInt(wrongdata.size())).getValue();
			if(a.compareTo(b) < 0) {
				time.setStartYear(a);
				time.setEndYear(b);
			} else {
				time.setStartYear(b);
				time.setEndYear(a);
			}
			qf.setTime(time);
		} else {
			Date time = new DateImpl();
			String b = wrongdata.get(rand.nextInt(wrongdata.size())).getValue();
			time.setYear(b);
			qf.setTime(time);
		}
		
		qf.setSoluce(false);
		
		return qf;
	}

	@Override
	protected int correctnessToReach(AQuestionableFact fact) {
		return 1;
	}

	@Override
	protected List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact) {
		List<Soluce> solutions = new ArrayList<>();
		if(((HGQFIdentification) qFact).isSoluce()) {
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
		if(!((HGQFIdentification) qFact).isSoluce()) {		
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
		return ((HGQFIdentification) qFact).isSoluce()? ECorrectness.CORRECT : ECorrectness.INCORRECT;
	}

	@Override
	protected boolean isQuestionInteractive() {
		return false;
	}
	
	/*@Override
	protected List<AQuestionableFact> removeUnEligibleFactsBasedOnPreviouslySelectedFact(List<QuestionedFact> previousFacts, List<AQuestionableFact> facts) {
		if(previousFactsContainsOneSoluce(previousFacts)) {
			return facts;
		} else {
			List<AQuestionableFact> filteredFacts = new ArrayList<>();
			for(AQuestionableFact fact : facts) {
				if(((HGQFIdentification) fact).isSoluce()) {
					filteredFacts.add(fact);
				}
			}
			return filteredFacts;
		}
	} 
	
	private boolean previousFactsContainsOneSoluce(List<QuestionedFact> previousFacts) {
		for(QuestionedFact fact : previousFacts) {
			if(((HGQFIdentification) fact.getQuestionablefact()).isSoluce()){
				return true;
			}
		}
		return false;
	}*/

	@Override
	protected boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getMembershipPropertyOfAFact(AbstractFact fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Set<AQuestionableFact> generateMembershipOrOrderQuestionableFacts(ATask task, HashMap<String, List<AbstractFact>> facts,
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
