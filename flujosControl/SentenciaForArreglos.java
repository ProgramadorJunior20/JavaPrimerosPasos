package flujosControl;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Daniela", "Daniel", "Perlita", "Pepa", "Pato"};

        int count = nombres.length;

        for (int i = 0; i < count; i++){

            if (nombres[i].equalsIgnoreCase("andres")
                    || nombres[i].equalsIgnoreCase("pato")){
                continue;
            }
            System.out.println( i + " .- " + nombres[i] );
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no fue encontrado. no existe!");
        }
    }
}
