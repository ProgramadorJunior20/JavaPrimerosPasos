public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Jefferson";

        /**
         * obtenemos toda la longitud de una cadena en integer
         */
        System.out.println("nombre = " + nombre.length());

        /**
         * Convierte la cadena de texto en mayusculas
         */
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        /**
         * Convierte la cadena de texto en minuscula
         */
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        /**
         * Comparando un string con otro a nivel de valor
         */
        //String cadena = "Hola mundo";
        System.out.println("nombre = " + nombre.equals("Jefferson"));
        System.out.println("nombre = " + nombre.equals("jefferson"));
        System.out.println("nombre.equalsIgnoreCase(\"jefferson\") = " + nombre.equalsIgnoreCase("jefferson"));
        System.out.println("nombre = " + nombre.compareTo("Jefferson"));
        System.out.println("nombre.compareTo(\"Jeffer\") = " + nombre.compareTo("Jeffer"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(8) = " + nombre.charAt(8));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        /**
         * método substring obtener parte del string o un fragmento de mismo
         */
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0, 9) = " + nombre.substring(0, 9));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // Busca la ultima ocurrencia
        /***
         * El metodo contains() puede recibir una cadena de caracteres, si contiene la ocurrencia nos
         * devuelve true o false
         */
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        /**
         * Con el metodo trim() podemos quitar espacios de cualquier cadena de texto a la derecha o a la izquierda
         */
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
