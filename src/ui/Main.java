package ui;
import java.util.*;

import model.*;
import java.time.LocalDate;

public class Main {
	private static MiniMarket minimarket;
	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		System.out.println("Bienvenido a la tienda...\n [Mi Barrio Te Quiere]");
		System.out.println("Por favor ingresa el NUMERO que representa tu "
				+ "tipo de documento de identidad \n1) TI \n2) CC \n3) PP \n4) CE");
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor digita el numero de tu documento de identidad");
		String number = sc.nextLine();
		Document NewDocument = new Document(type,number);
		int Penult = PenultimoNumber(number);
		int day = Integer.parseInt("" + LocalDate.now().getDayOfMonth());
		if (Penult%2 == 0 && day%2 != 0) {
		minimarket.addDocument(NewDocument);
		System.out.println("El documento Par se ha agregado a la lista con exito");
		}else if(Penult%2 != 0 && day%2 == 0) {
			minimarket.addDocument(NewDocument);
			System.out.println("El documento impar ha sido agregado a la lista con exito");
		}else {System.out.println("No se ha agregado ningun Documentoa la lista " + 
			LocalDate.now().getDayOfMonth() + Penult)	;}
	}
	public static int PenultimoNumber(String number) {
		 char[] valores =number.toCharArray();
		 int largo = valores.length;
		  int penultimo = Integer.parseInt("" + valores[largo-2]);
		 return penultimo;
		 
	}
	
	public static void main(String[] args) {
		 minimarket = new MiniMarket("Mi barrio te quiere");
		Menu();	
			
	}

}
