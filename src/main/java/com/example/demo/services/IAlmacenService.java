/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Almacen;

/**
 * 
 */
public interface IAlmacenService {

	/**
	 * Deveuelve todos los almacenes
	 * 
	 * @return List<Almacen>
	 */
	public List<Almacen> getAllAlmacen();

	/**
	 * Devuelve un articulo en almacen
	 * 
	 * @param id
	 * @return Almacen
	 */
	public Almacen getIdAlmacen(int id);

	/**
	 * Añade un almacen a la base de datos
	 * 
	 * @param articulo
	 * @return Almacen
	 */
	public Almacen addAlmacen(Almacen almacen);

	/**
	 * Actualiza un almacen
	 * 
	 * @param almacen
	 * @return Almacen
	 */
	public Almacen updateAlmacen(Almacen almacen);

	/**
	 * Elimina un almacen
	 * 
	 * @param id
	 */
	public void deleteAlmacen(int id);
}
