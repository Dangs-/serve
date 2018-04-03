package com.giteshdalal.serve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giteshdalal.serve.model.LocalisedEntry;
import com.giteshdalal.serve.model.LocalisedEntryId;

@Repository
public interface LocalisedEntryRepository extends JpaRepository<LocalisedEntry, LocalisedEntryId> {

}
