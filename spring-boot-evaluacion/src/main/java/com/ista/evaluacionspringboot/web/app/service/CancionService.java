package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.evaluacionspringboot.web.app.model.Cancion;


public interface CancionService {

    public Iterable<Cancion> findAll();
	
	public Page<Cancion> findAll(Pageable pageable);
	
	public Optional<Cancion> findById(Long id);
	
	public Cancion save(Cancion user);
	
	public void deleteById(Long id);
}
