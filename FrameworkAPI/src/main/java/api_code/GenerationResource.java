package api_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import exceptions.NonExistantLearnerPlayerException;
import flattener.Main;
import generators.ALGAGenerator;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiResponse;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

/**
 * Path : http://localhost:8080/FrameworkAPI/rest/generator?ID=blemoine
 * @author Bérénice LEMOINE
 */

@Path("/generator")
@Produces(MediaType.TEXT_XML)
public class GenerationResource {
	
	/*
	 * Deployed File Path : 
	 * C:\apache-tomcat-10.1.5\wtpwebapps\FrameworkAPI\
	 * OLD = C:\blemoine\TheseGenerator\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FrameworkAPI
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
	@GET
	@Path("/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(null, learnerID, app);
	}
	
	@GET
	@Path("/{classID}/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(classID, learnerID, app);
	}
	
	private String generateDungeon2String(String classroomID, String learnerID, ServletContext app) throws NonExistantLearnerPlayerException {
		Constant.PROJECT_PATH = app.getRealPath("");
		System.out.println("Project : "+Constant.PROJECT_PATH);
		
		generateDungeon(classroomID, learnerID);
		File xmlFile = new File(Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH + "/DungeonGen_"+ learnerID +".xml");
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
	/**
	 * @throws NonExistantLearnerPlayerException *********************************/
	
	private void generateDungeon(String classroomID, String learnerPlayerID) throws NonExistantLearnerPlayerException {
		String contextFile = Constant.CONTEXTS_FILES_PATH + Constant.CONTEXTS_FILES_PREFIX + 
				(classroomID == null? Constant.DEFAULT_CONTEXT_FILE_NAME : classroomID) + ".xmi";
		ALGAGenerator generator = new ALGAGenerator(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH, 
				Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH, 
				contextFile, learnerPlayerID, true); 
		generator.generate();
		generator.saveDungeon("DungeonGen_"+ learnerPlayerID +".xmi");
		Main.transformModel(Constant.PROJECT_PATH + Constant.ECORE_PATH, Constant.PROJECT_PATH + Constant.FLATNER_PATH, Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xmi", Constant.PROJECT_PATH + Constant.OUTPUT_MODELS_PATH + "DungeonGen_"+ learnerPlayerID +".xml");
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
