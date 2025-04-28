public class EjemploCalseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);

        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto2 = " + absoluto);

        double max = Math.max(3.5, 4.7);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 4.7);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        double redondeo = Math.round(6.7);
        System.out.println("redondeo ascendente = " + redondeo);

        double redondeo2 = Math.round(6.4);
        System.out.println("redondeo2  = " + redondeo2);

        double pi = Math.PI;
        System.out.println("pi = " + pi);
        //Redondear PI forma larga (se toma el valor de la variable definida arriba)
        double pi2 = Math.round(pi);
        System.out.println("pi2 = " + pi2);

        //Forma corta
        double piRedondeado = Math.round(Math.PI);
        System.out.println("piRedondeado = " + piRedondeado);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(90);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(grados);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("con(90) = " + Math.cos(radianes));

    }
}
