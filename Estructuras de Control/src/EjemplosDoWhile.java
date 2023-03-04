public class EjemplosDoWhile {
    public static void main(String[] args) {
        // recorrer los 20 primeros numeros con dowhile

        int contador = 21;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 20);



        // recorrer una matriz
        String[] coches = {"Renault", "Seat","Volvo","Ford","Subaru"};
        int indice = 0;
        do{
            System.out.println("coches["+ indice +"] = " + coches[indice]);
            indice++;
        } while (indice < coches.length);



//        System.out.println("---------------------------------");
//
//        // cndicion de salida "diferente"
//
//        indice = 0;
//        boolean salir = false;
//        while (!salir){ //while(!salir && indice < coche.length)
//            System.out.println("coches[" + indice + "] = " + coches[indice]);
//            indice++;
//            if(coches[indice]=="Volvo"){
//                salir = true;
//            }
//
//        }
    }
}
