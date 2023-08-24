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
 * Paths : 
 * 	- http://localhost:8080/FrameworkAPI/generator/classroom/(classroomID)/learner/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/generator/(learnerID) => default classroom is used in this case
 * 
 * Resource that generates for an existent learner-player a dungeon corresponding to his/her progression. 
 * @author Bérénice LEMOINE
 */

@Path("/generator")
@Produces(MediaType.TEXT_XML)
public class GenerationResource {
	
	/*
	 * Deployed File Path : 
	 * C:\apache-tomcat-10.1.5\wtpwebapps\FrameworkAPI\
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
	@GET
	@Path("/learner/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(null, learnerID, app);
	}
	
	@GET
	@Path("/classroom/{classID}/learner/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(classID, learnerID, app);
	}
	
	/**
	 * Loads and serialize an XML file representing a dungeon for a given learner of a given classroom. 
	 * @param classroomID
	 * @param learnerID
	 * @param app
	 * @return A XML file as a String describing a dungeon.  
	 * @throws NonExistantLearnerPlayerException
	 */
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
	/***********************************/
	
	/**
	 * Generates a dungeon for a learner (learnerPlayerID) of a given classroom (classroomID) as an XML file.  
	 * @param classroomID
	 * @param learnerPlayerID
	 * @throws NonExistantLearnerPlayerException
	 */
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
}
