package flujosControl;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        /**
         * días y meses bisiestos ejercicio
         */

        int numeroDias = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un mes de 1 a 12 por favor: ");
        int mes = s.nextInt();

        System.out.println("Ingrese un año (YYYY) por favor: ");
        int anio = s.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                //esBisiesto si es divisible entre 400 y su residuo es 0 o si es divisible entre 4 y su residuo es 0 y que a la
                //misma vez no sea divisible por 100, si esto no se cumple no es bisiesto
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                    numeroDias = 29;
                }else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;


        }

        System.out.println("numeroDias = " + numeroDias);
        System.out.println("año = " + anio);
    }
}
