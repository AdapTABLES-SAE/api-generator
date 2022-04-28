package highLevelGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import generatorMetamodels.CurrentProgression;
import generatorMetamodels.GeneratorMetamodelsFactory;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;
import generatorMetamodels.Knowledge;
import generatorMetamodels.LearnerPlayer;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.LearningPath;
import generatorMetamodels.Level;

public class GenericGenerator {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static String MODELS_PATH = "inputmodels/";
	private final static String[] INPUT_MODELS_PATHS = {"MathsKnowledge.xmi", "MathsLearningPath.xmi", "LearnerPlayerModel.xmi"};
	
	private Knowledge knowledge; 
	private LearningPath learningPath; 
	private LearnerPlayer learnerPlayer;
	
	private HighLevelActivity genericSelectedElements; 
	private ResourceSet resourceSet;
	
	public GenericGenerator() {
		resourceSet = new ResourceSetImpl();
	}
	
	public static void main(String[] args) {
		new GenericGenerator().start();
	}
	
	private void start() {
		loadInputModels();
		
		createRootGeneratedModel();
		selectLearningObjective();
		
		saveGeneratedModel("GenericElements.xmi"); 
	}
	
	private void selectLearningObjective() {
		int index = (int) (Math.random() * learningPath.getLearningobjectives().size());
		LearningObjective lo = learningPath.getLearningobjectives().get(index);
		CurrentProgression current = null;
		for (CurrentProgression cp: learnerPlayer.getLearningprofile().getCurrentprogressions()) {
			if(cp.getLearningobjective().equals(lo)) {
				current = cp;
			}
		}
		if(current == null) { 
			genericSelectedElements.setLevel(learningPath.getLearningobjectives().get(index).getLevels().get(0)); 
		} else {
			genericSelectedElements.setLevel(current.getLevel());
		}
		System.out.println(genericSelectedElements.getLevel().getID());
	}
	
 	private void createRootGeneratedModel() {
		genericSelectedElements = GeneratorMetamodelsFactory.eINSTANCE.createHighLevelActivity();
	}
	
	/**
	 * Save the generated model in a file named <outFileName>
	 * @param outFileName
	 */
	private void saveGeneratedModel(String outFileName) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("outputmodels/" + outFileName));
		resource.getContents().add(genericSelectedElements);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + MODELS_PATH + outFileName);
			e.printStackTrace();
		}
		
		LOGGER.info("Saving '" + outFileName + "' file : OK");
	}
	
	/**
	 * Load the input models for the generation process
	 */
	private void loadInputModels() {
		GeneratorMetamodelsPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File knowledgeModel = new File(MODELS_PATH + INPUT_MODELS_PATHS[0]);
		File learningModel = new File(MODELS_PATH + INPUT_MODELS_PATHS[1]);
		File learnerPlayerModel = new File(MODELS_PATH + INPUT_MODELS_PATHS[2]);

		Resource resource1 = resourceSet.createResource(URI.createFileURI(knowledgeModel.getAbsolutePath()));
		Resource resource2 = resourceSet.createResource(URI.createFileURI(learningModel.getAbsolutePath()));
		Resource resource3 = resourceSet.createResource(URI.createFileURI(learnerPlayerModel.getAbsolutePath()));

		try {
			resource1.load(null);
			resource2.load(null);
			resource3.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		knowledge = (Knowledge) resource1.getContents().get(0);
		learningPath = (LearningPath) resource2.getContents().get(0);
		learnerPlayer = (LearnerPlayer) resource3.getContents().get(0);
		
		LOGGER.info("Loading input models : OK");
	}
}
