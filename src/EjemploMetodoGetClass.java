import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strString = " + strClass);
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());


        for(Method metodos: strClass.getMethods()){
            System.out.println("metodos.getName() = " + metodos.getName());
        }

        Integer num = 34;
        Class intClss = num.getClass();
        Class objClass = intClss.getSuperclass().getSuperclass();

        System.out.println("intClss.getClass() = " + intClss.getClass());
        System.out.println("intClss.getSuperclass() = " + intClss.getSuperclass());
        System.out.println("objClass = " + objClass);

        for (Method objMetodo: objClass.getMethods()){
            System.out.println("obj = " + objMetodo.getName());
        }
    }


}
