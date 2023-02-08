package com.project.etudiant.services;

import com.project.etudiant.dao.BatchRepository;
import com.project.etudiant.entities.BatchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchServices {

    @Autowired
    public BatchRepository batchRepository;
    public List<BatchModel> getBatches(){
        List<BatchModel> list= new ArrayList<>();
        list= batchRepository.findAll();
        return list;
    }
}
