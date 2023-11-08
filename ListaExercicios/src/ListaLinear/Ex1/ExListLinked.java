package ListaLinear.Ex1;

import java.util.LinkedList;
import java.util.List;

public class ExListLinked {

    private static List<Integer> numberList;
    public static void main(String[] args) {
        
        //Criacao da lista
        List<Integer> numberList=new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("LIsta inicial: "+numberList);

        //Adiciona no final e no inicio da lista
        numberList.addLast(6);
        numberList.addFirst(0);
        System.out.println("Lista com final 6 e inicio 0: "+numberList);
        //Retorna numero de elementos na lista
        System.out.println("Lista numeros de elementos atual "+numberList.size());

        //Limpar Lista
        numberList.clear();
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        System.out.println("Lista com novos valores: "+numberList);


        //REmove no index final
        numberList.removeLast();
        System.out.println("Lista sem o ultimo : "+numberList);

        //Remove o index.
        int numb=1;
        if(numberList.contains(8)){
            numberList.remove(numb);
            System.out.println("Removendo numero no index "+numb);
            System.out.println("Lista atualizada : "+numberList);
        }

        //Retorna o valor do index e remove ele
        numb=numberList.get(1);
        System.out.println("Numero do atual index 1 : "+numb);



    }
}
