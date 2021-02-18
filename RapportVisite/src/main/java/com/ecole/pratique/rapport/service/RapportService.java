package com.ecole.pratique.rapport.service;


import com.ecole.pratique.rapport.dao.RapportDaoItf;
import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RapportService implements RapportServiceItf {
	@Autowired
	private RapportDaoItf rapportDao;
	
	@Override
	public Rapport findRapportById(Long id) {
		return rapportDao.findById(id).get();
	}
	@Override
	public Rapport createRapport(Rapport rapport) {
		return rapportDao.save(rapport);
	}
	@Override
	public List<Rapport> listRapport() {
		return rapportDao.findAll();
	}
	@Override
	public Rapport updateRapport(Long id, Rapport rapport) {
		rapport.setId(id);
		return rapportDao.save(rapport);
	}
	@Override
	public Rapport deleteById(Long id) {
		Rapport rapport = findRapportById(id); 
		rapportDao.deleteById(id);
		return rapport;
	}
	public RapportDaoItf getRapportDao() {
		return rapportDao;
	}
	public void setRapportDao(RapportDaoItf rapportDao) {
		this.rapportDao = rapportDao;
	}
	

}
