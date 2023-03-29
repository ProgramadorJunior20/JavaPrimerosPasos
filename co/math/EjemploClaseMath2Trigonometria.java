package co.math;

public class EjemploClaseMath2Trigonometria {
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

        double exp = Math.exp(2);
        System.out.println("exponente = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raizCuadrada = Math.sqrt(5);
        System.out.println("raizCuadrada = " + raizCuadrada);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados " + grados);

        double radianes = Math.toRadians(90d);
        System.out.println("convertir de grados a radianes " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180d);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0d);
        System.out.println("cos(0.00): " + Math.cos(radianes));
    }
}
