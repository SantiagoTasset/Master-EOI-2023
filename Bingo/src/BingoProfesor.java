import java.util.Scanner;

public class BingoProfesor {
    public static void main(String[] args) {

        int n; //numero extraido
        int[] numeros= new int[91]; //almacena el numero en este array
        int contador =0;// cuanta los numeros que han salido
        Scanner entrada = new Scanner(System.in);
        boolean salir = false; // variable de control



        // Sacar numeros del 1 al 90 de forma aleatoria sin que se repitan

        while(contador <90 && !salir) {


            //Generar del 1 al 90 de forma aleatoria

            n = 1 + (int) (Math.random() * 90);

            //si no ha salido el numero lo guarda

            if (numeros[n] == 0) { //guarda el numero en su posicion
                numeros[n] = n;
                contador++;
                System.out.println("contador - n = " + contador + " - "+ n);
            }

            //controlar el avance de la partida

            System.out.println("Pulsa una tecla para continuar o s para salir");
            String tecla = entrada.next();
            if(tecla.equals("s")){ // al pulsar s sales del juego
                salir = true;
            }
        }

    }
}
