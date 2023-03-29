public class ArgumentosLineaComandosCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Por favor ingrasar una operación " +
                    "(suma, resta, div, multi) y dos números enteros");
            System.exit(-1);
        }

        String operacion = args[0];

        int a = 0;
        int b = 0;

        double resultado = 00.0;

        try {

            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (NumberFormatException e){
            System.err.println("Cuidado a y b deben de ser enteros, vuelva a intentar! " + e.getMessage());
            System.exit(-1);
        }

        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0){
                    System.err.println("No se puede dividir por zero!");
                    System.exit(-1);
                }
                resultado = (double)a / b;
                break;
            default:
                resultado = a + b;

        }
        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);
    }
}
