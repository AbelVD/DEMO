package com.unsch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unsch.entity.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
