import java.util.Scanner;

public class OperadoresLogicosLoginArr {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Jefferson";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "PePe";
        passwords[2] = "12345";*/

        String[] usernames = { "Jefferson", "admin", "PePe"};
        String[] passwords = { "123", "1234", "12345" };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese una password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for ( int i = 0; i < usernames.length; i++){

            if ( (usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p)) ){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrectos!");
            System.out.println("Lo siento, usted no esta autenticado :(");
        }

    }
}
