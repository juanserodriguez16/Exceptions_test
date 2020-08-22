package ui;
import java.util.*;

import model.*;
import java.time.LocalDate;

public class Main {
	private static MiniMarket minimarket;
	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		boolean esparced= false;
		boolean espardia = false;
		System.out.println("Bienvenido a la tienda...\n [Mi Barrio Te Quiere]");
		
		int x= 0;
		while(x !=2){
			System.out.println("Digita la opcion de lo que deseas hacer\n 1)Ingresar un nuevo Cliente a la tienda\n 2)Salir");
			x = sc.nextInt();
			switch(x) {
			case 1:
		System.out.println("Por favor ingresa el NUMERO que representa tu "
				+ "tipo de documento de identidad \n1) TI \n2) CC \n3) PP \n4) CE");
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor digita el numero de tu documento de identidad");
		String number = sc.nextLine();
		Document NewDocument = new Document(type,number);
		int Penult = PenultimoNumber(number);
		int day = Integer.parseInt("" + LocalDate.now().getDayOfMonth());
		if (Penult%2 == 0) {
			esparced = true;
		}
		if(day%2 == 0) {
			espardia = true;
		}
		if (esparced && !espardia) {
			minimarket.addDocument(NewDocument);
			System.out.println("El documento Par se ha agregado a la lista con exito");
		}else if(!esparced && espardia) {
			minimarket.addDocument(NewDocument);
			System.out.println("El documento impar ha sido agregado a la lista con exito");
		}else {System.out.println("No se ha podido agregar el documento ya que no cumple los requicitos");
		}
		break;
		}
			
			
		}
	}
		
		
	public static int PenultimoNumber(String number) {
		 char[] valores =number.toCharArray();
		 int largo = valores.length;
		  int penultimo = Integer.parseInt("" + valores[largo-2]);
		 return penultimo;
		 
	}
	public void MenuPrincipal() {
		
	}
	
	public static void main(String[] args) {
		 minimarket = new MiniMarket("Mi barrio te quiere");
		Menu();	
			
	}

}
