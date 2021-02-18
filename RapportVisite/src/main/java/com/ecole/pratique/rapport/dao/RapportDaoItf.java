package com.ecole.pratique.rapport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.pratique.rapport.entite.Rapport;

public interface RapportDaoItf extends JpaRepository<Rapport, Long> {

}
