import java.util.Random;
import java.util.stream.LongStream;

public class GenerarPasswordAleatoria {
    public static void main(String[] args) {
        // Genera una clave alfanumerica de n digitos


        String password = generaClave(10);
        System.out.println("password = " + password);

    }
     public static String generaClave(int n) {
         Random objetosRa = new Random();
         String origen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
         int rnd;
         String pass="";


         int num = objetosRa.nextInt();


         for (int i = 0; i < n; i++) {
             rnd = objetosRa.nextInt(origen.length());
             pass += origen.charAt(rnd);
         }
         return pass;

     }

    // que contenga al menos una Mayuscula, una minuscula y al menos un caracter especial( "@#$$")

     public static String generaClave2(int n){
         String pass="";
         Random objetosRa = new Random();
         String[][] origen = {{"ABCDEFGHIJKLMNOPQRSTUVWXYZ"},{"abcdefghijklmnopqrstuvwxyz"},{"0123456789"},{"!@#$%^&*"}};




         return pass;


     }









}
