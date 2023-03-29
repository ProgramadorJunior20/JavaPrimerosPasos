package Ejercicios;


import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Haz una aplicación que calcule el área de un círculo(pi*R2).
         * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
         * Usa la constante PI y el método pow de Math.
         */

        String radio = JOptionPane.showInputDialog("Ingrese un radio por favor: ");
        double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);

        System.out.println("area del circulo es = " + area);
    }
}
