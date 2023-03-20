package edu_facts_maths_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import generator.ATask;
import generator.Dungeon;
import generator.EnterResponse;
import generator.MTCompletion1;
import generator.MTCompletion2;
import generator.MTMembership;
import generator.MTQFMembership;
import generator.MTQeFCompletion1;
import generator.MTQeFCompletion2;
import generator.MTQeFMembership;
import generator.MTQeFRebuild;
import generator.MTRecontruction;
import generator.MultipleChoice;
import generator.QuestionedFact;
import generator.Room;
import generators.ALGAGenerator;
import structures.EMTQeFactClass;

class MTQuestionedFactTest {
	
	private ALGAGenerator generator;
	
	@BeforeEach
	void init() {
		generator = new ALGAGenerator("learnerProfils/LP_FIC_Init.xmi");
	}
	
	@Test
	void multipleDungeonQuestionedFactAreWellFormed() {
		for (int i = 0; i < 30; i++) {
			questionedFactsAreWellFormed(generator.generate());
		}
	}

	void questionedFactsAreWellFormed(Dungeon dungeon) {
		for (Room room : dungeon.getRooms()) {
			if(!room.getQuestionedFacts().isEmpty()) {
				for (QuestionedFact qf : room.getQuestionedFacts()) {
					System.out.println(qf.getQuestionablefact().getQuestionableFact());
					assertTrue(checkQuestionedFact(qf, dungeon), qf.getQuestionablefact().getQuestionableFact());
				}
			}
		}
	}
	
	boolean checkQuestionedFact(QuestionedFact qfact, Dungeon dungeon) {
		boolean validResponse, hasMissingElem;
		switch (EMTQeFactClass.valueOf(qfact.getClass().getSimpleName())) {
		case MTQeFCompletion1Impl:
			boolean enter = ((MTQeFCompletion1) qfact).getPropositions().isEmpty();
			boolean validNbChoice;
			for (ATask task : dungeon.getLevel().getTasks()) {
				validResponse = (task.getResponseModality() instanceof EnterResponse && enter) ||
						(task.getResponseModality() instanceof MultipleChoice && !enter);
				validNbChoice = task.getResponseModality() instanceof MultipleChoice? 
						(((MTQeFCompletion1) qfact).getPropositions().size() == 
						((MultipleChoice) task.getResponseModality()).getNbChoices()) : true;
				hasMissingElem = StringUtils.countMatches(qfact.getCompleteFact(), "?") == 1;
				if(task instanceof MTCompletion1 && validResponse && validNbChoice && hasMissingElem) {
					return true; 
				}
			}
			
			break;
		case MTQeFCompletion2Impl:
			for (ATask task : dungeon.getLevel().getTasks()) {
				validNbChoice = task.getResponseModality() instanceof MultipleChoice? 
						(((MTQeFCompletion2) qfact).getPropositions().size() == 
						((MultipleChoice) task.getResponseModality()).getNbChoices()) : true;
				hasMissingElem = StringUtils.countMatches(qfact.getCompleteFact(), "?") == 2;
				if(task instanceof MTCompletion2 && validNbChoice && hasMissingElem) {
					return true; 
				}
			}
			break;
		case MTQeFRebuildImpl:
			for (ATask task : dungeon.getLevel().getTasks()) {
				validNbChoice = task.getResponseModality() instanceof MultipleChoice? 
						(((MTQeFRebuild) qfact).getPropositions().size() == 
						((MultipleChoice) task.getResponseModality()).getNbChoices()) : true;
				hasMissingElem = StringUtils.countMatches(qfact.getCompleteFact(), "?") == 3;
				if(task instanceof MTRecontruction && validNbChoice && hasMissingElem) {
					return true; 
				}
			}
			break;
		case MTQeFMembershipImpl:
			MTQeFMembership membF = (MTQeFMembership) qfact;
			for (ATask task : dungeon.getLevel().getTasks()) {
				int nbProp = membF.getBadPropositions().size() + 
						((MTQFMembership) membF.getQuestionablefact()).getGoodResults().size();
				validNbChoice = task.getResponseModality() instanceof MultipleChoice? 
						(nbProp == ((MultipleChoice) task.getResponseModality()).getNbChoices()) : true;
				if(task instanceof MTMembership && validNbChoice) {
					return true; 
				}
			}
			break;

		case MTQeFIdentificationImpl:
			return true;
		}
		return false;
	}

}
