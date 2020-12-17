package com.mariana.springboot.app.services;

import java.util.List;

import com.mariana.springboot.app.models.Producto;

public interface IProductoService {

	// METODO INTERFACE PARA PODER UTILIZAR TANTO EN SERVICE IMPLEMENTATION COMO EN
	// EL CONTROLLER
	public abstract Producto IdProducto(String idProducto);

	// GUARDA UN PRODUCTO
	public abstract Producto save(Producto entity);

	// OBTIENE TODA LA LISTA DE PRODUCTOS EXISTENTE EN LA BBDD
	public abstract List<Producto> findAll();

	// MODIFICA LOS DATOS DEL USUARIO
	public abstract Producto update(Producto entity);

	// ELIMINA 1 PRODUCTO
	public abstract Producto deleteById(String idProducto);

}
