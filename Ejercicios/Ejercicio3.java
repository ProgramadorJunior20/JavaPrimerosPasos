package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
         * Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor: ");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);
    }
}
