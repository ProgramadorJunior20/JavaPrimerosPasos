public class EjemploString {
    public static void main(String[] args) {
        String curso = "programación java";
        String curso2 = new String("Programación Java");

        /**
         * A qui comparamos la referencia con la palabra recervada boolean que es un operador logico
         * boolean esIgual = (curso == curso2); compara por referencia
         */
        boolean esIgual = (curso == curso2);
        System.out.println(" curso == curso2 = " + esIgual);

        /**
         * Forma correcta de comparar String por valor y o atributo
         * compara el texto curso.equals(curso2);
         */
        esIgual = curso.equals(curso2);
        System.out.println(" curso.equals(curso2) = " + esIgual);

        /**
         * curso.equalsIgnoreCase(curso2); compara ambos String sin terner en cuenta las mayusculas
         */
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println(" curso.equalsIgnoreCase(curso2) = " + esIgual);

        // boolean operacion logica
        String curso3 = "programación java";
        esIgual = curso == curso3;
        System.out.println(" curso == curso3 = " + esIgual);
    }
}
