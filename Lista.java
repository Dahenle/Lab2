
package lab.pkg2;

import java.math.BigInteger;
import java.util.Scanner;


public class Lista {
    
    public class Node{
            int data;
            Node next;
            String Signo;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        public void addNode(int data){
            Node p = new Node(data);

            if(head == null){
                head = p;
                tail = p;
            }else{
                tail.next = p;
                tail = p;
            }
        }


        static double reverse(double n){
            int rev = 0;
            int rem;

            while(n>0){

                rem = (int)n%10;
                rev = (rev*10) + rem;
                n = n/10;
            }

            return rev;
        }

        static Lista intToList(double num){
            Lista result = new Lista();
            int i = 1;
            double copiaN = 0;
            do{
                if (i == 1) {
                    if (num < 0) {
                        result.addNode(1);
                        num = (-1) * num;
                    } else {
                        result.addNode(0);
                    }
                    copiaN = reverse(num);
                }
                System.out.println(copiaN);

                double n = copiaN % 10;
                result.addNode((int)n);
                copiaN /= 10;
                i++;
            }while(i <= String.valueOf(num).length());

            return result;
        }

        public void display(){
            Node current = head;

            if(current == null){
                System.out.println("la lista esta vacia");
                return;
            }

            current = current.next;
            System.out.println("Los nodos de la lista son: ");
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null\n");

        }
        
        static double Operaciones (Lista V[], int tam, int operacion){
           double resul;
           if (operacion == 1){
               resul = 0;
           } else{
               resul = 1;
           }
           for (int i = 1; i <= tam; i++){
               if(operacion == 1){
                   resul = resul + V[i].ListToInt();
               } else{
                   resul = resul * V[i].ListToInt();
               }

           }
           
            return resul;
        }
        
        public double ListToInt(){
            String numS = "";
            double num;
            Node P = head;
            if(P.data == 1){
                numS = numS + ("-");
            }
            P = P.next;
            while(P != null){
                numS = numS + Integer.toString(P.data);
                P = P.next;
            }
            num = (double)Integer.valueOf(numS);

            return num;
        }
}
