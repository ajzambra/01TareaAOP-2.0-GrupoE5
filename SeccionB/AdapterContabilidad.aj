public aspect AdaptadorContabilidad{
	//Declaro la implementacion
	declare parents:
		ContabilidadSystema implements AdaptadorContabilidad;
	declare parents:
		ContabilidadSRI implements AdaptadorContabilidad;
	
	// Adapto el metodo sin necesidad de modificar el metodo original
	public boolean ContabilidadSystema.guardarVenta(Venta venta){
		hacerContabilidad(venta);
	}
	
	public boolean ContabilidadSRI.anotarVenta(Venta venta){
		enviarContabilidad(venta):
	}
}