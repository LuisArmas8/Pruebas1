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
    }
}
