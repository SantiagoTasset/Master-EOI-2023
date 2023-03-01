public class Ejercicio1 {
    public static void main(String[] args) {
        String archivo = "mifoto.jpg";
////      char[] matrizcaracteres = archivo.toCharArray(); // metodo cutre , intentar no contar por letras por posiciones
////        System.out.println("nombre = " + archivo.substring(0,6));
////        System.out.println("archivo = " + archivo.substring(7,10));
//
//        //solucion
//        String[] aux = archivo.split("\\.") // hay que poner \\ para indicar el punto (.) // solucion incompleta por el punto (.)
//                ;
//        System.out.println("Nombre = " + aux[0]);
//        System.out.println("Extenion = " + aux[1]);

        //Solucion 2 - 1

        int dotIndex = archivo.lastIndexOf(".");
        String name = archivo.substring(0, dotIndex); // obtiene el nombre sin la extensión
        String extension = archivo.substring(dotIndex + 1); // obtiene la extensión del archivo

        System.out.println("Nombre del archivo: " + name);
        System.out.println("Tipo de archivo: " + extension);


        //solucion 2 - mas resumida
        int i = archivo.lastIndexOf(".");
        System.out.println("Nombre = " + archivo.substring(0,i));
        System.out.println("Extension = " + archivo.substring(i+1));




    }
}
