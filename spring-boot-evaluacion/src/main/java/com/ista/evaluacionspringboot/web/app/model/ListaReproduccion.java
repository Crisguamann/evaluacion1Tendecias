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
@Table(name = "lista_reproducion")
public class ListaReproduccion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8821051804485059768L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lista")
	private Long id_lista;
	private String name;
	private String description;
	private String songs;
	

}
