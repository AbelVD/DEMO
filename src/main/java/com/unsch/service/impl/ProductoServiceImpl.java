package com.unsch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unsch.entity.Producto;
import com.unsch.repository.ProductoRepository;
import com.unsch.service.ProductoService;

@Service("productoService")
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepository productoRepository;
	
	@Override
	public void guardarProducto(Producto producto) {
		productoRepository.save(producto);
		
	}

	@Override
	public List<Producto> listarproducto() {
	
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto buscarproducto(Long idproducto) {
		
		return productoRepository.findById(idproducto).get();
	}

}
