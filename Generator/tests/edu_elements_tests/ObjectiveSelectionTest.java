package edu_elements_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import generator.Dungeon;
import generators.ALGAGenerator;

class ObjectiveSelectionTest {
	
	private List<Dungeon> dungeons;

	@BeforeEach
	public void init() {
    	dungeons = new ArrayList<>();
	}
	/*
	@Test
	void profilCE2ContainsRightObjectivesLinear() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
		profilCE2toAssert();
	}
	
	@Test
	void profilCE2ContainsRightObjectivesLabyrinthine() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init_Labyrinthine.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
		profilCE2toAssert();
	}
	
	private void profilCE2toAssert() {
        assertTrue("O2", dungeonsContainsDungeonWithObjectiveLevel("REC-O2-N1"));
        assertTrue("O3", dungeonsContainsDungeonWithObjectiveLevel("REC-O3-N1"));
        assertTrue("O4", dungeonsContainsDungeonWithObjectiveLevel("REC-O4-N1"));
        assertTrue("O5", dungeonsContainsDungeonWithObjectiveLevel("REC-O5-N1"));
        assertFalse("O6", dungeonsContainsDungeonWithObjectiveLevel("REC-O6-N1"));
        assertFalse("O1N1", dungeonsContainsDungeonWithObjectiveLevel("REC-O1-N1"));
        assertFalse("O1N2", dungeonsContainsDungeonWithObjectiveLevel("REC-O1-N2"));
	}
	
	@Test
	void profilCE1ContainsRightObjectivesLinear() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_IM_Init.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
		profilCE1toAssert();
	}
	
	@Test
	void profilCE1ContainsRightObjectivesLabyrinthine() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_IM_Init_Labyrinthine.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
		profilCE1toAssert();
	}
	
	private void profilCE1toAssert() {
		  assertTrue("O2/D5", dungeonsContainsDungeonWithObjectiveLevel("ICM-O4-N1"));
	        assertTrue("O3/A2", dungeonsContainsDungeonWithObjectiveLevel("ICM-O3-N1"));
	        assertFalse("O1N1/D2", dungeonsContainsDungeonWithObjectiveLevel("ICM-O1-N1"));
	        assertFalse("O1N2/D2", dungeonsContainsDungeonWithObjectiveLevel("ICM-O1-N2"));
	        assertFalse("O1N3/D2", dungeonsContainsDungeonWithObjectiveLevel("ICM-O1-N3"));
	        assertFalse("O2N1/D10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O2-N1"));
	        assertFalse("O2N2/D10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O2-N2"));
	        assertFalse("O2N3/D10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O2-N3"));
	        assertFalse("O5N1/D3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O5-N1"));
	        assertFalse("O5N2/D3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O5-N2"));
	        assertFalse("O5N3/D3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O5-N3"));
	        assertFalse("O6N1/D4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O6-N1"));
	        assertFalse("O6N2/D4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O6-N2"));
	        assertFalse("O6N3/D4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O6-N3"));
	        assertFalse("O7N1/A10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O7-N1"));
	        assertFalse("O7N2/A10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O7-N2"));
	        assertFalse("O7N3/A10", dungeonsContainsDungeonWithObjectiveLevel("ICM-O7-N3"));
	        assertFalse("O8N1/A5", dungeonsContainsDungeonWithObjectiveLevel("ICM-O8-N1"));
	        assertFalse("O8N2/A5", dungeonsContainsDungeonWithObjectiveLevel("ICM-O8-N2"));
	        assertFalse("O8N3/A5", dungeonsContainsDungeonWithObjectiveLevel("ICM-O8-N3"));
	        assertFalse("O9N1/A3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O9-N1"));
	        assertFalse("O9N2/A3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O9-N2"));
	        assertFalse("O9N3/A3", dungeonsContainsDungeonWithObjectiveLevel("ICM-O9-N3"));
	        assertFalse("O10N1/A4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O10-N1"));
	        assertFalse("O10N2/A4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O10-N2"));
	        assertFalse("O10N3/A4", dungeonsContainsDungeonWithObjectiveLevel("ICM-O10-N3"));
	        assertFalse("O11N1/M", dungeonsContainsDungeonWithObjectiveLevel("ICM-O11-N1"));
	        assertFalse("O11N2/M", dungeonsContainsDungeonWithObjectiveLevel("ICM-O11-N2"));
	}

	private boolean dungeonsContainsDungeonWithObjectiveLevel(String objLevel) {
		boolean present = false;
		for (Dungeon dungeon : dungeons) {
			if(dungeon.getLevel().getID().equals(objLevel)) {
				present = true;
			}
		}
		return present;
	}*/
}
