import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
boletoBingo();
bingo();
    }
    // 1º hacer for para que nos de un array  (matriz para unboleto de bingo) 5 x 5 de numeros aleatorios entre el 0 y el 99,sin repetirse
    // 2º hacer un for de numeros aleatorios entre el 0 y 99 para despues comprobar coincidencias entre estos numeros y el boleto, sin rpetirse

    public static void boletoBingo () {
        int [][] boleto = new int[5][5]; // Array de 5 x 5
        Set<Integer> random = new HashSet<>(); // conjunto de elementos unicos para que no se repitan

         for (int i=0; i < boleto.length; i++){
             for (int j=0; j< boleto.length; j++){
                 int num;
                 do {
                     num = (int) (Math.random()*100); 
                 }while (random.contains(num));
                 random.add(num);
                 boleto[i][j] = num;
                 System.out.println("boleto = " + boleto[i][j]);
                 }

             }

         }
         
         public static void bingo(){
        Set<Integer> random = new HashSet<>();

         for (int i=0;i<100;i++){
             int num;
             do {
                 num = (int) (Math.random()*100);
             }while (random.contains(num));
             random.add(num);
             System.out.println("NumBingo = " + num);
         }

         }
        
}









