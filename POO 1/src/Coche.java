public class Coche {
    //Atributos (caracteristicas/estado)
        String marca;
        String modelo;
        String color;
        String combustible;
        float potencia;
        float cilindrada;
        float rpm=0;
        float maxRpm= 7000;

        float capacidadDeposito;

        static String numeroEmergencias="112";

       private float km = 0;

        static final float maxVelocidad = 180;

        //Metodos (comportamiento)
    public void puestaEnMArcha(){
        this.rpm=800;

    }
    public void paraMotor(){
        this.rpm=0;
    }

    public void acelerar(float rpm){                //acelaracion en porcentaje %  0%.....100%
        if(this.rpm>0){                                //this.rpm se refiere al atributo de la clase
                                                        //rpm se refiere al parametro del metodo
            this.rpm=800+(this.maxRpm-800)*(rpm/100);
        }else {
            System.out.println("Arranca el coche");
        }

    }

    public static void llamarEmergencias(){
        System.out.println("Llamando a Emergencias: "+ numeroEmergencias);
    }

    public float consumo(float distancia,float repostado){
        this.km+=distancia;
        return repostado/distancia * 100;
    }

    public float consumo(float distancia){
        this.km+=distancia;
        return this.capacidadDeposito/distancia*100;
    }

    //imprimir todos los atributos con un metodo, clic derecho->generate->toString

    @Override
    public String toString() {
        return
                "marca=" + marca + '\n' +
                "modelo=" + modelo + '\n' +
                "color=" + color + '\n' +
                "combustible=" + combustible + '\n' +
                "potencia=" + potencia + '\n' +
                "cilindrada=" + cilindrada + '\n' +
                "rpm=" + rpm + '\n' +
                "maxRpm=" + maxRpm + '\n' +
                "capacidadDeposito=" + capacidadDeposito + '\n'+

                        "km="+ km;
    }

    // Acceder a metodos privados-> click derecho->generate->getter and setter
    public float getKm() {
        return km;
    }
//    public void setKm(float km) {
//        this.km = km;
//    }
}
