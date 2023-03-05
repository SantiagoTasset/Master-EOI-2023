import javax.swing.*;

public class EnviarMensajeIntroducirDato {
    public static void main(String[] args) {

        String mensaje = "Hola NOMBRE APELLIDO, bienvenido a nuestra platorma del Curso de Programacion Java, dentro" +
                "de unos dias te envaremos toda la informacion del comienzo del curso al EMAIL. Un saludo y a disfrutar.";

        String nombre;
        nombre = JOptionPane.showInputDialog("Introduce tu Nombre: ");

        String apellido;
        apellido = JOptionPane.showInputDialog("Introduce tu apellido: ");

        String email;
         email = JOptionPane.showInputDialog("Introduce tu email: ");

        nombre = nombre.toUpperCase().charAt(0) + nombre.toLowerCase().substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.toLowerCase().substring(1);


        System.out.println(mensaje.replace("NOMBRE", nombre).replace("APELLIDO",apellido).replace("EMAIL", email));



    }
}
