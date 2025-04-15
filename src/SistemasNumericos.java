import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Ingrese un numero decimal: ");
        int numero1 = 0;
        try{
            numero1 = Integer.parseInt(str);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros");
            main(args);
            System.exit(0);
        }
        if(numero1 % 2 == 0){
            String mensaje = "El numero ";
            mensaje += numero1;
            mensaje += " es PAR";

        //    int esPar = Integer.parseInt(mensaje);

            JOptionPane.showMessageDialog(null,mensaje);

        }else{
            String mensaje2 = "El numero ";
            mensaje2 += numero1;
            mensaje2 += " no es PAR";

            JOptionPane.showMessageDialog(null,mensaje2);
        }

//        System.out.println(numero1);

    }
}
