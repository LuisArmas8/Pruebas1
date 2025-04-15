public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

//Cuando los valores son los mismos, pero son creados de diferente manera, al momento de compararlos con '=='
//mandara 'false', ya que de cierta manera son distintos, pero si son creados de la misma forma, mandara 'true'
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

//Cuando los valores son los mismos y som creados de diferente manera y se compara con '.equals', mandara 'true'
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);


    }
}
