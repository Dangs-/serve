package com.giteshdalal.serve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giteshdalal.serve.model.Localised;

@Repository
public interface LocalisedRepository extends JpaRepository<Localised, Long> {

}
