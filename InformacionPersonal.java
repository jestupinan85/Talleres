package pck;

import java.util.Scanner;

public class InformacionPersonal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre= "Jhon Steven Estupiñan Jaimes";
		int edad=18;
		String programa="Ingenieria Mecatronica";
		System.out.println(nombre+"\n" +edad+"\n" +programa);
		System.out.println("¿Cual es tu nombre?: ");
		nombre=sc.nextLine();
		System.out.println("¿Cual es tu edad: ");
		//"eEdad"=sc.nextInt();
		//sc.nextLine();
		edad=Integer.parseInt(sc.nextLine());
		System.out.println("¿Cual es tu carrera?: ");
		programa=sc.nextLine();
		System.out.println("Su nombre es "+nombre+"\n" +"tiene " +edad+" años"+ "\n" +"estudia "+programa);
		//--------------------------------------------------------------
		int opcion=menu();
		System.out.println("Opcion seleccionada: "+opcion);
	}
	public static int menu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("opcion 1: hola");
		System.out.println("opcion 2: 50");
		System.out.println("opcion 3: salir");
		System.out.println("Seleccione una opcion");
		int opcion=Integer.parseInt(sc.nextLine());
		return opcion;
	}
}
