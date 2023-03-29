package Ejercicios;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        /**
         * Realiza una aplicación que nos calcule una ecuación de segundo grado.
         * Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada).
         * Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
         */
        // Ingresamos los valores de lava variables por teclado
        String input1 = JOptionPane.showInputDialog("Ingrese un numero por favor: ");
        double a = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese un numero por favor: ");
        double b = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Ingrese un numero por favor: ");
        double c = Double.parseDouble(input3);

        // Ahora vamos a calcular las discriminantes con el Motodo de Math pow
        double discriminante = Math.pow(b, 2) - (4*a*c);

        System.out.println(" <<>> " + discriminante);

        if (discriminante < 0){
            //La ecuación no tiene soluciones reales
            System.out.println("La ecuación no tiene soluciones reales");
        } else if (discriminante == 0) {
            double[] x = new double[1];
            x[0] = -b / (2*a);
            //La ecuación tiene una solución doble
            System.out.println("La ecuación tiene una solución doble " + x[0]);
        } else {
            double[] x = new double[2];
            x[0] = (-b + Math.sqrt(discriminante)) / (2*a);
            x[1] = (-b - Math.sqrt(discriminante)) / (2*a);
            // La ecuación tiene dos soluciones distintas
            System.out.println("La ecuación tiene dos soluciones distintas:");
            System.out.println("x1 = " + x[0]);
            System.out.println("x2 = " + x[1]);
        }


    }
}
