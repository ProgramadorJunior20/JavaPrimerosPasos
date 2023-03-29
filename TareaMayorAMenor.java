import java.util.Scanner;

public class TareaMayorAMenor {
    public static void main(String[] args) {

        int max = 0, min = 0;

        int num1 = 0, num2 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        num1 = s.nextInt();

        System.out.println("Ingresa un numero");
        num2 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        min = (num1 < num2) ? num1 : num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
    }

}
