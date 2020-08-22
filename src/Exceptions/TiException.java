package Exceptions;

public class TiException extends Exception {
	String message;
	public TiException () {
		message = "The Document cant be TI, you need to be a legal age";
		
	}
	
	public String ShowMessage() {
		return message;
	}

}
