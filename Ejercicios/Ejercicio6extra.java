package Ejercicios;

import java.util.Scanner;

public class Ejercicio6extra {
    public static void main(String[] args) {
        /**
         * Lee un número por
         * teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        int num1 = sc.nextInt();

        int indice = 2;

        if ((num1 % indice) == 0){
            System.out.println("El numero = " + num1 + " es divisible entre " + indice);
        } else {
            System.out.println("El numero = " + num1 + " no es divisible entre " + indice);
        }
    }
}
