
import javax.swing.*;
public class DniGPT {




        //Variables

        int numeroDni;
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        //introduccion del DNI

        public void introDni (){
            numeroDni=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero de DNI (sin letra): "));
            int numeResto = numeroDni%23;
            mostrarResultado(numeResto);
        }

        //mostrar resultado dni

        public void mostrarResultado (int numeResto){
            System.out.println("letras = " + letras[numeResto]);
        }

        public static void main(String[] args) {
            DniGPT dni = new DniGPT();
            dni.introDni();
        }
    }

