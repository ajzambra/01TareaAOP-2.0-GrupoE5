public class Impresora {
	private static Impresora instance=new Impresora();
	private int numeroPaginas;
	private Impresora() {
	}
	public static Impresora getInstance() {
		return instance;
	}
	public void print(String text){
		System.out.println(text +
				"\n" + "numero de paginas impresas hoy" + numeroPaginas +
				"\n" + "---------");
	}
}