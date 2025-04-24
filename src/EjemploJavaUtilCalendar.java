import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2020,0,25,0,20,0);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        calendario.set(Calendar.YEAR,2025);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 23);

        calendario.set(Calendar.HOUR_OF_DAY,18);
        calendario.set(Calendar.MINUTE, 32);
        calendario.set(Calendar.SECOND, 56);

        Date fecha3 = new Date();
        System.out.println("Fecha sin formato: " + fecha3.toString().toUpperCase());

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaConFormato = formato.format(fecha3);
        System.out.println("Fecha Con Formato = " + fechaConFormato);


    }
}
