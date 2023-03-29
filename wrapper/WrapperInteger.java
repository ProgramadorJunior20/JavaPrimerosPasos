package wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int miPrimitivo = 32768;
        String miPrimitivo2 = "23768";

        Integer miObjeto = Integer.valueOf(miPrimitivo);
        Integer miObjeto2 = Integer.valueOf(miPrimitivo2);
        System.out.println("myObjectsWrappers = " + miObjeto + " - " +  miObjeto2);

        int num = miObjeto;
        int num2 = miObjeto2.intValue();
        System.out.println("myPrimitives = " + num + " - " +  num2);

        Short shortObjeto = miObjeto.shortValue();
        System.out.println("myShortObjeto = " + shortObjeto);

        Byte byteObjeto = miObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = miObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);




    }
}
