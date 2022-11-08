public class Main{
	
	public static void main(String args[]) {	
		Guitarra guitarra = new GuitarraAcusticaAdapter();
		guitarra.encender(); //"Tocando Guitarra"
		System.out.println("---------------------");
		guitarra.apagar(); //"Dejar de tocar guitarra"
	}
}