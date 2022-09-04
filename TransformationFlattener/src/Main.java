
public class Main {

	public static void main(String[] args) {

		String mmPathIN = "models/generator.ecore";
		String mmPathOUT = "models/FlattenDungeon.ecore";
		String modelIN = "models2transform/";
		String modelOUT = "transformedModels/"; 
		
		transformModel(mmPathIN, mmPathOUT, modelIN+"DungeonG2.xmi", modelOUT+"DungeonGen2.xml");
		//transformModel(mmPathIN, mmPathOUT, modelIN+"GeneratedDungeon.xmi", modelOUT+"DungeonFlat.xml");
		//transformModels(mmPathIN, mmPathOUT, modelIN+"GeneratedDungeon", modelOUT+"DungeonFlat", 0, 10);
	}
	
	public static void transformModel(String mmPathIN, String mmPathOUT, String modelIN, String modelOUT) {
		System.out.println("begin "+modelIN+" => "+modelOUT);
		try {
			new Util().generateFlateScenario(modelIN, mmPathIN, modelOUT, mmPathOUT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end "+modelIN+" => "+modelOUT);
	}
	
	/**
	 * 
	 * @param mmPathIN
	 * @param mmPathOUT
	 * @param modelIN name of the entry file without number or extension (if file is called GenerateX.xmi, X being an enter in [min,max], modelIN = Generate)
	 * @param modelOUT
	 * @param min
	 * @param max
	 */
	public static void transformModels(String mmPathIN, String mmPathOUT, String modelIN, String modelOUT, int min, int max) {
		for(int i = min; i < max; i++) {
			transformModel(mmPathIN, mmPathOUT, modelIN+i+".xmi", modelOUT+i+".xml");
		}	
	}

}
