import java.util.Scanner;

public class OperadorTernarioScanner {
    public static void main(String[] args) {

        String estado = "";
        double promedio = 00.0;
        double matematicas = 00.0;
        double ciencias = 00.0;
        double historia = 00.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 50.0 y 90.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 50.0 y 90.0: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 50.0 y 90.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 50.0 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);

    }
}
