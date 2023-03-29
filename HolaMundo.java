public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola mundo desde Java"; // String es una clase "objecto"
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase()); // Atajo sout

        int numero = 10; //int es un tipo numerico primitivo

        boolean valor = true;

        int numero2 = 5;

        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = 11;

        String nombre;

        nombre = "Jefferson";
        if (numero >= 10){
            nombre = "Antonio";
        }

        System.out.println("nombre = " + nombre);
        //Integer numero = 10; //Integer es una clase "objecto"
        //numero.


    }
}
