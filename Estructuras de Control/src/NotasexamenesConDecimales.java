import java.util.Scanner;

public class NotasexamenesConDecimales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir nota del alumno: ");
        String nota = entrada.nextLine();
        float numeronotadecimales= Float.parseFloat(nota);

        if (numeronotadecimales<5) {
            System.out.println("Hay que estudiar mas....");
        } else if (numeronotadecimales<=9){
            System.out.println("Enhorabuena has pasado el examen.");
        } else if (numeronotadecimales==10) {
            System.out.println("Enhorabuena has pasado el examen con MATRICULA");
        }
    }



}
