public class EjemploStringTestRenConcat {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = a + b;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();


        for(int i = 0; i < 1000; i++){
           // c = c.concat(a).concat(b).concat("\n"); // 500 ==> 2MS
           // c += a+b+"\n"; // 500 ==> 19MS
            sb.append(a).append(b).append("\n"); // 500 ==> 0MS, 1000 ==> 0MS

        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
