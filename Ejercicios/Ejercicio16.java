package Ejercicios;

import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        /**
         * Escribe una aplicación con un String que contenga una contraseña cualquiera.
         * Después se te pedirá que introduzcas la contraseña, con 3 intentos.
         * Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
         * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
         */
        final int INTENTOS = 3;
        String contraseña = "Jeffer123m@";
        boolean acierta = false;

        for (int i = 0; i < INTENTOS && !acierta; i++) {
            String pass = JOptionPane.showInputDialog("Ingrese una contraseña:");
            if (pass.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste!!");
                acierta = true;
            }
        }

    }
}
