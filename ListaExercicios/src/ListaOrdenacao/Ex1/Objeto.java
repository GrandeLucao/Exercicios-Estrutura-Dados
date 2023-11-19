

public class Objeto {
    private String name;
    private float dmg;
    private float colldown;

    public Objeto(String name, float dmg, float colldown){
        this.name=name;
        this.dmg=dmg;
        this.colldown=colldown;
    }

    public String getName() {
        return name;
    }

    public float getDmg() {
        return dmg;
    }

    public float getColldown() {
        return colldown;
    }
    
}