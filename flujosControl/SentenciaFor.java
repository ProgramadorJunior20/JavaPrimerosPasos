package flujosControl;

public class SentenciaFor {
    public static void main(String[] args) {

        /**for ( int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }

        // i >= 0; i-- se va a ejecutar mientras que  10 sea mayo o igual a 0
        for ( int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for ( int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }**/

        // Solamente imprimir números impares o Números pares
        for ( int i = 1; i <= 10; i++){
            if ( !(i % 2 == 0) ){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
