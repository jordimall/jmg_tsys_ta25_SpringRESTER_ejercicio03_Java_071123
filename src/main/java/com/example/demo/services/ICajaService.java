/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Caja;

/**
 * 
 */
public interface ICajaService {

	/**
	 * Deveuelve todos los cajas
	 * 
	 * @return List<Caja>
	 */
	public List<Caja> getAllCaja();

	/**
	 * Devuelve un caja en especifico
	 * 
	 * @param id
	 * @return Caja
	 */
	public Caja getIdCaja(String ref);

	/**
	 * Añade un caja a la base de datos
	 * 
	 * @param caja
	 * @return Caja
	 */
	public Caja addCaja(Caja caja);

	/**
	 * Actualiza un caja
	 * 
	 * @param caja
	 * @return Caja
	 */
	public Caja updateCaja(Caja caja);

	/**
	 * Elimina un caja
	 * 
	 * @param id
	 */
	public void deleteCaja(String ref);
}
