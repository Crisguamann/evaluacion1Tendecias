package com.ista.evaluacionspringboot.web.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.evaluacionspringboot.web.app.model.ListaReproduccion;
import com.ista.evaluacionspringboot.web.app.service.ListaReproduccionService;

@RestController
@RequestMapping("api/lista")
public class ListaReproduccionController {
	@Autowired
	private ListaReproduccionService listaService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody ListaReproduccion lista){
		return ResponseEntity.status(HttpStatus.CREATED).body(listaService.save(lista));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id")Long userId){
		Optional<ListaReproduccion> oLista = listaService.findById(userId);
		if(!oLista.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oLista);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ListaReproduccion userDetails, @PathVariable(value = "id") Long userId){
		Optional<ListaReproduccion> user = listaService.findById(userId);
		if(!user.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		user.get().setSongs(userDetails.getSongs());
		user.get().setName(userDetails.getName());
		user.get().setDescription(userDetails.getDescription());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(listaService.save(user.get()));

		
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable(value="id") Long userId){
		if(!listaService.findById(userId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		listaService.deleteById(userId);
		return ResponseEntity.ok().build();
	}

}
