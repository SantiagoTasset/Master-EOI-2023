public class Operadores {
    public static void main(String[] args) {
        //operadores de incremento y decrecimiento
        int a=100;
        int b=2;
        int c;
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a); //incrementa el valor y despues hace la operacion
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++); // hace operacion y despues incrementa el valor
        System.out.println("a = " + a);
        System.out.println("--a = " + --a);
        System.out.println("a = " + a);
        System.out.println("a-- = " + a--);
        System.out.println("a = " + a);

        c = b*a;
        System.out.println("c = " + c);

        c= b * ++a;
        System.out.println("c = " + c);

        c = b * a++;
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("---------------------------");
//
//       asignacion

        b = 15;
        c = 4;

        b += c; //sumar a b lo que haya a la derecha
        System.out.println("b = " + b);

        b -= c;
        System.out.println("b = " + b);

        //adicion multiplicativa y division

        b /= c;

        System.out.println("b = " + b);

        b *=c;
        System.out.println("b = " + b);

        //operador ternario
        // tipo variable = (condicion) ? valor1 : valor2;
               // si condicion = true -> variable = valor1
               // si condicion = true -> variable = valor2
               // if(condicion) then { variable = valor1; } else { variable = valor2; }

        int rta = b < c ? 34 : 67;
        System.out.println("rta = " + rta);
        rta = b > c ? 34 : 67;
        System.out.println("rta = " + rta);
        System.out.println("-----------");

        // operadores logicos
        System.out.println("((c<a)&& (b<a)) = " + ((c<a)&& (b<a)));
        System.out.println("((c<a)&& (b<a)) = " + ((c<a)&& (b>a)));

        // OR -> ||
        System.out.println("((c<a) || (b<a)) = " + ((c<a) || (b<a)));










    }
}
