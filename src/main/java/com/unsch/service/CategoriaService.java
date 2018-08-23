package com.unsch.service;

import java.util.List;

import com.unsch.entity.Categoria;

public interface CategoriaService {

	public void guardarcategoria(Categoria categoria);
	public List<Categoria> listarcategoria();
	public Categoria buscarcatporid(Long idcategoria);

}
