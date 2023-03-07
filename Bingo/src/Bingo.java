import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Boleto Bingo: \n");
        boletoBingo();
        System.out.println("\n");
        System.out.println("Boleto Jugador: \n");
        boletoJugador();

        System.out.println("\n");
       comprobarAmbosBoletos();
    }
    // 1º hacer for para que nos de un array  (matriz para unboleto de bingo) 5 x 5 de numeros aleatorios entre el 0 y el 99,sin repetirse
    // 2º hacer un for de numeros aleatorios entre el 0 y 99 para despues comprobar coincidencias entre estos numeros y el boleto, sin rpetirse

    public static int[][] boletoBingo() {
        int boleto[][] = new int[5][5]; // Array de 5 x 5
        int num;
        Set<Integer> random = new HashSet<>(); // conjunto de elementos unicos para que no se repitan

        // relleno de la matriz
        for (int i = 0; i < boleto.length; i++) {
            for (int j = 0; j < boleto.length; j++) {
                do {
                    num = (int) (Math.random() * 100);
                } while (random.contains(num));
                random.add(num);
                boleto[i][j] = num;


                System.out.print(boleto[i][j] + " ");
            }
            System.out.println();

        }
        return boleto;

    }


    public static int[][] boletoJugador() {
        int boleto[][] = new int[5][5]; // Array de 5 x 5
        int num;
        Set<Integer> random = new HashSet<>(); // conjunto de elementos unicos para que no se repitan

        // relleno de la matriz
        for (int i = 0; i < boleto.length; i++) {
            for (int j = 0; j < boleto.length; j++) {
                do {
                    num = (int) (Math.random() * 100);
                } while (random.contains(num));
                random.add(num);
                boleto[i][j] = num;

                System.out.print(boleto[i][j] + " ");
            }
            System.out.println();

        }
        return boleto;

    }

    //comprobar los dos boletos
    public static void comprobarAmbosBoletos() {

        //Declarar las variables para poder utilizar las matrices generadas.
        int[][] boletoBingo = boletoBingo();
        int[][] boletoJugador = boletoJugador();
        Set<Integer> coincidencias = new HashSet<>();

        for (int i = 0; i < boletoBingo.length; i++) {
            for (int j = 0; j < boletoJugador[i].length; j++) {
                if (boletoBingo[i][j] == boletoJugador[i][j]) {
                    coincidencias.add(boletoBingo[i][j]);
                }
            }
        }

        int numCommon = coincidencias.size();
        System.out.println("Cantidad de coincidencias: " + numCommon);
    }


    }













