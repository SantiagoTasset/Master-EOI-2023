public class FiguraGeometrica {
    //Atributos , para una figura regular(lados y angulos iguales)
    String nombre;
    int numeroLados;
    double longLados; //caso de una circunferencia la relacionamos con el diametro

    double pi=Math.PI;
    double perimetro; // numero de lados * longitud lados
    double superficie; // para figuras geomtricas regulares -> (perimetro  * apotema ) / 2

    double apotema ; //longitud del centro de la figura hasta el centro de uno de sus lados




    //Metodo Perimetro
    public void calculoPerimetro() {
        if (numeroLados==1){
            perimetro=longLados*pi;
        }else if (numeroLados<=6){
            perimetro=numeroLados*longLados;

        }
    }


    // Metodo Superficie
    public void calculoSuperficie() {
        if (numeroLados==1){
            superficie= pi*Math.pow((longLados/2),2);
        }else if(this.numeroLados<=6){

            apotema = (longLados / 2) / Math.tan(pi / numeroLados);
            superficie=(perimetro*apotema)/2;
        }
    }


    //Constructor
    public FiguraGeometrica(String nombre, int numeroLados, int longLados) {
        this.nombre = nombre;
        this.numeroLados = numeroLados;
        this.longLados = longLados;
        calculoPerimetro();
        calculoSuperficie();
    }

    @Override
    public String toString() {
        return "\n" +
                "nombre=" + nombre  + "\n" +
                "numeroLados=" + numeroLados + "\n" +
                "longLados=" + longLados + "\n" +
                "perimetro=" + perimetro + "\n" +
                "superficie=" + superficie ;

    }


}