import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int mes = 0;
        String nombreMes = null;

        System.out.println("Ingresa un numero de mes (1-12):");
        mes = scan.nextInt();

        switch (num){
            case 0:
                System.out.println("el num es = " + num);
                break;
            case  1:
                System.out.println("el num es = " + num);
                break;
            case  2:
                System.out.println("el num es = " + num);
                break;
            case  3:
                System.out.println("el num es = " + num);
                break;
        }
        String usuario = "Jorge";

        switch (usuario){
            case ("admin"):
                System.out.println("Bienvenido usuario = " + usuario);
                break;
            case("Pepe"):
                System.out.println("Bienvenido usuario = " + usuario);
                break;
            case ("Andres"):
                System.out.println("Bienvenido usuario = " + usuario);
                break;
            default:
                System.out.println("Usuario desconocido: " + usuario);
                break;
        }

        switch (mes){
            case(1):
               nombreMes = "Enero";
               break;
            case(2):
               nombreMes = "Febrero";
               break;
            case(3):
                nombreMes = "Marzo";
                break;
            case(4):
                nombreMes = "Abril";
                break;
            case(5):
                nombreMes = "Mayo";
                break;
            case(6):
                nombreMes = "Junio";
                break;
            case(7):
                nombreMes = "Julio";
                break;
            case(8):
                nombreMes = "Agosto";
                break;
            case(9):
                nombreMes = "Septiembre";
                break;
            case(10):
                nombreMes = "Octubre";
                break;
            case(11):
                nombreMes = "Noviembre";
                break;
            case(12):
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Ingresa un numero de mes correcto (1-12)");
                break;
        }
        System.out.println("nombreMes = " + nombreMes);

    }
}
