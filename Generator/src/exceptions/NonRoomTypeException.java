package exceptions;

import generator.ATask;
import generator.Gameplay;

public class NonRoomTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonRoomTypeException(Gameplay gameplay, ATask task) {
		super("No roomtype was found for"+gameplay.getName()+" and task "+(task == null? "none":task.getID()));
	}

}
