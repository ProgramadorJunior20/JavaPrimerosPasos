package wrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        /**
         * Nota: cuando utilizamos el == en primitivos se calculan los valores de las variables
         * Ahora, pero cuando utilizamos el == en objetos se camparan o calculan las referencias en memoria de dichas variables
         */

        //Objetos num y num2
        Integer num = Integer.valueOf(1000);
        Integer num2 = num;

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        System.out.println("Son los mismo Objetos? " + (num == num2));

        //Si el valor de la variable es menor o igual a 125, siempre va a calcular un valor primitivo sin importar que sea un objeto
        num = 1000;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        System.out.println("Son los mismo Objetos? " + (num == num2));

        //Calculamos el valor de un objeto por medio del método equals()
        System.out.println("Tienen el mismo valor? " + (num.equals(num2)));

        //Calculamos el valor de un objeto convirtiendo el objeto a primitivo con el método inValue()
        System.out.println("Tienen el mismo valor? " + (num.intValue() == num2.intValue()));

        num2 = 2000;
        boolean condicion = num < num2;
        System.out.println("condicion = " + condicion);

        num2 = 200;
        boolean condicion2 = num.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
