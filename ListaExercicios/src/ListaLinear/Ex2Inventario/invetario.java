package ListaLinear.Ex2Inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class invetario {
    private List<Item> itemList;
    private List<Item> collecList;
    private float pesoTotal, pesoAtual;
    private Scanner input=new Scanner(System.in);

    public invetario(){
        this.itemList=new ArrayList<>();
        this.collecList=new ArrayList<>();
    }

    public void adicionarItem(String name, float peso){
        Item item=new Item(name,peso);
        this.collecList.add(item);
    }

    public void collectItem(String name, float peso){
        pesoAtual+=peso;
        if(pesoTotal>pesoAtual){
            Item item=new Item(name,peso);
            this.itemList.add(item);
        }else{
            System.out.println("Peso maximo excedido, impossivel adicionar "+name);
        }
    }

    public void transferItem(){
        Random rand=new Random();
        if(!collecList.isEmpty()){
            for(int o=0; o<3;o++){
                for(Item i:collecList){ 
                    int numb=rand.nextInt(100);                   
                    if(numb<=50 && o<3){
                        pesoAtual+=i.getPeso();
                        if(pesoTotal>pesoAtual){
                            itemList.add(i);
                            o++;
                        }else{
                            pesoAtual-=i.getPeso();
                        }
                    }
                }
            }
        }
    }

    public void removerItem(String name){
        List<Item> itensToRemove=new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i:itemList){
                if(i.getName().equalsIgnoreCase(name)){
                    itensToRemove.add(i);
                    pesoAtual-=i.getPeso();
                }
            }
            itemList.removeAll(itensToRemove);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public void showItems(){
        if(!itemList.isEmpty()){
            System.out.println("Peso Atual: "+pesoAtual+this.itemList);
        } else {
        System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "Inventario{" +
            "itens=" + itemList +
            '}';
    }

    public static void main(String[] args) {
        invetario backpack=new invetario();
        backpack.pesoTotal=5.0f;

        backpack.adicionarItem("Pedra",3.0f);
        backpack.adicionarItem("Machado", 1.5f);
        backpack.adicionarItem("Joia",0.5f);
        backpack.adicionarItem("Fruta", 0.25f);
        backpack.adicionarItem("Arco",1.0f);
        backpack.adicionarItem("Espada",2f);
        backpack.adicionarItem("Enxada", 1.5f);
        backpack.adicionarItem("Balde", 1f);
        backpack.adicionarItem("Escudo", 1.25f);
        backpack.adicionarItem("Flecha", 0.1f);

        backpack.transferItem();
        backpack.showItems();

        String nombre=backpack.input.nextLine();
        backpack.removerItem(nombre);
        backpack.showItems();
        backpack.collectItem("Lapis", 0.2f);
        backpack.collectItem("The Rock", 1.0f);
        backpack.showItems();


    }
}
