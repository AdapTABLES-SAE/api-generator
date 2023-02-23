package api_code;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/learnerPlayerManager")
public class LearnerPlayerManagerResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addingLearnerPlayerResults(String jsonContent) { 
		
		
		return "TOTO";
	}
}
