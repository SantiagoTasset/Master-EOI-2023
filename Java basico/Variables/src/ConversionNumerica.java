public class ConversionNumerica {
    public static void main(String[] args) {

        int numero = 0b1110;
        System.out.println("Decimal = " + numero);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numero));
        System.out.println("Octal = 0" + Integer.toOctalString(numero));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numero));

    }
}
