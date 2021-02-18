package com.ecole.pratique.rapport.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;

public interface VisiteurServiceItf {
	Visiteur createVisiteur(Visiteur visiteur);
	Visiteur findVisiteurById(Long id);
	Visiteur updateVisiteurByid(Long id, Visiteur visiteur);
	Visiteur deleteVisiteurById(Long id);
	List<Visiteur> listVisiteur();
	
	List<Rapport> listRapportByIdVisiteur(Long idVisiteur);
	Rapport createRapport(Long idVisiteur, Rapport rapport);
}
