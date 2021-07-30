package com.kenza.voitures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kenza.voitures.entities.Marque;
import com.kenza.voitures.entities.Voiture;
@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture,Long> {
List <Voiture>findBynumSerie(String numSerie);
List<Voiture> findByOrderByNumSerieAsc();
List <Voiture>findBynumSerieContains(String numSerie);
/*@Query("select v from Voiture v where v.numSerie like %?1 and v.prix> ?2") 
List<Voiture> findBynumSeriePrix (String numSerie, Double prix);*/
@Query("select v from Voiture v where v.numSerie like %:numSerie and v.prix > :prix") 
List<Voiture> findBynumSeriePrix (@Param("numSerie")String numSerie, @Param("prix")Double prix);
@Query("select v from Voiture v where v.marque = ?1") 
List<Voiture> findByMarque(Marque marque);
List<Voiture> findByMarqueIdMar(Long id);
@Query("select v from Voiture v order by v.numSerie ASC, v.prix DESC")
List<Voiture> trierVoituresNumseriePrix ();
}
