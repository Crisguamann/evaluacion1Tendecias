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

import com.ista.evaluacionspringboot.web.app.model.Cancion;
import com.ista.evaluacionspringboot.web.app.service.CancionService;

@RestController
@RequestMapping("api/cancion")
public class CancionController {
	
	@Autowired
	private CancionService cancionService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Cancion cancion){
		return ResponseEntity.status(HttpStatus.CREATED).body(cancionService.save(cancion));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id")Long cancionId){
		Optional<Cancion> oCancion = cancionService.findById(cancionId);
		if(!oCancion.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oCancion);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Cancion userDetails, @PathVariable(value = "id") Long cancionId){
		Optional<Cancion> user = cancionService.findById(cancionId);
		if(!user.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		user.get().setAlbum(userDetails.getAlbum());
		user.get().setArtist(userDetails.getArtist());
		user.get().setYear(userDetails.getYear());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cancionService.save(user.get()));

		
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable(value="id") Long cancionId){
		if(!cancionService.findById(cancionId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		cancionService.deleteById(cancionId);
		return ResponseEntity.ok().build();
	}

}
