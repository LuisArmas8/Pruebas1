import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal: ");
        int numero1 = 0;

        try{
           numero1 = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Solo puedes ingresar numeros");
            main(args);
            System.exit(0);
        }
        if(numero1 % 2 == 0){
            String mensaje = "El numero ";
            mensaje += numero1;
            mensaje += " es PAR";

        //    int esPar = Integer.parseInt(mensaje);

            System.out.println(mensaje);

        }else{
            String mensaje2 = "El numero ";
            mensaje2 += numero1;
            mensaje2 += " no es PAR";

            System.out.println(mensaje2);
        }

//        System.out.println(numero1);

    }
}
