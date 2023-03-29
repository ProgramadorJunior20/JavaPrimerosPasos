package Ejercicios;

import java.util.Scanner;

public class Ejercicio7extra {
    public static void main(String[] args) {
        /**
         * Lee un número por teclado y muestra por consola,
         * el carácter al que pertenece en la tabla ASCII.
         * Por ejemplo: si introduzco un 97, me muestre una a.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        int numero = sc.nextInt();

        char caracter = (char) numero;

        System.out.println("El número ingresado por el usuario pertenece al caracter: " + caracter + " ..en la tabla ASCII");

    }
}
