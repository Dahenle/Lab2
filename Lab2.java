
package lab.pkg2;

import java.util.Scanner;
import static lab.pkg2.Lista.intToList;


public class Lab2 {


    public static void main(String[] args) {
        // TODO code application logic here
        Lista V[] = new Lista[10];
        Scanner read = new Scanner(System.in);
        int nroNum, ope;
        do{
            System.out.println("Digite que numeros va a operar. Max 6 ");
            nroNum = read.nextInt();
        }while(!(2 <= nroNum && nroNum <= 6));

        int num = -1;
        for(int i = 1; i <= nroNum; i++){
            do {
                System.out.println("Digite num " + i + " - Max 4 digitos");
                num = read.nextInt();
            }while(-10000 < num && num > 10000);
            Lista listNum = intToList(num);
            V[i] = listNum;
        }
        for(int i = 1; i <= nroNum; i++){
            V[i].display();
        }
        do{
            System.out.println("¿Que operacion desea hacer? 1. Suma 2. Multiplicacion");
            ope = read.nextInt();
        }while(ope != 1 && ope !=  2);
        System.out.println(Lista.Operaciones(V, nroNum, ope));
        Lista.intToList(Lista.Operaciones(V, nroNum, ope)).display();

    }
    
}
