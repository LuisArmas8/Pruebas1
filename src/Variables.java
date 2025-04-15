import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Ingresa nombre/s: ");
        String nombre = s.nextLine();

        System.out.println("Ingresa primer apellido: ");
        String primer_apellido = s.nextLine();

        System.out.println("Ingresa segundo apellido: ");
        String segundo_apellido = s.nextLine();

        System.out.println("Ingresa tu genero: ");
        String genero = s.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = s.nextInt();

        System.out.println("Nombre: " + nombre + " " + primer_apellido + " "
                                      + segundo_apellido );

        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);


    }
}
