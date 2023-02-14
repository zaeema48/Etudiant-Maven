package com.project.etudiant.services;

import com.project.etudiant.dao.BatchRepository;
import com.project.etudiant.entities.BatchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchServices {
    @Autowired
    BatchRepository batchRepository;
   public void addBatch(BatchEntity batch){
       batch.setBatchId(batch.getCourseName()+batch.getCourseYear());
       batchRepository.save(batch);
   }

   public List<BatchEntity> getBatches(){
       ArrayList<BatchEntity> batches;
       batches= (ArrayList<BatchEntity>) batchRepository.findAll();
       return batches;
   }
}
