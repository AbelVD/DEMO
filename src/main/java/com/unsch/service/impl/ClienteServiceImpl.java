package com.unsch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unsch.entity.Cliente;
import com.unsch.repository.ClienteRepository;
import com.unsch.service.ClienteService;

@Service("clienteService") 
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	
	@Override
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);
		
		
	}
	

}
