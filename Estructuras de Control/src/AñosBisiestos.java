import java.util.Scanner;

public class AñosBisiestos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir año: ");
        int año = entrada.nextInt();

        // Año divisible entre 4 y no entre 100 -> bisiesto
        // si el año no es divisible entre 4 -> no es bisiesto
        // Año es divisle ente 4 , y entre 100 y entre 400 -> es bisiesto
        // Año es divisle ente 4 , y entre 100 y no entre 400 -> no es bisiesto


        String mensaje1 = "El año es bisiesto";
        String mensaje2 = "El año no es bisiesto";

        // aplicar operador modulo % para mantener el resultado

        if ((año % 4 == 0) && (año % 100 != 0)) {
            System.out.println(mensaje1);
        } else if ((año % 4 == 0) && (año % 100 == 0) && (año % 400 == 0)) {
            System.out.println(mensaje1);
        } else if ((año % 4 == 0) && (año % 100 == 0) && (año % 400 != 0)) {
            System.out.println(mensaje2);
        } else if ((año % 4 != 0)) {
            System.out.println(mensaje2);
        }
//metodo 2
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

//metodo 3
//        GregorianCalendar calendar = new GregorianCalendar();
//
//        if (calendar.isLeapYear(año)){
//            System.out.println("El año es bisiesto");
//       } else{
//            System.out.println("El año no es bisiesto");
//    }
   }
}
