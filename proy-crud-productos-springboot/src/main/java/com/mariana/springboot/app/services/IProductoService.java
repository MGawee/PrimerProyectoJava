package com.mariana.springboot.app.services;

import com.mariana.springboot.app.models.Producto;

public interface IProductoService {

	//METODO INTERFACE PARA PODER UTILIZAR TANTO EN SERVICE IMPLEMENTATION COMO EN EL CONTROLLER
	public abstract Producto IdProducto(String idProducto);

}
