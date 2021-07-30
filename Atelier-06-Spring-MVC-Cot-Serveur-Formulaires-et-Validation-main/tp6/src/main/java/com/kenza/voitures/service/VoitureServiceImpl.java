package com.kenza.voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kenza.voitures.entities.Marque;
import com.kenza.voitures.entities.Voiture;
import com.kenza.voitures.repos.VoitureRepository;
@Service
public class VoitureServiceImpl implements VoitureService {
	@Autowired
	VoitureRepository voitureRepository;
	@Override
	public Voiture saveVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
		
	}

	@Override
	public void deleteVoiture(Voiture v) {
		 voitureRepository.delete(v);
	}

	@Override
	public void deleteVoitureById(Long id) {
		 voitureRepository.deleteById(id)		;
	}

	@Override
	public Voiture getVoiture(Long id) {
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}

	@Override
	public Page<Voiture> getAllVoituresParPage(int page, int size) {
	
		return voitureRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Voiture> findBynumSerie(String numSerie) {
		return voitureRepository.findBynumSerie( numSerie);
	}

	@Override
	public List<Voiture> findByOrderByNumSerieAsc() {
		return voitureRepository.findByOrderByNumSerieAsc();}

	@Override
	public List<Voiture> findBynumSeriePrix(String numSerie, Double prix) {
		return voitureRepository.findBynumSeriePrix(numSerie, prix);
	}

	@Override
	public List<Voiture> findBynumSerieContains(String numSerie) {
		return voitureRepository.findBynumSerieContains(numSerie);
	}

	@Override
	public List<Voiture> findByMarque(Marque marque) {
		
		return voitureRepository.findByMarque(marque);
	}

	@Override
	public List<Voiture> findByMarqueIdMar(Long id) {
		return voitureRepository.findByMarqueIdMar(id);
	
	}

	@Override
	public List<Voiture> trierVoituresNumseriePrix() {
		return voitureRepository.trierVoituresNumseriePrix();
	}

}
