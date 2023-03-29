package co.com.system;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // Creamos la instancia de la clase System para almacenar K, V en la interfaz Map
        Map<String, String> varDev = System.getenv();
        System.out.print("Variables de ambiente del sistema = " + varDev); // Obtenemos la variable de entorno almacenada en varDev

        System.out.println("\n------ Listando variables de entorno del sistema ------");
        for (String key: varDev.keySet()){
            System.out.println(key + "=>" + varDev.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.print("\nusername = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.print("\njavaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.print("\ntemDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.print("\npath = " + path);

        String path2 = varDev.get("PATH");
        System.out.print("\npath = " + path2);

        String appEnv = varDev.get("APPLICATION_ENV");
        System.out.print("\nappEnv = " + appEnv);

        String hola = varDev.get("SALUDAR_HOLA");
        System.out.print("\nhola = " + hola);
    }
}
