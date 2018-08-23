package com.unsch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unsch.entity.Producto;

@Repository("productoRepository")
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
