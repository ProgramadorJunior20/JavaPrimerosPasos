package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /**
         * Pide por teclado un número entero positivo (debemos controlarlo) y muestra
         * el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
         * Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero positivo");
        int num = sc.nextInt();

        int cifras = (int) (Math.log10(num) + 1);
        System.out.println("El numero "+ num +" tiene " + cifras + " cifras");
    }
}
