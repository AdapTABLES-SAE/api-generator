package api_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import flattener.Main;
import generators.ALGAGenerator;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/**
 * Path : http://localhost:8080/FrameworkAPI/rest/generator?ID=blemoine
 * @author Bérénice LEMOINE
 */

@Path("/generator")
public class GenerationResource {

	private static final String WORKSPACE_PATH = "C:/blemoine/TheseGenerator/gen1/FrameworkAPI/";
	
	private static final String INPUT_MODELS_PATH = WORKSPACE_PATH + "models/inputmodels/";
	private static final String OUTPUT_MODELS_PATH = WORKSPACE_PATH + "models/";
	private static final String CONTEXTS_FILES_PATHS = "contextsByLP/Context_";
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String generate(@QueryParam("ID") String learnerID) { // 
		generateDungeon(learnerID);
		File xmlFile = new File(OUTPUT_MODELS_PATH + "/DungeonGen_"+ learnerID +".xml");
		Reader fileReader;
		StringBuilder sb = new StringBuilder();
		System.out.println(xmlFile.getAbsolutePath());
		try {
			fileReader = new FileReader(xmlFile);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String line = bufReader.readLine();
			while( line != null){
				sb.append(line).append("\n");
				line = bufReader.readLine();
			}
			bufReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return sb.toString();
	}
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
	private void generateDungeon(String learnerPlayerID) {
		System.out.println(INPUT_MODELS_PATH);
		ALGAGenerator generator = new ALGAGenerator(INPUT_MODELS_PATH, OUTPUT_MODELS_PATH, CONTEXTS_FILES_PATHS + learnerPlayerID + ".xmi");
		generator.generate();
		generator.printDungeon();
		generator.saveDungeon("DungeonGen_"+ learnerPlayerID +".xmi");
		Main.transformModel(OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xmi", OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xml");
	}
	
	/*@GET
	@Produces(MediaType.TEXT_HTML)
	public String presentation() {
		String s = "<!doctype html><html ng-app=\"demo\">"
		   + "<head>"
		   + "<title>Framework API</title>"
		   + "</head>"
		   + "<body>"
		   + "<h1>Generator Methods & Attributes </h1>"
		   + "ID is the first letter of the learner-player name followed by its last name <br/>"
		   + "Example : Jane Doe gives jdoe<br/>"
		   + "The url gives : http://localhost:8080/FrameworkAPI/rest/generator?ID=jdoe"
		   + "</body><br/>"
		   + "</html><br/>";
		return s;
	}*/
	
}
