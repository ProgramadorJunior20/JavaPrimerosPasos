package flujosControl;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un mes de 1 a 12 por favor: ");
        int mes = s.nextInt();

        /**
         * días y meses bisiestos ejercicio
         */
        int numeroDias = 0;

        System.out.println("Ingrese un año (YYYY) por favor: ");
        int anio = s.nextInt();

       if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
       } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
           numeroDias = 30;
       } else if ( mes == 2) {
           //esBisiesto si es divisible entre 400 y su residuo es 0 o si es divisible entre 4 y su residuo es 0 y que a la
           //misma vez no sea divisible por 100, si esto no se cumple no es bisiesto
           if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
           }else {
                numeroDias = 28;
           }
       }
        System.out.println("numeroDias = " + numeroDias);
        System.out.println("año = " + anio);
    }
}
