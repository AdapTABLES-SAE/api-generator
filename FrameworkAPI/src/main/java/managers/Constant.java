package managers;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import generator.Classroom;
import generator.Classrooms;
import generator.GeneratorPackage;
import generator.LearnerPlayer;

public class Constant {
	
	private static ResourceSet resourceSet;
	
	/*
	 * PROJECT PATH 
	 */
	public static String PROJECT_PATH; 
	
	/*
	 * MODELS PATHS
	 */
	public static final String ECORE_PATH = "models/ecore/";
	public static final String FLATNER_PATH = "flattener/";
	public static final String INPUT_MODELS_PATH = "models/inputmodels/";
	public static final String OUTPUT_MODELS_PATH = "models/outputmodels/";
	
	/*
	 * CONTEXT FILE INFORMATION
	 */
	//public static final String CONTEXTS_FILES_PATH = "contextsByClass/"; 
	//public static final String CONTEXTS_FILES_PREFIX = "Context_";
	public static final String DEFAULT_CLASSROOM_NAME = "default";
	
	
	public static final String CLASSROOMS_FILE = "Classrooms.xmi";
	
	public static Classroom getClassroom(String classroomID) {
		Classrooms classrooms = loadClassrooms();  
		for(Classroom classroom : classrooms.getClassrooms()) {
			if(classroom.getID().equals(classroomID)) {
				return classroom;
			}
		}
		
		return null;
	}
	
	public static boolean doesLearnerBelongsToClassroom(Classroom classroom, String learnerID) {
		for(LearnerPlayer LP: classroom.getLearnerPlayers()) {
			if(LP.getID().equals(learnerID)) {
				return true;
			}
		}
		return false;
	}
	
	private static Classrooms loadClassrooms() {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File classrooms = new File(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CLASSROOMS_FILE);
		Resource resource = resourceSet.createResource(URI.createFileURI(classrooms.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		return (Classrooms) resource.getContents().get(0);
	}
	
}
