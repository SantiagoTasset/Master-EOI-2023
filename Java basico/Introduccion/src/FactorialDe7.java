public class FactorialDe7 {
    public static void main(String[] args) {
        int n = 7; // número del que se quiere calcular el factorial
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
