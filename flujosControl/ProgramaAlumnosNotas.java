package flujosControl;

import java.util.Scanner;

public class ProgramaAlumnosNotas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 20 notas de alumnos en una escala de 1 a 7: ");
        double notas = s.nextDouble();

        if (notas < 20){
            System.out.println("Huus! Debes 20 notas. Intentalo de nuevo");
        } else {
            double promedioNotasMayor = 0;
            double promedioNotasInfe = 0;
            double cantidadNotas = 0;
            double total = 0;

            for (int i = 0; i < notas; i++){
                System.out.println("Ingrese la nota " + (i + 1) + " por favor: ");
                cantidadNotas = s.nextDouble();

                double contador = 0;
                promedioNotasMayor = (contador + cantidadNotas) / 5;
                promedioNotasInfe = (contador + cantidadNotas) / 4;
                contador = contador + cantidadNotas;
                total = contador;
            }
            System.out.println("promedioNotasMayor = " + promedioNotasMayor);
            System.out.println("promedioNotasInfe = " + promedioNotasInfe);
            System.out.println("cantidadNotas = " + cantidadNotas);
            System.out.println("total = " + total);
        }
    }
}
