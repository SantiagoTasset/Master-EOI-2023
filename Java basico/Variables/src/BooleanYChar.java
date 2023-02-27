public class BooleanYChar {
    public static void main(String[] args) {

        // Tipo Char
        char caracter1 = '@';
        System.out.println("caracter1 = " + caracter1);

        char caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);

        char caracter3 = 64;
        System.out.println("caracter3 = " + caracter3);

        caracter3 = 65;
        System.out.println("caracter3 = " + caracter3);

        System.out.println("--------------");

        // Tipo Booleano

        boolean dato = true; //false
        System.out.println("dato = " + dato);

//        int a = 5;
//        int b = 8;

        int a,b;
        a = 5;
        b = 8;

        dato = a > b;
        System.out.println("a = " + dato);

        dato = a < b;
        System.out.println("a = " + dato);

        dato = ( b - a ) == 3; // == relacion verdadera
        System.out.println("dato = " + dato);

        dato = ( b - a ) != 3;
        System.out.println("dato = " + dato);



    }
}
