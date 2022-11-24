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


public class ModelsManager {
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String INPUT_MODELS_PATH = "inputmodels/";
	private static final String OUTPUT_MODELS_PATH = "outputmodels/";
	private static final String[] INPUT_MODELS_PATHS = {"Context.xmi", "GameDescription.xmi", "MultiplicationTables.xmi"};

	private ResourceSet resourceSet;
	
	
	public GenerationContext context; 
	public GameDescription gameDescription; 
	public Knowledge multiplicationTables;
	
	//Dungeon generatedDungeon;
	
	public ModelsManager() {
		resourceSet = new ResourceSetImpl();
		loadInputModels();
	}

	public void saveGeneratedModel(Dungeon generatedDungeon, String outFileName) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI(OUTPUT_MODELS_PATH + outFileName));
		resource.getContents().add(generatedDungeon);
		try {
			resource.save(map);
		}catch (IOException e) {
			LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + outFileName);
			e.printStackTrace();
		}
		
		LOGGER.info("Saving '" + outFileName + "' file : OK");
	}
	
	private void loadInputModels() {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File contexte = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[0]);
		File gamedescription = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[1]);
		File multiplicationTables = new File(INPUT_MODELS_PATH + INPUT_MODELS_PATHS[12]);

		Resource resource1 = resourceSet.createResource(URI.createFileURI(contexte.getAbsolutePath()));
		Resource resource2 = resourceSet.createResource(URI.createFileURI(gamedescription.getAbsolutePath()));
		Resource resource3 = resourceSet.createResource(URI.createFileURI(multiplicationTables.getAbsolutePath()));

		try {
			resource1.load(null);
			resource2.load(null);
			resource3.load(null);

		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		this.context = (GenerationContext) resource1.getContents().get(0);
		this.gameDescription = (GameDescription) resource2.getContents().get(0);
		this.multiplicationTables = (Knowledge) resource3.getContents().get(0);
		
		LOGGER.info("Loading input models : OK");
	}
}
