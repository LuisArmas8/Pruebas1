import java.util.Scanner;

public class OperadorTernarioNumMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scan.nextInt();

        System.out.println("Ingrese un 2do numero:");
        int num2 = scan.nextInt();

        System.out.println("Ingrese un 3er numero: ");
        int num3 = scan.nextInt();

        System.out.println("Ingrese un 4to numero: ");
        int num4 = scan.nextInt();


        max = (num1>num2) ? num1:num2;
        max = (max > num3) ? max:num3;
        max = (max > num4) ? max:num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es = " + max);

    }
}
