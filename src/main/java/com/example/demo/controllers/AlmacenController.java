/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Almacen;
import com.example.demo.services.AlmacenServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;

	/**
	 * Deveuelve todos los almacenes
	 * 
	 * @return List<Almacen>
	 */
	@GetMapping("/almacenes")
	public List<Almacen> allAlmacen() {
		return almacenServiceImpl.getAllAlmacen();
	}

	/**
	 * Devuelve un almacen en especifico
	 * 
	 * @param id
	 * @return Almacen
	 */
	@GetMapping("/almacenes/{id}")
	public Almacen showAlmacen(@PathVariable(name = "id") int id) {

		Almacen articulo_xid = new Almacen();

		articulo_xid = almacenServiceImpl.getIdAlmacen(id);

		return articulo_xid;
	}

	/**
	 * Añade un almacen a la base de datos
	 * 
	 * @param almacen
	 * @return Almacen
	 */
	@PostMapping("/almacenes")
	public Almacen newAlmacen(@RequestBody Almacen almacen) {

		return almacenServiceImpl.addAlmacen(almacen);

	}

	/**
	 * Actualiza un almacen
	 * 
	 * @param almacen
	 * @return Articulos
	 */
	@PutMapping("/almacenes/{id}")
	public Almacen editAlmacen(@PathVariable(name = "id") int id, @RequestBody Almacen almacen) {

		Almacen almaacen_seleccionado = new Almacen();
		Almacen almacen_actualizado = new Almacen();

		almaacen_seleccionado = almacenServiceImpl.getIdAlmacen(id);

		almaacen_seleccionado.setLugar(almacen.getLugar());
		almaacen_seleccionado.setCapacidad(almacen.getCapacidad());

		almacen_actualizado = almacenServiceImpl.updateAlmacen(almaacen_seleccionado);

		return almacen_actualizado;
	}

	/**
	 * Elimina un almacen
	 * 
	 * @param id
	 */
	@DeleteMapping("/almacenes/{id}")
	public void eleiminarAlmacen(@PathVariable(name = "id") int id) {
		almacenServiceImpl.deleteAlmacen(id);
	}
}
