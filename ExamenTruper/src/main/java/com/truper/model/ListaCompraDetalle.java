package com.truper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ListaDetallePK.class)
public class ListaCompraDetalle {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "idListaCompra")
	private ListaCompra listaCompra;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idCodigoProducto")
	private Producto producto;
	
	@Column
	private int cantidad;

	public ListaCompra getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
