package com.ecole.pratique.rapport.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.pratique.rapport.entite.Rapport;

public interface RapportDaoItf extends JpaRepository<Rapport, Long>{
}
