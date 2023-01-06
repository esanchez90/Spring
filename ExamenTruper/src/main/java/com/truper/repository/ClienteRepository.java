package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
