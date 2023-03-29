package co.math;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("Valor máximo = " +  max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Valor mínimo = " +  min);

        double techo = Math.ceil(3.5);
        System.out.println("Redondea hacia arriba = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("Redondea hacia abajo = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("Con este método se redondea = " + entero);
    }
}
