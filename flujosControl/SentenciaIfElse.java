package flujosControl;

import java.security.Security;
import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 0.0f;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su promedio: ");
        promedio = s.nextFloat();

        if (promedio >= 6.5){
            System.out.println("Felicitaciones, su promedio es excelente!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte un poco más!");
        } else  if (promedio >= 4.0) {
            System.out.println("Promedio insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Su promedio no le alcanza, usted esta Reprobado!");
        }

        System.out.println("Tu promedio es = " + promedio);
    }
}
