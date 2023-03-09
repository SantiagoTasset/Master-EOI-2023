public class ejemploCoche {
    public static void main(String[] args) {

        //Metodos static
        Coche.numeroEmergencias = "911";
        Coche.llamarEmergencias(); //pertenece a la clase
        System.out.println("Cpche.maxVelocidad= " + Coche.maxVelocidad);
        

        //Instanciar objeto -> crear el objeto, a partir de una clase
        Coche miCoche = new Coche();

        miCoche.llamarEmergencias(); //no es preciso crear el objeto para usarlo
        miCoche.llamarEmergencias();

        //Asignamos valores a los atributos
        miCoche.marca= "Ford";
        miCoche.modelo= "Fiesta";
        miCoche.color= "Verde manzana";
        miCoche.combustible= "Hibrido";
        miCoche.cilindrada= 1600;
        miCoche.potencia= 140;
        miCoche.maxRpm= 6500;
        miCoche.capacidadDeposito=40;

        //Atributo private (no deja modificarlo)
//        miCoche.km = 12365;
//        System.out.println("miCoche.km = " + miCoche.km);

//        miCoche.setKm(12546); //sin el metodo setKm el atributo km esta protegido contra escritura
        System.out.println("miCoche.getKm() = " + miCoche.getKm());

        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.puestaEnMArcha();
        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.acelerar(50);//esto pasa gracias al aplicar "this.rpm" y "this.maxRpm"
        System.out.println("miCoche.rpm = " + miCoche.rpm);
        

        System.out.println("miCoche.consumo(500) = " + miCoche.consumo(500));
        System.out.println("miCoche.consumo(250,22) = " + miCoche.consumo(250,22));

        System.out.println("miCoche.toString() = " +"\n"+ miCoche.toString());
    }
}
