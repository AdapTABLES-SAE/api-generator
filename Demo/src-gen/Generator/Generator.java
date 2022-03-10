package Generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

import demo.DemoFactory;
import demo.DemoPackage;
import demo.GeneratedParameters;
import demo.LearningPath;

public class Generator {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private LearningPath domainRoot;
	private GeneratedParameters generatedRoot;

	private ResourceSet resSet;

	public Generator() {
		resSet = new ResourceSetImpl();
	}

	public static void main(String[] args) {

		new Generator().start();

	}

	private void start() {

		loadModels();

		createRootGenModel();

		selectObjective();

		saveGeneratedModel();

	}

	private void selectObjective() {
		int index = (int) (Math.random() * domainRoot.getLearningobjective().size());
		generatedRoot.setLearningobjective(domainRoot.getLearningobjective().get(index));
		
	}

	private void createRootGenModel() {
		generatedRoot = DemoFactory.eINSTANCE.createGeneratedParameters();
		// 
	}

	private void saveGeneratedModel() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		m.put("xmi", fact);
		m.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		String outFileName = "FirstGenModel.xmi";
		String path = "model/";
		Resource resource = resSet.createResource(URI.createURI(path + outFileName));

		resource.getContents().add(generatedRoot);

		try {
			resource.save(m);
		} catch (IOException e) {
			LOGGER.severe("Error when saving " + outFileName);
			e.printStackTrace();
			return;
		}
		LOGGER.info("Saving '" + outFileName + "' file : OK");
	}

	private void loadModels() {
		loadInputModels();

		LOGGER.info("Loading domain models : OK");
	}

	private void loadInputModels() {
		DemoPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		String path = "model/";

		File file = new File(path + "LearningPath.xmi");
		Resource r = resSet.createResource(URI.createFileURI(file.getAbsolutePath()));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resSet);
		domainRoot = (LearningPath) r.getContents().get(0);

	}

}
