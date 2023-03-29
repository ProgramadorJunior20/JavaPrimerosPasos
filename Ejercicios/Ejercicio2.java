package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Declara 2 variables numéricas (con el valor que desees),
         * he indica cual es mayor de los dos. Si son iguales indicarlo también.
         * Ves cambiando los valores para comprobar que funciona.
         */

        int num1 = 23;
        int num2 = 22;

        if (num1 > num2){
            System.out.println("El numero " + num1 + " es mayor que el número " + num2);
        } else if (num1 == num2) {
            System.out.println("El numero " + num1 + " y el numero " + num2 + " son iguales");
        } else {
            System.out.println("El numero " + num2 + " es mayor que el número " + num1);
        }
    }
}
