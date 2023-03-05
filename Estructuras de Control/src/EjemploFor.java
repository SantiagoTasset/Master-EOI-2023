public class EjemploFor {
    public static void main(String[] args) {
        //Recorrer los numeros enteros del 0 al 20
        //Invremento de 1 en 1 i++

//        for (int i=0; i<=20;i++){
//            System.out.println("i = " + i);
//        }
//        System.out.println("--------------------------");
//        // incremento en 3
//        for (int i=0; i<=20;i+=3){
//            System.out.println("i = " + i);
//        }

        // sumar todos los numeros del 1 al 20

//        int sum = 0; //iniciar en 0
//        for (int i = 1; i <= 20; i++) {
//            sum += i;
//        }
//        System.out.println("La suma es = " + sum);

        //factorial
//        int fac = 1;
//        for (int i = 1; i <= 7; i++) {
//            fac *= i;
//        }
//        System.out.println("El factor es = " + fac);
        

        // Mostrar los caracteres ASCII del 65 al 90

//        char caracter = '@';
//        for(char i=65; i<=90; i++){
//            caracter = i; //convertir el i en un caracter
//            System.out.println("caracter = " + caracter);
//        }
//
//        for(char i=65; i<=90; i++) {
//            caracter = (char) i; //convertir el i en un caracter
//            System.out.println("caracter = " + caracter);
//        }
        
        //iterar, recorrer una matriz

        // con bucle for
//        String[] coches = {"Renault", "Seat","Volvo","Ford","Subaru"};
//        System.out.println("coches.length = " + coches.length);
//        for (int i=0; i< coches.length; i++){
//            System.out.println("coches = " + coches[i]);
//        }

        //recorrer matriz con forEach
        String[] coches = {"Renault", "Seat","Volvo","Ford","Subaru"};
        System.out.println("coches.length = " + coches.length);
        for (String marca : coches){
            System.out.println("marca = " + marca);
        }

        // recorrer matriz bidimensional
        int[][] numero = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<numero.length;i++){
           for(int j=0; j < numero[i].length;j++){
               System.out.println("numero[" + i+ "][" + j+ "] = " + numero[i][j]);

           }
        }
            //no muy util
        for (int[]matrizInterna : numero){
            for (int valor : matrizInterna) {
                System.out.println("valor = " + valor);
            }
        }
    }
}
