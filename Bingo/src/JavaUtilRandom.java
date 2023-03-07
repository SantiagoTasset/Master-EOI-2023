import java.util.Random;

public class JavaUtilRandom {
    public static void main(String[] args) {
        // Crear objeto random
        Random objetoRandom = new Random(); //declaramos la variable

        //Enteros de tipo int (int) random

        int numInt = objetoRandom.nextInt();
        System.out.println("numInt = " + numInt);

        //Numeros tipo long random

        long numLong = objetoRandom.nextLong();
        System.out.println("numLong = " + numLong);

        // Numeros tipo float random

        float numFloat = objetoRandom.nextFloat();
        System.out.println("numFloat = " + numFloat);

        // Numero double

        double numDouble = objetoRandom.nextDouble();
        System.out.println("numDouble = " + numDouble);

        System.out.println("-----------------------");

        // Rango de numero Ej: de 0 a 90

        for (int i=0; i<50 ; i++){
            numInt = objetoRandom.nextInt(91); // boudn es el limite sin contarlo
            System.out.println("numInt = " + numInt);
        }

        System.out.println("-----------------------");

        // Rango comprendido entre 2 numero n y m enteros

        for (int i=0; i<50 ; i++){
            numInt = objetoRandom.nextInt(1,101); // origin esta incluido y bound no esta incluido (n,m+1)
            System.out.println("numInt = " + numInt);
        }

        System.out.println("-----------------------");

        // Rango comprendido entre 2 numero n y m float

        for (int i=0; i<50 ; i++){
            numFloat = objetoRandom.nextFloat(68); // origin esta incluido y bound no esta incluido (n,m+1)
            System.out.println("numFloat = " + numFloat);
        }

    }
}
