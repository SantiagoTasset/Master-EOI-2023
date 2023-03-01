import java.util.Locale;

public class FuncionCapitalice {
    public static void main(String[] args) {
        String nombre = "EDuARDo ";
        String apellido1 = "corral";
        String apellido2 = "MUNOZ";

        // BUSCAR Eduardo Corral Munoz

        nombre = nombre.toUpperCase().charAt(0) + nombre.toLowerCase().substring(1);
        apellido1 = apellido1.toUpperCase().charAt(0) + apellido1.toLowerCase().substring(1);
        apellido2 = apellido2.toUpperCase().charAt(0) + apellido2.toLowerCase().substring(1);

        System.out.println(nombre+ " "+apellido1 + " " + apellido2);







    }
}
