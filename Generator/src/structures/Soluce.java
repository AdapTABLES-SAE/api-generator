package structures;

import generator.MapElementPosition;

public class Soluce {

	
	private String value; 
	private boolean isImage;
	private MapElementPosition position; 
	
	
	public Soluce(String value) {
		this(value, false, null);
	}
	public Soluce(String value, boolean isImage) {
		this(value, isImage, null);
	}
	
	public Soluce(String value, MapElementPosition position) {
		this(value, false, position);
	}
	
	public Soluce(String value, boolean isImage, MapElementPosition position) {
		this.value = value;
		this.isImage = isImage;
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

	public boolean isImage() {
		return isImage;
	}	
}
