import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double randomAleatorio = Math.random();
        System.out.println("randomAleatorio = " + randomAleatorio);

        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Morado", "Negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random*= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("Random: " + (int)random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);


    }
}
