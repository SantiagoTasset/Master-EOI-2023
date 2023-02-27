import javax.swing.*;

public class IntroduccionDeDatos {
    public static void main(String[] args) {

        // Leer un dato - en formato String
        String dato;
           // metodo 1
        dato = JOptionPane.showInputDialog("Introduce un numero entero");
//        System.out.println("dato = " + dato);

        int numero = Integer.parseInt(dato); // convierte el string en un numero entero
        System.out.println("numero = " + numero);

        System.out.println("Decimal = " + numero);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numero));
        System.out.println("Octal = 0" + Integer.toOctalString(numero));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numero));




    }
}
