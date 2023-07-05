package api_code;


import io.swagger.jaxrs.config.BeanConfig;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class SwaggerConfigurationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setBasePath("/FrameworkAPI");
		beanConfig.setHost("localhost:8080");
		beanConfig.setResourcePackage("api_code");
		beanConfig.setSchemes(new String[]{"http"});
		
		beanConfig.setTitle("Activity Generator API");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
	}
}
