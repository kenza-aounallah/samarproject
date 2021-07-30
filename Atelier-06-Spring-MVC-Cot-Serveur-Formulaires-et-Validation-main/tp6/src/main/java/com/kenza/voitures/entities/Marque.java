package com.kenza.voitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Marque {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMar;
private String nomMar;
private String description;
@OneToMany(mappedBy="marque")
@JsonIgnore
private List<Voiture> voitures;
public Long getIdMar() {
	return idMar;
}
public Marque() {
	super();
	// TODO Auto-generated constructor stub
}
public void setIdMar(Long idMar) {
	this.idMar = idMar;
}
public String getNomMar() {
	return nomMar;
}
public void setNomMar(String nomMar) {
	this.nomMar = nomMar;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
