package Ejercicios;


import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        /**
         * Realiza una aplicación que nos pida un número de ventas a introducir,
         * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
         * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
         */
        String input = JOptionPane.showInputDialog("Introdusca el numero de ventas que usted desee:");
        int ventas = Integer.parseInt(input);

        int contador = 0;

        for (int i = 1; i <= ventas; i++){
            String input2 = JOptionPane.showInputDialog("venta:" + i + ":");
            int venta = Integer.parseInt(input2);
            contador += venta;
        }

        System.out.println(contador);
    }
}
