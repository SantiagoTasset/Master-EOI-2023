public class PoligonoRegular {
    public static void main(String[] args) {
        FiguraGeometrica miFigura = new FiguraGeometrica("Circulo",1,10);
        System.out.println(  miFigura.toString());

        System.out.println("-----------------------------");

        FiguraGeometrica miFigura2 = new FiguraGeometrica("Triangulo",3,10);
        System.out.println(miFigura2.toString());

        System.out.println("-----------------------------");

        FiguraGeometrica miFigura3 = new FiguraGeometrica("Cuadrado",4,10);
        System.out.println( miFigura3.toString());

        System.out.println("-----------------------------");

        FiguraGeometrica miFigura4 = new FiguraGeometrica("Pentagono",5,10);
        System.out.println( miFigura4.toString());

        System.out.println("-----------------------------");

        FiguraGeometrica miFigura5 = new FiguraGeometrica("Hexagono",6,10);
        System.out.println( miFigura5.toString());

        System.out.println("-----------------------------");



       
    }
}
