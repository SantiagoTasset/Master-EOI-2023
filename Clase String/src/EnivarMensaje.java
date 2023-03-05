import java.util.Scanner;

public class EnivarMensaje {
    public static void main(String[] args) {

        //1 Introducir nombre apellido e email por consola
        //2 Capitalizar nombre y aplledios (poner en mayusculas primeras letras)
        //3 Personalizar un mensaje estandar

        Scanner entrada = new Scanner(System.in);

        String mensaje = "Estimado NOMBRE APELLIDO nos algreamos por ti, estaremos en contacto contigo a traves del EMAIL";


        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Email: ");
        String email = entrada.nextLine();

        nombre = nombre.toUpperCase().charAt(0) + nombre.toLowerCase().substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.toLowerCase().substring(1);


        System.out.println(mensaje.replace("NOMBRE", nombre).replace("APELLIDO",apellido).replace("EMAIL", email));



    }
}
