public class SentenciaForEach {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8,9};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Carlos"};
        for (String nom: nombres){
            System.out.println("nom = " + nom);
        }
    }
}
