package ListaLinear.Ex1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    
    private Queue<Integer> queue;

    public static void main(String[] args) {
        
        //Criacao da Queue
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<6;i++){
            queue.add(i);
        }
        System.out.println("Queue inicial: "+queue);

        //Add value at end
        queue.add(9);
        System.out.println("Queue com valor adicionado ao fim: "+queue);


        //REmove first queue value
        queue.remove();
        System.out.println("Queue sem a primeira posicao: "+queue);

        //Return first queue value
        int firstN=queue.element();
        System.out.println("Primeiro da fila: "+firstN);

        //Return number of elements in queue
        System.out.println("Numero de elementos na queue : "+queue.size());

        //Return last queue value
        Queue<Integer> lastN= new ArrayDeque<>();
        lastN=queue;
        int elem=queue.size();
        while(elem>1){
            lastN.remove();
            elem=lastN.size();
        }
        System.out.println("Ultimo da fila: "+lastN);

        //REmove all elements in queue
        queue.clear();
        System.out.println("Queue vazia: "+queue);


    }
}
