import java.util.Random;

public class ContraseniaRandom3 {
    public static void main(String[] args) {
        String password2 = generarConstraseniaRandom(10);
        System.out.println("password = "  + password2);
    }
    

    public static String generarConstraseniaRandom (int n){
        Random randObj=new Random();
        String [] origen= {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^&*"};
        String pass = "";//Cadena vacia en la que se van colocando los datos del Array
        int rnd;


        //aplicamos un for

        for (int i=0;i< origen.length;i++){
            String datoDeCadaMAtriz= origen[i]; //me permite seleccionar uno de cada uno
            rnd = randObj.nextInt(datoDeCadaMAtriz.length());
            pass += datoDeCadaMAtriz.charAt(rnd);
            }


        //aplicamos un for each
//        for(String i:origen){
//
//             rnd= randObj.nextInt(i.length());
//             pass += i.charAt(rnd);
//
//        }



        while (pass.length()<n){

            int rnd2 = randObj.nextInt(origen.length);//me devuelve valores aleatorios pero solo de una de las 4 matrices
            String datoAl=origen[rnd2];
            pass += datoAl.charAt(rnd2);
        }
        return pass;
        }



        }




            


