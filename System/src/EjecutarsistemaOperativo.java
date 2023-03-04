public class EjecutarsistemaOperativo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        // Ejecutar la calculadora
        try{
            if(System.getProperty("os.name").toLowerCase().contains("windows")){
                proceso = rt.exec("notepad"); //calc
            }
            proceso = rt.exec("notepad"); //calc
        }catch (Exception e){
            System.out.println("Programa desconocido = "+ e.toString());
            System.exit(1);
        }

    }
}
