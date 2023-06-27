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

@Path("/login")
public class LoginResource {
	
	/*
	 * Deployed File Path : C:\blemoine\TheseGenerator\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FrameworkAPI
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String generate(@QueryParam("ID") String learnerID, @Context ServletContext app) {  
		Paths.PROJECT_PATH = app.getRealPath("");
		return isContextModelExistant(Paths.CONTEXTS_FILES_SHORT_NAME + learnerID + ".xmi")? "OK" : "KO";
	}
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
	private boolean isContextModelExistant(String contextFileName) {
		String contextsRepertory = Paths.PROJECT_PATH + Paths.INPUT_MODELS_PATH + Paths.CONTEXTS_FILES_PATH; 
		File[] files = new File(contextsRepertory).listFiles();
		
		System.out.println(files);
		int i = 0;
		boolean exists = false;
		while(i < files.length && !exists) {
			if (files[i].isFile() && files[i].getName().equals(contextFileName)) {
				exists = true;
			}
			i++;
		}
		
		return exists;
	}
	
}
