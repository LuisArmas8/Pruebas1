import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

     /*   String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "Pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Andres","admin","Pepe"};
        String[] passwords = {"123","1234","12345"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el USERNAME: ");
        String u = scan.nextLine();

        System.out.println("Ingrese el PASSWORD: ");
        String p = scan.nextLine();

        boolean esAutenticado = false;

        for(int i=0; i<usernames.length;i++){
            if( usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }


        if(esAutenticado==true){
            System.out.println("Bienvenido USUARIO ".concat(u).concat("!"));
        }else {
            System.out.println("Credenciales Incorrectas");
            System.out.println("¡Lo siento, requiere autenticacion!");
        }
    }
}
