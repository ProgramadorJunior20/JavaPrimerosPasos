import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 36;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        var salto = "\n";
        String mensaje = resultadoBinario;
        mensaje += salto + resultadoOctal;
        mensaje += salto + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
