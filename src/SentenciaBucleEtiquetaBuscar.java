public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "Tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i < maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado " + cantidad + " veces la palbara '" + palabra + "'");
    }
}
