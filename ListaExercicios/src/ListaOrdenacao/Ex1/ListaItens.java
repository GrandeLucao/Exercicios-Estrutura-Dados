package ListaOrdenacao.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaItens {
    private List<Objeto> listaItens;

    public List<Objeto> getListaItens() {
        return listaItens;
    }

    public ListaItens(){
        this.listaItens=new ArrayList<>();
    }

    public void adicionarObj(String name, Double dmg, Double cooldown){
        Objeto obj=new Objeto(name, dmg, cooldown);
        this.listaItens.add(obj);
    }

    public int getSize(){
        return listaItens.size();
    }

    public List<Objeto> ordenarPorNome(){
        List<Objeto> objPorNome=new ArrayList<>(listaItens);
        if(!listaItens.isEmpty()){
            Collections.sort(objPorNome, new ComparatorPorNome());
            return objPorNome;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Sortings

   public void BubbleSort(List<Objeto> list, int order){
        int nElem=list.size();
        Objeto temp;
        for(int i=0;i<nElem;i++){
            for(int j=1;j<nElem-1;j++){
                switch(order){
                    case 2:
                        if(list.get(j-1).getDmg()>list.get(j).getDmg()){
                            temp=list.get(j-1);
                            list.set(j-1,list.get(j));
                            list.set(j,temp);
                        }
                        break;
                    case 3:
                        if(list.get(j-1).getColldown()>list.get(j).getColldown()){
                            temp=list.get(j-1);
                            list.set(j-1,list.get(j));
                            list.set(j,temp);
                        }
                        break;
                    case 4:
                        if(list.get(j-1).getDPS()>list.get(j).getDPS()){
                            temp=list.get(j-1);
                            list.set(j-1,list.get(j));
                            list.set(j,temp);
                        }
                        break;
                    default:
                        throw new IndexOutOfBoundsException("Opcao nao existe.");
                }
            }
        }
   }

   public void SelectionSort(List<Objeto> list, int order){
    int nElem=list.size();

    for(int i=0;i<nElem-1;i++){
        int min_elem=i;
        for(int j=i+1;j<nElem;j++){
            switch(order){
                case 2:
                    if(list.get(j).getDmg()<list.get(min_elem).getDmg()){
                        min_elem=j;
                    }
                    break;
                case 3:
                    if(list.get(j).getColldown()<list.get(min_elem).getColldown()){
                        min_elem=j;
                    }
                    break;
                case 4:
                    if(list.get(j).getDPS()<list.get(min_elem).getDPS()){
                        min_elem=j;
                    }
                    break;
                default:
                    throw new IndexOutOfBoundsException("Opcao nao existe.");
            }
        }
        Objeto temp=list.get(min_elem);
        list.set(min_elem, list.get(i));
        list.set(i, temp);
    }
   }

   public void QuickSort(List<Objeto> list,int order, int begin, int end){
        if(begin<end){
            int partitionIndex=partition(list,order, begin, end);

            QuickSort(list,order, begin, partitionIndex-1);
            QuickSort(list,order, partitionIndex+1,end);
        }
   }

   private int partition(List<Objeto> list,int order, int begin, int end){
        Objeto pivot=list.get(end);
        int i=(begin-1);

        for(int j=begin;j<end;j++){
            switch(order){
                case 2:
                    if(list.get(j).getDmg()<=pivot.getDmg()){
                        i++;

                        Objeto swapTemp=list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, swapTemp);
                    }
                    break;
                case 3:
                    if(list.get(j).getColldown()<=pivot.getColldown()){
                        i++;

                        Objeto swapTemp=list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, swapTemp);
                    }
                    break;
                case 4:
                    if(list.get(j).getDPS()<=pivot.getDPS()){
                        i++;

                        Objeto swapTemp=list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, swapTemp);
                    }
                    break;
                default:
                    throw new IndexOutOfBoundsException("Opcao nao existe.");
            }
        }

        Objeto swapTemp=list.get(i+1);
        list.set(i+1, list.get(end));
        list.set(end, swapTemp);

        return i+1;
   }

    public void Sort(List<Objeto> list,int left,int right, int choice){
        if(left<right){
            int middle=left+(right-left)/2;
            Sort(list,left,middle,choice);
            Sort(list,middle+1,right,choice);

            merge(list,left,middle,right,choice);
        }
    }

    public void merge(List<Objeto> list,int left,int middle,int right, int choice){
        int n1=middle-left+1;
        int n2=right-middle;

        List<Objeto> L=new ArrayList<>(list.subList(left, middle+1));
        List<Objeto> R=new ArrayList<>(list.subList(middle+1,right+1));

        for (int i = 0; i < n1; ++i){ L.set(i, list.get(left + i)); }
        for (int j = 0; j < n2; ++j){ R.set(j, list.get(middle+1+j)); }

        int i=0;int j=0;
        int k=left;

        while(i<n1 && j<n2){
            switch(choice){
                case 2:
                    if(L.get(i).getDmg()<=R.get(j).getDmg()){
                        list.set(k,L.get(i));
                        i++;
                    }else{
                        list.set(k, R.get(j));
                        j++;
                    }
                    k++;
                    break;
                case 3:
                    if(L.get(i).getColldown()<=R.get(j).getColldown()){
                        list.set(k,L.get(i));
                        i++;
                    }else{
                        list.set(k, R.get(j));
                        j++;
                    }
                    k++;
                    break;
                case 4:
                    if(L.get(i).getDPS()<=R.get(j).getDPS()){
                        list.set(k,L.get(i));
                        i++;
                    }else{
                        list.set(k, R.get(j));
                        j++;
                    }
                    k++;
                    break;
            }
        }

        while(i<n1){
            list.set(k, L.get(i));
            i++;
            k++;
        }

        while(j<n2){
            list.set(k,R.get(j));
            j++;
            k++;
        }



    }


    
}
