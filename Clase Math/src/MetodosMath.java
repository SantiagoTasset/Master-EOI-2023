public class MetodosMath {
    public static void main(String[] args) {
        System.out.println("Math.max(9,34) = " + Math.max(9,34));
        System.out.println("Math.min(9,34) = " + Math.min(9,34));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        System.out.println("Math.pow(4,3) = " + Math.pow(4,3));
        //grados a rad -> 360 -> 2*PI
        // radianes = (grados * 2 * PI ) / 360
        double radianes = (30*2*Math.PI) / 360;
        System.out.println("Math.sin(30) = " + Math.sin(radianes)); //sin utiliza radianes cambiarlo a grados
        System.out.println("Math.sin(30) = " + Math.cos(radianes));
        
        //redondeos
        System.out.println("Math.ceil(1.3) = " + Math.ceil(1.3));
        System.out.println("Math.floor(1.9) = " +  Math.floor(1.9));
        System.out.println("Math.round(1.59) = " + Math.round(1.59)); // redondeo mas proximo al numero entero

        //redondeo con un decimal
        double numero = 1.55;
        numero *= 10;
        long rta = Math.round(numero);
        numero = (double) rta/10;
        System.out.println("numero = " + numero);

        //redondeo con dos un decimal
        double numero2 = 1.556;
        numero2 *= 100;
        long rta2 = Math.round(numero2);
        numero2 = (double) rta2/100;
        System.out.println("numero2 = " + numero2);
    }
}
