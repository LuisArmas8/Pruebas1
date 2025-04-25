import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        //String fechaDb = "2023-04-20";

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha (del usuario) es depues que fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es anterior que fecha2");

            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha y fecha2 son iguales");
            }
        }catch (ParseException e){
//            e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.out.println("Ingrese otra fecha con formato 'yyyy-MM-dd'");
//          System.exit(1);
            main(args);
        }
    }
}
