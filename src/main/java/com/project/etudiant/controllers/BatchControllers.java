package com.project.etudiant.controllers;

import com.project.etudiant.entities.BatchModel;
import com.project.etudiant.services.BatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BatchControllers {

    @Autowired
    public BatchServices services ;

    @GetMapping("/get_batches")
    public List<BatchModel> batchesList(){
       return services.getBatches();
    }
}
