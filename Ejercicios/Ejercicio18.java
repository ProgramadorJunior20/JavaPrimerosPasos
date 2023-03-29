package Ejercicios;

import javax.swing.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        /**
         * Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método
         * Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
         */
        String input1 = JOptionPane.showInputDialog("Ingrese un numero por favor:");
        String input2 = JOptionPane.showInputDialog("Ingrese un numero por favor:");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        for(int i = 0; i < 10; i++){
            // Ahora estamos listos para obtener los números aleatorios de num1 y num2
            int numAleatorio = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            System.out.println(numAleatorio);
        }
    }
}
