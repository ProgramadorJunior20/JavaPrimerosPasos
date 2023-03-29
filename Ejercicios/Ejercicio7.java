package Ejercicios;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Lee un número por teclado y muestra por consola,
         * el carácter al que pertenece en la tabla ASCII.
         * Por ejemplo: si introduzco un 97, me muestre una a.
         */

        String numero = JOptionPane.showInputDialog("Ingrese un número por valor:");

        /**
         * para convertir un String o un número entero a un caracter ASCII en java, se puede utilizar el casting
         * explícito para convertir el entero o el String a un tipo "char"
         */

        int num = Integer.parseInt(numero); // Convertimos la cadena a un número entero

        char caracter = (char) num;

        System.out.println("El número ingresado por el usuario pertenece al caracter: " + caracter + " ..en la tabla ASCII");

    }
}
