package pck;

import java.util.Scanner;
//----------------------------Menu----------------------------------
public class Menu {
	public static void main(String[] args) {
		Scanner escaner= new Scanner(System.in);
		int opcion=0;
		String nombre="";
		int edad=0;
		while (opcion!=3) {
			opcion=menu();

			if (opcion==1) {
				for (int k=0;k<5;k++) {
					System.out.println("Ingrese su nombre: "+(k+1));
					nombre=escaner.nextLine();
					System.out.println("Ingrese su edad: ");
					edad=Integer.parseInt(escaner.nextLine());;
				}
			}
			else {
				if (opcion==2) {
					System.out.println("Su nombre es: " +nombre);
					System.out.println("Su edad es: " +edad);
				}
				else {
					if (opcion==3) {
						System.out.println("Saliendo del programa...");

					} 
					else {
						System.out.println("Numero no valido");
					}
				}
			}
		}
	}
	public static int menu() {
		Scanner escaner= new Scanner(System.in);
		System.out.println("===== MENÚ =====");
		System.out.println("Opcion 1: Ingresar datos");
		System.out.println("Opcion 2: Mostrar datos");
		System.out.println("Opcion 3: Salir");
		System.out.println("Seleccione una opcion: ");
		int opcion=Integer.parseInt(escaner.nextLine());
		return opcion;
	}
}
