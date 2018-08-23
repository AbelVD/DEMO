package com.unsch.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@SequenceGenerator(name = "in_cliente", sequenceName = "in_cliente", initialValue = 1, allocationSize = 1)
public class Cliente implements Serializable {
	

	@Id
	// @Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "in_cliente")
	private Long id;

	@Column(name = "nombre", length = 50)
	private String nombre;

	@Column(name = "edad")
	private int edad;

	public Cliente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	private static final long serialVersionUID = 1L;
}
