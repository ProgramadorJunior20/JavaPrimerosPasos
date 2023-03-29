package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
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
                System.out.println("Es un dia laboral");
                break;
            case "Martes":
                System.out.println("Es un dia laboral");
                break;
            case "Miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "Jueves":
                System.out.println("Es un dia laboral");
                break;
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            default:
                System.out.println("No es un dia laboral");
        }
    }
}
