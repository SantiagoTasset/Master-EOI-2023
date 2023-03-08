import java.util.Random;

public class ConstraseniaRandom2 {
    public static void main(String[] args) {
        String password2 = generarConstraseniaRandom(10);
        System.out.println("password = " + password2);
    }

    public static String generarConstraseniaRandom (int n){
        Random randObj=new Random();
        String [] origen= {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^&*"};
        String pass = "";//Cadena vacia en la que se van colocando los datos del Array
        int rnd;
        //Recorremos la matriz
        for (String matriz:origen){

            //Seleccionamos un dato aleatorio de cada modulo de la matriz
            int datoAleatorio = randObj.nextInt(matriz.length());
            String datoSeleccionado = matriz.substring(datoAleatorio,datoAleatorio+1); //extrae un dato de cada matriz y la almacena

            //añadir el dato seleccionado a la contraseña (pass)
            pass += datoSeleccionado;

        }

        while (pass.length()<n){
            //Seleccionamos un dato aleatorio de la matriz

            int datoAleatorio = randObj.nextInt(origen.length); //cogemos el dato aleatorio
            String datoSeleccionado2 = origen[datoAleatorio];          //Creamos la variable con el dato aleatorio

            int datoAleatorio2 = randObj.nextInt(datoSeleccionado2.length());
            pass += datoSeleccionado2.substring(datoAleatorio2, datoAleatorio2 + 1);


        }return pass;
    }
}
