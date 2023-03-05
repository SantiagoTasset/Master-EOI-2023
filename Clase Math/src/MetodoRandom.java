public class MetodoRandom {
    public static void main(String[] args) {
        // Generar aleatorio siempre entre 0 y 0.9999999999999999
        for (int i = 0; i < 50; i++) {
            System.out.println("Math.random() = " + Math.random());
        }
        System.out.println("-------------------------");
        //Aleatorio entero comprendido entre 0 y 100
        for (int i = 0; i < 1; i++) {
            int n = (int) (Math.random() * (100 + 1)); // convierte el decimal en numero entero
            System.out.println("n = " + n);
        }

        //Aleatorio  comprendido entre 0.00 y 0.99999 con decimales
        for (int i = 0; i < 1; i++) {
            int n = (int) (Math.random() * (100 + 1)); // convierte el decimal en numero entero
            float f = n;
            System.out.println("f = " + f / 100);

            //Aleatorio  comprendido entre 0.00 y 0.99999 con decimales
            for (int i = 0; i < 50; i++) {
                int n = (int) (Math.random() * (1000 + 1)); // convierte el decimal en numero entero
                float f = n;
                System.out.println("f = " + f / 100);
            }
        }
    }
}
