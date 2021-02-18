package com.ecole.pratique.rapport;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecole.pratique.rapport.dao.RapportDaoItf;
import com.ecole.pratique.rapport.dao.VisiteurDaoItf;
import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;

import com.ecole.pratique.rapport.service.VisiteurServiceItf;

@SpringBootApplication
public class RapportVisiteApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RapportVisiteApplication.class, args);
		RapportDaoItf  rapportDao = ctx.getBean(RapportDaoItf.class);
		
		//repo.save(new Rapport(new Date(), "Bilan trés positif 3", "Motif 3"));
		//System.out.println(repo.findAll());
		
		
		VisiteurDaoItf visiteurDao = ctx.getBean(VisiteurDaoItf.class);
		
		Rapport rapport1 = new Rapport(new Date(), "Bilan trés positif 1", "Motif 1");
		Rapport rapport2 = new Rapport(new Date(), "Bilan trés positif 2", "Motif 2");
		rapport1 = rapportDao.save(rapport1);
		rapport2 = rapportDao.save(rapport2);
		Visiteur visiteur1 = new Visiteur("Lee", new Date());
		
		
		visiteur1.addRapport(rapport1);
		visiteur1.addRapport(rapport2);
		visiteur1 = visiteurDao.save(visiteur1);
		visiteurDao.save(visiteur1);
		
		
		rapport1 = new Rapport(new Date(), "Bilan trés positif 3", "Motif 3");
		rapport2 = new Rapport(new Date(), "Bilan trés positif 4", "Motif 4");
		Rapport rapport3 = new Rapport(new Date(), "Bilan trés positif 5", "Motif 5");
		rapport1 = rapportDao.save(rapport1);
		rapport2 = rapportDao.save(rapport2);
		rapport3 = rapportDao.save(rapport3);
		Visiteur visiteur2 = new Visiteur("Zidane", new Date());
		visiteur2.addRapport(rapport1);
		visiteur2.addRapport(rapport2);
		visiteur2.addRapport(rapport3);
		
		visiteurDao.save(visiteur2);
		
		
		Visiteur visiteur3 = new Visiteur("Hugo", new Date());
		
		visiteurDao.save(visiteur3);
		
		
		
	}

}
