package flujosControl;

import java.util.Scanner;

public class ProgramaNumeroMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a comparar: ");
        int cantidad = s.nextInt();

        // preguntamos si es menor a 10, ya
        // que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if ( cantidad < 10 ){
            System.out.println("Huus! ocurrio un error: Se deben comparar 10 números enteros por lo menos");
        } else {
            int menor = Integer.MAX_VALUE; // En esta parte asignamos el valor máximo por defecto como minimo para comenzar
            int numero = 0;

            //Con este ciclo estamos iterando la cantidad asta llegar al entero indicado, que en este caso es 10
            for (int i = 0; i < cantidad; i++){
                System.out.println("Ingrese el numero por favor" + (i + 1)+": ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El numero menor es: " + menor);
            if (menor < 10){
                System.out.println("El número menor "+ menor +" es menor que 10!");
            } else {
                System.out.println("El número menor "+ menor +" es igual o mayor que 10!");
            }
        }
    }
}
