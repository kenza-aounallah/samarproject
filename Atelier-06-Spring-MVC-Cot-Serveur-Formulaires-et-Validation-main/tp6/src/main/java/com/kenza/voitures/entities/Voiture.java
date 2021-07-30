package com.kenza.voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;
@Entity
public class Voiture {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idVoiture;
@NotNull
@Size (min = 4,max = 15)
private String numSerie;
@Min(value = 10)
@Max(value = 10000)
private Double prix;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
@PastOrPresent
private Date dateFabrication;
@ManyToOne
private Marque marque;
public Voiture(String  numSerie, Double prix, Date dateFabrication) {
	super();
	this.numSerie =  numSerie;
	this.prix = prix;
	this.dateFabrication = dateFabrication;
}
public Voiture() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getIdVoiture() {
	return idVoiture;
}
public void setIdVoiture(Long idVoiture) {
	this.idVoiture = idVoiture;
}
public String getNumSerie() {
	return numSerie;
}
public void setNumSerie(String numSerie) {
	this.numSerie = numSerie;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
public Date getDateFabrication() {
	return dateFabrication;
}
public void setDateFabrication(Date dateFabrication) {
	this.dateFabrication = dateFabrication;
}
@Override
public String toString() {
	return "Voiture [idVoiture=" + idVoiture + ", numSerie=" + numSerie + ", prix=" + prix + ", dateFabrication="
			+ dateFabrication + "]";
}
public Marque getMarque() {
	return marque;
}
public void setMarque(Marque marque) {
	this.marque = marque;
}

}
