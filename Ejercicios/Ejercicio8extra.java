package Ejercicios;

import java.util.Scanner;

public class Ejercicio8extra {
    public static void main(String[] args) {
        /**
         * Modifica el ejercicio anterior, para que en lugar de pedir un número,
         * pida un carácter (char) y muestre su código en la tabla ASCII.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un caracter por favor: ");
        char caracter = sc.next().charAt(0); //Convirtiendo String a un valor de tipo char

        int valorASCII = caracter; // Convirtiendo un char a un entero(int)

        System.out.println(valorASCII);
    }
}
