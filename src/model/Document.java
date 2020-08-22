package model;
import java.time.LocalDate;
import java.util.*;
import Exceptions.*;
public class Document {
	private int type;
	private String number;
	public Document(int type, String number) {
		this.setType(type);
		this.setNumber(number);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public void checkDayNumber() throws NoDayException {
		boolean esparced= false;
		boolean espardia = false;
		int day = Integer.parseInt("" + LocalDate.now().getDayOfMonth());
		int penult = PenultimoNumber(number);
		if (penult%2 == 0) {
			esparced = true;
		}
		if(day%2 == 0) {
			espardia = true;
		}
		if (esparced && !espardia || !esparced && espardia) {
			
		}else {
			throw new NoDayException();
		}
	}
	public boolean checkNewAdd() {
		boolean added = false;
		try {
			checkTi();
			checkDayNumber();
				added = true;
		}
		catch(TiException ti) {
			System.err.println(ti.ShowMessage());
		}
		catch(NoDayException nde) {
			System.err.println(nde.ShoeMessage());
		}
			return added;
	}
	public void checkTi() throws TiException {
		int type = getType();
		if(type == 1) {
			throw new TiException();
		}
		
	}

	public  int PenultimoNumber(String number) {
		 char[] valores =number.toCharArray();
		 int largo = valores.length;
		  int penultimo = Integer.parseInt("" + valores[largo-2]);
		 return penultimo;
		 
	}
}
