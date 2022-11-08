public aspect FactoriaServiciosSingleton extends SingletonProtocol{ 
	//subaspecto para establecer la implementacion
	declare parents: FactoriaServicios implements Singleton;
}