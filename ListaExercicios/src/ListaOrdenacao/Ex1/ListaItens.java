package ListaOrdenacao.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaItens {
    private List<Objeto> listaItens;

    public ListaItens(){
        this.listaItens=new ArrayList<>();
    }

    public void adicionarObj(String name, Double dmg, Double cooldown){
        Objeto obj=new Objeto(name, dmg, cooldown);
        this.listaItens.add(obj);
    }

    // Ordenacao

    public List<Objeto> ordenarPorDano(){
        List<Objeto> objPorDano=new ArrayList<>(listaItens);
        if(!listaItens.isEmpty()){
            Collections.sort(objPorDano, new ComparatorPorDano());
            return objPorDano;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Objeto> ordenarPorColl(){
        List<Objeto> objPorColl=new ArrayList<>(listaItens);
        if(!listaItens.isEmpty()){
            Collections.sort(objPorColl, new ComparatorPorCooldown());
            return objPorColl;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Objeto> ordenarPorDPS(){
        List<Objeto> objPorDPS=new ArrayList<>(listaItens);
        if(!listaItens.isEmpty()){
            Collections.sort(objPorDPS, new ComparatorPorDPS());
            return objPorDPS;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
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
    
}
