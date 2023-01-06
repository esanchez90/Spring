package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
