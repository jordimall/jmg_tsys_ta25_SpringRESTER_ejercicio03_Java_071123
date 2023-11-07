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

import com.example.demo.dto.Caja;
import com.example.demo.services.CajaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;

	/**
	 * Deveuelve todos los cajas
	 * 
	 * @return List<Caja>
	 */
	@GetMapping("/cajas")
	public List<Caja> allCaja() {
		return cajaServiceImpl.getAllCaja();
	}

	/**
	 * Devuelve un fabricante en especifico
	 * 
	 * @param id
	 * @return Caja
	 */
	@GetMapping("/cajas/{ref}")
	public Caja showCaja(@PathVariable(name = "ref") String ref) {

		Caja caja_xid = new Caja();

		caja_xid = cajaServiceImpl.getIdCaja(ref);

		return caja_xid;
	}

	/**
	 * Añade un caja a la base de datos
	 * 
	 * @param caja
	 * @return Caja
	 */
	@PostMapping("/cajas")
	public Caja newCaja(@RequestBody Caja caja) {

		return cajaServiceImpl.addCaja(caja);
	}

	/**
	 * Actualiza un caja
	 * 
	 * @param caja
	 * @return Caja
	 */
	@PutMapping("/cajas/{ref}")
	public Caja editCaja(@PathVariable(name = "id") String ref, @RequestBody Caja caja) {

		Caja caja_seleccionado = new Caja();
		Caja caja_actualizado = new Caja();

		caja_seleccionado = cajaServiceImpl.getIdCaja(ref);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		
		caja_actualizado = cajaServiceImpl.updateCaja(caja_seleccionado);

		return caja_actualizado;
	}

	/**
	 * Elimina un caja
	 * 
	 * @param id
	 */
	@DeleteMapping("/cajas/{ref}")
	public void eleiminarCaja(@PathVariable(name = "ref") String ref) {
		cajaServiceImpl.deleteCaja(ref);
	}

}
