import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

public class ContraseniaRandom {
    public static void main(String[] args) {
        // Genera una clave alfanumerica de n digitos


        String password = generaClave(10);
        System.out.println("password = " + password);

        String password2 = generaClave2(10);
        System.out.println("password = " + password2);

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

    public static String generaClave2(int n) {
        String pass = "";
        Random objetosRa = new Random();
        String[] origen = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^&*"};

        // recorrer cada matriz en el array
        for (String matriz : origen) {
            // seleccionar un elemento aleatorio de cada matriz
            int indiceAleatorio = objetosRa.nextInt(matriz.length());
            String datoSeleccionado = matriz.substring(indiceAleatorio, indiceAleatorio + 1);
            // agregar el dato seleccionado a la clave
            pass += datoSeleccionado;
        }

        // completar la clave hasta la longitud deseada
        while (pass.length() < n) {
            int indiceAleatorio = objetosRa.nextInt(origen.length);
            String matrizAleatoria = origen[indiceAleatorio];
            int indiceAleatorio2 = objetosRa.nextInt(matrizAleatoria.length());
            pass += matrizAleatoria.substring(indiceAleatorio2, indiceAleatorio2 + 1);
        }

        return pass;
    }











}