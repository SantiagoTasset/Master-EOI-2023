import java.util.Scanner;

public class LogincponIf {
    public static void main(String[] args) {
        // aplicar un login con if y else

           // datos para consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre : ");
        String nombred = entrada.next();
        System.out.println("Apellido : ");
        String apellidod = entrada.next();
        System.out.println("Email : ");
        String emaild= entrada.next();

        nombred = nombred.toUpperCase().charAt(0)+nombred.toLowerCase().substring(1);
        apellidod = apellidod.toUpperCase().charAt(0)+apellidod.toLowerCase().substring(1);

        //variables para el nombre apellido e email

        String nombre = "Santiago";
        String apellido = "Tasset";
        String email = "santiagotassetg@gmail.com";
        String mensaje = "Bienvenido NOMBRE APELLIDO, nos pondremos en contacto a través de tu correo: EMAIL.";



        //validar coincidencia entre datos y variables

        boolean login= nombre.equals(nombred)&&apellido.equals(apellidod)&&email.equals(emaild);

        // bucle if else

        if (login) {
            System.out.println(mensaje.replace("NOMBRE",nombred).replace("APELLIDO",apellidod).replace("EMAIL",emaild));


        }else {
            System.out.println("Error al introducir los datos.");
//            main(args);
//            System.exit(0);
        }

    }
}
