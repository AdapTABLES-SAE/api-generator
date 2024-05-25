package api_code;

import generator.Classroom;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import managers.Constant;
import structures.DidacticDomain;

/**
 * Paths : - http://localhost:8080/FrameworkAPI/login/(classroomID)/(learnerID)
 * - http://localhost:8080/FrameworkAPI/login/(learnerID) => default classroom
 * is used in this case
 * 
 * Resource that checks if a learner-player exists based on his/her id.
 * 
 * @author Bérénice LEMOINE
 */

@Path("/login")
public class LoginResource {

	/*
	 * Deployed File Path :
	 * C:\blemoine\TheseGenerator\.metadata\.plugins\org.eclipse.wst.server.core\
	 * tmp0\wtpwebapps\FrameworkAPI Warning ! Models are modified on the deployed
	 * repository and not in the eclipse one !
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/learner/{learnerID}")
	public String learnerLogin(@PathParam("learnerID") String learnerID, @Context ServletContext app) {
		Constant.PROJECT_PATH = app.getRealPath("");
		Constant.changeDomains(DidacticDomain.MATHEMATICS);
		Classroom classroom = Constant.getClassroom(Constant.DEFAULT_CLASSROOM_NAME);
		return (classroom == null) || !Constant.doesLearnerBelongsToClassroom(classroom, learnerID) ? "KO" : "OK";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/classroom/{classID}/learner/{learnerID}")
	public String learnerLogin(@PathParam("classID") String classID, @PathParam("learnerID") String learnerID,
			@Context ServletContext app) {
		Constant.PROJECT_PATH = app.getRealPath("");
		Classroom classroom = Constant.getClassroom(classID);
		return (classroom == null) || !Constant.doesLearnerBelongsToClassroom(classroom, learnerID) ? "KO" : "OK";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/teacher/{teacherID}")
	public String teacherLogin(@PathParam("teacherID") String teacherID, @Context ServletContext app) {
		Constant.PROJECT_PATH = app.getRealPath("");
		return Constant.getTeacher(teacherID) == null ? "KO" : "OK";
	}

	// HG

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/learnerhg/{learnerID}")
	public String learnerLoginHG(@PathParam("learnerID") String learnerID, @Context ServletContext app) {
		Constant.PROJECT_PATH = app.getRealPath("");
		Constant.changeDomains(DidacticDomain.HISTORY_GEOGRAPHY);
		Classroom classroom = Constant.getClassroom(Constant.DEFAULT_CLASSROOM_NAME);
		return (classroom == null) || !Constant.doesLearnerBelongsToClassroom(classroom, learnerID) ? "KO" : "OK";
	}

}
