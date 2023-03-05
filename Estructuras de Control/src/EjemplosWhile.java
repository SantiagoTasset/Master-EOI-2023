public class EjemplosWhile {
    public static void main(String[] args) {
        // recorrer los 20 primeros numeros con while
        int contador = 0;
        while (contador <= 20){
            System.out.println("contador = " + contador);
            contador++;//contador de 1 en 1
            contador+=2;//contador de 3 en 3
        }
        // recorrer una matriz
        String[] coches = {"Renault", "Seat","Volvo","Ford","Subaru"};

        int indice = 0;
        while (indice< coches.length){
            System.out.println("coches[" + indice + "] = " + coches[indice]);
            indice++;
        }
        System.out.println("---------------------------------");

        // cndicion de salida "diferente"

        indice = 0;
        boolean salir = false;
        while (!salir){ //while(!salir && indice < coche.length)
            System.out.println("coches[" + indice + "] = " + coches[indice]);
            indice++;
            if(coches[indice]=="Volvo"){
                salir = true;
            }

        }
    }
}
