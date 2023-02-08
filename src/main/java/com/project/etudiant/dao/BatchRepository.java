package com.project.etudiant.dao;

import com.project.etudiant.entities.BatchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BatchRepository extends JpaRepository<BatchModel, String> {

    public BatchModel findByBatchId(String id);

}
