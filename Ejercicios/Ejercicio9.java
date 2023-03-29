package Ejercicios;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
         * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
         */

        final double IVA = 0.21; // Declaramos una constante

        String numero = JOptionPane.showInputDialog("Por favor ingrese el precio de un producto:");

        double precioSinIva = Double.parseDouble(numero); // Convertimos el String a double

        double coIva = precioSinIva + (precioSinIva * IVA); // Hacemos la operación para sacar el iva también lo sumamos precioSinIva + (precioSinIva * IVA)

        double precioFinal =  coIva; // Precio con IVA

        System.out.println("El precio final del producto con (IVA) es de:" +" "+ precioFinal);
    }
}
