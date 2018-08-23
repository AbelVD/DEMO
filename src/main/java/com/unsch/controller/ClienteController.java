package com.unsch.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unsch.entity.Cliente;
import com.unsch.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	@Qualifier("clienteService")
	private ClienteService clienteService;

	@PostMapping("/guardarCliente")
	public String guardarCliente(Cliente cliente) {
		clienteService.guardar(cliente);
		return "cliente-table";
	}
	
	@GetMapping("/mostrarform")
	public String mostrarForm(Map<String, Object> model) {
		
		Cliente cliente =new Cliente();
		model.put("cliente", cliente);
		return "cliente-form";
		
	}
}
