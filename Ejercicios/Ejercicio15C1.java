package Ejercicios;

import javax.swing.*;

public class Ejercicio15C1 {
    public static void main(String[] args) {
        /**
         *Lee un número por teclado y comprueba que este número es mayor o igual que cero,
         * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
         */

        String input;
        int num;

        try {

            do {
                input = JOptionPane.showInputDialog("Ingrese un número mayor que 0 por favor:");
                num = Integer.parseInt(input);
            } while (num <= 0); // Estamos repitiendo el input mientras este sea un entero negativo

            System.out.println("num = " + num);

        } catch (NumberFormatException e){

            System.err.println("Acaba de ocurrir un error por favor debe " +
                    "llenar el campo con un entero positivo o negativo '" + e.getMessage() + "' ");
            System.exit(-1);

        }
    }
}
