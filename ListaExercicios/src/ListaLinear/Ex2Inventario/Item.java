package ListaLinear.Ex2Inventario;

public class Item {
    
    private String name;
    private float peso;

    public Item(String name, float peso){
        this.name=name;
        this.peso=peso;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
	public String toString() {
		return "Item{" +
				"nome='" + name + '\'' +
				", peso=" + peso +
				'}';
	}
    

}
