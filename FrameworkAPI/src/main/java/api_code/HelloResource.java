package api_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Path : http://localhost:8080/FrameworkAPI/rest/hello
 * @author Bérénice LEMOINE
 */

@Path("/generate")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String generate() { // @QueryParam("learnerID") String learnerID
		File xmlFile = new File("C:/blemoine/TheseGenerator/gen1/Generator/outputmodels/tests/flatten/DungeonGen.xml");
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
	

	
}
