/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

/**
 * 
 */
@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO daoAlmacen;

	/**
	 * Deveuelve todos los almacenes
	 * 
	 * @return List<Almacen>
	 */
	public List<Almacen> getAllAlmacen() {
		return daoAlmacen.findAll();
	}

	/**
	 * Devuelve un almacen en especifico
	 * 
	 * @param id
	 * @return Almacen
	 */
	public Almacen getIdAlmacen(int id) {
		return daoAlmacen.findById(id).get();
	}

	/**
	 * Añade un almacen a la base de datos
	 * 
	 * @param almacen
	 * @return Almacen
	 */
	public Almacen addAlmacen(Almacen almacen) {
		return daoAlmacen.save(almacen);
	}

	/**
	 * Actualiza un almacen
	 * 
	 * @param almacen
	 * @return Almacen
	 */
	public Almacen updateAlmacen(Almacen almacen) {
		return daoAlmacen.save(almacen);
	}

	/**
	 * Elimina un almacen
	 * 
	 * @param id
	 */
	public void deleteAlmacen(int id) {
		daoAlmacen.deleteById(id);
	}
}
