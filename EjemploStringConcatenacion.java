public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "programación java";
        String profesor = "Jefferson Murillo";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 9;

        /***
         * Concatenaciones de String y Integer
         * esta es una de las muchas formas en que se pueden concatenar un string
         * también vamos a concatenar con el metodo concat();
         */
        //System.out.println(detalle +" "+ (numeroA + numeroB));
        System.out.println(numeroA + numeroB +" "+ detalle);

        //Utilizando concat
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
