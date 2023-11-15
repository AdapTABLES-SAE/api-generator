package factgenerator_template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.paukov.combinatorics3.Generator;

import exceptions.BadSolutionGenerationException;
import generator.AQuestionParam;
import generator.AQuestionableFact;
import generator.ATask;
import generator.AVisualizationQuestionableFact;
import generator.AbstractFact;
import generator.CorrectnessValue;
import generator.ECorrectness;
import generator.EnterResponse;
import generator.EntrySoluceParam;
import generator.FactCorrectnessParam;
import generator.FactSolutionParam;
import generator.MultipleChoice;
import generator.OrderingTask;
import generator.Position;
import generator.PropositionParam;
import generator.QuestionParam;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.ResultsByTask;
import generator.SetOfFacts;
import generator.Value;
import generator.VisualizationPosition;
import generator.VisualizationQuestionParam;
import generator.VisualizationSolution;
import generator.WantedAnswersParam;
import generator.impl.CorrectnessValueImpl;
import generator.impl.EntrySoluceParamImpl;
import generator.impl.FactCorrectnessParamImpl;
import generator.impl.FactSolutionParamImpl;
import generator.impl.PositionImpl;
import generator.impl.PropositionParamImpl;
import generator.impl.QuestionParamImpl;
import generator.impl.QuestionedFactImpl;
import generator.impl.ValueImpl;
import generator.impl.VisualizationQuestionParamImpl;
import generator.impl.VisualizationSolutionImpl;
import generator.impl.WantedAnswersParamImpl;
import generators.ALGAGenerator;
import managers.ModelsManager;
import structures.DungeonElements;
import structures.RoomElements;
import structures.Shuffle;
import structures.Soluce;

public abstract class FactGeneratorTemplate {
	
	/**
	 * Template for fact (questionable and questioned fact) generation
	 * This template changes a little for membership facts. 
	 */

	protected ModelsManager modelsManager;
	protected DungeonElements dungeonElements;
	protected String taskID;
	protected int factsCounter; 
	
	public FactGeneratorTemplate(DungeonElements dungeonElements) {
		this(null, dungeonElements);
	}
	
	public FactGeneratorTemplate(ModelsManager modelsManager, DungeonElements dungeonElements) {
		this.dungeonElements = dungeonElements;
		this.factsCounter = 0;
		this.modelsManager = modelsManager;
	}
	
	private Set<AQuestionableFact> generateMembership(ATask task) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		int numberByFacts;
	    if(task.getResponseModality() instanceof MultipleChoice) {
	      MultipleChoice mc = (MultipleChoice) task.getResponseModality();
	      numberByFacts = mc.getNbChoices() - mc.getNbBadChoices();
	    } else{
	      ALGAGenerator.LOGGER.info("Task response modality is DynamicMultipleChoice or EnterInput for Membership Task ! ");
	      numberByFacts = -1;
	    } 	    
	    
	    for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
	    	if(conditionForMembershipTaskOnSetOfFacts(setoffact)) {
	    	HashMap<String, List<AbstractFact>> facts = new HashMap<>();
	    	for (AbstractFact fact : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
	    		List<AbstractFact> factlist = new ArrayList<>();
	    		factlist.add(fact);
	    		if(conditionForMembershipOrOrderTaskOnFacts(fact)){
	    			String key = getMembershipPropertyOfAFact(fact);
	    			if(facts.containsKey(key)) {
	    				factlist.addAll(facts.get(key));
	    			}
	    			facts.put(key, factlist);
	            }
	        } 
	        questionableFacts.addAll(generateMembershipOrOrderQuestionableFacts(task, facts, numberByFacts));
	      }
	    } 
		return questionableFacts;
	}
	
	private Set<AQuestionableFact> generateOrder(ATask task) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>(); 
		
		List<AbstractFact> facts = new ArrayList<>();
		for (SetOfFacts setoffact : new ArrayList<>(dungeonElements.getChosenObjective().getSetoffacts())) {
			for (AbstractFact fact : Shuffle.shuffle(new ArrayList<>(setoffact.getFacts()))) {
	    		if(conditionForMembershipOrOrderTaskOnFacts(fact)){
	    			facts.add(fact);
	    		}
			}
		}
		
		List<List<AbstractFact>> combinaisons = Generator.combination(facts)
                .simple(4)
                .stream()
                .collect(Collectors.toList());
		
		for(List<AbstractFact> combinaison: combinaisons) {
			HashMap<String, List<AbstractFact>> aMap = new HashMap<>(); 
			aMap.put("ORDER", combinaison);
			questionableFacts.addAll(generateMembershipOrOrderQuestionableFacts(task, aMap, combinaison.size()));
		}
		
		return questionableFacts;
	}
	
	private Set<AQuestionableFact> generateDefault(ATask task) {
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		for (SetOfFacts setoffact : dungeonElements.getChosenObjective().getSetoffacts()) {
			for (AbstractFact f : setoffact.getFacts()) { 
				for(AQuestionableFact fact: generateQuestionableFactsOf(task, f)) {
					questionableFacts.add(fact);
				}
			}
		}
		return questionableFacts;
	}
	
	public Set<AQuestionableFact> generateQuestionableFacts(ATask task){
		Set<AQuestionableFact> questionableFacts = new HashSet<>();
		taskID = task.getID();
		switch(task.getType()) {
		case MEMBERSHIP:
		    questionableFacts.addAll(generateMembership(task));
			break;
		case ORDER:
		    questionableFacts.addAll(generateOrder(task));
			break;
		default:
			questionableFacts.addAll(generateDefault(task));
			break;
		}
		
		
		return questionableFacts; 
	}
	
	protected abstract boolean conditionForMembershipTaskOnSetOfFacts(SetOfFacts setoffacts);
	protected abstract boolean conditionForMembershipOrOrderTaskOnFacts(AbstractFact fact);
	/**
	 * Gives the values of the property of a given fact.
	 * For example, a fact that is "Ippon-Seoi-Nage is a TE-WAZA (Arm projection Technique)" will return
	 * the category of the technique which is "TE-WAZA (Arm projection Technique)". 
	 * @param fact
	 * @return value of the property (used to classify fact by their common properties)
	 */
	protected abstract String getMembershipPropertyOfAFact(AbstractFact fact);
	
	protected Set<AQuestionableFact> generateMembershipOrOrderQuestionableFacts(ATask task, HashMap<String, List<AbstractFact>> facts, int numberByFact) {
		Set<AQuestionableFact> qfs = new HashSet<>(); 
		for(String key: facts.keySet()) {
			int k = 0;
			if(numberByFact == -1) { numberByFact = facts.get(key).size(); }
			int numberOfQuestionableFacts = (int) Math.ceil((double) facts.get(key).size() / (double) numberByFact);
			if(numberOfQuestionableFacts == 0) {
				numberOfQuestionableFacts = facts.get(key).size();
			}
			for (int i = 0; i < numberOfQuestionableFacts; i++) {
				List<AbstractFact> factres = new ArrayList<>(); 
				while(factres.size() < numberByFact && k < facts.get(key).size()) {
					factres.add(facts.get(key).get(k));
					k++;
				}
				if(!factres.isEmpty()) {
					qfs.add(generateQuestionableFactOf(task, factres)); 
				}
			}
		}
		return qfs;
	}
	
	protected abstract AQuestionableFact generateQuestionableFactOf(ATask task, List<AbstractFact> facts);
	
	protected abstract Set<AQuestionableFact> generateQuestionableFactsOf(ATask task, AbstractFact fact);
		
	protected void createAQuestionedFactFrom(RoomElements roomElement, AQuestionableFact qFact) throws BadSolutionGenerationException {
		QuestionedFact qef = new QuestionedFactImpl(); 
		qef.setQuestionablefact(qFact);
		
		if(roomElement.getTask().getResponseModality() instanceof EnterResponse) {
			List<Soluce> solutions = getListOfGoodSolutions(qFact);
			for (Soluce sol : solutions) {
				EntrySoluceParam soluceParam = new EntrySoluceParamImpl(); 
				Value value = new ValueImpl();
				value.setValue(sol.getValue());
				soluceParam.setValue(value);				
				if(sol.isGraphicSolution()) {
					Position mapValue = new PositionImpl();
					mapValue.setID(sol.getPosition().getID());
					soluceParam.setPosition(mapValue);
				}
				qef.getEntrys().add(soluceParam); 
			}
		} else {
			Map<ECorrectness, List<Soluce>> propositions = getListOfPropositions(roomElement.getTask(), qFact);
			for (Entry<ECorrectness, List<Soluce>> propState : propositions.entrySet()) {
				for (Soluce prop : propState.getValue()) {
					PropositionParam propositionParam = new PropositionParamImpl();
					
					CorrectnessValue correctnessValue = new CorrectnessValueImpl();
					correctnessValue.setValue(propState.getKey());
					propositionParam.setState(correctnessValue);
					
					Value value = new ValueImpl();
					value.setValue(prop.getValue());
					propositionParam.setValue(value);
					
					if(prop.isGraphicSolution()) {
						Position mapValue = new PositionImpl();
						mapValue.setID(prop.getPosition().getID());
						propositionParam.setPosition(mapValue);
					}
					
					propositionParam.setOrder(prop.getOrder());
					
					propositionParam.setImage(prop.isImage());
					qef.getPropositions().add(propositionParam);
				}
			}
		}
		qef.setQuestion(buildQuestionParam(roomElement.getTask(), qFact, qef.getPropositions()));
		WantedAnswersParam correctness = new WantedAnswersParamImpl();
		Value correctnessValue = new ValueImpl();
		correctnessValue.setValue(correctnessToReach(qFact)+"");
		correctness.setValue(correctnessValue);
		qef.setCorrectnessToReach(correctness);
		
		qef.setLearnerValidation(roomElement.getTask().isCheckOnLearnerAction());
		
		
		ECorrectness factCorrectness = getFactCorrectness(qFact);
		if(factCorrectness != null) {
			
			FactCorrectnessParam param = new FactCorrectnessParamImpl();
			CorrectnessValue cValue = new CorrectnessValueImpl();
			cValue.setValue(factCorrectness);
			param.setValue(cValue);
			qef.setFactCorrectness(param);
		}
		
		roomElement.addQuestionedFact(qef);
	}
	
	protected VisualizationSolution buildVisualizationSolution(String value, VisualizationPosition position, boolean isImage) {
		VisualizationSolution soluce = new VisualizationSolutionImpl();
		soluce.setValue(value);
		soluce.setVisualizationPosition(position);
		soluce.setImage(isImage);
		return soluce;
	}
	
	protected AQuestionParam buildQuestionParam(ATask task, AQuestionableFact qFact, List<PropositionParam> propositions) {
		if(qFact instanceof QuestionableFact) {
			QuestionParam question = new QuestionParamImpl();
			Value value = new ValueImpl();
			value.setValue(((QuestionableFact) qFact).getQuestionableFact());
			question.setValue(value);
			question.setInteractive(isQuestionInteractive());
			
			List<String> acceptedFullSolutions;
			if(task instanceof OrderingTask) {
				acceptedFullSolutions = buildOrderPossibleFullAcceptedSolution((QuestionableFact) qFact, propositions);
			} else {
				acceptedFullSolutions = factSolutionsToString(qFact);
			}
			question.getSolutions().addAll(acceptedFullFactSolution(acceptedFullSolutions));	
					
			question.setCompleteFact(((QuestionableFact) qFact).getCompleteFact());
			question.setImage(qFact.isQuestionWithImage());
			return question;
		} else {
			VisualizationQuestionParam question = new VisualizationQuestionParamImpl();
			question.setVisualization(((AVisualizationQuestionableFact) qFact).getVisualization());
			Value consigne = new ValueImpl();
			consigne.setValue(((AVisualizationQuestionableFact) qFact).getConsigne());
			question.setValue(consigne);
			return question;
		}
	}
	
	protected ECorrectness getFactCorrectness(AQuestionableFact qFact) {
		return null;
	}
	
	/*private List<FactSolutionParam> fullFactsSolution(AQuestionableFact qFact){
		List<String> stringSolutions = factSolutionsToString(qFact);
		List<FactSolutionParam> solutions = new ArrayList<>();
		if(!stringSolutions.isEmpty()) {
			for (String sol : stringSolutions) {
				FactSolutionParam factSol = new FactSolutionParamImpl();
				Value solValue = new ValueImpl();
				solValue.setValue(sol);
				factSol.setValue(solValue);
				solutions.add(factSol);
			}
		}		
		return solutions;
	}*/
	
	private List<FactSolutionParam> acceptedFullFactSolution(List<String> acceptedSolutions){
		List<FactSolutionParam> solutions = new ArrayList<>();
		if(!acceptedSolutions.isEmpty()) {
			for (String sol : acceptedSolutions) {
				FactSolutionParam factSol = new FactSolutionParamImpl();
				Value solValue = new ValueImpl();
				solValue.setValue(sol);
				factSol.setValue(solValue);
				solutions.add(factSol);
			}
		}		
		return solutions;
	}
	
	protected List<String> factSolutionsToString(AQuestionableFact qFact){
		if(qFact instanceof QuestionableFact) {
			List<String> full_solution = new ArrayList<>();
			full_solution.add(((QuestionableFact) qFact).getCompleteFact());
			return full_solution;
		}
		return new ArrayList<>();
	}
	
	private List<String> buildOrderPossibleFullAcceptedSolution(QuestionableFact qFact, List<PropositionParam> propositions) {
		String solutionWithStatement = qFact.getCompleteFact() + " : "; 
		for(int i = 0; i < propositions.size(); i++) {
			solutionWithStatement += ((Value) propositions.get(i).getValue()).getValue();
			if(i < propositions.size() - 1) { solutionWithStatement += " - " ; } 
		}
		
		String solutionWithoutStatement = ""; 
		for(int i = 0; i < propositions.size(); i++) {
			solutionWithoutStatement += propositions.get(i).getOrder() + " " + ((Value) propositions.get(i).getValue()).getValue();
			if(i < propositions.size() - 1) { solutionWithoutStatement += " " ; } 
		}
		List<String> solutions = new ArrayList<>(); 
		solutions.add(solutionWithStatement);
		solutions.add(solutionWithoutStatement);
		return solutions;
	}
	
	protected abstract List<Soluce> getListOfGoodSolutions(AQuestionableFact qFact);
	protected abstract Map<ECorrectness, List<Soluce>> getListOfPropositions(ATask task, AQuestionableFact qFact) throws BadSolutionGenerationException;
	protected abstract boolean isQuestionInteractive();
	
	public void generateQuestionedFact(RoomElements roomElements) {
		for (int i = 0; i < roomElements.getTask().getNbFacts(); i++) {
			AQuestionableFact qf = null;
			try {
				qf = getAvailableFact(roomElements, roomElements.getCorrespondingResultByTask(dungeonElements.getCurrentObjectiveLevel()));
				createAQuestionedFactFrom(roomElements, qf);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	private List<AQuestionableFact> alreadySelectedFacts(RoomElements roomElements) {
		List<AQuestionableFact> facts = new ArrayList<>(); 
		for(QuestionedFact fact: roomElements.getFacts()) {
			facts.add(fact.getQuestionablefact());
		}
		return facts;
	}
	
	protected abstract int correctnessToReach(AQuestionableFact fact);
	
	private boolean areEveryFactAchieved(ResultsByTask resByTask) {
		boolean allAchieved = true;
		for (AQuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved()) {
				allAchieved = false;
			}
		}
		return allAchieved;
	}
	
	private AQuestionableFact getAvailableFact(RoomElements roomElements, ResultsByTask resByTask) throws Exception { 
		if(areEveryFactAchieved(resByTask)) {
			resetPoolWithEveryFacts(resByTask);
		} else {
			if(isPoolEmpty(resByTask)) {
				resetPoolOfFacts(resByTask);
			}
		}	

		List<AQuestionableFact> eligibleFacts = getEligibleQuestionableFacts(resByTask);
		eligibleFacts.removeAll(alreadySelectedFacts(roomElements));
		eligibleFacts = removeUnEligibleFactsBasedOnPreviouslySelectedFact(roomElements.getFacts(), eligibleFacts);
		if(eligibleFacts.isEmpty()) {
			throw new Exception("Pool of facts should not be empty for task "+resByTask.getTask().getType());
		} else {
			int number = new Random().nextInt(eligibleFacts.size());
			return eligibleFacts.get(number);
		}
	}
	
	protected List<AQuestionableFact> removeUnEligibleFactsBasedOnPreviouslySelectedFact(List<QuestionedFact> previousFacts, List<AQuestionableFact> facts) {
		if(!previousFacts.isEmpty() && previousFacts.get(0).getQuestion() instanceof VisualizationQuestionParam) {
			List<AQuestionableFact> facts_ = new ArrayList<>(); 
			for(AQuestionableFact fact: facts) {  
				if(fact instanceof AVisualizationQuestionableFact) {
					AVisualizationQuestionableFact vfact = (AVisualizationQuestionableFact) fact; 
					if( ((VisualizationQuestionParam) previousFacts.get(0).getQuestion()).getVisualization().getID().equals(vfact.getVisualization().getID())) {
						facts_.add(vfact);
					}
				}
			}
			return facts_;
		}
		return facts;
	}

	
	private List<AQuestionableFact> getEligibleQuestionableFacts(ResultsByTask resByTask){
		List<AQuestionableFact> eligibleFacts = new ArrayList<>();
		for (AQuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isWasSelected()) {
				
				eligibleFacts.add(qfact);
			}
		}
		return eligibleFacts;
	}
			
	private boolean isPoolEmpty(ResultsByTask resByTask) {
		int i = 0; 
		boolean hasAvailable = false;
		while(i < resByTask.getQuestionableFacts().size() && !hasAvailable) {
			if(!resByTask.getQuestionableFacts().get(i).isAchieved() && !resByTask.getQuestionableFacts().get(i).isWasSelected()) {
				hasAvailable = true;
			}
			i++;
		}
		return hasAvailable; 
	}
	
	private void resetPoolWithEveryFacts(ResultsByTask resByTask) {
		for (AQuestionableFact qfact: resByTask.getQuestionableFacts()) {
			qfact.setWasSelected(false);
		}
	}
	
	private void resetPoolOfFacts(ResultsByTask resByTask) {
		for (AQuestionableFact qfact: resByTask.getQuestionableFacts()) {
			if(!qfact.isAchieved() && qfact.isWasSelected()) {
				qfact.setWasSelected(false);
			}
		}
	}
}
