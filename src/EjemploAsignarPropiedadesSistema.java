import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("d:/Cursos/Java/IdeaProjects/Pruebas/src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Valor agregado al archido de properties");

            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e) {
//          System.out.println("No existe el archivo = " + e + " favor de revisar la ruta");
            System.err.println("No existe el archivo en el sistema " + e);
        }

    }
}
