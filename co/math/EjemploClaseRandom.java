package co.math;

import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {

        String[] colores = {"Azul", "Amarillo", "Rojo", "Verde", "Negro", "Blanco"};

        // Instanciamos la clase randonm
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(colores.length);

        if ( randomInt == 4){
            System.out.println("randomInt Condición = " + randomInt);
            int suma = 12 + 12;
            System.out.println("suma = " + suma);
        } else {
            System.out.println("randomInt = " + colores[randomInt] + " - " + randomInt);
        }

        // Retorna un pseudorandom uniforme los posibles rangos ejemplo 2 a la 32 positivo y negativo
        //long randomInt = randomObj.nextLong();
        //int randomInt = randomObj.nextInt();

        // obtener un numero aleatorio entre 15 y 25
        //int randomInt = 15 + randomObj.nextInt(25 - 15);
        //System.out.println("randomInt = " + randomInt);


    }
}
