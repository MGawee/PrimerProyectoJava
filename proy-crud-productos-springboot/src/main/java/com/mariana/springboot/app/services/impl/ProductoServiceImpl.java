package com.mariana.springboot.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariana.springboot.app.models.Producto;
import com.mariana.springboot.app.repository.ProductoRepository;
import com.mariana.springboot.app.services.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto IdProducto(String idProducto) {
		Producto producto = null;

		try {

			producto = productoRepository.findById(idProducto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return producto;
	}

}
