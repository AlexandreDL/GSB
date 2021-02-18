package com.ecole.pratique.rapport.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecole.pratique.rapport.entite.Rapport;
import com.ecole.pratique.rapport.entite.Visiteur;
import com.ecole.pratique.rapport.service.RapportService;
import com.ecole.pratique.rapport.service.RapportServiceItf;
import com.ecole.pratique.rapport.service.VisiteurServiceItf;

@RestController
@RequestMapping("/rapport")
@CrossOrigin("*")
public class RapportRestApi {
	@Autowired
	private RapportService rapportService;
	
	@GetMapping("")
	public List<Rapport> listRapport() {
		System.out.println("RapportRestApi - listRapport");
		return rapportService.listRapport();
	}
	@GetMapping("/{id}")
	public Rapport getRapportById(@PathVariable("id") Long id) {
		System.out.println("RapportRestApi - getRapportByVisiteur");
		return rapportService.findRapportById(id);
	}	
	@PutMapping("/{id}")
	public Rapport update(@PathVariable("id") Long id, @RequestBody Rapport rapport) {
		return rapportService.updateRapport(id, rapport);
	}
	@DeleteMapping("/{id}")
	public Rapport delete(@PathVariable("id") Long id) {
		return rapportService.deleteById(id);
	}
}
