import java.util.Scanner;

public class IntroduccionDatosPorConsola {
    public static void main(String[] args) {
        // Leer dato desde consola

        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        dato = entrada.nextLine();

        System.out.println("dato = " + dato);

        int numero = Integer.parseInt(dato); // convierte el string en un numero entero
        System.out.println("numero = " + numero);
        System.out.println("Decimal = " + numero);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numero));
        System.out.println("Octal = 0" + Integer.toOctalString(numero));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numero));





    }
}
