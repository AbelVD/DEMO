package com.unsch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unsch.entity.Categoria;
import com.unsch.repository.CategoriaRepository;
import com.unsch.service.CategoriaService;

@Service("categoriaService")
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	@Qualifier("categoriaRepository")
	private CategoriaRepository categoriaRepository;

	@Override
	public void guardarcategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	@Override
	public List<Categoria> listarcategoria() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	@Override
	public Categoria buscarcatporid(Long idcategoria) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(idcategoria).get();
	}
	

}
