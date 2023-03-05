import java.util.Scanner;

public class DniSinMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu numero de DNI: ");
        int numeroDni = scanner.nextInt();
        
        int numeroResto = numeroDni%23;

        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        System.out.println("Letra de tu DNI = " + letras[numeroResto]);
    }
}
