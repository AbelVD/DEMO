package com.unsch.service;

import java.util.List;

import com.unsch.entity.Producto;

public interface ProductoService {
	public void guardarProducto(Producto producto);

	public List<Producto> listarproducto();
	public Producto buscarproducto(Long idproducto);
}
