package com.truper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.model.Cliente;
import com.truper.model.ListaCompra;
import com.truper.model.ListaCompraDetalle;
import com.truper.model.Producto;
import com.truper.repository.ClienteRepository;
import com.truper.repository.ListaCompraDetalleRepository;
import com.truper.repository.ListaCompraRepository;
import com.truper.repository.ProductoRepository;

@RestController
@RequestMapping("productos")
public class TruperController {
	
	@Autowired
	public ProductoRepository prodRepository;
	@Autowired
	public ListaCompraRepository listaCompraRepository;
	@Autowired
	public ProductoRepository productoRepository;
	@Autowired
	public ListaCompraDetalleRepository detalleRepository;
	@Autowired
	public ClienteRepository clienteRepository;
	@PostMapping("/crearListaCompra")
	public ResponseEntity<ListaCompra> crearListaCompra(@RequestBody ListaCompraDetalle listaCompra) {
		
		System.out.println(listaCompra.getProducto().getClave());
		System.out.println(listaCompra.getListaCompra().getCliente().getNombre());
		
		try {
			Cliente cliente = listaCompra.getListaCompra().getCliente();
			clienteRepository.save(cliente);
			
			Producto prod = listaCompra.getProducto();
			prodRepository.save(prod);
			
			ListaCompra lista = listaCompra.getListaCompra();
			listaCompraRepository.save(lista);
			
			//ListaCompraDetalle listaDetalle = listaCompra;
			detalleRepository.save(listaCompra);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getListaCompras/{idCliente}")
	public ResponseEntity<ListaCompra> getListaCompras(@PathVariable int idCliente) {
		
		System.out.println("Id cliente: "+idCliente);
		
	 	List<ListaCompra> lista = listaCompraRepository.findAll();
		
	 	//lista.
	 	
		
	}
	
}
