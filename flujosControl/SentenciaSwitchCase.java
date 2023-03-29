package flujosControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 2;

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Número o caracter desconocido");

        }

        /**String nombre = "Jefferson";

        switch (nombre){
            case "Murillo":
                System.out.println("Mi nombre es Murillo");
                break;
            case "Jeff":
                System.out.println("Mi nombre es Jeff");
                break;
            case "Jefferson":
                System.out.println("Soy Jefferson");
                break;
            default:
                System.out.println("El usuario que ingresaste no es valido");
        }*/



        /**Scanner s = new Scanner(System.in);
        System.out.println("Un número de mes por favor: ");
        int Mes = s.nextInt();
        String NombreMes = null;

        switch (Mes){
            case 1:
                NombreMes = "Enero";
                break;
            case 2:
                NombreMes = "Febrero";
                break;
            case 3:
                NombreMes = "Marzo";
                break;
            case 4:
                NombreMes = "Abrir";
                break;
            case 5:
                NombreMes = "Mayo";
                break;
            case 6:
                NombreMes = "Junio";
                break;
            case 7:
                NombreMes = "Julio";
                break;
            case 8:
                NombreMes = "Agosto";
                break;
            case 9:
                NombreMes = "Septiembre";
                break;
            case 10:
                NombreMes = "Octubre";
                break;
            case 11:
                NombreMes = "Noviembre";
                break;
            case 12:
                NombreMes = "Diciembre";
                break;
            default:
                System.out.println("Número del mes no existe!");

        }
        System.out.println("NombreMes = " + NombreMes); **/
    }
}
