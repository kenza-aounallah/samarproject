package com.kenza.voitures.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "numVoit", types = { Voiture.class })

public interface VoitureProjection {
public String getnumSerie();
}
