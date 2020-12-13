package com.mariana.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mariana.springboot.app.models.Producto;
import com.mariana.springboot.app.services.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

//METODO GET PARA OBTENER LOS DATOS DE 1 PRODUCTO POR SU ID
	@GetMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> findByProducto(@PathVariable String idProducto) {

		// INSTANCIO UN NUEVO OBJETO PRODUCTO
		Producto producto = new Producto();

//LLAMO AL SERVICIO CREADO Y LE PASO POR PARAMETRO EL IDPRODUCTO
		producto = productoService.IdProducto(idProducto);

		// SI EL SERVICIO DEVOLVIO UN RESULTADO EXITOSO O 200, DEVUELVO AL FRONTEND
		// TODOS LOS DATOS
		// DEL PRODUCTO SOLICITADO
		return ResponseEntity.ok(producto);

	}

}
