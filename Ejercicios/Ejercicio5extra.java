package Ejercicios;


import java.util.Scanner;

public class Ejercicio5extra {
    public static void main(String[] args) {
        /**
         * Haz una aplicación que calcule el área de un círculo(pi*R2).
         * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
         * Usa la constante PI y el método pow de Math.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un radio por favor: ");
        String radio = sc.next();

        //Formula area circulo, usamos algunos de los metodos de Math
        double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);

        System.out.println("area del circulo es = " + area);
    }
}
