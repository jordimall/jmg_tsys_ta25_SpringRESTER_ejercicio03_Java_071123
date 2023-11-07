/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

/**
 * 
 */
@Service
public class CajaServiceImpl implements ICajaService{
	
	@Autowired
	ICajaDAO daoCaja;
	
	/**
	 * Deveuelve todos los cajas
	 * 
	 * @return List<Caja>
	 */
	public List<Caja> getAllCaja(){
		return daoCaja.findAll();
	}

	/**
	 * Devuelve un caja en especifico
	 * 
	 * @param id
	 * @return Caja
	 */
	public Caja getIdCaja(String ref) {
		return daoCaja.findById(ref).get();
	};

	/**
	 * Añade un caja a la base de datos
	 * 
	 * @param caja
	 * @return Caja
	 */
	public Caja addCaja(Caja caja) {
		return daoCaja.save(caja);
	}

	/**
	 * Actualiza un caja
	 * 
	 * @param caja
	 * @return Caja
	 */
	public Caja updateCaja(Caja caja) {
		return daoCaja.save(caja);
	};

	/**
	 * Elimina un caja
	 * 
	 * @param id
	 */
	public void deleteCaja(String ref) {
		daoCaja.deleteById(ref);
	}

}
