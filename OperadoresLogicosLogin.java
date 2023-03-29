import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Jefferson";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese una password");
        String p = scanner.next();

        boolean esAutenticado = false;

        if ( (username.equalsIgnoreCase(u) && password.equalsIgnoreCase(p))
                || (username2.equalsIgnoreCase(u) && password2.equalsIgnoreCase(p)) ){
            esAutenticado = true;
        } else {
            System.out.println("Username o contraseña incorrectos!");
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, usted no esta autenticado :(");
        }

    }
}
