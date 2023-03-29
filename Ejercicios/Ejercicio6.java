package Ejercicios;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Lee un número por
         * teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
         */
              //text
        String num1 = JOptionPane.showInputDialog("Ingrese in numero por favor:");

        //Pasamos el String a int
        //int num1 =Integer.parseInt(text);

        int indice = 2;

        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (Integer.parseInt(num1) % indice == 0){
            System.out.println("El numero = " + num1 + " es divisible entre " + indice);
        } else {
            System.out.println("El numero = " + num1 + " no es divisible entre " + indice);
        }
    }
}
