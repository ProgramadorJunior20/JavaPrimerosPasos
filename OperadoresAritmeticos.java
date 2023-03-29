import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multu = i * j;
        System.out.println("multuplicación = " + multu);

        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        /**
         * el resto de 8 y 5 el resultado deberia ser 3 ya que el número 5 cabe una sola vez en 8 y sobran 3
         * **/
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        /**Asumiendo que "n1" y "n2" son enteros (int), esta sentencia
            int restante = n1 % n2;
            equivale a...
            int restante = n1 - (n1 / n2 * n2);
         **/

        // El numero es par
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }


    }
}
