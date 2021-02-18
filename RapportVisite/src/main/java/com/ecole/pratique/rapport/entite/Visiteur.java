package com.ecole.pratique.rapport.entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Visiteur {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private Date dateEmbauche;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Rapport> rapports;
	public Visiteur() {
		rapports = new ArrayList<>();
	}
	public Visiteur(String nom, Date dateEmbauche) {
		this();
		this.nom = nom;
		this.dateEmbauche = dateEmbauche;
	}
	public void addRapport(Rapport rapport) {
		rapports.add(rapport);
	}
	
	@Override
	public String toString() {
		return "\nVisiteur [id=" + id + ", nom=" + nom + ", dateEmbauche=" + dateEmbauche + ", rapports=" + rapports
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public List<Rapport> getRapports() {
		return rapports;
	}
	public void setRapports(List<Rapport> rapports) {
		this.rapports = rapports;
	}
}
