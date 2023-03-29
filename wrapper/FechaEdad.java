package wrapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una fecha con este formato 'yyyy-MM-dd'");
        String fechaStr = s.next();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date fechaDaNacimiento = df.parse(fechaStr);
            Date fechaActual = new Date();
            System.out.println("fecha2 = " + fechaActual);

            df = new SimpleDateFormat("yyyyMMdd");

            int desde = Integer.parseInt(df.format(fechaDaNacimiento));
            int hasta = Integer.parseInt(df.format(fechaActual));

            System.out.println("desde = " + desde);
            System.out.println("hasta = " + hasta);

            int edad = (hasta - desde) / 10000;
            System.out.println("La edad es: " + edad);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
