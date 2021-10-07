
package lab.pkg2;

import java.math.BigInteger;
import java.util.Scanner;
import static lab.pkg2.ListaSimple.intToList;


public class Lab2 {

    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple V[] = new ListaSimple[7];
        Scanner read = new Scanner(System.in);
        int nroNum, ope;
        
        do{
            System.out.println("Digite cuantos numeros va a operar. Max 6 ");
            nroNum = read.nextInt();
        }while(!(2 <= nroNum && nroNum <= 6));

        BigInteger num;
        BigInteger minimo = new BigInteger ("-10000");
        BigInteger maximo = new BigInteger ("10000");
        for(int i = 1; i <= nroNum; i++){
            do {
                System.out.println("Digite num " + i + " - Max 4 digitos");
                num = read.nextBigInteger();
            }while(num.compareTo(minimo) != 1 || num.compareTo(maximo) != -1);
            ListaSimple listNum = intToList(num);
            V[i] = listNum;
        }
        for(int i = 1; i <= nroNum; i++){
            V[i].display();
        }
        do{
            System.out.println("¿Que operacion desea hacer? 1. Suma 2. Multiplicacion");
            ope = read.nextInt();
        }while(ope != 1 && ope !=  2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");

        ListaSimple.intToList(ListaSimple.Operaciones(V, nroNum, ope)).display();
        System.out.println("El Numero es:");
        System.out.println(ListaSimple.Operaciones(V, nroNum, ope));

    }
    
}
