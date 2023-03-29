package co.math;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"Azul", "Amarillo", "Rojo", "Verde", "Negro", "Blanco"};

        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);
    }
}
