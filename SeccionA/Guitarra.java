//ADAPTER - PARADIGMA ORIENTADO A OBJETOS

//target
public abstract class Guitarra{
	abstract public void encender();
	abstract public void apagar();
}

public class GuitarraElectrica extends Guitarra() {
	public void GuitarraElectrica() {
		super();
	}
	public void encender() {
		System.out.println("Encendiendo guitarra");
	}
	public void apagar() {
		System.out.println("Apagando guitarra");
	}
}

//adaptee
public class GuitarraAcustica extends Guitarra() {
	public void GuitarraAcustica() {
		super();
	}
	public void tocar() {
		System.out.println("Tocando Guitarra");
	}
	public void dejar() {
		System.out.println("Dejar de tocar guitarra");
	}
}

//adapter
public class GuitarraAcusticaAdapter extends Guitarra() {
	private GuitarraAcustica guitarraAcustica;
	
	public void GuitarraAcusticaAdapter() {
		super();
		this.guitarraAcustica = new GuitarraAcustica();
	}
	public void encender() {
		this.guitarraAcustica.tocar();
	}
	public void apagar() {
		this.guitarraAcustica.dejar();
	}
}

public class Main{
	
	public static void main(String args[]) {
		
		Guitarra guitarra1 = new GuitarraElectrica();
		guitarra1.encender(); //"Encendiendo guitarra"
		guitarra1.apagar(); //"Apagando guitarra"
		
		Guitarra guitarra2 = new GuitarraAcusticaAdapter();
		guitarra2.encender(); //"Tocando Guitarra"
		guitarra2.apagar(); //"Dejar de tocar guitarra"
	}
}