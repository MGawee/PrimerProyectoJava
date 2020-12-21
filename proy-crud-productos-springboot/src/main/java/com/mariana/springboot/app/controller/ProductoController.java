package com.mariana.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariana.springboot.app.models.Producto;
import com.mariana.springboot.app.services.IProductoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@PostMapping(value = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {

		Producto productoData = productoService.save(producto);

		return ResponseEntity.ok(productoData);

	}

	@GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findAll() {

		List<Producto> productos = new ArrayList<Producto>();

		productos = productoService.findAll();

		return ResponseEntity.ok(productos);
	}

//METODO GET PARA OBTENER LOS DATOS DE 1 PRODUCTO POR SU ID
	@GetMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> findByIdProducto(@PathVariable String idProducto) {

		// INSTANCIO UN NUEVO OBJETO PRODUCTO
		Producto producto = new Producto();

//LLAMO AL SERVICIO CREADO Y LE PASO POR PARAMETRO EL IDPRODUCTO
		producto = productoService.IdProducto(idProducto);

		// SI EL SERVICIO DEVOLVIO UN RESULTADO EXITOSO O 200, DEVUELVO AL FRONTEND
		// TODOS LOS DATOS
		// DEL PRODUCTO SOLICITADO
		return ResponseEntity.ok(producto);
	}

	@PutMapping(value = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto) {

		Producto productoData = productoService.save(producto);

		return ResponseEntity.ok(productoData);
	}

	@DeleteMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<Producto> deleteFindByIdProducto(@PathVariable String idProducto) {

		Producto producto = new Producto();

		return ResponseEntity.ok(producto);

	}

}