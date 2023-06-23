package flattener;


public class Main {
	
	public static void main(String[] args) {

		/*String mmPathIN = "models/generator.ecore";
		String mmPathOUT = "models/FlattenDungeon.ecore";
		String modelIN = "models2transform/";
		String modelOUT = "transformedModels/"; 
		
		transformModel(mmPathIN, mmPathOUT, modelIN+"DungeonTESTSL.xmi", modelOUT+"DungeonTESTSL.xml");
		transformModel(mmPathIN, mmPathOUT, modelIN+"DungeonTESTS.xmi", modelOUT+"DungeonTESTS.xml");*/
		//transformModels(mmPathIN, mmPathOUT, modelIN+"GeneratedDungeon", modelOUT+"DungeonFlat", 0, 10);
	}
	
	public static void transformModel(String ECORE_PATH, String FLATNER_PATH, String modelIN, String modelOUT) {
		System.out.println("begin "+modelIN+" => "+modelOUT);
		try {
			new Util().generateFlateScenario(FLATNER_PATH, modelIN, 
					ECORE_PATH + "generator.ecore", 
					modelOUT, ECORE_PATH + "FlattenDungeon.ecore");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end "+modelIN+" => "+modelOUT);
	}

}
