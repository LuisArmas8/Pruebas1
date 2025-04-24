import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format =new SimpleDateFormat("yy-MM-dd");
        try {
            Date fecha = format.parse("2020-02-01");
        }catch (ParseException e){
            System.out.println("e = " + e);
        }
    }
}
