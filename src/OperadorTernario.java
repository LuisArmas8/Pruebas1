import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? (si es verdadero)valor1:(si es falso)valor2
        //Ejemplo
        String variable = 2 == 2 ? "true":"false";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la nota de Matematicas entre 2.0 y 7.0");
        matematicas = scan.nextDouble();

        System.out.println("Ingresa la nota de Ciencias entre 2.0 y 7.0");
        ciencias = scan.nextDouble();

        System.out.println("Ingresa la nota de Historia entre 2.0 y 7.0");
        historia = scan.nextDouble();

        promedio = (matematicas+ciencias+historia) / 3;


        estado = promedio >= 5.49 ? "Aprobado":"Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);

        /*if (promedio >= 5.49){
            estado = "Aprobado";
        }else{
            estado = "rechazado";
        }
        System.out.println(estado);*/


    }
}
