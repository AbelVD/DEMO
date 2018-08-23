package com.unsch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unsch.entity.Categoria;

@Repository("categoriaRepository")
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
