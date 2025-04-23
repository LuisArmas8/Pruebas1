import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

//        String[] nombres = new String[6];
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Carlos"};
        int count = nombres.length;

        System.out.println("for 1");
        for (int i = 0; i < count;i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
               nombres[i].equalsIgnoreCase("PEPE")) {
                continue;
            }else {
                System.out.println(i + ".- nombre = " + nombres[i]);
            }
        }
        System.out.println("\nfor 2");
        for (int i = 0; i < count;i++){
            if(nombres[i].equals("andres") ||
                    nombres[i].equals("PEPE")) {
                continue;
            }else {
                System.out.println(i + ".- nombre = " + nombres[i]);
            }
        }

        System.out.println("\nfor 3");
        for (int i = 0; i < count;i++){
            if(nombres[i].toLowerCase().contains("andres") ||
                    nombres[i].contains("PEPE")) {
                continue;
            }else {
                System.out.println(i + ".- nombre = " + nombres[i]);
            }
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un numbre a buscar: ");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;

        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");

        }
    }
}
