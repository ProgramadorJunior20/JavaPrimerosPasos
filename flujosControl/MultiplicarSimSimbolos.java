package flujosControl;

import java.util.Scanner;

public class MultiplicarSimSimbolos {
    public static void main(String[] args) {
        /**
         * Mediante el teclado pedir dos números enteros
         * positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
         *
         * Puede utilizar una sentencia for para realizar
         * la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero A: ");
        int a = s.nextInt();

        System.out.println("Ingrese el numero B: ");
        int b = s.nextInt();
        int resultado = 0;

        //Verificamos los signos de a y b para saber si son negativos o positivos
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        //Ahora vamos a calcular el valor absoluto de a
        int absolutoA = positivoA ? a : -a; // Esto es aquivalente a Math.abs(a)

        //A qui vamos a sumar tantas veces el valor de b, segun el valor a
        for (int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);

    }
}
