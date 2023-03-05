public class General {
    public static void main(String[] args) {
        //  Declaracion de Strings
        String nombre = "Santiago";
        System.out.println("nombre = " + nombre);
        String apellido = new String("Tasset");
        System.out.println("apellido = " + apellido);


        // Comillas dentro de un String
        String quijote = "En un lugar de \"La Mancha\" cuyo...";
        System.out.println("quijote = " + quijote);

        // Concatenar Strings
        System.out.println("nombre + apellido = "+ nombre + " " + apellido);
        String nombrecomplet = nombre +" " + apellido;
        System.out.println("nombrecomplet = " + nombrecomplet);

        // Comparar Strings
        String nombre1= "Santiago";
        System.out.println("(nombre1 == nombre) = " + (nombre1 == nombre)); // incorrecto
        String nombre2 = new String("Santiago");
        System.out.println("(nombre == nombre2) = " + (nombre == nombre2)); // incorrecto

        // .equals
        System.out.println("nombre.equals(nombre1) = " + nombre.equals(nombre1) );
        System.out.println("nombre.equals(nombre2) = " + nombre.equals(nombre2));

    }
}
