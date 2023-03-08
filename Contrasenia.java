import java.util.Scanner;

public class Contrasenia {
    public static void main(String[] args) {
        String contrasenia ="lu3lu5";
        Scanner scanner = new Scanner(System.in);

        String contraseniaIntro;


        for (int i=0;i<3;i++){
            System.out.println("Introduce una contrasenia: ");
            contraseniaIntro = scanner.nextLine();

            if(contraseniaIntro.equals(contrasenia)){
                System.out.println("Enhorabuena");
                break;
            }else {
                               System.out.println("Error, vuelve a introducir contrasenia.");
            }
        }




    }
}
