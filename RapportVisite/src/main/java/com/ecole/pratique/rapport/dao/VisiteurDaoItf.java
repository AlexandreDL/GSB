package com.ecole.pratique.rapport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.pratique.rapport.entite.Visiteur;

public interface VisiteurDaoItf extends JpaRepository<Visiteur, Long> {

}
