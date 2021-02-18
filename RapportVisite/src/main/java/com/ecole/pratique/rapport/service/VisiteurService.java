package com.ecole.pratique.rapport.service;

import com.ecole.pratique.rapport.Dao.RapportDaoItf;
import com.ecole.pratique.rapport.Dao.VisiteurDaoItf;
import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisiteurService implements VisiteurServiceItf {
	@Autowired
	private VisiteurDaoItf visiteurDao;
	@Autowired
	private RapportDaoItf rapportDao;
	
	@Override
	public Visiteur createVisiteur(Visiteur visiteur) {
		return visiteurDao.save(visiteur);
	}
	@Override
	public List<Visiteur> listVisiteur() {
		return visiteurDao.findAll();
	}
	@Override
	public Visiteur findVisiteurById(Long id) {
		return visiteurDao.findById(id).get();
	}
	@Override
	public Visiteur updateVisiteurByid(Long id, Visiteur visiteur) {
		visiteur.setId(id);
		return visiteurDao.save(visiteur);
	}
	@Override
	public Visiteur deleteVisiteurById(Long id) {
		Visiteur visiteur=findVisiteurById(id);
		visiteurDao.deleteById(id);
		return visiteur;
	}
	@Override
	public Rapport createRapport(Long idVisiteur, Rapport rapport) {
		rapport = rapportDao.save(rapport);
		Visiteur visiteur = findVisiteurById(idVisiteur);
		visiteur.addRapport(rapport);
		visiteurDao.save(visiteur);
		//System.out.println("VisiteurService - createRapport visiteur=" + visiteur);
		return rapport;
	}
	@Override
	public List<Rapport> listRapportByIdVisiteur(Long idVisiteur) {
		return findVisiteurById(idVisiteur).getRapports();
	}
}
