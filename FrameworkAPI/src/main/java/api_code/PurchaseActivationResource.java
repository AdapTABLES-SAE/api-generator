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
 * 	- http://localhost:8080/FrameworkAPI/statistics/(classroomID)/(learnerID)
 * 	- http://localhost:8080/FrameworkAPI/statistics/(learnerID) => default classroom is used in this case
 * 
 * Resource that deals with learner-player items purchase and activation. 
 * @author Bérénice LEMOINE
 */

@Path("/store")
@Produces(MediaType.APPLICATION_JSON)
public class PurchaseActivationResource {
	
	/*
	 * Deployed File Path : 
	 * C:\apache-tomcat-10.1.5\wtpwebapps\FrameworkAPI\
	 * Warning ! Models are modified on the deployed repository and not in the eclipse one !  
	 */
	@GET
	@Path("/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String (@PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(null, learnerID, app);
	}
	
/*	@GET
	@Path("/{classID}/{learnerID}")
	@Produces(MediaType.TEXT_XML)
	public String generate(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID, @Context ServletContext app) throws NonExistantLearnerPlayerException {  
		return generateDungeon2String(classID, learnerID, app);
	}*/
	
	/***********************************/
	/**          JOB METHODS          **/
	/***********************************/
	
}
