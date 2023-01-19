package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.evaluacionspringboot.web.app.model.Cancion;
import com.ista.evaluacionspringboot.web.app.repository.CancionRepository;

@Service
public class CancionServiceImpl implements CancionService{

	@Autowired
	private CancionRepository cancionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Cancion> findAll() {
		// TODO Auto-generated method stub
		return cancionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cancion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return cancionRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cancion> findById(Long id) {
		// TODO Auto-generated method stub
		return cancionRepository.findById(id);
	}

	@Override
	@Transactional
	public Cancion save(Cancion user) {
		// TODO Auto-generated method stub
		return cancionRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		cancionRepository.deleteById(id);
	}

}
