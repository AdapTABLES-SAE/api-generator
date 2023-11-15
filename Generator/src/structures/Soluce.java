package structures;

import generator.VisualizationPosition;

public class Soluce {

	
	private String value; 
	private int order;
	private boolean isImage;
	private VisualizationPosition position; 
	
	public Soluce(String value) {
		this(value, false, null, -1);
	}
	
	public Soluce(String value, boolean isImage) {
		this(value, isImage, null, -1);
	}
	
	public Soluce(String value, VisualizationPosition position) {
		this(value, false, position, -1);
	}
	
	public Soluce(String value, boolean isImage, VisualizationPosition position) {
		this(value, isImage, position, -1);
	}
	
	public Soluce(String value, boolean isImage, VisualizationPosition position, int order) {
		this.value = value;
		this.isImage = isImage;
		this.position = position;
		this.order = order; 
	}
	
	public Soluce(String value, int order) {
		this(value, false, null, order);
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
	
	public boolean isOrderSet() {
		return this.order != -1;
	}
	
	public int getOrder() {
		return order;
	}
}

