import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su descripción aquí: ");
        System.out.println("Ingrese el número de la factura: ");

        String descripcion = "";
        double precio1 = 0;
        double precio2 = 0;

        try {
            descripcion = scanner.nextLine();
            precio1 = scanner.nextDouble();
            precio2 = scanner.nextDouble();

        } catch (Exception e) {
            System.out.println("Acaba de ocurrir un error!");
            main(args);
            System.exit(0);
        }

        double total = precio1 + precio2;
        double impuesto = total * 0.15;
        double totalBruto = total + impuesto;

        String mensaje = "La factura " + descripcion + " tiene un total en bruto de " + total
                + " con un impuesto de " + impuesto + " Total en bruto " + totalBruto;

        System.out.println(mensaje);

    }
}
