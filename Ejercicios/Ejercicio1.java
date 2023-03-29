package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Declara dos variables numéricas (con el valor que desees),
         * muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
         */

        int a = 2;
        int b = 13;

        int suma = (a + b);
        int resta = (a - b);
        int multi = (a * b);
        int división = (a / b);
        int modulo = (a % b);

        System.out.println("La suma de " + a + " + " + b + " es " + suma);
        System.out.println("La resta de " + a + " - " + b + " es " + resta);
        System.out.println("La multiplicación de " + a + " * " + b + " es " + multi);
        System.out.println("La división de " + a + " / " + b + " es " + división);
        System.out.println("El módulo de " + a + " % " + b + " es " + modulo);
    }
}
