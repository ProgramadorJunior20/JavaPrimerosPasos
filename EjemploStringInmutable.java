public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "programación java";
        String profesor = "Jefferson Murillo";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        System.out.println(curso == resultado);

        /****
         * transform() esta funcion recibe una expreción lambda, que al final es un
         * bloque de codigo con el que puedes concatenar String.
         *
         * el metodo transform() esta apartir de la verción 12 hacia arriba
         */

        String curso2 = curso.replace("p", "P");
        System.out.println("curso2 = " + curso2);

        String curso3 = curso.replace("j", "J");
        System.out.println("curso3 = " + curso3);

    }
}
