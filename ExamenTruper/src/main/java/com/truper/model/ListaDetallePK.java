package com.truper.model;

public class ListaDetallePK {
	
	private ListaCompra listaCompra;
	
	private Producto producto;
	
	public ListaDetallePK() {
		
	}
	
	public ListaDetallePK(ListaCompra listaCompra, Producto producto) {
		this.listaCompra = listaCompra;
		this.producto = producto;
	}

}
