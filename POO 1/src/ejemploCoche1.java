public class ejemploCoche1 {
    public static void main(String[] args) {
        // Instanciar un objeto
        Coche1 tuCoche = new Coche1();

        System.out.println("tuCoche.toString() = " + tuCoche.toString());
        
        Coche1 elCoche= new Coche1("Audi");
        System.out.println("elCoche.toString() = " + elCoche.toString());

        Coche1 suCoche= new Coche1("WW","Golf");
        System.out.println("elCoche.toString() = " + elCoche.toString());

        Coche1 unCoche = new Coche1("Ford","Fiesta","Verde","Hibrido",140,1600,0,6400,40,58000);
        System.out.println("unCoche.toString() = " + unCoche.toString());
    }


    
}
