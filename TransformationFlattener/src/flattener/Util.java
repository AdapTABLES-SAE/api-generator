package flattener;
import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;

public class Util {

	public void generateFlateScenario(String PROJECT_PATH, String modelIN, String mmPathIN, String modelOUT, String mmPathOUT)
			throws Exception {
		EtlModule etl = new EtlModule();
		EmfModel source = createEmfModel("IN", modelIN, mmPathIN, true, false);
		EmfModel target = createEmfModel("OUT", modelOUT, mmPathOUT, false, true);

		etl.parse(new File(PROJECT_PATH + "flattener\\dungeonFlat.etl"));
		if (etl.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : etl.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		etl.getContext().getModelRepository().addModel(source);
		etl.getContext().getModelRepository().addModel(target);
		etl.execute();
		etl.getContext().getModelRepository().dispose();
		etl.getContext().dispose();

	}

	protected EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		getFile(metamodel);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFile(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFile(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFile(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected File getFile(String fileName) throws URISyntaxException {
		return new File(fileName);
	}

}
