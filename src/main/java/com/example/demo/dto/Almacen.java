/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int codigo;

	@Column(name = "Lugar")
	private String lugar;

	@Column(name = "Capacidad")
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "Codigo")
	private List<Caja> caja;

	/**
	 * 
	 */
	public Almacen() {
	}

	/**
	 * @param codigo
	 * @param lugar
	 * @param capacidad
	 */
	public Almacen(int codigo, String lugar, int capacidad) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @return the caja
	 */
	public List<Caja> getCaja() {
		return caja;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @param caja the caja to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}

}
