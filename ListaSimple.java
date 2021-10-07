
package lab.pkg2;

import java.math.BigInteger;


public class ListaSimple {
    
    public class Node{
            BigInteger data;
            Node next;
            public Node(BigInteger data){
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        public void addNode(BigInteger data){
            Node p = new Node(data);

            if(head == null){
                head = p;
                tail = p;
            }else{
                tail.next = p;
                tail = p;
            }
        }


        static BigInteger reverse(BigInteger n){
            BigInteger rev = BigInteger.ZERO;
            BigInteger rem;

            while(n.compareTo(BigInteger.ZERO) == 1){

                rem = n.mod(BigInteger.TEN);
                rev = (rev.multiply(BigInteger.TEN)).add(rem);
                n = n.divide(BigInteger.TEN);
            }

            return rev;
        }

        static ListaSimple intToList(BigInteger num){
            ListaSimple result = new ListaSimple();
            int i = 1;
            BigInteger MenosUno = new BigInteger ("-1");
            BigInteger copiaN = BigInteger.ZERO;
            do{
                if (i == 1) {
                    if (num.compareTo(BigInteger.ZERO) == -1) {
                        result.addNode(BigInteger.ONE);
                        num = num.multiply(MenosUno);
                    } else {
                        result.addNode(BigInteger.ZERO);
                    }
                    copiaN = reverse(num);
                }

                BigInteger n = copiaN.mod(BigInteger.TEN);
                result.addNode(n);
                copiaN = copiaN.divide(BigInteger.TEN);
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

            System.out.println("Los nodos de la lista son: ");
            if (current.data.compareTo(BigInteger.ONE) == 0){
                System.out.print("-");
            }
            current = current.next;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null\n");

        }
        
        static BigInteger Operaciones (ListaSimple V[], int tam, int operacion){
           BigInteger resul;
           if (operacion == 1){
               resul = BigInteger.ZERO;
           } else{
               resul = BigInteger.ONE;
           }
           for (int i = 1; i <= tam; i++){
               if(operacion == 1){
                   resul = resul.add(V[i].ListToInt());
               } else{
                   resul = resul.multiply(V[i].ListToInt());
               }

           }
           
            return resul;
        }
        
        public BigInteger ListToInt(){
            String numS = "";
            BigInteger num;
            Node P = head;
            if(P.data.compareTo(BigInteger.ONE) == 0){
                numS = numS + ("-");
            }
            P = P.next;
            while(P != null){
                numS = numS + P.data.toString();
                P = P.next;
            }
            num = new BigInteger (numS);

            return num;
        }
}
