public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int a = 14;
        int b = 8;
        int c = 20;

        double promedio = (a + b + c) / 3d;
        System.out.println(promedio);


        promedio = ((a + b + c) / 3d) * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++a + b-- + c / 3d * 10; // (15 + 8) + 66,6 = 89,6
        System.out.println(promedio);
        System.out.println("b = " + b);
    }
}
