public class TypeCasting {
    // Widening casting -> ensanchamiento
    public static void main(String[] args) {
        byte numeroByte = 111; // ocupa 1 Byte
        System.out.println("numeroByte = " + numeroByte);

        short numeroshort = numeroByte; // Pasar 1 Byte a 2 Bytes
        System.out.println("numeroshort = " + numeroshort);

        int numeroInt = numeroshort; // Pasar de 2 bytes a 4 Bytes
        System.out.println("numeroInt = " + numeroInt);

        long numeroLong = numeroInt; // Pasar de 4 Bytes a 8 Bytres
        System.out.println("numeroLong = " + numeroLong);

        float numeroFloat = numeroLong; // Pasar de 8 bytes entero a 4 bytes reales
        System.out.println("numeroFloat = " + numeroFloat);

        double numeroDouble = numeroFloat; // Pasar de 4 Bytes reales a 8 bytes reales
        System.out.println("numeroDouble = " + numeroDouble);

        System.out.println("--------------------------------------------------");

        // Narrowing casting - Estrechamiento

        numeroDouble = 897564.56e38; // d opcional
        System.out.println("numeroDouble = " + numeroDouble);

        numeroFloat = (float) numeroDouble; // (float) transforma el numero
        System.out.println("numeroFloat = " + numeroFloat);

        numeroLong = (long) numeroFloat; // (long) tansforma el numero float a long
        System.out.println("numeroLong = " + numeroLong);

    }


}
