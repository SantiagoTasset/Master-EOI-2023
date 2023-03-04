import java.util.Scanner;

public class AnnosBisiestosProfe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Anno: ");
        String anno = entrada.nextLine();
        System.out.println("Mes: ");
        String mes = entrada.nextLine();

        int numAnno = Integer.parseInt(anno);
        int numMes = Integer.parseInt(mes);

        boolean bisiesto = (numAnno % 4 == 0) && ((numAnno % 100 != 0) || (numAnno % 400 == 0));

        //solo if
//        if (numMes == 2) {
//            if (bisiesto) {
//                System.out.println("Tiene 29 dias");
//            } else {
//                System.out.println("Tiene 28 dias");
//            }
//        }
//        if ((numMes == 1) || (numMes == 3) || (numMes == 5) || (numMes == 7) || (numMes == 8) || (numMes == 10) || (numMes == 12)) {
//            System.out.println("tiene 31 dias");
//        }
//        if (((numMes == 4) || (numMes == 6) || (numMes == 9) || (numMes == 11))) {
//            System.out.println("tiene 30 dias");
//        }

        //if else if
        if (numMes == 2) {
            if (bisiesto) {
                System.out.println("Tiene 29 dias");
            } else {
                System.out.println("Tiene 28 dias");
            }
        } else if ((numMes == 4) || (numMes == 6) || (numMes == 9) || (numMes == 11)) {
            System.out.println("tiene 30 dias");
        } else {
            System.out.println("Tiene 31 dias");
        }
    }
}
