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

        System.out.println(line);
        int choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println(listaItem.ordenarPorNome());
                break;
            case 2:
                System.out.println(listaItem.ordenarPorDano());
                break;
            case 3:
                System.out.println(listaItem.ordenarPorColl());
                break;
            case 4:
                System.out.println(listaItem.ordenarPorDPS());
                break;
            default:
                System.out.println("Comando invalido.");
        
        }
    }
}
