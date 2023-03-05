import java.util.Scanner;

public class EjercicioMensajeRepeticion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        String mensaje = "Hola NAME APELLIDO, bienvenido a nuestra platorma del Curso de Programacion Java, dentro" +
//                "de unos dias te envaremos toda la informacion del comienzo del curso al email. Un saludo y a disfrutar.";
//
//        System.out.println("Name: ");
//        String name = entrada.nextLine();
//        System.out.println("Apellido: ");
//        String apellido = entrada.nextLine();
//        System.out.println("Email: ");
//        String email = entrada.nextLine();
//
//        name = name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
//        apellido = apellido.toUpperCase().charAt(0)+apellido.toLowerCase().substring(1);
//
//        System.out.println(mensaje.replace("NAME", name).replace("APELLIDO", apellido).replace("email",email));

        String mensaje = "Introduce el nombre y extension de un archivo: ";
        System.out.println(mensaje);
        String nombre= entrada.next();

        int i = nombre.lastIndexOf(".");
        System.out.println("Nombre= "+ nombre.substring(0,i));
        System.out.println("Extension= "+ nombre.substring(i+1));


    }
}
