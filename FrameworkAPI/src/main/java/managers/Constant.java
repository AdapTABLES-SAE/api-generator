package managers;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import generator.Classroom;
import generator.Classrooms;
import generator.GeneratorPackage;
import generator.LearnerPlayer;
import generator.LearningDomain;
import generator.Teacher;
import generator.Teachers;
import generators.ALGAGenerator;

public class Constant {
	
	//rivate static ResourceSet resourceSet;
	
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
	public static final String TEACHERS_FILE = "Teachers.xmi";
	public static final String PATHS_FILE = "LearningDomain.xmi";
	public static final String KNOWLEDGE_FILE = "MultiplicationTables.xmi";
	public static final String LEARNERS_FILES_PATH = "learnerPlayers/"; 

	public static final String LEARNER_FILE_NAME_PREFIX = "LearnerPlayer_";
	
	public static Classroom getClassroom(String classroomID) {
		Classrooms classrooms = loadClassrooms();  
		for(Classroom classroom : classrooms.getClassrooms()) {
			if(classroom.getID().equals(classroomID)) {
				return classroom;
			}
		}
		
		return null;
	}
	
	public static Teacher getTeacher(String teacherID) {
		Teachers teachers = loadTeachers();  
		for(Teacher teacher : teachers.getTeachers()) {
			if(teacher.getID().equals(teacherID)) {
				return teacher;
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
	
	public static Classrooms loadClassrooms() {
		GeneratorPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File classrooms = new File(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CLASSROOMS_FILE);
		System.out.println();
		Resource resource = resourceSet.createResource(URI.createFileURI(classrooms.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		return (Classrooms) resource.getContents().get(0);
	}
	
	public static Teachers loadTeachers() {
		GeneratorPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		File teachers = new File(Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE);
		Resource resource = resourceSet.createResource(URI.createFileURI(teachers.getAbsolutePath()));
		try {
			resource.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		return (Teachers) resource.getContents().get(0);
	}
	
	public static void saveLearnerModel(LearnerPlayer learner) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		String path = Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.LEARNERS_FILES_PATH + Constant.LEARNER_FILE_NAME_PREFIX + learner.getID() + ".xmi";
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+path));
		resource.getContents().add(learner);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " + path);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + path + "' file : OK");
	}
	
	
	public static void saveClassroomsModel(Classrooms classrooms) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CLASSROOMS_FILE));
		resource.getContents().add(classrooms);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CLASSROOMS_FILE);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.CLASSROOMS_FILE + "' file : OK");
	}
	
	public static void saveTeachersModel(Teachers teachers) {

		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE));
		resource.getContents().add(teachers);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE + "' file : OK");

	}
	
	
	public static void saveDomainModel(LearningDomain domain) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		ResourceSet resourceSet = new ResourceSetImpl();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE));
		resource.getContents().add(domain);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.PATHS_FILE + "' file : OK");
	}
	
	public static void saveTeachersModel(Teacher teacher) {
		Teachers teachers = loadTeachers();
		if(teacher != null) {
			removeTeacherByID(teachers, teacher.getID());
			teachers.getTeachers().add(teacher);	
		}
				
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		XMIResourceFactoryImpl toSave = new XMIResourceFactoryImpl();
		map.put("xmi", toSave);
		map.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("file:///"+Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE));
		resource.getContents().add(teachers);
		try {
			resource.save(map);
		}catch (IOException e) {
			ALGAGenerator.LOGGER.severe("Error while saving : " +Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE);
			e.printStackTrace();
		}
		
		ALGAGenerator.LOGGER.info("Saving '" + Constant.PROJECT_PATH + Constant.INPUT_MODELS_PATH + Constant.TEACHERS_FILE + "' file : OK");
	}
	
	private static Teachers removeTeacherByID(Teachers teachers, String ID) {
		for(Teacher teacher: teachers.getTeachers()) {
			if(teacher.getID().equals(ID)) {
				teachers.getTeachers().remove(teacher);
				break;
			}
		}
		return teachers;
	}
}
