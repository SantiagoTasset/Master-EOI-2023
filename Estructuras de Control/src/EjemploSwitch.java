public class EjemploSwitch {
    public static void main(String[] args) {
        int mes = 3;
        String nombreMes = "";//poner las comillas para incializarlo

        switch (mes){
            case 1:
                nombreMes="Enero";
                break;
            case 2:
                nombreMes="Febrero";
                break;
            case 3:
                nombreMes="Marzo";
                break;
            case 4:
                nombreMes="Abril";
                break;
            case 5:
                nombreMes="Mayo";
                break;
        }
        System.out.println("nombreMes = " + nombreMes);

    }
}
