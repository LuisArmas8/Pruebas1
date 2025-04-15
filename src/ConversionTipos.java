import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        double doble = 10.00;
        str = String.valueOf(doble);
        System.out.println("str = " + str);
        String valor;
        System.out.println("Ingresa el nombre del caracter a buscar: ");
        valor = scan.nextLine();
        int entero1;

        System.out.println("Ingresa un numero: ");
        int entero = scan.nextInt();
            short numShort = (short) entero;
            long numLong = (long) entero;

            float numFloat = (float) entero;
            System.out.println("Numero entero = " + entero +
                    "\nconvertido a short = " + numShort +
                    "\nconvertido a long = " + numLong +
                    "\nconvertido a float = " + numFloat);
        if(valor.equals("arroba")) {
            entero1 = 64;
            char numChar = (char) entero1;
            System.out.println("convertido a char = " + numChar );
        }


    }
}
