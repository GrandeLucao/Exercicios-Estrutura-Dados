package ListaLinear.Ex1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ExIterator {
    public static void main(String[] args) {
        
        LinkedList<String> names =new LinkedList<>();

        names.add("Lucas");
        names.add("Gabriel");
        names.add("Francener");

        //Iterador de listas para usar o set
        ListIterator<String> iterator=names.listIterator();

        //hasNext eh a mesma coisa do Valid()
        while(iterator.hasNext()){
            //Uso do next para ler a proxima iteracao
            String display=iterator.next();
            System.out.println(display);
            display=display+" Batata";
            //Uso do set para modificar a palavra
            iterator.set(display);
            //Os 2 system.out.println funcionam como get
            System.out.println(display);
        }  
    }
}

