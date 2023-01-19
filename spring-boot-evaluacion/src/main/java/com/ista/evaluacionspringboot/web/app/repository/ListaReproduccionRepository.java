package com.ista.evaluacionspringboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.evaluacionspringboot.web.app.model.ListaReproduccion;

@Repository
public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, Long> {

}
