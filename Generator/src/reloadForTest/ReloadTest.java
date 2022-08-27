package reloadForTest;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import generator.Dungeon;
import generator.GameDescription;
import generator.GeneratorPackage;
import generator.RogueliteContext;
import generator.Room;
import generator.RoomAccess;

public class ReloadTest {

	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String INPUT_MODELS_PATH = "outputmodels/GeneratedDungeon.xmi";

	private ResourceSet resourceSet;
	public Dungeon generatedDungeon;
	
	public static void main(String[] args) {
		ReloadTest test = new ReloadTest();
		test.printDungeon();
	}
	
	public void printRoom(Room r) {
		System.out.println("****");
		System.out.println(r.getRoomtype().getClass().getName() + " ("+r.getX()+","+r.getY()+")");
		for (RoomAccess ra : r.getRoomaccess()) {
			System.out.println("Access : "+ra.getDirection());
		}
		System.out.println("****");
	}
	
	public void printDungeon() {
		System.out.println("---- Dungeon -----");
		for (Room r : generatedDungeon.getRooms()) {
			printRoom(r);
		}
	}

	public ReloadTest() {
		resourceSet = new ResourceSetImpl();
		loadInputModel();
	}
	
	private void loadInputModel() {
		GeneratorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		File dungeon = new File(INPUT_MODELS_PATH);

		Resource resource1 = resourceSet.createResource(URI.createFileURI(dungeon.getAbsolutePath()));

		try {
			resource1.load(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet); 
		
		this.generatedDungeon = (Dungeon) resource1.getContents().get(0);
		
		LOGGER.info("Loading input model : OK");
	}
}
