package api_code;

import java.nio.file.FileSystems;

//import java.nio.file.FileSystems;

public class Paths {

	/*public static final String ALL_PROJECT_PATH = 
			FileSystems.getDefault().getPath("").toAbsolutePath().getParent().toString();*/

	public static final String PROJECT_PATH = 
			FileSystems.getDefault().getPath("").toAbsolutePath().toString(); //"C:/blemoine/TheseGenerator/gen1/FrameworkAPI/";
	public static final String INPUT_MODELS_PATH = PROJECT_PATH + "models/inputmodels/";
	public static final String OUTPUT_MODELS_PATH = PROJECT_PATH + "models/";
	public static final String CONTEXTS_FILES_SHORT_PATHS = "contextsByLP/Context_";
	
	public static void main(String[] args) {
		System.out.println(PROJECT_PATH);
	}
}
