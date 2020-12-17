package com.mariana.springboot.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariana.springboot.app.models.Producto;
import com.mariana.springboot.app.repository.ProductoRepository;
import com.mariana.springboot.app.services.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {

	// INYECTO EL REPOSITORY
	// PARA USAR SUS FUNCIONES E IMPLEMENTAR EN LA LOGICA DE LOS SERVICIOS
	@Autowired
	ProductoRepository productoRepository;

	// CON ESTE CONTRATO O METODO DE MI CAPA ACTUAL CREO LA LOGICA
	// PARA PODER HACER LA CONSULTA CON MI BBDD MONGO
	@Override
	public Producto IdProducto(String idProducto) {
		// INSTANCIO UN NUEVO OBJETO PRODUCTO
		Producto producto = null;

		// ENVOLVEMOS EN UNA VALIDACION PARA QUE EN CASO QUE FALLE ESA CONSULTA
		// ME IMPRIMA EN LA CONSOLA EN QUE PARTE FALLO MI APP
		try {

			producto = productoRepository.findById(idProducto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// EN CASO DE EXITO DEVUELVO TODOS LOS DATOS QUE TIENE PRODUCTO
		return producto;
	}

	@Override
	public Producto save(Producto entity) {

		Producto producto = null;

		try {
			producto = productoRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
	}

	@Override
	public List<Producto> findAll() {
		// INSTANCIO UNA LISTA DE PRODUCTOS
		List<Producto> lstProductos = new ArrayList<Producto>();

		try {
			lstProductos = productoRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// EN CASO DE EXITO DEVUELVO LISTA DE TODOS LOS PRODUCTOS
		return lstProductos;
	}

	@Override
	public Producto update(Producto entity) {
		Producto producto = null;

		try {
			producto = productoRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return producto;
	}

	@Override
	public Producto deleteById(String idProducto) {

		Producto producto = null;

		try {
			producto = productoRepository.deleteById(idProducto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
	}

}
