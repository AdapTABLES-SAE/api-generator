package objectif_tests;

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
	
	@Test
	void profilCE2ContainsRightObjectives() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_RM_Init.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
        assertTrue("O2", dungeonsContainsDungeonWithObjectiveLevel("REC-O2-N1"));
        assertTrue("O3", dungeonsContainsDungeonWithObjectiveLevel("REC-O3-N1"));
        assertTrue("O4", dungeonsContainsDungeonWithObjectiveLevel("REC-O4-N1"));
        assertTrue("O5", dungeonsContainsDungeonWithObjectiveLevel("REC-O5-N1"));
        assertFalse("O6", dungeonsContainsDungeonWithObjectiveLevel("REC-O6-N1"));
        assertFalse("O1N1", dungeonsContainsDungeonWithObjectiveLevel("REC-O1-N1"));
        assertFalse("O1N2", dungeonsContainsDungeonWithObjectiveLevel("REC-O1-N2"));
	}
	
	@Test
	void profilCE1ContainsRightObjectives() {
		ALGAGenerator generator = new ALGAGenerator("learnerProfils/LP_IM_Init.xmi"); 
		for (int i = 0; i < 30; i++) {
			dungeons.add(generator.generate());
		}
        //assertTrue("OX", dungeonsContainsDungeonWithObjectiveLevel("ICM-OX-NX"));
        //assertTrue("OXNX", dungeonsContainsDungeonWithObjectiveLevel("ICM-OX-NX"));
	}

	private boolean dungeonsContainsDungeonWithObjectiveLevel(String objLevel) {
		boolean present = false;
		for (Dungeon dungeon : dungeons) {
			if(dungeon.getLevel().getID().equals(objLevel)) {
				present = true;
			}
		}
		return present;
	}
}
