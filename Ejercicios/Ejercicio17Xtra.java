package Ejercicios;

import java.util.Scanner;

public class Ejercicio17Xtra {
    public static void main(String[] args) {
        /**
         * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.
         * Usa un switch para ello.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dias = sc.next();

        switch (dias){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("No es un dia laboral");
            default:
                System.out.println("Ingresa un dia de la semana por favor");
        }
    }
}
