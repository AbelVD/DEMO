package com.unsch.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unsch.entity.Categoria;
import com.unsch.service.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	protected final Log LOG = LogFactory.getLog(getClass());
	
	@Autowired
	@Qualifier("categoriaService")
	private CategoriaService categoriaService;

	@GetMapping("/mostrarform")
	public String mostrarForm(Map<String, Object> model) {
		Categoria categoria = new Categoria();
		model.put("categoria", categoria);
		return "categoria-form";

	}

	@PostMapping("/guardarcategoria")
	public String guardarCategoria(Categoria categoria) {
		LOG.info("idcat: "+categoria.getIdcategoria());
		categoriaService.guardarcategoria(categoria);
		return "redirect:/categoria/mostrarlistacat";

	}
	@GetMapping("/mostrarlistacat")
	public String mostrarlistacat(Map<String, Object>model) {
		List<Categoria> categorialist=categoriaService.listarcategoria();
		model.put("categorialist", categorialist);
		return "categoria-table";
		
	}
	//EDITAR DESDE GIThub
	@GetMapping("/editarcat/{idcategoria}")
	public  String editarcat(@PathVariable(name="idcategoria")Long idcategoria, Map<String, Object>model) {
		Categoria categoria=categoriaService.buscarcatporid(idcategoria);
		model.put("categoria",categoria);
		return "categoria-form";
		
	}
}
