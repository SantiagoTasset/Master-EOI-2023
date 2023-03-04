import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class VariablesSistema {

    public static void main(String[] args) {
        boolean debug = false;
        // variables del sistema de 1 en 1
        // Implica que variables vamos a ver pero hay que saber el nombre de la variable.
        System.out.println("Usuario = " + System.getProperty("user.name"));
        System.out.println("Directorio =" + System.getProperty("user.dir"));
        System.out.println("Version de java = " + System.getProperty("java.version"));

        //Leer todas las variables del sistema
        Properties propierties = System.getProperties();
        propierties.list(System.out);

        //Crear nuestras variables del sistema
        propierties.setProperty("conf.servidor.puerto", "8080");
        System.setProperties(propierties);
        propierties.list(System.out);

        //crear variables del sistema leyendo un archivo
        try {
            FileInputStream archivo = new FileInputStream("src/conf.properties");
            propierties.load(archivo);
            System.setProperties(propierties);
            propierties.list(System.out);
        } catch (FileNotFoundException e) {
            if (debug)
                System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            if (debug)
                System.err.println("Error al cargar el archivo: " + e.getMessage());

        }

        System.out.println("----------------------");

        // variables del entorno - sistema operativo
        Map<String, String> variablesentorno = System.getenv();
        System.out.println("variablesentorno = " + variablesentorno);;
        System.out.println("System.getenv(\"JAVA_HOME\") = " + System.getenv("JAVA_HOME"));
        System.out.println("Usuario=" + System.getenv("USERNAME"));
    }
}
