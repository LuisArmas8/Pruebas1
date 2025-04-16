public class EjemploStringExtArch {
    public static void main(String[] args) {
        String archivo = "1.archivo.pdf";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length() - 4));

        int extension = archivo.indexOf(".");
        System.out.println("archivo extension: " + archivo.substring(extension));
        extension = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(extension) = " + archivo.substring(extension));
    }
}
