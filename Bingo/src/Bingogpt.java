import java.util.HashSet;
import java.util.Set;

public class Bingogpt {

    public static void main(String[] args) {
        int[][] boleto = generarBoletoBingo();
        Set<Integer> numerosBingo = generarNumerosBingo();

        System.out.println("Boleto:");
        imprimirMatriz(boleto);

        System.out.println("Numeros del Bingo:");
        imprimirNumerosBingo(numerosBingo);

        comprobarNumeros(boleto, numerosBingo);
    }

    public static int[][] generarBoletoBingo() {
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
            }
        }

        return boleto;
    }

    public static Set<Integer> generarNumerosBingo() {
        Set<Integer> numerosBingo = new HashSet<>();

        for (int i = 0; i < 99; i++) {
            int numBingo;
            do {
                numBingo = (int) (Math.random() * 100);
            } while (numerosBingo.contains(numBingo));
            numerosBingo.add(numBingo);
        }

        return numerosBingo;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elem : fila) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirNumerosBingo(Set<Integer> numerosBingo) {
        for (int num : numerosBingo) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void comprobarNumeros(int[][] boleto, Set<Integer> numerosBingo) {
        int aciertos = 0;

        for (int[] fila : boleto) {
            for (int num : fila) {
                if (numerosBingo.contains(num)) {
                    aciertos++;
                }
            }
        }

        System.out.println("Aciertos: " + aciertos);
    }
}

