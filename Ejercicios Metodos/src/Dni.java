import java.util.Scanner;

public class Dni {
    public static void main(String[] args) {

        numDni();
        letraDni();
    }

    static int numeroDni; //anadir el static para que los otros metodos al ser static lo puedan leer
    static int numeroResto;
    static String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public static void numDni () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu numero de DNI: ");
        numeroDni = scanner.nextInt();
    }

    public static void letraDni () {
        numeroResto = numeroDni % 23;
        System.out.println("La letra de tu DNI es: " + letras[numeroResto]);
    }
}
