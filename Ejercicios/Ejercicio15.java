package Ejercicios;

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        /**
         *Lee un número por teclado y comprueba que este número es mayor o igual que cero,
         * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
         */

        String input;
        int num;
        int contador;

        try {
            input = JOptionPane.showInputDialog("Ingrese un número por favor:");
            num = Integer.parseInt(input);

            contador = 0;
            do {
                if (num >= 0){
                    System.out.println("Este número es mayor o igual a zero! = " + num);
                    System.exit(0);
                } else {
                    input = JOptionPane.showInputDialog("Ingrese un número igual o mayor que 0 por favor:");
                    num = Integer.parseInt(input);
                }
                contador++;
            } while (contador < 2);

        } catch (NumberFormatException e){

            System.err.println("Acaba de ocurrir un error por favor debe " +
                    "llenar el campo con un entero positivo o negativo '" + e.getMessage() + "' ");
            System.exit(-1);

        }
    }
}
