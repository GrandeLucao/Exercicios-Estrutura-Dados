package ListaOrdenacao.Ex1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ListaItens listaItem=new ListaItens();
        listaItem.adicionarObj("Espada", 2.0,1.0);
        listaItem.adicionarObj("Machado", 10.0,3.5);
        listaItem.adicionarObj("Adaga", 0.8,0.5);
        listaItem.adicionarObj("Punhos", 0.2,0.3);
        listaItem.adicionarObj("Arco", 1.5,1.5);
        listaItem.adicionarObj("Alabarda", 3.0,2.5);
        listaItem.adicionarObj("Estilingue", 0.3, 2.0);
        listaItem.adicionarObj("Marreta", 7.0,2.5);
        listaItem.adicionarObj("Pique", 2.5,1.0);
        listaItem.adicionarObj("Cutelo", 1.5,0.8);

        String line="Qual opcao deseja realizar? \n"+
                    "1 - Ordenar por nome.\n"+
                    "2- Ordenar por dano.\n"+
                    "3 - Ordernar por Cooldown.\n"+
                    "4 - Ordenar por DPS.\n";

        String line2="Por qual tipo? \n"+
                    "1 - Bubble sort.\n"+
                    "2- Selection Sort.\n"+
                    "3 - Quick Sort.\n"+
                    "4 - Merge Sort.\n";

        System.out.println(line);
        int choice=input.nextInt();

        if(choice==1){
            System.out.println(listaItem.ordenarPorNome());
            System.exit(1);
        }
        
        System.out.println(line2);
        int choice2=input.nextInt();

        switch(choice2){
            case 1:
                listaItem.BubbleSort(listaItem.getListaItens(), choice);
                System.out.println(listaItem.getListaItens());
                break;
            case 2:
                listaItem.SelectionSort(listaItem.getListaItens(), choice);
                System.out.println(listaItem.getListaItens());
                break;
            case 3:
                listaItem.QuickSort(listaItem.getListaItens(), choice,0,(listaItem.getSize()-1));
                System.out.println(listaItem.getListaItens());
                break;
            case 4:
                listaItem.Sort(listaItem.getListaItens(), 0, listaItem.getSize()-1, choice);
                System.out.println(listaItem.getListaItens());
                break;
            default:
                System.out.println("Comando invalido.");
        
        }
    }
}
