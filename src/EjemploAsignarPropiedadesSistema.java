import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/Config.properties2");

            Properties p = new Properties(System.getProperties());
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo = " + e + " favor de revisar la ruta");
        }

    }
}
