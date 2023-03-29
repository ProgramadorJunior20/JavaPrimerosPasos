package co.com.system;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploAsignarPropiedadesDeSistema2 {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            int caracter;
            while ((caracter = archivo.read()) != -1){
                System.out.print((char) caracter);
            }
            archivo.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
