import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float promedio = 0.0f;
        System.out.println("Ingresa tu promedio: ");
        promedio = scan.nextFloat();

        if (promedio>= 6.5){
            System.out.println("Excelente promedio");
        }else if (promedio >= 6.0){
            System.out.println("Buen promedio");
        } else if (promedio>= 5.0) {
            System.out.println("Estas reprobado");
        } else if (promedio<5.0) {
            System.out.println("Estas reprobado, pesimo promedio, ".concat("necesitas esforzarte mas"));
        }
    }
}
