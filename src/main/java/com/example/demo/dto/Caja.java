/**
 * 
 */
package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	@Column(name = "num_referencia")
	private String numReferencia;

	@Column(name = "Contenido")
	private String contenido;

	@Column(name = "Valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "Almacen")
	private Almacen almacen;

	/**
	 * 
	 */
	public Caja() {
	}

	/**
	 * @param numReferencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String numReferencia, String contenido, int valor, Almacen almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numReferencia
	 */
	public String getNumReferencia() {
		return numReferencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param numReferencia the numReferencia to set
	 */
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

}
