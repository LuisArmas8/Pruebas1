public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Carlos Benitez";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"AndreS\") = " + nombre.equalsIgnoreCase("AndreS"));
        System.out.println("nombre.compareTo(\"AnDrEs\") = " + nombre.compareTo("AnDrEs"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(0,5) = " + nombre.substring(0, 6));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas.replace("a","A"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"len\") = " + trabalenguas.contains("len"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());



    }
}
