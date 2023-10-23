package structures;

import generator.VizualisationPosition;

public class Soluce {

	
	private String value; 
	private boolean isImage;
	private VizualisationPosition position; 
	
	
	public Soluce(String value) {
		this(value, false, null);
	}
	public Soluce(String value, boolean isImage) {
		this(value, isImage, null);
	}
	
	public Soluce(String value, VizualisationPosition position) {
		this(value, false, position);
	}
	
	public Soluce(String value, boolean isImage, VizualisationPosition position) {
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

	public VizualisationPosition getPosition() {
		return position;
	}

	public boolean isImage() {
		return isImage;
	}	
}
