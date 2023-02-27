import java.util.Scanner;

public class IntroduccionDatosPorConsolaError2 {
    public static void main(String[] args) {
        // Leer dato desde consola

        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        dato = entrada.nextLine();


        //control de error
        try{
            int numero = Integer.parseInt(dato);
            System.out.println("numero = " + numero);
            System.out.println("Decimal = " + numero);
            System.out.println("Binario = 0b" + Integer.toBinaryString(numero));
            System.out.println("Octal = 0" + Integer.toOctalString(numero));
            System.out.println("Hexadecimal = 0x" + Integer.toHexString(numero));
        } catch (NumberFormatException e) {
            System.out.println("e.toString() = " + e.toString()); //te marca el error, no bloquea el programa. error handling
            System.out.println("Error - Has introducido un numero no valido");
            //lamada al metodo main para volver a pedirte el dato si da error
                //main(args); pero no termina la ejecucion anterior y solamente imprime hasta el 0
            main(args);
            System.exit(0); //codigo error 0, sale porque no hubo ningun error. Siempre tiene que temrinar con codigo de salida 0
        }



    }
}
