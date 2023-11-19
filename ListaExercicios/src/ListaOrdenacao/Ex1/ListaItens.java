import java.util.ArrayList;
import java.util.List;

public class ListaItens {
    private List<Objeto> listaItens;

    public ListaItens(){
        this.listaItens=new ArrayList<>();
    }

    public void adicionarObj(String name, float dmg, float cooldown){
        Objeto obj=new Objeto(name, dmg, cooldown);
        this.listaItens.add(obj);
    }

    
}
