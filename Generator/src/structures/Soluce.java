package structures;

import generator.MapElementPosition;

public class Soluce {

	
	private String value; 
	private MapElementPosition position; 
	
	public Soluce(String value) {
		this(value, null);
	}
	
	public Soluce(String value, MapElementPosition position) {
		this.value = value;
		this.position = position;
	}
	
	public boolean isGraphicSolution() {
		return this.position != null;
	}

	public String getValue() {
		return value;
	}

	public MapElementPosition getPosition() {
		return position;
	}	
}
