package flattener;

import java.nio.file.FileSystems;

public class Main {

	//private static String PROJECT_PATH = FileSystems.getDefault().getPath("").toAbsolutePath().getParent().toString() + "/TransformationFlattener/";
	
	public static void main(String[] args) {

		/*String mmPathIN = "models/generator.ecore";
		String mmPathOUT = "models/FlattenDungeon.ecore";
		String modelIN = "models2transform/";
		String modelOUT = "transformedModels/"; 
		
		transformModel(mmPathIN, mmPathOUT, modelIN+"DungeonTESTSL.xmi", modelOUT+"DungeonTESTSL.xml");
		transformModel(mmPathIN, mmPathOUT, modelIN+"DungeonTESTS.xmi", modelOUT+"DungeonTESTS.xml");*/
		//transformModels(mmPathIN, mmPathOUT, modelIN+"GeneratedDungeon", modelOUT+"DungeonFlat", 0, 10);
	}
		
	/*public static void transformModel(String PROJECT_PATH, String mmPathIN, String mmPathOUT, String modelIN, String modelOUT) {
		System.out.println("begin "+modelIN+" => "+modelOUT);
		try {
			new Util().generateFlateScenario(PROJECT_PATH, modelIN, mmPathIN, modelOUT, mmPathOUT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end "+modelIN+" => "+modelOUT);
	}*/
	
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
	
	/*public static void transformModel(String ECORE_PATH, String FLATNER_PATH, String modelPath, String modelIN, String modelOUT) {
		System.out.println("begin "+modelPath+modelIN+" => "+modelOUT);
		try {
			new Util().generateFlateScenario(FLATNER_PATH, modelPath+modelIN, 
					ECORE_PATH + "generator.ecore", 
					modelPath+modelOUT, ECORE_PATH + "FlattenDungeon.ecore");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end "+modelPath+modelIN+" => "+modelOUT);
	}*/
	
	/**
	 * 
	 * @param mmPathIN
	 * @param mmPathOUT
	 * @param modelIN name of the entry file without number or extension (if file is called GenerateX.xmi, X being an enter in [min,max], modelIN = Generate)
	 * @param modelOUT
	 * @param min
	 * @param max
	 */
	/*public static void transformModels(String mmPathIN, String mmPathOUT, String modelIN, String modelOUT, int min, int max) {
		for(int i = min; i < max; i++) {
			transformModel(mmPathIN, mmPathOUT, modelIN+i+".xmi", modelOUT+i+".xml");
		}	
	}*/

}
