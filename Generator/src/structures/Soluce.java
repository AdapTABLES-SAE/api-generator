package structures;

import generator.VisualizationPosition;

public class Soluce {

	
	private String value; 
	private boolean isImage;
	private VisualizationPosition position; 
	
	
	public Soluce(String value) {
		this(value, false, null);
	}
	public Soluce(String value, boolean isImage) {
		this(value, isImage, null);
	}
	
	public Soluce(String value, VisualizationPosition position) {
		this(value, false, position);
	}
	
	public Soluce(String value, boolean isImage, VisualizationPosition position) {
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

	public VisualizationPosition getPosition() {
		return position;
	}

	public boolean isImage() {
		return isImage;
	}	
}
