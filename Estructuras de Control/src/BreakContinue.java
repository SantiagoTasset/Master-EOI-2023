public class BreakContinue {
    public static void main(String[] args) {
        //Break
        String[] coches = {"Renault", "Seat","Volvo","Ford","Subaru"};

//        for (int i=0; i< coches.length; i++){
//            System.out.println("coches = " + coches[i]);
//            if (coches[i]=="Volvo"){
//                break;
//            }
//        }
//
//        int indice = 0;
//        int i=0;
//        while (indice< coches.length){
//            System.out.println("coches[" + indice + "] = " + coches[indice]);
//            if (coches[i]=="Volvo"){
//                break;
//            }
//            i++;
//
//        }
//        System.out.println("Restro del programa");

        //continue
        for (int j=0; j< coches.length; j++){

            if (coches[j]=="Volvo"){
                continue;

            }
            System.out.println("coches = " + coches[j]);
        }
    }
}
