package co.com.system;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // Getting User's account name
        String username = System.getProperty("user.name");
        System.out.println("Username = " + username);

        // Getting User's home directory
        String home = System.getProperty("user.home");
        System.out.println("Home = " + home);

        // Getting User's current working directory
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Getting Java Version
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Getting line Separator
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator2 + "Hola Soy Una linea nueva");

        // Getting All's System Properties
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
