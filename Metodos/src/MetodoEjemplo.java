import javax.swing.*;
import java.util.Scanner;

public class MetodoEjemplo {
    public static void main(String[] args) {
        bienvenido();
//        nombreCompleto("Santiago","Tasset",28);
//        System.out.println(introduceDato("Introduce nombre: "));
        nombreCompleto(introduceDato("Nombre: "),introduceDato("Apellido"),Integer.parseInt(introduceDato("Edad: ")));


    }

    public static void bienvenido(){
        System.out.println("Bienvenido");
    }

    public static void  nombreCompleto(String nombre, String apellido, int edad){
        System.out.println("Nombre completo = " + nombre + " " + apellido + " y tiene " + edad + " annios");
    }

    public static String introduceDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int suma (int a, int b){
        return a +b;
    }
}
