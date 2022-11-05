//ADAPTER - PARADIGMA ORIENTADO A OBJETOS
public abstract class Guitarra{
	abstract public void encender();
	abstract public void apagar();
}

public class GuitarraElectrica extends Guitarra() {
	//atributos
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

public class GuitarraAcustica extends Guitarra() {
	//atributos
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