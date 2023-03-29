public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        /**
         * Objetos de tipos primitivos
         */
        Object texto = "Creando un objeto de la clase string ... que tal!";

        Number num = 7; // Objeto del primitivo Int

        //creando una instancia de la forma correcta
        Integer num1 = Integer.valueOf(7);  //7;
        System.out.println("num1 = " + num1);

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);


        System.out.println("*** Integer ***");

        boolean b2 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b2);


        b2 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b2);

        b2 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b2);

        b2 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b2);

        b2 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b2);

        System.out.println("*** Double ***");

        Number decimal = 45.54;

        boolean b3 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Double = " + b3);

        b3 = decimal instanceof Float;
        System.out.println("Decimal es del tipo Float = " + b3);

        b3 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Object = " + b3);

        b3 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b3);
    }
}
