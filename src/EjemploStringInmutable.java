public class EjemploStringInmutable {
//se refiere a que una variable String, no se modifica si no es por metodos, a continuación se muestran ejemplos
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Carlos";
        String detalle = "Curso " + "'" + curso + "'" + " con el profesor " + profesor;
        System.out.println(detalle);

        detalle = curso.concat(profesor);
        System.out.println(detalle);

        curso.concat(profesor);
        System.out.println("curso = " + curso);

        String resultado2 = curso.transform(c -> {
            return  c + " con el profesor " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = detalle.replace("a","A");
        System.out.println("resultado3 = " + resultado3);



    }
}
