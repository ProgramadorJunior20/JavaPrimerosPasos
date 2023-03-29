package flujosControl;

public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
                                //Incluimos toda la frase
        buscar: for (int i = 0; i <= maxFrase;){ // bucle calcula, cantidad de veces que se encuentra la letra t en el String frase
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase.!");
    }
}
