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
//@Api(value="/Generator")
//@SwaggerDefinition(tags= {@Tag(name="Generator", description="REST end point generator")})
@Path("/")
@Produces(MediaType.TEXT_XML)
public class HomeRessource {

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
