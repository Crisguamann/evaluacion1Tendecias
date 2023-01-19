package com.ista.evaluacionspringboot.web.app.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cancion")
public class Cancion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5060089240563057805L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cancion")
	private Long id_cancion;
	private String artist;
	private String album;
	private String year;
	

}
