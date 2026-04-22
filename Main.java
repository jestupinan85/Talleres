package pck;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = mostrarMenu();

            if (opcion == 1) {
                System.out.print("Ingrese un número: ");
                int n = sc.nextInt();
                mostrarNumeros(n);

            } else if (opcion == 2) {
                int suma = sumarNumeros();
                System.out.println("La suma total es: " + suma);

            } else if (opcion == 3) {
                validarPassword();

            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");

            } else {
                System.out.println("Opción inválida");
            }

        } while (opcion != 4);
    }

    public static int mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Mostrar números");
        System.out.println("2. Sumar números");
        System.out.println("3. Validar contraseña");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public static void mostrarNumeros(int n) {
        for (int k = 1; k <= n; k++) {
            System.out.println(k);
        }
    }

    public static int sumarNumeros() {
        int suma = 0;
        int num = -1;

        while (num != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            suma += num;
        }

        return suma;
    }

    public static void validarPassword() {
        String passwordCorrecta = "Contraseña";
        String input;

        do {
            System.out.print("Ingrese la contraseña: ");
            input = sc.next();
        } while (!input.equals(passwordCorrecta));

        System.out.println("Acceso concedido");
    }
}