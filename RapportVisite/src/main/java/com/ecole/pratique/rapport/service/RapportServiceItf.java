package com.ecole.pratique.rapport.service;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;

public interface RapportServiceItf {
	List<Rapport> listRapport();
	Rapport findRapportById(Long id);
	Rapport updateRapport(Long id, Rapport rapport);
	Rapport deleteById(Long id);
}
