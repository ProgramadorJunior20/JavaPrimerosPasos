public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

       String trabalenguas = "trabalenguas";
        /**
         * Vamos a convertir trabalenguas en un arreglo con el metodo toCharArray()
         */
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); // siempre el length() en un string es un metodo
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; // el length en un erreglo es un atributo uno propiedad
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }
        System.out.println();

        System.out.println("\ntrabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j = 0; j < l; j++){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.,]"); // "\\."
        int la = archivoArr.length;
        System.out.println("la = " + la);

        for (int a = 0; a < la; a++){
            System.out.println("archivoArr = " + archivoArr[a]);
        }

        System.out.println("archivoArr[la - 1] = " + archivoArr[la - 1]);
    }
}
