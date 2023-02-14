package com.project.etudiant.controllers;

import com.project.etudiant.entities.BatchEntity;
import com.project.etudiant.services.BatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BatchControllers {
    @Autowired
    BatchServices batchServices;
    @PostMapping("/add_batch")
    public void addBatch(@RequestBody BatchEntity batch){
    batchServices.addBatch(batch);
    }

    @GetMapping("/get_batches")
    public List<BatchEntity> getBatches(){
        return batchServices.getBatches();
    }
}
