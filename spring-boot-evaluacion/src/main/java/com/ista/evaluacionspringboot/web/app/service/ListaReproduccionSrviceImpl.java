package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.evaluacionspringboot.web.app.model.ListaReproduccion;
import com.ista.evaluacionspringboot.web.app.repository.ListaReproduccionRepository;

@Service
public class ListaReproduccionSrviceImpl implements ListaReproduccionService {
	
	@Autowired
	private ListaReproduccionRepository listaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<ListaReproduccion> findAll() {
		// TODO A-generated method stub
		return listaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<ListaReproduccion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return listaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ListaReproduccion> findById(Long id) {
		// TODO Auto-generated method stub
		return listaRepository.findById(id);
	}

	@Override
	@Transactional
	public ListaReproduccion save(ListaReproduccion user) {
		// TODO Auto-generated method stub
		return listaRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		listaRepository.deleteById(id);
	}

}
