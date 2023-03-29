package Ejercicios;

import javax.swing.*;

public class Ejercicio14Extra {

    public static double[] resolverEcuacionSegundoGrado(double a, double b, double c){

        // Utilizamos el metodo pow para resolver el calculo de discriminate
        double discriminante = Math.pow(b, 2) - (4*a*c);

        System.out.println(" <<>> " + discriminante);

        if (discriminante < 0){
            return null; // La ecuación no tiene soluciones reales
        } else if (discriminante == 0) {
            double[] x = new double[1];
            x[0] = -b / (2*a);
            return x; // La ecuación tiene una solución doble
        } else {
            double[] x = new double[2];
            x[0] = (-b + Math.sqrt(discriminante) / (2*a));
            x[1] = (-b - Math.sqrt(discriminante) / (2*a));
            return x; // La ecuación tiene dos soluciones distintas
        }

    }

    public static void main(String[] args) {

        /**
         * Realiza una aplicación que nos calcule una ecuación de segundo grado.
         * Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada).
         * Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
         */

        String input1 = JOptionPane.showInputDialog("Ingrese un numero por favor:");
        double a = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Ingrese un numero por favor:");
        double b = Double.parseDouble(input2);
        String input3 = JOptionPane.showInputDialog("Ingrese un numero por favor:");
        double c = Double.parseDouble(input3);

        double[] soluciones = resolverEcuacionSegundoGrado(a, b, c);

        if (soluciones == null){
            System.out.println("La ecuación no tiene soluciones reales");
        } else if (soluciones.length == 1) {
            System.out.println("La ecuación tiene una solución doble x = " + soluciones[0]);
        } else {
            System.out.println("La ecuación tiene dos soluciones distintas:");
            System.out.println("x1 = " + soluciones[0]);
            System.out.println("x2 = " + soluciones[1]);
        }
    }
}
