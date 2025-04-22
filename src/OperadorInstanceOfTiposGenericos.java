public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un texto del Objeto String";
        Number num = Integer.valueOf(7);//7;
        System.out.println("num = " + num);

        Boolean b1 = texto instanceof String;
        System.out.println("Texto del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("num del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num del tipo Object = " + b1);

        Double doble = 54.45;
        b1 = doble instanceof Number;
        System.out.println("num del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 del tipo Boolean = " + b1);

        //Marca error
        b1 = num instanceof Long;
        System.out.println("Texto del tipo Long= " + b1);

        /*b1 = num instanceof Short;
        System.out.println("Short del tipo Long= " + b1);*/



    }
}
