import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr.toUpperCase() = " + fechaStr.toUpperCase());
        fechaStr = df2.format(fecha);

        long j = 0;
        for (int i = 0; i < 10000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);

        System.out.println("fechaStr.toUpperCase() = " + fechaStr.toUpperCase());

    }
}
