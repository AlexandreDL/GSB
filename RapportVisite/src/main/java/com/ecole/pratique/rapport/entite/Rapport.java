package com.ecole.pratique.rapport.entite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rapport {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	private String bilan;
	private String motif;
	public Rapport() {}
	public Rapport(Date date, String bilan, String motif) {
		super();
		this.date = date;
		this.bilan = bilan;
		this.motif = motif;
	}
	@Override
	public String toString() {
		return "\nRapport [id=" + id + ", date=" + date + ", bilan=" + bilan + ", motif=" + motif + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBilan() {
		return bilan;
	}
	public void setBilan(String bilan) {
		this.bilan = bilan;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}	
}
