package Ejercicios;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
         */

        String nombre = JOptionPane.showInputDialog("Ingrese sun nombre por favor:");
        System.out.println("Bienvenido " + nombre);
    }
}
