package com.angular.crud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.crud.entities.Client;
import com.angular.crud.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService clientService;
	
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = clientService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
