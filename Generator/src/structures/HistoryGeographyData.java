package structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import generator.EGeographyValue;

public class HistoryGeographyData {

	
	public static final HashMap<EGeographyValue, List<String>> data = new HashMap<>();
	static {
		
		data.put(EGeographyValue.REGIONS, new ArrayList<>(Arrays.asList("Languedoc-Roussillon", "Midi-Pyrénées", "Auvergnes", "Limousin", "Centre", "Alsace", 
				"Loraine", "Picardie")));
	}
}
