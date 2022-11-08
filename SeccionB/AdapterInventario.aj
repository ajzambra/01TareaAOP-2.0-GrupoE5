public aspect AdaptadorInventario{
	
	//Declaro la implementacion
    declare parents: 
		InventarioSysBD implements AdaptadorInventario;
		
    declare parents: 
		InventarioApp implements AdaptadorInventario;
		
    // Adapto el metodo sin necesidad de modificar el metodo original
    public void InventarioSysBD.actualizarInventario(Venta ven){
        update(ven);
    }
    public void InventarioApp.actualizarInventario(Venta ven){
        actualizar(ven);
    }
}