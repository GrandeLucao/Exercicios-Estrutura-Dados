package ListaLinear.Ex3Hanoi;

public class Disk {
    private int value;

    public Disk(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
	public String toString() {
		return "Disk "+value;
	}
}
