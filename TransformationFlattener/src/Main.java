
public class Main {

	public static void main(String[] args) {

		String mmPathIN = "models/generator.ecore";
		String mmPathOUT = "models/FlattenDungeon.ecore";
		String modelIN = "models/GeneratedDungeon.xmi";
		String modelOUT = "models/DungeonFlat.xml";
		
		System.out.println("begin");
		try {
			new Util().generateFlateScenario(modelIN, mmPathIN, modelOUT, mmPathOUT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
		
	
	}

}
