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
import generatorMetamodels.GameDomain;
import generatorMetamodels.GeneratorMetamodelsFactory;
import generatorMetamodels.GeneratorMetamodelsPackage;
import generatorMetamodels.HighLevelActivity;
import generatorMetamodels.Knowledge;
import generatorMetamodels.LearnerPlayer;
import generatorMetamodels.LearningObjective;
import generatorMetamodels.LearningPath;
import generatorMetamodels.RoomType;

public class GenericGenerator {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static String INPUT_MODELS_PATH = "inputmodels/";
	private final static String OUTPUT_MODELS_PATH = "outputmodels/";
	private final static String[] INPUT_MODELS_PATHS = {"MathsKnowledge.xmi", "MathsLearningPath.xmi", "LearnerPlayerModel.xmi", "GameDomain.xmi"};
	
	private Knowledge knowledge; 
	private LearningPath learningPath; 
	private LearnerPlayer learnerPlayer;
	private GameDomain gameDomain;
	
	private HighLevelActivity highLevelActivity; 
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
		selectGamingObjective();
		
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
			highLevelActivity.setLevel(learningPath.getLearningobjectives().get(index).getLevels().get(0)); 
		} else {
			highLevelActivity.setLevel(current.getLevel());
		}
		System.out.println(highLevelActivity.getLevel().getID());
	}
	
	private void selectGamingObjective() {
		int index = (int) (Math.random() * gameDomain.getGamingobjectives().size());
		highLevelActivity.setGamingobjective(gameDomain.getGamingobjectives().get(index));
	}
	
	private void selectRoomsPercentages() {
		highLevelActivity.addRoomPercentage(Map.entry(RoomType.SIMPLE_QUESTION, 100));
	}
	
 	private void createRootGeneratedModel() {
		highLevelActivity = GeneratorMetamodelsFactory.eINSTANCE.createHighLevelActivity();
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
		
		Resource resource = resourceSet.createResource(URI.createURI(OUTPUT_MODELS_PATH + outFileName));
		resource.getContents().add(highLevelActivity);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + outFileName);
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
		
		File knowledgeModel = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]);
		File learningModel = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[1]);
		File learnerPlayerModel = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[2]);
		File gameModel = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[3]);

		Resource resource1 = resourceSet.createResource(URI.createFileURI(knowledgeModel.getAbsolutePath()));
		Resource resource2 = resourceSet.createResource(URI.createFileURI(learningModel.getAbsolutePath()));
		Resource resource3 = resourceSet.createResource(URI.createFileURI(learnerPlayerModel.getAbsolutePath()));
		Resource resource4 = resourceSet.createResource(URI.createFileURI(gameModel.getAbsolutePath()));
		try {
			resource1.load(null);
			resource2.load(null);
			resource3.load(null);
			resource4.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		knowledge = (Knowledge) resource1.getContents().get(0);
		learningPath = (LearningPath) resource2.getContents().get(0);
		learnerPlayer = (LearnerPlayer) resource3.getContents().get(0);
		gameDomain = (GameDomain) resource4.getContents().get(0);
		
		LOGGER.info("Loading input models : OK");
	}
}
