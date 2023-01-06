package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.model.ListaCompraDetalle;
import com.truper.model.ListaDetallePK;

public interface ListaCompraDetalleRepository extends JpaRepository<ListaCompraDetalle, ListaDetallePK> {

}
