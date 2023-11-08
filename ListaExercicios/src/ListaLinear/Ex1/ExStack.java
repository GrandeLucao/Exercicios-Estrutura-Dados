package ListaLinear.Ex1;

import java.util.Stack;

public class ExStack {
    Stack<Integer>stack;
    
    public static void main(String[] args) {
        
        //Criacao da stack
        Stack<Integer>stack=new Stack<Integer>();

        //Push
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println("Stack inicial: "+stack);

        //Peek
        int topNumb=stack.peek();
        System.out.println("Numero no topo da stack: "+topNumb);

        //Count
        System.out.println("Numero de elementos na stack: "+stack.size());

        //Pop
        stack.pop();
        System.out.println("Removendo numero no topo da stack: "+stack);

        //Clear
        stack.clear();
        stack.push(1);
        System.out.println("Stack limpa e adicionado um unico numero: "+stack);
    }
}
