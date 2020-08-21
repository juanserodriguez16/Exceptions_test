package model;
import java.util.*;
public class Document {
	private int type;
	private String number;
	public Document(int type, String number) {
		this.type = type;
		this.number = number;
	}
	public int getType() {
		return type;
	}
	public  String getNumber() {
		return number;
	}

}
