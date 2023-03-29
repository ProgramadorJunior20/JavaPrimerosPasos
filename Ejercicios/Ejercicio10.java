package Ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        /**
         *  Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
         */

        int contador = 1;
        while (contador <= 100){
            System.out.println(contador);
            contador++;
        }
        System.out.println("\n====================do======while==============");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
