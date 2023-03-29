package Ejercicios;

import java.util.Scanner;

public class Ejercicio9xtra {
    public static void main(String[] args) {
        /**
         * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
         * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
         */

        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio de un producto:");
        double precioSinIva = sc.nextDouble();

        double precioFinal =  precioSinIva + (precioSinIva * IVA);

        System.out.println("El precio final del producto con (IVA) es de:" +" "+ precioFinal + " Pesos Colombianos");
    }
}
