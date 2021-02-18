package com.ecole.pratique.rapport;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;
import com.ecole.pratique.rapport.service.VisiteurServiceItf;

@SpringBootApplication
public class RapportVisiteApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RapportVisiteApplication.class, args);
		//RapportServiceItf  rapportservice = ctx.getBean(RapportServiceItf.class);
		VisiteurServiceItf service = ctx.getBean(VisiteurServiceItf.class);
		
		
		//repo.save(new Rapport(new Date(), "Bilan trés positif 3", "Motif 3"));
		//System.out.println(repo.findAll());
		
		
		Visiteur visiteur1 = new Visiteur("Lee", new Date());
		Rapport rapport1 = new Rapport(new Date(), "Bilan trés positif 1", "Motif 1");
		Rapport rapport2 = new Rapport(new Date(), "Bilan trés positif 2", "Motif 2");
		service.createVisiteur(visiteur1);
		service.createRapport(visiteur1.getId(), rapport1);
		service.createRapport(visiteur1.getId(), rapport2);
		
		Visiteur visiteur2 = new Visiteur("Zidane", new Date());
		rapport1 = new Rapport(new Date(), "Bilan trés positif 3", "Motif 3");
		rapport2 = new Rapport(new Date(), "Bilan trés positif 4", "Motif 4");
		Rapport rapport3 = new Rapport(new Date(), "Bilan trés positif 5", "Motif 5");
		service.createVisiteur(visiteur2);
		service.createRapport(visiteur2.getId(), rapport1);
		service.createRapport(visiteur2.getId(), rapport2);
		service.createRapport(visiteur2.getId(), rapport3);
		
		Visiteur visiteur3 = new Visiteur("Hugo", new Date());
		service.createVisiteur(visiteur3);
		
		//System.out.println(service.listVisiteur());
		
	}

}
