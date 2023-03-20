package gameplaygenerator_maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import generator.ATask;
import generator.Ability;
import generator.CoreElement;
import generator.Correctness;
import generator.Display;
import generator.ElementCategory;
import generator.GPType;
import generator.GameDescription;
import generator.Gameplay;
import generator.MTQFCompletion1;
import generator.MTQFCompletion2;
import generator.MTQFIdentification;
import generator.MTQFMembership;
import generator.MTQFRebuild;
import generator.MTQeFCompletion1;
import generator.MTQeFCompletion2;
import generator.MTQeFIdentification;
import generator.MTQeFMembership;
import generator.MTQeFRebuild;
import generator.MultipleChoice;
import generator.Position;
import generator.PositionedElement;
import generator.QuantifiedElements;
import generator.QuestionableFact;
import generator.QuestionedFact;
import generator.QuestionedFactStatement;
import generator.RoomType;
import generator.StatementType;
import generator.VerificationValues;
import generator.WantedAnswer;
import generator.impl.CorrectnessImpl;
import generator.impl.DisplayImpl;
import generator.impl.PositionedElementImpl;
import generator.impl.QuestionedFactStatementImpl;
import generator.impl.WantedAnswerImpl;
import structures.Shuffle;

public class MTGameplayGenerator {
	
	private GameDescription gameDescription;
	private Random random;
	private int nbPositionedElement;
	
	public MTGameplayGenerator(GameDescription gameDescription) {
		this.gameDescription = gameDescription;
		this.nbPositionedElement = 1;
		this.random = new Random();
	}

	public List<PositionedElement> generateGameplayElements(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomtype) {
		List<PositionedElement> elements = new ArrayList<>();
		switch (task.getType()) {
		case COMPLETE1:
			elements = completion1ElementGeneration(gameplay, task, facts, roomtype);
			break;
		case COMPLETE2:
			elements = completion2ElementGeneration(gameplay, task, facts, roomtype);
			break;
		case REBUILD:
			elements = rebuildElementGeneration(gameplay, task, facts, roomtype);
			break;
		case IDENTIFY:
			elements = identificationElementGeneration(gameplay, task, facts, roomtype);
			break;
		case MEMBERSHIP:
			elements = membershipElementGeneration(gameplay, task, facts, roomtype);
			break;
		default:
			break;
		}
		
		return elements;
	}
	
	public List<QuestionedFactStatement> generateStatement(List<QuestionedFact> facts, RoomType roomtype) {
		List<QuestionedFactStatement> statements = new ArrayList<>();
		for (QuestionedFact questionedFact : facts) {
			statements.add(buildStatment(questionedFact, questionedFact.getQuestionablefact(), roomtype));
		}
		
		return statements;
	}

	
	private List<PositionedElement> completion1ElementGeneration(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomType){
		List<Position> positionsOccupied = new ArrayList<>();
		List<PositionedElement> elements = new ArrayList<>();
		int chosenPosIndex;
		VerificationValues chosenValue;
		if(task.getResponseModality() instanceof MultipleChoice) {
			MultipleChoice mc = ((MultipleChoice) task.getResponseModality());
			for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
				if(isElementForAnswers(qelement)) {
					List<Integer> propositions = Shuffle.shufflePropositions(((MTQeFCompletion1) facts.get(0)).getPropositions()); //buildListOfPropositions((MTQeFCompletion1) facts.get(0));
					for (int i = 0; i < mc.getNbChoices(); i++) {
						chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
						positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						if(propositions.get(i) == ((MTQFCompletion1) ((MTQeFCompletion1) facts.get(0)).getQuestionablefact()).getSoluce()) {
							chosenValue = VerificationValues.CORRECT;
						} else {
							chosenValue = VerificationValues.INCORRECT;
						}
						PositionedElement posElem = buildPosElement(qelement.getAbility(), roomType, 
								roomType.getElementPositions().get(chosenPosIndex), propositions.get(i).toString(), chosenValue);
						elements.add(posElem);

					}
				} else {
					if(!qelement.getAbility().getName().equals("VERIFICATOR")) { // TODO : a ajouter quelque part au modèle
						chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
						positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(chosenPosIndex)));
					}
					
				}
			}
		} else {
			for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
				elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(random.nextInt(roomType.getElementPositions().size())), ((MTQFCompletion1) ((MTQeFCompletion1) facts.get(0)).getQuestionablefact()).getSoluce()));				
			}
		}
		
		return elements;
	}
	
	private List<PositionedElement> completion2ElementGeneration(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomType){
		List<Position> positionsOccupied = new ArrayList<>();
		List<PositionedElement> elements = new ArrayList<>();
		int chosenPosIndex;
		VerificationValues chosenValue;
		MultipleChoice mc = ((MultipleChoice) task.getResponseModality());
		
		for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
			if(isElementForAnswers(qelement)) {
				List<Integer> propositions = Shuffle.shufflePropositions(((MTQeFCompletion2) facts.get(0)).getPropositions());//buildListOfPropositions((MTQeFCompletion2) facts.get(0));
				for (int i = 0; i < mc.getNbChoices(); i++) {
						chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
						positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						
						if(isComp2Solution((MTQFCompletion2)((MTQeFCompletion2) facts.get(0)).getQuestionablefact(), propositions.get(i))) {
							chosenValue = VerificationValues.CORRECT;
						} else {
							chosenValue = VerificationValues.INCORRECT;
						}
						elements.add(buildPosElement(qelement.getAbility(), roomType, 
								roomType.getElementPositions().get(chosenPosIndex), propositions.get(i).toString(), chosenValue));

					}
				} else {
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
					elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(chosenPosIndex)));
				}
			}
		
		return elements;
	}
	
	private List<PositionedElement> rebuildElementGeneration(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomType){
		List<Position> positionsOccupied = new ArrayList<>();
		List<PositionedElement> elements = new ArrayList<>();
		int chosenPosIndex;
		VerificationValues chosenValue;
		MultipleChoice mc = ((MultipleChoice) task.getResponseModality());
		
		for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
			if(isElementForAnswers(qelement)) {
				List<Integer> propositions = Shuffle.shufflePropositions(((MTQeFRebuild) facts.get(0)).getPropositions()); //buildListOfPropositions((MTQeFRebuild) facts.get(0));
				System.out.println(propositions);	
				for (int i = 0; i < mc.getNbChoices(); i++) {
						chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
						positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						
						if(isRebSolution((MTQFRebuild)((MTQeFRebuild) facts.get(0)).getQuestionablefact(), propositions.get(i))) {
							chosenValue = VerificationValues.CORRECT;
						} else {
							chosenValue = VerificationValues.INCORRECT;
						}
						elements.add(buildPosElement(qelement.getAbility(), roomType, 
								roomType.getElementPositions().get(chosenPosIndex), propositions.get(i).toString(), chosenValue));

					}
				} else {
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
					elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(chosenPosIndex)));
				}
			}
		
		return elements;
	}
	
	private List<PositionedElement> membershipElementGeneration(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomType){
		List<Position> positionsOccupied = new ArrayList<>();
		List<PositionedElement> elements = new ArrayList<>();
		int chosenPosIndex;
		VerificationValues chosenValue;
		MultipleChoice mc = ((MultipleChoice) task.getResponseModality());
		
		for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
			if(isElementForAnswers(qelement)) {
				List<Integer> propositions = buildListOfPropositions((MTQeFMembership) facts.get(0));
					
				for (int i = 0; i < mc.getNbChoices(); i++) {
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						
					if(isMembSolution((MTQFMembership)((MTQeFMembership) facts.get(0)).getQuestionablefact(), propositions.get(i))) {
						chosenValue = VerificationValues.CORRECT;
					} else {
						chosenValue = VerificationValues.INCORRECT;
					}
					PositionedElement posElem = buildPosElement(qelement.getAbility(), roomType, 
							roomType.getElementPositions().get(chosenPosIndex), propositions.get(i).toString(), chosenValue);
					elements.add(posElem);

				}
			} else {
				if(!qelement.getAbility().getName().equals("VERIFICATOR")) { // TODO : a ajouter quelque part au modèle
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
					elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(chosenPosIndex)));
				}
			}
		}
		
		return elements;
	}
	
	/*private List<PositionedElement> buildStructure(StructureElement struct, RoomType roomType) {
		PositionedElement structElem = new PositionedElementImpl();
		structElem.setID("PE"+nbPositionedElement);
		structElem.setPosition(getAllowedStructurePositionGameplay(roomType));
		List<>
		for (CoreElement coreE : struct.getElements()) {
			PositionedElement 
		}
		
		
	}*/
	
	private List<PositionedElement> identificationElementGeneration(Gameplay gameplay, ATask task, List<QuestionedFact> facts, RoomType roomType){
		List<PositionedElement> elements = new ArrayList<>();
		List<Position> positionsOccupied = new ArrayList<>();

		if(gameplay.getType().equals(GPType.UNIQUE)) {
			int chosenPosIndex;
		
			for (QuantifiedElements qelement : gameplay.getQuantifiedElements()) {
				if(isElementForAnswers(qelement)) {
					System.out.println("AQUI");
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
					
					MTQFIdentification qfact = ((MTQFIdentification) ((MTQeFIdentification) facts.get(0)).getQuestionablefact());//.isSoluce()? 
					
					PositionedElement posElem = buildPosElement(qelement.getAbility(), roomType, 
							roomType.getElementPositions().get(chosenPosIndex), true+"", qfact.isSoluce()? VerificationValues.CORRECT: VerificationValues.INCORRECT);
					elements.add(posElem);
					
					chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
					positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
					posElem = buildPosElement(qelement.getAbility(), roomType, 
							roomType.getElementPositions().get(chosenPosIndex), false+"", qfact.isSoluce()? VerificationValues.INCORRECT: VerificationValues.CORRECT);
					elements.add(posElem);
				} else {
					if(!qelement.getAbility().getName().equals("VERIFICATOR")) { // TODO : a ajouter quelque part au modèle
						chosenPosIndex = chooseElementPositionIndex(positionsOccupied, roomType);
						positionsOccupied.add(roomType.getElementPositions().get(chosenPosIndex));
						elements.add(buildPosElement(qelement.getAbility(), roomType, roomType.getElementPositions().get(chosenPosIndex)));
					}
				}
			}
			
		} else {
			System.err.println("NOT DEALT WITH YET");
		}
		
		
		
		return elements;
	}
	
	/*private APosition getAllowedStructurePositionGameplay(RoomType rt) {
		if(rt.getStructurePositions().isEmpty()) {
			System.err.println("Wrong room type");
			return null;
		} else {
			return (APosition) rt.getStructurePositions().get(random.nextInt(rt.getStructurePositions().size()));
		}
	}*/
	
	
	private boolean isElementForAnswers(QuantifiedElements qelement) {
		return !qelement.getAbility().getCategory().equals(ElementCategory.DECORATIVE);
	}
	
	private boolean isComp2Solution(MTQFCompletion2 qFact, int proposition) {
		return qFact.getSoluceLeft() == proposition || qFact.getSoluceRight() == proposition || qFact.getSoluceRes() == proposition;
	}
	
	private boolean isRebSolution(MTQFRebuild qFact, int proposition) {
		return qFact.getSoluceLeft() == proposition || qFact.getSoluceRight() == proposition || qFact.getSoluceRes() == proposition;
	}
	
	private boolean isMembSolution(MTQFMembership qFact, int proposition) {
		return qFact.getGoodResults().contains(proposition);
	}
	
	/*private List<Integer> buildListOfPropositions(MTQeFCompletion1 qefact){
		List<Integer> propositions = new ArrayList<>();
		//propositions.add(((MTQFCompletion1) qefact.getQuestionablefact()).getSoluce());
		propositions.addAll(qefact.getPropositions());
		//Collections.shuffle(propositions);
		propositions = Shuffle.shufflePropositions(propositions);
		return propositions;
	}
	
	private List<Integer> buildListOfPropositions(MTQeFRebuild qefact){
		List<Integer> propositions = new ArrayList<>();
		if(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceLeft() != -1) {
			propositions.add(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceLeft());
		}
		if(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceRight() != -1) {
			propositions.add(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceRight());
		}
		if(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceRes() != -1) {
			propositions.add(((MTQFRebuild) qefact.getQuestionablefact()).getSoluceRes());
		}		
		propositions.addAll(qefact.getPropositions());
		Collections.shuffle(propositions);
		return propositions;
	}
	
	private List<Integer> buildListOfPropositions(MTQeFCompletion2 qefact){
		List<Integer> propositions = new ArrayList<>();
		if(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceLeft() != -1) {
			propositions.add(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceLeft());
		}
		if(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceRight() != -1) {
			propositions.add(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceRight());
		}
		if(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceRes() != -1) {
			propositions.add(((MTQFCompletion2) qefact.getQuestionablefact()).getSoluceRes());
		}		
		propositions.addAll(qefact.getPropositions());
		Collections.shuffle(propositions);
		return propositions;
	}*/
	
	private List<Integer> buildListOfPropositions(MTQeFMembership qefact){
		List<Integer> propositions = new ArrayList<>();
		propositions.addAll(((MTQFMembership) qefact.getQuestionablefact()).getGoodResults());
		propositions.addAll(qefact.getBadPropositions());
		Collections.shuffle(propositions);
		return propositions;
	}
	
	private int chooseElementPositionIndex(List<Position> positionsOccupied, RoomType roomType) {
		int chosenPosIndex;
		do {
			chosenPosIndex = random.nextInt(roomType.getElementPositions().size());
		} while(positionsOccupied.contains(roomType.getElementPositions().get(chosenPosIndex)));
		return chosenPosIndex;
	}
	
	private PositionedElement buildPosElement(Ability ability, RoomType roomType, Position position) {
		return buildPosElement(ability, roomType, position, "", null);
	}
	
	private PositionedElement buildPosElement(Ability ability, RoomType roomType, Position position, String proposition, VerificationValues isCorrect) {
		PositionedElement posElem = new PositionedElementImpl();
		CoreElement coreElem = getCoreElement(ability);
		posElem.setElement(coreElem);
		posElem.setID("PE"+nbPositionedElement);
		nbPositionedElement++;
		
		if(!proposition.isEmpty() && isCorrect != null) {
			Display display = new DisplayImpl();
			display.setValue(proposition+"");
			posElem.setDisplay(display);
			Correctness correctness = new CorrectnessImpl();
			correctness.setValue(isCorrect);
			posElem.setCorrectness(correctness);
		}

		posElem.setPosition(position);
		return posElem;
	}
	
	private PositionedElement buildPosElement(Ability ability, RoomType roomType, Position position, int correctAnswer) {
		PositionedElement posElem = new PositionedElementImpl();
		CoreElement coreElem = getCoreElement(ability);
		posElem.setElement(coreElem);
		
		posElem.setID("PE"+nbPositionedElement);
		nbPositionedElement++;

		if(correctAnswer != -1) {
			WantedAnswer correct = new WantedAnswerImpl();
			correct.setValue(correctAnswer+"");
			posElem.setWantedAnswer(correct);
		}
	
		posElem.setPosition(position);
		return posElem;
	}
	
	private CoreElement getCoreElement(Ability ability) {
		CoreElement coreElem = null; 
		int i = 0;
		while(coreElem == null && i < gameDescription.getElements().getGameplayElements().getElements().size()) {
			if(gameDescription.getElements().getGameplayElements().getElements().get(i).getAbility().equals(ability)) {
				coreElem = gameDescription.getElements().getGameplayElements().getElements().get(i);
			}
			i++;
		}
		
		return coreElem;
	}
	
	
	private QuestionedFactStatement buildStatment(QuestionedFact questionedFact, QuestionableFact fact, RoomType roomType) {
		QuestionedFactStatement statement = new QuestionedFactStatementImpl();
		
		Display display = new DisplayImpl();
		display.setValue(fact.getQuestionableFact());
		statement.setDisplay(display);
		statement.setPosition(roomType.getStatementPositions().get(random.nextInt(roomType.getStatementPositions().size())));
		statement.setQuestionedFact(questionedFact);
		statement.setID("STATE"+nbPositionedElement);
		
		if(!(questionedFact instanceof MTQeFIdentification || questionedFact instanceof MTQeFMembership)) {
			statement.setType(StatementType.TEXTUAL_INTERACTIVE);
		}
		
		return statement;
	}
}
