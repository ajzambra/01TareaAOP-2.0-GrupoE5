public class GuitarraAcusticaAdapter implements Guitarra {
	private GuitarraAcustica guitarraAcustica;
	
	public GuitarraAcusticaAdapter() {
		this.guitarraAcustica = new GuitarraAcustica();
	}
	public void encender() {
		this.guitarraAcustica.tocar();
	}
	public void apagar() {
		this.guitarraAcustica.dejar();
	}
}
