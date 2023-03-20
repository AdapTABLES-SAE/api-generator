package managers;

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

import generator.Dungeon;
import generator.GameDescription;
import generator.GenerationContext;
import generator.GeneratorPackage;
import generator.Knowledge;
import generator.LearningDomain;


public class ModelsManager {
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static String INPUT_MODELS_PATH = "inputmodels/";
	private static String OUTPUT_MODELS_PATH = "outputmodels/";
	private boolean lauchedFromAPI = false;
	private static String[] INPUT_MODELS_PATHS = {"Context.xmi", "GameDescription.xmi", "MultiplicationTables.xmi", "LearningDomain.xmi"};

	private ResourceSet resourceSet;
	
	
	public GenerationContext context; 
	public GameDescription gameDescription; 
	public Knowledge multiplicationTables;
	public LearningDomain learningPath;
	

	public ModelsManager(String contextFileName) {
		resourceSet = new ResourceSetImpl();
		if(!contextFileName.isEmpty()) {
			INPUT_MODELS_PATHS[0] = contextFileName;
		}
		loadInputModels();
	}
	
	public ModelsManager(String inputPath, String outputPath, boolean lauchedFromAPI) {
		System.out.println(INPUT_MODELS_PATH);
		INPUT_MODELS_PATH = inputPath;
		OUTPUT_MODELS_PATH = outputPath;
		this.lauchedFromAPI = lauchedFromAPI;
		resourceSet = new ResourceSetImpl();
		loadInputModels();
	}
	
	public ModelsManager(String inputPath, String outputPath, String contextFilePath, boolean lauchedFromAPI) {
		System.out.println(INPUT_MODELS_PATH);
		INPUT_MODELS_PATH = inputPath;
		OUTPUT_MODELS_PATH = outputPath;
		this.lauchedFromAPI = lauchedFromAPI;
		if(!contextFilePath.isEmpty()) {
			INPUT_MODELS_PATHS[0] = contextFilePath;
		}
		resourceSet = new ResourceSetImpl();
		loadInputModels();
	}

	public void saveGeneratedModel(Dungeon generatedDungeon, String outFileName) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		String filePathComplement = lauchedFromAPI? "file:///": "";
		
		Resource resource = resourceSet.createResource(URI.createURI(filePathComplement + OUTPUT_MODELS_PATH + outFileName));

		resource.getContents().add(generatedDungeon);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + outFileName);
			e.printStackTrace();
		}
		
		LOGGER.info("Saving '" + outFileName + "' file : OK");
	}
	
	public void saveDomainModel(LearningDomain learningPaths) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		//map.put(XMLResource.OPTION_ENCODING, "UTF-8");
		String filePathComplement = lauchedFromAPI? "file:///": "";
		Resource resource = resourceSet.createResource(URI.createURI(filePathComplement + INPUT_MODELS_PATH + INPUT_MODELS_PATHS[3]));

		resource.getContents().add(learningPaths);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + INPUT_MODELS_PATHS[3]);
			e.printStackTrace();
		}
		
		LOGGER.info("Saving '"+INPUT_MODELS_PATHS[3]+"' file : OK");
	}
	
	public LearningDomain loadDomainModel() {
		ResourceSet resourceSet = new ResourceSetImpl();
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File learningPaths = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[3]);
		Resource resource = resourceSet.createResource(URI.createFileURI(learningPaths.getAbsolutePath()));

		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		return (LearningDomain) resource.getContents().get(0);		
	}
	
	
	public Knowledge loadKnowledgeModel() {
		ResourceSet resourceSet = new ResourceSetImpl();
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File knowledge = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[2]);
		Resource resource = resourceSet.createResource(URI.createFileURI(knowledge.getAbsolutePath()));

		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		return (Knowledge) resource.getContents().get(0);		
	}
	
	public void saveContextModel() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		//map.put(XMLResource.OPTION_ENCODING, "UTF-8");
		System.out.println(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]);
		
		String filePathComplement = lauchedFromAPI? "file:///": "";
		Resource resource = resourceSet.createResource(URI.createURI(filePathComplement + INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]));
		resource.getContents().add(context);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]);
			e.printStackTrace();
		}
		
		LOGGER.info("Saving '"+INPUT_MODELS_PATHS[0]+"' file : OK");
	}
		
	private void loadInputModels() {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File contexte = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]);
		File gamedescription = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[1]);
		File multiplicationTables = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[2]);
		File learningPaths = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[3]);

		Resource resource1 = resourceSet.createResource(URI.createFileURI(contexte.getAbsolutePath()));
		Resource resource2 = resourceSet.createResource(URI.createFileURI(gamedescription.getAbsolutePath()));
		Resource resource3 = resourceSet.createResource(URI.createFileURI(multiplicationTables.getAbsolutePath()));
		Resource resource4 = resourceSet.createResource(URI.createFileURI(learningPaths.getAbsolutePath()));


		try {
			resource1.load(null);
			resource2.load(null);
			resource3.load(null);
			resource4.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		this.context = (GenerationContext) resource1.getContents().get(0);
		this.gameDescription = (GameDescription) resource2.getContents().get(0);
		this.multiplicationTables = (Knowledge) resource3.getContents().get(0);
		this.learningPath = (LearningDomain) resource4.getContents().get(0);
		
		LOGGER.info("Loading input models : OK");
	}
}
