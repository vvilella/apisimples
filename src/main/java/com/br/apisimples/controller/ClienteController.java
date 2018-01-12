
package com.br.apisimples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.apisimples.model.Cliente;
import com.br.apisimples.repositorio.ClienteRepositorio;

@RequestMapping(path = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAll() {
        return ResponseEntity.ok(clienteRepositorio.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity findById(@PathVariable("id") long id) {
        return ResponseEntity.ok(clienteRepositorio.findOne(id));
    }
    
    @RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@RequestBody Cliente input) {
    	this.clienteRepositorio.save(input);
		return ResponseEntity.ok(input);


	}

}
