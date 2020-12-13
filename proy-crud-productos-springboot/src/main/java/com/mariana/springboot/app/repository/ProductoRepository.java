package com.mariana.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mariana.springboot.app.models.Producto;

@Repository("ProductoRepository")
public interface ProductoRepository extends MongoRepository<Producto,Serializable> {
	//DENTRO DE ESTE BLOQUE DE CODIGO VOY A HACER LAS CONSULTA QUE NECESITE CONTRA MONGO DB
	// INTERNAMENTE ACTUA COMO UNA QUERRY DE CONSULTA, BUSCA EN BBDD UN PRODUCTO POR MEDIO DEL ID
Producto findById(String id);

}
