package com.ista.evaluacionspringboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.evaluacionspringboot.web.app.model.Cancion;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Long>{

}
