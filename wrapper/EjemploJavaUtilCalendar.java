package wrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // Agrega o asignar una fecha en particular manualmente
        //calendario.set(1970, Calendar.SEPTEMBER, 25, 18, 20, 10);
        // Asignando parte por parte mes, año y día
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.MARCH);
        calendario.set(Calendar.DAY_OF_MONTH, 13);

        // Ahora asignamos la hora
        //calendario.set(Calendar.HOUR_OF_DAY, 15);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 32);
        calendario.set(Calendar.SECOND, 20);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha Con Formato = " + fechaConFormato);
    }
}
