import java.util.Locale;

public class MetodosString {
    public static void main(String[] args) {
        String str1 = "   En un lugar de La Mancha de cuyo nombre no quiero...   ";
        String str2 = "Juan Espinosa";
        String str3 = "juan espinosa";
        String str4 = "lunes;martes;miercoles;jueves;sabado;domingo";
        String str5 = "";
        String str6 = "      ";


        //Longitud
        System.out.println("str1.length() = " + str1.length());

        // Igual
        System.out.println("str2.equals(str1) = " + str2.equals(str1));
        System.out.println("str2.equals(str.3) = " + str2.equals(str3));
        
        // Igual insensitivo a las mayusculas
        System.out.println("str2.equalsIgnoreCase(str3) = " + str2.equalsIgnoreCase(str3));
        
        // Comparar
        System.out.println("str2.compareTo(str3) = " + str2.compareTo(str3)); //.compareTo comparacion lexicografica
        System.out.println("str3.compareTo(str2) = " + str3.compareTo(str2));
        System.out.println("str3.compareTo(str3) = " + str3.compareTo(str3));
        
        // Comparar Insensitivo
        System.out.println("str3.compareToIgnoreCase(str2) = " + str3.compareToIgnoreCase(str2));

        // Eliminar Espacios en inicio y final
        System.out.println("str1 = | " + str1 + "|");
        System.out.println("str1.trim() = |" + str1.trim() + "|");
        System.out.println("str1 = | " + str1 + "|"); // El String original permanece inmutable
        str1 = str1.trim();
        System.out.println("str1 = |" + str1 + "|");
        
        // Caracter en la posicion n
        System.out.println("str1.charAt(6) = " + str1.charAt(6));
        
        // Convertir en un Array
        char[] matrizCaracteres = str2.toCharArray();
        System.out.println("matrizCaracteres[9] = " + matrizCaracteres[9]);

        // Extraer una cadena de caracteres entre dos posiciones
        System.out.println("str1.substring(6,11) = " + str1.substring(6,11)); // ultimo dato no incluido
        
        // Extraer una cadena desde la posicion n y el final del String
        System.out.println("str1.substring(6) = " + str1.substring(6));
        
        // Primera coincidencia de una cadena dentro de una cadena
        System.out.println("str1.indexOf(\"u\") = " + str1.indexOf("u"));

        // Segunda coincidencia y sucesivas

        System.out.println("str1.indexOf(\"u\",4) = " + str1.indexOf("u", 4));
        int aux = str1.indexOf("u");
        System.out.println("str1.indexOf(\"u\",aux+1) = " + str1.indexOf("u",aux+1));
        aux = str1.indexOf("u",aux+1);
        System.out.println("str1.indexOf(\"u\",8) = " + str1.indexOf("u", 8));

        // Ultima coincidencia
        System.out.println("str1.lastIndexOf(\"u\") = " + str1.lastIndexOf("u"));

        // Empieza por
        System.out.println("str1.startsWith(\"en\") = " + str1.startsWith("En"));

        // Termina en
        System.out.println("str1.endsWith(\"iero...\") = " + str1.endsWith("iero..."));

        // Separar en una matriz
        String[] palabras = str1.split(" ");
        System.out.println("palabras[4] = " + palabras[4]);

        String[] diasemana = str4.split(";"); //dias de la semana
        System.out.println("diasemana[3] = " + diasemana[3]);

        // Concatenar dos Strings - Unir

        System.out.println("str2.concat(\" \"str3) = " + str2.concat(" "+ str3));
        
        // Esta vacio 
        System.out.println("str5.isEmpty() = " + str5.isEmpty());
        System.out.println("str6.isEmpty() = " + str6.isEmpty());
        
        // Esta en blanco
        System.out.println("str5.isBlank() = " + str5.isBlank());
        System.out.println("str6.isBlank() = " + str6.isBlank());
        
        // Convertir en MAYUSCULAS
        System.out.println("str2.toUpperCase(Locale.ROOT) = " + str2.toUpperCase(Locale.ROOT));

        // Convertir en minuscula
        System.out.println("str2.toLowerCase() = " + str2.toLowerCase());

        // Buscar un texto dentro de otro
        System.out.println("str1.contains(\"Mancha\") = " + str1.contains("Mancha"));
        
        // Reemplazar
        System.out.println("str1.replace(\"La Mancha\",\"Ferrol\") = " + str1.replace("La Mancha","Ferrol"));        
        



    }
}
