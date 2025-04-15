public class EjemploStringConcat {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Carlos";
        String detalle = "Curso " + "'" + curso + "'" + " con el profesor " + profesor;
        System.out.println(detalle);

        detalle = curso.concat("' con el profesor ").concat(profesor);
        System.out.println("Curso '" + detalle);
    }
}
