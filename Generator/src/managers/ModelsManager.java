package managers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import exceptions.ContextNotFoundException;
import exceptions.NonExistantLearnerPlayerException;
import generator.Classroom;
import generator.Classrooms;
import generator.Dungeon;
import generator.GameDescription;
import generator.GameplayTaskRelations;
import generator.GeneratorPackage;
import generator.Knowledge;
import generator.LearnerPlayer;
import generator.LearningDomain;
import generators.ALGAGenerator;
import structures.DidacticDomain;


public class ModelsManager {
	
	
	private ResourceSet resourceSet;
	private boolean launchedFromAPI = false;
	public boolean launchedFromTEST = false;
	
	private static final HashMap<DidacticDomain, String> didacticDomainFileNames = new HashMap<>();
	static {
		didacticDomainFileNames.put(DidacticDomain.MATHEMATICS, "MultiplicationTables.xmi");
		didacticDomainFileNames.put(DidacticDomain.HISTORY_GEOGRAPHY, "HistoryGeographyFacts.xmi");
	}
	
	private static String INPUT_MODELS_PATH = "inputmodels/";
	private static String INPUT_MODELS_PATH_TEST = "tests/modelsForTests/";
	private static String OUTPUT_MODELS_PATH = "outputmodels/";
	private static String INPUT_LEARNER_MODELS_PATH = "learnerPlayers/";
	private static String[] INPUT_MODELS_NAMES = {"Contexts.xmi", "GameDescription.xmi", 
			didacticDomainFileNames.get(ALGAGenerator.DOMAIN), "LearningDomain.xmi", "Relations.xmi", ""};
	
	private static final String DEFAULT_CONTEXTID = "default";
	
	private Classroom context;
	private GameDescription gameDescription; 
	private Knowledge multiplicationTables;
	private LearningDomain learningPath;
	private GameplayTaskRelations relations;
	private LearnerPlayer learnerPlayer; 
	
	private void setLearnerPlayerFileName(String ID) throws NonExistantLearnerPlayerException {
		String modelsPath = INPUT_MODELS_PATH + INPUT_LEARNER_MODELS_PATH;
		INPUT_MODELS_NAMES[5] = "";
		File[] files = new File(modelsPath).listFiles();
		int i = 0;
		while(i < files.length && INPUT_MODELS_NAMES[5].isEmpty()) {
			LearnerPlayer learnerPlayer = loadLearnerPlayerFile(files[i].getAbsolutePath()); 
			if(learnerPlayer.getID().equals(ID)) {
				INPUT_MODELS_NAMES[5] = files[i].getName();
			}
			i++;
		}
		ALGAGenerator.LOGGER.info("ID Learner="+ID+" -- Corresponding FILE NAME="+INPUT_MODELS_NAMES[5]);
		if(INPUT_MODELS_NAMES[5].isEmpty()) {
			ALGAGenerator.LOGGER.severe("LEARNER PLAYER MODEL NOT FOUND !");
			throw new NonExistantLearnerPlayerException(ID);
		}
	}
	
	private LearnerPlayer loadLearnerPlayerFile(String path) {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File learnerPlayer = new File(path);
		Resource resource = resourceSet.createResource(URI.createFileURI(learnerPlayer.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		return (LearnerPlayer) resource.getContents().get(0);
	}
	
	public ModelsManager(boolean isForTest, String learnerID,  String contextsFileName, String contextID) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		resourceSet = new ResourceSetImpl();
		launchedFromTEST = isForTest;
		if(launchedFromTEST) { INPUT_MODELS_PATH = INPUT_MODELS_PATH_TEST;}
		setLearnerPlayerFileName(learnerID); 
		if(!contextsFileName.isEmpty()) { INPUT_MODELS_NAMES[0] = contextsFileName; }
		loadInputModels(contextID);
	}
	
	public ModelsManager(boolean isForTest, String learnerID,  String contextsFileName) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		this(isForTest, learnerID, contextsFileName, DEFAULT_CONTEXTID);
	}

	public ModelsManager(String learnerID, String contextsFileName, String contextID) throws NonExistantLearnerPlayerException, ContextNotFoundException {	
		this(false, learnerID, contextsFileName, contextID);
	}

	public ModelsManager(String learnerID, String contextID) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		this(learnerID, "", contextID);
	}
	
	public ModelsManager(String learnerID) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		this(learnerID, "", DEFAULT_CONTEXTID);
	}
	
	public ModelsManager(String inputPath, String outputPath, String learnerID, boolean lauchedFromAPI) throws NonExistantLearnerPlayerException, ContextNotFoundException {

		this(inputPath, outputPath, learnerID, "", DEFAULT_CONTEXTID, lauchedFromAPI);
	}
	
	public ModelsManager(String inputPath, String outputPath, String learnerID, String contextsFileName, boolean launchedFromAPI) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		//System.out.println(INPUT_MODELS_PATH);
		this(inputPath, outputPath, learnerID, contextsFileName, DEFAULT_CONTEXTID, launchedFromAPI);
	}
	
	public ModelsManager(String inputPath, String outputPath, String learnerID, String contextsFileName, String contextID,  boolean launchedFromAPI) throws NonExistantLearnerPlayerException, ContextNotFoundException {
		//System.out.println(INPUT_MODELS_PATH);
		resourceSet = new ResourceSetImpl();
		INPUT_MODELS_PATH = inputPath;
		OUTPUT_MODELS_PATH = outputPath;
		this.launchedFromAPI = launchedFromAPI;
		if(!contextsFileName.isEmpty()) { INPUT_MODELS_NAMES[0] = contextsFileName; }
		setLearnerPlayerFileName(learnerID); 
		loadInputModels(contextID);
	}

	public void saveGeneratedModel(Dungeon generatedDungeon, String outFileName) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		String filePathComplement = launchedFromAPI? "file:///": "";
		
		Resource resource = resourceSet.createResource(URI.createURI(filePathComplement + OUTPUT_MODELS_PATH + outFileName));
		resource.getContents().add(generatedDungeon);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " + OUTPUT_MODELS_PATH + outFileName);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + outFileName + "' file : OK");
	}
	
	public void saveDomainModel(LearningDomain learningPaths) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		File domainModel = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[3]);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(domainModel.getAbsolutePath()));
		resource.getContents().add(learningPaths);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + INPUT_MODELS_NAMES[3]);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '"+INPUT_MODELS_NAMES[3]+"' file : OK");
	}
	
	public LearningDomain loadDomainModel() {
		ResourceSet resourceSet = new ResourceSetImpl();
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File learningPaths = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[3]);
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
		
		File knowledge = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[2]);
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
		
		File contexte = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[0]);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(contexte.getAbsolutePath()));
		resource.getContents().add(context);
		
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + INPUT_MODELS_NAMES[0]);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '"+ INPUT_MODELS_PATH + INPUT_MODELS_NAMES[0]+"' file : OK");
	}
	
	public void saveLearnerPlayerModel() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		File learnerPlayer = new File(INPUT_MODELS_PATH + INPUT_LEARNER_MODELS_PATH + INPUT_MODELS_NAMES[5]);
		
		Resource resource = resourceSet.createResource(URI.createFileURI(learnerPlayer.getAbsolutePath()));
		resource.getContents().add(this.learnerPlayer);
		
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " + INPUT_MODELS_PATH + INPUT_LEARNER_MODELS_PATH + INPUT_MODELS_NAMES[5]);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '"+ INPUT_MODELS_PATH + INPUT_LEARNER_MODELS_PATH + INPUT_MODELS_NAMES[5]+"' file : OK");
	}
		
	private void loadInputModels(String contextID) throws ContextNotFoundException {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File contextes = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[0]);
		File gamedescription = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[1]);
		File multiplicationTables = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[2]);
		File learningPaths = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[3]);
		File relations = new File(INPUT_MODELS_PATH + INPUT_MODELS_NAMES[4]);
		File learnerPlayer = new File(INPUT_MODELS_PATH + INPUT_LEARNER_MODELS_PATH + INPUT_MODELS_NAMES[5]);
		
		Resource resource1 = resourceSet.createResource(URI.createFileURI(contextes.getAbsolutePath()));
		Resource resource2 = resourceSet.createResource(URI.createFileURI(gamedescription.getAbsolutePath()));
		Resource resource3 = resourceSet.createResource(URI.createFileURI(multiplicationTables.getAbsolutePath()));
		Resource resource4 = resourceSet.createResource(URI.createFileURI(learningPaths.getAbsolutePath()));
		Resource resource5 = resourceSet.createResource(URI.createFileURI(relations.getAbsolutePath()));
		Resource resource6 = resourceSet.createResource(URI.createFileURI(learnerPlayer.getAbsolutePath()));

		try {
			resource1.load(null);
			resource2.load(null);
			resource3.load(null);
			resource4.load(null);
			resource5.load(null);
			resource6.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		loadCorrespondingContext((Classrooms) resource1.getContents().get(0), contextID);
		this.gameDescription = (GameDescription) resource2.getContents().get(0);
		this.multiplicationTables = (Knowledge) resource3.getContents().get(0);
		this.learningPath = (LearningDomain) resource4.getContents().get(0);
		this.relations = (GameplayTaskRelations) resource5.getContents().get(0);
		this.learnerPlayer = (LearnerPlayer) resource6.getContents().get(0);
		
		ALGAGenerator.LOGGER.info("Loading input models : OK");
	}
	
	private void loadCorrespondingContext(Classrooms contexts, String contextID) throws ContextNotFoundException {
		for(Classroom classe : contexts.getClassrooms()) {
			if(classe.getID().equals(contextID)) {
				this.context = classe;
			}
		}
		
		if(this.context == null) {
			ALGAGenerator.LOGGER.severe("CONTEXT WITH ID="+contextID+" was not found !");
			throw new ContextNotFoundException(contextID, INPUT_MODELS_NAMES[0]);
		}
	}


	public Classroom getContextModel() {
		return context;
	}

	public void setContextModel(Classroom context) {
		this.context = context;
	}

	public GameDescription getGameDescriptionModel() {
		return gameDescription;
	}

	public void setGameDescription(GameDescription gameDescription) {
		this.gameDescription = gameDescription;
	}

	public Knowledge getMultiplicationTablesModel() {
		return multiplicationTables;
	}

	public LearningDomain getLearningPathModel() {
		return learningPath;
	}

	public void setLearningPathModel(LearningDomain learningPath) {
		this.learningPath = learningPath;
	}

	public GameplayTaskRelations getRelationsModel() {
		return relations;
	}

	public LearnerPlayer getLearnerPlayer() {
		return learnerPlayer;
	}
	
	
}
