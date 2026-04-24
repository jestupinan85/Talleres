package pck;
import java.util.Scanner;
public class Notas {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] numeros=new int[5];
		System.out.println("Ingrese 5 notas: ");
		for (int i=0; i<5; i++) {
			numeros[i]=sc.nextInt();
			System.out.println(numeros[i]);
		}
	}

}
