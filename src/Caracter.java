public class Caracter {
    public static void main(String[] args) {
        char caracter = 'a';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("Char.SIZE = " + Character.SIZE);
        System.out.println("decimal = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == decimal = " + (simbolo == decimal));

        char espacio = '\u8020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Borrar ultimo caracter de esta frase" + retroceso);

    }
}
