package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.evaluacionspringboot.web.app.model.ListaReproduccion;

public interface ListaReproduccionService {

	public Iterable<ListaReproduccion> findAll();
		
	public Page<ListaReproduccion> findAll(Pageable pageable);
		
	public Optional<ListaReproduccion> findById(Long id);
		
	public ListaReproduccion save(ListaReproduccion user);
		
	public void deleteById(Long id);
}
