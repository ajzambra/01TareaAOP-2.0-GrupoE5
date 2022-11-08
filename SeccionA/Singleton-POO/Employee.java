public class Employee {
	private final String name;
	private final String position;
	private final String role;
	public Employee(String name, String position, String role) {
		this.name = name;
		this.position = position;
		this.role = role;
	}
	public void printCurrentFuncion(){
		Impresora impresora= Impresora.getInstance();
		impresora.print("empleado: " + name + "\n" +
			"Posicion: " + position + "\n" +
			" Funcion: " + role + "\n");
	}
}