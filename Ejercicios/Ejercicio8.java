package Ejercicios;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Modifica el ejercicio anterior, para que en lugar de pedir un número,
         * pida un carácter (char) y muestre su código en la tabla ASCII.
         */

        String cadena = JOptionPane.showInputDialog("Por favor ingrese un caracter por favor:");

        char caracter = cadena.charAt(0); //Convirtiendo String a un valor de tipo char

        int valorASCII = caracter; // Convirtiendo un char a un entero(int)

        System.out.println(valorASCII);
    }
}
