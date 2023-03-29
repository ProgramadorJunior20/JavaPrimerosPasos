package co.math;

import javax.swing.*;

public class CalculaAreaCircle {
    public static void main(String[] args) {
        /**
         * Calcular el área de un circulo.
         * area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
         */
        String input = JOptionPane.showInputDialog("Ingrese el radio por favor: ");
        double radio = Double.parseDouble(input);

        double area = Math.PI * Math.pow(radio, 2); // Calculamos el esponente y imprimimos el resultado
        System.out.println("area = " + area);
    }
}
