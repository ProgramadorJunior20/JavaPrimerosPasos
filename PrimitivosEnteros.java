public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        System.out.println("\n************* short ***************");
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        System.out.println("\n************* int ***************");
        int numeroInt = 2000000000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        System.out.println("\n************* long ***************");
        long numeroLog = 9223372036854775807L;
        System.out.println("numeroLog = " + numeroLog);
        System.out.println("tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

        System.out.println("\n************* float ***************");
        float numeroFloat = 9223372036854775808F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float: " + Float.MIN_VALUE);

        System.out.println("\n************* double ***************");
        double numeroDouble = 1.7976931348623157E308D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double: " + Double.MIN_VALUE);

        // var siempre va a ser un Integer hasta que su valor cambien a un tipo de dato más grande
    }
}
