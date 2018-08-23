package com.unsch.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unsch.entity.Categoria;
import com.unsch.entity.Producto;
import com.unsch.service.CategoriaService;
import com.unsch.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	@Qualifier("categoriaService")
	private CategoriaService categoriaService;

	@Autowired
	@Qualifier("productoService")
	private ProductoService productoService;

	@GetMapping("/mostrarform")
	public String mostrarform(Map<String, Object> model) {

		Producto producto = new Producto();
		Categoria categoria = new Categoria();
		producto.setCategoria(categoria);

		List<Categoria> categorialist = categoriaService.listarcategoria();
		model.put("producto", producto);
		model.put("categorialist", categorialist);
		return "producto-form";
	}

	@GetMapping("/mostrarlistapro")
	public String mostrarlistapro(Map<String, Object>model) {
		List<Producto> productolist = productoService.listarproducto();
		model.put("productolist", productolist);
		return "product-table";

	}
	
	@PostMapping("/guardarproducto")
	public String guardarproducto(Producto producto) {
		productoService.guardarProducto(producto);
		return "redirect:/producto/mostrarlistapro";
		
	}
	
	@GetMapping("/editarpro/{idproducto}")
	public String editarpro(@PathVariable(name="idproducto")Long idproducto, Map<String, Object>model) {
		Producto producto = productoService.buscarproducto(idproducto);
		List<Categoria> categorialist = categoriaService.listarcategoria();
		model.put("producto", producto);
		model.put("categorialist", categorialist);
		return "producto-form";
		
	}

}
