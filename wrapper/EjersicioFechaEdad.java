package wrapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjersicioFechaEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la fecha de su nacimiento por valor en formato 'yyyy/MM/dd': ");
        String fechaStr = s.next();

        DateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        try {

            Date fNacimiento = formato.parse(fechaStr);
            Date fActual = new Date();

            formato = new SimpleDateFormat("yyyyMMdd");

            int fechaDeNacimiento = Integer.parseInt(formato.format(fNacimiento));
            int fechaActual = Integer.parseInt(formato.format(fActual));

            if (fechaDeNacimiento == fechaActual) {
                System.out.println("Huus!!, ocurrio un error ingrese su fecha de nacimiento");
            }

            int edad = (fechaActual - fechaDeNacimiento) / 10000;
            System.out.println("Usted tiene: " + edad + " años ");

        } catch (ParseException e){
            e.printStackTrace();
        }

    }
}
