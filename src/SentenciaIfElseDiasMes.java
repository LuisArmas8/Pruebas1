import java.util.Scanner;

public class SentenciaIfElseDiasMes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes = 0;
        System.out.println("Ingresa un mes del 1 al 12:");
        mes = scan.nextInt();

        int numDias = 0;

        int anio = 0;
        System.out.println("Ingresa un año 'aaaa'");
        anio = scan.nextInt();


        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            numDias = 31;
            System.out.print("El mes es ".concat(String.valueOf(mes)).concat(" con un total de ").concat(String.valueOf(numDias)));
            System.out.print(" dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDias = 30;
            System.out.print("El mes es ".concat(String.valueOf(mes)).concat(" con un total de ").concat(String.valueOf(numDias)));
            System.out.print(" dias");
        } else if (mes == 2) {
            if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numDias = 29;
                System.out.println("El año es bisiesto: " + anio);

            }else {
                numDias = 28;
                System.out.println("El año no es bisiesto: " + anio);
            }
            System.out.println("con un total de " + numDias + " numDias");
        }

    }
}
