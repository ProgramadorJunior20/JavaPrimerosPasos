import javax.swing.*;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {
        String max = "";

        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        max = (persona1.split("")[0].length() < persona2.split("")[0].length()) ? persona2 : persona1;
        max = (persona3.split("")[0].length() < max.split("")[0].length()) ? persona3 : max;

        System.out.println("La persona con el nombre mas largo es: " + max);

    }
}
