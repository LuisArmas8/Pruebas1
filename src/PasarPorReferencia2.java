class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona =new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Iniciamos el metodo main");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test ");
        test(persona);
        System.out.println("Despues de llamar al metodo test ");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finalizamos el metodo main con datos de Persona modificado!");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test");
        persona.modificarNombre("Carlos");
        System.out.println("Finalizamos el metodo test");
    }
}
