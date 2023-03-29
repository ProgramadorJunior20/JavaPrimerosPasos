public class OperadorTernario {
    public static void main(String[] args) {

        // variable = condición ? si es verdadero : si es falso
        String variable = 7 == 5 ? "si, es verdadero" : "si, es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 60.9;

        estado = promedio >= 60.0 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);

        /** if ( promedio >= 60.0 ){
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }  Esto equivale a
         double promedio = 60.9;
         estado = promedio >= 60.0 ? "Aprobado": "Rechazado";
         **/

    }
}
