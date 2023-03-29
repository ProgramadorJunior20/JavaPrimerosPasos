package co.com.system;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema3 {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.setProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
