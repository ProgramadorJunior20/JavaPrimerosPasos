import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String estado = "";

        double capacidadActual = 0;

        System.out.println("Ingrese la medida de su capacidad actual de gas: ");
        capacidadActual = s.nextDouble();

        estado = (capacidadActual == 70) ? "Estanque lleno" :
                (capacidadActual >= 60 && capacidadActual < 70) ? "Estanque casi lleno" :
                        (capacidadActual >= 40.0 && capacidadActual < 60.0) ? "Estanque 3/4" :
                                (capacidadActual >= 35.0 && capacidadActual < 40.0) ? "Medio Estanque" :
                                        (capacidadActual >= 20.0 && capacidadActual < 35.0) ? "Suficiente" :
                                                (capacidadActual >= 1 && capacidadActual < 20.0) ? "Insuficiente" : "Vacio";
        System.out.println("estado = " + estado);


    }
}
