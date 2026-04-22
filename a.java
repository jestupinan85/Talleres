package pck;
import java.util.Scanner;
public class a {
	static Scanner sc = new Scanner(System.in);
	public static int contador_vocales() {
		String cadena="";
		System.out.println("Ingrese una cadena: ");
		sc.nextLine();

		String vocales="aeiouAEIOU";

		int contador=0;

		for (contador++;contador<=5;contador+=1) {
		}
		return contador;
	}
	public static void main(String[] args) {
		int vocales2=contador_vocales();
		System.out.println("El número de vocales en la cadena es: "+ vocales2);
	}
}
