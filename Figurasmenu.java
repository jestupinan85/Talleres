package pck;

import java.util.Scanner;

public class Figurasmenu{
    static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) {
		int opcion;
	    int n=5;
		do{
			menu();
			System.out.println("Seleccione una opcion: ");
			opcion=Integer.parseInt(sc.nextLine());
		    switch (opcion) {
		    case 1:
		    	figura1(n);
		    	break;
		    case 2:
		    	figura2(n);
		    	break;
		    case 3:
		    	figura3(n);
		    	break;
		    case 4:
		    	figura4(n);
		    	break;
		    case 5:
		    	System.out.println("Saliendo del programa...");
		    	break;
		    default:
		    	System.out.println("Opcion no valida");
		    }
		}while (opcion!=5);
		
	}
	public static void figura1(int n){
	    for (int i=1; i<=n; i++) {
	    	System.out.println(" ".repeat(n-i) + "* ".repeat(i));
	    }
	}
	public static void figura2(int n) {
		for (int i=n; i>=1; i--) {
			System.out.println(" ".repeat(n-i) + "* ".repeat(i));
		}
	}
	public static void figura3(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println("".repeat(n-i)+"*".repeat(i));
		}
	}
	public static void figura4(int n) {
		for (int i=n; i>=1; i--) {
			System.out.println("*".repeat(i));
		}
	}
	public static void menu(){
	    System.out.println("\n=====Menu de figuras=====");
	    System.out.println("1. Figura 1");
	    System.out.println("2. Figura 2");
	    System.out.println("3. Figura 3");
	    System.out.println("4. Figura 4");
	    System.out.println("5. Salir");
	}
	
}