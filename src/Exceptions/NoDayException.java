package Exceptions;

public class NoDayException extends Exception{
	String Message;
			public NoDayException() {
				Message = "In this day yo can't enter";
			}
			public String ShoeMessage() {
				return Message;
			}
}
