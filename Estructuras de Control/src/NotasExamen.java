import java.util.Scanner;

public class NotasExamen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir nota del alumno: ");
        int nota= entrada.nextInt();

        if (nota<5) {
            System.out.println("Hay que estudiar mas....");
        } else if (nota<=9){
            System.out.println("Enhorabuena has pasado el examen.");
        } else if (nota==10) {
            System.out.println("Enhorabuena has pasado el examen con MATRICULA");
        }
        //main(args);
        //System.exit(0);

    }
}
