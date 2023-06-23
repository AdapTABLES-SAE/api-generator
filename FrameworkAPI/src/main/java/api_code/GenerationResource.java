package api_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import flattener.Main;
import generators.ALGAGenerator;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

/**
 * Path : http://localhost:8080/FrameworkAPI/rest/generator?ID=blemoine
 * @author Bérénice LEMOINE
 */

@Path("/generator")
public class GenerationResource {
	
	/*
	 * Deployed File Path : C:\blemoine\TheseGenerator\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FrameworkAPI
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
		
	@GET
	@Produces(MediaType.TEXT_XML)
	public String generate(@QueryParam("ID") String learnerID, @Context ServletContext app) {  
	
		//app.log(app.getContextPath());
		Paths.PROJECT_PATH = app.getRealPath("");
		System.out.println("Project : "+Paths.PROJECT_PATH);
		
		generateDungeon(learnerID);
		File xmlFile = new File(Paths.PROJECT_PATH + Paths.OUTPUT_MODELS_PATH + "/DungeonGen_"+ learnerID +".xml");
		Reader fileReader;
		StringBuilder sb = new StringBuilder();
		System.out.println("Dungeon XML : "+xmlFile.getAbsolutePath());
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
		ALGAGenerator generator = new ALGAGenerator(Paths.PROJECT_PATH + Paths.INPUT_MODELS_PATH, 
				Paths.PROJECT_PATH + Paths.OUTPUT_MODELS_PATH, 
				Paths.CONTEXTS_FILES_SHORT_PATHS + learnerPlayerID + ".xmi", true);
		generator.generate();
		generator.saveDungeon("DungeonGen_"+ learnerPlayerID +".xmi");
		Main.transformModel(Paths.PROJECT_PATH + Paths.ECORE_PATH, Paths.PROJECT_PATH + Paths.FLATNER_PATH, Paths.PROJECT_PATH + Paths.OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xmi", Paths.PROJECT_PATH + Paths.OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xml");
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
