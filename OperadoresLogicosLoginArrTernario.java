import java.util.Scanner;

public class OperadoresLogicosLoginArrTernario {
    public static void main(String[] args) {

        String[] usernames = {"Jefferson", "admin", "PePe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese una password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {

            esAutenticado = (usernames[i].equalsIgnoreCase(u) &&
                    passwords[i].equalsIgnoreCase(p)) ? true : esAutenticado;

        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Usuario o contraseña incorrectos! \nLo sentimos, usted no esta autenticado en este momento :(";
        System.out.println("mensaje = " + mensaje);


    }
}
