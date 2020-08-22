package ui;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import model.Document;
import model.*;

public class Menu {
	private static MiniMarket minimarket;
	private static Scanner sc;
	public static void Initialize() {
		 sc = new Scanner(System.in);
		 minimarket = new MiniMarket("Mi barrio te quiere");
	}
	public void menu() {
		Initialize();
		System.out.println("Bienvenido a la tienda...\n [Mi Barrio Te Quiere]");
		int Contador = 0;
		int x= 0;
		while(x !=4){
			System.out.println("Digita la opcion de lo que deseas hacer\n 1)Ingresar un nuevo Cliente a la tienda\n"
					+ " 2)Mostrar los clientes que lograron ingresar\n 3)Mostrar los clientes que"
					+ "intentaron ingresar\n 4)Salir");
			x = sc.nextInt();
			switch(x) {
			
			case 1: newDocument();
			Contador++;
			break;
			case 2: System.out.println(minimarket.infoclients());
			break;
			case 3: System.out.println("Los documentos que se han intentado ingresar son: " + Contador);
			
			}
					

		}
	}
	public void newDocument() {
		System.out.println("Por favor ingresa el NUMERO que representa tu "
				+ "tipo de documento de identidad \n1) TI \n2) CC \n3) PP \n4) CE");
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor digita el numero de tu documento de identidad");
		String number = sc.nextLine();
		Document NewDocument = new Document(type,number);
		if(NewDocument.checkNewAdd()) {
			minimarket.addDocument(NewDocument);
			System.out.println("Se ha agregado con exito el nuevo documento");	
		}else {
			System.out.println("No se pudo agregar el documento porque no cumple los requisitos");
		}
		
	}
}
		
		






