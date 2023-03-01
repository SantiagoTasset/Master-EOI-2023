

import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Usuario : ");
        String datousu = entrada.nextLine();
        System.out.print("Password : ");
        String datopass = entrada.nextLine();

        String usuario = "santiago";
        String password = "123";

        boolean permiso = (datousu.equals(usuario)) && (datopass.equals(password));

// vuelve a iniciar el programa
        if (permiso)  {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Introducir usuario o contrasena validos");
            main(args);
            System.exit(0);
        }



    }
}
