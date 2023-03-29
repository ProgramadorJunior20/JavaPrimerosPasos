package Ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
         */

        int contador = 1;

        while (contador <= 100){
            if ((contador % 2 == 0) || (contador % 3 == 0)){
                System.out.println(contador);
            }
            contador++;
        }
        System.out.println("\n ===================for==================");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 || i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
