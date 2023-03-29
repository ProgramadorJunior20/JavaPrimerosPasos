package flujosControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle: for(int i = 1; i <= 7; i++){

            int t = 1;
            while ( t <= 8 ){
                if ( i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando a las " + t + "hrs. ");

                t++;
            }

        }

        System.out.println("\n===============================================");
        //etiquetando bucle
        bucle1: for(int i = 0; i < 5; i++){

            System.out.println();
            int t = 0;
            while ( t < 5 ){
                if ( i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", t = " + t + "], ");

                t++;
            }

        }

        System.out.println("\n===============================================");
        etiqueta: for(int i = 0; i < 5; i++){

            System.out.println();
            for (int t = 0; t < 5; t++){
                if ( i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", t = " + t + "], ");
            }

        }


    }
}
