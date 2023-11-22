package ListaOrdenacao.Ex1;

import java.util.Comparator;

public class Objeto {
    private String name;
    private Double dmg;
    private Double colldown;
    private Double dps;

    public Objeto(String name, Double dmg, Double colldown){
        this.name=name;
        this.dmg=dmg;
        this.colldown=colldown;
    }

    public String getName() {
        return name;
    }

    public Double getDmg() {
        return dmg;
    }

    public Double getColldown() {
        return colldown;
    }

    public Double getDPS(){
        dps=dmg/colldown;
        return dps;
    }

    @Override
    public String toString() {
        return "\n Item{" +
            "nome='" + name + '\'' +
            ", dano=" + dmg +
            ", Cooldown=" + colldown +
            ", dps=" + dps +
            '}';
    }
}

class ComparatorPorCooldown implements Comparator<Objeto>{
    @Override
    public int compare(Objeto ob1, Objeto ob2){
        return Double.compare(ob1.getColldown(), ob2.getColldown());
    }
}

class ComparatorPorDano implements Comparator<Objeto>{
    @Override
    public int compare(Objeto ob1, Objeto ob2){
         return Double.compare(ob1.getDmg(), ob2.getDmg());
    }
}

class ComparatorPorDPS implements Comparator<Objeto>{
    @Override
    public int compare(Objeto ob1, Objeto ob2){
        return Double.compare(ob1.getDPS(), ob2.getDPS());
    }
}

class ComparatorPorNome implements Comparator<Objeto>{
    @Override
    public int compare(Objeto ob1, Objeto ob2){
        return ob1.getName().compareTo(ob2.getName());
    }
}