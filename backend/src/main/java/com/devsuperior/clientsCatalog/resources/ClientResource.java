package com.devsuperior.clientsCatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.clientsCatalog.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		{
			List<Client> list = new ArrayList<>();
			list.add(new Client(1L, "Alex", "025.653.851-87", 3600.00,null, 0));
			list.add(new Client(2L, "Bob", "089.076.098-87", 2500.00, null, 2));
			list.add(new Client(3L, "Maria", "007.755.331-02", 2500.00, null, 3));
			return ResponseEntity.ok().body(list);
		}
	}
}
