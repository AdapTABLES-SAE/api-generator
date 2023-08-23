package api_code;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Path :  C:\apache-tomcat-10.1.5\wtpwebapps\FrameworkAPI\
 * 
 * @author Bérénice LEMOINE
 */
@Path("/")
@Produces(MediaType.TEXT_XML)
public class HomeRessource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String presentation() {
		String s = "<!doctype html><html ng-app=\"demo\">"
		   + "<head>"
		   + "<title>Framework API</title>"
		   + "</head>"
		   + "<body>"
		   + "<h1>Generator Methods & Attributes </h1>"
		   + "ID is the first letter of the learner-player name followed by its last name <br/>"
		   + "Example : Jane Doe => jdoe<br/>"
		   + "The url gives : http://localhost:8080/FrameworkAPI/rest/generator/jdoe"
		   + "</body><br/>"
		   + "</html><br/>";
		return s;
	}
	
}
