package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio15RespProfesor {
    public static void main(String[] args) {
        /**
         *Lee un número por teclado y comprueba que este número es mayor o igual que cero,
         * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
         */


        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int codigo;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero mayor que 0");
            codigo=Integer.parseInt(texto);
        }while(codigo<=0);

        System.out.println(codigo);
        System.out.println(" \n Scanner ");

        int codigo1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor que 0");
            codigo1=sc.nextInt();
        }while(codigo1<=0);

        System.out.println(codigo1);
    }
}
