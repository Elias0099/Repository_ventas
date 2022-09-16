package com.example.demo.eli.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class detalle implements Serializable {

	private static final long serialVersionUID = 1L;
	private int iddetalle;
	private int idproducto;	
	private int idventa;	
	private double precio;
	private int cantidad;
	
	
	public int getiddetalle() {
		return iddetalle;
	}
	public void setiddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public int getidproducto() {
		return idproducto;
	}
	
	public void setidproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
