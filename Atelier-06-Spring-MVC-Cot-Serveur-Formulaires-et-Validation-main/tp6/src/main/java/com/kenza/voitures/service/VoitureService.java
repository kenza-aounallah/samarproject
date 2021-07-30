package com.kenza.voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import com.kenza.voitures.entities.Marque;
import com.kenza.voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	Page<Voiture> getAllVoituresParPage(int page, int size);
	List <Voiture>findBynumSerie(String numSerie);
	List<Voiture> findByOrderByNumSerieAsc();
	List<Voiture> findBynumSeriePrix (String numSerie,Double prix);
	List <Voiture>findBynumSerieContains(String numSerie);
	List<Voiture> findByMarque(Marque marque);
	List<Voiture> findByMarqueIdMar(Long id);
	List<Voiture> trierVoituresNumseriePrix ();
}
