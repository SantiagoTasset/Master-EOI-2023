import java.util.Scanner;

public class IntroduccionDatosPorConsolaError {
    public static void main(String[] args) {
        // Leer dato desde consola

        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce \"un\" numero entero: "); // para escribir algo entre comillas utilizar \" \"
        dato = entrada.nextLine();
        int numero = 0;

        //control de error
        try{
            numero = Integer.parseInt(dato);
        } catch (NumberFormatException e) {
            System.out.println("Error - Has introducido un numero no valido");
            //lamada al metodo main para volver a pedirte el dato si da error
                //main(args); pero no termina la ejecucion anterior y solamente imprime hasta el 0
            main(args);
            System.exit(0); //codigo error 0, sale porque no hubo ningun error. Siempre tiene que temrinar con codigo de salida 0
        }

        System.out.println("numero = " + numero);
        System.out.println("Decimal = " + numero);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numero));
        System.out.println("Octal = 0" + Integer.toOctalString(numero));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numero));

    }
}
