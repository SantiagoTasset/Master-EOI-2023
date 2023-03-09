public class Coche1 {
    //Atributos (caracteristicas/estado)
    private String marca; //private = encapsula, dificilta su acceso. se pueden modificar con sett y gett (escribir y leer)
    private String modelo;
    private String color;
    private String combustible;
    private float potencia;
    private float cilindrada;
    private float rpm=0;
    private float maxRpm= 7000;

    private float capacidadDeposito;
         static String numeroEmergencias="112";
       private float km ;
        final static float maxVelocidad = 180; //constante no se puede modificar


        //Metodos (comportamiento)

        // Constructores // construir objetos a partir de una clase, facilitanto los valores de los atributos

            // Sin parametros
            public Coche1(){
                rpm=0;
                km=4;
            }
            //con parametros
            public Coche1(String marca){  //al atributo marca le anadimos el valor de marca del String
//                rpm=0;
//                km=4;
                this();//llama al metodo
                this.marca=marca;
            }

            public Coche1(String marca,String modelo){
                 // rpm=0;
//                km=4;
                 // llama al metodo sin parametros
//                this.marca=marca;
                this(marca);//llama al metedo con el parametro
                this.modelo=modelo;
            }

            // generar metodo constructor con click derecho
        public Coche1(String marca, String modelo, String color, String combustible, float potencia, float cilindrada, float rpm, float maxRpm, float capacidadDeposito, float km) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.rpm = rpm;
        this.maxRpm = maxRpm;
        this.capacidadDeposito = capacidadDeposito;
        this.km = km;
    }

    //Getter , mejor dividirlos

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCombustible() {
        return combustible;
    }

    public float getPotencia() {
        return potencia;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public float getRpm() {
        return rpm;
    }

    public float getMaxRpm() {
        return maxRpm;
    }

    public float getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public float getKm() {
        return km;
    }


    //Setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setRpm(float rpm) {
        this.rpm = rpm;
    }

    public void setMaxRpm(float maxRpm) {
        this.maxRpm = maxRpm;
    }

    public void setCapacidadDeposito(float capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public void setKm(float km) {
        this.km = km;
    }


    // To String

    @Override
    public String toString() {
        return "Coche1{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", rpm=" + rpm +
                ", maxRpm=" + maxRpm +
                ", capacidadDeposito=" + capacidadDeposito +
                ", km=" + km +
                '}';
    }
}
