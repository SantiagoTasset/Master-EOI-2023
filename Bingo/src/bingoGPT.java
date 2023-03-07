import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class bingoGPT {
    public static void main(String[] args) {
        System.out.println("\nBoleto Bingo: \n");
        int[][] boletoBingo = generarBoleto(true);
        System.out.println("\nBoleto Jugador: \n");
        int[][] boletoJugador = generarBoleto(false);

        System.out.println("\nCantidad de coincidencias: " + comprobarAmbosBoletos(boletoBingo, boletoJugador));
    }

    // Genera un boleto de bingo o de jugador según el valor del argumento "esBingo"
    public static int[][] generarBoleto(boolean esBingo) {
        int[][] boleto = new int[5][5];
        Set<Integer> numerosUnicos = new HashSet<>();

        for (int i = 0; i < boleto.length; i++) {
            for (int j = 0; j < boleto[i].length; j++) {
                int num;
                do {
                    num = (int) (Math.random() * 100);
                } while (numerosUnicos.contains(num));
                numerosUnicos.add(num);
                boleto[i][j] = num;

                System.out.print(boleto[i][j] + " ");
            }
            System.out.println();
        }

        if (esBingo) {
            System.out.println();
        }

        return boleto;
    }

    // Comprueba los dos boletos y devuelve la cantidad de coincidencias
    public static int comprobarAmbosBoletos(int[][] boletoBingo, int[][] boletoJugador) {
        Set<Integer> coincidencias = new HashSet<>();

        for (int i = 0; i < boletoBingo.length; i++) {
            for (int j = 0; j < boletoBingo[i].length; j++) {
                for (int k = 0; k < boletoJugador.length; k++) {
                    for (int l = 0; l < boletoJugador[k].length; l++) {
                        if (boletoBingo[i][j] == boletoJugador[k][l]) {
                            coincidencias.add(boletoBingo[i][j]);
                            System.out.println("Valor coincidente en fila " + (i+1) + ", columna " + (j+1) + ": " + boletoBingo[i][j]);
                        }
                    }
                }
            }
        }

        int numCommon = coincidencias.size();
        System.out.println("Cantidad de coincidencias: " + numCommon);

        return coincidencias.size();
    }
}



