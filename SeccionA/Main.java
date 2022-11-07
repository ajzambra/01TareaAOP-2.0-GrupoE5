public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Employee andreas = new Employee("Andreas",
                "Jefe",
                "Gestiona la sucursal");
        Employee julia = new Employee("Julia",
                "Consultor",
                "Asesora a los clientes sobre las quejas");
        Employee tom = new Employee("Tom",
                "Venta",
                "Vende los productos");
        Employee stefanie = new Employee("Stefanie",
                "Desarrollador",
                " Mantenimiento informático en la sucursal.");
        Employee matthias = new Employee("Matthias",
                "Contable",
                "contabilidad financiera de la sucursal.");
        andreas.printCurrentFuncion();
        julia.printCurrentFuncion();
        tom.printCurrentFuncion();
        stefanie.printCurrentFuncion();
        matthias.printCurrentFuncion();
    }
    

    
    
}